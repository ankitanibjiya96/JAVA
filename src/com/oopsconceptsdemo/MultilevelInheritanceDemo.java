package com.oopsconceptsdemo;

public class MultilevelInheritanceDemo {
	
public static void main(String[] args) {
	SkodaSlavia s = new SkodaSlavia("Grey", 1200000, 80, "Skoda", 5);
	System.out.println(s);
	Car.Vehicle();
	SkodaSlavia.show();
	Skoda.display();
}
}
class Car   //parent class
{
	String color;
	double price;
	double speed;

	static void Vehicle()
	{
		System.out.println("Inside class car");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + ", speed=" + speed + "]";
	}

	public Car(String color, double price, double speed) {
		super();
		this.color = color;
		this.price = price;
		this.speed = speed;
	}
}

class Skoda extends Car  //child class of parent class car
{
	String brand;
	
	static void display()
	{
		System.out.println("Inside class skoda");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Skoda [brand=" + brand + ", getColor()=" + getColor() + ", getPrice()=" + getPrice() + ", getSpeed()="
				+ getSpeed() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	public Skoda(String color, double price, double speed, String brand) {
		super(color, price, speed);
		this.brand = brand;
	}
}

class SkodaSlavia extends Skoda //child class of parent class Skoda
{
	int seater;
	
	static void show()
	{
		System.out.println("Inside class Skoda Slavia");
	}

	public int getSeater() {
		return seater;
	}

	public void setSeater(int seater) {
		this.seater = seater;
	}

	@Override
	public String toString() {
		return "SkodaSlavia [seater=" + seater + ", brand=" + brand + ", color=" + color + ", price=" + price
				+ ", speed=" + speed + "]";
	}

	public SkodaSlavia(String color, double price, double speed, String brand, int seater) {
		super(color, price, speed, brand);
		this.seater = seater;
	}
}