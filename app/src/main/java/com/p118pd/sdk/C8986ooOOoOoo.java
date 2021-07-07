package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.ooOOoOoo  reason: case insensitive filesystem */
public class C8986ooOOoOoo extends AbstractC7917oO0o000O {
    public static final /* synthetic */ boolean OooO0O0 = false;
    public long OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final InputStream f22259OooO00o;

    public C8986ooOOoOoo(@NotNull InputStream inputStream) {
        if (inputStream != null) {
            this.f22259OooO00o = inputStream;
            this.OooO00o = 0;
            return;
        }
        throw null;
    }

    @Override // com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O
    public byte OooO00o() throws IOException {
        int read = this.f22259OooO00o.read();
        if (read != -1) {
            this.OooO00o++;
            return (byte) read;
        }
        throw new EOFException("End of data reached.");
    }

    @Override // com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O
    public long OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O
    @NotNull
    public byte[] OooO00o(int i) throws IOException {
        byte[] bArr = new byte[i];
        OooO00o(bArr, 0, i);
        return bArr;
    }

    @Override // com.p118pd.sdk.AbstractC7917oO0o000O
    public void OooO00o(@NotNull byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 != i2) {
            int read = this.f22259OooO00o.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                i3 += read;
            } else {
                throw new EOFException("End of data reached.");
            }
        }
        this.OooO00o += (long) i3;
    }

    @Override // com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20653OooO00o(long j) throws IOException {
        if (j >= 0) {
            long OooO00o2 = OooO00o(j);
            if (OooO00o2 != j) {
                throw new EOFException(String.format("Unable to skip. Requested %d bytes but skipped %d.", Long.valueOf(j), Long.valueOf(OooO00o2)));
            }
            return;
        }
        throw new IllegalArgumentException("n must be zero or greater.");
    }

    @Override // com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20654OooO00o(long j) throws IOException {
        if (j >= 0) {
            return OooO00o(j) == j;
        }
        throw new IllegalArgumentException("n must be zero or greater.");
    }

    @Override // com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m20652OooO00o() {
        try {
            return this.f22259OooO00o.available();
        } catch (IOException unused) {
            return 0;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7917oO0o000O, com.p118pd.sdk.AbstractC7917oO0o000O
    private long OooO00o(long j) throws IOException {
        long j2 = 0;
        while (j2 != j) {
            long skip = this.f22259OooO00o.skip(j - j2);
            j2 += skip;
            if (skip == 0) {
                break;
            }
        }
        this.OooO00o += j2;
        return j2;
    }
}
