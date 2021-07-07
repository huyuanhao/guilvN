package com.xiaomi.push;

import com.p118pd.sdk.C8026oOO00oOo;
import com.p118pd.sdk.O0O00O;
import com.umeng.commonsdk.proguard.C3587az;
import java.io.InputStream;
import java.util.Vector;

/* renamed from: com.xiaomi.push.b */
public final class C4277b {

    /* renamed from: a */
    public int f11404a;

    /* renamed from: a */
    public final InputStream f11405a;

    /* renamed from: a */
    public final byte[] f11406a;

    /* renamed from: b */
    public int f11407b;

    /* renamed from: c */
    public int f11408c;

    /* renamed from: d */
    public int f11409d;

    /* renamed from: e */
    public int f11410e;

    /* renamed from: f */
    public int f11411f;

    /* renamed from: g */
    public int f11412g;

    /* renamed from: h */
    public int f11413h;

    /* renamed from: i */
    public int f11414i;

    public C4277b(InputStream inputStream) {
        this.f11411f = Integer.MAX_VALUE;
        this.f11413h = 64;
        this.f11414i = 67108864;
        this.f11406a = new byte[4096];
        this.f11404a = 0;
        this.f11408c = 0;
        this.f11405a = inputStream;
    }

    public C4277b(byte[] bArr, int i, int i2) {
        this.f11411f = Integer.MAX_VALUE;
        this.f11413h = 64;
        this.f11414i = 67108864;
        this.f11406a = bArr;
        this.f11404a = i2 + i;
        this.f11408c = i;
        this.f11405a = null;
    }

    /* renamed from: a */
    public static C4277b m11742a(InputStream inputStream) {
        return new C4277b(inputStream);
    }

    /* renamed from: a */
    public static C4277b m11743a(byte[] bArr, int i, int i2) {
        return new C4277b(bArr, i, i2);
    }

    /* renamed from: a */
    private boolean m11744a(boolean z) {
        int i = this.f11408c;
        int i2 = this.f11404a;
        if (i >= i2) {
            int i3 = this.f11410e;
            if (i3 + i2 != this.f11411f) {
                this.f11410e = i3 + i2;
                this.f11408c = 0;
                InputStream inputStream = this.f11405a;
                int read = inputStream == null ? -1 : inputStream.read(this.f11406a);
                this.f11404a = read;
                if (read == 0 || read < -1) {
                    throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.f11404a + "\nThe InputStream implementation is buggy.");
                } else if (read == -1) {
                    this.f11404a = 0;
                    if (!z) {
                        return false;
                    }
                    throw C4340d.m12019a();
                } else {
                    mo41508b();
                    int i4 = this.f11410e + this.f11404a + this.f11407b;
                    if (i4 <= this.f11414i && i4 >= 0) {
                        return true;
                    }
                    throw C4340d.m12026h();
                }
            } else if (!z) {
                return false;
            } else {
                throw C4340d.m12019a();
            }
        } else {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
    }

    /* renamed from: b */
    private void mo41508b() {
        int i = this.f11404a + this.f11407b;
        this.f11404a = i;
        int i2 = this.f11410e + i;
        int i3 = this.f11411f;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.f11407b = i4;
            this.f11404a = i - i4;
            return;
        }
        this.f11407b = 0;
    }

    /* renamed from: a */
    public byte mo41505a() {
        if (this.f11408c == this.f11404a) {
            m11744a(true);
        }
        byte[] bArr = this.f11406a;
        int i = this.f11408c;
        this.f11408c = i + 1;
        return bArr[i];
    }

    /* renamed from: a */
    public int m11747a() {
        if (m11761b()) {
            this.f11409d = 0;
            return 0;
        }
        int d = mo41512d();
        this.f11409d = d;
        if (d != 0) {
            return d;
        }
        throw C4340d.m12022d();
    }

    /* renamed from: a */
    public int mo41506a(int i) {
        if (i >= 0) {
            int i2 = i + this.f11410e + this.f11408c;
            int i3 = this.f11411f;
            if (i2 <= i3) {
                this.f11411f = i2;
                mo41508b();
                return i3;
            }
            throw C4340d.m12019a();
        }
        throw C4340d.m12020b();
    }

    /* renamed from: a */
    public long m11749a() {
        return m11763c();
    }

    /* renamed from: a */
    public C4242a m11750a() {
        int d = mo41512d();
        int i = this.f11404a;
        int i2 = this.f11408c;
        if (d > i - i2 || d <= 0) {
            return C4242a.m11617a(m11757a(d));
        }
        C4242a a = C4242a.m11618a(this.f11406a, i2, d);
        this.f11408c += d;
        return a;
    }

    /* renamed from: a */
    public String m11751a() {
        int d = mo41512d();
        if (d > this.f11404a - this.f11408c || d <= 0) {
            return new String(m11757a(d), "UTF-8");
        }
        String str = new String(this.f11406a, this.f11408c, d, "UTF-8");
        this.f11408c += d;
        return str;
    }

    /* renamed from: a */
    public void m11752a() {
        int a;
        do {
            a = m11747a();
            if (a == 0) {
                return;
            }
        } while (m11756a(a));
    }

    /* renamed from: a */
    public void m11753a(int i) {
        if (this.f11409d != i) {
            throw C4340d.m12023e();
        }
    }

    /* renamed from: a */
    public void mo41507a(AbstractC4373e eVar) {
        int d = mo41512d();
        if (this.f11412g < this.f11413h) {
            int a = mo41506a(d);
            this.f11412g++;
            eVar.mo41680a(this);
            m11753a(0);
            this.f11412g--;
            mo41509b(a);
            return;
        }
        throw C4340d.m12025g();
    }

    /* renamed from: a */
    public boolean m11755a() {
        return mo41512d() != 0;
    }

    /* renamed from: a */
    public boolean m11756a(int i) {
        int a = C4412f.m12497a(i);
        if (a == 0) {
            m11758b();
            return true;
        } else if (a == 1) {
            m11766d();
            return true;
        } else if (a == 2) {
            mo41511c(mo41512d());
            return true;
        } else if (a == 3) {
            m11752a();
            m11753a(C4412f.m12498a(C4412f.m12499b(i), 4));
            return true;
        } else if (a == 4) {
            return false;
        } else {
            if (a == 5) {
                mo41513e();
                return true;
            }
            throw C4340d.m12024f();
        }
    }

    /* renamed from: a */
    public byte[] m11757a(int i) {
        if (i >= 0) {
            int i2 = this.f11410e;
            int i3 = this.f11408c;
            int i4 = i2 + i3 + i;
            int i5 = this.f11411f;
            if (i4 <= i5) {
                int i6 = this.f11404a;
                if (i <= i6 - i3) {
                    byte[] bArr = new byte[i];
                    System.arraycopy(this.f11406a, i3, bArr, 0, i);
                    this.f11408c += i;
                    return bArr;
                } else if (i < 4096) {
                    byte[] bArr2 = new byte[i];
                    int i7 = i6 - i3;
                    System.arraycopy(this.f11406a, i3, bArr2, 0, i7);
                    this.f11408c = this.f11404a;
                    while (true) {
                        m11744a(true);
                        int i8 = i - i7;
                        int i9 = this.f11404a;
                        if (i8 > i9) {
                            System.arraycopy(this.f11406a, 0, bArr2, i7, i9);
                            int i10 = this.f11404a;
                            i7 += i10;
                            this.f11408c = i10;
                        } else {
                            System.arraycopy(this.f11406a, 0, bArr2, i7, i8);
                            this.f11408c = i8;
                            return bArr2;
                        }
                    }
                } else {
                    this.f11410e = i2 + i6;
                    this.f11408c = 0;
                    this.f11404a = 0;
                    int i11 = i6 - i3;
                    int i12 = i - i11;
                    Vector vector = new Vector();
                    while (i12 > 0) {
                        int min = Math.min(i12, 4096);
                        byte[] bArr3 = new byte[min];
                        int i13 = 0;
                        while (i13 < min) {
                            InputStream inputStream = this.f11405a;
                            int read = inputStream == null ? -1 : inputStream.read(bArr3, i13, min - i13);
                            if (read != -1) {
                                this.f11410e += read;
                                i13 += read;
                            } else {
                                throw C4340d.m12019a();
                            }
                        }
                        i12 -= min;
                        vector.addElement(bArr3);
                    }
                    byte[] bArr4 = new byte[i];
                    System.arraycopy(this.f11406a, i3, bArr4, 0, i11);
                    for (int i14 = 0; i14 < vector.size(); i14++) {
                        byte[] bArr5 = (byte[]) vector.elementAt(i14);
                        System.arraycopy(bArr5, 0, bArr4, i11, bArr5.length);
                        i11 += bArr5.length;
                    }
                    return bArr4;
                }
            } else {
                mo41511c((i5 - i2) - i3);
                throw C4340d.m12019a();
            }
        } else {
            throw C4340d.m12020b();
        }
    }

    /* renamed from: b */
    public int m11758b() {
        return mo41512d();
    }

    /* renamed from: b */
    public long m11759b() {
        return m11763c();
    }

    /* renamed from: b */
    public void mo41509b(int i) {
        this.f11411f = i;
        mo41508b();
    }

    /* renamed from: b */
    public boolean m11761b() {
        return this.f11408c == this.f11404a && !m11744a(false);
    }

    /* renamed from: c */
    public int mo41510c() {
        return mo41512d();
    }

    /* renamed from: c */
    public long m11763c() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte a = mo41505a();
            j |= ((long) (a & O0O00O.OooO0O0)) << i;
            if ((a & O0O00O.OooO00o) == 0) {
                return j;
            }
        }
        throw C4340d.m12021c();
    }

    /* renamed from: c */
    public void mo41511c(int i) {
        if (i >= 0) {
            int i2 = this.f11410e;
            int i3 = this.f11408c;
            int i4 = i2 + i3 + i;
            int i5 = this.f11411f;
            if (i4 <= i5) {
                int i6 = this.f11404a;
                if (i <= i6 - i3) {
                    this.f11408c = i3 + i;
                    return;
                }
                int i7 = i6 - i3;
                this.f11410e = i2 + i6;
                this.f11408c = 0;
                this.f11404a = 0;
                while (i7 < i) {
                    InputStream inputStream = this.f11405a;
                    int skip = inputStream == null ? -1 : (int) inputStream.skip((long) (i - i7));
                    if (skip > 0) {
                        i7 += skip;
                        this.f11410e += skip;
                    } else {
                        throw C4340d.m12019a();
                    }
                }
                return;
            }
            mo41511c((i5 - i2) - i3);
            throw C4340d.m12019a();
        }
        throw C4340d.m12020b();
    }

    /* renamed from: d */
    public int mo41512d() {
        int i;
        byte a = mo41505a();
        if (a >= 0) {
            return a;
        }
        int i2 = a & O0O00O.OooO0O0;
        byte a2 = mo41505a();
        if (a2 >= 0) {
            i = a2 << 7;
        } else {
            i2 |= (a2 & O0O00O.OooO0O0) << 7;
            byte a3 = mo41505a();
            if (a3 >= 0) {
                i = a3 << C3587az.f9268l;
            } else {
                i2 |= (a3 & O0O00O.OooO0O0) << 14;
                byte a4 = mo41505a();
                if (a4 >= 0) {
                    i = a4 << 21;
                } else {
                    int i3 = i2 | ((a4 & O0O00O.OooO0O0) << 21);
                    byte a5 = mo41505a();
                    int i4 = i3 | (a5 << C8026oOO00oOo.OooO00o);
                    if (a5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (mo41505a() >= 0) {
                            return i4;
                        }
                    }
                    throw C4340d.m12021c();
                }
            }
        }
        return i2 | i;
    }

    /* renamed from: d */
    public long m11766d() {
        byte a = mo41505a();
        byte a2 = mo41505a();
        return ((((long) a2) & 255) << 8) | (((long) a) & 255) | ((((long) mo41505a()) & 255) << 16) | ((((long) mo41505a()) & 255) << 24) | ((((long) mo41505a()) & 255) << 32) | ((((long) mo41505a()) & 255) << 40) | ((((long) mo41505a()) & 255) << 48) | ((((long) mo41505a()) & 255) << 56);
    }

    /* renamed from: e */
    public int mo41513e() {
        return (mo41505a() & 255) | ((mo41505a() & 255) << 8) | ((mo41505a() & 255) << 16) | ((mo41505a() & 255) << 24);
    }
}
