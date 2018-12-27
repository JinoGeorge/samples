package com.samples.spring;

import com.samples.spring.entity.Author;
import com.samples.spring.entity.Book;
import com.samples.spring.entity.Publisher;
import com.samples.spring.repository.BookRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BookCatalogStartupRunner implements CommandLineRunner {

    private static Log logger = LogFactory.getLog(BookCatalogStartupRunner.class);

    private BookRepository bookRepository;

    @Autowired
    public BookCatalogStartupRunner(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void run(String... args) throws Exception {

        Book book = new Book("The Alchemist", "978-3-257-23727-6", new Author("Paulo", "Coelho"), new Publisher("Diogenes"));
        bookRepository.save(book);


        logger.info("Starting Book catalog with commands: " + Arrays.toString(args));
        logger.info("Number of available books in the Catalog: " + bookRepository.count());
    }
}
