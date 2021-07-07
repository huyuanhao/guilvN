package com.p118pd.sdk;

import androidx.annotation.Nullable;

/* renamed from: com.pd.sdk.oO0OOO0o  reason: case insensitive filesystem */
public final class C7865oO0OOO0o implements AbstractC7868oO0OOOo0, AbstractC7821oO00o0o {
    public AbstractC7821oO00o0o OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7868oO0OOOo0 f20930OooO00o;
    public AbstractC7821oO00o0o OooO0O0;

    public C7865oO0OOO0o(@Nullable AbstractC7868oO0OOOo0 oo0oooo0) {
        this.f20930OooO00o = oo0oooo0;
    }

    private boolean OooO() {
        AbstractC7868oO0OOOo0 oo0oooo0 = this.f20930OooO00o;
        return oo0oooo0 != null && oo0oooo0.OooO0o0();
    }

    private boolean OooO0o() {
        AbstractC7868oO0OOOo0 oo0oooo0 = this.f20930OooO00o;
        return oo0oooo0 == null || oo0oooo0.m19562OooO00o(this);
    }

    private boolean OooO0o0(AbstractC7821oO00o0o oo00o0o) {
        return oo00o0o.equals(this.OooO00o) || (this.OooO00o.OooO0O0() && oo00o0o.equals(this.OooO0O0));
    }

    private boolean OooO0oO() {
        AbstractC7868oO0OOOo0 oo0oooo0 = this.f20930OooO00o;
        return oo0oooo0 == null || oo0oooo0.OooO0OO(this);
    }

    private boolean OooO0oo() {
        AbstractC7868oO0OOOo0 oo0oooo0 = this.f20930OooO00o;
        return oo0oooo0 == null || oo0oooo0.m19563OooO0O0(this);
    }

    public void OooO00o(AbstractC7821oO00o0o oo00o0o, AbstractC7821oO00o0o oo00o0o2) {
        this.OooO00o = oo00o0o;
        this.OooO0O0 = oo00o0o2;
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public boolean OooO0O0() {
        return this.OooO00o.OooO0O0() && this.OooO0O0.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public boolean OooO0OO() {
        return (this.OooO00o.OooO0O0() ? this.OooO0O0 : this.OooO00o).OooO0OO();
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public boolean OooO0Oo() {
        return (this.OooO00o.OooO0O0() ? this.OooO0O0 : this.OooO00o).OooO0Oo();
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public void begin() {
        if (!this.OooO00o.isRunning()) {
            this.OooO00o.begin();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public void clear() {
        this.OooO00o.clear();
        if (this.OooO0O0.isRunning()) {
            this.OooO0O0.clear();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public boolean isRunning() {
        return (this.OooO00o.OooO0O0() ? this.OooO0O0 : this.OooO00o).isRunning();
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public void recycle() {
        this.OooO00o.recycle();
        this.OooO0O0.recycle();
    }

    @Override // com.p118pd.sdk.AbstractC7868oO0OOOo0, com.p118pd.sdk.AbstractC7868oO0OOOo0
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m19558OooO0O0(AbstractC7821oO00o0o oo00o0o) {
        return OooO0oo() && OooO0o0(oo00o0o);
    }

    @Override // com.p118pd.sdk.AbstractC7868oO0OOOo0
    public boolean OooO0OO(AbstractC7821oO00o0o oo00o0o) {
        return OooO0oO() && OooO0o0(oo00o0o);
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public boolean OooO0Oo(AbstractC7821oO00o0o oo00o0o) {
        if (!(oo00o0o instanceof C7865oO0OOO0o)) {
            return false;
        }
        C7865oO0OOO0o oo0ooo0o = (C7865oO0OOO0o) oo00o0o;
        if (!this.OooO00o.OooO0Oo(oo0ooo0o.OooO00o) || !this.OooO0O0.OooO0Oo(oo0ooo0o.OooO0O0)) {
            return false;
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7868oO0OOOo0
    public boolean OooO0o0() {
        return OooO() || OooO0Oo();
    }

    @Override // com.p118pd.sdk.AbstractC7821oO00o0o
    public boolean OooO00o() {
        return (this.OooO00o.OooO0O0() ? this.OooO0O0 : this.OooO00o).OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7868oO0OOOo0, com.p118pd.sdk.AbstractC7868oO0OOOo0
    public void OooO0O0(AbstractC7821oO00o0o oo00o0o) {
        AbstractC7868oO0OOOo0 oo0oooo0 = this.f20930OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.OooO0O0((AbstractC7821oO00o0o) this);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7868oO0OOOo0, com.p118pd.sdk.AbstractC7868oO0OOOo0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19557OooO00o(AbstractC7821oO00o0o oo00o0o) {
        return OooO0o() && OooO0o0(oo00o0o);
    }

    @Override // com.p118pd.sdk.AbstractC7868oO0OOOo0, com.p118pd.sdk.AbstractC7868oO0OOOo0
    public void OooO00o(AbstractC7821oO00o0o oo00o0o) {
        if (oo00o0o.equals(this.OooO0O0)) {
            AbstractC7868oO0OOOo0 oo0oooo0 = this.f20930OooO00o;
            if (oo0oooo0 != null) {
                oo0oooo0.OooO00o((AbstractC7821oO00o0o) this);
            }
        } else if (!this.OooO0O0.isRunning()) {
            this.OooO0O0.begin();
        }
    }
}
