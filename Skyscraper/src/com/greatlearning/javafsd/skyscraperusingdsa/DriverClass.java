package com.greatlearning.javafsd.skyscraperusingdsa;

import java.util.Scanner;

public class DriverClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number floors in the building : ");
		int t = sc.nextInt();
		Skyscraper sky = new Skyscraper(t);
		sky.constructOrder(sc);
	}
}
