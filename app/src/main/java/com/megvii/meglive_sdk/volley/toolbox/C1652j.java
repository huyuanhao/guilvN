package com.megvii.meglive_sdk.volley.toolbox;

import com.megvii.meglive_sdk.volley.AbstractC1628m;
import com.megvii.meglive_sdk.volley.C1625j;
import com.megvii.meglive_sdk.volley.C1631o;
import java.io.UnsupportedEncodingException;

/* renamed from: com.megvii.meglive_sdk.volley.toolbox.j */
public class C1652j extends AbstractC1628m<String> {

    /* renamed from: a */
    public final C1631o.AbstractC1633b<String> f2955a;

    public C1652j(String str, C1631o.AbstractC1633b<String> bVar, C1631o.AbstractC1632a aVar) {
        super(1, str, aVar);
        this.f2955a = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.megvii.meglive_sdk.volley.AbstractC1628m
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo17347a(String str) {
        String str2 = str;
        C1631o.AbstractC1633b<String> bVar = this.f2955a;
        if (bVar != null) {
            bVar.mo16992a(str2);
        }
    }

    @Override // com.megvii.meglive_sdk.volley.AbstractC1628m
    /* renamed from: a */
    public final C1631o<String> mo17346a(C1625j jVar) {
        String str;
        try {
            str = new String(jVar.f2878b, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            str = new String(jVar.f2878b);
        }
        return C1631o.m2810a(str, C1642d.m2850a(jVar));
    }
}
