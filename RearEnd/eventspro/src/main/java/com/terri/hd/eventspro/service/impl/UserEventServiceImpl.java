package com.terri.hd.eventspro.service.impl;

import com.terri.hd.eventspro.mapper.UserEventMapper;
import com.terri.hd.eventspro.pojo.UserEvent;
import com.terri.hd.eventspro.service.UserEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Gaoquan Li
 * @Date: 2021/1/10 下午9:56
 */
@Service
public class UserEventServiceImpl implements UserEventService {

    @Autowired
    private UserEventMapper userEventMapper;

    @Override
    public int insert(UserEvent record) {
        return userEventMapper.insert(record);
    }

    @Override
    public List<UserEvent> selectByOpenId(String openId) {
        return userEventMapper.selectByOpenId(openId);
    }

    @Override
    public UserEvent selectByPrimaryKey(String eventUuid) {
        return userEventMapper.selectByPrimaryKey(eventUuid);
    }

    @Override
    public int deleteByUUID(String eventUuid) {
        return userEventMapper.deleteByUUID(eventUuid);
    }
}
