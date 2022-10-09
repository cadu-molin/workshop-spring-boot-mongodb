package com.carlosmolin.workshopmongo.resources;

import com.carlosmolin.workshopmongo.domain.User;
import com.carlosmolin.workshopmongo.dto.UserDTO;
import com.carlosmolin.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<UserDTO>> findAll() {
        return ResponseEntity.ok().body(userService.findAll()
                                                   .stream()
                                                   .map(x -> new UserDTO(x))
                                                   .collect(Collectors.toList()));
    }
}
