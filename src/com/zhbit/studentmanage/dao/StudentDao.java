package com.zhbit.studentmanage.dao;

import java.util.List;

import com.zhbit.studentmanage.domain.Student;

public interface StudentDao {
	public void save(Student student);
	public void update(Student student);
	public void delete(String... studentIds);
	public Student getStudent(Integer studentId);
	public List<Student> getStudents();
	public List<Student> getStudentsByName(String name);
}
