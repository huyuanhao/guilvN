package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;

/* renamed from: com.umeng.analytics.filter.a */
public class C3411a extends EventList {

    /* renamed from: a */
    public C3414d f8407a;

    /* renamed from: b */
    public Object f8408b = new Object();

    public C3411a(String str, String str2) {
        super(str, str2);
    }

    @Override // com.umeng.analytics.filter.EventList
    public void eventListChange() {
        if (!TextUtils.isEmpty(this.mEventList)) {
            synchronized (this.f8408b) {
                this.f8407a = null;
                this.f8407a = new C3414d(false, this.mEventList);
            }
        }
    }

    @Override // com.umeng.analytics.filter.EventList
    public boolean matchHit(String str) {
        boolean a;
        if (TextUtils.isEmpty(this.mEventList)) {
            return false;
        }
        synchronized (this.f8408b) {
            if (this.f8407a == null) {
                this.f8407a = new C3414d(false, this.mEventList);
            }
            a = this.f8407a.mo38689a(str);
        }
        return a;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void setMD5ClearFlag(boolean z) {
        AnalyticsConfig.CLEAR_EKV_BL = z;
    }
}
