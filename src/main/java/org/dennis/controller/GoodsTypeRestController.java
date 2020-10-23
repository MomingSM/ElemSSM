package org.dennis.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.dennis.domain.GoodsTypes;
import org.dennis.domain.User;
import org.dennis.domain.UserExample;
import org.dennis.service.GoodsTypeService;
import org.dennis.service.UserService;
import org.dennis.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @创建人 dennis[ccc]
 * @创建时间 2020/10/19 0019
 * @描述
 */
@Controller
@RequestMapping("/goodstype")
public class GoodsTypeRestController {
    @Autowired
    private GoodsTypeService goodsTypeService;

    @GetMapping(value = "/list")
    public MessageAndData list(
            @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize

    ){
        //初始化,约束
        PageHelper.startPage(pageNum, pageSize);
        List<GoodsTypes> goodsTypes = goodsTypeService.selectByExample(null);
        //使用pageHelper的方式封装数据,默认的导航列表长度为8
        PageInfo pageInfo = new PageInfo(goodsTypes, 8);
        return MessageAndData.success("").add("pageInfo",pageInfo);
    }



}
