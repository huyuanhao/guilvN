package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.learnium.RNDeviceInfo.JHDeviceManager;
import com.p118pd.sdk.C9349III;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.commonsdk.proguard.C3587az;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.ooOO00O  reason: case insensitive filesystem */
public class C8892ooOO00O {
    public static Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static String f22094OooO00o = o0OOOOO.OooO00o(new byte[]{C8027oOO00oo.OooO0O0, 103, 10}, "48f431");

    /* renamed from: OooO00o  reason: collision with other field name */
    public static String[] f22095OooO00o = {o0OOOOO.OooO00o(new byte[]{5, 3, 93, 1, 83}, "70d5e5"), o0OOOOO.OooO00o(new byte[]{6, 4, 0, 2, 83}, "4306af"), o0OOOOO.OooO00o(new byte[]{81, 82, 0, 12, 87}, "ce08db")};
    public static String[] OooO0O0 = {o0OOOOO.OooO00o(new byte[]{9, 83, 75, C8027oOO00oo.OooO0O0, 4, 89, 23, 94, 16, 30, 4, 72, 20}, "d6e0a0"), o0OOOOO.OooO00o(new byte[]{74, 95, 7, 86, 89, 26, 125, 93, C3587az.f9268l, 77, 64, 68, C8026oOO00oOo.OooO00o, 117, 7, 77}, "26f944"), o0OOOOO.OooO00o(new byte[]{0, 92, 93, 76, 13, C3571am.f9204j, 5, 29, 90, 3, 18, 9, 13, 29, 67, 17, 13, 13, 10, 95, 92, 7, 19}, "c30baf"), o0OOOOO.OooO00o(new byte[]{92, 16, 75, 66, C8027oOO00oo.OooO0Oo, 21, 68, 16, 75, 66, C8027oOO00oo.OooO0Oo, 12, 83}, "6e865a"), o0OOOOO.OooO00o(new byte[]{0, 92, 88, 79, 90, 9, 12, 92, 94, 79, 83, 8, 2, 95, 90, 6}, "c35a7a"), o0OOOOO.OooO00o(new byte[]{92, 23, 80, 22, 85, 87, 92, 18, 84, 89, 76, C8026oOO00oOo.OooO00o, 86, 1, 79, 72, 87, C8027oOO00oo.OooO00o, 86, 1}, "3e7882")};
    public static String[] OooO0OO = {o0OOOOO.OooO00o(new byte[]{83, 5, 15, 81, 84, 4, 0, 86, 21, 2, 90, C3587az.f9268l, 87, 73, 11, 7, 1, 84, 24, 93, 15, 86, 0, C8027oOO00oo.OooO0Oo, 2, 81, 15, 86, 84, C3587az.f9268l, 1, 80, 13, 85, 91, 4}, "5d8ac6"), o0OOOOO.OooO00o(new byte[]{11, 2, 3, 0, 3, 3, 15, 85, 75, 86, 87, 80, C3587az.f9268l, 30, 85, 4, 5, 83, 20, 81, 86, 5, 5, C8027oOO00oo.OooO0Oo, 93, 87, 83, 81, 11, 5, C3587az.f9268l, 87, 5, 1, 1, 6}, "93f736"), o0OOOOO.OooO00o(new byte[]{C3587az.f9268l, 86, 92, C3587az.f9268l, 11, 82, C3587az.f9268l, 6, 21, C3587az.f9268l, 1, 91, 13, 72, 11, 3, 1, 6, 21, 7, 91, 4, 94, 78, 12, 4, 91, 3, 10, 1, 94, 1, 1, 1, 9, 7}, "8e868c"), o0OOOOO.OooO00o(new byte[]{87, 6, 2, 0, 86, 7, 4, 2, C3571am.f9204j, 4, 6, C3587az.f9268l, 1, 29, 1, 9, 81, 7, 30, 9, 6, 8, 85, C8027oOO00oo.OooO0Oo, 7, 3, 4, 81, 81, 6, 85, 3, 80, 85, 6, 3}, "3020c6"), o0OOOOO.OooO00o(new byte[]{1, 10, 80, 92, 84, 4, 83, 92, C8027oOO00oo.OooO0Oo, 10, 1, 91, 87, 21, 5, C3587az.f9268l, 7, 83, 78, 1, 1, 90, 2, 79, 83, 13, 6, 91, 90, 83, 82, 12, 7, C3587az.f9268l, 6, 80}, "c869cb"), o0OOOOO.OooO00o(new byte[]{85, 6, 0, 87, 5, 83, 4, 83, 78, 0, 80, 6, 4, 29, 80, 86, 0, 6, C8027oOO00oo.OooO0Oo, 8, 7, 81, 86, C8026oOO00oOo.OooO00o, 87, 86, 81, 86, 87, 1, 0, 0, 83, 0, 81, 3}, "60cda1"), o0OOOOO.OooO00o(new byte[]{81, 85, 85, 86, 1, 83, 85, 87, 72, 81, 7, 5, 82, 72, 86, 86, 15, 5, 76, 93, 3, 91, 82, 78, 85, 4, 6, 81, 85, 90, 3, 82, 81, 7, 0, 86}, "aeec7c"), o0OOOOO.OooO00o(new byte[]{4, 80, 83, 3, 4, 83, 10, 6, 26, 82, 81, 1, 6, 72, 4, 85, 7, 1, C3571am.f9204j, 92, 81, 86, 15, 29, 0, 80, 83, 86, 6, 85, 11, 81, 5, 82, 1, 86}, "2e7370"), o0OOOOO.OooO00o(new byte[]{6, 0, 85, 1, 10, 85, 2, 3, 25, 93, 80, 89, 86, 24, 7, 82, 10, 86, 78, 13, 87, 5, 2, 76, 85, 86, 7, 1, 86, 2, 87, 2, 0, 83, 10, 81}, "c54d3a"), o0OOOOO.OooO00o(new byte[]{6, 10, 5, 83, 6, 0, 5, 6, 73, 12, 0, 82, 84, 30, 87, 13, 3, 80, C8026oOO00oOo.OooO00o, 10, 92, 12, 0, 79, 7, 6, 2, 0, 7, 90, 3, 3, 2, 1, 12, 82}, "13d54b"), o0OOOOO.OooO00o(new byte[]{93, 5, 2, 4, 90, 93, 10, 6, 30, 1, 90, 1, 10, C8027oOO00oo.OooO0Oo, 0, 82, 5, 15, 20, C3587az.f9268l, 85, 5, 81, 21, 13, C3587az.f9268l, 80, 83, 5, 0, 11, 87, 82, 86, 85, C3587az.f9268l}, "9637c8"), o0OOOOO.OooO00o(new byte[]{84, 6, 6, 95, 83, 6, 9, 0, 24, 92, 2, 85, 80, C3571am.f9204j, 6, 12, 83, 15, C8026oOO00oOo.OooO00o, 80, 7, 91, 5, C8027oOO00oo.OooO0Oo, 85, 3, 5, 15, 4, 3, 85, 6, 13, 8, 4, 0}, "125956"), o0OOOOO.OooO00o(new byte[]{4, 2, 84, 85, 0, 83, 1, 5, 26, 93, 82, 85, 83, 73, 4, 2, 6, 0, 29, 93, 84, 84, 3, C8027oOO00oo.OooO0Oo, 81, 85, 84, 82, 86, 87, 81, 84, 6, 83, 4, 5}, "0d7db6"), o0OOOOO.OooO00o(new byte[]{0, 6, 7, 82, 88, 85, 95, 13, C8026oOO00oOo.OooO00o, 6, 11, C3587az.f9268l, 11, 24, 2, 1, 1, 84, 20, 87, 82, 1, 15, C8027oOO00oo.OooO0Oo, 91, 1, 82, 87, 10, 83, 88, 6, 83, 6, 95, 1}, "951396"), o0OOOOO.OooO00o(new byte[]{6, 15, 86, 83, 7, 0, 90, 3, 78, 10, 87, 10, 81, 26, 80, 10, 81, 81, 79, 15, 87, 3, 2, C3571am.f9204j, 84, 83, 84, 80, 80, 4, 90, 1, 90, 86, 1, 1}, "b7c2c2")};

    /* renamed from: com.pd.sdk.ooOO00O$OooO00o */
    public static class OooO00o implements AbstractC5477Il11<Map<String, String>> {
        /* renamed from: OooO00o */
        public void onNext(Map<String, String> map) {
            if (map != null) {
                if (TextUtils.equals(map.get(o0OOOOO.OooO00o(new byte[]{90, 11, 7, 81}, "9dc469")), o0OOOOO.OooO00o(new byte[]{3}, "2c085b"))) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(o0OOOOO.OooO00o(new byte[]{93, 93, 67, 13, 92, 7}, "087e3c"), o0OOOOO.OooO00o(new byte[]{15, 23, 52, 94, 23, C8027oOO00oo.OooO0O0, 51, 23, 13, 95, 2}, "fdd1e3"));
                    String OooO00o = o0OOOOO.OooO00o(new byte[]{93, 5, 93, 80}, "3d052d");
                    hashMap.put(OooO00o, o0OOOOO.OooO00o(new byte[]{64, 11}, "06c7da") + map.get(o0OOOOO.OooO00o(new byte[]{67, 11, 19, C8027oOO00oo.OooO00o}, "3da5be")));
                    hashMap.put(o0OOOOO.OooO00o(new byte[]{83, 0, 69, 86}, "7e65d2"), o0OOOOO.OooO00o(new byte[]{C8027oOO00oo.OooO00o}, "1f0521"));
                    LogCollectorManager.sharedInstance().recordInfo(C8892ooOO00O.f22094OooO00o, true, (Map<String, String>) hashMap);
                    O008o0.o00oo880();
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
        }
    }

    /* renamed from: com.pd.sdk.ooOO00O$OooO0O0 */
    public static class OooO0O0 implements C9349III.OooO00o<Map<String, String>> {
        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super Map<String, String>> r9) {
            boolean z;
            String str;
            String OooO00o = o0OOOOO.OooO00o(new byte[]{80, 87, 83, 26, 4, 30, 81, 75, 85}, "aed440");
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= C8892ooOO00O.f22095OooO00o.length) {
                    z = false;
                    break;
                }
                try {
                    i2 = C8741oo0oOo0.m20357OooO00o(C8892ooOO00O.f22095OooO00o[i]);
                    new Socket(InetAddress.getByName(OooO00o), i2);
                    z = true;
                    break;
                } catch (IOException unused) {
                    i++;
                }
            }
            HashMap hashMap = new HashMap();
            String OooO00o2 = o0OOOOO.OooO00o(new byte[]{0, 86, 93, 6}, "c99c0c");
            if (z) {
                str = o0OOOOO.OooO00o(new byte[]{0}, "119aeb");
            } else {
                str = o0OOOOO.OooO00o(new byte[]{84}, "d40ce7");
            }
            hashMap.put(OooO00o2, str);
            String OooO00o3 = o0OOOOO.OooO00o(new byte[]{22, 89, C8027oOO00oo.OooO0O0, 70}, "f652a9");
            hashMap.put(OooO00o3, i2 + "");
            r9.onNext(hashMap);
            r9.onCompleted();
        }
    }

    public static String OooO0O0() {
        return C8706oo0o0OO0.OooO00o().OooO00o(OooO00o);
    }

    public static String OooO0OO() {
        String OooO00o2 = o0OOOOO.OooO00o(new byte[]{4, 4, 86, 6, 4}, "67b32a");
        HashMap hashMap = new HashMap();
        hashMap.put(o0OOOOO.OooO00o(new byte[]{94, 80, 22, 80, 13, 7}, "35b8bc"), o0OOOOO.OooO00o(new byte[]{92, C8027oOO00oo.OooO0O0, 52, 94, 16, 17, 96, C8027oOO00oo.OooO0O0, 13, 95, 5}, "54d1be"));
        if (OooO00o(JHDeviceManager.getDeviceId(OooO00o), OooO0OO)) {
            hashMap.put(o0OOOOO.OooO00o(new byte[]{86, 92, 16, 86}, "29c5cf"), o0OOOOO.OooO00o(new byte[]{73, 109, 0, 92, C8027oOO00oo.OooO00o, 94, 90, 87, 45, 93}, "92d977"));
            LogCollectorManager.sharedInstance().recordInfo(f22094OooO00o, true, (Map<String, String>) hashMap);
            OooO00o2 = o0OOOOO.OooO00o(new byte[]{0}, "166242");
            O008o0.o00oo880();
        }
        C9349III.OooO00o((C9349III.OooO00o) new OooO0O0()).OooO0OO(C6261iii1I1.OooO0OO()).m21402OooO00o(C6342il11.OooO00o()).OooO00o((AbstractC5477Il11) new OooO00o());
        return OooO00o2;
    }

    public static void OooO00o(Context context) {
        OooO00o = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x02b1 A[Catch:{ FileNotFoundException -> 0x0418, IOException -> 0x0412 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0407 A[Catch:{ FileNotFoundException -> 0x0418, IOException -> 0x0412 }, LOOP:0: B:16:0x00d4->B:58:0x0407, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0397 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x023b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO00o() {
        /*
        // Method dump skipped, instructions count: 1111
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8892ooOO00O.OooO00o():java.lang.String");
    }

    public static boolean OooO00o(String str, String[] strArr) {
        String OooO00o2 = o0OOOOO.OooO00o(new byte[]{2}, "3fd0c9");
        String OooO00o3 = o0OOOOO.OooO00o(new byte[]{6}, "6d72a2");
        int i = 0;
        while (true) {
            if (i >= strArr.length) {
                break;
            } else if (str.equals(strArr[i])) {
                OooO00o3 = o0OOOOO.OooO00o(new byte[]{3}, "2bcf89");
                break;
            } else {
                i++;
            }
        }
        return OooO00o2.equals(OooO00o3);
    }
}
