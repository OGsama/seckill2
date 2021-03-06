package org.seckill2.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)//junit依赖
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillTwoDaoTest {

    @Autowired
    private SeckillTwoDao seckillTwoDao;
    @Test
    public void queryById() {
        System.out.println(seckillTwoDao.queryById(200L));
    }
}