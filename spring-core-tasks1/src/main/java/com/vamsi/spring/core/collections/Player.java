package com.vamsi.spring.core.collections;

public class Player {
	
	

	public String name;
	
	public Player(String name)
	{
		this.name = name;
	}
	@Override
	public String toString() {
		return "[Player :" + name + "]";
	}
	

}
