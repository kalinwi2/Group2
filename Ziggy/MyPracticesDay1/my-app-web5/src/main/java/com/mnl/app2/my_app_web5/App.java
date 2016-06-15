package com.mnl.app2.my_app_web5;

import java.util.Scanner;

class person {
	String name;
	int age;

	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		this.age = age;
	}
}

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			Scanner input1 = new Scanner(System.in);
			System.out.print("Enter your name: ");
			String name = input1.nextLine();
			System.out.print("Enter your age: ");
			int age = input1.nextInt();
			person p = new person(name, age);
			// int myNumber = 88;
			// short myShort = 847;
			// long myLong = 9797;
			//
			// double myDouble = 7.3243;
			// float myFloat = 324.3f;
			//
			// char myChar = 'y';
			// boolean myBoolean = false;
			//
			// byte myByte = 127;
			System.out.println("===============================");
			System.out.println("My name is " + p.getName());
			System.out.println("My age is " + p.getAge());
			if (age < 18) {
				System.out.println("I am not allowed to vote");
			} else {
				System.out.println("I am allowed to vote");
			}
			// System.out.println("My number is " + myNumber);
			// System.out.println(myNumber);
			// System.out.println(myShort);
			// System.out.println(myLong);
			// System.out.println(myDouble);
			// System.out.println(myFloat);
			// System.out.println(myChar);
			// System.out.println(myBoolean);
			// System.out.println(myByte);
		} catch (Exception e) {
			System.out.println("Error :P");
		}

	}
}
