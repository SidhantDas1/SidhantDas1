package com.ty.Teacher.service;

import java.util.List;

import com.ty.Teacher.dao.TeacherDao;
import com.ty.Teacher.dto.Teacher;
import com.ty.Teacher.util.AES;

public class TeacherService {
	static TeacherDao dao = new TeacherDao();
	public boolean saveTeacher(Teacher teacher) {
		String encEmail=AES.encrypt(teacher.getEmail(), "LAVA");
		String encPhone=AES.encrypt(teacher.getPhone(), "LAVA");
		
		teacher.setEmail(encEmail);
		teacher.setPhone(encPhone);
		return dao.saveTeacher(teacher);
	}
	public boolean UpdateTeacher(Teacher teacher) {
		
		return dao.UpdateTeacher(teacher);
	}
	public Teacher getTeacherbyId(int id) {
		Teacher teacher= dao.getTeacherbyId(id);
		String decEmail= AES.decrypt(teacher.getEmail(), "LAVA");
		String decPhone=AES.decrypt(teacher.getPhone(), "LAVA");
		teacher.setEmail(decEmail);
		teacher.setPhone(decPhone);
		return teacher;
	}
	
	public boolean deleteTeacher(int id) {
		
		return dao.deleteTeacher(id);	
	}
	public List<Teacher> getAllTeacher(){
		return dao.getAllTeacher();
	}

}
