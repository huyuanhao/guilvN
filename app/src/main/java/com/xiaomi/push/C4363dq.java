package com.xiaomi.push;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.xiaomi.push.dq */
public class C4363dq implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public Context f11627a;

    /* renamed from: a */
    public String f11628a = "";

    /* renamed from: b */
    public String f11629b;

    public C4363dq(Context context, String str) {
        this.f11627a = context;
        this.f11628a = str;
    }

    /* renamed from: a */
    private void m12117a(String str) {
        C4502hw hwVar = new C4502hw();
        hwVar.mo42048a(str);
        hwVar.mo42046a(System.currentTimeMillis());
        hwVar.mo42047a(EnumC4496hq.ActivityActiveTimeStamp);
        AbstractC4379ef.m12164a(this.f11627a, hwVar);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (!TextUtils.isEmpty(this.f11628a) && !TextUtils.isEmpty(localClassName)) {
            this.f11629b = "";
            if (TextUtils.isEmpty("") || TextUtils.equals(this.f11629b, localClassName)) {
                m12117a(this.f11627a.getPackageName() + "|" + localClassName + Constants.COLON_SEPARATOR + this.f11628a + Constants.ACCEPT_TIME_SEPARATOR_SP + String.valueOf(System.currentTimeMillis() / 1000));
                this.f11628a = "";
                this.f11629b = "";
                return;
            }
            this.f11628a = "";
        }
    }

    public void onActivityResumed(Activity activity) {
        if (TextUtils.isEmpty(this.f11629b)) {
            this.f11629b = activity.getLocalClassName();
        }
        this.f11628a = String.valueOf(System.currentTimeMillis() / 1000);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
