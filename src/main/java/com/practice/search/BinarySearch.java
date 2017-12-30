package com.practice.search;

import java.util.List;

public class BinarySearch {

	public int find(List<Integer> nums, Integer key) {
		if (nums == null || nums.size() == 0) {
			return -1;
		}

		if (key == null) {
			return -1;
		}
		int low = 0;
		int high = nums.size()-1;
		for (int i=low; i<=high; i++) {
			int mid = (low+high)/2;
			if (key.equals(nums.get(mid))) {
				return mid;
			} else if (key < nums.get(mid)) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		return -1;
	}
}
