package com.javaBasic.basicGrammar.basicCollectionAndMap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @Author: LT
 * @Date: 2019年1月10日 上午10:18:16
 * @Description Collection接口主要实现list接、和set接口和vector接口
 */
public class TestCollection {

	// list有序可重复，接口主要实现了ArrayList、LinkedList、Vector

	// ArrayList底层数据结构是数组，查询快，增删慢；线程不安全，效率高。
	public static void testArrayList() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 2000; i++) {
			list.add(i);
		}
		Long startTime = System.currentTimeMillis();
		// for (int i = 0; i < list.size(); i++) {
		// System.out.println(list.get(i));
		// }
		// for (Integer integer : list) {
		// System.out.println(integer);
		// }
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		Long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

	// Vector底层结构是数组，查询快，增删慢，线程安全，效率低几乎已经淘汰
	public static void testVector() {
		List<Integer> list = new Vector<>();
		for (int i = 0; i < 2000; i++) {
			list.add(i);
		}
	}

	// LinkedList底层是链表结构，查询慢，增删快，线程不安全，效率高
	public static void testLinkedList() {
		List<Integer> list = new LinkedList<>();
	}

	// set无序不重复，最常用的两大实现HashSet、TreeSet
	// HashSet不会保证元素的顺序，
	public static void testHashSet() {

	}

	// TreeSet会默认把里面的元素排序
	public static void testTreeSet() {

	}

	public static void main(String[] args) {
		testArrayList();
	}
}
