package com.zhbit.studentmanage.service;

import java.util.List;

import com.zhbit.studentmanage.domain.Student;
//��Ϊֻ��ʾ���������ṩ����ҵ�񷽷�
public interface StudentManageService {

	public void addNewStudent(Student student);
	
	public List<Student> findAllStudent();

}