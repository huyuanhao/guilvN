package com.huawei.updatesdk.service.otaupdate;

import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.service.download.bean.DownloadTask;
import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1298a;
import com.huawei.updatesdk.sdk.service.p076c.p077a.C1301c;
import com.huawei.updatesdk.sdk.service.p076c.p077a.C1302d;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.appmgr.bean.C1327a;
import com.huawei.updatesdk.service.appmgr.bean.C1330b;
import com.huawei.updatesdk.service.deamon.download.C1340d;
import com.huawei.updatesdk.service.deamon.download.DownloadService;
import com.huawei.updatesdk.service.deamon.download.SecurityDownloadTask;
import com.huawei.updatesdk.service.p079b.p080a.C1332b;
import com.p118pd.sdk.C8413oOoo0o;
import java.util.List;

/* renamed from: com.huawei.updatesdk.service.otaupdate.d */
public class C1359d {

    /* renamed from: a */
    public static AbstractC1356a f1646a;

    /* renamed from: com.huawei.updatesdk.service.otaupdate.d$a */
    public static class C1361a implements AbstractC1298a {
        public C1361a() {
        }

        @Override // com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1298a
        /* renamed from: a */
        public void mo15912a(C1301c cVar, C1302d dVar) {
        }

        @Override // com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1298a
        /* renamed from: b */
        public void mo15913b(C1301c cVar, C1302d dVar) {
            List<ApkUpgradeInfo> list;
            if (dVar instanceof C1330b) {
                C1330b bVar = (C1330b) dVar;
                if (dVar.mo15929c() == 0 && dVar.mo15930d() == 0) {
                    List<ApkUpgradeInfo> list2 = bVar.list_;
                    if ((list2 != null && list2.size() != 0) || ((list = bVar.notRcmList_) != null && list.size() != 0)) {
                        ApkUpgradeInfo b = C1359d.m2013b(bVar.list_);
                        if (C1359d.f1646a != null) {
                            C1359d.f1646a.mo16158a(b);
                        }
                    } else if (C1359d.f1646a != null) {
                        C1359d.f1646a.mo16156a(dVar.mo15929c());
                    }
                } else if (C1359d.f1646a != null) {
                    C1359d.f1646a.mo16159b(dVar.mo15929c());
                }
            } else if (C1359d.f1646a != null) {
                C1359d.f1646a.mo16156a(dVar.mo15929c());
            }
        }
    }

    /* renamed from: a */
    public static void m2009a() {
        C1332b.m1903a(C1327a.m1894k(C8413oOoo0o.f21545OooO0O0), new C1361a());
    }

    /* renamed from: a */
    public static void m2010a(ApkUpgradeInfo apkUpgradeInfo) {
        DownloadService e = C1340d.m1934b().mo16152e();
        if (e != null) {
            DownloadTask b = e.mo16137b(apkUpgradeInfo.getPackage_());
            if (b == null) {
                SecurityDownloadTask securityDownloadTask = new SecurityDownloadTask();
                securityDownloadTask.mo15956a(0);
                securityDownloadTask.mo15976d(apkUpgradeInfo.getDownurl_());
                securityDownloadTask.mo15983f(apkUpgradeInfo.getPackage_());
                securityDownloadTask.mo15957a((long) apkUpgradeInfo.getSize_());
                securityDownloadTask.mo15973c(apkUpgradeInfo.getSha256_());
                e.mo16136a(securityDownloadTask);
                AbstractC1356a aVar = f1646a;
                if (aVar != null) {
                    aVar.mo16160b(apkUpgradeInfo);
                }
            } else if (b.mo15992n() > 4) {
                e.mo16138b(b);
            }
        } else {
            C1278a.m1580a("MarketDownloadManager", "downloadService == NULL");
        }
    }

    /* renamed from: a */
    public static void m2011a(AbstractC1356a aVar) {
        f1646a = aVar;
    }

    /* renamed from: a */
    public static void m2012a(String str) {
        C1340d b = C1340d.m1934b();
        if (b != null && b.mo16152e() != null) {
            b.mo16152e().mo16135a(str);
        }
    }

    /* renamed from: b */
    public static ApkUpgradeInfo m2013b(List<ApkUpgradeInfo> list) {
        if (list == null) {
            return null;
        }
        for (ApkUpgradeInfo apkUpgradeInfo : list) {
            if (C8413oOoo0o.f21545OooO0O0.equals(apkUpgradeInfo.getPackage_())) {
                return apkUpgradeInfo;
            }
        }
        return null;
    }
}
