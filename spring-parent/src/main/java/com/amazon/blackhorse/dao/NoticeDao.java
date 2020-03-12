package com.amazon.blackhorse.dao;

import com.amazon.blackhorse.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeDao extends JpaRepository<Note,Long> {

}
