package com.javaBasic.basicGrammar.basicCollectionAndMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: LT
 * @Date: 2019年1月22日 上午11:06:09
 * @Description
 */
public class TestMap {

	// HashTable底层哈希表结构，不可存入null键null值，线程同步
	// HashMap底层也是哈希表结构，可存入一个null键，多个null值，线程不同步
	// TreeMap底层是二叉树结构，线程不同步

	public static void main(String[] args) {
		testHashMap();
	}

	public static void testHashTable() {
		Map<String, Integer> m1 = new Hashtable<>();
		m1.put("aa", 11);
		m1.put("bb", 11);
		m1.put("aa", 12);
		Set<String> set1 = m1.keySet();// map第一种取出方式
		Iterator<String> iterator = set1.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			int value = m1.get(key);
			System.out.println("key:" + key + "  value:" + value);
		}
	}

	public static void testHashMap() {
		Map<Integer, Integer> m1 = new HashMap<>();
		m1.put(10, 11);
		m1.put(12, 14);
		m1.put(0, 14);
		m1.put(11, 13);
		Set<Map.Entry<Integer, Integer>> set = m1.entrySet();// Map的第二种取值方式
		Iterator<Map.Entry<Integer, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, Integer> map = it.next();
			int key = map.getKey();
			int value = map.getValue();
			System.out.println("key:" + key + "  value:" + value);
		}
	}

}
