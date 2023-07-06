package com.rainchain.jasmine.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName storyconf
 */
@TableName(value = "storyconf")
@Data
public class Storyconf implements Serializable {
    /**
     *
     */
    @TableId(value = "qq")
    private String qq;

    /**
     * 主要剧情下标
     */
    @TableField(value = "mainIndex")
    private Integer mainIndex;

    /**
     * 章节第几个选项
     */
    @TableField(value = "option")
    private Integer option;

    /**
     * 用户对某选项所做的选择
     */
    @TableField(value = "choice")
    private Integer choice;

    /**
     * 对于当前用户选择的内置剧情下标
     */
    @TableField(value = "choiceIndex")
    private Integer choiceIndex;

    /**
     * 正在阅读的章节，非剧情模式下为-1
     */
    @TableField(value = "storyReadNow")
    private Integer storyReadNow;

    /**
     * 正在阅读的特典：1~n（对每个特典依次编号），-1为非剧情模式
     */
    @TableField(value = "specialReadNow")
    private Integer specialReadNow;

    /**
     * 记录下一个选项的标号（用于跳转） 默认为1，-1为终止标记
     */
    @TableField(value = "nextOption")
    private Integer nextOption;

    /**
     * 需要进入校验（道具）的章节 默认为-1 其他情况为章节数
     */
    @TableField(value = "entryCheckStory")
    private Integer entryCheckStory;

    /**
     * "0000000000000000000000000" 每一位代表章节是否提醒过已经解锁
     */
    @TableField(value = "storyUnlockedNotice")
    private String storyUnlockedNotice;

    /**
     * "0000000000000000000000000"每一位代表对应特典是否已经解锁
     */
    @TableField(value = "specialUnlockedNotice")
    private String specialUnlockedNotice;

    /**
     * 记录用户对某一选项的累计选择情况
     */
    @TableField(value = "choiceSelected0")
    private Integer choiceSelected0;

    /**
     * 序章是否已阅读完成（0/1）
     */
    @TableField(value = "isStory0Read")
    private Integer isStory0Read;

    /**
     * 该特典是否阅读完成 默认为0
     * 该特典是否阅读完成 默认为0
     * 该特典是否阅读完成 默认为0
     */
    @TableField(value = "isSpecial0Read")
    private Integer isSpecial0Read;

    /**
     * 选项3的选择
     */
    @TableField(value = "special0Option3")
    private Integer special0Option3;

    /**
     * 没读完 没有交换卡片 到吃饭就结束为0/若进行 则为1/默认为0
     */
    @TableField(value = "special0Flag")
    private Integer special0Flag;

    /**
     * 是否给茉莉发送信息 0/1
     */
    @TableField(value = "isMessageSent")
    private Integer isMessageSent;

    /**
     * 标记第一章是否解锁
     */
    @TableField(value = "isStory1Unlocked")
    private Integer isStory1Unlocked;

    /**
     * 当前剩余行动轮 默认为4 跳出探索部分后重置为4
     */
    @TableField(value = "actionRoundLeft")
    private Integer actionRoundLeft;

    /**
     * 判定商店是否解锁 0/1 注：为10代表在剧情中触发，标记不可跳过
     */
    @TableField(value = "isShopUnlocked")
    private Integer isShopUnlocked;

    /**
     * 选项1及其子选项的第三选项是否已经选择过**为-1则为未发送**，为10为在第一主选项选择，11为选项1.1,12为选项1.2，以此类推
     */
    @TableField(value = "isStory1Option1Choice3")
    private Integer isStory1Option1Choice3;

    /**
     * 在第二章所作出的选择，0代表未选择
     */
    @TableField(value = "story2Choice")
    private Integer story2Choice;

    /**
     * 第三章是否阅读完毕
     */
    @TableField(value = "isStory3Read")
    private Integer isStory3Read;

    /**
     * 七夕特典是否阅读完毕
     */
    @TableField(value = "isSpecial1Read")
    private Integer isSpecial1Read;

    /**
     * 圣诞特典是否阅读完毕
     */
    @TableField(value = "isSpecial2Read")
    private Integer isSpecial2Read;

    @TableField(value = "isSpecial3Read")
    private Integer isSpecial3Read;

    @TableField(value = "isStory4Read")
    private Integer isStory4Read;

    @TableField(value = "isSpecial4Read")
    private Integer isSpecial4Read;

    @TableField(value = "isSpecial5Read")
    private Integer isSpecial5Read;

    @TableField(value = "isSpecial6Read")
    private Integer isSpecial6Read;

    @TableField(value = "isSpecial7Read")
    private Integer isSpecial7Read;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}