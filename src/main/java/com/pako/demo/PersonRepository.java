package com.pako.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends
        PagingAndSortingRepository<Person, Long> {
}
