package com.huawei.hms.api;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.p037c.AbstractC1139h;
import com.huawei.hms.p037c.C1131a;
import com.huawei.hms.p037c.C1137g;
import com.huawei.hms.support.log.C1202a;
import com.huawei.hms.update.p056c.C1230c;
import com.huawei.hms.update.p058e.C1262v;

/* renamed from: com.huawei.hms.api.e */
public final class C1118e extends HuaweiApiAvailability {

    /* renamed from: a */
    public static final C1118e f1149a = new C1118e();

    /* renamed from: a */
    public static C1118e m1043a() {
        return f1149a;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public int isHuaweiMobileNoticeAvailable(Context context) {
        C1131a.m1062a(context, "context must not be null.");
        return new C1137g(context).mo15418b(HuaweiApiAvailability.SERVICES_PACKAGE) < 20600000 ? 2 : 0;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public int isHuaweiMobileServicesAvailable(Context context, int i) {
        C1131a.m1062a(context, "context must not be null.");
        return HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(context, i);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean isUserResolvableError(int i) {
        return i == 1 || i == 2 || i == 6;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void resolveError(Activity activity, int i, int i2) {
        C1131a.m1062a(activity, "activity must not be null.");
        C1202a.m1318b("HuaweiApiAvailabilityImpl", "Enter resolveError, errorCode: " + i);
        if (i == 1 || i == 2) {
            C1262v vVar = new C1262v();
            vVar.mo15804a(true);
            vVar.mo15802a(HuaweiApiAvailability.SERVICES_PACKAGE);
            vVar.mo15801a(HuaweiApiAvailability.getServicesVersionCode());
            vVar.mo15807b(HuaweiApiAvailability.APPID_HMS);
            if (AbstractC1139h.m1081a() == null) {
                AbstractC1139h.m1083a(activity.getApplicationContext());
            }
            vVar.mo15810c(AbstractC1139h.m1086d("hms_update_title"));
            C1230c.m1393a(activity, i2, vVar);
        } else if (i == 6) {
            m1044a(activity, BindingFailedResolution.class.getName(), i2);
        }
    }

    /* renamed from: a */
    public static void m1044a(Activity activity, String str, int i) {
        activity.startActivityForResult(BridgeActivity.getIntentStartBridgeActivity(activity, str), i);
    }
}
