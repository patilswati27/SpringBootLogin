package com.bridgelabz.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.dao.UserDao;
import com.bridgelabz.entity.User;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserDao logindao;

	public User save(User user) {
		// TODO Auto-generated method stub
		return logindao.save(user);
	}

	public User update(User user) {
		// TODO Auto-generated method stub
		return logindao.save(user);
	}

	public long count() {
		// TODO Auto-generated method stub
		return logindao.count();
	}

	@Override
	public Optional<User> findDoc(final String id) {
		return logindao.findById(id);
	}

	@Override
	public void delete(String id) {
		logindao.deleteById(id);

	}

}
