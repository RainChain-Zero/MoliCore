package com.rainchain.jasmine.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @TableName truth_answered
 */
@TableName(value = "truth_answered")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TruthAnswered implements Serializable {
    /**
     * 回答者的qq
     */
    @TableId(value = "qq")
    private String qq;

    /**
     * 已回答的问题id的List的json
     */
    @TableField(value = "answered", typeHandler = FastjsonTypeHandler.class)
    private List<Integer> answered;

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
        TruthAnswered other = (TruthAnswered) that;
        return (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
                && (this.getAnswered() == null ? other.getAnswered() == null : this.getAnswered().equals(other.getAnswered()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getAnswered() == null) ? 0 : getAnswered().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", qq=").append(qq);
        sb.append(", answered=").append(answered);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}