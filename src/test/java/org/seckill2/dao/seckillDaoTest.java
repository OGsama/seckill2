package org.seckill2.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill2.entity.seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)//junit依赖
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class seckillDaoTest {

    @Autowired
    private seckillDao seckillDao;
//
    @Test
    public void queryById() {
        long id=200L;
        seckill seckill=seckillDao.queryById(id);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }
}