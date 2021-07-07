package com.p118pd.sdk;

import java.io.File;

/* renamed from: com.pd.sdk.oo0O000o  reason: case insensitive filesystem */
public class C8590oo0O000o {
    public static void OooO00o(File file) {
        if (file != null && file.exists()) {
            if (!file.isFile()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "not have file remove!");
                    return;
                }
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        OooO00o(file2);
                    } else if (!file2.delete()) {
                        AbstractC8536oo00OO0O.OooO0Oo("HianalyticsSDK", "remover file fail!");
                    }
                }
            } else if (!file.delete()) {
                AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "remover file fail!");
            }
        }
    }
}
