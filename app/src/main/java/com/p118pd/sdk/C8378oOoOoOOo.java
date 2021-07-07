package com.p118pd.sdk;

import android.content.Context;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import java.util.Map;

/* renamed from: com.pd.sdk.oOoOoOOo  reason: case insensitive filesystem */
public class C8378oOoOoOOo {
    public static void OooO00o(Context context, MobclickAgent.EScenarioType eScenarioType) {
        MobclickAgent.setScenarioType(context, eScenarioType);
    }

    public static void OooO0O0(Context context, String str, String str2) {
        MobclickAgent.onEvent(context, str, str2);
    }

    public static void OooO00o(boolean z) {
        MobclickAgent.enableEncrypt(z);
    }

    public static void OooO0O0(Context context, String str, Map<String, String> map) {
        MobclickAgent.onEvent(context, str, map);
    }

    public static void OooO00o(Context context, String str, String str2) {
        UMConfigure.init(context, str, str2, 1, null);
        MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.AUTO);
    }

    public static void OooO0O0(Context context) {
        MobclickAgent.onPageStart(context.getClass().getSimpleName());
        MobclickAgent.onResume(context);
    }

    public static void OooO00o(long j) {
        MobclickAgent.setSessionContinueMillis(j);
    }

    public static void OooO00o(Context context, String str) {
        MobclickAgent.onEvent(context, str);
    }

    public static void OooO00o(Context context, String str, Map<String, String> map, int i) {
        MobclickAgent.onEventValue(context, str, map, i);
    }

    public static void OooO00o(Context context, String str, Map<String, String> map) {
        MobclickAgent.onEvent(context, str, map);
    }

    public static void OooO00o(Context context) {
        MobclickAgent.onPageEnd(context.getClass().getSimpleName());
        MobclickAgent.onPause(context);
    }
}
