package com.huawei.updatesdk.service.appmgr.bean;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.huawei.updatesdk.p059a.p060a.C1267a;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.AbstractC1288c;
import com.huawei.updatesdk.sdk.p062a.p069d.C1279a;
import com.huawei.updatesdk.sdk.p062a.p069d.p070a.AbstractC1280a;
import com.huawei.updatesdk.sdk.p062a.p069d.p071b.C1282a;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;
import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;
import com.huawei.updatesdk.support.p082b.C1370d;
import com.huawei.updatesdk.support.p083c.C1371a;
import com.p118pd.sdk.LL1i;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.huawei.updatesdk.service.appmgr.bean.a */
public class C1327a extends C1267a {
    public static final String APIMETHOD = "client.https.diffUpgrade";
    public static final int DEFAULT_UPGRADE_RESULT = 0;
    public static final int FULL_UPGRADE_RESULT = 1;
    public static final int INSTALL_CHECK_DEFAULT = 0;
    public static final int PRE_DOWNLOAD_CLOSE = 0;
    public static final String TAG = "UpgradeRequest";
    public static final int TYPE_NOT_PREINSTALL = 0;
    public static final int TYPE_PREINSTALL = 2;
    public static final int TYPE_PREINSTALL_REMOVABLE = 1;
    public String cmp_ = "1";
    public int installCheck_ = 0;
    public int isFullUpgrade_ = 0;
    public int isUpdateSdk_ = 1;
    public int isWlanIdle_ = 0;
    public C1328a json_;
    public String maxMem_;

    /* renamed from: com.huawei.updatesdk.service.appmgr.bean.a$a */
    public static class C1328a extends AbstractC1299b {
        public List<C1329b> params_;

        /* renamed from: a */
        public void mo16134a(List<C1329b> list) {
            this.params_ = list;
        }
    }

    /* renamed from: com.huawei.updatesdk.service.appmgr.bean.a$b */
    public static class C1329b extends AbstractC1299b {
        public String fSha2_;
        public int isPre_;
        public String oldVersion_;
        public String package_;
        public String sSha2_;
        public int targetSdkVersion_;
        public int versionCode_;

        public C1329b() {
        }

        public C1329b(PackageInfo packageInfo) {
            this.package_ = packageInfo.packageName;
            this.versionCode_ = packageInfo.versionCode;
            String str = packageInfo.versionName;
            this.oldVersion_ = str == null ? "null" : str;
            this.targetSdkVersion_ = packageInfo.applicationInfo.targetSdkVersion;
            this.isPre_ = C1327a.m1893b(packageInfo);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                this.sSha2_ = AbstractC1280a.m1588b(C1279a.m1585a(C1370d.m2046a(signatureArr[0].toCharsString())));
            }
            this.fSha2_ = AbstractC1288c.m1619a(packageInfo.applicationInfo.sourceDir, LL1i.OooO0Oo);
        }
    }

    /* renamed from: a */
    public static C1327a m1891a(List<PackageInfo> list) {
        C1327a aVar = new C1327a();
        aVar.mo15923u(APIMETHOD);
        aVar.mo16133j(String.valueOf(C1282a.m1594b(C1294a.m1650a().mo15900b()) / 1024));
        aVar.mo15924v("1.2");
        aVar.mo16132c(0);
        C1328a aVar2 = new C1328a();
        aVar.mo16130a(aVar2);
        ArrayList arrayList = new ArrayList();
        aVar2.mo16134a(arrayList);
        for (PackageInfo packageInfo : list) {
            arrayList.add(new C1329b(packageInfo));
        }
        return aVar;
    }

    /* renamed from: a */
    public static boolean m1892a(ApplicationInfo applicationInfo) {
        String str;
        StringBuilder sb;
        int i = applicationInfo.flags;
        Integer a = C1371a.m2049a();
        if (a != null && (i & a.intValue()) != 0) {
            return true;
        }
        Field b = C1371a.m2052b();
        if (b == null) {
            return false;
        }
        try {
            return (b.getInt(applicationInfo) & CommonNetImpl.FLAG_SHARE_JUMP) != 0;
        } catch (IllegalAccessException e) {
            sb = new StringBuilder();
            sb.append("can not get hwflags");
            str = e.toString();
            sb.append(str);
            C1278a.m1580a(TAG, sb.toString());
            return false;
        } catch (IllegalArgumentException e2) {
            sb = new StringBuilder();
            sb.append("can not get hwflags");
            str = e2.toString();
            sb.append(str);
            C1278a.m1580a(TAG, sb.toString());
            return false;
        }
    }

    /* renamed from: b */
    public static int m1893b(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if ((applicationInfo.flags & 1) == 0) {
            return 0;
        }
        return m1892a(applicationInfo) ? 1 : 2;
    }

    /* renamed from: k */
    public static C1327a m1894k(String str) {
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.packageName = str;
        packageInfo.versionName = "1.0";
        packageInfo.versionCode = 1;
        ApplicationInfo applicationInfo = new ApplicationInfo();
        applicationInfo.targetSdkVersion = 19;
        packageInfo.applicationInfo = applicationInfo;
        ArrayList arrayList = new ArrayList();
        arrayList.add(packageInfo);
        C1327a a = m1891a(arrayList);
        a.mo16131b(1);
        return a;
    }

    /* renamed from: a */
    public void mo16129a(int i) {
        this.installCheck_ = i;
    }

    /* renamed from: a */
    public void mo16130a(C1328a aVar) {
        this.json_ = aVar;
    }

    /* renamed from: b */
    public void mo16131b(int i) {
        this.isFullUpgrade_ = i;
    }

    /* renamed from: c */
    public void mo16132c(int i) {
        this.isWlanIdle_ = i;
    }

    /* renamed from: j */
    public void mo16133j(String str) {
        this.maxMem_ = str;
    }
}
