package com.xiaomi.push;

/* renamed from: com.xiaomi.push.hv */
public enum EnumC4501hv {
    INT(1),
    f12386b(2),
    STRING(3),
    BOOLEAN(4);
    

    /* renamed from: a */
    public final int f12389a;

    /* access modifiers changed from: public */
    EnumC4501hv(int i) {
        this.f12389a = i;
    }

    /* renamed from: a */
    public static EnumC4501hv m12978a(int i) {
        if (i == 1) {
            return INT;
        }
        if (i == 2) {
            return f12386b;
        }
        if (i == 3) {
            return STRING;
        }
        if (i != 4) {
            return null;
        }
        return BOOLEAN;
    }
}
