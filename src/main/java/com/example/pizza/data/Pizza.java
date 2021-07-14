package com.example.pizza.data;

public class Pizza {

	private String type;
	private int size;
	private int delicousness;

	public Pizza(String type, int size, int delicousness) {
		super();
		this.type = type;
		this.size = size;
		this.delicousness = delicousness;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDelicousness() {
		return delicousness;
	}

	public void setDelicousness(int delicousness) {
		this.delicousness = delicousness;
	}

	@Override
	public String toString() {
		return "Pizza [type=" + type + ", size=" + size + ", delicousness=" + delicousness + "]";
	}

}
