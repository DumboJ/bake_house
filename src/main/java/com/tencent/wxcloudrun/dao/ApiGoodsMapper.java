package com.tencent.wxcloudrun.dao;


import com.tencent.wxcloudrun.vo.GoodsVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface ApiGoodsMapper {

    List<GoodsVo> queryHotGoodsList(Map<String, Object> params);

    List<GoodsVo> queryCatalogProductList(Map<String, Object> params);

    GoodsVo queryObject(Integer id);

    List<GoodsVo> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(GoodsVo goods);

    void update(GoodsVo goods);

    void delete(Integer id);

    void deleteBatch(Integer[] ids);
}
