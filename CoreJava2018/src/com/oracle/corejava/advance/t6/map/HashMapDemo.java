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
		Role  r1=new Role("唐僧", 30, "男", "帅，老实");
		Role  r2=new Role("孙悟空", 501, "男", "帅，不老实");
		Role  r5=new Role("孙悟空", 501, "男", "帅，不老实");
		Role  r3=new Role("沙僧", 40, "男", "不帅，老实，地中海");
		Role  r4=new Role("八戒", 18, "男", "矮肥丑");
		
		Actor  a1=new Actor("冯金柱", 16, "男", "不老实");
		Actor  a2=new Actor("刘洋", 18, "男", "老实");
		Actor  a3=new Actor("马飞", 20, "男", "老老实实");
		Actor  a4=new Actor("赖翠妮", 16, "女", "神经质");
		
		info.put(r1, a1);
		info.put(r2, a2);
		info.put(r3, a3);
		info.put(r4, a4);
		info.put(r5, a1);
		System.out.println(info.size());
		
		//map集合遍历值
		Collection  actors=info.values();
		Iterator<Role> it=actors.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//map集合键遍历
		Set  roles=info.keySet();
		Iterator it1=roles.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		//map集合的键值成对遍历1
		Set  roles1=info.keySet();
		Iterator it2=roles1.iterator();
		while(it2.hasNext()) {
			Object key=it2.next();
			System.out.println(key+"---"+info.get(key));
		}
		System.out.println("----------");
		//map集合的键值成对遍历1
		Set<Entry<Role, Actor>> as=info.entrySet();
		for(Entry<Role, Actor> a:as) {
			System.out.println(a.getKey().getName()+"\t\t"+a.getValue().getName());
		}
	}

}
