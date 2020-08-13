package com.czxy.service;

import com.czxy.mapper.CatemusicMapper;
import com.czxy.pojo.Catemusic;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ASUS on 2020/4/3.
 */
@Service
@Transactional
public class CateMusicService {
    @Resource
    private CatemusicMapper catemusicMapper;

    public List<Catemusic> searchCateMusicList() {
        System.out.println("你是煞笔吗");
        return catemusicMapper.selectAll();
    }
}
