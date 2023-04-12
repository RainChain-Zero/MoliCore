package com.rainchain.jasmine.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName omega_pixiv_artwork
 */
@TableName(value = "omega_pixiv_artwork")
@Data
public class OmegaPixivArtwork implements Serializable {
    /**
     * 作品pid
     */
    @TableId(value = "pid")
    private Long pid;

    /**
     * 作者uid
     */
    @TableField(value = "uid")
    private Long uid;

    /**
     * 作品标题title
     */
    @TableField(value = "title")
    private String title;

    /**
     * 作者名
     */
    @TableField(value = "uname")
    private String uname;

    /**
     * 标记标签, 0=未标记, 1=已人工标记或从可信已标记来源获取
     */
    @TableField(value = "classified")
    private Integer classified;

    /**
     * nsfw标签, -1=未标记, 0=safe, 1=setu. 2=r18
     */
    @TableField(value = "nsfw")
    private Integer nsfw;

    /**
     * 原始图片宽度
     */
    @TableField(value = "width")
    private Integer width;

    /**
     * 原始图片高度
     */
    @TableField(value = "height")
    private Integer height;

    /**
     * 作品标签
     */
    @TableField(value = "tags")
    private String tags;

    /**
     * url
     */
    @TableField(value = "url")
    private String url;

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
        OmegaPixivArtwork other = (OmegaPixivArtwork) that;
        return (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
                && (this.getUid() == null ? other.getUid() == null : this.getUid().equals(other.getUid()))
                && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
                && (this.getUname() == null ? other.getUname() == null : this.getUname().equals(other.getUname()))
                && (this.getClassified() == null ? other.getClassified() == null : this.getClassified().equals(other.getClassified()))
                && (this.getNsfw() == null ? other.getNsfw() == null : this.getNsfw().equals(other.getNsfw()))
                && (this.getWidth() == null ? other.getWidth() == null : this.getWidth().equals(other.getWidth()))
                && (this.getHeight() == null ? other.getHeight() == null : this.getHeight().equals(other.getHeight()))
                && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()))
                && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getUid() == null) ? 0 : getUid().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getUname() == null) ? 0 : getUname().hashCode());
        result = prime * result + ((getClassified() == null) ? 0 : getClassified().hashCode());
        result = prime * result + ((getNsfw() == null) ? 0 : getNsfw().hashCode());
        result = prime * result + ((getWidth() == null) ? 0 : getWidth().hashCode());
        result = prime * result + ((getHeight() == null) ? 0 : getHeight().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", uid=").append(uid);
        sb.append(", title=").append(title);
        sb.append(", uname=").append(uname);
        sb.append(", classified=").append(classified);
        sb.append(", nsfw=").append(nsfw);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", tags=").append(tags);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}