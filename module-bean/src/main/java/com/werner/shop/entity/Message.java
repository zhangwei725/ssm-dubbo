package com.werner.shop.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;


/**
 * 项目名称:  ssm-dubbo
 * 包:       com.werner.shop.entity
 * 类描述:    一句话描述该类的功能
 *
 * @author: zhangwei
 * 创建时间:  2017-12-15 下午11:16
 * 修改人:    zhangwei
 * 修改时间:  2017-12-15 下午11:16
 * 修改备注:
 * 版本:      v1.0
 */
@ToString
public class Message {
    @Getter
    @Setter
    private int msgId;
    @Getter
    @Setter
    private String title;
    @Getter
    @Setter
    private int categoryId;
    @Getter
    @Setter
    private String source;
    @Getter
    @Setter
    private Timestamp updateTime;
    @Getter
    @Setter
    private Integer readCount;
    /**
     * 1 发布 2 草稿 3 审核
     */
    @Getter
    @Setter
    private String state;

}
