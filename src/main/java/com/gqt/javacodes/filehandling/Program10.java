package com.gqt.javacodes.filehandling;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.FileInputStream;

class Cricketer4 implements Serializable{
	String name;
	String country;
	transient int runs;
	int wickets;
	transient int catches;
	
	public Cricketer4(String name,String country,int runs,int wickets,int catches) {
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
public class Program10 {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	String p1 = "D:\\Cricketer.txt";
	FileInputStream fis = new FileInputStream(p1);
	ObjectInputStream ois = new ObjectInputStream(fis);
	Cricketer c1 = (Cricketer)ois.readObject();
	c1.display();
}
}
