package com.zb.service;

import com.zb.entity.Notice;

import java.util.List;

/**
 * @author SRQCDWB
 * @create 2018-09-18 20:28
 */
public interface NoticeService {

    public boolean updateNotice(Notice notice);

    public List<Notice> getByTitle(String tmpName);

    public Notice getById(int id);

    public List<Notice> getAll();

    public boolean delNotice(int id);

    public boolean addNotice(Notice notice);
}
