package com.huawei.updatesdk.support.p087pm;

import android.content.ContextWrapper;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;
import com.huawei.updatesdk.sdk.service.p075b.C1296b;
import com.huawei.updatesdk.support.p082b.C1368b;
import com.huawei.updatesdk.support.p083c.C1371a;
import com.huawei.updatesdk.support.p084d.C1375c;
import com.huawei.updatesdk.support.p087pm.C1392c;
import com.huawei.updatesdk.support.p087pm.C1395d;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.huawei.updatesdk.support.pm.g */
public class C1399g {

    /* renamed from: a */
    public static final C1395d f1724a = new C1395d();

    /* renamed from: b */
    public static final ExecutorService f1725b = Executors.newFixedThreadPool(1);

    /* renamed from: com.huawei.updatesdk.support.pm.g$a */
    public static final class AsyncTaskC1400a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        public final String f1726a;

        /* renamed from: b */
        public final int f1727b;

        /* renamed from: c */
        public boolean f1728c = false;

        /* renamed from: d */
        public C1391b f1729d;

        public AsyncTaskC1400a(String str, int i, boolean z) {
            this.f1726a = str;
            this.f1727b = i;
            this.f1728c = z;
        }

        /* renamed from: a */
        private void m2137a() {
            if (!TextUtils.isEmpty(this.f1729d.mo16244f())) {
                File file = new File(this.f1729d.mo16244f());
                if (file.exists() && !file.delete()) {
                    C1278a.m1584d("PackageService", "file delete error.");
                }
            }
        }

        /* renamed from: a */
        public static void m2138a(String str, int i) {
            new AsyncTaskC1400a(str, i, false).execute(new Void[0]);
        }

        /* renamed from: a */
        public static void m2139a(String str, int i, boolean z) {
            new AsyncTaskC1400a(str, i, z).execute(new Void[0]);
        }

        /* renamed from: a */
        private void m2140a(String str, File file) {
            String str2 = str + File.separator + file.getName();
            File file2 = new File(str);
            if (!file2.exists() && !file2.mkdirs()) {
                C1278a.m1584d("PackageService", "getbackFile mkdirs failed!");
            }
            File file3 = new File(str2);
            if (C1398f.m2128a(file, file3)) {
                File parentFile = file3.getParentFile();
                if (parentFile != null) {
                    parentFile.setExecutable(true, false);
                }
                file3.setReadable(true, false);
                this.f1729d.mo16239b(str2);
                Thread thread = new Thread(new RunnableC1397e(C1294a.m1650a().mo15900b(), this.f1729d));
                thread.setName("install|pkg:" + this.f1729d.mo16243e() + "|path:" + this.f1729d.mo16244f());
                thread.start();
            } else if (!m2142b()) {
                C1399g.m2133a(5, 0);
            } else {
                this.f1728c = false;
            }
        }

        /* renamed from: a */
        private boolean m2141a(String str) {
            String str2;
            C1391b b = C1399g.m2135b(str);
            this.f1729d = b;
            if (b == null) {
                return false;
            }
            if (1 == this.f1727b) {
                if (!TextUtils.isEmpty(b.mo16244f())) {
                    C1399g.f1724a.remove(C1392c.EnumC1394b.INSTALL);
                    return C1371a.m2051a(this.f1729d.mo16244f());
                }
            } else if (this.f1728c) {
                b.mo16238b(b.mo16246h() + 1);
                if (this.f1729d.mo16246h() >= C1368b.m2039b().length) {
                    str2 = "getRetryBackupPaths large,can not change file path to retry install";
                } else {
                    String str3 = C1368b.m2039b()[this.f1729d.mo16246h()];
                    File file = new File(this.f1729d.mo16244f());
                    if (!file.exists()) {
                        str2 = "file do not exist,can not change file path to retry install";
                    } else {
                        m2140a(str3, file);
                    }
                }
                C1278a.m1584d("PackageService", str2);
                this.f1728c = false;
                return false;
            } else {
                m2137a();
            }
            return false;
        }

        /* renamed from: b */
        private boolean m2142b() {
            return Build.VERSION.SDK_INT < 23 || -1 != new ContextWrapper(C1294a.m1650a().mo15900b()).checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE");
        }

        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            boolean a = m2141a(this.f1726a);
            C1391b bVar = this.f1729d;
            if (bVar != null && C1392c.EnumC1394b.INSTALL == bVar.mo16245g() && 1 != this.f1727b && !this.f1728c && this.f1729d.mo16246h() > -1) {
                m2137a();
            }
            return Boolean.valueOf(a);
        }

        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            super.onPostExecute(bool);
        }
    }

    /* renamed from: a */
    public static C1391b m2132a(String str, C1395d.EnumC1396a aVar) {
        C1391b a = f1724a.mo16249a(str, aVar);
        if (a != null) {
            return a;
        }
        return null;
    }

    /* renamed from: a */
    public static void m2133a(int i, int i2) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putInt("INSTALL_STATE", i);
        bundle.putInt("INSTALL_TYPE", i2);
        intent.putExtras(bundle);
        C1375c.m2059a().mo16207c(C1296b.m1655a(intent));
    }

    /* renamed from: a */
    public static void m2134a(String str, String str2, Object obj) {
        m2136b(str, str2, obj);
    }

    /* renamed from: b */
    public static C1391b m2135b(String str) {
        return m2132a(str, C1395d.EnumC1396a.INSTALL_TYPE);
    }

    /* renamed from: b */
    public static synchronized void m2136b(String str, String str2, Object obj) {
        synchronized (C1399g.class) {
            C1278a.m1580a("PackageService", "process:processType=install,path=" + str + ",packageName:" + str2 + ",isNow=" + false);
            if (TextUtils.isEmpty(str)) {
                C1278a.m1584d("PackageService", "install failed!!!path is empty!!!!");
                return;
            }
            C1391b bVar = new C1391b(str2, str, obj);
            bVar.mo16231a(C1392c.EnumC1393a.WAIT_INSTALL);
            bVar.mo16235a(false);
            if (bVar.mo16242d() == null) {
                C1278a.m1580a("PackageService", "task.param is null!!");
            }
            f1724a.put(str2, bVar);
            bVar.mo16232a(C1392c.EnumC1394b.INSTALL);
            Thread thread = new Thread(new RunnableC1397e(C1294a.m1650a().mo15900b(), bVar));
            thread.setName("install|pkg:" + bVar.mo16243e() + "|path:" + bVar.mo16244f());
            thread.start();
        }
    }
}
