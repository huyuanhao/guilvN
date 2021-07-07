package com.huawei.hms.update.p053a;

import java.io.File;
import java.io.IOException;

/* renamed from: com.huawei.hms.update.a.i */
public class C1220i extends C1213b {

    /* renamed from: a */
    public final /* synthetic */ int f1351a;

    /* renamed from: b */
    public final /* synthetic */ String f1352b;

    /* renamed from: c */
    public final /* synthetic */ C1219h f1353c;

    /* renamed from: d */
    public long f1354d = 0;

    /* renamed from: e */
    public int f1355e = C1219h.m1364a(this.f1353c).mo15726b();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1220i(C1219h hVar, File file, int i, int i2, String str) {
        super(file, i);
        this.f1353c = hVar;
        this.f1351a = i2;
        this.f1352b = str;
    }

    /* renamed from: a */
    private void m1374a(int i) {
        C1219h.m1364a(this.f1353c).mo15723a(this.f1353c.mo15741b(), i, this.f1352b);
        C1219h.m1368a(this.f1353c, 2100, i, this.f1351a);
    }

    @Override // java.io.OutputStream, com.huawei.hms.update.p053a.C1213b
    public void write(byte[] bArr, int i, int i2) throws IOException {
        super.write(bArr, i, i2);
        int i3 = this.f1355e + i2;
        this.f1355e = i3;
        if (i3 <= 209715200) {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - this.f1354d) > 1000) {
                this.f1354d = currentTimeMillis;
                m1374a(this.f1355e);
            }
            int i4 = this.f1355e;
            if (i4 == this.f1351a) {
                m1374a(i4);
            }
        }
    }
}
