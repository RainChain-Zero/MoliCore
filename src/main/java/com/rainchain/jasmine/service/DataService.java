package com.rainchain.jasmine.service;

import com.rainchain.jasmine.entity.*;
import com.rainchain.jasmine.mapper.DataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService {
    @Autowired
    private DataMapper dataMapper;

    public Adjustconf getAdjustConf(String qq) {
        return dataMapper.getAdjustConf(qq);
    }

    public void setAdjustConf(Adjustconf adjustConf) {
        dataMapper.setAdjustConf(adjustConf);
    }

    public Integer getFavor(String qq) {
        Favorconf favorconf = dataMapper.getFavorconf(qq);
        return favorconf != null ? favorconf.getFavor() : null;
    }

    public Favorconf getFavorConf(String qq) {
        return dataMapper.getFavorconf(qq);
    }

    public void setFavorConf(Favorconf favorconf) {
        dataMapper.setFavorConf(favorconf);
    }

    public Itemconf getItemConf(String qq) {
        return dataMapper.getItemConf(qq);
    }

    public void setItemConf(Itemconf itemConf) {
        dataMapper.setItemConf(itemConf);
    }

    public Storyconf getStoryConf(String qq) {
        return dataMapper.getStoryConf(qq);
    }

    public void setStoryConf(Storyconf storyConf) {
        dataMapper.setStoryConf(storyConf);
    }

    public Tradeconf getTradeConf(String qq) {
        return dataMapper.getTradeConf(qq);
    }

    public void setTradeConf(Tradeconf tradeConf) {
        dataMapper.setTradeConf(tradeConf);
    }
}
