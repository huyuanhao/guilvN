package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.service.C4641bf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.xiaomi.push.hl */
public class C4491hl {
    /* renamed from: a */
    public static HashMap<String, ArrayList<C4498hs>> m12915a(Context context, List<C4498hs> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        HashMap<String, ArrayList<C4498hs>> hashMap = new HashMap<>();
        for (C4498hs hsVar : list) {
            m12918a(context, hsVar);
            ArrayList<C4498hs> arrayList = hashMap.get(hsVar.mo42025c());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                hashMap.put(hsVar.mo42025c(), arrayList);
            }
            arrayList.add(hsVar);
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m12916a(Context context, AbstractC4493hn hnVar, HashMap<String, ArrayList<C4498hs>> hashMap) {
        for (Map.Entry<String, ArrayList<C4498hs>> entry : hashMap.entrySet()) {
            try {
                ArrayList<C4498hs> value = entry.getValue();
                if (value != null) {
                    if (value.size() != 0) {
                        AbstractC4163b.m11301a("TinyData is uploaded immediately item size:" + value.size());
                        hnVar.mo42004a(value, value.get(0).mo42031e(), entry.getKey());
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m12917a(Context context, AbstractC4493hn hnVar, List<C4498hs> list) {
        HashMap<String, ArrayList<C4498hs>> a = m12915a(context, list);
        if (a == null || a.size() == 0) {
            AbstractC4163b.m11301a("TinyData TinyDataCacheUploader.uploadTinyData itemsUploading == null || itemsUploading.size() == 0  ts:" + System.currentTimeMillis());
            return;
        }
        m12916a(context, hnVar, a);
    }

    /* renamed from: a */
    public static void m12918a(Context context, C4498hs hsVar) {
        if (hsVar.f12265a) {
            hsVar.mo42018a("push_sdk_channel");
        }
        if (TextUtils.isEmpty(hsVar.mo42029d())) {
            hsVar.mo42033f(C4641bf.m14054a());
        }
        hsVar.mo42020b(System.currentTimeMillis());
        if (TextUtils.isEmpty(hsVar.mo42031e())) {
            hsVar.mo42030e(context.getPackageName());
        }
        if (TextUtils.isEmpty(hsVar.mo42025c())) {
            hsVar.mo42030e(hsVar.mo42031e());
        }
    }
}
