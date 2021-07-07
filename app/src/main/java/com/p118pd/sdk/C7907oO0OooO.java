package com.p118pd.sdk;

import com.drew.lang.BufferBoundsException;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.SuppressWarnings;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.pd.sdk.oO0OooO  reason: case insensitive filesystem */
public class C7907oO0OooO extends AbstractC7911oO0Oooo {
    public static final /* synthetic */ boolean OooO0O0 = false;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final long f20977OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RandomAccessFile f20978OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final int f20979OooO0O0;

    @SuppressWarnings(justification = "Design intent", value = "EI_EXPOSE_REP2")
    public C7907oO0OooO(@NotNull RandomAccessFile randomAccessFile) throws IOException {
        this(randomAccessFile, 0);
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo
    public long OooO00o() {
        return this.f20977OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo
    public int OooO0Oo(int i) {
        return i + this.f20979OooO0O0;
    }

    @SuppressWarnings(justification = "Design intent", value = "EI_EXPOSE_REP2")
    public C7907oO0OooO(@NotNull RandomAccessFile randomAccessFile, int i) throws IOException {
        if (randomAccessFile != null) {
            this.f20978OooO00o = randomAccessFile;
            this.f20979OooO0O0 = i;
            this.f20977OooO00o = randomAccessFile.length();
            return;
        }
        throw null;
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte m19588OooO00o(int i) throws IOException {
        if (i != this.OooO00o) {
            OooO00o(i);
        }
        int read = this.f20978OooO00o.read();
        if (read >= 0) {
            this.OooO00o++;
            return (byte) read;
        }
        throw new BufferBoundsException("Unexpected end of file encountered.");
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m19590OooO00o(int i, int i2) throws IOException {
        OooO00o(i, i2);
        if (i != this.OooO00o) {
            OooO00o(i);
        }
        byte[] bArr = new byte[i2];
        int read = this.f20978OooO00o.read(bArr);
        this.OooO00o += read;
        if (read == i2) {
            return bArr;
        }
        throw new BufferBoundsException("Unexpected end of file encountered.");
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo
    private void OooO00o(int i) throws IOException {
        if (i != this.OooO00o) {
            this.f20978OooO00o.seek((long) i);
            this.OooO00o = i;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19589OooO00o(int i, int i2) throws IOException {
        return i2 >= 0 && i >= 0 && (((long) i) + ((long) i2)) - 1 < this.f20977OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo
    public void OooO00o(int i, int i2) throws IOException {
        if (!m19589OooO00o(i, i2)) {
            throw new BufferBoundsException(i, i2, this.f20977OooO00o);
        }
    }
}
