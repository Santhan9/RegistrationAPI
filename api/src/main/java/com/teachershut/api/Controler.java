package com.teachershut.api;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/postAddUser", consumes = "application/json", produces = "application/json")
    public String addUser(@RequestBody userInfo user) throws ClassNotFoundException {

        thDatastorage td= new thDatastorage();
        td.storeUserDetails(user.getName(),user.getEmail(),user.getPhone());
        return "user Added";


    }
}
