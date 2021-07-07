package com.qiyukf.unicorn.p212e;

import androidx.annotation.NonNull;
import com.qiyukf.unicorn.api.event.entry.RequestStaffEntry;
import java.io.Serializable;

/* renamed from: com.qiyukf.unicorn.e.m */
public final class C2478m implements Serializable {

    /* renamed from: a */
    public String f4908a;

    /* renamed from: b */
    public boolean f4909b;

    /* renamed from: c */
    public C2467c f4910c;

    /* renamed from: d */
    public int f4911d;

    /* renamed from: e */
    public boolean f4912e;

    /* renamed from: f */
    public RequestStaffEntry f4913f;

    /* renamed from: g */
    public int f4914g;

    /* renamed from: h */
    public int f4915h = 0;

    /* renamed from: i */
    public long f4916i;

    public C2478m(String str) {
        this.f4908a = str;
    }

    /* renamed from: a */
    public final String mo35728a() {
        return this.f4908a;
    }

    /* renamed from: a */
    public final void mo35729a(int i) {
        this.f4911d = i;
    }

    /* renamed from: a */
    public final void mo35730a(long j) {
        this.f4916i = j;
    }

    /* renamed from: a */
    public final void mo35731a(RequestStaffEntry requestStaffEntry) {
        this.f4913f = requestStaffEntry;
    }

    /* renamed from: a */
    public final void mo35732a(C2467c cVar) {
        this.f4910c = cVar;
    }

    /* renamed from: a */
    public final void mo35733a(boolean z) {
        this.f4909b = z;
    }

    /* renamed from: b */
    public final void mo35734b(int i) {
        this.f4914g = i;
    }

    /* renamed from: b */
    public final boolean mo35735b() {
        return this.f4909b;
    }

    /* renamed from: c */
    public final C2467c mo35736c() {
        return this.f4910c;
    }

    /* renamed from: c */
    public final void mo35737c(int i) {
        this.f4915h = i;
    }

    /* renamed from: d */
    public final int mo35738d() {
        return this.f4911d;
    }

    /* renamed from: e */
    public final boolean mo35739e() {
        return this.f4912e;
    }

    /* renamed from: f */
    public final void mo35740f() {
        this.f4912e = true;
    }

    /* renamed from: g */
    public final RequestStaffEntry mo35741g() {
        return this.f4913f;
    }

    /* renamed from: h */
    public final int mo35742h() {
        return this.f4914g;
    }

    /* renamed from: i */
    public final int mo35743i() {
        return this.f4915h;
    }

    /* renamed from: j */
    public final long mo35744j() {
        return this.f4916i;
    }

    @NonNull
    public final String toString() {
        return "humanOnly:" + this.f4909b + ",Category:" + this.f4910c + ", forceChangeEntrance:" + this.f4914g;
    }
}
