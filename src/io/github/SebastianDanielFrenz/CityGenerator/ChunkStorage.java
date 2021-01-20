package io.github.SebastianDanielFrenz.CityGenerator;

import java.util.LinkedList;
import java.util.List;

public class ChunkStorage<T> {

	List<List<T>> chunks = new LinkedList<List<T>>();
	int offsetX = 0;
	int offsetY = 0;

	public T get(int chunkX, int chunkY) {
		return null;
	}

	public void set(int chunkX, int chunkY, T chunk) {

	}

}
