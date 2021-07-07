package com.p118pd.sdk;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.pd.sdk.oO0OO0oO  reason: case insensitive filesystem */
public class C7863oO0OO0oO implements AbstractC7868oO0OOOo0, AbstractC7821oO00o0o {
    public AbstractC7821oO00o0o OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7868oO0OOOo0 f20927OooO00o;
    public AbstractC7821oO00o0o OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f20928OooO0O0;

    @VisibleForTesting
    public C7863oO0OO0oO() {
        this(null);
    }

    private boolean OooO() {
        AbstractC7868oO0OOOo0 oo0oooo0 = this.f20927OooO00o;
        return oo0oooo0 != null && oo0oooo0.OooO0o0();
    }

    private boolean OooO0o() {
        AbstractC7868oO0OOOo0 oo0oooo0 = this.f20927OooO00o;
        return oo0oooo0 == null || oo0oooo0.m19562OooO00o(this);
    }

    private boolean OooO0oO() {
        AbstractC7868oO0OOOo0 oo0oooo0 = this.f20927OooO00o;
        return oo0oooo0 == null || oo0oooo0.OooO0OO(this);
    }

    private boolean OooO0oo() {
        AbstractC7868oO0OOOo0 oo0oooo0 = this.f20927OooO00o;
        return oo0oooo0 == null || oo0oooo0.m19563OooO0O0(this);
    }

    public void OooO00o(AbstractC7821oO00o0o oo00o0o, AbstractC7821oO00o0o oo00o0o2) {
        this.OooO00o = oo00o0o;
        this.OooO0O0 = oo00o0o2;
    }

    @Override // com.p118pd.sdk.AbstractC7868oO0OOOo0, com.p118pd.sdk.AbstractC7868oO0OOOo0
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19555OooO0O0(AbstractC7821oO00o0o oo00o0o) {
        return OooO0oo() && (oo00o0o.equals(this.OooO00o) || !this.OooO00o.OooO0Oo());
    }

    @Override // com.p118pd.sdk.AbstractC7868oO0OOOo0
    public boolean OooO0OO(AbstractC7821oO00o0o oo00o0o) {
        return OooO0oO() && oo00o0o.equals(this.OooO00o) && !OooO0o0();
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public boolean OooO0Oo() {
        return this.OooO00o.OooO0Oo() || this.OooO0O0.OooO0Oo();
    }

    @Override // com.p118pd.sdk.AbstractC7868oO0OOOo0
    public boolean OooO0o0() {
        return OooO() || OooO0Oo();
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public void begin() {
        this.f20928OooO0O0 = true;
        if (!this.OooO00o.OooO00o() && !this.OooO0O0.isRunning()) {
            this.OooO0O0.begin();
        }
        if (this.f20928OooO0O0 && !this.OooO00o.isRunning()) {
            this.OooO00o.begin();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public void clear() {
        this.f20928OooO0O0 = false;
        this.OooO0O0.clear();
        this.OooO00o.clear();
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public boolean isRunning() {
        return this.OooO00o.isRunning();
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public void recycle() {
        this.OooO00o.recycle();
        this.OooO0O0.recycle();
    }

    public C7863oO0OO0oO(@Nullable AbstractC7868oO0OOOo0 oo0oooo0) {
        this.f20927OooO00o = oo0oooo0;
    }

    @Override // com.p118pd.sdk.AbstractC7868oO0OOOo0, com.p118pd.sdk.AbstractC7868oO0OOOo0
    public void OooO0O0(AbstractC7821oO00o0o oo00o0o) {
        if (!oo00o0o.equals(this.OooO0O0)) {
            AbstractC7868oO0OOOo0 oo0oooo0 = this.f20927OooO00o;
            if (oo0oooo0 != null) {
                oo0oooo0.OooO0O0((AbstractC7821oO00o0o) this);
            }
            if (!this.OooO0O0.OooO00o()) {
                this.OooO0O0.clear();
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public boolean OooO0OO() {
        return this.OooO00o.OooO0OO();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean OooO0Oo(com.p118pd.sdk.AbstractC7821oO00o0o r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof com.p118pd.sdk.C7863oO0OO0oO
            r1 = 0
            if (r0 == 0) goto L_0x0028
            com.pd.sdk.oO0OO0oO r4 = (com.p118pd.sdk.C7863oO0OO0oO) r4
            com.pd.sdk.oO00o0o r0 = r3.OooO00o
            if (r0 != 0) goto L_0x0010
            com.pd.sdk.oO00o0o r0 = r4.OooO00o
            if (r0 != 0) goto L_0x0028
            goto L_0x0018
        L_0x0010:
            com.pd.sdk.oO00o0o r2 = r4.OooO00o
            boolean r0 = r0.OooO0Oo(r2)
            if (r0 == 0) goto L_0x0028
        L_0x0018:
            com.pd.sdk.oO00o0o r0 = r3.OooO0O0
            com.pd.sdk.oO00o0o r4 = r4.OooO0O0
            if (r0 != 0) goto L_0x0021
            if (r4 != 0) goto L_0x0028
            goto L_0x0027
        L_0x0021:
            boolean r4 = r0.OooO0Oo(r4)
            if (r4 == 0) goto L_0x0028
        L_0x0027:
            r1 = 1
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7863oO0OO0oO.OooO0Oo(com.pd.sdk.oO00o0o):boolean");
    }

    @Override // com.p118pd.sdk.AbstractC7868oO0OOOo0, com.p118pd.sdk.AbstractC7868oO0OOOo0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19554OooO00o(AbstractC7821oO00o0o oo00o0o) {
        return OooO0o() && oo00o0o.equals(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7868oO0OOOo0, com.p118pd.sdk.AbstractC7868oO0OOOo0
    public void OooO00o(AbstractC7821oO00o0o oo00o0o) {
        AbstractC7868oO0OOOo0 oo0oooo0;
        if (oo00o0o.equals(this.OooO00o) && (oo0oooo0 = this.f20927OooO00o) != null) {
            oo0oooo0.OooO00o((AbstractC7821oO00o0o) this);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public boolean OooO00o() {
        return this.OooO00o.OooO00o() || this.OooO0O0.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public boolean OooO0O0() {
        return this.OooO00o.OooO0O0();
    }
}
