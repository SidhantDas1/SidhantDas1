package com.ty.Teacher.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.Teacher.dto.Teacher;

public class TeacherDao {
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abhi");
	
	public boolean saveTeacher(Teacher teacher) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		return true;
	}
	public boolean UpdateTeacher(Teacher teacher) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(teacher);
		entityTransaction.commit();
		return true;	
	}
	public Teacher getTeacherbyId(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Teacher.class,id);
	}
	
	public boolean deleteTeacher(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Teacher teacher= entityManager.find(Teacher.class,id);
		entityTransaction.begin();
		entityManager.remove(teacher);
		entityTransaction.commit();
		return true;	
	}
	public List<Teacher> getAllTeacher(){
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("SELECT t FROM Teacher t");
		return query.getResultList();
	}

}
