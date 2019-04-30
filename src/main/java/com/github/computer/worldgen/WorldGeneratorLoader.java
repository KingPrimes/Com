package com.github.computer.worldgen;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
/***
 * 作废
 * @author Administrator
 *
 */
public class WorldGeneratorLoader{
	 private static WorldGenerator generatorOre = new WorldGeneratorGlowstone();
	    private BlockPos pos;

	    public WorldGeneratorLoader() {
	        MinecraftForge.ORE_GEN_BUS.register(this);
	    }

	    @SubscribeEvent
	    public void onOreGenPost(OreGenEvent.Post event)
	    {
	        if (!event.getPos().equals(this.pos))
	        {
	            this.pos = event.getPos();
	            generatorOre.generate(event.getWorld(), event.getRand(), event.getPos());
	        }
	    }
	    
	    @SubscribeEvent
	    public void onOreGenGenerateMinable(OreGenEvent.GenerateMinable event)
	    {
	        if (event.getType() == OreGenEvent.GenerateMinable.EventType.ANDESITE)
	        {
	            event.setResult(Event.Result.DENY);
	        }
	    }
}
