package com.huawei.hms.update.p053a;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.huawei.hms.update.a.a */
public class C1208a {

    /* renamed from: a */
    public String f1322a;

    /* renamed from: b */
    public int f1323b;

    /* renamed from: c */
    public String f1324c;

    /* renamed from: d */
    public int f1325d;

    /* renamed from: b */
    private void m1343b(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.huawei.hms.update.DOWNLOAD_RECORD" + str, 0).edit();
        edit.putString("mUri", this.f1322a);
        edit.putInt("mSize", this.f1323b);
        edit.putString("mHash", this.f1324c);
        edit.putInt("mReceived", this.f1325d);
        edit.commit();
    }

    /* renamed from: a */
    public void mo15724a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.huawei.hms.update.DOWNLOAD_RECORD" + str, 0);
        this.f1322a = sharedPreferences.getString("mUri", "");
        this.f1323b = sharedPreferences.getInt("mSize", 0);
        this.f1324c = sharedPreferences.getString("mHash", "");
        this.f1325d = sharedPreferences.getInt("mReceived", 0);
    }

    /* renamed from: a */
    public void mo15725a(String str, int i, String str2) {
        this.f1322a = str;
        this.f1323b = i;
        this.f1324c = str2;
        this.f1325d = 0;
    }

    /* renamed from: b */
    public int mo15726b() {
        return this.f1325d;
    }

    /* renamed from: b */
    public boolean mo15727b(String str, int i, String str2) {
        String str3;
        String str4;
        return str != null && str2 != null && (str3 = this.f1322a) != null && str3.equals(str) && this.f1323b == i && (str4 = this.f1324c) != null && str4.equals(str2) && this.f1325d <= this.f1323b;
    }

    /* renamed from: a */
    public void mo15723a(Context context, int i, String str) {
        this.f1325d = i;
        m1343b(context, str);
    }

    /* renamed from: a */
    public int mo15722a() {
        return this.f1323b;
    }
}
