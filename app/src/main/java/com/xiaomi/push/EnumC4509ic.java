package com.xiaomi.push;

/* renamed from: com.xiaomi.push.ic */
public enum EnumC4509ic {
    RegIdExpired(0),
    PackageUnregistered(1),
    Init(2);
    

    /* renamed from: a */
    public final int f12546a;

    /* access modifiers changed from: public */
    EnumC4509ic(int i) {
        this.f12546a = i;
    }

    /* renamed from: a */
    public static EnumC4509ic m13135a(int i) {
        if (i == 0) {
            return RegIdExpired;
        }
        if (i == 1) {
            return PackageUnregistered;
        }
        if (i != 2) {
            return null;
        }
        return Init;
    }

    /* renamed from: a */
    public int mo42147a() {
        return this.f12546a;
    }
}
