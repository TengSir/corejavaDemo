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
		//��������         ʵ������
		Animal   aaa=new GaffeyCat();
		
		Animal  bbb=new BossCat();
		
		if(aaa instanceof Cat) {
			Cat  ccc=(Cat)aaa;
		}
		
		System.out.println(aaa.getClass());
		System.out.println(bbb.getClass());
		System.out.println(aaa.getClass()==bbb.getClass());
		//instanceof ֻ�ܲ����Ƿ����is-a
		System.out.println(aaa instanceof  Cat);//true
		System.out.println(aaa instanceof  Animal);//true
		System.out.println(aaa instanceof  GaffeyCat);//true
		System.out.println(bbb  instanceof  Cat);//true
		System.out.println(bbb  instanceof  Animal);//true
		
		
		Animal  aa;
		
//		aa=new Dog();
//		aa.sleep();
		//��̬��java�еĶ���Ķ��ֱ�����̬
		Animal c=new Cat();//��̬�﷨
		if(c instanceof  BossCat) {
			System.out.println("c������bosscat����");
			BossCat  dd=(BossCat)c;
		}
		
		c.sleep();
		Animal  d=c;
		
//		Animal a=new Animal(10);
//		a.sex="f";
		// TODO Auto-generated method stub
		//�ڸ���Ļ����ϴ�����Ϊ����������һ�ֻ���
		//����ĸ���

//		Dog d=new Dog();
//		d.eat();//�̳��Ը���ķ���
//		
		//�ڼ̳е����ֻ����´���һ�����������ô���Ĵ��������ǣ�
		//1.�����ڴ�ռ䣨���丸����ڴ�ռ䣬����������ڴ�ռ䣩
		//2.�ݹ�Ĺ��츸�����
		//3.��ʼ����������
		//4.�ݹ�ĵ��ø��๹����ִ�й�������
		
		//���ø��๹������ʵʹ��super();
		//������Ĺ������﷨����
		
		//1.һ������κ�һ�����������������һ�����ݻ��߸���Ĺ�����
		//2.һ�����������������������Ĵ���һ��λ�ڱ��������ĵ�һ��
		//3.һ�������û���ṩ����������java����ʱ���Զ��ṩһ���޲���������
		//4.���һ��������û����ʾ�����������ĸ�������������һ����Ĭ�ϵ��ø�����޲���������
		
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


