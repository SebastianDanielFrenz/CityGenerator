package io.github.SebastianDanielFrenz.CityGenerator;

public class Building {
	private BuildingType Type;
	private Field[] FieldList;
	
	public BuildingType getType () 
	{
		return Type;
	}
	
	public Building (BuildingType Type, Field[] FieldList)
	{
		this.FieldList = FieldList;
	}
	
}
