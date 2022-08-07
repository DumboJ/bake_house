package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.vo.CategoryVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ApiCategoryMapper {

    CategoryVo queryObject(Integer id);

    List<CategoryVo> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(CategoryVo category);

    void update(CategoryVo category);

    void delete(Integer id);

    void deleteBatch(Integer[] ids);
}
