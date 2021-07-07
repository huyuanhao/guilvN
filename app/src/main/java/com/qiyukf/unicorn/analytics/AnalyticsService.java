package com.qiyukf.unicorn.analytics;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1861b;
import com.qiyukf.basesdk.p138c.p143d.C1863d;
import com.qiyukf.unicorn.analytics.C2379a;

public class AnalyticsService extends IntentService {
    public AnalyticsService() {
        super(C2379a.f4765a);
    }

    /* renamed from: a */
    private void m5195a() {
        if (C1861b.m3533f(this)) {
            C2385c.m5223a();
        }
    }

    /* renamed from: a */
    public static void m5196a(Context context) {
        Intent intent = new Intent(context, AnalyticsService.class);
        intent.setAction("com.qiyukf.action.AUTO_UPLOAD");
        C1863d.m3547a(context, intent);
        C1709a.m3011a(C2379a.f4765a, "try to upload log");
    }

    /* renamed from: a */
    public static void m5197a(Context context, Throwable th, C2379a.EnumC2383b bVar) {
        Intent intent = new Intent(context, AnalyticsService.class);
        intent.setAction("com.qiyukf.action.AUTO_ERROR");
        intent.putExtra("com.qiyukf.extra.ERROR_MESSAGE", th);
        intent.putExtra("com.qiyukf.extra.ERROR_TYPE", bVar);
        C1863d.m3547a(context, intent);
        C1709a.m3011a(C2379a.f4765a, "try to save error log");
    }

    public void onHandleIntent(@Nullable Intent intent) {
        if (intent != null) {
            try {
                if (!TextUtils.isEmpty(intent.getAction())) {
                    if (!C2379a.m5202a()) {
                        C1709a.m3020e(C2379a.f4765a, "Analytics not init");
                    } else if (C2384b.m5214a()) {
                        if (TextUtils.equals(intent.getAction(), "com.qiyukf.action.AUTO_ERROR")) {
                            C2379a.m5201a((Throwable) intent.getSerializableExtra("com.qiyukf.extra.ERROR_MESSAGE"), (C2379a.EnumC2383b) intent.getSerializableExtra("com.qiyukf.extra.ERROR_TYPE"));
                            m5195a();
                        } else if (TextUtils.equals(intent.getAction(), "com.qiyukf.action.AUTO_UPLOAD")) {
                            m5195a();
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
