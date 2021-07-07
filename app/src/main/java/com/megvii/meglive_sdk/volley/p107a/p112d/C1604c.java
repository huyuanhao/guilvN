package com.megvii.meglive_sdk.volley.p107a.p112d;

import com.megvii.meglive_sdk.volley.p107a.AbstractC1596b;
import com.megvii.meglive_sdk.volley.p107a.AbstractC1601d;
import com.megvii.meglive_sdk.volley.p107a.AbstractC1614g;
import com.megvii.meglive_sdk.volley.p107a.AbstractC1615h;
import com.megvii.meglive_sdk.volley.p107a.C1608e;
import com.megvii.meglive_sdk.volley.p107a.C1610f;
import com.megvii.meglive_sdk.volley.p107a.p114f.C1611a;
import java.util.Locale;

/* renamed from: com.megvii.meglive_sdk.volley.a.d.c */
public final class C1604c extends AbstractC1602a implements AbstractC1601d {

    /* renamed from: c */
    public AbstractC1596b f2833c;

    /* renamed from: d */
    public AbstractC1615h f2834d;

    /* renamed from: e */
    public C1610f f2835e;

    /* renamed from: f */
    public int f2836f;

    /* renamed from: g */
    public String f2837g;

    /* renamed from: h */
    public final AbstractC1614g f2838h = null;

    /* renamed from: i */
    public Locale f2839i = null;

    public C1604c(AbstractC1615h hVar) {
        super((byte) 0);
        this.f2834d = (AbstractC1615h) C1611a.m2771a(hVar, "Status line");
        this.f2835e = hVar.mo17312a();
        this.f2836f = hVar.mo17313b();
        this.f2837g = hVar.mo17314c();
    }

    @Override // com.megvii.meglive_sdk.volley.p107a.AbstractC1601d
    /* renamed from: b */
    public final AbstractC1615h mo17306b() {
        if (this.f2834d == null) {
            C1610f fVar = this.f2835e;
            if (fVar == null) {
                fVar = C1608e.f2848c;
            }
            int i = this.f2836f;
            String str = this.f2837g;
            if (str == null) {
                AbstractC1614g gVar = this.f2838h;
                if (gVar != null) {
                    if (this.f2839i == null) {
                        Locale.getDefault();
                    }
                    str = gVar.mo17330a();
                } else {
                    str = null;
                }
            }
            this.f2834d = new C1606e(fVar, i, str);
        }
        return this.f2834d;
    }

    @Override // com.megvii.meglive_sdk.volley.p107a.AbstractC1601d
    /* renamed from: c */
    public final AbstractC1596b mo17307c() {
        return this.f2833c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo17306b());
        sb.append(' ');
        sb.append(this.f2829a);
        if (this.f2833c != null) {
            sb.append(' ');
            sb.append(this.f2833c);
        }
        return sb.toString();
    }
}
