package com.example.parcial.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="books")
public class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_book;
    @Column(name = "title", length = 255, nullable = false, unique = true)
    private String title;
    @Column(name = "editorial", length = 255, nullable = false)
    private String editorial;


    public Book() {
    }

    public Book(Long id_bookCN, String titleCN, String editorialCN) {
        this.id_book = id_bookCN;
        this.title = titleCN;
        this.editorial = editorialCN;
    }

    public Long getId_book() {
        return id_book;
    }

    public void setId_book(Long id_bookCN) {
        this.id_book = id_bookCN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titleCN) {
        this.title = titleCN;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorialCN) {
        this.editorial = editorialCN;
    }

}
