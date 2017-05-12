package com.tbgdwj.test;

public class printTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printStart();
	}

	public static void printStart(){
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j-i > 0 ; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
