package com.example.controller;
import com.example.entity.Library;
import com.example.serviceimpl.LibraryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/library")
public class Controller {

    @Autowired
    private LibraryServiceImpl libraryService;

    @PostMapping("/create")
    public Long createNewLibrary(@RequestBody Library library)
    {
        return libraryService.createLibrary(library);
    }
    @GetMapping("/get-library/{id}")
    public Library getLibrary(@PathVariable Long id)
    {
        return libraryService.getSingleLibrary(id);
    }

    @GetMapping("/get-all")
    public List<Library> getAllLibraries()
    {
        return libraryService.getALlLibraries();
    }

    @GetMapping("/get-library-by-name/{name}")
    public  Library getLibraryByName(@PathVariable String name)
    {
        return libraryService.findLibraryByName(name);
    }
}