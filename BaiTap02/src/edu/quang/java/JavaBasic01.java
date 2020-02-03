package edu.quang.java;

import java.util.Scanner;

public class JavaBasic01 {
	// Bai Tap 01: Cho a va b, tim tong cua a va b.
	// Bai Tap 02: in ra loichao + hoten voi ho ten do nguoi dung nhap vao

	public int sum() {
		int a = 5;
		int b = 10;
		int sum = a + b;
		return sum;
	}
	
	public void sayHello() {
		String loichao = "Xin Chao ";
		String hoten;
		
		Scanner scan = new Scanner(System.in);
		hoten = scan.nextLine();
		
		String output = loichao + hoten;
		System.out.println(output);
	}

	public static void main(String[] args) {
		JavaBasic01 ja1 = new JavaBasic01();
		System.out.println("Sum a + b: " + ja1.sum());
		
		ja1.sayHello();
	}
}
