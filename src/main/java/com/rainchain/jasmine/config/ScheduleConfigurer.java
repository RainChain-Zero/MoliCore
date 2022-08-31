package com.rainchain.jasmine.config;

import com.rainchain.jasmine.service.JackpotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Slf4j
@Configuration
@EnableScheduling
public class ScheduleConfigurer {
    @Autowired
    private JackpotService jackpotService;

    @Scheduled(cron = "0 0 0-23 * * ?")
    //每小时更新奖池的平均价值
    public void updateJackpotAvg() {
        jackpotService.updateJackpotAvg();
    }

}
