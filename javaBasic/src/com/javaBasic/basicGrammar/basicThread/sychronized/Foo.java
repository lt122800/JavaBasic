package com.javaBasic.basicGrammar.basicThread.sychronized;

/**
 * @Author: LT
 * @Date: 2019年1月16日 下午3:48:53
 * @Description
 */
public class Foo {

	private int x = 100;

	public int getX() {
		return x;
	}

	// 同步方法
	public synchronized int fix(int y) {
		x = x - y;
		return x;
	}
}
