package com.javaBasic.basicGrammar.basicCollectionAndMap;

/**
 * @Author: LT
 * @Date: 2019/1/17 20:08
 * @Description
 */
public class Student implements Comparable {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Student)) {
            throw new RuntimeException("不 Student 对象");
        }
        Student b = (Student) o;
        if (this.age > b.age) {
            return 1;
        }
        if (this.age == b.age) {
            return this.name.compareTo(b.name);
        }
        if (this.age < b.age) {
            return -1;
        }
        return 0;
    }
}
