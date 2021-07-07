package com.xiaomi.push;

import java.io.IOException;

/* renamed from: com.xiaomi.push.e */
public abstract class AbstractC4373e {
    /* renamed from: a */
    public abstract int mo41679a();

    /* renamed from: a */
    public abstract AbstractC4373e mo41680a(C4277b bVar);

    /* renamed from: a */
    public AbstractC4373e mo41681a(byte[] bArr) {
        return mo41682a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public AbstractC4373e mo41682a(byte[] bArr, int i, int i2) {
        try {
            C4277b a = C4277b.m11743a(bArr, i, i2);
            mo41680a(a);
            a.m11753a(0);
            return this;
        } catch (C4340d e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    /* renamed from: a */
    public abstract void mo41683a(C4307c cVar);

    /* renamed from: a */
    public void m12145a(byte[] bArr, int i, int i2) {
        try {
            C4307c a = C4307c.mo41562a(bArr, i, i2);
            mo41683a(a);
            a.mo41563b();
        } catch (IOException unused) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    /* renamed from: a */
    public boolean mo41684a(C4277b bVar, int i) {
        return bVar.m11756a(i);
    }

    /* renamed from: a */
    public byte[] m12147a() {
        int b = mo41685b();
        byte[] bArr = new byte[b];
        m12145a(bArr, 0, b);
        return bArr;
    }

    /* renamed from: b */
    public abstract int mo41685b();
}
