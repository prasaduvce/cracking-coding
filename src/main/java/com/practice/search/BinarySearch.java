package com.practice.search;

import java.util.List;

public class BinarySearch {

	public Boolean find(List<Integer> nums, Integer key) {
		if (nums == null || nums.size() == 0) {
			return false;
		}

		if (key == null) {
			return false;
		}
		int low = 0;
		int high = nums.size()-1;

		for (int i=low; i<=high; i++) {
			int mid = (low+high)/2;

			if (key.equals(nums.get(mid))) {
				return true;
			} else if (key < nums.get(mid)) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		return false;
	}
}
