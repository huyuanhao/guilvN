package com.umeng.commonsdk.proguard;

/* renamed from: com.umeng.commonsdk.proguard.q */
public class C3625q {
    /* renamed from: a */
    public static final void m9597a(int i, byte[] bArr) {
        m9598a(i, bArr, 0);
    }

    /* renamed from: a */
    public static final boolean m9600a(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    /* renamed from: a */
    public static final boolean m9601a(long j, int i) {
        return (j & (1 << i)) != 0;
    }

    /* renamed from: b */
    public static final byte m9603b(byte b, int i) {
        return (byte) m9604b((int) b, i);
    }

    /* renamed from: b */
    public static final int m9604b(int i, int i2) {
        return i & ((1 << i2) ^ -1);
    }

    /* renamed from: b */
    public static final long m9605b(long j, int i) {
        return j & ((1 << i) ^ -1);
    }

    /* renamed from: a */
    public static final void m9598a(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) ((i >> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
    }

    /* renamed from: b */
    public static final short m9606b(short s, int i) {
        return (short) m9604b((int) s, i);
    }

    /* renamed from: a */
    public static final int m9593a(byte[] bArr) {
        return m9594a(bArr, 0);
    }

    /* renamed from: a */
    public static final int m9594a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: a */
    public static final boolean m9599a(byte b, int i) {
        return m9600a((int) b, i);
    }

    /* renamed from: a */
    public static final boolean m9602a(short s, int i) {
        return m9600a((int) s, i);
    }

    /* renamed from: a */
    public static final byte m9591a(byte b, int i, boolean z) {
        return (byte) m9592a((int) b, i, z);
    }

    /* renamed from: a */
    public static final short m9596a(short s, int i, boolean z) {
        return (short) m9592a((int) s, i, z);
    }

    /* renamed from: a */
    public static final int m9592a(int i, int i2, boolean z) {
        return z ? i | (1 << i2) : m9604b(i, i2);
    }

    /* renamed from: a */
    public static final long m9595a(long j, int i, boolean z) {
        return z ? j | (1 << i) : m9605b(j, i);
    }
}
