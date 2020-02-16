package com.bridgelabz.services;

import java.util.Optional;

import com.bridgelabz.entity.User;

public interface LoginService {

	public User save(User user);
	public User update(User user);
	public void delete(String id);
	public long count();
	public Optional<User> findDoc(String id);
}
