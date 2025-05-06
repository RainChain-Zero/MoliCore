package com.rainchain.jasmine.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @TableName bottle_state
 */
@TableName(value = "bottle_state")
@Data
public class BottleState {
    /**
     * 漂流瓶id
     */
    @TableId(value = "id")
    private Integer id;

    /**
     * 点赞数
     */
    @TableField(value = "good")
    private Integer good;

    /**
     * 点踩数
     */
    @TableField(value = "bad")
    private Integer bad;

    /**
     *
     */
    @TableField(value = "lastUpdated")
    private Long lastUpdated;

}