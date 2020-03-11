package com.amazon.blackhorse.service;

import com.amazon.blackhorse.mapper.NoticeMapper;
import com.amazon.blackhorse.entity.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
@Transactional
public class NoticeServerImpl implements NoticeServer {
    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> findAll() {
        return noticeMapper.findAll();
    }

    @Override
    public Map<String, Object> findByPage(Integer page, Integer rows) {
        Map<String,Object> data=new HashMap<>();
        long count=noticeMapper.count();
        List<Notice> noticeList=noticeMapper.findByPage(page,rows);
        data.put("total",count);
        data.put("row",noticeList);
        return data;
    }
}
