package com.hendisantika.springbootsecuritysessionredis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-session-redis
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 03/01/21
 * Time: 06.24
 */

@RestController
public class AdminController {

    @GetMapping("/admin")
    public String admin() {
        return "Hello Admin!";
    }
}