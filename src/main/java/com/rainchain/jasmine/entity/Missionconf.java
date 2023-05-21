package com.rainchain.jasmine.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName missionconf
 */
@TableName(value = "missionconf")
@Data
public class Missionconf implements Serializable {
    /**
     *
     */
    @TableId(value = "qq")
    private String qq;

    /**
     * ”好奇“心情所需要的礼物
     */
    @TableField(value = "curiosity_gift")
    private String curiosity_gift;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}