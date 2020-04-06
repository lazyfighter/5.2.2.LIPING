package org.springframework.beans.bo;

import lombok.Data;

@Data
public class Student<T> {


	private T p;

	private String name;
}
