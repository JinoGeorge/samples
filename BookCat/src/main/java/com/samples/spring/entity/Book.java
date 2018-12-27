package com.samples.spring.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Book {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String title;

    @NotBlank
    private String isbn;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private Author author;

    @NotNull
    @ManyToOne(cascade = CascadeType.ALL)
    private Publisher publisher;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Reviewer> reviewers;

    public Book(@NotBlank String title, @NotBlank String isbn, @NotNull Author author, @NotNull Publisher publisher) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }
}
