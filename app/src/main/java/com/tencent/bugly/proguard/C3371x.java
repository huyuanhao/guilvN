package com.tencent.bugly.proguard;

import com.umeng.analytics.pro.C3416b;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.tencent.bugly.proguard.x */
public final class C3371x extends AbstractC3357m implements Cloneable {

    /* renamed from: b */
    public static ArrayList<C3370w> f8283b;

    /* renamed from: c */
    public static final /* synthetic */ boolean f8284c = (!C3371x.class.desiredAssertionStatus());

    /* renamed from: a */
    public ArrayList<C3370w> f8285a = null;

    public C3371x() {
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38327a(C3356l lVar) {
        lVar.mo38482a((Collection) this.f8285a, 0);
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            if (f8284c) {
                return null;
            }
            throw new AssertionError();
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return C3358n.m8592a(this.f8285a, ((C3371x) obj).f8285a);
    }

    public int hashCode() {
        try {
            throw new Exception("Need define key first!");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38326a(C3354k kVar) {
        if (f8283b == null) {
            f8283b = new ArrayList<>();
            f8283b.add(new C3370w());
        }
        this.f8285a = (ArrayList) kVar.mo38453a((Object) f8283b, 0, true);
    }

    public C3371x(ArrayList<C3370w> arrayList) {
        this.f8285a = arrayList;
    }

    @Override // com.tencent.bugly.proguard.AbstractC3357m
    /* renamed from: a */
    public void mo38328a(StringBuilder sb, int i) {
        new C3352i(sb, i).mo38435a((Collection) this.f8285a, C3416b.f8463ao);
    }
}
