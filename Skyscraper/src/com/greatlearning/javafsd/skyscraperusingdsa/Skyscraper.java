package com.greatlearning.javafsd.skyscraperusingdsa;

import java.util.Scanner;

public class Skyscraper {
	private int t;
	private int[] x;

	public Skyscraper(int t) {
		this.t = t;
		x = new int[t + 1];
	}

	public void constructOrder(Scanner sc) {
		for (int i = 1; i < t + 1; i++) {
			System.out.println("Enter the floor size given on day : " + i);
			int m = sc.nextInt();
			x[m] = i;
		}

		int j = t;
		boolean flag;
		System.out.println("The order of construction is as follows ");

		for (int i = 1; i <= t; i++) {
			flag = false;
			System.out.println("Day " + i + " :");

			while (j >= 1 && x[j] <= i) {
				flag = true;
				System.out.print(j + " ");
				j--;
			}

			if (flag == true) {
				System.out.println();
			}
		}

	}
}
