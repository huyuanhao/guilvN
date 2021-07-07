package com.p118pd.sdk;

import com.drew.lang.Rational;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.util.Stack;

/* renamed from: com.pd.sdk.oOOOOoO  reason: case insensitive filesystem */
public abstract class AbstractC8127oOOOOoO implements AbstractC7867oO0OOOo {
    @Nullable
    public AbstractC7922oO0o0O0O OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7925oO0o0OO0 f21130OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Stack<AbstractC7922oO0o0O0O> f21131OooO00o = new Stack<>();
    @Nullable
    public AbstractC7922oO0o0O0O OooO0O0;

    public AbstractC8127oOOOOoO(C7925oO0o0OO0 oo0o0oo0, @Nullable AbstractC7922oO0o0O0O oo0o0o0o) {
        this.f21130OooO00o = oo0o0oo0;
        this.OooO00o = oo0o0o0o;
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo, com.p118pd.sdk.AbstractC7867oO0OOOo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19786OooO00o() {
        this.OooO0O0 = this.f21131OooO00o.empty() ? null : this.f21131OooO00o.pop();
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO0O0(@NotNull String str) {
        OooO00o().OooO00o(str);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO0OO(int i, int i2) {
        this.OooO0O0.OooO00o(i, i2);
    }

    public void OooO00o(@NotNull Class<? extends AbstractC7922oO0o0O0O> cls) {
        try {
            AbstractC7922oO0o0O0O oo0o0o0o = (AbstractC7922oO0o0O0O) cls.newInstance();
            AbstractC7922oO0o0O0O oo0o0o0o2 = this.OooO0O0;
            if (oo0o0o0o2 == null) {
                AbstractC7922oO0o0O0O oo0o0o0o3 = this.OooO00o;
                if (oo0o0o0o3 != null) {
                    oo0o0o0o.OooO00o(oo0o0o0o3);
                    this.OooO00o = null;
                }
            } else {
                this.f21131OooO00o.push(oo0o0o0o2);
                oo0o0o0o.OooO00o(this.OooO0O0);
            }
            this.OooO0O0 = oo0o0o0o;
            this.f21130OooO00o.OooO00o(oo0o0o0o);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO0O0(int i, @NotNull byte[] bArr) {
        this.OooO0O0.OooO00o(i, bArr);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO0O0(int i, @NotNull short[] sArr) {
        this.OooO0O0.OooO0O0(i, sArr);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO0O0(int i, int i2) {
        this.OooO0O0.OooO00o(i, i2);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO0O0(int i, @NotNull int[] iArr) {
        this.OooO0O0.OooO00o(i, iArr);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO00o(@NotNull String str) {
        OooO00o().OooO00o(str);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo, com.p118pd.sdk.AbstractC7867oO0OOOo
    @NotNull
    private AbstractC7922oO0o0O0O OooO00o() {
        AbstractC7922oO0o0O0O oo0o0o0o = this.OooO0O0;
        if (oo0o0o0o != null) {
            return oo0o0o0o;
        }
        C7923oO0o0O0o oo0o0o0o2 = (C7923oO0o0O0o) this.f21130OooO00o.OooO00o(C7923oO0o0O0o.class);
        if (oo0o0o0o2 != null) {
            return oo0o0o0o2;
        }
        OooO00o(C7923oO0o0O0o.class);
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO00o(int i, @NotNull C7927oO0o0OOo oo0o0ooo) {
        this.OooO0O0.OooO00o(i, oo0o0ooo);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO00o(int i, @NotNull Rational rational) {
        this.OooO0O0.OooO00o(i, rational);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO00o(int i, @NotNull Rational[] rationalArr) {
        this.OooO0O0.OooO00o(i, rationalArr);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO00o(int i, float f) {
        this.OooO0O0.OooO00o(i, f);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO00o(int i, @NotNull float[] fArr) {
        this.OooO0O0.OooO00o(i, fArr);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO00o(int i, double d) {
        this.OooO0O0.OooO00o(i, d);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO00o(int i, @NotNull double[] dArr) {
        this.OooO0O0.OooO00o(i, dArr);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO00o(int i, byte b) {
        this.OooO0O0.OooO00o(i, (int) b);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO00o(int i, @NotNull byte[] bArr) {
        this.OooO0O0.OooO00o(i, bArr);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO00o(int i, short s) {
        this.OooO0O0.OooO00o(i, (int) s);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO00o(int i, @NotNull short[] sArr) {
        this.OooO0O0.OooO0O0(i, sArr);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO00o(int i, int i2) {
        this.OooO0O0.OooO00o(i, i2);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO00o(int i, @NotNull int[] iArr) {
        this.OooO0O0.OooO0O0(i, iArr);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO00o(int i, long j) {
        this.OooO0O0.OooO00o(i, j);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO00o(int i, @NotNull long[] jArr) {
        this.OooO0O0.OooO0O0(i, jArr);
    }
}
