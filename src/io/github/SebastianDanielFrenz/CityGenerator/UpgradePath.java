package io.github.SebastianDanielFrenz.CityGenerator;

public class UpgradePath {
	
	private Building goal;
	
public static void upgrade(World world, Building building, int x, int y) 
{
	
	world.setField(x,y,building.getType().getUpgradePaths()[0].goal);
	
}
	
}
