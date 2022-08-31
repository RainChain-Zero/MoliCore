package com.rainchain.jasmine.controller;

import com.rainchain.jasmine.entity.Favorconf;
import com.rainchain.jasmine.entity.Itemconf;
import com.rainchain.jasmine.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2022/08/30 23:21
 */

@RestController
public class RankController {
    @Autowired
    private RankService rankService;

    @GetMapping("/getFavorRank")
    public List<Favorconf> getFavorRankNow() {
        return rankService.getFavorRankNow();
    }

    @GetMapping("/getFlRank")
    public List<Itemconf> getFlRankNow() {
        return rankService.getFlRankNow();
    }
}
