package com.huawei.updatesdk.sdk.service.download;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;
import com.p118pd.sdk.C8932ooOOO0o;
import com.xiaomi.mipush.sdk.Constants;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.huawei.updatesdk.sdk.service.download.a */
public class C1305a {

    /* renamed from: g */
    public static C1305a f1479g = new C1305a();

    /* renamed from: h */
    public static SparseIntArray f1480h;

    /* renamed from: a */
    public List<String> f1481a = new ArrayList();

    /* renamed from: b */
    public Map<String, SparseIntArray> f1482b = new HashMap();

    /* renamed from: c */
    public String f1483c = null;

    /* renamed from: d */
    public String f1484d = null;

    /* renamed from: e */
    public String f1485e = null;

    /* renamed from: f */
    public String f1486f = null;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1480h = sparseIntArray;
        sparseIntArray.put(1, 3000);
        f1480h.put(2, 6000);
    }

    /* renamed from: a */
    public static C1305a m1699a() {
        return f1479g;
    }

    /* renamed from: a */
    public static String m1700a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            URL url = new URL(str);
            return str2 + url.getFile();
        } catch (MalformedURLException e) {
            C1278a.m1584d("ConnectionParam", "updataIP exception:" + e.getMessage());
            return str;
        }
    }

    /* renamed from: a */
    private void m1701a(String str) {
        this.f1481a.add(str);
        this.f1482b.put(str, f1480h);
    }

    /* renamed from: a */
    public void mo15942a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("ConnectionParam", 0);
        String string = sharedPreferences.getString("appstore.client.connectionparam.ip", null);
        if (string != null) {
            String[] split = TextUtils.split(string, Constants.ACCEPT_TIME_SEPARATOR_SP);
            if (split.length > 0) {
                mo15943b();
                for (String str : split) {
                    if (str.endsWith("\\") || str.endsWith(C8932ooOOO0o.OooO0OO)) {
                        str = str.substring(0, str.length() - 1);
                    }
                    m1701a(str);
                }
            }
        }
        this.f1483c = sharedPreferences.getString("appstore.client.connectionparam.domainname_http", null);
        this.f1484d = sharedPreferences.getString("appstore.client.connectionparam.domainname_https", null);
    }

    /* renamed from: b */
    public synchronized void mo15943b() {
        this.f1481a.clear();
        this.f1482b.clear();
    }

    /* renamed from: c */
    public synchronized String mo15944c() {
        for (String str : this.f1481a) {
            if (str.startsWith("https")) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: d */
    public synchronized List<String> mo15945d() {
        if (this.f1481a.size() <= 0) {
            mo15942a(C1294a.m1650a().mo15900b());
        }
        return this.f1481a;
    }
}
