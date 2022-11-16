package com.rainchain.jasmine.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.Null;
import java.io.Serializable;

/**
 * @TableName truth
 */
@TableName(value = "truth")
@Data
public class Truth implements Serializable {
    /**
     * 问题id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @Null(message = "不可以对问题id进行赋值")
    private Integer id;

    /**
     * 提问者：昵称（qq号）
     */
    @TableField(value = "questioner")
    private String questioner;

    /**
     * 提出的问题
     */
    @TableField(value = "question")
    private String question;

    /**
     * 提出的时间戳
     */
    @TableField(value = "timeStamp")
    private Long timeStamp = System.currentTimeMillis() + 8 * 60 * 60 * 1000L;

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
        Truth other = (Truth) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getQuestioner() == null ? other.getQuestioner() == null : this.getQuestioner().equals(other.getQuestioner()))
                && (this.getQuestion() == null ? other.getQuestion() == null : this.getQuestion().equals(other.getQuestion()))
                && (this.getTimeStamp() == null ? other.getTimeStamp() == null : this.getTimeStamp().equals(other.getTimeStamp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getQuestioner() == null) ? 0 : getQuestioner().hashCode());
        result = prime * result + ((getQuestion() == null) ? 0 : getQuestion().hashCode());
        result = prime * result + ((getTimeStamp() == null) ? 0 : getTimeStamp().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", questioner=").append(questioner);
        sb.append(", question=").append(question);
        sb.append(", timeStamp=").append(timeStamp);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}