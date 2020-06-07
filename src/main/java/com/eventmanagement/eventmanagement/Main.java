package com.eventmanagement.eventmanagement;

import com.eventmanagement.eventmanagement.entity.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

public class Main {

    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public static void main(String[] args) {

        System.out.println(passwordEncoder().encode("hello"));

    }

}