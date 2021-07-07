package com.qiyukf.nim.uikit.common.media.picker.model;

import android.net.Uri;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.common.media.picker.model.a */
public final class C1914a implements Serializable {
    public static final long serialVersionUID = 1;

    /* renamed from: a */
    public int f3597a;

    /* renamed from: b */
    public String f3598b;

    /* renamed from: c */
    public String f3599c;

    /* renamed from: d */
    public String f3600d;

    /* renamed from: e */
    public List<PhotoInfo> f3601e;

    /* renamed from: f */
    public String f3602f;

    /* renamed from: a */
    public final int mo34258a() {
        return this.f3597a;
    }

    /* renamed from: a */
    public final void mo34259a(int i) {
        this.f3597a = i;
    }

    /* renamed from: a */
    public final void mo34260a(String str) {
        this.f3598b = str;
    }

    /* renamed from: a */
    public final void mo34261a(List<PhotoInfo> list) {
        this.f3601e = list;
    }

    /* renamed from: b */
    public final String mo34262b() {
        return this.f3598b;
    }

    /* renamed from: b */
    public final void mo34263b(String str) {
        this.f3599c = str;
    }

    /* renamed from: c */
    public final String mo34264c() {
        return this.f3599c;
    }

    /* renamed from: c */
    public final void mo34265c(String str) {
        this.f3600d = str;
    }

    /* renamed from: d */
    public final String mo34266d() {
        return this.f3600d;
    }

    /* renamed from: d */
    public final void mo34267d(String str) {
        this.f3602f = str;
    }

    /* renamed from: e */
    public final List<PhotoInfo> mo34268e() {
        return this.f3601e;
    }

    /* renamed from: f */
    public final String mo34269f() {
        return this.f3602f;
    }

    /* renamed from: g */
    public final Uri mo34270g() {
        if (TextUtils.isEmpty(this.f3602f)) {
            return null;
        }
        return Uri.parse(this.f3602f);
    }
}
