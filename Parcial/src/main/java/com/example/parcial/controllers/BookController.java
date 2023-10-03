package com.example.parcial.controllers;

import com.example.parcial.dtos.BookDTO;
import com.example.parcial.entities.Book;
import com.example.parcial.serviceinterfaces.BookService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/library/v1/books")
public class BookController {
    @Autowired
    private BookService dSCN;

    @PostMapping
    public void registrar(@RequestBody BookDTO dto) {
        ModelMapper mCN = new ModelMapper();
        Book dCN = mCN.map(dto, Book.class);
        dSCN.insert(dCN);
    }

    @PutMapping
    public void modificar(@RequestBody BookDTO dto) {
        ModelMapper mCN = new ModelMapper();
        Book dCN = mCN.map(dto, Book.class);
        dSCN.insert(dCN);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Long idCN) {

        dSCN.delete(idCN);
    }

    @GetMapping("/{id}")
    public BookDTO listarId(@PathVariable("id") Long idCN) {
        ModelMapper mCN = new ModelMapper();
        BookDTO dtoCN = mCN.map(dSCN.listId(idCN), BookDTO.class);
        return dtoCN;
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<BookDTO> listar() {
        return dSCN.list().stream().map(x -> {
            ModelMapper mCN = new ModelMapper();
            return mCN.map(x, BookDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/filterByEditorial/{editorial}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<BookDTO> listarPorEditorial(@PathVariable("editorial") String editorial) {
        List<String[]> myList = dSCN.findByEditorial(editorial);
        List<BookDTO> myListDTO = new ArrayList<>();
        for (String[] data:myList) {
            BookDTO dtoCN = new BookDTO();

            dtoCN.setId_book(Long.parseLong(data[0])); // Assuming id_lectura is at index 0
            dtoCN.setEditorial(data[1]); // Assuming descripcion is at index 1
            dtoCN.setTitle(data[2]); // Assuming titulo is at index 2

            myListDTO.add(dtoCN);
        }
        return myListDTO;
    }
}
