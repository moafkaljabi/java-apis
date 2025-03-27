package com.apis.apis.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    @GetMapping
    public List<User> GetUsers(){
        return List.of(
                new User(
                    1L,
                    "Mo",
                    "Ja",
                        "Mo@mail.com",
                        LocalDate.of(2001,Month.FEBRUARY,20),
                        24
                )
        );
    }
}
