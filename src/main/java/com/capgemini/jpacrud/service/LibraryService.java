package com.capgemini.jpacrud.service;

import com.capgemini.jpacrud.entities.Library;

public interface LibraryService {
	
	public abstract void addLibrary(Library library);

	public abstract void updateLibrary(Library library);

	public abstract void removeLibrary(Library library);

	public abstract Library findLibraryById(int id);

}
