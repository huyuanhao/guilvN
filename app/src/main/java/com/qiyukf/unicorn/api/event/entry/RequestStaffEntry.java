package com.qiyukf.unicorn.api.event.entry;

import com.qiyukf.unicorn.api.ProductDetail;

public class RequestStaffEntry {
    public String custom;
    public long entryId;
    public long faqGroupId;
    public long groupId;
    public boolean isHumanOnly;
    public boolean isRobot;
    public boolean isTransfar;
    public String label;
    public ProductDetail productDetail;
    public boolean robotFirst;
    public long robotId;
    public int scenes;
    public String shopId;
    public long staffId;
    public String title;
    public String uri;
    public int vipLevel;

    public String getCustom() {
        return this.custom;
    }

    public long getEntryId() {
        return this.entryId;
    }

    public long getFaqGroupId() {
        return this.faqGroupId;
    }

    public long getGroupId() {
        return this.groupId;
    }

    public String getLabel() {
        return this.label;
    }

    public ProductDetail getProductDetail() {
        return this.productDetail;
    }

    public long getRobotId() {
        return this.robotId;
    }

    public int getScenes() {
        return this.scenes;
    }

    public String getShopId() {
        return this.shopId;
    }

    public long getStaffId() {
        return this.staffId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUri() {
        return this.uri;
    }

    public int getVipLevel() {
        return this.vipLevel;
    }

    public boolean isHumanOnly() {
        return this.isHumanOnly;
    }

    public boolean isRobot() {
        return this.isRobot;
    }

    public boolean isRobotFirst() {
        return this.robotFirst;
    }

    public boolean isTransfar() {
        return this.isTransfar;
    }

    public void setCustom(String str) {
        this.custom = str;
    }

    public void setEntryId(long j) {
        this.entryId = j;
    }

    public void setFaqGroupId(long j) {
        this.faqGroupId = j;
    }

    public void setGroupId(long j) {
        this.groupId = j;
    }

    public void setHumanOnly(boolean z) {
        this.isHumanOnly = z;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setProductDetail(ProductDetail productDetail2) {
        this.productDetail = productDetail2;
    }

    public void setRobot(boolean z) {
        this.isRobot = z;
    }

    public void setRobotFirst(boolean z) {
        this.robotFirst = z;
    }

    public void setRobotId(long j) {
        this.robotId = j;
    }

    public void setScenes(int i) {
        this.scenes = i;
    }

    public void setShopId(String str) {
        this.shopId = str;
    }

    public void setStaffId(long j) {
        this.staffId = j;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTransfar(boolean z) {
        this.isTransfar = z;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setVipLevel(int i) {
        this.vipLevel = i;
    }

    public String toString() {
        return "scenes:" + getScenes() + "isHumanOnly:" + isHumanOnly() + "isRobot:" + this.isRobot + "label" + getLabel() + "entryId:" + getEntryId() + "shopId:" + getShopId() + "uri:" + getUri() + "title:" + getTitle() + "custom:" + getCustom() + "groupId:" + getGroupId() + "staffId:" + getStaffId() + "robotFirst:" + isRobotFirst() + "robotId:" + getRobotId() + "faqGroupId:" + getFaqGroupId() + "isTransfa" + this.isTransfar;
    }
}
