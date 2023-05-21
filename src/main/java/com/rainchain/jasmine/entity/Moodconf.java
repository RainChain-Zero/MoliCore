package com.rainchain.jasmine.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName moodconf
 */
@TableName(value = "moodconf")
@Data
public class Moodconf implements Serializable {
    /**
     *
     */
    @TableId(value = "qq")
    private String qq;

    /**
     * 心情划分；0：平常；1：好心情；-1：坏心情
     */
    @TableField(value = "mood")
    private Integer mood;

    /**
     * 具体心情
     */
    @TableField(value = "special_mood")
    private String special_mood;

    /**
     * 心情浮动值
     */
    @TableField(value = "float_value")
    private Integer float_value;

    /**
     * 心情系数，影响好感等获取
     */
    @TableField(value = "coefficient")
    private Double coefficient;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}