package oop;

public class Automobile {

	private String color;
	private int speed;
	private String make;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getSpeed() {
		return speed;
	}
	public void changeGear() {
		
	}
	public void accelerator(int i) {
		speed = speed + i;
		}
	}

