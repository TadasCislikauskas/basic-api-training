package com.testing.training.Repository;

import com.testing.training.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
