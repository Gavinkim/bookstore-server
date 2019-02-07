package com.bookstore.member;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gavinkim at 2019-02-08
 */
@RestController
public class MemberController {

    @GetMapping
    public String welcome(){
        return "welcome to Bookstore Memebr Service";
    }
}
