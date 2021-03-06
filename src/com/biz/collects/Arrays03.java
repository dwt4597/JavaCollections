package com.biz.collects;

import com.biz.collects.vo.BookVO;

public class Arrays03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1개의 데이터를 관리하기 위한 VO 객체를 생성
		BookVO bookVO = new BookVO();

		bookVO.setStrTitle("열혈자바");
		bookVO.setStrAuth("윤성우");
		bookVO.setStrComp("오렌지미디어");

		String[] arrNation = new String[3];
		arrNation[0] = "대한민국";
		arrNation[1] = "미국";
		arrNation[2] = "영연방";

		BookVO[] arrBookVO = new BookVO[3];
		arrBookVO[0] = new BookVO();
		arrBookVO[0].setStrTitle("열혈자바");
		arrBookVO[0].setStrAuth("열혈자바");
		arrBookVO[0].setStrComp("열혈자바");

		arrBookVO[1] = new BookVO();
		arrBookVO[1].setStrTitle("자바의정석");
		arrBookVO[1].setStrAuth("남궁성");
		arrBookVO[1].setStrComp("영진미디어");

		arrBookVO[2] = new BookVO();
		//
		// 배열은 일단 정해진 개수로 생성이 된 후,
		// 다시 크기(개수)를 늘리거나 줄이기위해
		// 다시 생성을 하면
		// 원래 배열에 들어있던 값들은 접근할 수 없다.
		// (값은 있지만, 접근할 수 없다)
		// 그래서 배열은 한번 크기가 정해져 생성되면
		// 그 크기를 변경할 수 없다.(거의 불가능)
		arrBookVO = new BookVO[10];

	}

}
