package com.qiyukf.unicorn.api.msg;

public enum MsgStatusEnum {
    draft(-1),
    sending(0),
    success(1),
    fail(2),
    read(3),
    unread(4);
    
    public int value;

    /* access modifiers changed from: public */
    MsgStatusEnum(int i) {
        this.value = i;
    }

    public static MsgStatusEnum statusOfValue(int i) {
        MsgStatusEnum[] values = values();
        for (MsgStatusEnum msgStatusEnum : values) {
            if (msgStatusEnum.getValue() == i) {
                return msgStatusEnum;
            }
        }
        return sending;
    }

    public final int getValue() {
        return this.value;
    }
}
