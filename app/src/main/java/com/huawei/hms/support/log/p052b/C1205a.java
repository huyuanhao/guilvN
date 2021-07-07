package com.huawei.hms.support.log.p052b;

import android.content.Context;
import android.util.Log;
import com.huawei.hms.support.log.AbstractC1206c;

/* renamed from: com.huawei.hms.support.log.b.a */
public class C1205a implements AbstractC1206c {

    /* renamed from: a */
    public AbstractC1206c f1311a;

    @Override // com.huawei.hms.support.log.AbstractC1206c
    /* renamed from: a */
    public void mo15715a(Context context, String str) {
        AbstractC1206c cVar = this.f1311a;
        if (cVar != null) {
            cVar.mo15715a(context, str);
        }
    }

    @Override // com.huawei.hms.support.log.AbstractC1206c
    /* renamed from: a */
    public void mo15716a(String str, int i, String str2, String str3) {
        Log.println(i, "HMSSDK_" + str2, str3);
        AbstractC1206c cVar = this.f1311a;
        if (cVar != null) {
            cVar.mo15716a(str, i, str2, str3);
        }
    }
}
