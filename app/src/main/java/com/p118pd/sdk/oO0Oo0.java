package com.p118pd.sdk;

import com.drew.lang.BufferBoundsException;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.SuppressWarnings;
import java.io.IOException;

/* renamed from: com.pd.sdk.oO0Oo0 */
public class oO0Oo0 extends AbstractC7911oO0Oooo {
    public final int OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f20951OooO00o;

    @SuppressWarnings(justification = "Design intent", value = "EI_EXPOSE_REP2")
    public oO0Oo0(@NotNull byte[] bArr) {
        this(bArr, 0);
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo
    public long OooO00o() {
        return (long) (this.f20951OooO00o.length - this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo
    public int OooO0Oo(int i) {
        return i + this.OooO00o;
    }

    @SuppressWarnings(justification = "Design intent", value = "EI_EXPOSE_REP2")
    public oO0Oo0(@NotNull byte[] bArr, int i) {
        if (bArr == null) {
            throw null;
        } else if (i >= 0) {
            this.f20951OooO00o = bArr;
            this.OooO00o = i;
        } else {
            throw new IllegalArgumentException("Must be zero or greater");
        }
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo
    public byte OooO00o(int i) throws IOException {
        OooO00o(i, 1);
        return this.f20951OooO00o[i + this.OooO00o];
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo
    public void OooO00o(int i, int i2) throws IOException {
        if (!m19567OooO00o(i, i2)) {
            throw new BufferBoundsException(OooO0Oo(i), i2, (long) this.f20951OooO00o.length);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19567OooO00o(int i, int i2) throws IOException {
        return i2 >= 0 && i >= 0 && (((long) i) + ((long) i2)) - 1 < OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m19568OooO00o(int i, int i2) throws IOException {
        OooO00o(i, i2);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f20951OooO00o, i + this.OooO00o, bArr, 0, i2);
        return bArr;
    }
}
