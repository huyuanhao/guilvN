package com.p254ta.utdid2.device;

import android.content.Context;
import com.p254ta.utdid2.p255a.p256a.C3066g;

/* renamed from: com.ta.utdid2.device.UTDevice */
public class UTDevice {
    /* renamed from: d */
    public static String m7191d(Context context) {
        C3077a b = C3078b.m7204b(context);
        return (b == null || C3066g.m7133a(b.mo37306f())) ? "ffffffffffffffffffffffff" : b.mo37306f();
    }

    /* renamed from: e */
    public static String m7192e(Context context) {
        String h = C3079c.m7205a(context).mo37310h();
        return (h == null || C3066g.m7133a(h)) ? "ffffffffffffffffffffffff" : h;
    }

    @Deprecated
    public static String getUtdid(Context context) {
        return m7191d(context);
    }

    @Deprecated
    public static String getUtdidForUpdate(Context context) {
        return m7192e(context);
    }
}
