package com.jinhui365.p088rn.share;

import java.io.Serializable;

/* renamed from: com.jinhui365.rn.share.ShareVO */
public class ShareVO implements Serializable {
    public String icon;
    public String link;
    public String shareImage;
    public String text;
    public String thumbImage;
    public String title;

    public ShareVO() {
    }

    public String getIcon() {
        return this.icon;
    }

    public String getLink() {
        return this.link;
    }

    public String getShareImage() {
        return this.shareImage;
    }

    public String getText() {
        return this.text;
    }

    public String getThumbImage() {
        return this.thumbImage;
    }

    public String getTitle() {
        return this.title;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setLink(String str) {
        this.link = str;
    }

    public void setShareImage(String str) {
        this.shareImage = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setThumbImage(String str) {
        this.thumbImage = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public ShareVO(String str, String str2, String str3, String str4) {
        this.link = str;
        this.text = str2;
        this.title = str3;
        this.icon = str4;
    }

    public ShareVO(String str, String str2, String str3, String str4, String str5, String str6) {
        this.link = str;
        this.text = str2;
        this.title = str3;
        this.icon = str4;
        this.thumbImage = str5;
        this.shareImage = str6;
    }

    public ShareVO(String str, String str2) {
        this.thumbImage = str;
        this.shareImage = str2;
    }
}
