package com.czxy.service;

import com.czxy.mapper.MusicMapper;
import com.czxy.pojo.Music;
import com.czxy.vo.MusicVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ASUS on 2020/4/1.
 */
@Service
@Transactional
public class MusicService {
    @Resource
    private MusicMapper musicMapper;

    //分页条件查询方法
    public PageInfo<Music> searchMusicPageList(MusicVo musicVo) {
        PageHelper.startPage(musicVo.getPageNum(),musicVo.getPageSize());
        if(musicVo.getMname()!=null&&!"".equals(musicVo.getMname())){
            musicVo.setMname("%"+musicVo.getMname()+"%");
        }
        if(musicVo.getMpeo()!=null&&!"".equals(musicVo.getMpeo())){
            musicVo.setMpeo("%"+musicVo.getMpeo()+"%");
        }
        if(musicVo.getMinto()!=null&&!"".equals(musicVo.getMinto())){
            musicVo.setMinto("%"+musicVo.getMinto()+"%");
        }
        if(musicVo.getMpeto()!=null&&!"".equals(musicVo.getMpeto())){
            musicVo.setMpeto("%"+musicVo.getMpeto()+"%");
        }
        List<Music> mlist = musicMapper.searchMusicPageList(musicVo);
        return new PageInfo<>(mlist);
    }

    public Music searchByIdMusic(Integer mid) {
        return musicMapper.selectByPrimaryKey(mid);
    }

    public void addMusic(Music music) {
        List<Music> mlist = musicMapper.selectAll();
        music.setMid(mlist.size()+1);
        musicMapper.insert(music);
    }

    public void updateMusic(Music music) {
        musicMapper.updateByPrimaryKeySelective(music);
    }

    public void deleteMusic(Integer mid) {
        musicMapper.deleteByPrimaryKey(mid);
    }

    public void pideleteMusic(Integer[] slist) {
        System.out.println("来单挑啊");
        for (Integer s : slist) {
            musicMapper.deleteByPrimaryKey(s);
        }
    }
}
