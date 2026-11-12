# Aplicación BibliotecaDixital

Sistema sinxelo de xestión de biblioteca e préstamos desenvolvido en Java con Maven.

---

## 📋 Scrum Backlog e Planificación

A metodoloxía empregada foi **Scrum**, organizada en 2 Sprints de 1 semana cada un.

### Sprint 1 (Semana 1): Core do Sistema e Catálogo
- **US1.1:** Creación do modelo `Libro` (título, autor, ISBN, estado de préstamo).
- **US1.2:** Creación da clase `Catalogo` para almacenar e buscar libros por ISBN.
- **US1.3:** Configuración inicial de Maven e probas unitarias do catálogo (`CatalogoTest`).

### Sprint 2 (Semana 2): Usuarios e Lóxica de Préstamos
- **US2.1:** Creación da clase `Usuario` (ID, nome).
- **US2.2:** Creación da clase `ServizoPrestamo` con funcionalidade de préstamo e devolución.
- **US2.3:** Creación de probas unitarias para verificar a lóxica de préstamos e devolucións (`ServizoPrestamoTest`).

---

## 🛠️ Requisitos e Tecnoloxías

* **Linguaxe:** Java 17
* **Xestor de dependencias:** Apache Maven
* **Framework de probas:** JUnit 5

---

## 🚀 Requisitos para a execución e probas

### Recompilar o proxecto:
```bash
mvn clean compile
```

### Executar as probas unitarias:
```bash
mvn test
```
