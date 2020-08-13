package com.czxy.controller;

import com.czxy.pojo.Music;
import com.czxy.service.MusicService;
import com.czxy.vo.BaseResult;
import com.czxy.vo.MusicVo;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by ASUS on 2020/4/1.
 */
@RestController
@RequestMapping("/music")
public class MusicController {
    @Resource
    private MusicService musicService;
    //分页条件查询
    @GetMapping("/mpage")
    public BaseResult searchMusicPageList(MusicVo musicVo){
        PageInfo<Music> pageInfo = musicService.searchMusicPageList(musicVo);
        return BaseResult.ok("条件查询成功",pageInfo);
    }

    //根据mid查询音乐信息
    @GetMapping("/mbyid/{mid}")
    public BaseResult searchByIdMusic(@PathVariable Integer mid){
        Music music = musicService.searchByIdMusic(mid);
        return BaseResult.ok("查询音乐信息成功",music);
    }

    //添加音乐
    @PostMapping("/addmu")
    public BaseResult addMusic(@RequestBody Music music){
        musicService.addMusic(music);
        return BaseResult.ok("添加音乐信息成功！");
    }

    //修改音乐
    @PutMapping("/updmu")
    public BaseResult updateMusic(@RequestBody Music music){
        musicService.updateMusic(music);
        return BaseResult.ok("修改音乐信息成功！");
    }

    //删除音乐
    @DeleteMapping("/delmu/{mid}")
    public BaseResult deleteMusic(@PathVariable Integer mid){
        musicService.deleteMusic(mid);
        return BaseResult.ok("删除音乐成功！");
    }

    //批量删除音乐
    @DeleteMapping("/pidmu/{pmid}")
    public BaseResult pideleteMusic(@PathVariable String pmid){
        String[] slist = pmid.split(",");
        musicService.pideleteMusic(slist);
        return BaseResult.ok("批量删除音乐成功！");
    }
}
