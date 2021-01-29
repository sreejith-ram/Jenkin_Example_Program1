package com.capgemini.jpacrud.client;

import com.capgemini.jpacrud.entities.Library;
import com.capgemini.jpacrud.service.LibraryService;
import com.capgemini.jpacrud.service.LibraryServiceImpli;

public class Client {

	public static void main(String[] args) {
		
		LibraryService service = new LibraryServiceImpli();
		
		Library library = new Library();
		library.setLibraryId(100);
		library.setBookName("Sachin");
		service.addLibrary(library);
		
		library = service.findLibraryById(100);
		System.out.print("ID:"+library.getLibraryId());
		System.out.println(" Name:"+library.getBookName());
		
		library.setBookName("Wings of Fire");
		service.updateLibrary(library);
		
		library = service.findLibraryById(100);
		System.out.print("ID:"+library.getLibraryId());
		System.out.println(" Name:"+library.getBookName());
		
		service.removeLibrary(library);
		System.out.println("End of program...");

	}

}
