package com.amazon.blackhorse;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.jms.Queue;

@SpringBootApplication
public class SpringParentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringParentApplication.class, args);
    }
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("amazon.queue");
    }

}
