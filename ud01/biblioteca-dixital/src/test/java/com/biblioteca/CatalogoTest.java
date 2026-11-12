package com.biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CatalogoTest {
    private Catalogo catalogo;

    @BeforeEach
    void setUp() {
        catalogo = new Catalogo();
    }

    @Test
    void testEngadirEBuscarLibro() {
        Libro libro = new Libro("12345", "Sempre en Galiza", "Castelao");
        catalogo.engadirLibro(libro);

        assertTrue(catalogo.buscarPorIsbn("12345").isPresent());
        assertEquals("Sempre en Galiza", catalogo.buscarPorIsbn("12345").get().getTitulo());
    }
}
