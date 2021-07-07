package com.xiaomi.push;

/* renamed from: com.xiaomi.push.jt */
public final class C4559jt extends AbstractC4560ju {

    /* renamed from: a */
    public int f13042a;

    /* renamed from: a */
    public byte[] f13043a;

    /* renamed from: b */
    public int f13044b;

    @Override // com.xiaomi.push.AbstractC4560ju, com.xiaomi.push.AbstractC4560ju
    /* renamed from: a */
    public int mo42597a() {
        return this.f13042a;
    }

    @Override // com.xiaomi.push.AbstractC4560ju, com.xiaomi.push.AbstractC4560ju
    /* renamed from: a */
    public int mo42595a(byte[] bArr, int i, int i2) {
        int b = mo42600b();
        if (i2 > b) {
            i2 = b;
        }
        if (i2 > 0) {
            System.arraycopy(this.f13043a, this.f13042a, bArr, i, i2);
            mo42598a(i2);
        }
        return i2;
    }

    @Override // com.xiaomi.push.AbstractC4560ju
    /* renamed from: a */
    public void mo42598a(int i) {
        this.f13042a += i;
    }

    /* renamed from: a */
    public void mo42599a(byte[] bArr) {
        mo42601b(bArr, 0, bArr.length);
    }

    @Override // com.xiaomi.push.AbstractC4560ju, com.xiaomi.push.AbstractC4560ju
    /* renamed from: a */
    public void m13710a(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.xiaomi.push.AbstractC4560ju, com.xiaomi.push.AbstractC4560ju
    /* renamed from: a */
    public byte[] m13711a() {
        return this.f13043a;
    }

    @Override // com.xiaomi.push.AbstractC4560ju
    /* renamed from: b */
    public int mo42600b() {
        return this.f13044b - this.f13042a;
    }

    @Override // com.xiaomi.push.AbstractC4560ju
    /* renamed from: b */
    public void mo42601b(byte[] bArr, int i, int i2) {
        this.f13043a = bArr;
        this.f13042a = i;
        this.f13044b = i + i2;
    }
}
