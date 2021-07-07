package com.huawei.updatesdk.service.p078a;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;

/* renamed from: com.huawei.updatesdk.service.a.b */
public class C1326b {

    /* renamed from: a */
    public SharedPreferences f1584a;

    public C1326b(SharedPreferences sharedPreferences) {
        this.f1584a = sharedPreferences;
    }

    /* renamed from: a */
    public static C1326b m1885a(String str, Context context) {
        return new C1326b(context.getSharedPreferences(str, 0));
    }

    /* renamed from: a */
    public void mo16072a(String str, long j) {
        try {
            SharedPreferences.Editor edit = this.f1584a.edit();
            edit.putLong(str, j);
            edit.commit();
        } catch (Exception e) {
            C1278a.m1581a("SharedPreferencesWrapper", "putLong error!!key:" + str, e);
        }
    }

    /* renamed from: a */
    public void mo16073a(String str, String str2) {
        try {
            SharedPreferences.Editor edit = this.f1584a.edit();
            edit.putString(str, str2);
            edit.commit();
        } catch (Exception e) {
            C1278a.m1581a("SharedPreferencesWrapper", "putString error!!key:" + str, e);
        }
    }

    /* renamed from: b */
    public long mo16074b(String str, long j) {
        try {
            return this.f1584a.getLong(str, j);
        } catch (Exception unused) {
            this.f1584a.edit().remove(str).commit();
            return j;
        }
    }

    /* renamed from: b */
    public String mo16075b(String str, String str2) {
        try {
            return this.f1584a.getString(str, str2);
        } catch (Exception unused) {
            this.f1584a.edit().remove(str).commit();
            return str2;
        }
    }
}
