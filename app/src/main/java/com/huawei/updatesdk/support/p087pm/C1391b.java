package com.huawei.updatesdk.support.p087pm;

import com.huawei.updatesdk.support.p085e.C1378b;
import com.huawei.updatesdk.support.p087pm.C1392c;
import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.huawei.updatesdk.support.pm.b */
public class C1391b implements Serializable, Comparator<C1391b> {

    /* renamed from: a */
    public int f1699a;

    /* renamed from: b */
    public C1392c.EnumC1393a f1700b = C1392c.EnumC1393a.NOT_HANDLER;

    /* renamed from: c */
    public Object f1701c;

    /* renamed from: d */
    public boolean f1702d = false;

    /* renamed from: e */
    public String f1703e;

    /* renamed from: f */
    public String f1704f;

    /* renamed from: g */
    public C1392c.EnumC1394b f1705g = C1392c.EnumC1394b.INSTALL;

    /* renamed from: h */
    public int f1706h = -1;

    public C1391b() {
    }

    public C1391b(String str, String str2, Object obj) {
        mo16239b(str2);
        mo16234a(str);
        mo16233a(obj);
    }

    /* renamed from: a */
    public int compare(C1391b bVar, C1391b bVar2) {
        return (!bVar.mo16236a() && bVar.mo16237b() > bVar2.mo16237b()) ? 1 : -1;
    }

    /* renamed from: a */
    public void mo16230a(int i) {
        this.f1699a = i;
    }

    /* renamed from: a */
    public void mo16231a(C1392c.EnumC1393a aVar) {
        this.f1700b = (C1392c.EnumC1393a) C1378b.m2070a(aVar);
    }

    /* renamed from: a */
    public void mo16232a(C1392c.EnumC1394b bVar) {
        this.f1705g = bVar;
    }

    /* renamed from: a */
    public void mo16233a(Object obj) {
        this.f1701c = obj;
    }

    /* renamed from: a */
    public void mo16234a(String str) {
        this.f1703e = str;
    }

    /* renamed from: a */
    public void mo16235a(boolean z) {
        this.f1702d = z;
    }

    /* renamed from: a */
    public boolean mo16236a() {
        return mo16237b() == -1;
    }

    /* renamed from: b */
    public int mo16237b() {
        return this.f1699a;
    }

    /* renamed from: b */
    public void mo16238b(int i) {
        this.f1706h = i;
    }

    /* renamed from: b */
    public void mo16239b(String str) {
        this.f1704f = str;
    }

    /* renamed from: c */
    public C1392c.EnumC1393a mo16240c() {
        return this.f1700b;
    }

    /* renamed from: d */
    public Object mo16242d() {
        return this.f1701c;
    }

    /* renamed from: e */
    public String mo16243e() {
        return this.f1703e;
    }

    /* renamed from: f */
    public String mo16244f() {
        return this.f1704f;
    }

    /* renamed from: g */
    public C1392c.EnumC1394b mo16245g() {
        return this.f1705g;
    }

    /* renamed from: h */
    public int mo16246h() {
        return this.f1706h;
    }

    public String toString() {
        String obj = mo16242d() == null ? "null" : mo16242d().toString();
        return C1391b.class.getName() + " {\n\tindex: " + mo16237b() + "\n\tstatus: " + mo16240c() + "\n\tparam: " + obj + "\n\tpackageName: " + mo16243e() + "\n\tpath: " + mo16244f() + "\n\tprocessType: " + mo16245g() + "\n}";
    }
}
