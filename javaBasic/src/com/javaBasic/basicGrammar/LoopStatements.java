package com.javaBasic.basicGrammar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: LT
 * @Date: 2018/12/23 18:52
 * @Description 循环语句，for、增强for、Iterator
 */
public class LoopStatements {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("l");
        list.add("t");
        list.add("a");
        list.add("o");
        //for循环
        for (int a = 0; a < list.size(); a++) {
            System.out.print(list.get(a));
        }
        //增强for,不能获取下标,内部实现是Iterator,效果一样
        for (String str : list) {
            System.out.print(str);
        }
        //Iterator循环
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }

    }
}
