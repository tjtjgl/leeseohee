package com.kh.hw.person.controller;

import java.util.Scanner;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	Scanner sc = new Scanner(System.in);

	Student[] s = new Student[3];
	Employee[] e = new Employee[10];
	
	int scnt = 0, ecnt = 0;

	public int[] personCount() {
		int[] cnts = new int[2];
		cnts[0] = scnt;
		cnts[1] = ecnt;

		return cnts;
	}

	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {

		Student stu = new Student(name, age, height, weight, grade, major);

		s[scnt] = stu;
		scnt++;
	}

	public Student[] printStudent() {
		for (Student val : s) {
			if (val != null) {
				System.out.print(val + " ");
			}
			System.out.println();
		}

		return s;
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {

		Employee em = new Employee(name, age, height, weight, salary, dept);

		e[ecnt] = em;
		ecnt++;

	}

	public Employee[] printEmployee() {
		for (Employee val : e) {
			if (val != null) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
		return e;
	}

}
