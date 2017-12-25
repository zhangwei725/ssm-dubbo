package com.werner.shop.service;


import com.werner.shop.entity.Message;
import com.werner.shop.mapper.MessageMapper;
import com.werner.shop.message.IMessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称:  ssm-dubbo
 * 包:       com.werner.shop.service
 * 类描述:    一句话描述该类的功能
 *
 * @author: zhangwei
 * 创建时间:  2017-12-15 下午11:29
 * 修改人:    zhangwei
 * 修改时间:  2017-12-15 下午11:29
 * 修改备注:
 * 版本:      v1.0
 */
@Service("messageService")
public class MsgServiceImpl implements IMessageService {
    @Resource
    private  MessageMapper messageMapper;

    @Override
    public List<Message> listMsg() {
        return messageMapper.listMsg();
    }

    @Override
    public boolean saveMsg(Message msg) {
        return messageMapper.save(msg);
    }

    @Override
    public boolean saveAll(List<Message> messages) {
        return false;
    }
}
