package com.javaBasic.basicGrammar.loopStatements;

/**
 * @Author: LT
 * @Date: 2018/12/22 16:18
 * @Description 选择和循环语句
 */
public class SelectionAndLoopStatements {
    //选择语句：if、if else、if else if else、switch
    //循环结构语句：for、while(true)、do...while(true)


    //选择语句
    static void selection() {
        int a = 1;
        if (a > 0) {
            System.out.println("这是if");
        }
        if (a > 0) {
            System.out.println("这是if else");
        } else {
        }
        if (a > 0) {
            System.out.println("这是if else if else");
        } else if (a < 0) {
        } else {
        }
        switch (a) {
            case 1:
                System.out.println("这是switch");
                break;
            case 2:
                break;
            default:
                break;
        }
    }

    //循环语句
    static void loopStatements() {
        String[] name = {"l", "t", "a", "o"};
        for (int a = 0; a < 10; a++) {
            System.out.print(a + "  ");
        }
        for (String b : name) {
            System.out.print(b);
        }
    }

    //循环加标记
    static void loopSign() {
        c:
        for (int a = 0; a < 10; a++) {
            for (int b = 0; b < 10; b++) {
                System.out.println(a + "--" + b);
                if (b == 5) {
                    break c;
                }
            }
        }
    }

    public static void main(String[] args) {
        loopSign(); 
    }
}
