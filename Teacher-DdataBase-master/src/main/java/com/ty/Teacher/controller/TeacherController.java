package com.ty.Teacher.controller;

import com.ty.Teacher.dto.Teacher;
import com.ty.Teacher.service.TeacherService;

public class TeacherController {
	public static void main(String[] args) {
		Teacher teacher= new Teacher();
		teacher.setName("Pratiksha");
	teacher.setEmail("pra@gmail.com");
		teacher.setSubject("English");
		teacher.setPhone("7544111");
		TeacherService service = new TeacherService();
		//service.saveTeacher(teacher);
		
		
		Teacher teacher1= service.getTeacherbyId(2);
 	System.out.println(teacher1.getId());
		System.out.println(teacher1.getName());
		System.out.println(teacher1.getEmail());
		System.out.println(teacher1.getPhone());
		System.out.println(teacher1.getSubject());
	}

}
