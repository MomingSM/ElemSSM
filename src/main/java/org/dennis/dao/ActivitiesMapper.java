package org.dennis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.dennis.domain.Activities;
import org.dennis.domain.ActivitiesExample;

public interface ActivitiesMapper {
    long countByExample(ActivitiesExample example);

    int deleteByExample(ActivitiesExample example);

    int deleteByPrimaryKey(Integer actId);

    int insert(Activities record);

    int insertSelective(Activities record);

    List<Activities> selectByExample(ActivitiesExample example);

    Activities selectByPrimaryKey(Integer actId);

    int updateByExampleSelective(@Param("record") Activities record, @Param("example") ActivitiesExample example);

    int updateByExample(@Param("record") Activities record, @Param("example") ActivitiesExample example);

    int updateByPrimaryKeySelective(Activities record);

    int updateByPrimaryKey(Activities record);
}