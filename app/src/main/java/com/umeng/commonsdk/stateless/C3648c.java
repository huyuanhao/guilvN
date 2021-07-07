package com.umeng.commonsdk.stateless;

import android.content.Context;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.proguard.C3555ac;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;

/* renamed from: com.umeng.commonsdk.stateless.c */
public class C3648c {

    /* renamed from: a */
    public final byte[] f9524a = {0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: b */
    public final int f9525b = 1;

    /* renamed from: c */
    public final int f9526c = 0;

    /* renamed from: d */
    public String f9527d = "1.0";

    /* renamed from: e */
    public String f9528e = null;

    /* renamed from: f */
    public byte[] f9529f = null;

    /* renamed from: g */
    public byte[] f9530g = null;

    /* renamed from: h */
    public byte[] f9531h = null;

    /* renamed from: i */
    public int f9532i = 0;

    /* renamed from: j */
    public int f9533j = 0;

    /* renamed from: k */
    public int f9534k = 0;

    /* renamed from: l */
    public byte[] f9535l = null;

    /* renamed from: m */
    public byte[] f9536m = null;

    /* renamed from: n */
    public boolean f9537n = false;

    public C3648c(byte[] bArr, String str, byte[] bArr2) throws Exception {
        if (bArr == null || bArr.length == 0) {
            throw new Exception("entity is null or empty");
        }
        this.f9528e = str;
        this.f9534k = bArr.length;
        this.f9535l = C3653f.m9768a(bArr);
        this.f9533j = (int) (System.currentTimeMillis() / 1000);
        this.f9536m = bArr2;
    }

    /* renamed from: a */
    public static C3648c m9740a(Context context, String str, byte[] bArr) {
        try {
            String mac = DeviceConfig.getMac(context);
            String deviceId = DeviceConfig.getDeviceId(context);
            Object[] objArr = new Object[1];
            StringBuilder sb = new StringBuilder();
            sb.append("[stateless] build envelope, raw is  ");
            sb.append(bArr == null);
            sb.append("m app key is ");
            sb.append(str);
            sb.append("device id is ");
            sb.append(deviceId);
            sb.append(", mac is ");
            sb.append(mac);
            objArr[0] = sb.toString();
            ULog.m9832i("walle", objArr);
            C3648c cVar = new C3648c(bArr, str, (deviceId + mac).getBytes());
            cVar.mo39166a();
            return cVar;
        } catch (Exception e) {
            ULog.m9832i("walle", "[stateless] build envelope, e is " + e.getMessage());
            UMCrashManager.reportCrash(context, e);
            return null;
        }
    }

    /* renamed from: b */
    public static C3648c m9742b(Context context, String str, byte[] bArr) {
        try {
            String mac = DeviceConfig.getMac(context);
            String deviceId = DeviceConfig.getDeviceId(context);
            C3648c cVar = new C3648c(bArr, str, (deviceId + mac).getBytes());
            cVar.mo39167a(true);
            cVar.mo39166a();
            return cVar;
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
            return null;
        }
    }

    /* renamed from: c */
    private byte[] m9743c() {
        return m9741a(this.f9524a, (int) (System.currentTimeMillis() / 1000));
    }

    /* renamed from: d */
    private byte[] m9744d() {
        return C3653f.m9770b((C3653f.m9771c(this.f9529f) + this.f9532i + this.f9533j + this.f9534k + C3653f.m9771c(this.f9530g)).getBytes());
    }

    /* renamed from: b */
    public byte[] mo39168b() {
        C3641b bVar = new C3641b();
        bVar.mo39113a(this.f9527d);
        bVar.mo39118b(this.f9528e);
        bVar.mo39122c(C3653f.m9771c(this.f9529f));
        bVar.mo39112a(this.f9532i);
        bVar.mo39117b(this.f9533j);
        bVar.mo39121c(this.f9534k);
        bVar.mo39115a(this.f9535l);
        bVar.mo39125d(this.f9537n ? 1 : 0);
        bVar.mo39126d(C3653f.m9771c(this.f9530g));
        bVar.mo39130e(C3653f.m9771c(this.f9531h));
        try {
            return new C3555ac().mo38869a(bVar);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo39167a(boolean z) {
        this.f9537n = z;
    }

    /* renamed from: a */
    public void mo39166a() {
        if (this.f9529f == null) {
            this.f9529f = m9743c();
        }
        if (this.f9537n) {
            byte[] bArr = new byte[16];
            try {
                System.arraycopy(this.f9529f, 1, bArr, 0, 16);
                this.f9535l = C3653f.m9769a(this.f9535l, bArr);
            } catch (Exception unused) {
            }
        }
        this.f9530g = m9741a(this.f9529f, this.f9533j);
        this.f9531h = m9744d();
    }

    /* renamed from: a */
    private byte[] m9741a(byte[] bArr, int i) {
        byte[] b = C3653f.m9770b(this.f9536m);
        byte[] b2 = C3653f.m9770b(this.f9535l);
        int length = b.length;
        int i2 = length * 2;
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 2;
            bArr2[i4] = b2[i3];
            bArr2[i4 + 1] = b[i3];
        }
        for (int i5 = 0; i5 < 2; i5++) {
            bArr2[i5] = bArr[i5];
            bArr2[(i2 - i5) - 1] = bArr[(bArr.length - i5) - 1];
        }
        byte[] bArr3 = {(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) (i >>> 24)};
        for (int i6 = 0; i6 < i2; i6++) {
            bArr2[i6] = (byte) (bArr2[i6] ^ bArr3[i6 % 4]);
        }
        return bArr2;
    }
}
