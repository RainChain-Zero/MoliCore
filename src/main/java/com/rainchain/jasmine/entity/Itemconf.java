package com.rainchain.jasmine.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * @TableName itemconf
 */
@TableName(value = "itemconf")
@Data
public class Itemconf implements Serializable {

    @TableId(value = "qq")
    @Length(min = 5, max = 10, message = "QQ号非法！")
    private String qq;

    @TableField(value = "fl")
    private Integer fl;

    @TableField(value = "梦的开始", exist = true)
    private Integer 梦的开始;

    @TableField(value = "未言的期待", exist = true)
    private Integer 未言的期待;

    @TableField(value = "永恒之戒", exist = true)
    private Integer 永恒之戒;

    @TableField(value = "八音盒", exist = true)
    private Integer 八音盒;

    @TableField(value = "星幕投影灯", exist = true)
    private Integer 星幕投影灯;

    @TableField(value = "野餐篮", exist = true)
    private Integer 野餐篮;

    @TableField(value = "折叠伞", exist = true)
    private Integer 折叠伞;

    @TableField(value = "风车发饰", exist = true)
    private Integer 风车发饰;

    @TableField(value = "雪花糖", exist = true)
    private Integer 雪花糖;

    @TableField(value = "袋装曲奇", exist = true)
    private Integer 袋装曲奇;

    @TableField(value = "快乐水", exist = true)
    private Integer 快乐水;

    @TableField(value = "pocky")
    private Integer pocky;

    @TableField(value = "彩虹糖", exist = true)
    private Integer 彩虹糖;

    @TableField(value = "推理小说", exist = true)
    private Integer 推理小说;

    @TableField(value = "牛奶", exist = true)
    private Integer 牛奶;

    @TableField(value = "冰激凌", exist = true)
    private Integer 冰激凌;

    @TableField(value = "可颂", exist = true)
    private Integer 可颂;

    @TableField(value = "巧克力", exist = true)
    private Integer 巧克力;

    @TableField(value = "发簪", exist = true)
    private Integer 发簪;

    @TableField(value = "寿司", exist = true)
    private Integer 寿司;


    @TableField(value = "薯片", exist = true)
    private Integer 薯片;

    @TableField(value = "定制reply", exist = true)
    private Integer 定制reply;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

}