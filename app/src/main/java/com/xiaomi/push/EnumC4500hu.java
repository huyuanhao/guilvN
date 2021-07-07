package com.xiaomi.push;

/* renamed from: com.xiaomi.push.hu */
public enum EnumC4500hu {
    MISC_CONFIG(1),
    PLUGIN_CONFIG(2);
    

    /* renamed from: a */
    public final int f12383a;

    /* access modifiers changed from: public */
    EnumC4500hu(int i) {
        this.f12383a = i;
    }

    /* renamed from: a */
    public static EnumC4500hu m12976a(int i) {
        if (i == 1) {
            return MISC_CONFIG;
        }
        if (i != 2) {
            return null;
        }
        return PLUGIN_CONFIG;
    }

    /* renamed from: a */
    public int mo42044a() {
        return this.f12383a;
    }
}
