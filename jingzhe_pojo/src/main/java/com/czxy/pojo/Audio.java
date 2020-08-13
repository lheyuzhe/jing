package com.czxy.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ASUS on 2020/4/3.
 */
@Table(name = "qc_audio")
public class Audio implements Cloneable{
    @Id
    private Integer aid;
    private String aname;
    private String amige;

}
