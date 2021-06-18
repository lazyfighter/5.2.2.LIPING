package com.lazyfighter.binder;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.validation.DataBinder;

public class DataBinderTest {

	public static void main(String[] args) {
		Person person = new Person();
		DataBinder dataBinder = new DataBinder(person);
		MutablePropertyValues propertyValues = new MutablePropertyValues();
		propertyValues.add("name", "test");
		propertyValues.add("age", 18);
		dataBinder.bind(propertyValues);
		System.out.println(person);

	}
}
