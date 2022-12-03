package com.rainchain.jasmine.controller;

import com.rainchain.jasmine.component.SearchBottleResult;
import com.rainchain.jasmine.entity.Bottle;
import com.rainchain.jasmine.entity.BottleFavorites;
import com.rainchain.jasmine.entity.BottleReply;
import com.rainchain.jasmine.entity.BottleThumbs;
import com.rainchain.jasmine.service.BottleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.Map;

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
    private final List<String> admin = List.of("3032902237", "2677409596", "2595928998", "839968342", "751766424", "1298754454");

    @GetMapping("/pick")
    public Bottle pickBottle(@RequestParam(value = "id", required = false) Integer id) {
        return bottleService.pickBottle(id);
    }

    @PostMapping("/jumpSea")
    public int jumpSea(@RequestBody @Valid Bottle bottle) {
        return bottleService.jumpSea(bottle);
    }

    @PostMapping("/throw")
    public int throwBottle(@Valid @RequestBody Bottle bottle) {
        return bottleService.throwBottle(bottle);
    }

    //删除瓶子（瓶子主人和管理员可以删除）
    @DeleteMapping("/deleteBottle")
    private Integer deleteBottle(@RequestBody Map<String, String> map) {
        return bottleService.deleteBottle(admin, map.get("qq"), Integer.parseInt(map.get("id")));
    }

    @GetMapping("/getComment")
    public List<BottleReply> getReply(@RequestParam("id") Integer id) {
        return bottleService.getReply(id);
    }

    @PostMapping("/comment")
    public void comment(@Valid @RequestBody BottleReply bottleReply) {
        bottleService.comment(bottleReply);
    }

    //删除评论（只能删除自己的评论）
    @DeleteMapping("/deleteComment")
    public Integer deleteComment(@RequestBody Map<String, String> map) {
        return bottleService.deleteComment(admin, map.get("qq"), Integer.parseInt(map.get("id")));
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

    //查找自己收藏的瓶子
    @GetMapping("/searchBottleByCollect")
    public List<SearchBottleResult> searchBottleByCollect(@RequestParam("qq") String qq) {
        return bottleService.searchBottleByCollect(qq);
    }

    //收藏瓶子
    @PostMapping("/collect")
    public void collect(@Valid @RequestBody BottleFavorites bottleFavorites) {
        bottleService.collect(bottleFavorites);
    }

    @DeleteMapping("/deleteCollect")
    public Integer deleteCollect(@RequestBody Map<String, String> map) {
        return bottleService.deleteCollect(map.get("qq"), Integer.parseInt(map.get("id")));
    }

    @GetMapping("/searchByKeywords")
    public List<SearchBottleResult> searchByKeywords(@RequestParam("key") List<String> keywords) {
        return bottleService.searchByKeywords(keywords);
    }
}
