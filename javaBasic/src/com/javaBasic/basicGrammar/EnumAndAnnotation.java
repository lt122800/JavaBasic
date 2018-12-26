package com.javaBasic.basicGrammar;
/**
 * @Author: LT
 * @Date: 2018年12月26日 上午10:47:44
 * @Description 枚举和Annotation(注解)
 */
public class EnumAndAnnotation {

	public static void main(String[] args) {
		EnumSeason es=EnumSeason.SPRING;
		System.out.println(es.toString());

	}
}

//第一种传统方法：①private修饰构造器②属性都用privete final修饰③所有实例都是public static final修饰
class EnumSeason{
	
	private final String name;
	private final String desc;

	private EnumSeason(String name,String desc) {
		this.name=name;
		this.desc=desc;
	}
	public String getName() {
		return name;
	}
	public String getDesc() {
		return desc;
	}
	
	public static final EnumSeason SPRING=new EnumSeason("春天", "春风又绿江南岸");
	public static final EnumSeason SUMMER=new EnumSeason("夏天", "映日荷花别样红");
	public static final EnumSeason FALL=new EnumSeason("秋天", "秋水共长天一色");
	public static final EnumSeason WINTER=new EnumSeason("冬天", "寒窗西岭千秋雪");
	
	@Override
	public String toString() {
		return "Season[name="+name+",desc="+desc+"]";
	}
	
}

//第二种方法，JDK1.5新增的enum关键字用于定义枚举类

