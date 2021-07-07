package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.service.C4641bf;
import com.xiaomi.push.service.C4642bg;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.hm */
public class C4492hm {

    /* renamed from: a */
    public static C4492hm f12174a;

    /* renamed from: a */
    public final Context f12175a;

    /* renamed from: a */
    public Map<String, AbstractC4493hn> f12176a = new HashMap();

    public C4492hm(Context context) {
        this.f12175a = context;
    }

    /* renamed from: a */
    public static C4492hm m12919a(Context context) {
        if (context == null) {
            AbstractC4163b.m11306d("[TinyDataManager]:mContext is null, TinyDataManager.getInstance(Context) failed.");
            return null;
        }
        if (f12174a == null) {
            synchronized (C4492hm.class) {
                if (f12174a == null) {
                    f12174a = new C4492hm(context);
                }
            }
        }
        return f12174a;
    }

    /* renamed from: a */
    private boolean m12920a(String str, String str2, String str3, String str4, long j, String str5) {
        C4498hs hsVar = new C4498hs();
        hsVar.mo42028d(str3);
        hsVar.mo42024c(str4);
        hsVar.mo42017a(j);
        hsVar.mo42021b(str5);
        hsVar.mo42019a(true);
        hsVar.mo42018a("push_sdk_channel");
        hsVar.mo42030e(str2);
        AbstractC4163b.m11301a("TinyData TinyDataManager.upload item:" + hsVar.mo42029d() + "   ts:" + System.currentTimeMillis());
        return mo42002a(hsVar, str);
    }

    /* renamed from: a */
    public AbstractC4493hn mo42000a() {
        AbstractC4493hn hnVar = this.f12176a.get("UPLOADER_PUSH_CHANNEL");
        if (hnVar != null) {
            return hnVar;
        }
        AbstractC4493hn hnVar2 = this.f12176a.get("UPLOADER_HTTP");
        if (hnVar2 != null) {
            return hnVar2;
        }
        return null;
    }

    /* renamed from: a */
    public Map<String, AbstractC4493hn> m12922a() {
        return this.f12176a;
    }

    /* renamed from: a */
    public void mo42001a(AbstractC4493hn hnVar, String str) {
        if (hnVar == null) {
            AbstractC4163b.m11306d("[TinyDataManager]: please do not add null mUploader to TinyDataManager.");
        } else if (TextUtils.isEmpty(str)) {
            AbstractC4163b.m11306d("[TinyDataManager]: can not add a provider from unkown resource.");
        } else {
            m12922a().put(str, hnVar);
        }
    }

    /* renamed from: a */
    public boolean mo42002a(C4498hs hsVar, String str) {
        if (TextUtils.isEmpty(str)) {
            AbstractC4163b.m11301a("pkgName is null or empty, upload ClientUploadDataItem failed.");
            return false;
        } else if (C4641bf.m14057a(hsVar, false)) {
            return false;
        } else {
            if (TextUtils.isEmpty(hsVar.mo42029d())) {
                hsVar.mo42033f(C4641bf.m14054a());
            }
            hsVar.mo42035g(str);
            C4642bg.m14059a(this.f12175a, hsVar);
            return true;
        }
    }

    /* renamed from: a */
    public boolean mo42003a(String str, String str2, long j, String str3) {
        return m12920a(this.f12175a.getPackageName(), this.f12175a.getPackageName(), str, str2, j, str3);
    }
}
