package com.p118pd.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.text.TextUtils;
import com.netease.nimlib.sdk.mixpush.HWPushMessageReceiver;
import com.netease.nimlib.sdk.mixpush.MeiZuPushReceiver;
import com.netease.nimlib.sdk.mixpush.MiPushMessageReceiver;
import com.netease.nimlib.sdk.mixpush.VivoPushMessageReceiver;

/* renamed from: com.pd.sdk.ooOo000o  reason: case insensitive filesystem */
public class C9004ooOo000o {
    public static BroadcastReceiver OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f22309OooO00o;

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static MiPushMessageReceiver m20669OooO00o(Context context) {
        OooO00o(context, 5, MiPushMessageReceiver.class);
        return (MiPushMessageReceiver) OooO00o;
    }

    public static HWPushMessageReceiver OooO00o(Context context) {
        OooO00o(context, 6, HWPushMessageReceiver.class);
        return (HWPushMessageReceiver) OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static MeiZuPushReceiver m20668OooO00o(Context context) {
        OooO00o(context, 7, MeiZuPushReceiver.class);
        return (MeiZuPushReceiver) OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static VivoPushMessageReceiver m20670OooO00o(Context context) {
        OooO00o(context, 9, VivoPushMessageReceiver.class);
        return (VivoPushMessageReceiver) OooO00o;
    }

    public static <T extends BroadcastReceiver> void OooO00o(Context context, int i, Class<T> cls) {
        if (!f22309OooO00o) {
            f22309OooO00o = true;
            String str = null;
            if (i == 5) {
                str = "com.xiaomi.mipush.RECEIVE_MESSAGE";
            } else if (i == 6) {
                str = "com.huawei.android.push.intent.REGISTRATION";
            } else if (i == 7) {
                str = "com.meizu.flyme.push.intent.MESSAGE";
            } else if (i == 9) {
                str = "com.vivo.pushclient.action.RECEIVE";
            }
            if (!TextUtils.isEmpty(str)) {
                OooO00o = new C9005ooOo00O0().m20671OooO00o(context, str, (Class) cls);
            }
        }
    }
}
