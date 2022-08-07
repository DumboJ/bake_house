package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.vo.BrandVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ApiBrandMapper{

    BrandVo queryObject(Integer id);

    List<BrandVo> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(BrandVo brand);

    void update(BrandVo brand);

    void delete(Integer id);

    void deleteBatch(Integer[] ids);
}
