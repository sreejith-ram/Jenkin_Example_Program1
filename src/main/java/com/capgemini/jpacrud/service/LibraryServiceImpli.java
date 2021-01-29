package com.capgemini.jpacrud.service;

import com.capgemini.jpacrud.dao.LibraryDao;
import com.capgemini.jpacrud.dao.LibraryDaoImpli;
import com.capgemini.jpacrud.entities.Library;

public class LibraryServiceImpli implements LibraryService {
	
	private LibraryDao dao;

	public LibraryServiceImpli() {
		dao = new LibraryDaoImpli();
	}

	@Override
	public void addLibrary(Library library) {
		dao.beginTransaction();
		dao.addLibrary(library);
		dao.commitTransaction();
		
	}

	@Override
	public void updateLibrary(Library library) {
		dao.beginTransaction();
		dao.updateLibrary(library);
		dao.commitTransaction();
		
	}

	@Override
	public void removeLibrary(Library library) {
		dao.beginTransaction();
		dao.removeLibrary(library);
		dao.commitTransaction();
		
	}

	@Override
	public Library findLibraryById(int id) {
		Library library = dao.getStudentById(id);
		return library;
	}

}
