package com.huawei.updatesdk.support.p087pm;

import com.huawei.updatesdk.support.p087pm.C1392c;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.huawei.updatesdk.support.pm.d */
public class C1395d extends ConcurrentHashMap<String, C1391b> {

    /* renamed from: a */
    public int f1718a;

    /* renamed from: com.huawei.updatesdk.support.pm.d$a */
    public enum EnumC1396a {
        INSTALL_TYPE
    }

    /* renamed from: a */
    public C1391b put(String str, C1391b bVar) {
        if (bVar == null) {
            return null;
        }
        if (-1 != bVar.mo16237b()) {
            int i = this.f1718a + 1;
            this.f1718a = i;
            bVar.mo16230a(i);
        }
        if (bVar.mo16245g() == C1392c.EnumC1394b.INSTALL) {
            str = "pre_hispace_install_" + str;
        }
        super.remove(str);
        return (C1391b) super.put(str, bVar);
    }

    /* renamed from: a */
    public C1391b mo16249a(String str, EnumC1396a aVar) {
        return (C1391b) super.get("pre_hispace_install_" + str);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }
}
