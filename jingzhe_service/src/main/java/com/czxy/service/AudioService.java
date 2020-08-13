package com.czxy.service;

import com.czxy.mapper.AudioMapper;
import com.czxy.pojo.Audio;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ASUS on 2020/4/3.
 */
@Service
@Transactional
public class AudioService {
    @Resource
    private AudioMapper audioMapper;

    public List<Audio> searchAudioList() {
        return audioMapper.selectAll();
    }
}
