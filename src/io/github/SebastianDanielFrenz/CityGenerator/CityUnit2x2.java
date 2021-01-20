package io.github.SebastianDanielFrenz.CityGenerator;

import java.awt.Graphics;

public class CityUnit2x2 extends CityUnit {

	private Field[][] fields;

	@Override
	public void draw(Graphics g, int x, int y, int offsetX, int offsetY) {
		// to be implemented...
	}

	@Override
	public Field getField(int x, int y) {
		return fields[y][x];
	}

}
