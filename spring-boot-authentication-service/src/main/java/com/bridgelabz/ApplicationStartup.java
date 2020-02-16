package com.bridgelabz;

import com.bridgelabz.model.User;
import com.bridgelabz.repository.UserDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

    //private AccountRepository accountRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserDao userDao;

    public ApplicationStartup(PasswordEncoder passwordEncoder) {
        //this.accountRepository = accountRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        userDao.deleteAll();;
        User user = new User();
        user.setId("128");
        user.setUsername("demo");
        user.setPassword(passwordEncoder.encode("DemoPassword"));

        userDao.save(user);
    }
}
