package org.dennis.service.impl;

import org.dennis.dao.GoodsinfoMapper;
import org.dennis.domain.Goodsinfo;
import org.dennis.domain.GoodsinfoExample;
import org.dennis.service.GoodsInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "GoodsInfoService")
public class GoodsInfoServiceImpl implements GoodsInfoService {

    @Autowired
    private GoodsinfoMapper goodsinfoMapper;

    @Override
    public long countByExample(GoodsinfoExample example) {
        return goodsinfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(GoodsinfoExample example) {
        return goodsinfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer ginfoId) {
        return goodsinfoMapper.deleteByPrimaryKey(ginfoId);
    }

    @Override
    public int insert(Goodsinfo record) {
        return goodsinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Goodsinfo record) {
        return goodsinfoMapper.insertSelective(record);
    }

    @Override
    public List<Goodsinfo> selectByExample(GoodsinfoExample example) {
        return goodsinfoMapper.selectByExample(example);
    }

    @Override
    public Goodsinfo selectByPrimaryKey(Integer ginfoId) {
        return goodsinfoMapper.selectByPrimaryKey(ginfoId);
    }

    @Override
    public int updateByExampleSelective(Goodsinfo record, GoodsinfoExample example) {
        return goodsinfoMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Goodsinfo record, GoodsinfoExample example) {
        return goodsinfoMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Goodsinfo record) {
        return goodsinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Goodsinfo record) {
        return goodsinfoMapper.updateByPrimaryKey(record);
    }
}
