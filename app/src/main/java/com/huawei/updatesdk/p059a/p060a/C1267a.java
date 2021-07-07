package com.huawei.updatesdk.p059a.p060a;

import com.huawei.updatesdk.sdk.p062a.p069d.p073c.C1291b;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;
import com.huawei.updatesdk.sdk.service.p076c.p077a.C1301c;
import com.huawei.updatesdk.service.p078a.C1325a;

/* renamed from: com.huawei.updatesdk.a.a.a */
public class C1267a extends C1301c {
    public String clientPackage_ = null;
    public String cno_ = null;
    public String code_ = null;
    public boolean isSerial = false;
    public String locale_ = null;
    public boolean needSign = true;
    public String net_ = null;
    public int serviceType_ = 0;
    public String sign_ = null;
    public String thirdId_ = null;
    public String ts_ = null;

    public C1267a() {
        mo15831a(C1325a.m1873a().mo16068d());
        mo15833b(C1294a.m1650a().mo15900b().getPackageName());
    }

    /* renamed from: a */
    public String mo15830a() {
        return this.net_;
    }

    /* renamed from: a */
    public void mo15831a(String str) {
        this.sign_ = str;
    }

    /* renamed from: a */
    public void mo15832a(boolean z) {
        this.needSign = z;
    }

    /* renamed from: b */
    public void mo15833b(String str) {
        this.clientPackage_ = str;
    }

    /* renamed from: b */
    public void mo15834b(boolean z) {
        this.isSerial = z;
    }

    /* renamed from: b */
    public boolean mo15835b() {
        return this.needSign;
    }

    /* renamed from: c */
    public void mo15836c(String str) {
        this.net_ = str;
    }

    /* renamed from: c */
    public boolean mo15837c() {
        return this.isSerial;
    }

    @Override // com.huawei.updatesdk.sdk.service.p076c.p077a.C1301c
    /* renamed from: d */
    public String mo15838d() throws IllegalAccessException, IllegalArgumentException {
        return super.mo15838d();
    }

    /* renamed from: d */
    public void mo15839d(String str) {
        this.cno_ = str;
    }

    @Override // com.huawei.updatesdk.sdk.service.p076c.p077a.C1301c
    /* renamed from: e */
    public void mo15840e() {
        mo15841e(String.valueOf(System.currentTimeMillis()));
        mo15836c(String.valueOf(C1291b.m1639c(C1294a.m1650a().mo15900b())));
        mo15843g(C1325a.m1873a().mo16070f());
        mo15839d("4010002");
        mo15842f("0500");
    }

    /* renamed from: e */
    public void mo15841e(String str) {
        this.ts_ = str;
    }

    /* renamed from: f */
    public void mo15842f(String str) {
        this.code_ = str;
    }

    /* renamed from: g */
    public void mo15843g(String str) {
        this.thirdId_ = str;
    }

    /* renamed from: h */
    public void mo15844h(String str) {
        this.locale_ = str;
    }

    /* renamed from: i */
    public void mo15845i(String str) {
        mo15831a(str);
    }

    public String toString() {
        return getClass().getName() + " {\n\tmethod_: " + mo15920g() + "\n\tnet_: " + mo15830a() + "\n}";
    }
}
