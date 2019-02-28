package com.greatorator.dtttm.proxy;

import com.greatorator.dtttm.ModBlocks;
import com.greatorator.dtttm.ModItems;
import com.greatorator.dtttm.ModTrees;

public class CommonProxy {

	public void preInit() {
		ModBlocks.preInit();
		ModItems.preInit();
		ModTrees.preInit();
	}

	public void init() {}
	
	public void registerModels() {}
	
}
