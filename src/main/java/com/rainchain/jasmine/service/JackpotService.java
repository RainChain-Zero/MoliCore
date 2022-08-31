package com.rainchain.jasmine.service;

import com.rainchain.jasmine.entity.Jackpot;
import com.rainchain.jasmine.mapper.JackpotMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2022/08/31 18:56
 */
@Service
public class JackpotService {
    @Autowired
    private JackpotMapper jackpotMapper;

    //更新奖池价值平均值
    public void updateJackpotAvg() {
        jackpotMapper.updateJackpotAvg();
    }

    public void insertLottery(Jackpot jackpot) {
        jackpotMapper.insertLottery(jackpot);
    }

    public Jackpot drawLottery(Jackpot jackpot) {
        this.insertLottery(jackpot);
        //获取随机偏移量,抽取奖励
        Integer offset = jackpotMapper.getOffset();
        Jackpot lotteryGot = jackpotMapper.drawLottery(offset);

        BigDecimal avg = jackpotMapper.getJackpotAvg();
        lotteryGot.setAvg(avg.doubleValue());

        jackpotMapper.deleteLottery(lotteryGot);

        return lotteryGot;
    }
}
