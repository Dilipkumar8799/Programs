package com.java;

public class LinearSearch {

	static int search(int arr[], int size, int x) {
		for (int i = 1; i < size; i++) {
			if (arr[i] == x) {
				return 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 7, 6, 9 };
		int size = arr.length;
		int x = 6;

		int index = search(arr, size, x);
////		if (index == -1) {
//			System.out.println("Not found");
//		} else {
//			System.out.println("found" + index);
//		}

	}

}
