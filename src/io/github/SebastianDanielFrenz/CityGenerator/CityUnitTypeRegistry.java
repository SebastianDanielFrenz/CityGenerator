package io.github.SebastianDanielFrenz.CityGenerator;

import java.util.Map;
import java.util.TreeMap;

public class CityUnitTypeRegistry {

	private static Map<Class<? extends CityUnit>, Integer> map = new TreeMap<Class<? extends CityUnit>, Integer>();

	public static void register(Class<? extends CityUnit> unitType, int size) {
		map.put(unitType, size);
	}

	public static int get(Class<? extends CityUnit> unitType) {
		return map.get(unitType);
	}

}
