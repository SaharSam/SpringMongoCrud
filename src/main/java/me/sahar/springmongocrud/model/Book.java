package me.sahar.springmongocrud.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString

@Document(collection= "Book")
public class Book {

    private int id;
    private String bookName;
    private String authorName;

}
