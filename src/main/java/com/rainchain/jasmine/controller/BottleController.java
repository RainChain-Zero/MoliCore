package com.rainchain.jasmine.controller;

import com.rainchain.jasmine.component.SearchBottleResult;
import com.rainchain.jasmine.entity.Bottle;
import com.rainchain.jasmine.entity.BottleReply;
import com.rainchain.jasmine.entity.BottleThumbs;
import com.rainchain.jasmine.service.BottleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author RainChain-Zero
 * @version 1.0
 * @date 2022-11-17 15:51
 */
@RestController
@RequestMapping("/bottle")
public class BottleController {
    @Resource
    private BottleService bottleService;

    @GetMapping("/pick")
    public Bottle pickBottle(@RequestParam(value = "id", required = false) Integer id) {
        return bottleService.pickBottle(id);
    }

    @PostMapping("/throw")
    public void throwBottle(@Valid @RequestBody Bottle bottle) {
        bottleService.throwBottle(bottle);
    }

    @GetMapping("/getReply")
    public List<BottleReply> getReply(@RequestParam("id") Integer id) {
        return bottleService.getReply(id);
    }

    @PostMapping("/comment")
    public void comment(@Valid @RequestBody BottleReply bottleReply) {
        bottleService.comment(bottleReply);
    }

    //返回"赞数,踩数"
    @GetMapping("/getThumbs")
    public String getThumbs(@RequestParam("id") Integer id) {
        return bottleService.getThumbs(id);
    }

    @PostMapping("/giveThumbs")
    public void thumbs(@Valid @RequestBody BottleThumbs bottleThumbs) {
        bottleService.thumbs(bottleThumbs);
    }

    //查找自己丢的瓶子
    @GetMapping("/searchBottleByQq")
    public List<SearchBottleResult> searchBottleByQq(@RequestParam("qq") @NotBlank String qq) {
        return bottleService.searchBottleByQq(qq);
    }

    //查找自己评论的瓶子
    @GetMapping("/searchBottleByReply")
    public List<SearchBottleResult> searchBottleByReply(@RequestParam("qq") String qq) {
        return bottleService.searchBottleByReply(qq);
    }


}
