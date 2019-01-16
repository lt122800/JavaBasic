package com.javaBasic.basicGrammar.basicThread.testThread;

/**
 * @Author: LT
 * @Date: 2019年1月16日 上午10:13:06
 * @Description
 */
public class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "--" + i);
		}
	}

}
