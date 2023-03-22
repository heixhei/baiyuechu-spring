package com.baiyuechu;

import com.baiyuechu.service.UserService;
import com.spring.BaiyuechuApplicationContext;
import jdk.jfr.StackTrace;


public class Test {
    public static void main(String[] args) {
        //扫描----->创建非懒加载的单例Bean
        BaiyuechuApplicationContext applicationContext = new BaiyuechuApplicationContext(AppConfig.class);
        System.out.println((UserService) applicationContext.getBean("userService"));
        System.out.println((UserService) applicationContext.getBean("userService"));
        System.out.println((UserService) applicationContext.getBean("userService"));
//        UserService userService =(UserService) applicationContext.getBean("userService");
//        userService.test();
    }
}
