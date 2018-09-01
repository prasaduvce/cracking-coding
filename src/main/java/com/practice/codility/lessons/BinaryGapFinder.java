package com.practice.codility.lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class BinaryGapFinder {

    public static void main(String[] args) {
        /*System.out.println("16 in binary format "+execute(16));
        System.out.println("17 in binary format "+execute(17));
        System.out.println("18 in binary format "+execute(18));*/
		String decimalFormat = new BinaryGapFinder().execute(32);
		System.out.println("1041 in binary format " + decimalFormat);

		Character first;
		if (decimalFormat.charAt(0) == '1') {
			first = decimalFormat.charAt(0);
		} else {
			first = null;
		}
		int zeroCount = 0;
		List<Integer> binaryGapList = new ArrayList<>();
		for (int i=1;i < decimalFormat.length(); i++) {
			if (first == null) {
				if (decimalFormat.charAt(i) == '1') {
					first = '1';
				}
				continue;
			}
			if (first == '1' && first == decimalFormat.charAt(i)) {
				first = decimalFormat.charAt(i);
				binaryGapList.add(zeroCount);
				zeroCount = 0;
				continue;
			}
			zeroCount++;
		}
		//System.out.println(binaryGapList);
		OptionalInt max = binaryGapList.stream().mapToInt(value -> value.intValue()).max();
		Integer binaryGap = max.orElse(0);

		System.out.println("Max binary gap===> " + binaryGap);
	}


    private String execute(Integer decimal) {
        if (decimal == 0 || decimal == 1) {
            return String.valueOf(decimal);
        }
        String binaryVersion = "";
        while (decimal != 0) {

            int mod = decimal % 2;
            decimal = decimal / 2;
            binaryVersion = mod+binaryVersion;
        }
        return binaryVersion;
    }
}
