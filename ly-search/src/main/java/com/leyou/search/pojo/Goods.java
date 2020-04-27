package com.leyou.search.pojo;

import lombok.Data;

import java.lang.annotation.Documented;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@Data
public class Goods {

    private Long id;

    private String all;

    private String subTitle;

    private Long brandId;
    private Long cid1;
    private Long cid2;
    private Long cid3;
    private Date createTime;
    private Set<Long> price;
    private String skus;
    private Map<String,Object> specs;
}
