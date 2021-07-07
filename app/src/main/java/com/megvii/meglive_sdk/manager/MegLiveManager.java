package com.megvii.meglive_sdk.manager;

import android.content.Context;
import com.megvii.meglive_sdk.listener.PreCallback;
import com.megvii.meglive_sdk.p098d.C1525e;
import com.megvii.meglive_sdk.p106f.C1554aa;
import com.megvii.meglive_sdk.p106f.C1585z;
import com.megvii.meglive_sdk.p106f.EnumC1568j;
import java.util.HashMap;

public class MegLiveManager {
    public static final int DETECT_VERITICAL_DISABLE = 2;
    public static final int DETECT_VERITICAL_FRONT = 0;
    public static final int DETECT_VERITICAL_KEEP = 1;
    public static C1525e mManager = C1525e.m2307a();
    public static MegLiveManager megLiveManager = new MegLiveManager();

    public static MegLiveManager getInstance() {
        return megLiveManager;
    }

    public String getBuildInfo() {
        return C1525e.m2311c();
    }

    public String getVersion() {
        return C1525e.m2309b();
    }

    public void preDetect(Context context, String str, String str2, String str3, PreCallback preCallback) {
        mManager.mo17002a(context, str, str2, str3, preCallback);
    }

    public void setManifestPack(Context context, String str) {
        C1525e.m2310b(context, str);
    }

    public void setVerticalDetectionType(int i) {
        C1525e eVar = mManager;
        if (i == 0 || i == 1 || i == 2) {
            eVar.f2164e = i;
        } else {
            eVar.f2164e = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x021b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startDetect(com.megvii.meglive_sdk.listener.DetectCallback r18) {
        /*
        // Method dump skipped, instructions count: 740
        */
        throw new UnsupportedOperationException("Method not decompiled: com.megvii.meglive_sdk.manager.MegLiveManager.startDetect(com.megvii.meglive_sdk.listener.DetectCallback):void");
    }

    public void preDetect(Context context, String str, String str2, String str3, HashMap<String, Object> hashMap, PreCallback preCallback) {
        C1525e eVar = mManager;
        if (hashMap != null) {
            try {
                if (hashMap.containsKey("advanced_option")) {
                    String valueOf = String.valueOf(hashMap.get("advanced_option"));
                    eVar.f2166g = valueOf;
                    C1585z.m2694a(context, "advanced_option", valueOf);
                }
                if (hashMap.containsKey("logo_file_name")) {
                    eVar.f2167h = String.valueOf(hashMap.get("logo_file_name"));
                }
            } catch (Throwable th) {
                if (preCallback != null) {
                    preCallback.onPreFinish(str, EnumC1568j.LIVENESS_UNKNOWN_ERROR.f2599E, C1554aa.m2619a(th));
                    return;
                }
                return;
            }
        }
        eVar.mo17002a(context, str, str2, str3, preCallback);
    }
}
