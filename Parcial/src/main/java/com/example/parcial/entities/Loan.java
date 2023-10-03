package com.example.parcial.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "loan")
public class Loan{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_loan;
    @Column(name = "code_student", length = 255, nullable = false)
    private String codeStudent;
    @Column(name = "loan_date", nullable = false)
    private LocalDate loanDate;
    @Column(name = "devolution_date", nullable = false)
    private LocalDate devolutionDate;
    @Column(name = "book_loan", nullable = false)
    private boolean bookLoan;

    @ManyToOne
    @JoinColumn(name = "id_book")
    private Book book;

    public Loan() {
    }

    public Loan(Long id_loanCN, String codeStudentCN, LocalDate loanDateCN, LocalDate devolutionDateCN, boolean bookLoan, Book bookCN) {
        this.id_loan = id_loanCN;
        this.codeStudent = codeStudentCN;
        this.loanDate = loanDateCN;
        this.devolutionDate = devolutionDateCN;
        this.bookLoan = bookLoan;
        this.book = bookCN;
    }

    public Long getId_loan() {
        return id_loan;
    }

    public void setId_loan(Long id_loanCN) {
        this.id_loan = id_loanCN;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudentCN) {
        this.codeStudent = codeStudentCN;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDateCN) {
        this.loanDate = loanDateCN;
    }

    public LocalDate getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(LocalDate devolutionDateCN) {
        this.devolutionDate = devolutionDateCN;
    }

    public boolean isBookLoan() {
        return bookLoan;
    }

    public void setBookLoan(boolean bookLoanCN) {
        this.bookLoan = bookLoanCN;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book bookCN) {
        this.book = bookCN;
    }
}
