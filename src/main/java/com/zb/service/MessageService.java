package com.zb.service;

import com.zb.entity.Message;

import java.util.List;

/**
 * @author SRQCDWB
 * @create 2018-09-18 20:30
 */
public interface MessageService {

    public boolean updateMessage(Message message);

    public List<Message> getByContent(String tmpContent);

    public List<Message> getAll();

    public List<Message> getMyMessage(int id);

    public boolean delMessage(int id);

    public boolean addMessage(Message message);
}
