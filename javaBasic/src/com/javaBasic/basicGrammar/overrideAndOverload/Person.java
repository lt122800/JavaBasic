package com.javaBasic.basicGrammar.overrideAndOverload;

import java.io.IOException;

/**
 * @Author: LT
 * @Date: 2019年1月8日 上午10:12:12
 * @Description 抽象父类
 */
public abstract class Person {
	public void play() throws IOException {
		System.out.println("这是父类");
	}
}
