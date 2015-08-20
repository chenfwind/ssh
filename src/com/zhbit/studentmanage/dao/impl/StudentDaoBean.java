package com.zhbit.studentmanage.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.zhbit.studentmanage.dao.StudentDao;
import com.zhbit.studentmanage.domain.Student;

@Repository("studentDao")
public class StudentDaoBean implements StudentDao {
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	public StudentDaoBean(){
	}
	
	@Override
	public void save(Student student) {
		sessionFactory.getCurrentSession().save(student);
	}

	@Override
	public void update(Student student) {
		sessionFactory.getCurrentSession().update(student);
	}

	@Override
	public void delete(String... studentIds) {
		for (String studentId: studentIds){
			sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Student.class, studentId));
		}
		
	}

	@Override
	public Student getStudent(Integer studentId) {
		return (Student) sessionFactory.getCurrentSession().get(Student.class,studentId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudents() {
		return sessionFactory.getCurrentSession().createQuery("from Student").list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getStudentsByName(String name) {
		return sessionFactory.getCurrentSession().createQuery("from Student where name=:name").setParameter("name", name).list();
	}
}
