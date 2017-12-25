package com.werner.shop.message;

import com.werner.shop.entity.Message;

import java.util.List;

/**
 * 项目名称:  ssm-dubbo
 * 包:       com.werner.shop.message
 * 类描述:    一句话描述该类的功能
 *
 * @author: zhangwei
 * 创建时间:  2017-12-15 下午11:30
 * 修改人:    zhangwei
 * 修改时间:  2017-12-15 下午11:30
 * 修改备注:
 * 版本:      v1.0
 */
public interface IMessageService {
    /**
     * 获取消息列表
     *
     * @return
     */
    List<Message> listMsg();

    boolean saveMsg(Message msg);

    boolean saveAll(List<Message> messages);


}
