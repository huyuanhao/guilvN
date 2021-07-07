package com.huawei.hms.api;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.huawei.hms.api.d */
public class C1117d {

    /* renamed from: a */
    public static final C1117d f1147a = new C1117d();

    /* renamed from: b */
    public List<Activity> f1148b = new ArrayList(1);

    /* renamed from: a */
    public void mo15392a(Activity activity) {
        for (Activity activity2 : this.f1148b) {
            if (!(activity2 == null || activity2 == activity || activity2.isFinishing())) {
                activity2.finish();
            }
        }
        this.f1148b.add(activity);
    }

    /* renamed from: b */
    public void mo15393b(Activity activity) {
        this.f1148b.remove(activity);
    }
}
