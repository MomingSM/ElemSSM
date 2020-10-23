package org.dennis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.dennis.domain.GoodsTypes;
import org.dennis.domain.GoodsTypesExample;

public interface GoodsTypesMapper {
    long countByExample(GoodsTypesExample example);

    int deleteByExample(GoodsTypesExample example);

    int deleteByPrimaryKey(Integer gtypId);

    int insert(GoodsTypes record);

    int insertSelective(GoodsTypes record);

    List<GoodsTypes> selectByExample(GoodsTypesExample example);

    GoodsTypes selectByPrimaryKey(Integer gtypId);

    int updateByExampleSelective(@Param("record") GoodsTypes record, @Param("example") GoodsTypesExample example);

    int updateByExample(@Param("record") GoodsTypes record, @Param("example") GoodsTypesExample example);

    int updateByPrimaryKeySelective(GoodsTypes record);

    int updateByPrimaryKey(GoodsTypes record);
}