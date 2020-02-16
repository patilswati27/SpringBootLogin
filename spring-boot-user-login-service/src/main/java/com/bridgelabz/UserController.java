package com.bridgelabz;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.entity.User;
import com.bridgelabz.response.InfoResponse;
import com.bridgelabz.services.LoginService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private LoginService loginservice;

    @GetMapping
    public ResponseEntity<InfoResponse> getCustomers() {
        InfoResponse infoResponse = new InfoResponse();
        infoResponse.setInfo("Demo Info");
        return new ResponseEntity<>(infoResponse, HttpStatus.OK);
    }

    @PostMapping("/register")
    public User save(@RequestBody User user) {
        return loginservice.save(user);
    }

    @GetMapping("/count")
    public long count() {
        return loginservice.count();
    }

    @GetMapping("/find/{id}")
    public Optional<User> findDoc(@PathVariable(name = "id") String id) {
        return loginservice.findDoc(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(name = "id") String id) {
        loginservice.delete(id);

    }
}
