package com.practice;

import com.practice.search.BinarySearch;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void testForValidList() {
		BinarySearch binarySearch = new BinarySearch();

		List<Integer> nums = Arrays.asList(11,12,13,14,15,16,18);
		Integer key = 13;

		Boolean aBoolean = binarySearch.find(nums, key);

		Assert.assertEquals(true, aBoolean);
	}

	@Test
	public void testForValidList1() {
		BinarySearch binarySearch = new BinarySearch();

		List<Integer> nums = Arrays.asList(11,12,13,14,15,16,18);
		Integer key = 18;

		Boolean aBoolean = binarySearch.find(nums, key);

		Assert.assertEquals(true, aBoolean);
	}

	@Test
	public void testForValidList2() {
		BinarySearch binarySearch = new BinarySearch();

		List<Integer> nums = Arrays.asList(11,12,14,15,16,18);
		Integer key = 11;

		Boolean aBoolean = binarySearch.find(nums, key);

		Assert.assertEquals(true, aBoolean);
	}

	@Test
	public void testForValidList3() {
		BinarySearch binarySearch = new BinarySearch();

		List<Integer> nums = Arrays.asList(11,12,14);
		Integer key = 12;

		Boolean aBoolean = binarySearch.find(nums, key);

		Assert.assertEquals(true, aBoolean);
	}

	@Test
	public void testForValidList4() {
		BinarySearch binarySearch = new BinarySearch();

		List<Integer> nums = Arrays.asList(11);
		Integer key = 11;

		Boolean aBoolean = binarySearch.find(nums, key);

		Assert.assertEquals(true, aBoolean);
	}

	@Test
	public void testForValidList5() {
		BinarySearch binarySearch = new BinarySearch();

		List<Integer> nums = Arrays.asList(11,12,16,18);
		Integer key = 12;

		Boolean aBoolean = binarySearch.find(nums, key);

		Assert.assertEquals(true, aBoolean);
	}

	@Test
	public void testForValidList6() {
		BinarySearch binarySearch = new BinarySearch();

		List<Integer> nums = Arrays.asList(11,12,16,18);
		Integer key = 16;

		Boolean aBoolean = binarySearch.find(nums, key);

		Assert.assertEquals(true, aBoolean);
	}
}
