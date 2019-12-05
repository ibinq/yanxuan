package com.yanxuanproject.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author ZhouBing
 * @Date 2019/12/5 14:35
 * @Version 1.0
 **/
@Data
public class Address {
    private Integer id;
    private Integer userId;
    private String  receiverName;
    private String  receiverPhone;
    private String  receiverProvince;
    private String  receiverCity;
    private String  receiverDistrict;
    private String  receiverAddress;
    private String  receiverStreet;
    private Integer defaultAddress;//默认地址 0 是默认地址 1 不是
    private String  createTime;
    private String  updateTime;
}
