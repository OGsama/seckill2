package org.seckill2.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill2.entity.seckill;

public interface seckillDao {

    seckill queryById(@Param("seckillId") long id);
}
