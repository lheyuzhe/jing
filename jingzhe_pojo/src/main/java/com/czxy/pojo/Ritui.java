package com.czxy.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ASUS on 2020/4/3.
 */
@Table(name = "qc_ritui")
public class Ritui {
    @Id
    private Integer rid;
    private String rname;
    private String rpian;
}
