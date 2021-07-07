package com.xiaomi.clientreport.processor;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.clientreport.data.C4164a;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.push.C4291bl;
import java.io.File;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.xiaomi.clientreport.processor.b */
public class C4172b implements IPerfProcessor {

    /* renamed from: a */
    public Context f11186a;

    /* renamed from: a */
    public HashMap<String, HashMap<String, C4164a>> f11187a;

    public C4172b(Context context) {
        this.f11186a = context;
    }

    /* renamed from: a */
    public static String mo41269a(C4164a aVar) {
        return String.valueOf(aVar.production) + "#" + aVar.clientInterfaceId;
    }

    /* renamed from: b */
    private String m11334b(C4164a aVar) {
        String str;
        int i = aVar.production;
        String str2 = aVar.clientInterfaceId;
        if (i <= 0 || TextUtils.isEmpty(str2)) {
            str = "";
        } else {
            str = String.valueOf(i) + "#" + str2;
        }
        File externalFilesDir = this.f11186a.getExternalFilesDir("perf");
        if (externalFilesDir == null) {
            AbstractC4163b.m11306d("cannot get folder when to write perf");
            return null;
        }
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdirs();
        }
        return new File(externalFilesDir, str).getAbsolutePath();
    }

    /* renamed from: c */
    private String m11335c(C4164a aVar) {
        String b = m11334b(aVar);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        for (int i = 0; i < 20; i++) {
            String str = b + i;
            if (C4291bl.m11824a(this.f11186a, str)) {
                return str;
            }
        }
        return null;
    }

    @Override // com.xiaomi.clientreport.processor.AbstractC4173c
    /* renamed from: a */
    public void mo41267a() {
        C4291bl.m11821a(this.f11186a, "perf", "perfUploading");
        File[] a = C4291bl.m11826a(this.f11186a, "perfUploading");
        if (a != null && a.length > 0) {
            for (File file : a) {
                if (file != null) {
                    List<String> a2 = C4175e.m11348a(this.f11186a, file.getAbsolutePath());
                    file.delete();
                    mo41273a(a2);
                }
            }
        }
    }

    @Override // com.xiaomi.clientreport.processor.AbstractC4174d
    /* renamed from: a */
    public void m11337a(C4164a aVar) {
        if ((aVar instanceof PerfClientReport) && this.f11187a != null) {
            PerfClientReport perfClientReport = (PerfClientReport) aVar;
            String a = mo41269a((C4164a) perfClientReport);
            String a2 = C4175e.m11346a(perfClientReport);
            HashMap<String, C4164a> hashMap = this.f11187a.get(a);
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            PerfClientReport perfClientReport2 = (PerfClientReport) hashMap.get(a2);
            if (perfClientReport2 != null) {
                perfClientReport.perfCounts += perfClientReport2.perfCounts;
                perfClientReport.perfLatencies += perfClientReport2.perfLatencies;
            }
            hashMap.put(a2, perfClientReport);
            this.f11187a.put(a, hashMap);
        }
    }

    /* renamed from: a */
    public void mo41273a(List<String> list) {
        C4291bl.m11822a(this.f11186a, list);
    }

    /* renamed from: a */
    public void mo41274a(C4164a[] aVarArr) {
        String c = m11335c(aVarArr[0]);
        if (!TextUtils.isEmpty(c)) {
            C4175e.m11350a(c, aVarArr);
        }
    }

    @Override // com.xiaomi.clientreport.processor.AbstractC4174d
    /* renamed from: b */
    public void mo41272b() {
        HashMap<String, HashMap<String, C4164a>> hashMap = this.f11187a;
        if (hashMap != null) {
            if (hashMap.size() > 0) {
                for (String str : this.f11187a.keySet()) {
                    HashMap<String, C4164a> hashMap2 = this.f11187a.get(str);
                    if (hashMap2 != null && hashMap2.size() > 0) {
                        C4164a[] aVarArr = new C4164a[hashMap2.size()];
                        hashMap2.values().toArray(aVarArr);
                        mo41274a(aVarArr);
                    }
                }
            }
            this.f11187a.clear();
        }
    }

    @Override // com.xiaomi.clientreport.processor.IPerfProcessor
    public void setPerfMap(HashMap<String, HashMap<String, C4164a>> hashMap) {
        this.f11187a = hashMap;
    }
}
