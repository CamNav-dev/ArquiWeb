package com.example.parcial.controllers;


import com.example.parcial.dtos.LoanDTO;
import com.example.parcial.entities.Loan;
import com.example.parcial.serviceinterfaces.LoanService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/library/v1/loans")
public class LoanController {
    @Autowired
    private LoanService dS;

    @PostMapping
    public void registrar(@RequestBody LoanDTO dto) {
        ModelMapper m = new ModelMapper();
        Loan d = m.map(dto, Loan.class);
        dS.insert(d);
    }

    @PutMapping
    public void modificar(@RequestBody LoanDTO dto) {
        ModelMapper m = new ModelMapper();
        Loan d = m.map(dto, Loan.class);
        dS.insert(d);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long id) {
        dS.delete(id);
    }

    @GetMapping("/{id}")
    public LoanDTO listarId(@PathVariable("id") Long id) {
        ModelMapper m = new ModelMapper();
        LoanDTO dto = m.map(dS.listId(id), LoanDTO.class);
        return dto;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<LoanDTO> listar() {
        return dS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, LoanDTO.class);
        }).collect(Collectors.toList());
    }

}
