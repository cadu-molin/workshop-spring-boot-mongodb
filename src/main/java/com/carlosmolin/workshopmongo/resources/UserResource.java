package com.carlosmolin.workshopmongo.resources;

import com.carlosmolin.workshopmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll() {
        List<User> users = new ArrayList<>();

        users.add(new User("1", "Maria Brown", "maria@gmail.com"));
        users.add(new User("2", "Alex Green", "alex@gmail.com"));

        return ResponseEntity.ok().body(users);
    }
}
