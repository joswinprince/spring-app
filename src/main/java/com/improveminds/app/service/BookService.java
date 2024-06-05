package com.improveminds.app.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.improveminds.app.entity.Book;
import com.improveminds.app.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
    
    public void insertBooksFromJson(String jsonData) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Book> books = objectMapper.readValue(jsonData, new TypeReference<List<Book>>() {});
        bookRepository.saveAll(books);
    }
}
