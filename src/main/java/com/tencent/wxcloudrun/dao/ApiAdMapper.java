package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.vo.AdVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ApiAdMapper {

    AdVo queryObject(Integer id);

    int queryTotal(Map<String, Object> map);

    void save(AdVo brand);

    void update(AdVo brand);

    void delete(Integer id);

    void deleteBatch(Integer[] ids);

    List<AdVo> queryList(Map<String, Object> map);
}
