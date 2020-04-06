package org.springframework.beans;

import org.junit.jupiter.api.Test;
import org.springframework.beans.bo.Person;
import org.springframework.beans.bo.Student;
import org.springframework.core.ResolvableType;


public class ResolvableTypeTests {


	@Test
	public void testResolvableType() {

		ResolvableType resolvableType = ResolvableType.forClass(Person.class);
		System.out.println(Person.class.getName());
		System.out.println(resolvableType);
		System.out.println("---");
	}


	@Test
	public void testResolvableTypeGeneric() {
		Student<Person> student=  new Student<>();
		ResolvableType resolvableType = ResolvableType.forClass(student.getClass());
		System.out.println(Student.class.getName());
		System.out.println(resolvableType);
		System.out.println("---");
	}

}
