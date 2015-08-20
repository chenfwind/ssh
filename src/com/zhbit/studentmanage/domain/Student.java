package com.zhbit.studentmanage.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Student implements Serializable{
	private Integer id;
	private String name;
	private int age;
	private SexEnum sex = SexEnum.BOY;
	
	public Student(){
	}
	
	

	public Student(String name, int age, SexEnum sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	public SexEnum getSex() {
		return sex;
	}



	public void setSex(SexEnum sex) {
		this.sex = sex;
	}



	@Override
	public String toString() {
		return "[Ñ§Éú: id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
