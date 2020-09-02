package com.stackroute.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Integer> {   /* In generics type mentioned the class whose
object you are planning to persist and and second the datatype of the key */

}
