package io.github.SebastianDanielFrenz.CityGenerator;

import java.awt.Graphics;

public abstract class CityUnit {

	public abstract void draw(Graphics g, int x, int y);
	
	public abstract Field getField(int x, int y);
}
