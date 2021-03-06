package io.github.SebastianDanielFrenz.CityGenerator;

import java.awt.Graphics;

public class Field extends CityUnit {

	private Building building;
	public final int intX;
	public final int intY;

	public Building getBuilding() {
		return building;
	}

	public Field(int intX, int intY) {
		this.intX = intX;
		this.intY = intY;
	}

	public Field(int intX, int intY, Building building) {
		this.intX = intX;
		this.intY = intY;
		this.building = building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public int getSize() {
		return 1;
	}

	@Override
	public Field getField(int x, int y) {
		return this;
	}

	@Override
	public void draw(Graphics g, int x, int y, int offsetX, int offsetY) {
		g.drawRect(x * 10 + offsetX, y * 10 + offsetY, 10, 10);
	}

}
