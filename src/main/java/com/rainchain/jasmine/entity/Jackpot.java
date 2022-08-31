package com.rainchain.jasmine.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @TableName jackpot
 */
@TableName(value = "jackpot")
@Data
public class Jackpot implements Serializable {
    /**
     * 物品数量
     */
    @TableField(value = "num")
    @Min(value = 1, message = "至少放入一个该物品")
    private Integer num;

    /**
     * 物品名
     */
    @TableField(value = "name")
    @NotBlank(message = "需要输入正确的物品名")
    private String name;

    /**
     * 物品价值
     */
    @TableField(value = "price")
    @Min(value = 20, message = "放入的物品总价值必须≥20FL")
    private Integer price;

    /*
     * Response，抽奖产生的额外fl变化
     * */
    private Integer flChange = 0;

    /*
     * Response，当前奖池的价值平均
     * */
    private Double avg;

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
        Jackpot other = (Jackpot) that;
        return (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
                && (this.getFlChange() == null ? other.getFlChange() == null : this.getFlChange().equals(other.getFlChange()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getFlChange() == null) ? 0 : getFlChange().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", num=").append(num);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", flChange=").append(flChange);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}