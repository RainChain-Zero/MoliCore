package com.rainchain.jasmine.controller;

import com.rainchain.jasmine.entity.*;
import com.rainchain.jasmine.service.DataService;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class DataController {
    @Autowired
    private DataService dataService;

    @GetMapping("/getAdjustConf/{qq}")
    public Adjustconf getAdjustConf(@PathVariable("qq") @Length(min = 5, max = 10, message = "QQ号非法！") String qq) {
        return dataService.getAdjustConf(qq);
    }

    @PostMapping("/setAdjustConf")
    public void setAdjustConf(@RequestBody @Validated Adjustconf adjustConf) {
        dataService.setAdjustConf(adjustConf);
    }

    @GetMapping("/getFavor/{qq}")
    public Integer getFavor(@PathVariable("qq") @Length(min = 5, max = 10, message = "QQ号非法！") String qq) {
        return dataService.getFavor(qq);
    }

    @GetMapping("/getFavorConf/{qq}")
    public Favorconf getFavorConf(@PathVariable("qq") @Length(min = 5, max = 10, message = "QQ号非法！") String qq) {
        return dataService.getFavorConf(qq);
    }

    @PostMapping("/setFavorConf")
    public void setFavorConf(@RequestBody @Validated Favorconf favorconf) {
        dataService.setFavorConf(favorconf);
    }

    @GetMapping("/getItemConf/{qq}")
    public Itemconf getItemConf(@PathVariable("qq") @Length(min = 5, max = 10, message = "QQ号非法！") String qq) {
        return dataService.getItemConf(qq);
    }

    @PostMapping("/setItemConf")
    public void setItemConf(@RequestBody @Validated Itemconf itemConf) {
        dataService.setItemConf(itemConf);
    }

    @GetMapping("/getStoryConf/{qq}")
    public Storyconf getStoryConf(@PathVariable("qq") @Length(min = 5, max = 10, message = "QQ号非法！") String qq) {
        return dataService.getStoryConf(qq);
    }

    @PostMapping("/setStoryConf")
    public void setStoryConf(@RequestBody @Validated Storyconf storyConf) {
        dataService.setStoryConf(storyConf);
    }

    @GetMapping("/getTradeConf/{qq}")
    public Tradeconf getTradeConf(@PathVariable("qq") @Length(min = 5, max = 10, message = "QQ号非法！") String qq) {
        return dataService.getTradeConf(qq);
    }

    @PostMapping("/setTradeConf")
    public void setTradeConf(@RequestBody @Validated Tradeconf tradeConf) {
        dataService.setTradeConf(tradeConf);
    }

    @GetMapping("/getMoodConf/{qq}")
    public Moodconf getMoodConf(@PathVariable("qq") @Length(min = 5, max = 10, message = "QQ号非法！") String qq) {
        return dataService.getMoodConf(qq);
    }

    @PostMapping("/setMoodConf")
    public void setMoodConf(@RequestBody @Validated Moodconf moodConf) {
        dataService.setMoodConf(moodConf);
    }

    @GetMapping("/getMissionConf/{qq}")
    public Missionconf getMissionConf(@PathVariable("qq") @Length(min = 5, max = 10, message = "QQ号非法！") String qq) {
        return dataService.getMissionConf(qq);
    }

    @PostMapping("/setMissionConf")
    public void setMissionConf(@RequestBody @Validated Missionconf missionConf) {
        dataService.setMissionConf(missionConf);
    }
}
