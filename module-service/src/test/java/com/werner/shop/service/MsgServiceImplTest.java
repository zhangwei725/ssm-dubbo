package com.werner.shop.service;

import com.werner.shop.entity.Message;
import com.werner.shop.message.IMessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.sql.Timestamp;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 项目名称:  ssm-dubbo
 * 包:       com.werner.shop.service
 * 类描述:    一句话描述该类的功能
 *
 * @author: zhangwei
 * 创建时间:  2017-12-15 下午11:35
 * 修改人:    zhangwei
 * 修改时间:  2017-12-15 下午11:35
 * 修改备注:
 * 版本:      v1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-db.xml"})
public class MsgServiceImplTest {
    @Resource
    IMessageService messageService;

    @Test
    public void listMsg() {
        List<Message> messages = messageService.listMsg();
        System.out.println(messages.toString());
    }

    @Test
    public void saveMsg() {
        Message msg = new Message();
        msg.setTitle("测试标题");
        msg.setReadCount(10);
        msg.setSource("来源1");
        msg.setState("1");
        msg.setUpdateTime(new Timestamp(System.currentTimeMillis()));
        messageService.saveMsg(msg);
    }
}