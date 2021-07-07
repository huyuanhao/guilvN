package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ooO0o  reason: case insensitive filesystem */
public class C8856ooO0o {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final long f22068OooO00o;
    public int OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f22069OooO0O0 = 0;
    public int OooO0OO = 0;

    public C8856ooO0o(long j, int i) {
        this.f22068OooO00o = j < 0 ? 0 : j;
        this.OooO00o = i < 0 ? 0 : i;
        OooO0O0();
    }

    public void OooO00o() {
        this.OooO0OO = this.OooO0O0;
        this.f22069OooO0O0 = System.currentTimeMillis();
    }

    public void OooO0O0() {
        this.OooO0O0 = 0;
        this.OooO0OO = 0;
        this.f22069OooO0O0 = 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20495OooO00o() {
        int i = this.OooO0O0 + 1;
        this.OooO0O0 = i;
        if (i - this.OooO0OO >= this.OooO00o && System.currentTimeMillis() - this.f22069OooO0O0 >= this.f22068OooO00o) {
            return true;
        }
        return false;
    }
}
