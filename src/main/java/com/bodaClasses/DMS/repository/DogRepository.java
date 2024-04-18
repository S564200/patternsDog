/*
  @author Partha Sarathy Boda - S564200
*/

package com.bodaClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bodaClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer> {
	List<Dog> findByName(String name);

	
}
