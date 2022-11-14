package com.rainchain.jasmine.mapper.data;

import com.rainchain.jasmine.entity.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DataMapper {
    Favorconf getFavorconf(String qq);

    void setFavorConf(Favorconf favorconf);

    Adjustconf getAdjustConf(String qq);

    void setAdjustConf(Adjustconf adjustConf);

    Itemconf getItemConf(String qq);

    void setItemConf(Itemconf itemConf);

    Storyconf getStoryConf(String qq);

    void setStoryConf(Storyconf storyConf);

    Tradeconf getTradeConf(String qq);

    void setTradeConf(Tradeconf tradeConf);

}
