package com.p118pd.sdk;

import android.app.Activity;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.widget.FrameLayout;

/* renamed from: com.pd.sdk.o0o0o00O  reason: case insensitive filesystem */
public abstract class AbstractC7611o0o0o00O extends FrameLayout {
    public Activity OooO00o;

    public AbstractC7611o0o0o00O(Activity activity) {
        super(activity);
        this.OooO00o = activity;
    }

    public abstract void OooO00o();

    public abstract void OooO00o(String str);

    public void OooO00o(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            CookieSyncManager.createInstance(this.OooO00o.getApplicationContext()).sync();
            CookieManager.getInstance().setCookie(str, str2);
            CookieSyncManager.getInstance().sync();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m19247OooO00o();
}
