package com.czxy.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ASUS on 2020/4/1.
 */
@Table(name = "qc_catemusic")
public class Catemusic {
    @Id
    private Integer cid;
    private String cname;

}
