package com.prueba.spring5.beans;

public class Computador {
	
	private String name;
	private String disk;
	private String memory;
	
	public Computador(String name, String disk, String memory) {
		super();
		this.name = name;
		this.disk = disk;
		this.memory = memory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDisk() {
		return disk;
	}
	public void setDisk(String disk) {
		this.disk = disk;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	@Override
	public String toString() {
		return "Computador [name=" + name + ", disk=" + disk + ", memory=" + memory + "]";
	}
	
	
	

}
