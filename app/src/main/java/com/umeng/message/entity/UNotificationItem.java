package com.umeng.message.entity;

public class UNotificationItem {

    /* renamed from: id */
    public int f10164id;
    public UMessage message;

    public UNotificationItem(int i, UMessage uMessage) {
        this.f10164id = i;
        this.message = uMessage;
    }

    public boolean equals(Object obj) {
        if (obj != null && UNotificationItem.class == obj.getClass() && this.f10164id == ((UNotificationItem) obj).f10164id) {
            return true;
        }
        return false;
    }
}
