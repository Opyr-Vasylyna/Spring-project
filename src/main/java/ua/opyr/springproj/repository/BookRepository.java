package ua.opyr.springproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.opyr.springproj.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}