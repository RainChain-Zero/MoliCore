package com.rainchain.jasmine.config;

import com.rainchain.jasmine.mapper.amusement.BottleMapper;
import com.rainchain.jasmine.service.JackpotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;

@Slf4j
@Configuration
@EnableScheduling
public class ScheduleConfigurer {
    @Resource
    private JackpotService jackpotService;

    @Resource
    private BottleMapper bottleMapper;

    @Scheduled(cron = "0 0 0-23 * * ?")
    //每小时更新奖池的平均价值
    public void updateJackpotAvg() {
        log.info("update jackpotAvg");
        jackpotService.updateJackpotAvg();
        log.info("update jackpotAvg success");
    }

    @Scheduled(cron = "0 0 4 * * ?")
    //每天4点删除相关的漂流瓶
    public void clearBottle() {
        log.info("clear bottle");
        bottleMapper.clearBottle();
        log.info("clear bottle success");
    }

    // 每10分钟更新一次bottle_state表
    @Scheduled(cron = "0 0/10 * * * ?")
    public void updateBottleState() {
        log.info("update bottle state");
        bottleMapper.updateBottleState();
        log.info("update bottle state success");
    }

}
