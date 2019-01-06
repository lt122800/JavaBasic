package com.javaBasic.basicGrammar;

/**
 * @Author: LT
 * @Date: 2018年12月26日 下午4:36:50
 * @Description java异常三大类：1、检查性异常（比喻检查一个不存在的文件夹）2、运行时异常3、错误（内存不足、网络中断）
 * 学习链接：https://www.cnblogs.com/hysum/p/7112011.html
 * Throwable ---Error ---VirtualMachineError 虚拟机错误
 * ---TreadDeath 线程死锁
 * ---Exception ---检查异常  ---IOException 文件异常
 * ---SQLException SQL异常
 * ---RunTimeException 非检查异常 ---NullPointerException 空指针异常
 * ---ArrayIndexOutOfBoundsException 数组下标越界异常
 * ---ClassCastException 类型转换异常
 * ---ArithmeticException 算数异常
 */
public class Exceptions {

    //try(用于监听) catch(用于捕获异常,可以有多个) finally(总是被执行，用于关闭和释放资源)
    //return 在try或者catch里面的话无异常就先保存try里面return的值，再执行finally；有异常保存catch里面的return，再执行finally
    static int testTry() {
        int a = 0;
        try {
            a = 11 / 0;
            System.out.println(a);
            return a = 10;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return a = -1;
        } finally {
            System.out.println("finally语句块");
            System.out.println("finally语句块后面");
            System.out.println(a);
        }
    }

    //throw将产生的异常抛出，是抛出异常的一个动作。
    //throws声明将要抛出何种类型的异常（声明）。
    static void testThrow() {
        String a = "tao";
        if (a.equals("tao")) {
            throw new NumberFormatException();
        }
    }

    static void testThrows() throws NumberFormatException {
        String a = "tao";
        System.out.println(Integer.parseInt(a));
    }

    public static void main(String[] args) {
        Exceptions.testTry();
        //Exceptions.testThrow();
        try {
            Exceptions.testThrows();
        } catch (NumberFormatException e) {
            //System.err.println("非数据类型不能转换");
            e.printStackTrace();
        }
    }
}

