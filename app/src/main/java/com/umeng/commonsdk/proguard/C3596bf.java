package com.umeng.commonsdk.proguard;

/* renamed from: com.umeng.commonsdk.proguard.bf */
public final class C3596bf extends AbstractC3597bg {

    /* renamed from: a */
    public byte[] f9282a;

    /* renamed from: b */
    public int f9283b;

    /* renamed from: c */
    public int f9284c;

    public C3596bf() {
    }

    /* renamed from: a */
    public void mo38972a(byte[] bArr) {
        mo38973c(bArr, 0, bArr.length);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3597bg
    /* renamed from: a */
    public boolean mo38966a() {
        return true;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3597bg
    /* renamed from: b */
    public void mo38967b() throws C3598bh {
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3597bg
    /* renamed from: b */
    public void mo38968b(byte[] bArr, int i, int i2) throws C3598bh {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3597bg
    /* renamed from: c */
    public void mo38969c() {
    }

    /* renamed from: c */
    public void mo38973c(byte[] bArr, int i, int i2) {
        this.f9282a = bArr;
        this.f9283b = i;
        this.f9284c = i + i2;
    }

    /* renamed from: e */
    public void mo38974e() {
        this.f9282a = null;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3597bg
    /* renamed from: f */
    public byte[] mo38975f() {
        return this.f9282a;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3597bg
    /* renamed from: g */
    public int mo38976g() {
        return this.f9283b;
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3597bg
    /* renamed from: h */
    public int mo38977h() {
        return this.f9284c - this.f9283b;
    }

    public C3596bf(byte[] bArr) {
        mo38972a(bArr);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3597bg
    /* renamed from: a */
    public int mo38965a(byte[] bArr, int i, int i2) throws C3598bh {
        int h = mo38977h();
        if (i2 > h) {
            i2 = h;
        }
        if (i2 > 0) {
            System.arraycopy(this.f9282a, this.f9283b, bArr, i, i2);
            mo38971a(i2);
        }
        return i2;
    }

    public C3596bf(byte[] bArr, int i, int i2) {
        mo38973c(bArr, i, i2);
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3597bg
    /* renamed from: a */
    public void mo38971a(int i) {
        this.f9283b += i;
    }
}
