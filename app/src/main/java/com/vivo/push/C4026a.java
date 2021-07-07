package com.vivo.push;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: com.vivo.push.a */
public final class C4026a {

    /* renamed from: a */
    public Bundle f10890a;

    /* renamed from: b */
    public String f10891b;

    /* renamed from: c */
    public String f10892c;

    public C4026a(String str, String str2, Bundle bundle) {
        this.f10891b = str;
        this.f10892c = str2;
        this.f10890a = bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x001f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.vivo.push.C4026a m10866a(android.content.Intent r6) {
        /*
            java.lang.String r0 = "BundleWapper"
            r1 = 0
            if (r6 != 0) goto L_0x000b
            java.lang.String r6 = "create error : intent is null"
            com.vivo.push.util.C4146p.m11204a(r0, r6)
            return r1
        L_0x000b:
            android.os.Bundle r2 = r6.getExtras()
            if (r2 == 0) goto L_0x001e
            java.lang.String r3 = "client_pkgname"
            java.lang.String r3 = r2.getString(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r3 = r1
        L_0x001f:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x002a
            java.lang.String r4 = "create warning: pkgName is null"
            com.vivo.push.util.C4146p.m11211b(r0, r4)
        L_0x002a:
            java.lang.String r4 = r6.getPackage()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L_0x004f
            android.content.ComponentName r4 = r6.getComponent()
            if (r4 != 0) goto L_0x003b
            goto L_0x0043
        L_0x003b:
            android.content.ComponentName r6 = r6.getComponent()
            java.lang.String r1 = r6.getPackageName()
        L_0x0043:
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 == 0) goto L_0x004e
            java.lang.String r6 = "create warning: targetPkgName is null"
            com.vivo.push.util.C4146p.m11211b(r0, r6)
        L_0x004e:
            r4 = r1
        L_0x004f:
            com.vivo.push.a r6 = new com.vivo.push.a
            r6.<init>(r3, r4, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.C4026a.m10866a(android.content.Intent):com.vivo.push.a");
    }

    /* renamed from: b */
    public final int mo40883b(String str, int i) {
        Bundle bundle = this.f10890a;
        return bundle == null ? i : bundle.getInt(str, i);
    }

    /* renamed from: c */
    public final Serializable mo40887c(String str) {
        Bundle bundle = this.f10890a;
        if (bundle == null) {
            return null;
        }
        return bundle.getSerializable(str);
    }

    /* renamed from: d */
    public final boolean mo40888d(String str) {
        Bundle bundle = this.f10890a;
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean(str, false);
    }

    /* renamed from: b */
    public final ArrayList<String> mo40886b(String str) {
        Bundle bundle = this.f10890a;
        if (bundle == null) {
            return null;
        }
        return bundle.getStringArrayList(str);
    }

    /* renamed from: b */
    public final long mo40884b(String str, long j) {
        Bundle bundle = this.f10890a;
        return bundle == null ? j : bundle.getLong(str, j);
    }

    /* renamed from: b */
    public final Bundle mo40885b() {
        return this.f10890a;
    }

    /* renamed from: a */
    public final void mo40877a(String str, int i) {
        if (this.f10890a == null) {
            this.f10890a = new Bundle();
        }
        this.f10890a.putInt(str, i);
    }

    /* renamed from: a */
    public final void mo40878a(String str, long j) {
        if (this.f10890a == null) {
            this.f10890a = new Bundle();
        }
        this.f10890a.putLong(str, j);
    }

    /* renamed from: a */
    public final void mo40880a(String str, String str2) {
        if (this.f10890a == null) {
            this.f10890a = new Bundle();
        }
        this.f10890a.putString(str, str2);
    }

    /* renamed from: a */
    public final void mo40879a(String str, Serializable serializable) {
        if (this.f10890a == null) {
            this.f10890a = new Bundle();
        }
        this.f10890a.putSerializable(str, serializable);
    }

    /* renamed from: a */
    public final void mo40882a(String str, boolean z) {
        if (this.f10890a == null) {
            this.f10890a = new Bundle();
        }
        this.f10890a.putBoolean(str, z);
    }

    /* renamed from: a */
    public final void mo40881a(String str, ArrayList<String> arrayList) {
        if (this.f10890a == null) {
            this.f10890a = new Bundle();
        }
        this.f10890a.putStringArrayList(str, arrayList);
    }

    /* renamed from: a */
    public final String mo40876a(String str) {
        Bundle bundle = this.f10890a;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str);
    }

    /* renamed from: a */
    public final String mo40875a() {
        return this.f10891b;
    }
}
