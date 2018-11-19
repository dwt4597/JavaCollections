package com.biz.collects.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strList = new ArrayList();

		strList.add("홍준수");
		strList.add("이준수");
		strList.add("성준수");
		strList.add("장준수");
		strList.add("짱준수");

		Collections.sort(strList);
		System.out.println(strList);

		Collections.sort(strList, Collections.reverseOrder());
		System.out.println(strList);
	}

}
