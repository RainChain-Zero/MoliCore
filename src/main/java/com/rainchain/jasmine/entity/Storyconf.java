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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Storyconf other = (Storyconf) that;
        return (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
                && (this.getMainIndex() == null ? other.getMainIndex() == null : this.getMainIndex().equals(other.getMainIndex()))
                && (this.getOption() == null ? other.getOption() == null : this.getOption().equals(other.getOption()))
                && (this.getChoice() == null ? other.getChoice() == null : this.getChoice().equals(other.getChoice()))
                && (this.getChoiceIndex() == null ? other.getChoiceIndex() == null : this.getChoiceIndex().equals(other.getChoiceIndex()))
                && (this.getStoryReadNow() == null ? other.getStoryReadNow() == null : this.getStoryReadNow().equals(other.getStoryReadNow()))
                && (this.getSpecialReadNow() == null ? other.getSpecialReadNow() == null : this.getSpecialReadNow().equals(other.getSpecialReadNow()))
                && (this.getNextOption() == null ? other.getNextOption() == null : this.getNextOption().equals(other.getNextOption()))
                && (this.getEntryCheckStory() == null ? other.getEntryCheckStory() == null : this.getEntryCheckStory().equals(other.getEntryCheckStory()))
                && (this.getStoryUnlockedNotice() == null ? other.getStoryUnlockedNotice() == null : this.getStoryUnlockedNotice().equals(other.getStoryUnlockedNotice()))
                && (this.getSpecialUnlockedNotice() == null ? other.getSpecialUnlockedNotice() == null : this.getSpecialUnlockedNotice().equals(other.getSpecialUnlockedNotice()))
                && (this.getChoiceSelected0() == null ? other.getChoiceSelected0() == null : this.getChoiceSelected0().equals(other.getChoiceSelected0()))
                && (this.getIsStory0Read() == null ? other.getIsStory0Read() == null : this.getIsStory0Read().equals(other.getIsStory0Read()))
                && (this.getIsSpecial0Read() == null ? other.getIsSpecial0Read() == null : this.getIsSpecial0Read().equals(other.getIsSpecial0Read()))
                && (this.getSpecial0Option3() == null ? other.getSpecial0Option3() == null : this.getSpecial0Option3().equals(other.getSpecial0Option3()))
                && (this.getSpecial0Flag() == null ? other.getSpecial0Flag() == null : this.getSpecial0Flag().equals(other.getSpecial0Flag()))
                && (this.getIsMessageSent() == null ? other.getIsMessageSent() == null : this.getIsMessageSent().equals(other.getIsMessageSent()))
                && (this.getIsStory1Unlocked() == null ? other.getIsStory1Unlocked() == null : this.getIsStory1Unlocked().equals(other.getIsStory1Unlocked()))
                && (this.getActionRoundLeft() == null ? other.getActionRoundLeft() == null : this.getActionRoundLeft().equals(other.getActionRoundLeft()))
                && (this.getIsShopUnlocked() == null ? other.getIsShopUnlocked() == null : this.getIsShopUnlocked().equals(other.getIsShopUnlocked()))
                && (this.getIsStory1Option1Choice3() == null ? other.getIsStory1Option1Choice3() == null : this.getIsStory1Option1Choice3().equals(other.getIsStory1Option1Choice3()))
                && (this.getStory2Choice() == null ? other.getStory2Choice() == null : this.getStory2Choice().equals(other.getStory2Choice()))
                && (this.getIsStory3Read() == null ? other.getIsStory3Read() == null : this.getIsStory3Read().equals(other.getIsStory3Read()))
                && (this.getIsSpecial1Read() == null ? other.getIsSpecial1Read() == null : this.getIsSpecial1Read().equals(other.getIsSpecial1Read()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getMainIndex() == null) ? 0 : getMainIndex().hashCode());
        result = prime * result + ((getOption() == null) ? 0 : getOption().hashCode());
        result = prime * result + ((getChoice() == null) ? 0 : getChoice().hashCode());
        result = prime * result + ((getChoiceIndex() == null) ? 0 : getChoiceIndex().hashCode());
        result = prime * result + ((getStoryReadNow() == null) ? 0 : getStoryReadNow().hashCode());
        result = prime * result + ((getSpecialReadNow() == null) ? 0 : getSpecialReadNow().hashCode());
        result = prime * result + ((getNextOption() == null) ? 0 : getNextOption().hashCode());
        result = prime * result + ((getEntryCheckStory() == null) ? 0 : getEntryCheckStory().hashCode());
        result = prime * result + ((getStoryUnlockedNotice() == null) ? 0 : getStoryUnlockedNotice().hashCode());
        result = prime * result + ((getSpecialUnlockedNotice() == null) ? 0 : getSpecialUnlockedNotice().hashCode());
        result = prime * result + ((getChoiceSelected0() == null) ? 0 : getChoiceSelected0().hashCode());
        result = prime * result + ((getIsStory0Read() == null) ? 0 : getIsStory0Read().hashCode());
        result = prime * result + ((getIsSpecial0Read() == null) ? 0 : getIsSpecial0Read().hashCode());
        result = prime * result + ((getSpecial0Option3() == null) ? 0 : getSpecial0Option3().hashCode());
        result = prime * result + ((getSpecial0Flag() == null) ? 0 : getSpecial0Flag().hashCode());
        result = prime * result + ((getIsMessageSent() == null) ? 0 : getIsMessageSent().hashCode());
        result = prime * result + ((getIsStory1Unlocked() == null) ? 0 : getIsStory1Unlocked().hashCode());
        result = prime * result + ((getActionRoundLeft() == null) ? 0 : getActionRoundLeft().hashCode());
        result = prime * result + ((getIsShopUnlocked() == null) ? 0 : getIsShopUnlocked().hashCode());
        result = prime * result + ((getIsStory1Option1Choice3() == null) ? 0 : getIsStory1Option1Choice3().hashCode());
        result = prime * result + ((getStory2Choice() == null) ? 0 : getStory2Choice().hashCode());
        result = prime * result + ((getIsStory3Read() == null) ? 0 : getIsStory3Read().hashCode());
        result = prime * result + ((getIsSpecial1Read() == null) ? 0 : getIsSpecial1Read().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", qq=").append(qq);
        sb.append(", mainIndex=").append(mainIndex);
        sb.append(", option=").append(option);
        sb.append(", choice=").append(choice);
        sb.append(", choiceIndex=").append(choiceIndex);
        sb.append(", storyReadNow=").append(storyReadNow);
        sb.append(", specialReadNow=").append(specialReadNow);
        sb.append(", nextOption=").append(nextOption);
        sb.append(", entryCheckStory=").append(entryCheckStory);
        sb.append(", storyUnlockedNotice=").append(storyUnlockedNotice);
        sb.append(", specialUnlockedNotice=").append(specialUnlockedNotice);
        sb.append(", choiceSelected0=").append(choiceSelected0);
        sb.append(", isStory0Read=").append(isStory0Read);
        sb.append(", isSpecial0Read=").append(isSpecial0Read);
        sb.append(", special0Option3=").append(special0Option3);
        sb.append(", special0Flag=").append(special0Flag);
        sb.append(", isMessageSent=").append(isMessageSent);
        sb.append(", isStory1Unlocked=").append(isStory1Unlocked);
        sb.append(", actionRoundLeft=").append(actionRoundLeft);
        sb.append(", isShopUnlocked=").append(isShopUnlocked);
        sb.append(", isStory1Option1Choice3=").append(isStory1Option1Choice3);
        sb.append(", story2Choice=").append(story2Choice);
        sb.append(", isStory3Read=").append(isStory3Read);
        sb.append(", isSpecial1Read=").append(isSpecial1Read);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}