package com.xiaomi.push;

/* renamed from: com.xiaomi.push.aw */
public class C4271aw implements AbstractC4273ay {

    /* renamed from: a */
    public final String f11393a;

    /* renamed from: b */
    public final String f11394b;

    public C4271aw(String str, String str2) {
        if (str != null) {
            this.f11393a = str;
            this.f11394b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }

    @Override // com.xiaomi.push.AbstractC4273ay
    /* renamed from: a */
    public String mo41499a() {
        return this.f11393a;
    }

    @Override // com.xiaomi.push.AbstractC4273ay
    /* renamed from: b */
    public String mo41500b() {
        return this.f11394b;
    }
}
