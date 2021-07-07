package com.umeng.commonsdk.config;

import com.umeng.commonsdk.debug.UMRTLog;
import org.android.agoo.common.Config;

/* renamed from: com.umeng.commonsdk.config.g */
public class C3509g implements AbstractC3507e {
    @Override // com.umeng.commonsdk.config.AbstractC3507e
    /* renamed from: a */
    public void mo38839a(String str, Object obj, String[] strArr) {
        if (str != null && str.length() > 0) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong == -1) {
                    UMRTLog.m9011e(Config.TAG, "--->>> SensitiveFieldHandler: handleConfigItem: invalid config value.");
                    return;
                }
                UMRTLog.m9012i(Config.TAG, "--->>> CollectFieldJudgment: handleConfigItem: item : " + str);
                if (obj != null && (obj instanceof C3498b)) {
                    for (int i = 0; i < strArr.length; i++) {
                        try {
                            String str2 = strArr[i];
                            if (C3502d.m8999a(str2)) {
                                ((C3498b) obj).mo38838a(str2, Boolean.valueOf(C3497a.m8989a(parseLong, i)));
                            }
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                }
            } catch (Throwable unused2) {
                UMRTLog.m9011e(Config.TAG, "--->>> SensitiveFieldHandler: handleConfigItem: parseLong exception.");
            }
        }
    }
}
