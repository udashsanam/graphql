package com.example.graphqlserver;

import com.example.graphqlserver.schematype.Genera;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    @QueryMapping
    public Book bookById(@Argument String id) {
        return Book.getById(id);
    }

    @QueryMapping
    public com.example.graphqlserver.Author authorById(@Argument String id) {
        return com.example.graphqlserver.Author.getById(id);
    }

    @QueryMapping
    public Genera generaById(@Argument String id) {
        return Genera.getGenerabyId(id);
    }



    @SchemaMapping
    public com.example.graphqlserver.Author author(Book book) {
        return com.example.graphqlserver.Author.getById(book.authorId());
    }
}