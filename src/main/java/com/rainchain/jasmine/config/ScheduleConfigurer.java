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
        jackpotService.updateJackpotAvg();
    }

    @Scheduled(cron = "0 0 4 * * ?")
    //每天4点删除相关的漂流瓶
    public void clearBottle() {
        System.out.println(bottleMapper.clearBottle());
    }

}
