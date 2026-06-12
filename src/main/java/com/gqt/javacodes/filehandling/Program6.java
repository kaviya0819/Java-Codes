package com.gqt.javacodes.filehandling;

class Cricketer1 {
	String name;
	String country;
	int runs;
	int wickets;
	int catches;
	
	public Cricketer1(String name,String country,int runs,int wickets,int catches) {
		super();
		this.name = name;
		this.country = country;
		this.runs = runs;
		this.wickets = wickets;
		this.catches = catches;
	}
void display() {
	System.out.println(name);
	System.out.println(country);
	System.out.println(runs);
	System.out.println(wickets);
	System.out.println(catches);
}
}
public class Program6 {
public static void main(String[] args) {
	Cricketer c1 = new Cricketer("virat", "India", 19000, 20, 300);
	c1.display();
}
}
