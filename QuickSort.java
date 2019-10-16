package com.sorting.algorithm;

public class QuickSort {
	public static void main(String[] args) {
		int arr[] = { 12, 29, 27, 4, 8, 11, 32, 1 };
		quickSortAlgorithm(arr);
		for (int value : arr) {
			System.out.print(value + " ");
		}
	}

	private static void quickSortAlgorithm(int arr[]) {
		int length = arr.length;
		int low = 0;
		int high = length - 1;
		partition(arr, low, high);
		quickSortRecursion(arr, low, high);
	}

	private static int partition(int arr[], int low, int high) {
		int pivot = arr[(low + high) / 2];
		while (low <= high) {
			while (arr[low] < pivot) {
				low++;
			}
			while (arr[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}
		}
		return low;
	}

	private static void quickSortRecursion(int arr[], int low, int high) {
		int pi = partition(arr, low, high);
		if (low < pi - 1) {
			quickSortRecursion(arr, low, pi - 1);
		}
		if (pi < high) {
			quickSortRecursion(arr, pi, high);
		}
	}
}
