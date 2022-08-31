package com.rainchain.jasmine.service;

import com.rainchain.jasmine.entity.Favorconf;
import com.rainchain.jasmine.entity.Itemconf;
import com.rainchain.jasmine.mapper.RankMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2022/08/30 23:21
 */

@Service
public class RankService {
    @Autowired
    private RankMapper rankMapper;

    public List<Favorconf> getFavorRankNow() {
        return rankMapper.getFavorRankNow();
    }

    public List<Itemconf> getFlRankNow() {
        return rankMapper.getFlRankNow();
    }
}
