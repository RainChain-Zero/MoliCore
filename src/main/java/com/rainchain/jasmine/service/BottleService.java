package com.rainchain.jasmine.service;

import com.rainchain.jasmine.component.SearchBottleResult;
import com.rainchain.jasmine.entity.*;
import com.rainchain.jasmine.exception.OperationFailException;
import com.rainchain.jasmine.mapper.amusement.BottleMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2022-11-17 15:51
 */
@Service
public class BottleService {
    @Resource
    private BottleMapper bottleMapper;

    public Bottle pickBottle(Integer id, boolean random) {
        // 根据条件选择合适的漂流瓶
        Bottle bottle = id != null
                // 优先根据ID获取指定瓶子
                ? bottleMapper.pickBottleById(id)
                : random
                //  完全随机
                ? bottleMapper.pickBottle(bottleMapper.getOffset())
                // 根据权重随机选择
                : bottleMapper.pickWeightedBottle();

        // 如果捡到"尸体"(type=0)类型的漂流瓶，自动删除
        if (bottle != null && bottle.getType() == 0) {
            bottleMapper.deleteBottleOnly(bottle.getId());
        }

        return bottle;
    }

    public List<BottleReply> getReply(Integer id) {
        return bottleMapper.getReply(id);
    }

    public int throwBottle(Bottle bottle) {
        bottleMapper.throwBottle(bottle);
        return bottle.getId();
    }

    public void comment(BottleReply bottleReply) {
        if (null == bottleMapper.pickBottleById(bottleReply.getBottleId())) {
            throw new OperationFailException("诶？该漂流瓶不存在哦？");
        }
        bottleMapper.comment(bottleReply);
    }

    public void thumbs(BottleThumbs bottleThumbs) {
        if (null == bottleMapper.pickBottleById(bottleThumbs.getId())) {
            throw new OperationFailException("诶？该漂流瓶不存在哦？");
        }
        bottleMapper.thumbs(bottleThumbs);
    }

    public BottleState getThumbs(Integer id) {
        return bottleMapper.getThumbs(id);
    }

    public List<SearchBottleResult> searchBottleByQq(String qq) {
        return bottleMapper.searchBottleByQq(qq);
    }

    public List<SearchBottleResult> searchBottleByReply(String qq) {
        return bottleMapper.searchBottleByReply(qq);
    }

    public void collect(BottleFavorites bottleFavorites) {
        if (null == bottleMapper.pickBottleById(bottleFavorites.getId())) {
            throw new OperationFailException("诶？该漂流瓶不存在哦？");
        }
        bottleMapper.collect(bottleFavorites);
    }

    public List<SearchBottleResult> searchBottleByCollect(String qq) {
        return bottleMapper.searchBottleByCollect(qq);
    }

    public List<SearchBottleResult> searchByKeywords(List<String> keywords) {
        return bottleMapper.searchByKeywords(keywords);
    }

    public Integer deleteBottle(List<String> admin, String qq, int id) {
        return bottleMapper.deleteBottle(admin, qq, id);
    }

    public Integer deleteComment(String qq, int id) {
        return bottleMapper.deleteComment(qq, id);
    }

    public Integer deleteCollect(String qq, int id) {
        return bottleMapper.deleteCollect(qq, id);
    }


    public int jumpSea(Bottle bottle) {
        bottleMapper.throwBottle(bottle);
        return bottleMapper.getNum();
    }
}
