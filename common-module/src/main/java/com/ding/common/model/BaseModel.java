package com.ding.common.model;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @program: manager
 * @description: 基础模型,定义为抽象类,防止该类对象创建,设为public可被继承实现
 * @author: DingCong
 * @create: 2018-11-29 14:11
 **/
@Data
public abstract class BaseModel implements Serializable{

    /**
     * 主键id
     */
    private Long id;

    /**
     * 创建日期
     */
    private Date createDate;

    /**
     * 更新日期
     */
    private Timestamp updateDate;
}
