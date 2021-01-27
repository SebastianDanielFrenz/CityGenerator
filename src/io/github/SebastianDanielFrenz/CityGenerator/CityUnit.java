package io.github.SebastianDanielFrenz.CityGenerator;

import java.awt.Graphics;

public abstract class CityUnit {

	public abstract void draw(Graphics g, int x, int y, int offsetX, int offsetY);

	public abstract Field getField(int x, int y);
}
