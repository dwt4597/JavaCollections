package com.biz.collects;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList01 {
	/*
	 * ArrayList와 같이 다수의 데이터를 저장, 추가, 삭제, 리스트보기 등을 수행할 수 있는Collections(배열 클래스)다.
	 * ArrayList에 사용되는 기본 method들 add(), get(), set(), remove(), clear(), size() 모두
	 * 사용 가능
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> strList = new LinkedList();

		strList.add("이준수");
		strList.add("리준수");
		strList.add("성준수");
		strList.add("장준수");
		strList.add("임준수");

		Collections.sort(strList);
		System.out.println(strList);
	}

}
