package com.tencent.wxcloudrun.dao;


import com.tencent.wxcloudrun.model.ChannelVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface ApiChannelMapper{

    ChannelVo queryObject(Integer id);

    List<ChannelVo> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(ChannelVo order);

    void update(ChannelVo order);

    void delete(Integer id);

    void deleteBatch(Integer[] ids);
}
