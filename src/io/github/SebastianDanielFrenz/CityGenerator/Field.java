package io.github.SebastianDanielFrenz.CityGenerator;

import java.awt.Graphics;

public class Field extends CityUnit {

	private Building building;

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	@Override
	public void draw(Graphics g, int x, int y, int offsetX, int offsetY) {
		g.drawRect(x * 10 + offsetX, y * 10 + offsetY, 10, 10);
	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public Field getField(int x, int y) {
		return this;
	}

}
