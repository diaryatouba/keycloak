package com.groupeisi.keycloak.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KeyController {
    @GetMapping
    @PreAuthorize("hasRole('client_user')")
    public String hello() {
        return "hello gl";
    }
    @GetMapping("hello-2")
    @PreAuthorize("hasRole('client_admin')")
    public String hello2() {
        return "hello gl - ";
    }
}
