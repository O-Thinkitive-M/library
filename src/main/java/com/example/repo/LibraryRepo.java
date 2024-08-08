package com.example.repo;

import com.example.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepo extends JpaRepository<Library, Long> {

    public Library findByName(String name);

}
