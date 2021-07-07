package com.xiaomi.push;

/* renamed from: com.xiaomi.push.js */
public class C4558js extends AbstractC4560ju {

    /* renamed from: a */
    public int f13040a;

    /* renamed from: a */
    public C4540jc f13041a;

    public C4558js(int i) {
        this.f13041a = new C4540jc(i);
    }

    @Override // com.xiaomi.push.AbstractC4560ju, com.xiaomi.push.AbstractC4560ju
    /* renamed from: a */
    public int mo42595a(byte[] bArr, int i, int i2) {
        byte[] a = this.f13041a.m13615a();
        if (i2 > this.f13041a.mo42566a() - this.f13040a) {
            i2 = this.f13041a.mo42566a() - this.f13040a;
        }
        if (i2 > 0) {
            System.arraycopy(a, this.f13040a, bArr, i, i2);
            this.f13040a += i2;
        }
        return i2;
    }

    @Override // com.xiaomi.push.AbstractC4560ju, com.xiaomi.push.AbstractC4560ju
    /* renamed from: a */
    public void m13704a(byte[] bArr, int i, int i2) {
        this.f13041a.write(bArr, i, i2);
    }

    /* renamed from: a_ */
    public int mo42596a_() {
        return this.f13041a.size();
    }
}
