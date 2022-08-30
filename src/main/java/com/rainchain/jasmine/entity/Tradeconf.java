package com.rainchain.jasmine.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * @TableName tradeconf
 */
@TableName(value = "tradeconf")
@Data
public class Tradeconf implements Serializable {
    /**
     *
     */
    @TableId(value = "qq")
    @Length(min = 5, max = 10, message = "QQ号非法！")
    private String qq;

    /**
     *
     */
    @TableField(value = "itemRequest")
    private String itemRequest;

    /**
     *
     */
    @TableField(value = "itemRequestNum")
    private Integer itemRequestNum;

    /**
     *
     */
    @TableField(value = "itemReceive")
    private String itemReceive;

    /**
     *
     */
    @TableField(value = "itemReceiveNum")
    private Integer itemReceiveNum;

    /**
     *
     */
    @TableField(value = "tradeReceive")
    private String tradeReceive;

    /**
     *
     */
    @TableField(value = "tradeRequest")
    private String tradeRequest;

    /**
     *
     */
    @TableField(value = "isInGroup")
    private Integer isInGroup;

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
        Tradeconf other = (Tradeconf) that;
        return (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
                && (this.getItemRequest() == null ? other.getItemRequest() == null : this.getItemRequest().equals(other.getItemRequest()))
                && (this.getItemRequestNum() == null ? other.getItemRequestNum() == null : this.getItemRequestNum().equals(other.getItemRequestNum()))
                && (this.getItemReceive() == null ? other.getItemReceive() == null : this.getItemReceive().equals(other.getItemReceive()))
                && (this.getItemReceiveNum() == null ? other.getItemReceiveNum() == null : this.getItemReceiveNum().equals(other.getItemReceiveNum()))
                && (this.getTradeReceive() == null ? other.getTradeReceive() == null : this.getTradeReceive().equals(other.getTradeReceive()))
                && (this.getTradeRequest() == null ? other.getTradeRequest() == null : this.getTradeRequest().equals(other.getTradeRequest()))
                && (this.getIsInGroup() == null ? other.getIsInGroup() == null : this.getIsInGroup().equals(other.getIsInGroup()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getItemRequest() == null) ? 0 : getItemRequest().hashCode());
        result = prime * result + ((getItemRequestNum() == null) ? 0 : getItemRequestNum().hashCode());
        result = prime * result + ((getItemReceive() == null) ? 0 : getItemReceive().hashCode());
        result = prime * result + ((getItemReceiveNum() == null) ? 0 : getItemReceiveNum().hashCode());
        result = prime * result + ((getTradeReceive() == null) ? 0 : getTradeReceive().hashCode());
        result = prime * result + ((getTradeRequest() == null) ? 0 : getTradeRequest().hashCode());
        result = prime * result + ((getIsInGroup() == null) ? 0 : getIsInGroup().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", qq=").append(qq);
        sb.append(", itemRequest=").append(itemRequest);
        sb.append(", itemRequestNum=").append(itemRequestNum);
        sb.append(", itemReceive=").append(itemReceive);
        sb.append(", itemReceiveNum=").append(itemReceiveNum);
        sb.append(", tradeReceive=").append(tradeReceive);
        sb.append(", tradeRequest=").append(tradeRequest);
        sb.append(", isInGroup=").append(isInGroup);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}