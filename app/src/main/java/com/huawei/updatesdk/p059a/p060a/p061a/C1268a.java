package com.huawei.updatesdk.p059a.p060a.p061a;

import android.content.Context;
import android.os.Build;
import android.os.SystemProperties;
import com.huawei.updatesdk.p059a.p060a.C1267a;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.p071b.C1282a;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;
import com.huawei.updatesdk.service.otaupdate.C1362e;
import com.huawei.updatesdk.support.p085e.C1379c;

/* renamed from: com.huawei.updatesdk.a.a.a.a */
public final class C1268a extends C1267a {
    public static final String APIMETHOD = "client.https.front";
    public static final int SYSTEM_32 = 1;
    public static final int SYSTEM_64 = 2;
    public String accountZone_;
    public String buildNumber_;
    public String density_;
    public int emuiApiLevel_ = 0;
    public String emuiVer_ = null;
    public String firmwareVersion_;
    public int gmsSupport_;
    public int isSubUser_ = 0;
    public String packageName_;
    public String phoneType_;
    public String resolution_;
    public String screen_;
    public int sysBits_ = 1;
    public String theme_;
    public int versionCode_;
    public String version_;
    public int zone_;

    /* renamed from: f */
    public static C1268a m1540f() {
        C1268a aVar = new C1268a();
        Context b = C1294a.m1650a().mo15900b();
        int i = 1;
        aVar.mo15834b(true);
        aVar.mo15831a((String) null);
        aVar.mo15832a(false);
        aVar.mo15923u(APIMETHOD);
        aVar.mo15853j(C1282a.m1607h());
        aVar.mo15844h(C1282a.m1597c());
        aVar.mo15847a(1);
        aVar.mo15856m(C1282a.m1600e(b));
        aVar.mo15857n(C1282a.m1592a());
        aVar.mo15858o(Build.MODEL);
        aVar.mo15855l(C1282a.m1595b());
        aVar.mo15854k(C1282a.m1598d());
        aVar.mo15848b(C1282a.m1596c(b));
        aVar.mo15849c(C1282a.m1603f() ? 1 : 0);
        aVar.mo15859p("true");
        aVar.mo15860q(C1282a.m1598d());
        aVar.mo15861r(C1294a.m1650a().mo15900b().getPackageName());
        aVar.mo15862s(C1379c.m2071a().mo16209c());
        aVar.mo15852f(C1379c.m2071a().mo16208b());
        aVar.mo15863t(C1362e.m2017a().mo16190c());
        if (C1282a.m1604g() == 0) {
            i = 0;
        }
        aVar.mo15850d(i);
        aVar.mo15851e(m1541j());
        return aVar;
    }

    /* renamed from: j */
    public static int m1541j() {
        int i = SystemProperties.get("ro.product.cpu.abi", "").contains("arm64") ? 2 : 1;
        C1278a.m1580a("StartupRequest", "systeAbi:" + i);
        return i;
    }

    /* renamed from: a */
    public void mo15847a(int i) {
        this.zone_ = i;
    }

    /* renamed from: b */
    public void mo15848b(int i) {
        this.versionCode_ = i;
    }

    /* renamed from: c */
    public void mo15849c(int i) {
        this.gmsSupport_ = i;
    }

    /* renamed from: d */
    public void mo15850d(int i) {
        this.isSubUser_ = i;
    }

    /* renamed from: e */
    public void mo15851e(int i) {
        this.sysBits_ = i;
    }

    /* renamed from: f */
    public void mo15852f(int i) {
        this.emuiApiLevel_ = i;
    }

    /* renamed from: j */
    public void mo15853j(String str) {
        this.firmwareVersion_ = str;
    }

    /* renamed from: k */
    public void mo15854k(String str) {
        this.screen_ = str;
    }

    /* renamed from: l */
    public void mo15855l(String str) {
        this.density_ = str;
    }

    /* renamed from: m */
    public void mo15856m(String str) {
        this.version_ = str;
    }

    /* renamed from: n */
    public void mo15857n(String str) {
        this.buildNumber_ = str;
    }

    /* renamed from: o */
    public void mo15858o(String str) {
        this.phoneType_ = str;
    }

    /* renamed from: p */
    public void mo15859p(String str) {
        this.theme_ = str;
    }

    /* renamed from: q */
    public void mo15860q(String str) {
        this.resolution_ = str;
    }

    /* renamed from: r */
    public void mo15861r(String str) {
        this.packageName_ = str;
    }

    /* renamed from: s */
    public void mo15862s(String str) {
        this.emuiVer_ = str;
    }

    /* renamed from: t */
    public void mo15863t(String str) {
        this.accountZone_ = str;
    }
}
