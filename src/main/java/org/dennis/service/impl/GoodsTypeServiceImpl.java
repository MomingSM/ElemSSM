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
        return goodsTypesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(GoodsTypesExample example) {
        return goodsTypesMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer gtypId) {
        return goodsTypesMapper.deleteByPrimaryKey(gtypId);
    }

    @Override
    public int insert(GoodsTypes record) {
        return goodsTypesMapper.insert(record);
    }

    @Override
    public int insertSelective(GoodsTypes record) {
        return goodsTypesMapper.insertSelective(record);
    }

    @Override
    public List<GoodsTypes> selectByExample(GoodsTypesExample example) {
        return goodsTypesMapper.selectByExample(example);
    }

    @Override
    public GoodsTypes selectByPrimaryKey(Integer gtypId) {
        return goodsTypesMapper.selectByPrimaryKey(gtypId);
    }

    @Override
    public int updateByExampleSelective(GoodsTypes record, GoodsTypesExample example) {
        return goodsTypesMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(GoodsTypes record, GoodsTypesExample example) {
        return goodsTypesMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsTypes record) {
        return goodsTypesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GoodsTypes record) {
        return goodsTypesMapper.updateByPrimaryKey(record);
    }
}
