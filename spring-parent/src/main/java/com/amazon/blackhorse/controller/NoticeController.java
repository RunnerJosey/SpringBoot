package com.amazon.blackhorse.controller;

import com.amazon.blackhorse.entity.Notice;
import com.amazon.blackhorse.service.NoticeServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class NoticeController {
    /**这里用的是多态，父类成员引用子类对象的方法*/
    @Autowired
    private NoticeServer noticeServer;
    /** 跳转分页查询公告页面 */
    @GetMapping("/show")
    public String show(){
        return "/html/notice.html";
    }

    @GetMapping("/findAll")
    @ResponseBody
    public List<Notice> findAll(){
        return noticeServer.findAll();
    }

    @GetMapping("/findByPage")
    @ResponseBody
    public Map<String,Object> findByPage(@RequestParam (defaultValue = "1" )Integer page,@RequestParam (defaultValue = "10")Integer row){
        return noticeServer.findByPage(page,row);
    }

}
