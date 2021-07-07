package com.vivo.push;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import com.vivo.push.util.C4146p;

/* renamed from: com.vivo.push.y */
public abstract class AbstractC4160y {

    /* renamed from: a */
    public int f11156a = -1;

    /* renamed from: b */
    public String f11157b;

    public AbstractC4160y(int i) {
        if (i >= 0) {
            this.f11156a = i;
            return;
        }
        throw new IllegalArgumentException("PushCommand: the value of command must > 0.");
    }

    /* renamed from: e */
    private final void m11281e(C4026a aVar) {
        aVar.mo40877a("command", this.f11156a);
        aVar.mo40880a("client_pkgname", this.f11157b);
        mo40898c(aVar);
    }

    /* renamed from: a */
    public final String mo41212a() {
        return this.f11157b;
    }

    /* renamed from: b */
    public final int mo41216b() {
        return this.f11156a;
    }

    /* renamed from: c */
    public abstract void mo40898c(C4026a aVar);

    /* renamed from: c */
    public boolean mo40902c() {
        return false;
    }

    /* renamed from: d */
    public abstract void mo40899d(C4026a aVar);

    public String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: a */
    public final void mo41215a(String str) {
        this.f11157b = str;
    }

    /* renamed from: b */
    public final void mo41217b(Intent intent) {
        C4026a a = C4026a.m10866a(intent);
        if (a == null) {
            C4146p.m11211b("PushCommand", "bundleWapper is null");
            return;
        }
        a.mo40877a(AbstractC7726o0ooOOoo.OooOOo0, this.f11156a);
        m11281e(a);
        Bundle b = a.mo40885b();
        if (b != null) {
            intent.putExtras(b);
        }
    }

    /* renamed from: a */
    public final void mo41213a(Intent intent) {
        C4026a a = C4026a.m10866a(intent);
        if (a == null) {
            C4146p.m11211b("PushCommand", "bundleWapper is null");
            return;
        }
        mo41214a(a);
        Bundle b = a.mo40885b();
        if (b != null) {
            intent.putExtras(b);
        }
    }

    /* renamed from: a */
    public final void mo41214a(C4026a aVar) {
        String a = C4161z.m11292a(this.f11156a);
        if (a == null) {
            a = "";
        }
        aVar.mo40880a(AbstractC7726o0ooOOoo.OooOOo0, a);
        m11281e(aVar);
    }

    /* renamed from: b */
    public final void mo41218b(C4026a aVar) {
        String a = aVar.mo40875a();
        if (!TextUtils.isEmpty(a)) {
            this.f11157b = a;
        } else {
            this.f11157b = aVar.mo40876a("client_pkgname");
        }
        mo40899d(aVar);
    }
}
