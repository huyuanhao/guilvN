package com.umeng.message;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.common.C3780d;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.C3849m;
import java.util.Iterator;

public class UmengMessageBootReceiver extends BroadcastReceiver {

    /* renamed from: b */
    public static final String f9981b = UmengMessageBootReceiver.class.getName();

    /* renamed from: c */
    public static final String f9982c = "android.intent.action.BOOT_COMPLETED";

    /* renamed from: a */
    public Runnable f9983a = new Runnable() {
        /* class com.umeng.message.UmengMessageBootReceiver.RunnableC37731 */

        public void run() {
            try {
                Iterator<C3849m.C3853c> it = C3849m.m10581a(UmengMessageBootReceiver.this.f9984d).mo39928b().iterator();
                while (it.hasNext()) {
                    C3849m.C3853c next = it.next();
                    if (C3849m.m10581a(UmengMessageBootReceiver.this.f9984d).mo39918a(next.f10452a) == null && next.f10453b.equals(UMessage.DISPLAY_TYPE_NOTIFICATION)) {
                        C3849m.m10581a(UmengMessageBootReceiver.this.f9984d).mo39924a(next.f10452a, 2, System.currentTimeMillis(), "");
                    }
                }
                Iterator<C3849m.C3854d> it2 = C3849m.m10581a(UmengMessageBootReceiver.this.f9984d).mo39935d().iterator();
                while (it2.hasNext()) {
                    C3849m.C3854d next2 = it2.next();
                    if (C3849m.m10581a(UmengMessageBootReceiver.this.f9984d).mo39932c(next2.f10455a) == null && next2.f10457c.equals(UMessage.DISPLAY_TYPE_NOTIFICATION)) {
                        C3849m.m10581a(UmengMessageBootReceiver.this.f9984d).mo39927a(next2.f10455a, next2.f10456b, "9", System.currentTimeMillis());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                UMLog uMLog = UMConfigure.umDebugLog;
                UMLog.mutlInfo(UmengMessageBootReceiver.f9981b, 2, e.toString());
            }
        }
    };

    /* renamed from: d */
    public Context f9984d;

    public void onReceive(Context context, Intent intent) {
        try {
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f9981b, 2, "Boot this system , UmengMessageBootReceiver onReceive()");
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            if (!action.equals("")) {
                UMLog uMLog2 = UMConfigure.umDebugLog;
                String str = f9981b;
                UMLog.mutlInfo(str, 2, "action=" + intent.getAction());
                if (TextUtils.equals(intent.getAction(), f9982c)) {
                    this.f9984d = context;
                    C3780d.m10347a(this.f9983a);
                }
            }
        } catch (Exception e) {
            UMLog uMLog3 = UMConfigure.umDebugLog;
            UMLog.mutlInfo(f9981b, 0, e.toString());
        }
    }
}
