package com.amazon.blackhorse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;


@RestController
@RequestMapping(name = "/queue")
public class QueueController {
    @Autowired
    JmsTemplate jmsTemplate;
    @Autowired
    Destination destination;
    @RequestMapping("/send/{message}")
    public String send(@PathVariable String message){
        //PathVariable可以将URL中的占位符里的内容作为参数传递
        this.jmsTemplate.convertAndSend(destination,message);
        return "消息发送成功："+message;
    }
}
