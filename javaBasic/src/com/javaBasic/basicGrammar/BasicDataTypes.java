package com.javaBasic.basicGrammar;

public class BasicDataTypes {
	
	/*类变量：独立于方法之外的变量，用 static 修饰。
	实例变量：独立于方法之外的变量，不过没有 static 修饰。
	局部变量：类的方法中的变量。*/
	
	//8种基础数据类型，内置数据类型，方法中创建后变量名以及值存放在栈里；全局变量创建后变量名以及值是放在堆中。
	//4种整型
	byte by;/*占一个字节，8个位 -128~127 默认值是0， byte类型用在大型数组中节约空间，主要代替整数，
	                    因为 byte 变量占用的空间只有 int 类型的四分之一；*/
	short sh;/*占二个字节，16个位 默认值0，用在节省空间，是int的二分之一*/
	int in;/*占四个字节，32位，默认值0，最常用*/
	long lo;/*占8个字节，64位，默认值0，用在较大型数据的系统上*/
	//2种浮点型
	float fl;/*单精度，占4个字节，32位，默认值0.0f，不能用来表示精准数字如货币。*/
	double dou;/*双精度，占8个字节，32位，默认值0.0d，不能用来表示精准数字如货币。*/
	//1种布尔型
	boolean bo;
	//一种字符类型
	char ch;
	
	//引用数据类型，局部变量创建后，变量名存放在方法栈中，对象是存在堆中；全局变量创建后，
	Byte byte1;
	Short short1;
	Integer integer;
	Long long1;
	Float float1;
	Double double1;
	Boolean boolean1;
	Character character;
	
	//为什么基本数据类型的实例变量在堆上创建，局部变量在栈里创建？
	/*因为堆是所有线程共享的内存区域，栈是单个线程独享的区域，如果你一个实例变量在栈里面那就不能多个线程访问同一个变量了，
	 * 所以实例变量要在堆上创建，但是也不是线程安全的。*/
	public static void main(String[] args) {
		System.out.println(Long.MAX_VALUE);
	}

}
