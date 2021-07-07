package com.p118pd.sdk;

/* renamed from: com.pd.sdk.III1lIi */
public abstract class III1lIi {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final long f15459OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;

    /* renamed from: com.pd.sdk.III1lIi$OooO00o */
    public static abstract class OooO00o<T extends OooO00o> {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long f15460OooO00o = 0;
        public int OooO0O0 = 0;
        public int OooO0OO = 0;

        public OooO00o(int i) {
            this.OooO00o = i;
        }

        public abstract T OooO00o();

        public T OooO00o(int i) {
            this.OooO0OO = i;
            return OooO00o();
        }

        public T OooO00o(long j) {
            this.f15460OooO00o = j;
            return OooO00o();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public abstract III1lIi m15367OooO00o();

        public T OooO0O0(int i) {
            this.OooO0O0 = i;
            return OooO00o();
        }
    }

    public III1lIi(OooO00o oooO00o) {
        this.OooO00o = oooO00o.OooO0O0;
        this.f15459OooO00o = oooO00o.f15460OooO00o;
        this.OooO0O0 = oooO00o.OooO00o;
        this.OooO0OO = oooO00o.OooO0OO;
    }

    public final int OooO00o() {
        return this.OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final long m15365OooO00o() {
        return this.f15459OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15366OooO00o() {
        byte[] bArr = new byte[32];
        AbstractC6464l1l.OooO00o(this.OooO00o, bArr, 0);
        AbstractC6464l1l.OooO00o(this.f15459OooO00o, bArr, 4);
        AbstractC6464l1l.OooO00o(this.OooO0O0, bArr, 12);
        AbstractC6464l1l.OooO00o(this.OooO0OO, bArr, 28);
        return bArr;
    }

    public final int OooO0O0() {
        return this.OooO00o;
    }

    public final int OooO0OO() {
        return this.OooO0O0;
    }
}
