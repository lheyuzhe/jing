package com.czxy.controller;

import com.czxy.pojo.Audio;
import com.czxy.service.AudioService;
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
@RequestMapping("/audio")
public class AudioController {
    @Resource
    private AudioService audioService;

    @GetMapping("/saudi")
    public BaseResult searchAudioList(){
        List<Audio> alist = audioService.searchAudioList();
        return BaseResult.ok("查询成功",alist);
    }
}
