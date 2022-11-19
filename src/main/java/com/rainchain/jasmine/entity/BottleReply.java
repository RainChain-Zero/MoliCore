package com.rainchain.jasmine.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.io.Serializable;

/**
 * @TableName bottle_reply
 */
@TableName(value = "bottle_reply")
@Data
public class BottleReply implements Serializable {
    /**
     * 回复的id
     */
    @TableId(value = "id")
    @Null(message = "回复的id不能赋值")
    private Integer id;

    /**
     * 漂流瓶的id
     */
    @TableField(value = "bottleId")
    @NotNull(message = "回复的漂流瓶id不能为空")
    private Integer bottleId;

    /**
     * 回复人的qq
     */
    @TableField(value = "qq")
    private String qq;

    /**
     * 回复人的昵称
     */
    @TableField(value = "nick")
    private String nick;

    /**
     * 回复的内容，只能是纯文本
     */
    @TableField(value = "content")
    @NotBlank(message = "回复的内容不能为空")
    private String content;

    /**
     * 0：实名；1：匿名
     */
    @TableField(value = "anonymous")
    private boolean anonymous;

    /**
     * 回复的时间戳
     */
    @TableField(value = "timeStamp")
    private Long timeStamp = System.currentTimeMillis() + 28800000L;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}