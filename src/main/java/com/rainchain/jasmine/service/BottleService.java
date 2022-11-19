package com.rainchain.jasmine.service;

import com.rainchain.jasmine.component.SearchBottleResult;
import com.rainchain.jasmine.entity.Bottle;
import com.rainchain.jasmine.entity.BottleFavorites;
import com.rainchain.jasmine.entity.BottleReply;
import com.rainchain.jasmine.entity.BottleThumbs;
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

    public Bottle pickBottle(Integer id) {
        return null == id ? bottleMapper.pickBottle(bottleMapper.getOffset()) : bottleMapper.pickBottleById(id);
    }

    public List<BottleReply> getReply(Integer id) {
        return bottleMapper.getReply(id);
    }

    public void throwBottle(Bottle bottle) {
        bottleMapper.throwBottle(bottle);
    }

    public void comment(BottleReply bottleReply) {
        bottleMapper.comment(bottleReply);
    }

    public void thumbs(BottleThumbs bottleThumbs) {
        bottleMapper.thumbs(bottleThumbs);
    }

    public String getThumbs(Integer id) {
        return bottleMapper.getThumbs(id);
    }

    public List<SearchBottleResult> searchBottleByQq(String qq) {
        return bottleMapper.searchBottleByQq(qq);
    }

    public List<SearchBottleResult> searchBottleByReply(String qq) {
        return bottleMapper.searchBottleByReply(qq);
    }

    public void collect(BottleFavorites bottleFavorites) {
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

    public Integer deleteComment(List<String> admin, String qq, int id) {
        return bottleMapper.deleteComment(admin, qq, id);
    }
}
