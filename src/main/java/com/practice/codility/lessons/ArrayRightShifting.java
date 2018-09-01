package com.practice.codility.lessons;

import java.util.Arrays;

public class ArrayRightShifting {
	public static void main(String[] args) {
		int [] inputArray = {3, 8, 9, 7, 6};
		System.out.println("Input Array ===> "+Arrays.toString(inputArray));
		int k = 2;

		if (inputArray.length == 0) {
			return;
		}
		for (int i=0;i<k;i++) {

			int temp = inputArray[inputArray.length -1];

			for (int j=inputArray.length-2;j>=0;j--) {
				inputArray[j+1] = inputArray[j];
			}
			inputArray[0] =  temp;
		}

		System.out.println("Shifter Array ===> " + Arrays.toString(inputArray));
	}
}
