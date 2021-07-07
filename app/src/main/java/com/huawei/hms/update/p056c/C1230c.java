package com.huawei.hms.update.p056c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.p037c.C1137g;
import com.huawei.hms.p037c.C1141j;
import com.huawei.hms.support.log.C1202a;
import com.huawei.hms.update.p058e.AbstractC1232a;
import com.huawei.hms.update.p058e.C1262v;
import com.p118pd.sdk.C8413oOoo0o;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.huawei.hms.update.c.c */
public class C1230c {
    /* renamed from: a */
    public static boolean m1397a(Context context, String str) {
        C1137g.EnumC1138a a = new C1137g(context).mo15416a(str);
        C1202a.m1318b("UpdateManager", "app is: " + str + ";status is:" + a);
        return C1137g.EnumC1138a.ENABLED == a;
    }

    /* renamed from: b */
    public static void m1398b(Activity activity, ArrayList<Integer> arrayList) {
        if (!m1397a(activity, C8413oOoo0o.f21545OooO0O0) || C8413oOoo0o.f21545OooO0O0.equals(activity.getPackageName())) {
            arrayList.add(4);
        } else {
            arrayList.add(5);
        }
    }

    /* renamed from: b */
    public static boolean m1399b(Context context) {
        int b = new C1137g(context).mo15418b(C8413oOoo0o.f21545OooO0O0);
        C1202a.m1318b("UpdateManager", "getHiappVersion is " + b);
        return ((long) b) >= 70203000;
    }

    /* renamed from: a */
    public static boolean m1396a(Context context) {
        return m1397a(context, "com.android.vending") && m1395a();
    }

    /* renamed from: a */
    public static boolean m1395a() {
        boolean a = new C1227a().mo15755a(1000, TimeUnit.MILLISECONDS);
        C1202a.m1318b("UpdateManager", "ping google status is:" + a);
        return a;
    }

    /* renamed from: a */
    public static void m1393a(Activity activity, int i, C1262v vVar) {
        if (activity != null && vVar != null) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(vVar.mo15812e())) {
                m1394a(activity, arrayList);
            } else {
                m1398b(activity, arrayList);
            }
            vVar.mo15803a(arrayList);
            Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, AbstractC1232a.m1400a(((Integer) arrayList.get(0)).intValue()));
            intentStartBridgeActivity.putExtra(BridgeActivity.EXTRA_DELEGATE_UPDATE_INFO, vVar);
            activity.startActivityForResult(intentStartBridgeActivity, i);
        }
    }

    /* renamed from: a */
    public static void m1394a(Activity activity, ArrayList<Integer> arrayList) {
        if (!C1141j.m1099b() || !C1141j.m1094a()) {
            if (m1397a(activity, C8413oOoo0o.f21545OooO0O0) && !C8413oOoo0o.f21545OooO0O0.equals(activity.getPackageName())) {
                arrayList.add(5);
            } else if (m1396a(activity)) {
                arrayList.add(2);
            } else {
                arrayList.add(6);
            }
        } else if (!m1397a(activity, C8413oOoo0o.f21545OooO0O0) || !m1399b(activity)) {
            arrayList.add(6);
        } else {
            arrayList.add(0);
            arrayList.add(6);
        }
    }
}
