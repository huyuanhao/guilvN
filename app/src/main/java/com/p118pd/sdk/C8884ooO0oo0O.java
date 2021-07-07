package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.netease.nimlib.util.storage.NimStorageType;
import java.io.File;

/* renamed from: com.pd.sdk.ooO0oo0O  reason: case insensitive filesystem */
public class C8884ooO0oo0O {
    public static final long OooO00o = 1024;
    public static final long OooO0O0 = 1048576;
    public static final long OooO0OO = 104857600;
    public static final long OooO0Oo = 20971520;

    public static void OooO00o(Context context, String str) {
        C8882ooO0oo0.OooO00o().OooO00o(context, str);
    }

    public static String OooO0O0(String str, NimStorageType nimStorageType) {
        return OooO00o(null, str, nimStorageType, false);
    }

    public static String OooO00o(Context context, String str, NimStorageType nimStorageType, boolean z) {
        String OooO0O02 = C8882ooO0oo0.OooO00o().OooO0O0(str, nimStorageType);
        if (TextUtils.isEmpty(OooO0O02)) {
            return null;
        }
        File parentFile = new File(OooO0O02).getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        return OooO0O02;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20533OooO00o() {
        return C8882ooO0oo0.OooO00o().OooO0O0();
    }

    public static boolean OooO00o(Context context, NimStorageType nimStorageType, boolean z) {
        if (C8882ooO0oo0.OooO00o().OooO0O0() && C8882ooO0oo0.OooO00o().m20530OooO00o() >= nimStorageType.getStorageMinSize()) {
            return true;
        }
        return false;
    }

    public static String OooO00o(String str, NimStorageType nimStorageType) {
        return C8882ooO0oo0.OooO00o().OooO00o(str, nimStorageType);
    }

    public static String OooO00o(Context context, String str, NimStorageType nimStorageType) {
        return OooO00o(context, str, nimStorageType, true);
    }

    public static String OooO00o(NimStorageType nimStorageType) {
        return C8882ooO0oo0.OooO00o().OooO00o(nimStorageType);
    }

    public static String OooO00o() {
        return C8882ooO0oo0.OooO00o().m20531OooO00o();
    }
}
