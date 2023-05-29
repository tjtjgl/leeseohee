package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Mybuffer {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		try {
		FileReader fr = new FileReader("D:\\io_test\\test.txt");
		FileWriter fw = new FileWriter("D:\\io_test\\test03.txt");
		BufferedReader bin = new BufferedReader(fr); //파일 클래스 필요
	
		BufferedWriter bout= new BufferedWriter(fw);
		} catch (IOException e) {
			System.out.println(e); 
		}
		
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000+"초");
		
	}

}
