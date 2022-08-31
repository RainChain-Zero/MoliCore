package com.rainchain.jasmine.controller;

import com.rainchain.jasmine.entity.Jackpot;
import com.rainchain.jasmine.service.JackpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2022/08/31 20:43
 */
@RestController
public class JackpotController {
    @Autowired
    private JackpotService jackpotService;

    @PostMapping("/drawLottery")
    public Jackpot drawlottery(@RequestBody @Validated Jackpot jackpot) {
        return jackpotService.drawLottery(jackpot);
    }

    //用于手动投放奖励
    @PostMapping("/insertLottery")
    public void insertLottery(@RequestBody @Validated Jackpot jackpot) {
        jackpotService.insertLottery(jackpot);
    }
}
