package com.example.parcial.serviceinterfaces;

import com.example.parcial.entities.Book;
import com.example.parcial.entities.Loan;

import java.util.List;

public interface LoanService {
    void insert(Loan loanCN);

    void delete(Long idCN);

    Loan listId(Long idCN);

    List<Loan> list();
    void update(Loan loanCN);
}
