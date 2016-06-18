package com.piratecody.nethercraft.generation;

public class BiomeGenNetherEdge extends BiomeGenNether {

	public BiomeGenNetherEdge(int par1) {
		super(par1);
		this.setHeight(height_HighPlateaus);
		this.setBiomeName("Nether Edge");
		this.setTemperatureRainfall(1.9F, 0F);
	}

}
