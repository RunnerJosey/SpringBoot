package com.amazon.blackhorse.controller;

import com.amazon.blackhorse.entity.Note;
import com.amazon.blackhorse.service.NoticeSearchServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoticeSearchController {
    @Autowired
    NoticeSearchServer noticeSearchServer;
    @GetMapping("/searchAll")
    public List<Note> searchAll(Model model){
        return noticeSearchServer.findAll();
    }
}
