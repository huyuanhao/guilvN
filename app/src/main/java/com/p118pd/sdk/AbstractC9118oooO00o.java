package com.p118pd.sdk;

import java.io.File;

/* renamed from: com.pd.sdk.oooO00o  reason: case insensitive filesystem */
public interface AbstractC9118oooO00o {
    public static final int OooO00o = 1;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;
    public static final int OooO0Oo = 4;

    void onAddCrashStats(String str, int i, int i2);

    File onBeforeUploadLog(File file);

    void onClientProcessLogGenerated(String str, File file, String str2);

    void onCrashRestarting(boolean z);

    String onGetCallbackInfo(String str, boolean z);

    void onLogGenerated(File file, String str);
}
