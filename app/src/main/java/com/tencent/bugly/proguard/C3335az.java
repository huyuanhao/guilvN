package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.tencent.bugly.proguard.az */
public final class C3335az extends AbstractC3357m implements Cloneable {

    /* renamed from: c */
    public static ArrayList<String> f8084c;

    /* renamed from: a */
    public String f8085a = "";

    /* renamed from: b */
    public ArrayList<String> f8086b = null;

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38327a(C3356l lVar) {
        lVar.mo38481a(this.f8085a, 0);
        ArrayList<String> arrayList = this.f8086b;
        if (arrayList != null) {
            lVar.mo38482a((Collection) arrayList, 1);
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38328a(StringBuilder sb, int i) {
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38326a(C3354k kVar) {
        this.f8085a = kVar.mo38454a(0, true);
        if (f8084c == null) {
            ArrayList<String> arrayList = new ArrayList<>();
            f8084c = arrayList;
            arrayList.add("");
        }
        this.f8086b = (ArrayList) kVar.mo38453a((Object) f8084c, 1, false);
    }
}
