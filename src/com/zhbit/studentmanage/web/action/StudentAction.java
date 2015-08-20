package com.zhbit.studentmanage.web.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.zhbit.studentmanage.domain.Student;
import com.zhbit.studentmanage.service.StudentManageService;

@Controller("studentAction")
@Scope("prototype")
public class StudentAction extends ActionSupport {
	private Student student;
	private List<Student> students;
	
	@Resource
	private StudentManageService studentManageService;
	
	public String add(){
		try {
			studentManageService.addNewStudent(student);
		} catch (Exception e) {
			e.printStackTrace();
			this.addActionError(e.getMessage());
			return "input";
		}
		return list();
	}
	
	public String list(){
		try {
			students = studentManageService.findAllStudent();
		} catch (Exception e) {
			e.printStackTrace();
			this.addActionError(e.getMessage());
		}
		return "list";
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getStudents() {
		return students;
	}
}
