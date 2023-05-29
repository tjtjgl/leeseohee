package com.kh.practice.numRange.controller;

public class NumRangeException extends Exception{
	
	String msg;
	
	public NumRangeException(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return msg;
	}
	

	public static void main(String[] args) {
		
	}
}