package com.gqt.javacodes.filehandling;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileOutputStream;

class Cricketer3 implements Serializable{
	String name;
	String country;
	transient int runs;
	int wickets;
	transient int catches;
	
	public Cricketer3(String name,String country,int runs,int wickets,int catches) {
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
public class Program9 {
public static void main(String[] args) throws IOException {
	Cricketer c1 = new Cricketer("virat", "India", 19000, 20, 300);
	c1.display();
	String p1 = "D:\\Cricketer1.txt";
	FileOutputStream fos = new FileOutputStream(p1);
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(c1);
}
}
