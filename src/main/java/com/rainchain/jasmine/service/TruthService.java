package com.rainchain.jasmine.service;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import com.rainchain.jasmine.component.TruthAnswer;
import com.rainchain.jasmine.component.TruthHistoryObj;
import com.rainchain.jasmine.entity.Truth;
import com.rainchain.jasmine.entity.TruthAnswered;
import com.rainchain.jasmine.entity.TruthHistory;
import com.rainchain.jasmine.mapper.amusement.TruthMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Comparator;
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

    public Truth getTruth(String qq) {
        //获取所有问题
        List<Truth> truthList = truthMapper.getTruth();
        //获取已经回答的问题
        TruthAnswered answeredTruth = truthMapper.getAnsweredTruth(qq);
        if (null != answeredTruth) {
            List<Integer> answeredTruthId = answeredTruth.getAnswered();
            //如果已经回答过问题，就从问题列表中移除
            truthList.removeIf(truth -> answeredTruthId.contains(truth.getId()));
        }
        //随机获取一个问题
        return truthList.size() == 0 ? null : truthList.get((int) (Math.random() * truthList.size()));
    }

    public void addTruth(Truth truth) {
        truthMapper.addTruth(truth);
    }

    public void answerTruth(TruthAnswer truthAnswer) {
        //获取已经回答的问题id
        TruthAnswered answeredTruth = truthMapper.getAnsweredTruth(truthAnswer.getQq());
        //没有已经回答过的历史则创建
        if (null == answeredTruth) {
            answeredTruth = new TruthAnswered(truthAnswer.getQq(), List.of(truthAnswer.getId()));
        } else {
            List<Integer> answeredTruthId = answeredTruth.getAnswered();
            answeredTruthId.add(truthAnswer.getId());
            answeredTruth.setAnswered(answeredTruthId);
        }
        //更新已经回答过的问题id到数据库
        truthMapper.updateTruthAnswered(answeredTruth);

        //是否存在有效回答
        if (StrUtil.isBlank(truthAnswer.getAnswer().replace("{{end}}", ""))) {
            return;
        }
        //获取回答问题历史
        TruthHistory truthHistory = truthMapper.getAnsweredHistory(truthAnswer.getQq(), truthAnswer.getId());
        //没有历史记录则创建
        if (null == truthHistory) {
            truthHistory = new TruthHistory(truthAnswer.getQq(), truthAnswer.getId(),
                    List.of(
                            new TruthHistoryObj(truthAnswer.getAnswer(), System.currentTimeMillis() + 8 * 60 * 60 * 1000L)
                    ));
        } else {
            List<TruthHistoryObj> truthHistoryObjList = truthHistory.getHistory();
            truthHistoryObjList.add(new TruthHistoryObj(truthAnswer.getAnswer(), System.currentTimeMillis() + 8 * 60 * 60 * 1000L));
            truthHistory.setHistory(truthHistoryObjList);
        }
        //将本题回答记录写入数据库
        truthMapper.updateTruthHistory(truthHistory);
    }

    public List<TruthHistoryObj> getTruthHistory(String qq, Integer id) {
        TruthHistory truthHistory = truthMapper.getAnsweredHistory(qq, id);
        return null == truthHistory ? null : truthHistory.getHistory();
    }

    public void clearTruthAnswered(String qq) {
        truthMapper.updateTruthAnswered(new TruthAnswered(qq, List.of()));
    }

    public List<Truth> getHistoryList(String qq) {
        TruthAnswered answeredTruth = truthMapper.getAnsweredTruth(qq);
        if (null == answeredTruth) {
            return null;
        }
        List<Integer> answeredTruthId = answeredTruth.getAnswered();
        if (CollUtil.isEmpty(answeredTruthId)) {
            return null;
        }
        List<Truth> res = truthMapper.getHistoryList(answeredTruthId);
        //按照问题的id升序
        res.sort(Comparator.comparing(Truth::getId));
        return res;
    }
}
