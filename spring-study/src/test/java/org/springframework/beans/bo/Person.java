package org.springframework.beans.bo;

import java.util.Map;

public class Person {

	private Map<String, String> test ;

	public Map<String, String> getTest() {
		return test;
	}

	public void setTest(Map<String, String> test) {
		this.test = test;
	}
}
