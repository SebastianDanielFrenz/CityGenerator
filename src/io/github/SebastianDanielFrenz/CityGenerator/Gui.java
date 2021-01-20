package io.github.SebastianDanielFrenz.CityGenerator;

import javax.swing.JFrame;

public class Gui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1641246341411826181L;

	private World world;

	public Gui(World world) {
		this.world = world;

		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setUndecorated(true);
		setVisible(true);
	}

}
