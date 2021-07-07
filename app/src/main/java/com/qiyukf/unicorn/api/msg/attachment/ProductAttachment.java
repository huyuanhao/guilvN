package com.qiyukf.unicorn.api.msg.attachment;

import android.content.Context;
import android.text.TextUtils;
import com.p118pd.sdk.C5982OoooOoO;
import com.p118pd.sdk.C8706oo0o0OO0;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.api.ProductDetail;
import com.qiyukf.unicorn.api.msg.ProductReslectOnclickListener;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2548a;
import com.qiyukf.unicorn.p213f.p214a.p218b.AbstractC2549b;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@AbstractC2549b(mo35941a = 121)
public class ProductAttachment extends AbstractC2597e implements Cloneable {
    @AbstractC2548a(mo35940a = "actionText")
    public String actionText;
    @AbstractC2548a(mo35940a = "actionTextColor")
    public int actionTextColor;
    @AbstractC2548a(mo35940a = C5982OoooOoO.OooO0o0)
    public String activity;
    @AbstractC2548a(mo35940a = "activityHref")
    public String activityHref;
    @AbstractC2548a(mo35940a = "auto")
    public int auto;
    @AbstractC2548a(mo35940a = "desc")
    public String desc;
    @AbstractC2548a(mo35940a = "ext")
    public String ext;
    public String handlerTag;
    @AbstractC2548a(mo35940a = "isOpenCustomProduct")
    public boolean isOpenCustomProduct;
    public boolean isOpenReselect;
    @AbstractC2548a(mo35940a = "note")
    public String note;
    @AbstractC2548a(mo35940a = "orderCount")
    public String orderCount;
    @AbstractC2548a(mo35940a = "orderId")
    public String orderID;
    @AbstractC2548a(mo35940a = "orderSku")
    public String orderSku;
    @AbstractC2548a(mo35940a = "orderStatus")
    public String orderStatus;
    @AbstractC2548a(mo35940a = "orderTime")
    public String orderTime;
    @AbstractC2548a(mo35940a = "payMoney")
    public String payMoney;
    @AbstractC2548a(mo35940a = "picture")
    public String picture;
    @AbstractC2548a(mo35940a = "price")
    public String price;
    @AbstractC2548a(mo35940a = "productCustomField")
    public String productCustomField;
    public ProductReslectOnclickListener productReslectOnclickListener;
    public String reselectText;
    @AbstractC2548a(mo35940a = "sendByUser")
    public int sendByUser;
    @AbstractC2548a(mo35940a = "show")
    public int show;
    @AbstractC2548a(mo35940a = "tags")
    public JSONArray tags;
    @AbstractC2548a(mo35940a = C8706oo0o0OO0.OooO0Oo)
    public String template;
    @AbstractC2548a(mo35940a = "title")
    public String title;
    @AbstractC2548a(mo35940a = "url")
    public String url;

    public static JSONArray fromTag(List<ProductDetail.Tag> list) {
        JSONArray jSONArray = new JSONArray();
        for (ProductDetail.Tag tag : list) {
            JSONObject jSONObject = new JSONObject();
            C1810b.m3425a(jSONObject, "label", tag.getLabel());
            C1810b.m3425a(jSONObject, "url", tag.getUrl());
            C1810b.m3425a(jSONObject, "focusIframe", tag.getFocusIframe());
            C1810b.m3425a(jSONObject, "data", tag.getData());
            C1810b.m3421a(jSONArray, jSONObject);
        }
        return jSONArray;
    }

    @Override // java.lang.Object
    public final ProductAttachment clone() {
        try {
            return (ProductAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void fromProductDetail(ProductDetail productDetail, boolean z) {
        JSONArray fromTag;
        setTitle(productDetail.getTitle());
        setDesc(productDetail.getDesc());
        setPicture(productDetail.getPicture());
        setUrl(productDetail.getUrl());
        setNote(productDetail.getNote());
        setShow(productDetail.getShow());
        setExt(productDetail.getExt());
        setActionText(productDetail.getActionText());
        setActionTextColor(productDetail.getActionTextColor());
        setSendByUser(productDetail.isSendByUser() ? 1 : 0);
        setHandlerTag(productDetail.getHandlerTag());
        setReselectText(productDetail.getReselectText());
        setOpenReselect(productDetail.isOpenReselect());
        setProductReslectOnclickListener(productDetail.getProductReslectOnclickListener());
        if (productDetail.isOpenTemplate()) {
            setTemplate("pictureLink");
        }
        if (!TextUtils.isEmpty(productDetail.getTagString())) {
            fromTag = C1810b.m3428b(productDetail.getTagString());
        } else {
            if (productDetail.getTags() != null && productDetail.getTags().size() > 0) {
                fromTag = fromTag(productDetail.getTags());
            }
            this.auto = z ? 1 : 0;
        }
        this.tags = fromTag;
        this.auto = z ? 1 : 0;
    }

    public String getActionText() {
        return this.actionText;
    }

    public int getActionTextColor() {
        return this.actionTextColor;
    }

    public String getActivity() {
        return this.activity;
    }

    public String getActivityHref() {
        return this.activityHref;
    }

    public int getAuto() {
        return this.auto;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment, com.qiyukf.unicorn.p213f.p214a.AbstractC2558d
    public String getContent(Context context) {
        return this.url;
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

    public String getOrderCount() {
        return this.orderCount;
    }

    public String getOrderID() {
        return this.orderID;
    }

    public String getOrderSku() {
        return this.orderSku;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public String getOrderTime() {
        return this.orderTime;
    }

    public String getPayMoney() {
        return this.payMoney;
    }

    public String getPicture() {
        return this.picture;
    }

    public String getPrice() {
        return this.price;
    }

    public String getProductCustomField() {
        return this.productCustomField;
    }

    public ProductReslectOnclickListener getProductReslectOnclickListener() {
        return this.productReslectOnclickListener;
    }

    public String getReselectText() {
        return this.reselectText;
    }

    public int getSendByUser() {
        return this.sendByUser;
    }

    public int getShow() {
        return this.show;
    }

    public JSONArray getTags() {
        return this.tags;
    }

    public String getTemplate() {
        return this.template;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isOpenCustomProduct() {
        return this.isOpenCustomProduct;
    }

    public boolean isOpenReselect() {
        return this.isOpenReselect;
    }

    public void setActionText(String str) {
        this.actionText = str;
    }

    public void setActionTextColor(int i) {
        this.actionTextColor = i;
    }

    public void setActivity(String str) {
        this.activity = str;
    }

    public void setActivityHref(String str) {
        this.activityHref = str;
    }

    public void setAuto(int i) {
        this.auto = i;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public void setHandlerTag(String str) {
        this.handlerTag = str;
    }

    public void setNote(String str) {
        this.note = str;
    }

    public void setOpenCustomProduct(boolean z) {
        this.isOpenCustomProduct = z;
    }

    public void setOpenReselect(boolean z) {
        this.isOpenReselect = z;
    }

    public void setOrderCount(String str) {
        this.orderCount = str;
    }

    public void setOrderID(String str) {
        this.orderID = str;
    }

    public void setOrderSku(String str) {
        this.orderSku = str;
    }

    public void setOrderStatus(String str) {
        this.orderStatus = str;
    }

    public void setOrderTime(String str) {
        this.orderTime = str;
    }

    public void setPayMoney(String str) {
        this.payMoney = str;
    }

    public void setPicture(String str) {
        this.picture = str;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setProductCustomField(String str) {
        this.productCustomField = str;
    }

    public void setProductReslectOnclickListener(ProductReslectOnclickListener productReslectOnclickListener2) {
        this.productReslectOnclickListener = productReslectOnclickListener2;
    }

    public void setReselectText(String str) {
        this.reselectText = str;
    }

    public void setSendByUser(int i) {
        this.sendByUser = i;
    }

    public void setShow(int i) {
        this.show = i;
    }

    public void setTags(JSONArray jSONArray) {
        this.tags = jSONArray;
    }

    public void setTemplate(String str) {
        this.template = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
