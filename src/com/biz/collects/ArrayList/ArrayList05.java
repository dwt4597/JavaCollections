package com.biz.collects.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			int rndNum = (int) (Math.random() * (100 + 1)); // 1부터 100
			intList.add(rndNum);
		}
		System.out.println(intList);
		Collections.sort(intList);
		System.out.println(intList);
	}

}
