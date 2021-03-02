package com.demo.model;

import java.io.Serializable;

public class Person implements Serializable {
	// 實現interface java.io.Serializable，以方便傳輸對象嘅屬性。

	private Integer personId;
	private String name;
	private Integer age;

	public Person() { // 定義冇參constructor。
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}