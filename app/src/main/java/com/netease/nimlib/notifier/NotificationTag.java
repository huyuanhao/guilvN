package com.netease.nimlib.notifier;

public enum NotificationTag {
    MESSAGE("MESSAGE", 1),
    ADD_BUDDY("ADD_BUDDY", 2);
    
    public static final NotificationTag[] ALL;
    public static final int CATEGORY_EVENT = 2;
    public static final int CATEGORY_MSG = 1;
    public static final NotificationTag[] MAIN;
    public int category;
    public String tag;

    /* access modifiers changed from: public */
    static {
        NotificationTag notificationTag;
        NotificationTag notificationTag2 = MESSAGE;
        MAIN = new NotificationTag[]{notificationTag2, notificationTag};
        ALL = new NotificationTag[]{notificationTag2, notificationTag};
    }

    /* access modifiers changed from: public */
    NotificationTag(String str, int i) {
        this.tag = str;
        this.category = i;
    }

    public int category() {
        return this.category;
    }

    /* renamed from: id */
    public int mo17417id() {
        return ordinal();
    }

    public String tag() {
        return this.tag;
    }
}
