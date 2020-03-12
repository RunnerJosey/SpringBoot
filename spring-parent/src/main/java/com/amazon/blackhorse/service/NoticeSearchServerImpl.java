package com.amazon.blackhorse.service;

import com.amazon.blackhorse.dao.NoticeDao;
import com.amazon.blackhorse.entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class NoticeSearchServerImpl implements NoticeSearchServer {
    @Autowired
    NoticeDao noticeDao;
    @Override
    public List<Note> findAll() {
        return noticeDao.findAll();
    }
}
