package com.kou;

import com.kou.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootConsumerApplicationTests {

    @Autowired
    UserServiceImpl userService;

    @Test
    void contextLoads() {

        userService.BuyTicket();

    }

}
