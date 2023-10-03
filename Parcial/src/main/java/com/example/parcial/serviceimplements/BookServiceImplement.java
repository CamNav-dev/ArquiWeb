package com.example.parcial.serviceimplements;

import com.example.parcial.entities.Book;
import com.example.parcial.repositories.BookRepository;
import com.example.parcial.serviceinterfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImplement implements BookService {
    @Autowired
    private BookRepository myRepository;
    @Override
    public void insert(Book bookCN) {
        myRepository.save(bookCN);
    }

    @Override
    public void delete(Long idCN) {
        myRepository.deleteById(idCN);
    }

    @Override
    public Book listId(Long idCN) {
        return myRepository.findById(idCN).orElse(new Book());
    }

    @Override
    public List<Book> list() {
        return myRepository.findAll();
    }

    @Override
    public void update(Book bookCN) {
        myRepository.save(bookCN);
    }

    @Override
    public List<String[]> findByEditorial(String editorialCN) {
        return myRepository.findByEditorial(editorialCN);
    }
}
