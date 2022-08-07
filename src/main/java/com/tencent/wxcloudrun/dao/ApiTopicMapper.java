package com.tencent.wxcloudrun.dao;


import com.tencent.wxcloudrun.model.TopicVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ApiTopicMapper{

    TopicVo queryObject(Integer id);

    List<TopicVo> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(TopicVo topic);

    void update(TopicVo topic);

    void delete(Integer id);

    void deleteBatch(Integer[] ids);
}
