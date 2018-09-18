package com.zb.service.impl;

import com.zb.dao.MessageMapper;
import com.zb.entity.Message;
import com.zb.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author SRQCDWB
 * @create 2018-09-18 20:35
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    //通过id修改状态
    public boolean updateMessage(Message message) {
        try {
            messageMapper.updateMessage(message);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    //模糊查询
    public List<Message> getByContent(String tmpContent) {
        String content = "%"+tmpContent+"%";
        return messageMapper.findByContent(content);
    }
    //获取全部
    public List<Message> getAll() {
        // TODO Auto-generated method stub
        return messageMapper.findAllMessage();
    }
    public List<Message> getMyMessage(int id) {
        // TODO Auto-generated method stub
        return messageMapper.findMyMessage(id);
    }
    //删除
    public boolean delMessage(int id) {
        try {
            messageMapper.deleteMessage(id);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    //添加
    public boolean addMessage(Message message) {
        try {
            messageMapper.insertMessage(message);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }
}
