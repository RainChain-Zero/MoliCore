package com.rainchain.jasmine.controller;

import com.rainchain.jasmine.entity.OmegaPixivArtwork;
import com.rainchain.jasmine.service.MoeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.constraints.Min;
import java.util.List;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2023-04-09 22:35
 */

@RestController
public class MoeController {
    @Resource
    private MoeService moeService;

    @GetMapping("/randomMoe")
    public List<OmegaPixivArtwork> randomMoeByTags(@RequestParam("num") @Min(value = 1) Integer num,
                                                   @RequestParam(value = "tags", required = false) List<String> tags) {
        return moeService.randomMoe(num, tags);
    }
}
