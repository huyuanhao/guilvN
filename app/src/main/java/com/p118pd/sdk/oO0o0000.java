package com.p118pd.sdk;

import com.drew.lang.BufferBoundsException;
import com.drew.lang.annotations.NotNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.oO0o0000 */
public class oO0o0000 extends AbstractC7911oO0Oooo {
    public static final int OooO0O0 = 2048;
    public static final /* synthetic */ boolean OooO0OO = false;
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f20985OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final InputStream f20986OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ArrayList<byte[]> f20987OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f20988OooO0O0;

    public oO0o0000(@NotNull InputStream inputStream) {
        this(inputStream, 2048, -1);
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo
    public long OooO00o() throws IOException {
        long j = this.f20985OooO00o;
        if (j != -1) {
            return j;
        }
        m19610OooO00o(Integer.MAX_VALUE, 1);
        return this.f20985OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo
    public int OooO0Oo(int i) {
        return i;
    }

    public oO0o0000(@NotNull InputStream inputStream, int i) {
        this(inputStream, i, -1);
    }

    public oO0o0000(@NotNull InputStream inputStream, int i, long j) {
        this.f20987OooO00o = new ArrayList<>();
        if (inputStream == null) {
            throw null;
        } else if (i > 0) {
            this.OooO00o = i;
            this.f20986OooO00o = inputStream;
            this.f20985OooO00o = j;
        } else {
            throw new IllegalArgumentException("chunkLength must be greater than zero");
        }
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo
    public void OooO00o(int i, int i2) throws IOException {
        if (i < 0) {
            throw new BufferBoundsException(String.format("Attempt to read from buffer using a negative index (%d)", Integer.valueOf(i)));
        } else if (i2 < 0) {
            throw new BufferBoundsException("Number of requested bytes must be zero or greater");
        } else if ((((long) i) + ((long) i2)) - 1 > 2147483647L) {
            throw new BufferBoundsException(String.format("Number of requested bytes summed with starting index exceed maximum range of signed 32 bit integers (requested index: %d, requested count: %d)", Integer.valueOf(i), Integer.valueOf(i2)));
        } else if (!m19610OooO00o(i, i2)) {
            throw new BufferBoundsException(i, i2, this.f20985OooO00o);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19610OooO00o(int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0) {
            return false;
        }
        long j = (((long) i) + ((long) i2)) - 1;
        if (j > 2147483647L) {
            return false;
        }
        int i4 = (int) j;
        if (!this.f20988OooO0O0) {
            int i5 = i4 / this.OooO00o;
            while (i5 >= this.f20987OooO00o.size()) {
                byte[] bArr = new byte[this.OooO00o];
                int i6 = 0;
                while (!this.f20988OooO0O0 && i6 != (i3 = this.OooO00o)) {
                    int read = this.f20986OooO00o.read(bArr, i6, i3 - i6);
                    if (read == -1) {
                        this.f20988OooO0O0 = true;
                        int size = (this.f20987OooO00o.size() * this.OooO00o) + i6;
                        long j2 = this.f20985OooO00o;
                        if (j2 == -1) {
                            this.f20985OooO00o = (long) size;
                        } else {
                            int i7 = (j2 > ((long) size) ? 1 : (j2 == ((long) size) ? 0 : -1));
                        }
                        if (((long) i4) >= this.f20985OooO00o) {
                            this.f20987OooO00o.add(bArr);
                            return false;
                        }
                    } else {
                        i6 += read;
                    }
                }
                this.f20987OooO00o.add(bArr);
            }
            return true;
        } else if (((long) i4) < this.f20985OooO00o) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo
    public byte OooO00o(int i) throws IOException {
        int i2 = this.OooO00o;
        int i3 = i / i2;
        return this.f20987OooO00o.get(i3)[i % i2];
    }

    @Override // com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo, com.p118pd.sdk.AbstractC7911oO0Oooo
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m19611OooO00o(int i, int i2) throws IOException {
        OooO00o(i, i2);
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i2 != 0) {
            int i4 = this.OooO00o;
            int i5 = i / i4;
            int i6 = i % i4;
            int min = Math.min(i2, i4 - i6);
            System.arraycopy(this.f20987OooO00o.get(i5), i6, bArr, i3, min);
            i2 -= min;
            i += min;
            i3 += min;
        }
        return bArr;
    }
}
