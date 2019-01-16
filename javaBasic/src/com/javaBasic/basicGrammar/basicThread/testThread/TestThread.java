package com.javaBasic.basicGrammar.basicThread.testThread;

/**
 * @Author: LT
 * @Date: 2019年1月16日 上午10:45:58
 * @Description Thread类实现了Runnable接口
 */
public class TestThread {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "--" + i);
		}
		MyThread mt1 = new MyThread();
		MyThread mt2 = new MyThread();
		// 启动线程方法
		mt1.start();
		// mt2.start();

		// Thead.yield()当前线程可转让CPU控制权，让别的就绪状态线程运行（切换）
		// Thread.yield();
		// mt2.start();

		// Thread.sleep()当前线程暂停一段时间,线程不会释放对象锁。
		// Thread.wait()当前线程暂停一段时间，线程会释放对象锁，进入等待此对象的等待锁定池，只有针对此对象调用notify()后本对象才会进入对象锁定池准备。
		/*
		 * try { Thread.sleep(10000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } mt2.start();
		 */

		//
	}

}
