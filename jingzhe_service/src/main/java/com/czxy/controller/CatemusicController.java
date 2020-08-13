package com.czxy.controller;

import com.czxy.pojo.Catemusic;
import com.czxy.service.CateMusicService;
import com.czxy.vo.BaseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ASUS on 2020/4/3.
 */
@RestController
@RequestMapping("/catem")
public class CatemusicController {
    @Resource
    private CateMusicService cateMusicService;

    @GetMapping("/serca")
    public BaseResult searchCateMusicList(){
        List<Catemusic> clist = cateMusicService.searchCateMusicList();
        return BaseResult.ok("查询成功",clist);
    }
}
