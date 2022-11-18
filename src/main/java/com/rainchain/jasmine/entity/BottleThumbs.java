package com.rainchain.jasmine.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @TableName bottle_thumbs
 */
@TableName(value = "bottle_thumbs")
@Data
public class BottleThumbs implements Serializable {
    /**
     * 操作人QQ号
     */
    @TableId(value = "qq")
    @NotBlank(message = "操作人QQ号不能为空")
    private String qq;

    /**
     * 漂流瓶id
     */
    @TableId(value = "id")
    @NotNull(message = "漂流瓶id不能为空")
    private Integer id;

    /**
     * 0：踩；1：赞
     */
    @TableField(value = "thumbsUp")
    private boolean thumbsUp;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}