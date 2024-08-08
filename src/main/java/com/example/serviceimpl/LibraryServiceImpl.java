package com.example.serviceimpl;

import com.example.entity.Library;
import com.example.repo.LibraryRepo;
import com.example.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    private LibraryRepo libraryRepo;

    @Override
    public Long createLibrary(Library library) {
        Library l=libraryRepo.save(library);
        return l.getId();

    }

    @Override
    public Library getSingleLibrary(Long id) {
       return libraryRepo.findById(id).orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Library> getALlLibraries() {
        return libraryRepo.findAll();
    }

    @Override
    public Library findLibraryByName(String name) {
        return libraryRepo.findByName(name);
    }
}
