package com.example.sprintbootdemo.model;
import org.springframework.data.repository.CrudRepository;



import com.example.sprintbootdemo.model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}
