package com.czxy.service;

import com.czxy.mapper.RituiMapper;
import com.czxy.pojo.Ritui;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

/**
 * Created by ASUS on 2020/4/3.
 */
@Service
@Transactional
public class RituiService {
    @Resource
    private RituiMapper rituiMapper;

    public Ritui SuiRitui(){
        Random r = new Random();
        List<Ritui> rlist = rituiMapper.selectAll();
        int rs = rlist.size()-1;
        int hear = r.nextInt(rs);
        return rlist.get(hear);
    }
}
