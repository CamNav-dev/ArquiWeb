package com.example.parcial.serviceinterfaces;

import com.example.parcial.entities.Book;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    void insert(Book bookCN);

    void delete(Long idCN);

    Book listId(Long idCN);

    List<Book> list();
    void update(Book bookCN);
    List<String[]> findByEditorial(String editorialCN);
}
