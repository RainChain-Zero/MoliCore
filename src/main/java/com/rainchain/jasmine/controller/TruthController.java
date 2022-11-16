package com.rainchain.jasmine.controller;

import com.rainchain.jasmine.component.TruthAnswer;
import com.rainchain.jasmine.component.TruthHistoryObj;
import com.rainchain.jasmine.entity.Truth;
import com.rainchain.jasmine.service.TruthService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2022-11-14 19:29
 */

@RestController
@RequestMapping("/truth")
public class TruthController {
    @Resource
    private TruthService truthService;

    @GetMapping("/getTruth")
    public Truth getTruth(@RequestParam("qq") String qq) {
        return truthService.getTruth(qq);
    }

    @PostMapping("/addTruth")
    public void addTruth(@Valid @RequestBody Truth truth) {
        truthService.addTruth(truth);
    }

    @PostMapping("/answerTruth")
    public void answerTruth(@Valid @RequestBody TruthAnswer truthAnswer) {
        truthService.answerTruth(truthAnswer);
    }

    @GetMapping("/getTruthHistory")
    public List<TruthHistoryObj> getTruthHistory(@RequestParam("qq") String qq, @RequestParam("id") Integer id) {
        return truthService.getTruthHistory(qq, id);
    }

    @DeleteMapping("/clearTruthAnswered")
    public void clearTruthAnswered(@RequestParam("qq") String qq) {
        truthService.clearTruthAnswered(qq);
    }

    @GetMapping("/getHistoryList")
    public List<Truth> getHistoryList(@RequestParam("qq") String qq) {
        return truthService.getHistoryList(qq);
    }

}
