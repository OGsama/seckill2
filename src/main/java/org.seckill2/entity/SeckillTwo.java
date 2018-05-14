package org.seckill2.entity;

public class SeckillTwo {
    private Long seckillId;
    private String seckillName;

    @Override
    public String toString() {
        return "SeckillTwo{" +
                "seckillId=" + seckillId +
                ", seckillName='" + seckillName + '\'' +
                '}';
    }

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public String getSeckillName() {
        return seckillName;
    }

    public void setSeckillName(String seckillName) {
        this.seckillName = seckillName;
    }
}
