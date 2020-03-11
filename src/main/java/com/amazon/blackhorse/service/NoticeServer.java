package com.amazon.blackhorse.service;

import com.amazon.blackhorse.entity.Notice;

import java.util.List;
import java.util.Map;

public interface NoticeServer {
    /**
     * 查询所有的公告
     */
    public List<Notice> findAll();

    /**
     * 分页查询公告
     */
    public Map<String, Object> findByPage(Integer page, Integer rows);

}
