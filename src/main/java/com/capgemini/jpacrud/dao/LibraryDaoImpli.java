package com.capgemini.jpacrud.dao;

import javax.persistence.EntityManager;

import com.capgemini.jpacrud.entities.Library;

public class LibraryDaoImpli implements LibraryDao {

	private EntityManager entityManager;

	public LibraryDaoImpli() {
		entityManager = JPAUtil.getEntityManager();
	}

	public Library getLibraryById(int id) {
		Library library = entityManager.find(Library.class, id);
		return library;
	}

	@Override
	public Library getStudentById(int id) {
		Library library = entityManager.find(Library.class, id);
		return library;
	}

	@Override
	public void addLibrary(Library library) {
		entityManager.persist(library);
		
	}

	@Override
	public void removeLibrary(Library library) {
		entityManager.remove(library);
		
	}

	@Override
	public void updateLibrary(Library library) {
		entityManager.merge(library);
		
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().begin();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().commit();
		
	}
	
	

}
