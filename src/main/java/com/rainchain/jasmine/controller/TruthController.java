package com.rainchain.jasmine.controller;

import com.rainchain.jasmine.entity.Truth;
import com.rainchain.jasmine.service.TruthService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

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

    @GetMapping("/get")
    public String getTruth(@RequestParam("qq") String qq) {
        return truthService.getTruth(qq);
    }

    @PostMapping("/add")
    public void addTruth(@Valid @RequestBody Truth truth) {
        truthService.addTruth(truth);
    }

    
}
