package com.biblioteca;

public class ServizoPrestamo {
    private Catalogo catalogo;

    public ServizoPrestamo(Catalogo catalogo) {
        this.catalogo = catalogo;
    }

    public boolean prestarLibro(String isbn, Usuario usuario) {
        Libro libro = catalogo.buscarPorIsbn(isbn)
                .orElseThrow(() -> new IllegalArgumentException("O libro non existe"));

        if (libro.isPrestado()) {
            return false;
        }

        libro.setPrestado(true);
        return true;
    }

    public boolean devolverLibro(String isbn) {
        Libro libro = catalogo.buscarPorIsbn(isbn)
                .orElseThrow(() -> new IllegalArgumentException("O libro non existe"));

        if (!libro.isPrestado()) {
            return false;
        }

        libro.setPrestado(false);
        return true;
    }
}
