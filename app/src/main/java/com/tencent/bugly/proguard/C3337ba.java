package com.tencent.bugly.proguard;

/* renamed from: com.tencent.bugly.proguard.ba */
public final class C3337ba extends AbstractC3357m implements Cloneable {

    /* renamed from: d */
    public static byte[] f8087d;

    /* renamed from: a */
    public byte f8088a = 0;

    /* renamed from: b */
    public String f8089b = "";

    /* renamed from: c */
    public byte[] f8090c = null;

    public C3337ba() {
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38327a(C3356l lVar) {
        lVar.mo38493b(this.f8088a, 0);
        lVar.mo38481a(this.f8089b, 1);
        byte[] bArr = this.f8090c;
        if (bArr != null) {
            lVar.mo38486a(bArr, 2);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38328a(StringBuilder sb, int i) {
    }

    public C3337ba(byte b, String str, byte[] bArr) {
        this.f8088a = b;
        this.f8089b = str;
        this.f8090c = bArr;
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38326a(C3354k kVar) {
        this.f8088a = kVar.mo38446a(this.f8088a, 0, true);
        this.f8089b = kVar.mo38454a(1, true);
        if (f8087d == null) {
            byte[] bArr = new byte[1];
            f8087d = bArr;
            bArr[0] = 0;
        }
        this.f8090c = kVar.mo38463a(f8087d, 2, false);
    }
}
