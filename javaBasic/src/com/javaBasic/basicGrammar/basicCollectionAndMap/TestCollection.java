package com.javaBasic.basicGrammar.basicCollectionAndMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
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
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(1);
		set1.add(4);
		set1.add(1);
		System.out.println(set1);
	}

	// TreeSet会默认把里面的元素排序,底层是红黑二叉树，存储规则：左小右大
	public static void testTreeSet() {
		// 自然怕排序
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(5);
		treeSet.add(4);
		treeSet.add(1);
		// System.out.println(treeSet);

		// 传入元素不具备自然排序规则，该元素类必须实现comparable接口实现compareTo（）方法
		TreeSet<Object> treeSet1 = new TreeSet<>();
		treeSet1.add(new Student(12, "cc"));
		treeSet1.add(new Student(12, "aa"));
		treeSet1.add(new Student(12, "dd"));
		treeSet1.add(new Student(12, "bb"));
		// System.out.println(treeSet1.toString());

		// 传入元素类没有实现comparable接口，元素也不具备自然表规则，那就在创建treeset的时候传入比较器。
		PeopleComparator pc = new PeopleComparator();
		TreeSet<Object> treeSet2 = new TreeSet<>(pc);
		treeSet2.add(new People("bb", 11));
		treeSet2.add(new People("aa", 133));
		treeSet2.add(new People("aa", 112));
		treeSet2.add(new People("cc", 14));
		System.out.println(treeSet2.toString());
	}

	public static void main(String[] args) {
		testHashSet();
	}
}
