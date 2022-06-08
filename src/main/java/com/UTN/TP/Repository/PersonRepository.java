package com.UTN.TP.Repository;

import com.UTN.TP.Entity.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends MongoRepository<Person, Long> {
}
