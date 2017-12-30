package com.practice;

import com.practice.search.BinarySearch;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void testForNullList() {
		BinarySearch binarySearch = new BinarySearch();

		Integer key = 13;

		int res = binarySearch.find(null, key);

		Assert.assertEquals(-1, res);
	}

	@Test
	public void testForNullKey() {
		List<Integer> nums = Arrays.asList(11,12,13,14,15,16,18);
		BinarySearch binarySearch = new BinarySearch();

		int res = binarySearch.find(nums, null);

		Assert.assertEquals(-1, res);
	}

	@Test
	public void testForValidList() {
		BinarySearch binarySearch = new BinarySearch();

		List<Integer> nums = Arrays.asList(11,12,13,14,15,16,18);
		Integer key = 13;

		int res = binarySearch.find(nums, key);

		Assert.assertEquals(2, res);
	}

	@Test
	public void testForValidList1() {
		BinarySearch binarySearch = new BinarySearch();

		List<Integer> nums = Arrays.asList(11,12,13,14,15,16,18);
		Integer key = 18;

		int res = binarySearch.find(nums, key);

		Assert.assertEquals(6, res);
	}

	@Test
	public void testForValidList2() {
		BinarySearch binarySearch = new BinarySearch();

		List<Integer> nums = Arrays.asList(11,12,14,15,16,18);
		Integer key = 11;

		int res = binarySearch.find(nums, key);

		Assert.assertEquals(0, res);
	}

	@Test
	public void testForValidList3() {
		BinarySearch binarySearch = new BinarySearch();

		List<Integer> nums = Arrays.asList(11,12,14);
		Integer key = 12;

		int res = binarySearch.find(nums, key);

		Assert.assertEquals(1, res);
	}

	@Test
	public void testForValidList4() {
		BinarySearch binarySearch = new BinarySearch();

		List<Integer> nums = Arrays.asList(11);
		Integer key = 11;

		int aBoolean = binarySearch.find(nums, key);

		Assert.assertEquals(0, aBoolean);
	}

	@Test
	public void testForValidList5() {
		BinarySearch binarySearch = new BinarySearch();

		List<Integer> nums = Arrays.asList(11,12,16,18);
		Integer key = 12;

		int aBoolean = binarySearch.find(nums, key);

		Assert.assertEquals(1, aBoolean);
	}

	@Test
	public void testForValidList6() {
		BinarySearch binarySearch = new BinarySearch();

		List<Integer> nums = Arrays.asList(11,12,16,18);
		Integer key = 16;

		int aBoolean = binarySearch.find(nums, key);

		Assert.assertEquals(2, aBoolean);
	}

	@Test
	public void testForNonExistingKey() {
		BinarySearch binarySearch = new BinarySearch();

		List<Integer> nums = Arrays.asList(11,12,16,18);
		Integer key = 10;

		int aBoolean = binarySearch.find(nums, key);

		Assert.assertEquals(-1, aBoolean);
	}
}
