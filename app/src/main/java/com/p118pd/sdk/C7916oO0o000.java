package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.pd.sdk.oO0o000  reason: case insensitive filesystem */
public class C7916oO0o000 extends AbstractC7917oO0o000O {
    public int OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f20984OooO00o;

    public C7916oO0o000(@NotNull byte[] bArr) {
        this(bArr, 0);
    }

    @Override // com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O
    public byte OooO00o() throws IOException {
        int i = this.OooO00o;
        byte[] bArr = this.f20984OooO00o;
        if (i < bArr.length) {
            this.OooO00o = i + 1;
            return bArr[i];
        }
        throw new EOFException("End of data reached.");
    }

    @Override // com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O
    public long OooO0O0() {
        return (long) this.OooO00o;
    }

    public C7916oO0o000(@NotNull byte[] bArr, int i) {
        if (bArr != null) {
            this.f20984OooO00o = bArr;
            this.OooO00o = i;
            return;
        }
        throw null;
    }

    @Override // com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O
    @NotNull
    public byte[] OooO00o(int i) throws IOException {
        int i2 = this.OooO00o;
        int i3 = i2 + i;
        byte[] bArr = this.f20984OooO00o;
        if (i3 <= bArr.length) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, i2, bArr2, 0, i);
            this.OooO00o += i;
            return bArr2;
        }
        throw new EOFException("End of data reached.");
    }

    @Override // com.p118pd.sdk.AbstractC7917oO0o000O
    public void OooO00o(@NotNull byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.OooO00o;
        int i4 = i3 + i2;
        byte[] bArr2 = this.f20984OooO00o;
        if (i4 <= bArr2.length) {
            System.arraycopy(bArr2, i3, bArr, i, i2);
            this.OooO00o += i2;
            return;
        }
        throw new EOFException("End of data reached.");
    }

    @Override // com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O
    public void OooO00o(long j) throws IOException {
        if (j >= 0) {
            int i = this.OooO00o;
            if (((long) i) + j <= ((long) this.f20984OooO00o.length)) {
                this.OooO00o = (int) (((long) i) + j);
                return;
            }
            throw new EOFException("End of data reached.");
        }
        throw new IllegalArgumentException("n must be zero or greater.");
    }

    @Override // com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19609OooO00o(long j) throws IOException {
        if (j >= 0) {
            int i = (int) (((long) this.OooO00o) + j);
            this.OooO00o = i;
            byte[] bArr = this.f20984OooO00o;
            if (i <= bArr.length) {
                return true;
            }
            this.OooO00o = bArr.length;
            return false;
        }
        throw new IllegalArgumentException("n must be zero or greater.");
    }

    @Override // com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m19608OooO00o() {
        return this.f20984OooO00o.length - this.OooO00o;
    }
}
