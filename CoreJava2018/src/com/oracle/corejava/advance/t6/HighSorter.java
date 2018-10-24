package com.oracle.corejava.advance.t6;

import java.util.Comparator;

/**
 * 自定义排序器是一个独立的类，实现comparator接口
 * @author TengSir
 *
 */
public class HighSorter  implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student  s1=(Student)o1;
		Student  s2=(Student)o2;
		
		return s1.getHigh()-s2.getHigh();
	}
}

class  WeightSorter implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		System.out.println(o1+"--compare--"+o2);
		Student  s1=(Student)o1;
		Student  s2=(Student)o2;
		return s2.getWeight()-s1.getWeight();
	}
}