package io.github.SebastianDanielFrenz.CityGenerator;

import java.awt.Color;

public class BuildingType {

	private int Preis;
	private String Type;
	private Color color;
	private UpgradePath[] upgradePaths;

	public BuildingType(String type, int[] color, UpgradePath[] upgradePaths) {
		setType(type);
		setColor(color);
		setUpgradePaths(upgradePaths);
	}

	public String getType() {
		return Type;
	}

	public int getPreis() {
		return Preis;
	}

	public Color getColor() {
		return color;
	}

	public void setUpgradePaths(UpgradePath[] upgradePaths) {
		this.upgradePaths = upgradePaths;
	}

	public UpgradePath[] getUpgradePaths() {
		return upgradePaths;
	}

}
