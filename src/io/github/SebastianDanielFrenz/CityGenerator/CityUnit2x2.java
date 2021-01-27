package io.github.SebastianDanielFrenz.CityGenerator;

import java.awt.Graphics;

public class CityUnit2x2 extends CityUnit {

	private Field[][] fields;

	@Override
	public void draw(Graphics g, int x, int y) {
		for (int _x = 0; _x < fields.length; _x++) {
			for (int _y = 0; _y < fields[_x].length; _y++) {
				g.setColor(fields[_y][_x].getBuilding());
				g.drawRect(x * 20 + _x * 10, y * 20 + _y * 10, 10, 10);
			}
		}
	}

	@Override
	public Field getField(int x, int y) {
		return fields[y][x];
	}

}
