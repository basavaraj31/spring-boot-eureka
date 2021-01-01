package com.api.user.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.user.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
