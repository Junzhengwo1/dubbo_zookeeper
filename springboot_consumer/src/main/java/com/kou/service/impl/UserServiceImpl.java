package com.kou.service.impl;

import com.kou.service.TicketService;
import com.kou.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @author JIAJUN KOU
 */
@Service
public class UserServiceImpl implements UserService {
    @Reference
    TicketService ticketService;

    public void BuyTicket(){

        String ticket = ticketService.getTicket();
        System.out.println(ticket);
    }
}
