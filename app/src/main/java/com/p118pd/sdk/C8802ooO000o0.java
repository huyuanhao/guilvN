package com.p118pd.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.netease.nimlib.mixpush.MixPushState;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.Map;

/* renamed from: com.pd.sdk.ooO000o0  reason: case insensitive filesystem */
public class C8802ooO000o0 {
    public static int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static AbstractC8862ooO0o0O f22008OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f22009OooO00o;
    public static boolean OooO0O0;

    public static void OooO00o(AbstractC8862ooO0o0O ooo0o0o) {
        f22008OooO00o = ooo0o0o;
    }

    public static final void OooO0O0() {
        if (OooO00o != 0) {
            C8827ooO0O0OO.OooO00o(C8769oo0ooOOO.OooO00o(), OooO00o);
        }
    }

    public static final void OooO0OO() {
        C8817ooO00oo0.m20449OooO00o((C8817ooO00oo0) null);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC8862ooO0o0O m20440OooO00o() {
        return f22008OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final boolean m20442OooO00o() {
        return f22009OooO00o;
    }

    public static final void OooO0O0(C8817ooO00oo0 ooo00oo0) {
        if (OooO00o != 0) {
            if (ooo00oo0 == null || !ooo00oo0.m20452OooO00o()) {
                C8817ooO00oo0.m20449OooO00o((C8817ooO00oo0) null);
                OooO00o((C8817ooO00oo0) null);
            } else if (!ooo00oo0.equals(C8817ooO00oo0.OooO00o())) {
                OooO00o(ooo00oo0);
            } else {
                C8783oo0oooOO.OooOOOO("push token no change cancel commit to server");
            }
        }
    }

    public static final int OooO00o() {
        return OooO00o;
    }

    public static final void OooO00o(MixPushState mixPushState) {
        C8817ooO00oo0 OooO00o2;
        if (mixPushState != null) {
            C8783oo0oooOO.OooOOOO("after login, mix push state=" + mixPushState);
            String lastDeviceId = mixPushState.getLastDeviceId();
            String OooO00o3 = C9098ooo0O0oo.m20766OooO00o();
            boolean z = !TextUtils.isEmpty(lastDeviceId) && !TextUtils.isEmpty(OooO00o3) && !lastDeviceId.equals(OooO00o3);
            boolean OooO00o4 = C8770oo0ooOOo.m20408OooO00o();
            int pushType = mixPushState.getPushType();
            if (pushType == 8 && (OooO00o2 = C8817ooO00oo0.OooO00o()) != null && OooO00o2.m20452OooO00o()) {
                pushType = OooO00o2.m20450OooO00o();
            }
            OooO00o(C8769oo0ooOOO.OooO00o(), pushType, mixPushState.hasPushed(), z, OooO00o4);
        }
    }

    public static final void OooO00o(Context context, int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        OooO00o = i;
        f22009OooO00o = z;
        boolean z5 = true;
        if (i == 0 || C8828ooO0O0Oo.OooO00o(context, i)) {
            z4 = true;
        } else {
            OooO00o = 0;
            C8783oo0oooOO.OooOOOO("afterLogin: local push environment unsupport");
            z4 = false;
        }
        if (OooO00o == 0 || !z3) {
            z5 = false;
        }
        C8817ooO00oo0 OooO00o2 = C8817ooO00oo0.OooO00o();
        C8783oo0oooOO.OooOOOO("afterLogin: pushType " + i + " hasPushed " + z + " deviceChanged " + z2 + " localEnabled " + z3 + " localEnvSupport " + z4 + " localPushInfo " + OooO00o2);
        if (OooO00o2 == null || !OooO00o2.m20452OooO00o()) {
            if (z && !z5) {
                OooO00o((C8817ooO00oo0) null);
            }
        } else if (!z || !z5 || i != OooO00o2.m20450OooO00o()) {
            C8817ooO00oo0.m20449OooO00o((C8817ooO00oo0) null);
        }
        if (z5) {
            if (z2) {
                C8817ooO00oo0.m20449OooO00o((C8817ooO00oo0) null);
            }
            C8827ooO0O0OO.OooO0O0(context, i);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final void m20441OooO00o() {
        C8783oo0oooOO.OooOOOO("after sync, set hasPushed to false");
        f22009OooO00o = false;
    }

    public static final void OooO00o(int i) {
        if (OooO00o == 8) {
            OooO00o = i;
        }
        if (OooO00o != 0 && C8828ooO0O0Oo.OooO00o(C8769oo0ooOOO.OooO00o(), OooO00o)) {
            C8827ooO0O0OO.OooO0O0(C8769oo0ooOOO.OooO00o(), OooO00o);
        }
    }

    public static final void OooO00o(Context context, Map<String, String> map) {
        if (context != null) {
            AbstractC8862ooO0o0O ooo0o0o = f22008OooO00o;
            if ((ooo0o0o == null || !ooo0o0o.OooO00o(context, map)) && OooO00o != 6) {
                Intent intent = new Intent();
                intent.setComponent(OooO00o(context));
                intent.addFlags(603979776);
                intent.setAction("android.intent.action.VIEW");
                intent.addFlags(CommonNetImpl.FLAG_AUTH);
                context.startActivity(intent);
            }
        }
    }

    public static ComponentName OooO00o(Context context) {
        return context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent();
    }

    public static void OooO00o(C8817ooO00oo0 ooo00oo0) {
        C8783oo0oooOO.OooOOOO("commit mix push token:" + ooo00oo0);
        AbstractC8861ooO0o00o OooO00o2 = C9105ooo0oooO.OooO00o().m20772OooO00o();
        if (OooO00o2 != null) {
            OooO00o2.OooO00o(ooo00oo0);
        }
    }
}
