package com.zhbit.studentmanage.service;

import java.util.List;

import com.zhbit.studentmanage.domain.Student;
//因为只是示例，这里提供两个业务方法
public interface StudentManageService {

	public void addNewStudent(Student student);
	
	public List<Student> findAllStudent();

}