package com.rainchain.jasmine.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import java.io.Serializable;

/**
 * @TableName bottle
 */
@TableName(value = "bottle")
@Data
public class Bottle implements Serializable {
    /**
     * 漂流瓶的id
     */
    @TableId(value = "id")
    @Null(message = "漂流瓶的id不能赋值")
    private Integer id;

    /**
     * 0：尸体；1：普通漂流瓶
     */
    @TableField(value = "type")
    private Integer type;

    /**
     * 丢漂流瓶的人
     */
    @TableField(value = "qq")
    private String qq;

    /**
     * 丢漂流瓶的人的昵称
     */
    @TableField(value = "nick")
    private String nick;

    /**
     * 丢漂流瓶的群，私聊时为空
     */
    @TableField(value = "group")
    private String group;

    /**
     * 丢漂流瓶的群名，私聊时为空
     */
    @TableField(value = "groupName")
    private String groupName;

    /**
     * 漂流瓶的内容
     */
    @TableField(value = "content")
    @NotBlank(message = "漂流瓶的内容不能为空")
    private String content;

    /**
     * 0：实名；1：匿名
     */
    @TableField(value = "anonymous")
    private boolean anonymous;

    /**
     * 丢漂流瓶的时间戳
     */
    @TableField(value = "timeStamp")
    private Long timeStamp = System.currentTimeMillis() + 8 * 60 * 60 * 1000L;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}