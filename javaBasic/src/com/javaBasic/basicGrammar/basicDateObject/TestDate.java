package com.javaBasic.basicGrammar.basicDateObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author: LT
 * @Date: 2019年1月10日 下午1:40:33
 * @Description
 */
public class TestDate {

	static SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");

	// 创建时间的几种方式
	public static void testDate() {
		// 通过Util包的date获取
		Date date = new Date();
		String a = sdf.format(date);
		System.out.println(a);
		// 通过Util包的Calendar
		Calendar c = Calendar.getInstance();
		String b = sdf.format(c.getTime());
		System.out.println(b);
		// Calendar获取年月时分秒,0表示1月份
		System.out.println(c.get(Calendar.YEAR) + "年" + c.get(Calendar.MONTH) + 1 + "月");
		c.set(Calendar.YEAR, 2018);
		System.out.println(c.get(Calendar.YEAR));
	}

	// currentTimeMillis返回以毫秒为单位的当前时间
	public static void testCurrentTimeMillis() {
		Long time = System.currentTimeMillis();
		System.out.println(time);
		String a = sdf.format(time);
		System.out.println(a);
	}

	public static void main(String[] args) {
		testCurrentTimeMillis();
		testDate();
	}
}
