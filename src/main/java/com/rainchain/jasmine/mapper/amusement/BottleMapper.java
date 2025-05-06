package com.rainchain.jasmine.mapper.amusement;

import com.rainchain.jasmine.component.SearchBottleResult;
import com.rainchain.jasmine.entity.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2022-11-17 15:52
 */
@Mapper
public interface BottleMapper {
    Bottle pickBottle(int offset);

    // 根据权重随机捡瓶子（结合时间因素和贝叶斯平均的权重计算）
    Bottle pickWeightedBottle();

    int getOffset();

    Bottle pickBottleById(Integer id);

    List<BottleReply> getReply(Integer id);

    void throwBottle(Bottle bottle);

    void comment(BottleReply bottleReply);

    void thumbs(BottleThumbs bottleThumbs);

    BottleState getThumbs(Integer id);

    List<SearchBottleResult> searchBottleByQq(String qq);

    List<SearchBottleResult> searchBottleByReply(String qq);

    void collect(BottleFavorites bottleFavorites);

    List<SearchBottleResult> searchBottleByCollect(String qq);

    List<SearchBottleResult> searchByKeywords(List<String> keywords);

    Integer deleteBottle(List<String> admin, String qq, int id);

    void deleteBottleOnly(int id);

    Integer deleteComment(String qq, int id);

    Integer deleteCollect(String qq, int id);

    int getNum();

    int clearBottle();

    void updateBottleState();
}
