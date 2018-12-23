package com.javaBasic.basicGrammar;

import java.util.Scanner;

public class Operator {

    //算数运算符，+、-、×、÷、%（取余）、++（自增）、--（自减）
    //关系运算符，==、!=、<、>、>=、<=
    //位运算符，&、|、^(相同为0)、~（取反）、<<、>>、<<<
    //逻辑运算符，&&、||、！
    //赋值运算符，=、+=、-=、*=、/=、%=、<<=、>>=、&=、^=、|=
    //条件运算符，？：
    //instanceof运算符

    static void ArithmeticOperator() {
        int a = 11;
        System.out.println(a % 3);
        System.out.println(++a * 2);
        System.out.println(a);
        System.out.println(a++);
    }

    static void instanceofArithmetic() {
        Integer age=2;
        boolean bool = age instanceof Number;//Integer继承Number
        System.out.println(bool);
    }

    public static void main(String[] args) {
        instanceofArithmetic();
/*        while (true) {
            Scanner scanner = new Scanner(System.in);
            String nextLines = scanner.nextLine();
            String s = nextLines
                    .replaceAll("嘛", "")
                    .replaceAll("吗", "")
                    .replaceAll("？", "！");
            System.out.println(s);
        }*/
    }

}
