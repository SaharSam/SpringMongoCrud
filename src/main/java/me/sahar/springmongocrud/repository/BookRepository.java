package me.sahar.springmongocrud.repository;

import me.sahar.springmongocrud.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book , Integer> {

}
