package com.oracle.corejava.advance.t2;
class Device{
	public void tp() {
		System.out.println("zhixing paizhao");
	}
}
class Mobile extends Device{}

class Danfan extends Device{}

class DigiatalCamera extends Device{}

class LowLevelDigitalCamera  extends Device{
	
}
public class Test {

	public void takePhoto(LowLevelDigitalCamera m) {
		
	}
	
	
	public static void main(String[] args) {
		//声明类型         实际类型
		Animal   aaa=new GaffeyCat();
		
		Animal  bbb=new BossCat();
		
		if(aaa instanceof Cat) {
			Cat  ccc=(Cat)aaa;
		}
		
		System.out.println(aaa.getClass());
		System.out.println(bbb.getClass());
		System.out.println(aaa.getClass()==bbb.getClass());
		//instanceof 只能测试是否符合is-a
		System.out.println(aaa instanceof  Cat);//true
		System.out.println(aaa instanceof  Animal);//true
		System.out.println(aaa instanceof  GaffeyCat);//true
		System.out.println(bbb  instanceof  Cat);//true
		System.out.println(bbb  instanceof  Animal);//true
		
		
		Animal  aa;
		
//		aa=new Dog();
//		aa.sleep();
		//多态，java中的对象的多种表现形态
		Animal c=new Cat();//多态语法
		if(c instanceof  BossCat) {
			System.out.println("c对象是bosscat类型");
			BossCat  dd=(BossCat)c;
		}
		
		c.sleep();
		Animal  d=c;
		
//		Animal a=new Animal(10);
//		a.sex="f";
		// TODO Auto-generated method stub
		//在父类的基础上创建更为特殊的子类的一种机制
		//代码的复用

//		Dog d=new Dog();
//		d.eat();//继承自父类的方法
//		
		//在继承的这种机制下创建一个子类对象，那么他的创建过程是：
		//1.分配内存空间（分配父类的内存空间，分配的子类内存空间）
		//2.递归的构造父类对象
		//3.初始化对象属性
		//4.递归的调用父类构造器执行构造任务
		
		//调用父类构造器其实使用super();
		//关于类的构造中语法规则
		
		//1.一个类的任何一个构造器都必须调用一个本垒或者父类的构造器
		//2.一个构造器调用其他构造器的代码一定位于本构造器的第一行
		//3.一个类如果没有提供构造器，则java编译时会自动提供一个无参数构造器
		//4.如果一个构造器没有显示的声明调用哪个构造器，则它一定会默认调用父类的无参数构造器
		
	}

}

class A{
	public A() {
		System.out.println("A no");
	}
	public A(int a) {
		System.out.println("A one ");
	}
	public A(String a) {
		this();
		System.out.println("A String one ");
	}
}
class B extends A{
	public B() {
		super("name");
		System.out.println("b no");
	}
	public B(int c) {
		super("name");
		System.out.println("b one");
	}
	public B(float d) {
		this(12);
		System.out.println("b  float one");
	}
}

class C extends B{
	public C() {
		super(3.2f);
		System.out.println("C no ");
	}
}


