package com.mdc.gatekeeper.resources;

import com.mdc.gatekeeper.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserControlResource {

    @GetMapping("/users")
    public List<User> allUsers() {
        return null;
    }
}
