package com.xiaomi.push;

import com.p118pd.sdk.C7490o0OoOO0o;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.xiaomi.push.c */
public final class C4307c {

    /* renamed from: a */
    public final int f11471a;

    /* renamed from: a */
    public final OutputStream f11472a;

    /* renamed from: a */
    public final byte[] f11473a;

    /* renamed from: b */
    public int f11474b;

    /* renamed from: com.xiaomi.push.c$a */
    public static class C4308a extends IOException {
        public C4308a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public C4307c(OutputStream outputStream, byte[] bArr) {
        this.f11472a = outputStream;
        this.f11473a = bArr;
        this.f11474b = 0;
        this.f11471a = bArr.length;
    }

    public C4307c(byte[] bArr, int i, int i2) {
        this.f11472a = null;
        this.f11473a = bArr;
        this.f11474b = i;
        this.f11471a = i + i2;
    }

    /* renamed from: a */
    public static int mo41549a(int i) {
        if (i >= 0) {
            return mo41571d(i);
        }
        return 10;
    }

    /* renamed from: a */
    public static int mo41550a(int i, int i2) {
        return mo41568c(i) + mo41549a(i2);
    }

    /* renamed from: a */
    public static int mo41551a(int i, long j) {
        return mo41568c(i) + mo41556a(j);
    }

    /* renamed from: a */
    public static int mo41552a(int i, C4242a aVar) {
        return mo41568c(i) + mo41557a(aVar);
    }

    /* renamed from: a */
    public static int mo41553a(int i, AbstractC4373e eVar) {
        return mo41568c(i) + mo41558a(eVar);
    }

    /* renamed from: a */
    public static int mo41554a(int i, String str) {
        return mo41568c(i) + mo41559a(str);
    }

    /* renamed from: a */
    public static int mo41555a(int i, boolean z) {
        return mo41568c(i) + mo41560a(z);
    }

    /* renamed from: a */
    public static int mo41556a(long j) {
        return mo41570c(j);
    }

    /* renamed from: a */
    public static int mo41557a(C4242a aVar) {
        return mo41571d(aVar.mo41471a()) + aVar.mo41471a();
    }

    /* renamed from: a */
    public static int mo41558a(AbstractC4373e eVar) {
        int b = eVar.mo41685b();
        return mo41571d(b) + b;
    }

    /* renamed from: a */
    public static int mo41559a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return mo41571d(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    /* renamed from: a */
    public static int mo41560a(boolean z) {
        return 1;
    }

    /* renamed from: a */
    public static C4307c m11880a(OutputStream outputStream) {
        return m11881a(outputStream, 4096);
    }

    /* renamed from: a */
    public static C4307c m11881a(OutputStream outputStream, int i) {
        return new C4307c(outputStream, new byte[i]);
    }

    /* renamed from: a */
    public static C4307c mo41562a(byte[] bArr, int i, int i2) {
        return new C4307c(bArr, i, i2);
    }

    /* renamed from: b */
    public static int mo41564b(int i) {
        return mo41571d(i);
    }

    /* renamed from: b */
    public static int mo41565b(int i, int i2) {
        return mo41568c(i) + mo41564b(i2);
    }

    /* renamed from: b */
    public static int mo41566b(int i, long j) {
        return mo41568c(i) + mo41567b(j);
    }

    /* renamed from: b */
    public static int mo41567b(long j) {
        return mo41570c(j);
    }

    /* renamed from: c */
    public static int mo41568c(int i) {
        return mo41571d(C4412f.m12498a(i, 0));
    }

    /* renamed from: c */
    public static int mo41570c(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: c */
    private void m11889c() {
        OutputStream outputStream = this.f11472a;
        if (outputStream != null) {
            outputStream.write(this.f11473a, 0, this.f11474b);
            this.f11474b = 0;
            return;
        }
        throw new C4308a();
    }

    /* renamed from: d */
    public static int mo41571d(int i) {
        if ((i & C7490o0OoOO0o.OooO0oO) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: a */
    public int mo41547a() {
        if (this.f11472a == null) {
            return this.f11471a - this.f11474b;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    /* renamed from: a */
    public void m11892a() {
        if (this.f11472a != null) {
            m11889c();
        }
    }

    /* renamed from: a */
    public void mo41548a(byte b) {
        if (this.f11474b == this.f11471a) {
            m11889c();
        }
        byte[] bArr = this.f11473a;
        int i = this.f11474b;
        this.f11474b = i + 1;
        bArr[i] = b;
    }

    /* renamed from: a */
    public void m11894a(int i) {
        if (i >= 0) {
            m11916d(i);
        } else {
            m11915c((long) i);
        }
    }

    /* renamed from: a */
    public void m11895a(int i, int i2) {
        mo41569c(i, 0);
        m11894a(i2);
    }

    /* renamed from: a */
    public void m11896a(int i, long j) {
        mo41569c(i, 0);
        m11901a(j);
    }

    /* renamed from: a */
    public void m11897a(int i, C4242a aVar) {
        mo41569c(i, 2);
        m11902a(aVar);
    }

    /* renamed from: a */
    public void m11898a(int i, AbstractC4373e eVar) {
        mo41569c(i, 2);
        m11903a(eVar);
    }

    /* renamed from: a */
    public void m11899a(int i, String str) {
        mo41569c(i, 2);
        m11904a(str);
    }

    /* renamed from: a */
    public void m11900a(int i, boolean z) {
        mo41569c(i, 0);
        m11905a(z);
    }

    /* renamed from: a */
    public void m11901a(long j) {
        m11915c(j);
    }

    /* renamed from: a */
    public void m11902a(C4242a aVar) {
        byte[] a = aVar.m11620a();
        m11916d(a.length);
        mo41561a(a);
    }

    /* renamed from: a */
    public void m11903a(AbstractC4373e eVar) {
        m11916d(eVar.mo41679a());
        eVar.mo41683a(this);
    }

    /* renamed from: a */
    public void m11904a(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m11916d(bytes.length);
        mo41561a(bytes);
    }

    /* renamed from: a */
    public void m11905a(boolean z) {
        m11913c(z ? 1 : 0);
    }

    /* renamed from: a */
    public void mo41561a(byte[] bArr) {
        m11907a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void m11907a(byte[] bArr, int i, int i2) {
        int i3 = this.f11471a;
        int i4 = this.f11474b;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f11473a, i4, i2);
            this.f11474b += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f11473a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f11474b = this.f11471a;
        m11889c();
        if (i7 <= this.f11471a) {
            System.arraycopy(bArr, i6, this.f11473a, 0, i7);
            this.f11474b = i7;
            return;
        }
        this.f11472a.write(bArr, i6, i7);
    }

    /* renamed from: b */
    public void mo41563b() {
        if (mo41547a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: b */
    public void m11909b(int i) {
        m11916d(i);
    }

    /* renamed from: b */
    public void m11910b(int i, int i2) {
        mo41569c(i, 0);
        m11909b(i2);
    }

    /* renamed from: b */
    public void m11911b(int i, long j) {
        mo41569c(i, 0);
        m11912b(j);
    }

    /* renamed from: b */
    public void m11912b(long j) {
        m11915c(j);
    }

    /* renamed from: c */
    public void m11913c(int i) {
        mo41548a((byte) i);
    }

    /* renamed from: c */
    public void mo41569c(int i, int i2) {
        m11916d(C4412f.m12498a(i, i2));
    }

    /* renamed from: c */
    public void m11915c(long j) {
        while ((-128 & j) != 0) {
            m11913c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m11913c((int) j);
    }

    /* renamed from: d */
    public void m11916d(int i) {
        while ((i & C7490o0OoOO0o.OooO0oO) != 0) {
            m11913c((i & 127) | 128);
            i >>>= 7;
        }
        m11913c(i);
    }
}
