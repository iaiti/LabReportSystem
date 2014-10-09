package com.web.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @author admin
 * list remove的方法需要重写equals 同时还有hasCode方法
 * 两个类虽然一模一样  但不是equals
 * 集合类 确实需要用好
 */
public class TestList {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(2);
		List one = new ArrayList();
		one.add(list);
		Iterator i = one.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
