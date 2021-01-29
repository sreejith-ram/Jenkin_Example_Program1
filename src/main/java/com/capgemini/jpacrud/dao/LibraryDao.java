package com.capgemini.jpacrud.dao;

import com.capgemini.jpacrud.entities.Library;

public interface LibraryDao {

	public abstract Library getStudentById(int id);

	public abstract void addLibrary(Library library);

	public abstract void removeLibrary(Library library);

	public abstract void updateLibrary(Library library);

	public abstract void commitTransaction();

	public abstract void beginTransaction();

}
