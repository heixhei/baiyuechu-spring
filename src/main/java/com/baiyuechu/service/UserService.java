package com.baiyuechu.service;

import com.spring.Component;
import com.spring.ComponentScan;
import com.spring.Scope;

@Component("userService")
//@Scope("Prototype")
public class UserService {
    public void test() {
        System.out.println("test");
    }
}
