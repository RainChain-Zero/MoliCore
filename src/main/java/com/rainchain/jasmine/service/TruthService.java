package com.rainchain.jasmine.service;

import cn.hutool.core.util.StrUtil;
import com.rainchain.jasmine.entity.Truth;
import com.rainchain.jasmine.mapper.amusement.TruthMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2022-11-14 19:30
 */
@Service
public class TruthService {
    @Resource
    private TruthMapper truthMapper;

    public String getTruth(String qq) {
        //获取所有问题
        List<Truth> truthList = truthMapper.getTruth();
        //获取已经回答的问题
        String answeredTruth = truthMapper.getAnsweredTruth(qq);
        if (!StrUtil.isBlank(answeredTruth)) {
            //如果已经回答过问题，就从问题列表中移除
            truthList.removeIf(truth -> answeredTruth.contains("(" + truth.getId() + ")"));
        }
        //随机获取一个问题
        return truthList.get((int) (Math.random() * truthList.size())).getQuestion();
    }

    public void addTruth(Truth truth) {
        truthMapper.addTruth(truth);
    }
}
