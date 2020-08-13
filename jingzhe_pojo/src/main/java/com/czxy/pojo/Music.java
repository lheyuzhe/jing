package com.czxy.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ASUS on 2020/4/1.
 */
@Table(name = "qc_music")
@Data
public class Music {
    @Id
    private Integer mid;
    private String mname;
    private String murl;
    private Integer cid;
    private String mpeo;
    private String minto;
    private String mpeto;
    private String code;

    private Catemusic catemusic;
}
