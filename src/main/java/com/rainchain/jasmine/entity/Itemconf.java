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
    /**
     *
     */
    @TableId(value = "qq")
    @Length(min = 5, max = 10, message = "QQ号非法！")
    private String qq;

    /**
     *
     */
    @TableField(value = "fl")
    private Integer fl;

    /**
     *
     */
    @TableField(value = "梦的开始", exist = true)
    private Integer 梦的开始;

    /**
     *
     */
    @TableField(value = "未言的期待", exist = true)
    private Integer 未言的期待;

    /**
     *
     */
    @TableField(value = "永恒之戒", exist = true)
    private Integer 永恒之戒;

    /**
     *
     */
    @TableField(value = "雪花糖", exist = true)
    private Integer 雪花糖;

    /**
     *
     */
    @TableField(value = "袋装曲奇", exist = true)
    private Integer 袋装曲奇;

    /**
     *
     */
    @TableField(value = "快乐水", exist = true)
    private Integer 快乐水;

    /**
     *
     */
    @TableField(value = "pocky")
    private Integer pocky;

    /**
     *
     */
    @TableField(value = "彩虹糖", exist = true)
    private Integer 彩虹糖;

    /**
     *
     */
    @TableField(value = "推理小说", exist = true)
    private Integer 推理小说;

    /**
     *
     */
    @TableField(value = "牛奶", exist = true)
    private Integer 牛奶;

    /**
     *
     */
    @TableField(value = "冰激凌", exist = true)
    private Integer 冰激凌;

    /**
     *
     */
    @TableField(value = "可颂", exist = true)
    private Integer 可颂;

    /**
     *
     */
    @TableField(value = "巧克力", exist = true)
    private Integer 巧克力;

    /**
     *
     */
    @TableField(value = "发簪", exist = true)
    private Integer 发簪;

    /**
     *
     */
    @TableField(value = "寿司", exist = true)
    private Integer 寿司;

    /**
     *
     */
    @TableField(value = "薯片", exist = true)
    private Integer 薯片;

    /**
     *
     */
    @TableField(value = "定制reply", exist = true)
    private Integer 定制reply;

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
        Itemconf other = (Itemconf) that;
        return (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
                && (this.getFl() == null ? other.getFl() == null : this.getFl().equals(other.getFl()))
                && (this.get梦的开始() == null ? other.get梦的开始() == null : this.get梦的开始().equals(other.get梦的开始()))
                && (this.get未言的期待() == null ? other.get未言的期待() == null : this.get未言的期待().equals(other.get未言的期待()))
                && (this.get永恒之戒() == null ? other.get永恒之戒() == null : this.get永恒之戒().equals(other.get永恒之戒()))
                && (this.get雪花糖() == null ? other.get雪花糖() == null : this.get雪花糖().equals(other.get雪花糖()))
                && (this.get袋装曲奇() == null ? other.get袋装曲奇() == null : this.get袋装曲奇().equals(other.get袋装曲奇()))
                && (this.get快乐水() == null ? other.get快乐水() == null : this.get快乐水().equals(other.get快乐水()))
                && (this.getPocky() == null ? other.getPocky() == null : this.getPocky().equals(other.getPocky()))
                && (this.get彩虹糖() == null ? other.get彩虹糖() == null : this.get彩虹糖().equals(other.get彩虹糖()))
                && (this.get推理小说() == null ? other.get推理小说() == null : this.get推理小说().equals(other.get推理小说()))
                && (this.get牛奶() == null ? other.get牛奶() == null : this.get牛奶().equals(other.get牛奶()))
                && (this.get冰激凌() == null ? other.get冰激凌() == null : this.get冰激凌().equals(other.get冰激凌()))
                && (this.get可颂() == null ? other.get可颂() == null : this.get可颂().equals(other.get可颂()))
                && (this.get巧克力() == null ? other.get巧克力() == null : this.get巧克力().equals(other.get巧克力()))
                && (this.get发簪() == null ? other.get发簪() == null : this.get发簪().equals(other.get发簪()))
                && (this.get寿司() == null ? other.get寿司() == null : this.get寿司().equals(other.get寿司()))
                && (this.get薯片() == null ? other.get薯片() == null : this.get薯片().equals(other.get薯片()))
                && (this.get定制reply() == null ? other.get定制reply() == null : this.get定制reply().equals(other.get定制reply()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getFl() == null) ? 0 : getFl().hashCode());
        result = prime * result + ((get梦的开始() == null) ? 0 : get梦的开始().hashCode());
        result = prime * result + ((get未言的期待() == null) ? 0 : get未言的期待().hashCode());
        result = prime * result + ((get永恒之戒() == null) ? 0 : get永恒之戒().hashCode());
        result = prime * result + ((get雪花糖() == null) ? 0 : get雪花糖().hashCode());
        result = prime * result + ((get袋装曲奇() == null) ? 0 : get袋装曲奇().hashCode());
        result = prime * result + ((get快乐水() == null) ? 0 : get快乐水().hashCode());
        result = prime * result + ((getPocky() == null) ? 0 : getPocky().hashCode());
        result = prime * result + ((get彩虹糖() == null) ? 0 : get彩虹糖().hashCode());
        result = prime * result + ((get推理小说() == null) ? 0 : get推理小说().hashCode());
        result = prime * result + ((get牛奶() == null) ? 0 : get牛奶().hashCode());
        result = prime * result + ((get冰激凌() == null) ? 0 : get冰激凌().hashCode());
        result = prime * result + ((get可颂() == null) ? 0 : get可颂().hashCode());
        result = prime * result + ((get巧克力() == null) ? 0 : get巧克力().hashCode());
        result = prime * result + ((get发簪() == null) ? 0 : get发簪().hashCode());
        result = prime * result + ((get寿司() == null) ? 0 : get寿司().hashCode());
        result = prime * result + ((get薯片() == null) ? 0 : get薯片().hashCode());
        result = prime * result + ((get定制reply() == null) ? 0 : get定制reply().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", qq=").append(qq);
        sb.append(", fl=").append(fl);
        sb.append(", 梦的开始=").append(梦的开始);
        sb.append(", 未言的期待=").append(未言的期待);
        sb.append(", 永恒之戒=").append(永恒之戒);
        sb.append(", 雪花糖=").append(雪花糖);
        sb.append(", 袋装曲奇=").append(袋装曲奇);
        sb.append(", 快乐水=").append(快乐水);
        sb.append(", pocky=").append(pocky);
        sb.append(", 彩虹糖=").append(彩虹糖);
        sb.append(", 推理小说=").append(推理小说);
        sb.append(", 牛奶=").append(牛奶);
        sb.append(", 冰激凌=").append(冰激凌);
        sb.append(", 可颂=").append(可颂);
        sb.append(", 巧克力=").append(巧克力);
        sb.append(", 发簪=").append(发簪);
        sb.append(", 寿司=").append(寿司);
        sb.append(", 薯片=").append(薯片);
        sb.append(", 定制reply=").append(定制reply);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}