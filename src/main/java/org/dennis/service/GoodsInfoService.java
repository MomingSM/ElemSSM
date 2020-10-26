package org.dennis.service;

import org.apache.ibatis.annotations.Param;
import org.dennis.domain.Goodsinfo;
import org.dennis.domain.GoodsinfoExample;

import java.util.List;

public interface GoodsInfoService {
    long countByExample(GoodsinfoExample example);

    int deleteByExample(GoodsinfoExample example);

    int deleteByPrimaryKey(Integer ginfoId);

    int insert(Goodsinfo record);

    int insertSelective(Goodsinfo record);

    List<Goodsinfo> selectByExample(GoodsinfoExample example);

    Goodsinfo selectByPrimaryKey(Integer ginfoId);

    int updateByExampleSelective(@Param("record") Goodsinfo record, @Param("example") GoodsinfoExample example);

    int updateByExample(@Param("record") Goodsinfo record, @Param("example") GoodsinfoExample example);

    int updateByPrimaryKeySelective(Goodsinfo record);

    int updateByPrimaryKey(Goodsinfo record);
}
