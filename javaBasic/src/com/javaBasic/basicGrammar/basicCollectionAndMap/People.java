package com.javaBasic.basicGrammar.basicCollectionAndMap;

import java.util.Comparator;

/**
 * @Author: LT
 * @Date: 2019年1月22日 上午9:48:54
 * @Description
 */
public class People {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "姓名:" + this.name + "年龄:" + this.age;
	}
}

class PeopleComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		People p1 = (People) o1;
		People p2 = (People) o2;
		int a = p1.getName().compareTo(p2.getName());
		return a == 0 ? p1.getAge() - p2.getAge() : a;
	}

}