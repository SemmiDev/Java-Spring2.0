package com.learn.amigoscode.dao;

import com.learn.amigoscode.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);
    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id,person);
    }
    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);
    int deleteById(UUID id);
    int updateById(UUID id, Person person);
}
