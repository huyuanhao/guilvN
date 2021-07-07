package com.qiyukf.nimlib.sdk.msg.constant;

public enum MsgDirectionEnum {
    Out(0),
    In(1);
    
    public int value;

    /* access modifiers changed from: public */
    MsgDirectionEnum(int i) {
        this.value = i;
    }

    public static MsgDirectionEnum directionOfValue(int i) {
        MsgDirectionEnum[] values = values();
        for (MsgDirectionEnum msgDirectionEnum : values) {
            if (msgDirectionEnum.getValue() == i) {
                return msgDirectionEnum;
            }
        }
        return Out;
    }

    public final int getValue() {
        return this.value;
    }
}
