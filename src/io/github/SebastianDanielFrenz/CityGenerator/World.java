package io.github.SebastianDanielFrenz.CityGenerator;

public class World<T extends CityUnit> {

	private ChunkStorage<T> storage;

	public T getChunk(int chunkX, int chunkY) {
		return storage.get(chunkX, chunkY);
	}
	
	public int getChunkSize() {
		return 0;
	}

}
