package com.werner.shop.mapper;

import com.werner.shop.entity.Message;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 项目名称:  ssm-dubbo
 * 包:       com.werner.shop.mapper
 * 类描述:    一句话描述该类的功能
 *
 * @author: zhangwei
 * 创建时间:  2017-12-15 下午11:43
 * 修改人:    zhangwei
 * 修改时间:  2017-12-15 下午11:43
 * 修改备注:
 * 版本:      v1.0
 */

public interface MessageMapper {
    /**
     *
     * @return
     */
    List<Message> listMsg();

    /**
     *
     * @param msg
     * @return
     */
    boolean save(Message msg);

    /**
     *
     * @param messages
     * @return
     */
    boolean saveAll(List<Message> messages);
}
