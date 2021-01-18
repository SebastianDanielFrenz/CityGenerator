package io.github.SebastianDanielFrenz.CityGenerator;

public class GameMap {
	
	private HousingUnit[][] houses;
	
	public HousingUnit getUnit(int x, int y) {
		return houses[y][x];
	}
	

}