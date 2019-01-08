package com.javaBasic.basicGrammar.serilizable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author: LT
 * @Date: 2019年1月7日 上午10:22:03
 * @Description 序列化和反序列化
 * 
 */
public class JavaSerilalizable {

	/*
	 * 序列化:把对象转换成字节序列的过程称为对象的序列化
	 * 
	 * 
	 */
	private static void testSerializable() throws IOException {
		Bean bean = new Bean();
		bean.setName("tao");
		bean.setAge("13");
		bean.setAdr("sh");
		System.out.println(bean.toString());
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(new File("C:/Users/Administrator/Desktop/test.txt")));
		oos.writeObject(bean);
		System.out.println("完成序列化");
		oos.close();
	}

	/*
	 * 反序列化:把字节序列转换成对象的
	 * 
	 * 
	 * 
	 * 
	 */
	private static Bean testDeseirilizable() throws Exception {
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(new File("C:/Users/Administrator/Desktop/test.txt")));
		Bean bean = (Bean) ois.readObject();
		System.out.println("反完成序列化");
		ois.close();
		return bean;
	}

	public static void main(String[] args) throws Exception {
		System.out.println(testDeseirilizable().toString());
	}

}
