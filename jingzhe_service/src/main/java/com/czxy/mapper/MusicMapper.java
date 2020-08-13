package com.czxy.mapper;

import com.czxy.pojo.Music;
import com.czxy.vo.MusicVo;
import org.apache.ibatis.annotations.*;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by ASUS on 2020/4/1.
 */
@org.apache.ibatis.annotations.Mapper
public interface MusicMapper extends Mapper<Music> {

    //分页条件查询
    @Select("<script>select * from qc_music where 1=1"+
            "<if test=\"musicVo.cid != null\">and cid = #{musicVo.cid}</if>"+
            "<if test=\"musicVo.mname != null and musicVo.mname !=''\">and mname like #{musicVo.mname}</if>"+
            "<if test=\"musicVo.mpeo != null and musicVo.mpeo !=''\">or mpeo like #{musicVo.mpeo}</if>"+
            "<if test=\"musicVo.minto != null and musicVo.minto !=''\">or minto like #{musicVo.minto}</if>"+
            "<if test=\"musicVo.mpeto != null and musicVo.mpeto !=''\">or mpeto like #{musicVo.mpeto}</if>"+
            "</script>")
    @Results(value = {
            @Result(property = "cid",column = "cid"),
            @Result(property = "catemusic",one = @One(select = "com.czxy.mapper.CatemusicMapper.selectByPrimaryKey"), column = "cid")
    })
    List<Music> searchMusicPageList(@Param("musicVo") MusicVo musicVo);
}
