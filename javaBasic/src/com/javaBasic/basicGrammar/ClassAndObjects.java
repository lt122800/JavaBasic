package com.javaBasic.basicGrammar;

/**
 * @Author: LT
 * @Date: 2018/12/23 20:22
 * @Description 类和对象
 */

//一个源文件只能有一个public类，可以有多个非public类
public class ClassAndObjects {
    ClassAndObjects(String name) {
        System.out.println("小狗的名字" + name);
    }

    public static void main(String[] args) {
        ClassAndObjects cao = new ClassAndObjects("胖胖");
        TestContructor tc = new TestContructor();
    }


}

class TestContructor {
    TestContructor() {
        System.out.println("我是构造函数");
    }
}

//抽象类，可以有实现方法、修饰符public，protected，default、可以有构造器、可以有main方法、速度比接口快、添加新方法直接添加默认实现不需要改变当前代码
abstract class people {
    protected people() {
        System.out.println("抽象类的构造器");
    }

    public void getname(String name) {
        System.out.println("我是抽象类的实现方法");
    }
    public abstract void getAdress();
    public abstract void getAge();

    public static void main(String[] args) {
        people p = new man();
        p.getname("s");
    }
}

//接口，不能有实现方法、修饰符默认public建议不写、不能有构造器、不能有main方法
interface people1 {
    public void getAge();
}

class man extends people {

    @Override
    public void getAdress() {

    }

    @Override
    public void getAge() {

    }

    public static void main(String[] args) {
        man m = new man();

    }
}
