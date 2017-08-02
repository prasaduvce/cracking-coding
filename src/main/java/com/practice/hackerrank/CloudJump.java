package com.practice.hackerrank;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=3-day-campaign
public class CloudJump {
	public static void main(String[] args) {
		final int E = 100;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value for n and k separated by space");
		int n = in.nextInt();
		int k = in.nextInt();
		int c[] = new int[n];
		System.out.println("Enter cloud index separated by space");
		for(int c_i=0; c_i < n; c_i++){
			c[c_i] = in.nextInt();
		}

		int leftEnergy = E;
		for (int i=0;  i<n; i= i+k) {
			if (i == 0) {
				continue;
			}

			else if (c[i] == 0) {
				leftEnergy = leftEnergy -1;
			}

			else if (c[i] == 1) {
				leftEnergy = leftEnergy -1 -2;
			}
		}
		if (c[0] == 0) {
			leftEnergy = leftEnergy -1;
		} else if (c[0] == 1) {
			leftEnergy = leftEnergy -1 -2;
		}

		System.out.println("leftEnergy ====> "+leftEnergy);
	}
}
