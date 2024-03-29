package com.polozov.villageLibrary.repositories;

import com.polozov.villageLibrary.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    List<Book> findByNameContainingIgnoreCase(String name);
}
