package com.biblioteca;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Catalogo {
    private Map<String, Libro> libros = new HashMap<>();

    public void engadirLibro(Libro libro) {
        libros.put(libro.getIsbn(), libro);
    }

    public Optional<Libro> buscarPorIsbn(String isbn) {
        return Optional.ofNullable(libros.get(isbn));
    }
}
