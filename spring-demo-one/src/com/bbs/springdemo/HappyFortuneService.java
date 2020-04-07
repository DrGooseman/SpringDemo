package com.bbs.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You will not die today";
	}

}
