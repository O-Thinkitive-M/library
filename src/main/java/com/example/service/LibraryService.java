package com.example.service;

import com.example.entity.Library;

import java.util.List;

public interface LibraryService {


    public Long createLibrary(Library library);

//    public String updateLibrary(Library library);
//
//    public String deleteLibrary(Long id);

    public Library getSingleLibrary(Long id);

    public List<Library> getALlLibraries();

    public Library findLibraryByName(String name);

}
