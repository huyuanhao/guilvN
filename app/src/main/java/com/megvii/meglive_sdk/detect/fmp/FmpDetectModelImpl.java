package com.megvii.meglive_sdk.detect.fmp;

import com.megvii.action.fmp.liveness.lib.p089a.C1455c;
import com.megvii.action.fmp.liveness.lib.p090b.C1460d;
import com.megvii.action.fmp.liveness.lib.p091c.C1463b;
import com.megvii.meglive_sdk.base.BaseModel;

public class FmpDetectModelImpl extends BaseModel {
    /* renamed from: a */
    public static boolean m2468a(String str, int i, long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C1455c cVar = C1460d.m2161a().f1915a;
        if (cVar.f1907b != 0) {
            return false;
        }
        long nativeCreateSilentHandle = cVar.f1906a.nativeCreateSilentHandle(str, i, j);
        cVar.f1907b = nativeCreateSilentHandle;
        if (nativeCreateSilentHandle != 0) {
            return cVar.f1906a.nativeLoadSilentModel(nativeCreateSilentHandle, bArr, bArr2, bArr3);
        }
        return false;
    }

    /* renamed from: b */
    public static void m2469b() {
        C1455c cVar = C1460d.m2161a().f1915a;
        long j = cVar.f1907b;
        if (j != 0) {
            cVar.f1906a.nativeStartSilentLiveDetect(j);
        }
    }

    /* renamed from: c */
    public static void m2470c() {
        C1455c cVar = C1460d.m2161a().f1915a;
        long j = cVar.f1907b;
        if (j != 0) {
            cVar.f1906a.nativeStopSilentLiveDetect(j);
        }
    }

    /* renamed from: d */
    public static void m2471d() {
        C1455c cVar = C1460d.m2161a().f1915a;
        long j = cVar.f1907b;
        if (j != 0) {
            cVar.f1906a.nativeSilentDetectReset(j);
        }
    }

    /* renamed from: a */
    public static C1463b m2465a(byte[] bArr, int i, int i2, int i3) {
        C1455c cVar = C1460d.m2161a().f1915a;
        C1463b bVar = new C1463b();
        long j = cVar.f1907b;
        if (j == 0) {
            return null;
        }
        cVar.f1906a.nativeSilentLiveDetect(j, bArr, i, i2, i3);
        int silentCurrentStep = cVar.f1906a.getSilentCurrentStep(cVar.f1907b);
        bVar.f1926a = silentCurrentStep;
        if (silentCurrentStep == 0) {
            bVar.f1927b = cVar.f1906a.getSilentQualityErrorType(cVar.f1907b);
        } else if (silentCurrentStep == 1) {
            bVar.f1929d = cVar.f1906a.getProgress(cVar.f1907b);
        } else if (silentCurrentStep == 2) {
            bVar.f1928c = cVar.f1906a.getSilentDetectFailedType(cVar.f1907b);
        }
        return bVar;
    }

    /* renamed from: a */
    public static String m2466a(String str, boolean z, String str2, String str3, byte[] bArr) {
        C1455c cVar = C1460d.m2161a().f1915a;
        if (cVar.f1907b == 0) {
            return "";
        }
        if (bArr == null) {
            bArr = "".getBytes();
        }
        return cVar.f1906a.getSilentDeltaInfo(cVar.f1907b, str, z, str2, str3, bArr);
    }

    /* renamed from: a */
    public static void m2467a() {
        C1455c cVar = C1460d.m2161a().f1915a;
        long j = cVar.f1907b;
        if (j != 0) {
            cVar.f1906a.nativeSilentRelease(j);
            cVar.f1907b = 0;
        }
    }
}
