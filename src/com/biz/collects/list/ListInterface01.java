package com.biz.collects.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List는 ArrayList와 LinkedList의 '부모'이다.
		// List<String> strList = new ArrayList();
		// ArrayList<Integer> intList = new ArrayList();
		// LinkedList <Integer> intList = new LinkedList();
		// addList(intList);
		// System.out.println();
		List<Integer> intList = new LinkedList();
		addList(intList);

	}

	public static void addList(List<Integer> intList) {
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
	}
	/*
	 * public static void addList(LinkedList<Integer> intList) { intList.add(10);
	 * intList.add(10); intList.add(10); intList.add(10); intList.add(10);
	 * intList.add(10); }
	 */
}
