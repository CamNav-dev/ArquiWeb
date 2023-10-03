package com.example.parcial.dtos;

import com.example.parcial.entities.Book;

import java.time.LocalDate;

public class LoanDTO {
    private Long id_loanCN;
    private boolean book_loanCN;
    private String codeStudentCN;
    private LocalDate loanDateCN;
    private LocalDate devolutionDateCN;
    private Book bookCN;

    public Long getId_loan() {
        return id_loanCN;
    }

    public void setId_loan(Long id_loanCN) {
        this.id_loanCN = id_loanCN;
    }

    public boolean isBook_loan() {
        return book_loanCN;
    }

    public void setBook_loan(boolean book_loanCN) {
        this.book_loanCN = book_loanCN;
    }

    public String getCodeStudent() {
        return codeStudentCN;
    }

    public void setCodeStudent(String codeStudentCN) {
        this.codeStudentCN = codeStudentCN;
    }

    public LocalDate getLoanDate() {
        return loanDateCN;
    }

    public void setLoanDate(LocalDate loanDateCN) {
        this.loanDateCN = loanDateCN;
    }

    public LocalDate getDevolutionDate() {
        return devolutionDateCN;
    }

    public void setDevolutionDate(LocalDate devolutionDateCN) {
        this.devolutionDateCN = devolutionDateCN;
    }

    public Book getBook() {
        return bookCN;
    }

    public void setBook(Book bookCN) {
        this.bookCN = bookCN;
    }
}
