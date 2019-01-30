package com.javaBasic.basicGrammar.basicThread.ThreadPool;

/**
 * @Author: LT
 * @Date: 2019年1月25日 下午4:25:48
 * @Description
 */
public class TestThreadPool {

	public static void main(String[] args) {
		testT t = new testT();
		Thread thread1 = new Thread(t);
		System.out.println("前面");
		thread1.start();
		System.out.println("后面");
		System.out.println("后面");
		System.out.println("后面");
		System.out.println("后面");
	}

}

class testT implements Runnable {

	@Override
	public void run() {
		System.out.println("这是Run方法");
	}

}
