package com.egiants.sameer.repository.user;

import org.springframework.data.repository.CrudRepository;

import com.egiants.sameer.entity.user.User;

public interface UserRepository extends CrudRepository<User, Long> {
	//
}
