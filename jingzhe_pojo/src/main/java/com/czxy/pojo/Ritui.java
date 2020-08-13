package com.czxy.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by ASUS on 2020/4/3.
 */
@Table(name = "qc_ritui")
@Data
public class Ritui {
    @Id
    private Integer rid;
    private String rname;
    private String rpian;
}
