package com.qiyukf.unicorn.api.msg;

public enum SessionStatusEnum {
    NONE(-1),
    IN_SESSION(200),
    IN_QUEUE(203);
    
    public int value;

    /* access modifiers changed from: public */
    SessionStatusEnum(int i) {
        this.value = i;
    }

    public static SessionStatusEnum valueOf(int i) {
        SessionStatusEnum[] values = values();
        for (SessionStatusEnum sessionStatusEnum : values) {
            if (sessionStatusEnum.value() == i) {
                return sessionStatusEnum;
            }
        }
        return NONE;
    }

    public final int value() {
        return this.value;
    }
}
