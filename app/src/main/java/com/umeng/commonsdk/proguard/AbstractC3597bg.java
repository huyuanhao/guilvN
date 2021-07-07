package com.umeng.commonsdk.proguard;

/* renamed from: com.umeng.commonsdk.proguard.bg */
public abstract class AbstractC3597bg {
    /* renamed from: a */
    public abstract int mo38965a(byte[] bArr, int i, int i2) throws C3598bh;

    /* renamed from: a */
    public void mo38971a(int i) {
    }

    /* renamed from: a */
    public abstract boolean mo38966a();

    /* renamed from: b */
    public abstract void mo38967b() throws C3598bh;

    /* renamed from: b */
    public void mo38978b(byte[] bArr) throws C3598bh {
        mo38968b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public abstract void mo38968b(byte[] bArr, int i, int i2) throws C3598bh;

    /* renamed from: c */
    public abstract void mo38969c();

    /* renamed from: d */
    public int mo38979d(byte[] bArr, int i, int i2) throws C3598bh {
        int i3 = 0;
        while (i3 < i2) {
            int a = mo38965a(bArr, i + i3, i2 - i3);
            if (a > 0) {
                i3 += a;
            } else {
                throw new C3598bh("Cannot read. Remote side has closed. Tried to read " + i2 + " bytes, but only got " + i3 + " bytes. (This is often indicative of an internal error on the server side. Please check your server logs.)");
            }
        }
        return i3;
    }

    /* renamed from: d */
    public void mo38970d() throws C3598bh {
    }

    /* renamed from: f */
    public byte[] mo38975f() {
        return null;
    }

    /* renamed from: g */
    public int mo38976g() {
        return 0;
    }

    /* renamed from: h */
    public int mo38977h() {
        return -1;
    }

    /* renamed from: i */
    public boolean mo38980i() {
        return mo38966a();
    }
}
