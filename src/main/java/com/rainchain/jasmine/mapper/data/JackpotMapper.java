package com.rainchain.jasmine.mapper.data;

import com.rainchain.jasmine.entity.Jackpot;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2022/08/31 18:56
 */
@Mapper
public interface JackpotMapper {
    void updateJackpotAvg();

    BigDecimal getJackpotAvg();

    //用户首先放入物品
    void insertLottery(Jackpot jackpot);

    //获取随机偏移量
    Integer getOffset();

    //抽取物品
    Jackpot drawLottery(Integer offset);

    //删除该物品
    void deleteLottery(Jackpot jackpot);

}
