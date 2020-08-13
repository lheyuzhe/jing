package com.czxy.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ASUS on 2020/4/1.
 */
@Table(name = "qc_catemusic")
@Data
public class Catemusic {
    @Id
    private Integer cid;
    private String cname;

}
