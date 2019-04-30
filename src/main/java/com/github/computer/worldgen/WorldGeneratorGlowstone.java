package com.github.computer.worldgen;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Random;

import com.github.computer.loader.BlockLoader;


public class WorldGeneratorGlowstone extends WorldGenerator {
	
    private static final WorldGenerator saltOreGeneratorCopper = new WorldGenMinable(BlockLoader.copper.getDefaultState(), 16);
    private static final WorldGenerator saltOreGeneratorTin = new WorldGenMinable(BlockLoader.tin.getDefaultState(), 16);
    
    public static void init () {
    	//监听世界生成
    	MinecraftForge.ORE_GEN_BUS.register(WorldGeneratorGlowstone.class);

    }
    
    
    @SubscribeEvent
    public static void onGenerateMinable(OreGenEvent.GenerateMinable event)
    {
    	//如果生成不是铁矿则退出生成 这样我们的矿物就可以和铁矿同时生成
        if (event.getType() != OreGenEvent.GenerateMinable.EventType.IRON)
            return;
        //我们触发了一次OreGenEvent.GenerateMinable事件，向其它Mod表明我们的矿物在这个时候生成。
        if (!TerrainGen.generateOre(event.getWorld(), event.getRand(), saltOreGeneratorCopper, event.getPos(), OreGenEvent.GenerateMinable.EventType.CUSTOM))
            return;
        
        for (int i = 0; i < 5; i++)
        {
            int posX = event.getPos().getX() + event.getRand().nextInt(16);
            int posY = 30 + event.getRand().nextInt(20);
            int posZ = event.getPos().getZ() + event.getRand().nextInt(16);
            BlockPos blockpos = new BlockPos(posX, posY, posZ);
            saltOreGeneratorCopper.generate(event.getWorld(), event.getRand(), blockpos);
            saltOreGeneratorTin.generate(event.getWorld(), event.getRand(), blockpos);
        }
    }
    
    @Override
    public boolean generate(World world, Random rand, BlockPos pos)
    {
    	
//        if (!TerrainGen.generateOre(world, rand, this, pos, OreGenEvent.GenerateMinable.EventType.COAL))
//        {
//            for (int i = 0; i < 10; ++i)
//            {
//                int posX = pos.getX() + rand.nextInt(16);
//                int posY = 16 + rand.nextInt(16);
//                int posZ = pos.getZ() + rand.nextInt(16);
//                BlockPos blockpos = new BlockPos(posX, posY, posZ);
//
//                saltOreGenerator.generate(world, rand, blockpos);
//            }
//        }
        return true;
    }
}
