package com.oopsconceptsdemo;

public class HierarchicalInheritanceDemo {

public static void main(String[] args) {
	PetAnimal p = new PetAnimal("Pet", "Vegetarian");
	Animal.show();
	PetAnimal.displayPet();
	System.out.println(p);
	WildAnimal w = new WildAnimal("Wild", "Forest");
	Animal.show();
	WildAnimal.dispWild();
	System.out.println(w);
}

}
class Animal   //parent class
{
	String type;

static void show()
{
	System.out.println("Inside class Animal");
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

@Override
public String toString() {
	return "Animal [type=" + type + "]";
}

public Animal(String type) {
	super();
	this.type = type;
}
}

class PetAnimal extends Animal  //child class of parent class animal
{
	String diet; 
	
static void displayPet()
{
	System.out.println("Inside child class Pet Animal");	
}

public String getDiet() {
	return diet;
}

public void setDiet(String diet) {
	this.diet = diet;
}

@Override
public String toString() {
	return "PetAnimal [diet=" + diet + ", type=" + type + "]";
}

public PetAnimal(String type, String diet) {
	super(type);
	this.diet = diet;
}
}

class WildAnimal extends Animal  //child class of parent class Animal
{
	String habitat;
	
static void dispWild()
{
	System.out.println("Inside child class Wild Animal");
}

public String getHabitat() {
	return habitat;
}

public void setHabitat(String habitat) {
	this.habitat = habitat;
}

@Override
public String toString() {
	return "WildAnimal [habitat=" + habitat + ", type=" + type + "]";
}

public WildAnimal(String type, String habitat) {
	super(type);
	this.habitat = habitat;
}
}