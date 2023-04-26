package com.usermanagement.service;

import java.util.List;

import com.usermanagement.model.User;

public interface UserService {

	User saveUser(User user);

	List<User> getAllUsers();

	User getUserById(Long id);

	boolean deleteUser(Long id);

	User updateUser(Long id, User user);

}
