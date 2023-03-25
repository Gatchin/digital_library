package com.polozov.villageLibrary.repositories;


import com.polozov.villageLibrary.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<Person,Integer> {
}
