package com.javaBasic.basicGrammar.basicThread.sychronized;

/**
 * @Author: LT
 * @Date: 2019年1月28日 上午10:43:30
 * @Description 同步方法和同步代码块
 * 
 *              注意：无论是同步方法和同步代码块都是只针对同一个对象的多线程而言
 */
public class TestSychronized1 {

	public static void main(String[] args) {
		TestSychronized1 ts = new TestSychronized1();
		new Thread(new Runnable() {
			@Override
			public void run() {
				ts.test1();
			}
		}, "t1").start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				ts.test2();
			}
		}, "t2").start();
	}

	public void test1() {
		synchronized (this) {
			int i = 5;
			while (i-- > 0) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void test2() {
		int i = 5;
		while (i-- > 0) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
