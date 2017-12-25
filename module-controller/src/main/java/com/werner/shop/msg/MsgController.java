package com.werner.shop.msg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 项目名称:  ssm-dubbo
 * 包:       com.werner.shop.msg
 * 类描述:    一句话描述该类的功能
 *
 * @author: zhangwei
 * 创建时间:  2017-12-15 下午10:54
 * 修改人:    zhangwei
 * 修改时间:  2017-12-15 下午10:54
 * 修改备注:
 * 版本:      v1.0
 */
@Controller
@RequestMapping("/msg")
public class MsgController {

    @RequestMapping("/list")
    @ResponseBody
    public String findMsg() {
        return "12345";
    }
}
