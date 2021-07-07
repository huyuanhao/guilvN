package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨1丨1I丨i  reason: invalid class name and case insensitive filesystem */
public class C931611Ii {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f22824OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6440l1I f22825OooO00o = new C6440l1I();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C11iil f22826OooO00o;

    public C931611Ii(int i, C11iil r4) {
        if (i < 0) {
            throw new IllegalArgumentException("'epoch' must be >= 0");
        } else if (r4 != null) {
            this.OooO00o = i;
            this.f22826OooO00o = r4;
        } else {
            throw new IllegalArgumentException("'cipher' cannot be null");
        }
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m21342OooO00o() {
        long j = this.f22824OooO00o;
        this.f22824OooO00o = 1 + j;
        return j;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6440l1I m21343OooO00o() {
        return this.f22825OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C11iil m21344OooO00o() {
        return this.f22826OooO00o;
    }

    public long OooO0O0() {
        return this.f22824OooO00o;
    }
}
