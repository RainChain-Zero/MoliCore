package com.rainchain.jasmine.mapper.amusement;

import com.rainchain.jasmine.component.SearchBottleResult;
import com.rainchain.jasmine.entity.Bottle;
import com.rainchain.jasmine.entity.BottleReply;
import com.rainchain.jasmine.entity.BottleThumbs;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2022-11-17 15:52
 */
@Mapper
public interface BottleMapper {
    Bottle pickBottle();

    Bottle pickBottleById(Integer id);

    List<BottleReply> getReply(Integer id);

    void throwBottle(Bottle bottle);

    void comment(BottleReply bottleReply);

    void thumbs(BottleThumbs bottleThumbs);

    String getThumbs(Integer id);

    List<SearchBottleResult> searchBottleByQq(String qq);

    List<SearchBottleResult> searchBottleByReply(String qq);
}
