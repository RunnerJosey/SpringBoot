package com.amazon.blackhorse.entity;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class IterMessageListener {
    @JmsListener(destination ="amazon.queue" )
    public void readMessage(String message){
        System.out.println("接收到的消息是"+message);
    }
}
