package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.vo.CartVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface ApiCartMapper{
    void updateCheck(@Param("productIds") String[] productIds,
                     @Param("isChecked") Integer isChecked, @Param("userId") Long userId);

    void deleteByProductIds(@Param("productIds") String[] productIds);

    void deleteByUserAndProductIds(@Param("user_id") Long user_id,@Param("productIds") String[] productIds);

    void deleteByCart(@Param("user_id") Long user_id, @Param("session_id") Integer session_id, @Param("checked") Integer checked);

    CartVo queryObject(Integer id);

    List<CartVo> queryList(Map<String, Object> map);

    int queryTotal(Map<String, Object> map);

    void save(CartVo cart);

    void update(CartVo cartItem);

    void delete(Integer id);

    void deleteBatch(Integer[] ids);
}
