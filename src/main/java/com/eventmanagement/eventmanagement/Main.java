package com.eventmanagement.eventmanagement;

import com.eventmanagement.eventmanagement.entity.Event;
import com.eventmanagement.eventmanagement.entity.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;
import java.util.StringTokenizer;

public class Main {

    public static PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public static void main(String[] args) {



       // System.out.println(passwordEncoder().encode("niv"));


       // String CSV = "abc@gmail.com,nivedita@icloud,abc@abd.com";
        //    StringTokenizer tokenizer = new StringTokenizer(CSV, ",");
        //    while (tokenizer.hasMoreTokens())
       //     { System.out.println(tokenizer.nextToken()); }


    }

}

/*

Users

mufaddal.naya@gmail.com  -> hello    -> Admin
mmm@gmail.com            -> mmn      -> Creator
mmn_new@gmail.com        -> mmn_new  ->User

 */