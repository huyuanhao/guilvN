package com.umeng.commonsdk.proguard;

/* renamed from: com.umeng.commonsdk.proguard.r */
public class C3626r {

    /* renamed from: a */
    public short[] f9442a;

    /* renamed from: b */
    public int f9443b = -1;

    public C3626r(int i) {
        this.f9442a = new short[i];
    }

    /* renamed from: d */
    private void m9607d() {
        short[] sArr = this.f9442a;
        short[] sArr2 = new short[(sArr.length * 2)];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        this.f9442a = sArr2;
    }

    /* renamed from: a */
    public short mo39060a() {
        short[] sArr = this.f9442a;
        int i = this.f9443b;
        this.f9443b = i - 1;
        return sArr[i];
    }

    /* renamed from: b */
    public short mo39062b() {
        return this.f9442a[this.f9443b];
    }

    /* renamed from: c */
    public void mo39063c() {
        this.f9443b = -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<ShortStack vector:[");
        for (int i = 0; i < this.f9442a.length; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            if (i == this.f9443b) {
                sb.append(">>");
            }
            sb.append((int) this.f9442a[i]);
            if (i == this.f9443b) {
                sb.append("<<");
            }
        }
        sb.append("]>");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo39061a(short s) {
        if (this.f9442a.length == this.f9443b + 1) {
            m9607d();
        }
        short[] sArr = this.f9442a;
        int i = this.f9443b + 1;
        this.f9443b = i;
        sArr[i] = s;
    }
}
