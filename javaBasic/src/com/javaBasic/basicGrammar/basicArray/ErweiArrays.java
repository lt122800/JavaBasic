package com.javaBasic.basicGrammar.basicArray;

/**
 * @Author: LT
 * @Date: 2019年1月8日 上午11:28:22
 * @Description
 */
public class ErweiArrays {
	public static void main(String[] args) {
		String s = "1,3;3,4;7;6,9";
		int[][] a = { { 1, 2 }, { 3, 4 }, { 1, 4, 6 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		s.split(";");
	}
}
