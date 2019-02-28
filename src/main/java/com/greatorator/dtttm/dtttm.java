package com.greatorator.dtttm;

import com.greatorator.dtttm.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModConstants.MODID, version=ModConstants.VERSION, dependencies="after:dynamictrees;")

public class dtttm {
	
	@Instance(ModConstants.MODID)
	public static dtttm instance;
	
	@SidedProxy(clientSide = "ClientProxy", serverSide = "CommonProxy")
	public static CommonProxy proxy;

	//Run before anything else. Read your config, create blocks, items, etc.
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit();
	}
	
	//Do your mod setup. Build whatever data structures you care about.
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}
	
}
