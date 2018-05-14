package org.seckill2.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill2.entity.SeckillTwo;

import java.util.List;

public interface  SeckillTwoDao {
    SeckillTwo queryById(@Param("id") Long id);
    List<SeckillTwo> ListqueryAll();
}
