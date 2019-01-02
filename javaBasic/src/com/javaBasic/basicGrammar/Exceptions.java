package com.javaBasic.basicGrammar;
/**
 * @Author: LT
 * @Date: 2018年12月26日 下午4:36:50
 * @Description java异常三大类：1、检查性异常（比喻检查一个不存在的文件夹）2、运行时异常3、错误（内存不足、网络中断）
 * 学习链接：https://www.cnblogs.com/hysum/p/7112011.html
 * Throwable ---Error  ---VirtualMachineError
 *                     ---     
 *           ---Exception
 */
public class Exceptions {

	//try(用于监听) catch(用于捕获异常) finally(总是被执行，用于关闭和释放资源)
	//
	static void testTry() {
		try {
			int a = 11 / 0;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getStackTrace());
		}
	}
	
	public static void main(String[] args) {
		Exceptions.testTry();
	}
}

