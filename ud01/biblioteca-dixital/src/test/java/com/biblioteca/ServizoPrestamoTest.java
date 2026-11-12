package com.biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ServizoPrestamoTest {
    private Catalogo catalogo;
    private ServizoPrestamo servizoPrestamo;
    private Usuario usuario;

    @BeforeEach
    void setUp() {
        catalogo = new Catalogo();
        servizoPrestamo = new ServizoPrestamo(catalogo);
        usuario = new Usuario("U1", "Uxía");

        Libro libro = new Libro("978-1", "Os Eidos", "Uxío Novoneyra");
        catalogo.engadirLibro(libro);
    }

    @Test
    void testPrestarLibroConExito() {
        boolean exito = servizoPrestamo.prestarLibro("978-1", usuario);
        assertTrue(exito);
    }

    @Test
    void testNonPrestarLibroXaPrestado() {
        servizoPrestamo.prestarLibro("978-1", usuario);
        boolean segundoIntento = servizoPrestamo.prestarLibro("978-1", usuario);
        assertFalse(segundoIntento);
    }

    @Test
    void testDevolverLibro() {
        servizoPrestamo.prestarLibro("978-1", usuario);
        boolean devolto = servizoPrestamo.devolverLibro("978-1");
        assertTrue(devolto);
    }
}
