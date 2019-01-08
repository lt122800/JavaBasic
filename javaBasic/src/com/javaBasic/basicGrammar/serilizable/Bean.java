package com.javaBasic.basicGrammar.serilizable;

import java.io.Serializable;

/**
 * @Author: LT
 * @Date: 2019年1月7日 下午1:10:20
 * @Description
 */
public class Bean implements Serializable {

	private static final long serialVersionUID = 1L;
	private static String A = "8";
	private String name;
	private String age;
	private String adr;
	private transient String B = "22";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public String getB() {
		return B;
	}

	public void setB(String b) {
		B = b;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "对象：name='" + name + "'," + "age='" + age + "'," + "adr='" + adr + "," + "A=" + A + ",B=" + B;
	}

}
