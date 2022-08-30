package com.rainchain.jasmine.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * @TableName adjustconf
 */
@TableName(value = "adjustconf")
@Data
public class Adjustconf implements Serializable {
    /**
     *
     */
    @TableId(value = "qq")
    @Length(min = 5, max = 10, message = "QQ号非法！")
    private String qq;

    /**
     * 曲奇到期时间（秒）
     */
    @TableField(value = "addFavorDDL_Cookie")
    private Integer addFavorDDL_Cookie;

    /**
     * 曲奇到期标记
     */
    @TableField(value = "addFavorDDLFlag_Cookie")
    private Integer addFavorDDLFlag_Cookie;

    /**
     * 时间惩罚减免率
     */
    @TableField(value = "favorTimePunishDownRate")
    private Integer favorTimePunishDownRate;

    /**
     * 时间惩罚减免到期时间（秒）
     */
    @TableField(value = "favorTimePunishDownDDL")
    private Integer favorTimePunishDownDDL;

    /**
     * 时间惩罚减免到期标记
     */
    @TableField(value = "favorTimePunishDownDDLFlag")
    private Integer favorTimePunishDownDDLFlag;

    /**
     * 发簪到期时间（秒）
     */
    @TableField(value = "addFavorPerActionDDL_Hairpin")
    private Integer addFavorPerActionDDL_Hairpin;

    /**
     * 发簪到期标记
     */
    @TableField(value = "addFavorPerActionDDLFlag_Hairpin")
    private Integer addFavorPerActionDDLFlag_Hairpin;

    /**
     * 寿司到期时间（秒）
     */
    @TableField(value = "addAffinityDDL_Sushi")
    private Integer addAffinityDDL_Sushi;

    /**
     * 寿司到期标记
     */
    @TableField(value = "addAffinityDDLFlag_Sushi")
    private Integer addAffinityDDLFlag_Sushi;

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
        Adjustconf other = (Adjustconf) that;
        return (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
                && (this.getAddFavorDDL_Cookie() == null ? other.getAddFavorDDL_Cookie() == null : this.getAddFavorDDL_Cookie().equals(other.getAddFavorDDL_Cookie()))
                && (this.getAddFavorDDLFlag_Cookie() == null ? other.getAddFavorDDLFlag_Cookie() == null : this.getAddFavorDDLFlag_Cookie().equals(other.getAddFavorDDLFlag_Cookie()))
                && (this.getFavorTimePunishDownRate() == null ? other.getFavorTimePunishDownRate() == null : this.getFavorTimePunishDownRate().equals(other.getFavorTimePunishDownRate()))
                && (this.getFavorTimePunishDownDDL() == null ? other.getFavorTimePunishDownDDL() == null : this.getFavorTimePunishDownDDL().equals(other.getFavorTimePunishDownDDL()))
                && (this.getFavorTimePunishDownDDLFlag() == null ? other.getFavorTimePunishDownDDLFlag() == null : this.getFavorTimePunishDownDDLFlag().equals(other.getFavorTimePunishDownDDLFlag()))
                && (this.getAddFavorPerActionDDL_Hairpin() == null ? other.getAddFavorPerActionDDL_Hairpin() == null : this.getAddFavorPerActionDDL_Hairpin().equals(other.getAddFavorPerActionDDL_Hairpin()))
                && (this.getAddFavorPerActionDDLFlag_Hairpin() == null ? other.getAddFavorPerActionDDLFlag_Hairpin() == null : this.getAddFavorPerActionDDLFlag_Hairpin().equals(other.getAddFavorPerActionDDLFlag_Hairpin()))
                && (this.getAddAffinityDDL_Sushi() == null ? other.getAddAffinityDDL_Sushi() == null : this.getAddAffinityDDL_Sushi().equals(other.getAddAffinityDDL_Sushi()))
                && (this.getAddAffinityDDLFlag_Sushi() == null ? other.getAddAffinityDDLFlag_Sushi() == null : this.getAddAffinityDDLFlag_Sushi().equals(other.getAddAffinityDDLFlag_Sushi()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getAddFavorDDL_Cookie() == null) ? 0 : getAddFavorDDL_Cookie().hashCode());
        result = prime * result + ((getAddFavorDDLFlag_Cookie() == null) ? 0 : getAddFavorDDLFlag_Cookie().hashCode());
        result = prime * result + ((getFavorTimePunishDownRate() == null) ? 0 : getFavorTimePunishDownRate().hashCode());
        result = prime * result + ((getFavorTimePunishDownDDL() == null) ? 0 : getFavorTimePunishDownDDL().hashCode());
        result = prime * result + ((getFavorTimePunishDownDDLFlag() == null) ? 0 : getFavorTimePunishDownDDLFlag().hashCode());
        result = prime * result + ((getAddFavorPerActionDDL_Hairpin() == null) ? 0 : getAddFavorPerActionDDL_Hairpin().hashCode());
        result = prime * result + ((getAddFavorPerActionDDLFlag_Hairpin() == null) ? 0 : getAddFavorPerActionDDLFlag_Hairpin().hashCode());
        result = prime * result + ((getAddAffinityDDL_Sushi() == null) ? 0 : getAddAffinityDDL_Sushi().hashCode());
        result = prime * result + ((getAddAffinityDDLFlag_Sushi() == null) ? 0 : getAddAffinityDDLFlag_Sushi().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", qq=").append(qq);
        sb.append(", addFavorDDL_Cookie=").append(addFavorDDL_Cookie);
        sb.append(", addFavorDDLFlag_Cookie=").append(addFavorDDLFlag_Cookie);
        sb.append(", favorTimePunishDownRate=").append(favorTimePunishDownRate);
        sb.append(", favorTimePunishDownDDL=").append(favorTimePunishDownDDL);
        sb.append(", favorTimePunishDownDDLFlag=").append(favorTimePunishDownDDLFlag);
        sb.append(", addFavorPerActionDDL_Hairpin=").append(addFavorPerActionDDL_Hairpin);
        sb.append(", addFavorPerActionDDLFlag_Hairpin=").append(addFavorPerActionDDLFlag_Hairpin);
        sb.append(", addAffinityDDL_Sushi=").append(addAffinityDDL_Sushi);
        sb.append(", addAffinityDDLFlag_Sushi=").append(addAffinityDDLFlag_Sushi);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}