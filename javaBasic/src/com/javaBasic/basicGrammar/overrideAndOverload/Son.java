package com.javaBasic.basicGrammar.overrideAndOverload;

import java.io.IOException;

/**
 * @Author: LT
 * @Date: 2019年1月8日 上午10:12:36
 * @Description 子类 重写和重载
 */
public class Son extends Person {
	@Override
	public void play() throws IOException {
		System.out.println("这是子类");
	}

	public String play(String str) {
		return "adc";
	}

	public String play(String str, String a) {
		return "adc";
	}
}
