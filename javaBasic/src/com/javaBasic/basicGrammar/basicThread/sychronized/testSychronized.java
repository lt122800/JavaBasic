package com.javaBasic.basicGrammar.basicThread.sychronized;

/**
 * @Author: LT
 * @Date: 2019年1月16日 下午3:47:29
 * @Description
 */
public class testSychronized implements Runnable {

	Foo foo = new Foo();

	public static void main(String[] args) {
		testSychronized ts = new testSychronized();
		Thread t1 = new Thread(ts, "Thread-a");
		Thread t2 = new Thread(ts, "Thread-b");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			foo.fix(30);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "：当前对象的值=" + foo.getX());
		}

	}

}
