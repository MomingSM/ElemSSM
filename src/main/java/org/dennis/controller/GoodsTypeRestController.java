package org.dennis.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.dennis.domain.*;
import org.dennis.service.GoodsTypeService;
import org.dennis.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

    @RequestMapping(value = "/index")
    public String index(){
        return "forward:/WEB-INF/types.jsp";
    }

    @ResponseBody
    @RequestMapping(value = "/list",method = {RequestMethod.GET})
    public MessageAndData list(
            GoodsCondition condition,/*检索条件*/
            @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize

    ) throws ParseException {
        GoodsTypesExample goodsTypesExample = new GoodsTypesExample();
        GoodsTypesExample.Criteria criteria = goodsTypesExample.createCriteria();

        String name="";
        if(condition.getGinfoName()!=null && !condition.getGinfoName().equals("")){
            name = "%"+condition.getGinfoName()+"%";
            criteria.andGtypNameLike(name);
        }


        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = dateFormat.parse("1970-01-01");
        Date endDate = dateFormat.parse("2999-12-31");

        startDate = condition.getStartDate()==null?startDate:condition.getStartDate();
        endDate = condition.getEndDate()==null?endDate:condition.getEndDate();
        if(startDate.after(endDate)){
            Date tempDate = startDate;
            startDate = endDate;
            endDate = tempDate;
        }

        criteria.andAddTimeBetween(startDate,endDate);




        //初始化,约束
        PageHelper.startPage(pageNum, pageSize);
        List<GoodsTypes> lists = goodsTypeService.selectByExample(goodsTypesExample);
        //使用pageHelper的方式封装数据,默认的导航列表长度为8
        PageInfo pageInfo = new PageInfo(lists, 8);
        return MessageAndData.success("").add("pageInfo",pageInfo);
    }


    @ResponseBody
    @RequestMapping(value = "/opt/{id}",method = RequestMethod.GET)
    public MessageAndData optSelectPrimaryKey(@PathVariable("id")Integer id){
        GoodsTypes goodsTypes = goodsTypeService.selectByPrimaryKey(id);
        return MessageAndData.success("查询成功").add("obj",goodsTypes);
    }


    @ResponseBody
    @RequestMapping(value = "/opt",method = RequestMethod.POST)
    public MessageAndData optInsert(GoodsTypes obj){
        Integer i = goodsTypeService.insertSelective(obj);
        if(i>0){
            return MessageAndData.success("成功添加"+i+"条记录");
        }else{
            return MessageAndData.error("添加失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/opt/{ids}",method = RequestMethod.DELETE)
    public MessageAndData deletes(@PathVariable("ids")String ids){
        //获取传递过来的uid列表,分解为一个集合对象
        List<Integer> iIds = new ArrayList<Integer>();
        String splitSymbol = "\\D";
        String[] sIds = ids.split(splitSymbol);
        Integer i = null;
        for (String sId : sIds) {
            iIds.add(Integer.parseInt(sId));
        }
        if(iIds.size() > 1) {//删除多条记录
            //创建一个对象
            GoodsTypesExample goodsTypesExample = new GoodsTypesExample();
            goodsTypesExample.createCriteria().andGtypIdIn(iIds);
            //执行批量删除
            i = goodsTypeService.deleteByExample(goodsTypesExample);
        }else{//删除一条记录
            i = goodsTypeService.deleteByPrimaryKey(iIds.get(0));
        }
        return MessageAndData.success("删除成功"+i+"条记录").add("num", i);
    }


    //    如果使用put方法,记得要在web.xml中添加相应过滤器,对象不能封装
    @ResponseBody
    @RequestMapping(value = "/opt",method = RequestMethod.PUT)
    public MessageAndData optUpdate(GoodsTypes obj){
        int i = goodsTypeService.updateByPrimaryKeySelective(obj);
        if(i>0){
            return MessageAndData.success("成功修改"+i+"条记录");
        }else{
            return MessageAndData.error("修改失败");
        }
    }

}
