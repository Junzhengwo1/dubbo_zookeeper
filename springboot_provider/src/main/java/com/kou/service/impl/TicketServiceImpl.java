package com.kou.service.impl;

import com.kou.service.TicketService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author JIAJUN KOU
 */
//这里不要用service的注解
    //要用也得是Dubbo中的service注解

@Service
@Component
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "kou王";
    }
}
