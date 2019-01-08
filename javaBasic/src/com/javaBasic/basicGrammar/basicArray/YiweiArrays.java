package com.javaBasic.basicGrammar.basicArray;

/**
 * @Author: LT
 * @Date: 2019年1月8日 上午10:25:59
 * @Description 一维数组
 */
public class YiweiArrays {

	// 创建三种方式
	int[] arr1 = new int[4];
	int a = arr1[3];// 下标取值

	int[] arr2 = { 1, 3, 5, 7 };

	static int[] arr3 = new int[] { 1, 3, 5, 7 };

	// 判断数组下标越界
	public static boolean indexOutOf(int m, int arr[]) {
		boolean flag = false;
		int length = arr.length;
		if (m < length) {
			flag = true;
		}
		return flag;
	}

	// 循环数组
	public static void loopArrays(int[] arr) {
		// for
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		// 增强for
		for (int i : arr) {
			System.out.print(i + ",");
		}
	}

	public static void main(String[] args) {
		int m = 3;
		boolean boo = indexOutOf(m, arr3);
		System.out.println(arr3.length);
		if (boo) {
			System.out.println("数组下标没越界" + arr3[m]);
		} else {
			System.out.println("数组下标越界");
		}
		loopArrays(arr3);
	}
}
