package com.czxy.controller;

import com.czxy.pojo.Ritui;
import com.czxy.service.RituiService;
import com.czxy.vo.BaseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by ASUS on 2020/4/3.
 */
@RestController
@RequestMapping("/ritui")
public class RituiController {
    @Resource
    private RituiService rituiService;

    @GetMapping("/srtui")
    public BaseResult searchRituiHear(){
        Ritui ritui = rituiService.SuiRitui();
        return BaseResult.ok("查询成功",ritui);
    }
}
