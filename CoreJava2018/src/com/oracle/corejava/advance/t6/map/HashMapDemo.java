package com.oracle.corejava.advance.t6.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;


public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Role,Actor>  info=new HashMap<>();
		Role  r1=new Role("��ɮ", 30, "��", "˧����ʵ");
		Role  r2=new Role("�����", 501, "��", "˧������ʵ");
		Role  r5=new Role("�����", 501, "��", "˧������ʵ");
		Role  r3=new Role("ɳɮ", 40, "��", "��˧����ʵ�����к�");
		Role  r4=new Role("�˽�", 18, "��", "���ʳ�");
		
		Actor  a1=new Actor("�����", 16, "��", "����ʵ");
		Actor  a2=new Actor("����", 18, "��", "��ʵ");
		Actor  a3=new Actor("���", 20, "��", "����ʵʵ");
		Actor  a4=new Actor("������", 16, "Ů", "����");
		
		info.put(r1, a1);
		info.put(r2, a2);
		info.put(r3, a3);
		info.put(r4, a4);
		info.put(r5, a1);
		System.out.println(info.size());
		
		//map���ϱ���ֵ
		Collection  actors=info.values();
		Iterator<Role> it=actors.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//map���ϼ�����
		Set  roles=info.keySet();
		Iterator it1=roles.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		//map���ϵļ�ֵ�ɶԱ���1
		Set  roles1=info.keySet();
		Iterator it2=roles1.iterator();
		while(it2.hasNext()) {
			Object key=it2.next();
			System.out.println(key+"---"+info.get(key));
		}
		System.out.println("----------");
		//map���ϵļ�ֵ�ɶԱ���1
		Set<Entry<Role, Actor>> as=info.entrySet();
		for(Entry<Role, Actor> a:as) {
			System.out.println(a.getKey().getName()+"\t\t"+a.getValue().getName());
		}
	}

}
