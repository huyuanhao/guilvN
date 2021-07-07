package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;

/* renamed from: com.umeng.analytics.filter.b */
public class C3412b extends EventList {

    /* renamed from: a */
    public C3414d f8409a;

    /* renamed from: b */
    public Object f8410b = new Object();

    public C3412b(String str, String str2) {
        super(str, str2);
    }

    @Override // com.umeng.analytics.filter.EventList
    public void eventListChange() {
        if (!TextUtils.isEmpty(this.mEventList)) {
            synchronized (this.f8410b) {
                this.f8409a = null;
                this.f8409a = new C3414d(true, this.mEventList);
            }
        }
    }

    @Override // com.umeng.analytics.filter.EventList
    public boolean matchHit(String str) {
        boolean a;
        if (TextUtils.isEmpty(this.mEventList)) {
            return true;
        }
        synchronized (this.f8410b) {
            if (this.f8409a == null) {
                this.f8409a = new C3414d(true, this.mEventList);
            }
            a = this.f8409a.mo38689a(str);
        }
        return a;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void setMD5ClearFlag(boolean z) {
        AnalyticsConfig.CLEAR_EKV_WL = z;
    }
}
