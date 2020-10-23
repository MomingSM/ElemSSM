package org.dennis.service.impl;

import org.dennis.dao.GoodsTypesMapper;
import org.dennis.domain.GoodsTypes;
import org.dennis.domain.GoodsTypesExample;
import org.dennis.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "GoodsTypeService")
public class GoodsTypeServiceImpl implements GoodsTypeService {

    @Autowired
    private GoodsTypesMapper goodsTypesMapper;
    @Override
    public long countByExample(GoodsTypesExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(GoodsTypesExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer gtypId) {
        return 0;
    }

    @Override
    public int insert(GoodsTypes record) {
        return 0;
    }

    @Override
    public int insertSelective(GoodsTypes record) {
        return 0;
    }

    @Override
    public List<GoodsTypes> selectByExample(GoodsTypesExample example) {
        return goodsTypesMapper.selectByExample(example);
    }

    @Override
    public GoodsTypes selectByPrimaryKey(Integer gtypId) {
        return null;
    }

    @Override
    public int updateByExampleSelective(GoodsTypes record, GoodsTypesExample example) {
        return 0;
    }

    @Override
    public int updateByExample(GoodsTypes record, GoodsTypesExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsTypes record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(GoodsTypes record) {
        return 0;
    }
}
