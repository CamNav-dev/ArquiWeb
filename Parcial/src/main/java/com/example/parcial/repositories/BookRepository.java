package com.example.parcial.repositories;

import com.example.parcial.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Query(value = "SELECT id_book, editorial, title FROM books WHERE editorial =:editorial", nativeQuery = true)
    public List<String[]> findByEditorial(@Param("editorial") String editorial);
}
