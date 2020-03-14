package com.amazon.blackhorse;

import com.amazon.blackhorse.service.NoticeServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import redis.clients.jedis.Jedis;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class NoteControllerTest {
    @Autowired
    NoticeServer noticeServer;
    @Test
    public void findAll(){

        System.out.println("我的打印："+noticeServer.findAll());
        Jedis jedis=new Jedis("47.98.200.74",6379);
        jedis.append("operateTime",new Date()+"");
        Set<String> jedisKey=jedis.keys("operateTime");
        System.out.println(jedisKey);


    }
}
