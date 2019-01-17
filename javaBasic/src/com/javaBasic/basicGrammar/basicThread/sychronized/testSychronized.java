package com.javaBasic.basicGrammar.basicThread.sychronized;

/**
 * @Author: LT
 * @Date: 2019年1月16日 下午3:47:29
 * @Description
 */
public class testSychronized implements Runnable {

	public static void main(String[] args) {
		testSychronized ts = new testSychronized();
		Thread t1 = new Thread(ts, "Thread-a");
		Thread t2 = new Thread(ts, "Thread-b");
		t1.start();
		t2.start();
	}

	@Override
	public synchronized void run() {
		System.out.println(this.getClass().hashCode());
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + "---" + i);
			if (Thread.currentThread().getName().equals("Thread-a") && i == 2) {
				try {
					// this.wait();
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if (Thread.currentThread().getName().equals("Thread-b")) {
			this.notify();
		}
	}

}
