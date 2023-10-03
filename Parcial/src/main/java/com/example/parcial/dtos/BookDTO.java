package com.example.parcial.dtos;

import com.example.parcial.entities.Loan;

public class BookDTO {
    private Long id_bookCN;
    private String titleCN;
    private String editorialCN;

    public Long getId_book() {
        return id_bookCN;
    }

    public void setId_book(Long id_bookCN) {
        this.id_bookCN = id_bookCN;
    }

    public String getTitle() {
        return titleCN;
    }

    public void setTitle(String titleCN) {
        this.titleCN = titleCN;
    }

    public String getEditorial() {
        return editorialCN;
    }

    public void setEditorial(String editorialCN) {
        this.editorialCN = editorialCN;
    }
}
