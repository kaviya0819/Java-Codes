package com.gqt.javacodes.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program1 {
public static void main(String[] args) throws FileNotFoundException, IOException {
	String p1 = "D:\\Input.txt";
	String p2 = "D:\\Output.txt";
	
	FileInputStream fis = new FileInputStream(p1);
	int temp;
	FileOutputStream fos = new FileOutputStream(p2);
	
	while((temp = fis.read()) != -1) {
		fos.write(temp);
	}
	fos.close();
	fis.close();
}
}
