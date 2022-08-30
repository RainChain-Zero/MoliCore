package com.rainchain.jasmine.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.FastjsonTypeHandler;
import com.rainchain.jasmine.component.Regression;
import com.rainchain.jasmine.component.Work;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * @TableName favorconf
 */
@TableName(value = "favorconf")
@Data
public class Favorconf implements Serializable {
    /**
     *
     */
    @TableId(value = "qq")
    @Length(min = 5, max = 10, message = "QQ号非法！")
    private String qq;

    /**
     *
     */
    @TableField(value = "favor")
    private Integer favor;

    /**
     *
     */
    @TableField(value = "affinity")
    private Integer affinity;

    /**
     *
     */
    @TableField(value = "cohesion")
    private Integer cohesion;

    /**
     * 好感系统版本
     */
    @TableField(value = "favorVersion")
    private Integer favorVersion;

    /**
     * 最后一次交互时间（秒，os.time()）
     */
    @TableField(value = "lastTime")
    private Integer lastTime;

    /**
     * Dice!信任度
     */
    @TableField(value = "trust")
    private Integer trust;

    /**
     * 标记是否已经发送过通知
     */
    @TableField(value = "noticeQQ")
    private Integer noticeQQ;

    /**
     * 回归信息的json
     */
    @TableField(value = "regression", typeHandler = FastjsonTypeHandler.class)
    private Regression regression;

    /**
     * 工作信息的json
     */
    @TableField(value = "work", typeHandler = FastjsonTypeHandler.class)
    private Work work;

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
        Favorconf other = (Favorconf) that;
        return (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
                && (this.getFavor() == null ? other.getFavor() == null : this.getFavor().equals(other.getFavor()))
                && (this.getAffinity() == null ? other.getAffinity() == null : this.getAffinity().equals(other.getAffinity()))
                && (this.getCohesion() == null ? other.getCohesion() == null : this.getCohesion().equals(other.getCohesion()))
                && (this.getFavorVersion() == null ? other.getFavorVersion() == null : this.getFavorVersion().equals(other.getFavorVersion()))
                && (this.getLastTime() == null ? other.getLastTime() == null : this.getLastTime().equals(other.getLastTime()))
                && (this.getTrust() == null ? other.getTrust() == null : this.getTrust().equals(other.getTrust()))
                && (this.getNoticeQQ() == null ? other.getNoticeQQ() == null : this.getNoticeQQ().equals(other.getNoticeQQ()))
                && (this.getRegression() == null ? other.getRegression() == null : this.getRegression().equals(other.getRegression()))
                && (this.getWork() == null ? other.getWork() == null : this.getWork().equals(other.getWork()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getFavor() == null) ? 0 : getFavor().hashCode());
        result = prime * result + ((getAffinity() == null) ? 0 : getAffinity().hashCode());
        result = prime * result + ((getCohesion() == null) ? 0 : getCohesion().hashCode());
        result = prime * result + ((getFavorVersion() == null) ? 0 : getFavorVersion().hashCode());
        result = prime * result + ((getLastTime() == null) ? 0 : getLastTime().hashCode());
        result = prime * result + ((getTrust() == null) ? 0 : getTrust().hashCode());
        result = prime * result + ((getNoticeQQ() == null) ? 0 : getNoticeQQ().hashCode());
        result = prime * result + ((getRegression() == null) ? 0 : getRegression().hashCode());
        result = prime * result + ((getWork() == null) ? 0 : getWork().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", qq=").append(qq);
        sb.append(", favor=").append(favor);
        sb.append(", affinity=").append(affinity);
        sb.append(", cohesion=").append(cohesion);
        sb.append(", favorVersion=").append(favorVersion);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", trust=").append(trust);
        sb.append(", noticeQQ=").append(noticeQQ);
        sb.append(", regression=").append(regression);
        sb.append(", work=").append(work);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}