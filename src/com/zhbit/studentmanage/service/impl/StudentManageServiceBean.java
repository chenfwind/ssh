package com.zhbit.studentmanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhbit.studentmanage.dao.StudentDao;
import com.zhbit.studentmanage.domain.Student;
import com.zhbit.studentmanage.service.StudentManageService;

@Service("studentManageService")
@Transactional
public class StudentManageServiceBean implements StudentManageService {
	@Resource
	private StudentDao studentDao;

	@Override
	public void addNewStudent(Student student) {
		//����ҵ���߼��ǣ���ͬ�Ա�����£�����������ͬ���������Ϊ��ʾ��
		boolean isSameName=false;
		List<Student> students =  studentDao.getStudentsByName(student.getName());
		for (Student stu: students){
			if (stu.getSex()==student.getSex()){
				isSameName=true;
			}
		}
		if (!isSameName){
			studentDao.save(student);
		}else{
			throw new RuntimeException("�Ѵ�����ͬ�Ա����ͬ������ѧ��");
		}
	}

	@Override
	public List<Student> findAllStudent() {
		return studentDao.getStudents();
	}

}
