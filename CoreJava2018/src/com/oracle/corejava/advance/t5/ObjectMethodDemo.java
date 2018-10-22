package com.oracle.corejava.advance.t5;

import com.oracle.corejava.advance.t2.Cat;

public class ObjectMethodDemo {

	public static void main(String[] args) {

		//Object类是所有类的直接或者简介父类，
		//该父类没有提供属性，仅仅提供了一些方法
		//常用的方法getClass,toString,equals
		
		//1.getCalss方法的作用，是获取对象的真实类型（和instanceof不一样，它的作用是判断是否符合is-a）
		
		/*
		 * Animal  a=new Dog();
		 * Animal b=new Cat();
		 * 
		 * Sysout(a instanceof  Animal);// true
		 * Sysout(b instanceof  Animal);// true
		 * 
		 * instanceof测试的结果相同并不代表两个对象是同一种类型的事物
		 * 
		 * 需要用getClass方法进一步测试，getClass方法不需要重写，object父类直接声明好，我们直接使用
		 * 
		 *   Sysout(a.getClass()==b.getClass());//这句语句就可以测试a和b是不是同一种对象类型
		 * 
		 */
		
		
		
		//equals方法是object类设计好的一个用来‘比较对象内容’是否相等的方法
		//用户自定义的类型，如果不覆盖父类的equals方法，则无法知道要比较哪些东西来判断是否相等
		//自定一定类型，如果调用equals方法来判断对象是否相等，默认判断内存地址是否相等
		
		
		//如果我们需要对自己定义对类型做对象对内容比较，那么我们需要覆盖父类对equals方法（建议使用eclipse自动生成）
		Student  s1=new Student("zhuzhu", 18, "男");
		Student  s2=new Student("zhuzhu", 181, "男");
		Student s3=null;
		Cat  c=new Cat();
		
		//Compile fails;编译失败
		//Runtime error 运行时发生异常
		System.out.println(s1.equals(s1));
		
		
		//toString方法，是返回一个对象对字符串表示方式
		//当用户打印一个对象变量名对时候，java会自动调用对象对toString方法
		System.out.println(s1.toString());
		
	}

}
