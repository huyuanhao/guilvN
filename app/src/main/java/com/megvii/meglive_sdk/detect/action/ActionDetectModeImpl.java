package com.megvii.meglive_sdk.detect.action;

import com.megvii.action.fmp.liveness.lib.p089a.C1453a;
import com.megvii.action.fmp.liveness.lib.p090b.C1457a;
import com.megvii.action.fmp.liveness.lib.p091c.C1462a;
import com.megvii.meglive_sdk.base.BaseModel;

public class ActionDetectModeImpl extends BaseModel {
    /* renamed from: a */
    public static boolean m2339a(String str, int i, int i2, int[] iArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C1453a aVar = C1457a.m2158a().f1911a;
        if (aVar.f1905b == 0) {
            long nativeCreateActionHandle = aVar.f1904a.nativeCreateActionHandle(i2 != iArr.length, i, i2, str, iArr);
            aVar.f1905b = nativeCreateActionHandle;
            if (nativeCreateActionHandle != 0) {
                return aVar.f1904a.nativeLoadActionModel(nativeCreateActionHandle, bArr, bArr2, bArr3);
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m2340b() {
        C1453a aVar = C1457a.m2158a().f1911a;
        long j = aVar.f1905b;
        if (j != 0) {
            aVar.f1904a.nativeActionDetectReset(j);
        }
    }

    /* renamed from: a */
    public static C1462a m2335a(byte[] bArr, int i, int i2, int i3) {
        C1453a aVar = C1457a.m2158a().f1911a;
        C1462a aVar2 = new C1462a();
        long j = aVar.f1905b;
        if (j == 0) {
            return null;
        }
        aVar.f1904a.nativeStartActionLiveDetect(j);
        aVar.f1904a.nativeActionLiveDetect(aVar.f1905b, bArr, i, i2, i3);
        aVar.f1904a.nativeStopActionLiveDetect(aVar.f1905b);
        int actionCurrentStep = aVar.f1904a.getActionCurrentStep(aVar.f1905b);
        aVar2.f1918a = actionCurrentStep;
        if (actionCurrentStep == 0) {
            aVar2.f1919b = aVar.f1904a.getActionQualityErrorType(aVar.f1905b);
        } else if (actionCurrentStep == 1) {
            aVar2.f1920c = aVar.f1904a.getCurrentActionIndex(aVar.f1905b);
            aVar2.f1921d = aVar.f1904a.getSelectedAction(aVar.f1905b);
            aVar2.f1922e = aVar.f1904a.getActionTimeout(aVar.f1905b);
            aVar2.f1924g = aVar.f1904a.getDetectTime(aVar.f1905b);
            aVar2.f1923f = aVar.f1904a.getActionCount(aVar.f1905b);
        } else if (actionCurrentStep == 2) {
            aVar2.f1925h = aVar.f1904a.getActionDetectFailedType(aVar.f1905b);
        }
        return aVar2;
    }

    /* renamed from: a */
    public static String m2336a(String str, boolean z, String str2, String str3) {
        C1453a aVar = C1457a.m2158a().f1911a;
        long j = aVar.f1905b;
        if (j == 0) {
            return "";
        }
        return aVar.f1904a.getActionDeltaInfo(j, str, z, str2, str3);
    }

    /* renamed from: a */
    public static void m2337a() {
        C1453a aVar = C1457a.m2158a().f1911a;
        long j = aVar.f1905b;
        if (j != 0) {
            aVar.f1904a.nativeActionRelease(j);
            aVar.f1905b = 0;
        }
    }

    /* renamed from: a */
    public static void m2338a(int[] iArr) {
        C1453a aVar = C1457a.m2158a().f1911a;
        long j = aVar.f1905b;
        if (j != 0) {
            aVar.f1904a.nativeResetActionQueue(j, iArr);
        }
    }
}
