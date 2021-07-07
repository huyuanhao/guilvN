package com.qiyukf.unicorn.api;

import android.text.TextUtils;
import com.qiyukf.unicorn.api.msg.ProductReslectOnclickListener;
import java.io.Serializable;
import java.util.List;

public class ProductDetail implements Serializable, Cloneable {
    public String actionText;
    public int actionTextColor;
    public boolean alwaysSend;
    public String desc;
    public String ext;
    public String handlerTag;
    public boolean isOpenReselect;
    public String note;
    public boolean openTemplate;
    public String picture;
    public ProductReslectOnclickListener productReslectOnclickListener;
    public String reselectText;
    public boolean sendByUser;
    public int show;
    public String tagString;
    public List<Tag> tags;
    public String title;
    public String url;

    public static class Builder {
        public ProductDetail productDetail = new ProductDetail();

        public ProductDetail build() {
            return this.productDetail;
        }

        public ProductDetail create() {
            return build();
        }

        public Builder setActionText(String str) {
            this.productDetail.actionText = str;
            return this;
        }

        public Builder setActionTextColor(int i) {
            this.productDetail.actionTextColor = i;
            return this;
        }

        public Builder setAlwaysSend(boolean z) {
            this.productDetail.alwaysSend = z;
            return this;
        }

        public Builder setDesc(String str) {
            ProductDetail productDetail2 = this.productDetail;
            if (str.length() > 300) {
                str = str.substring(0, 300);
            }
            productDetail2.desc = str;
            return this;
        }

        public Builder setExt(String str) {
            this.productDetail.ext = str;
            return this;
        }

        public Builder setHandlerTag(String str) {
            this.productDetail.handlerTag = str;
            return this;
        }

        public Builder setIsOpenReselect(boolean z) {
            this.productDetail.isOpenReselect = z;
            return this;
        }

        public Builder setNote(String str) {
            ProductDetail productDetail2 = this.productDetail;
            if (str.length() > 100) {
                str = str.substring(0, 100);
            }
            productDetail2.note = str;
            return this;
        }

        public Builder setOpenTemplate(boolean z) {
            this.productDetail.openTemplate = z;
            return this;
        }

        public Builder setPicture(String str) {
            this.productDetail.picture = str;
            return this;
        }

        public Builder setProductReslectOnclickListener(ProductReslectOnclickListener productReslectOnclickListener) {
            this.productDetail.productReslectOnclickListener = productReslectOnclickListener;
            return this;
        }

        public Builder setReselectText(String str) {
            this.productDetail.reselectText = str;
            return this;
        }

        public Builder setSendByUser(boolean z) {
            this.productDetail.sendByUser = z;
            return this;
        }

        public Builder setShow(int i) {
            this.productDetail.show = i;
            return this;
        }

        public Builder setTagString(String str) {
            this.productDetail.tagString = str;
            return this;
        }

        public Builder setTags(List<Tag> list) {
            this.productDetail.tags = list;
            return this;
        }

        public Builder setTitle(String str) {
            ProductDetail productDetail2 = this.productDetail;
            if (str.length() > 100) {
                str = str.substring(0, 100);
            }
            productDetail2.title = str;
            return this;
        }

        public Builder setUrl(String str) {
            this.productDetail.url = str;
            return this;
        }
    }

    public static class Tag implements Serializable, Cloneable {
        public String data;
        public String focusIframe;
        public String label;
        public String url;

        public Tag() {
        }

        public Tag(String str, String str2, String str3, String str4) {
            this.label = str;
            this.url = str2;
            this.data = str4;
            this.focusIframe = str3;
        }

        public String getData() {
            return this.data;
        }

        public String getFocusIframe() {
            return this.focusIframe;
        }

        public String getLabel() {
            return this.label;
        }

        public String getUrl() {
            return this.url;
        }

        public void setData(String str) {
            this.data = str;
        }

        public void setFocusIframe(String str) {
            this.focusIframe = str;
        }

        public void setLabel(String str) {
            this.label = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }
    }

    public ProductDetail() {
    }

    @Override // java.lang.Object
    public final ProductDetail clone() {
        try {
            return (ProductDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ProductDetail) {
            ProductDetail productDetail = (ProductDetail) obj;
            return TextUtils.equals(this.url, productDetail.url) && TextUtils.equals(this.title, productDetail.title) && TextUtils.equals(this.desc, productDetail.desc);
        }
    }

    public String getActionText() {
        return this.actionText;
    }

    public int getActionTextColor() {
        return this.actionTextColor;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getExt() {
        return this.ext;
    }

    public String getHandlerTag() {
        return this.handlerTag;
    }

    public String getNote() {
        return this.note;
    }

    public String getPicture() {
        return this.picture;
    }

    public ProductReslectOnclickListener getProductReslectOnclickListener() {
        return this.productReslectOnclickListener;
    }

    public String getReselectText() {
        return this.reselectText;
    }

    public int getShow() {
        return this.show;
    }

    public String getTagString() {
        return this.tagString;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isAlwaysSend() {
        return this.alwaysSend;
    }

    public boolean isOpenReselect() {
        return this.isOpenReselect;
    }

    public boolean isOpenTemplate() {
        return this.openTemplate;
    }

    public boolean isSendByUser() {
        return this.sendByUser;
    }

    public void setSendByUser(boolean z) {
        this.sendByUser = z;
    }

    public final boolean valid() {
        return !TextUtils.isEmpty(this.title) || !TextUtils.isEmpty(this.desc) || !TextUtils.isEmpty(this.picture) || !TextUtils.isEmpty(this.url) || !TextUtils.isEmpty(this.note);
    }
}
