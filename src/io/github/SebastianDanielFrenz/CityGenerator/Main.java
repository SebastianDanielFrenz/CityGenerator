package io.github.SebastianDanielFrenz.CityGenerator;

public class Main {

	public static void main(String[] args) {
		if (args.length != 0) {
			System.out.println("Launch parameters not supported!");
		}

		CityUnitTypeRegistry.register(CityUnit2x2.class, 2);

		World<Field> world = new World<Field>();
		new Gui(world);

	}

}
