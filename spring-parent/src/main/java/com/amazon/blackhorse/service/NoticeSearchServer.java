package com.amazon.blackhorse.service;

import com.amazon.blackhorse.entity.Note;

import java.util.List;
import java.util.Map;

public interface NoticeSearchServer {
    /**
     * 查询所有的公告
     */
    public List<Note> findAll();
}
