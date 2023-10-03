package com.example.parcial.serviceimplements;

import com.example.parcial.entities.Loan;
import com.example.parcial.repositories.LoanRepository;
import com.example.parcial.serviceinterfaces.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanServiceImplement implements LoanService {
    @Autowired
    private LoanRepository myRepository;
    @Override
    public void insert(Loan loanCN) {
        myRepository.save(loanCN);
    }

    @Override
    public void delete(Long idCN) {
        myRepository.deleteById(idCN);
    }

    @Override
    public Loan listId(Long idCN) {
        return myRepository.findById(idCN).orElse(new Loan());
    }

    @Override
    public List<Loan> list() {
        return myRepository.findAll();
    }

    @Override
    public void update(Loan loanCN) {
        myRepository.save(loanCN);
    }
}
