package com.xiaomi.mipush.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.push.C4415fc;
import com.xiaomi.push.C4417fd;
import java.util.HashSet;
import java.util.Set;

@TargetApi(14)
/* renamed from: com.xiaomi.mipush.sdk.a */
public class C4181a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public Set<String> f11212a = new HashSet();

    /* renamed from: a */
    public static void m11399a(Application application) {
        application.registerActivityLifecycleCallbacks(new C4181a());
    }

    /* renamed from: a */
    public static void m11400a(Context context) {
        m11399a((Application) context.getApplicationContext());
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
        C4417fd a;
        String packageName;
        String a2;
        int i;
        String str;
        Intent intent = activity.getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra(MiPushMessage.KEY_MESSAGE_ID);
            int intExtra = intent.getIntExtra("eventMessageType", -1);
            if (!TextUtils.isEmpty(stringExtra) && intExtra > 0 && !this.f11212a.contains(stringExtra)) {
                this.f11212a.add(stringExtra);
                if (intExtra == 3000) {
                    a = C4417fd.m12519a(activity.getApplicationContext());
                    packageName = activity.getPackageName();
                    a2 = C4415fc.m12511a(intExtra);
                    i = 3008;
                    str = "App calls by business message is visiable";
                } else if (intExtra == 1000) {
                    a = C4417fd.m12519a(activity.getApplicationContext());
                    packageName = activity.getPackageName();
                    a2 = C4415fc.m12511a(intExtra);
                    i = 1008;
                    str = "app calls by notification message is visiable";
                } else {
                    return;
                }
                a.mo41813a(packageName, a2, stringExtra, i, str);
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
