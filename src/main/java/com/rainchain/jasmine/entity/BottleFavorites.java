package com.rainchain.jasmine.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @TableName bottle_favorites
 */
@TableName(value = "bottle_favorites")
@Data
public class BottleFavorites implements Serializable {
    /**
     * 收藏人qq号
     */
    @TableId(value = "qq")
    @NotBlank(message = "收藏人qq号不能为空")
    private String qq;

    /**
     * 收藏的瓶子id
     */
    @TableId(value = "id")
    @NotNull(message = "收藏的瓶子id不能为空")
    private Integer id;

    /**
     * 时间戳
     */
    @TableField(value = "timeStamp")
    private Long timeStamp = System.currentTimeMillis() + 28800000L;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}