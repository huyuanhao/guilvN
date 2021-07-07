package com.p118pd.sdk;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.p118pd.sdk.AbstractC7662o0oOooo0;
import com.p118pd.sdk.AbstractC7682o0oo0OO0;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.util.Collections;
import java.util.List;

/* renamed from: com.pd.sdk.o0ooO000  reason: case insensitive filesystem */
public class C7706o0ooO000 implements AbstractC7682o0oo0OO0, AbstractC7662o0oOooo0.OooO00o<Object>, AbstractC7682o0oo0OO0.OooO00o {
    public static final String o0ooOOo = "SourceGenerator";
    public C7680o0oo0O0o OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7682o0oo0OO0.OooO00o f20666OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7681o0oo0OO<?> f20667OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7691o0oo0o f20668OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile AbstractC7770oO00000o.OooO00o<?> f20669OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f20670OooO00o;
    public int o00oO0O;

    public C7706o0ooO000(C7681o0oo0OO<?> o0oo0oo, AbstractC7682o0oo0OO0.OooO00o oooO00o) {
        this.f20667OooO00o = o0oo0oo;
        this.f20666OooO00o = oooO00o;
    }

    private boolean OooO0O0() {
        return this.o00oO0O < this.f20667OooO00o.m19326OooO0O0().size();
    }

    @Override // com.p118pd.sdk.AbstractC7682o0oo0OO0, com.p118pd.sdk.AbstractC7682o0oo0OO0.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19345OooO00o() {
        Object obj = this.f20670OooO00o;
        if (obj != null) {
            this.f20670OooO00o = null;
            OooO0O0(obj);
        }
        C7680o0oo0O0o o0oo0o0o = this.OooO00o;
        if (o0oo0o0o != null && o0oo0o0o.OooO00o()) {
            return true;
        }
        this.OooO00o = null;
        this.f20669OooO00o = null;
        boolean z = false;
        while (!z && OooO0O0()) {
            List<AbstractC7770oO00000o.OooO00o<?>> OooO0O0 = this.f20667OooO00o.m19326OooO0O0();
            int i = this.o00oO0O;
            this.o00oO0O = i + 1;
            this.f20669OooO00o = OooO0O0.get(i);
            if (this.f20669OooO00o != null && (this.f20667OooO00o.m19315OooO00o().OooO00o(this.f20669OooO00o.f20801OooO00o.OooO00o()) || this.f20667OooO00o.m19324OooO00o((Class<?>) this.f20669OooO00o.f20801OooO00o.m19297OooO00o()))) {
                this.f20669OooO00o.f20801OooO00o.OooO00o(this.f20667OooO00o.m19312OooO00o(), this);
                z = true;
            }
        }
        return z;
    }

    @Override // com.p118pd.sdk.AbstractC7682o0oo0OO0
    public void cancel() {
        AbstractC7770oO00000o.OooO00o<?> oooO00o = this.f20669OooO00o;
        if (oooO00o != null) {
            oooO00o.f20801OooO00o.cancel();
        }
    }

    /* JADX INFO: finally extract failed */
    private void OooO0O0(Object obj) {
        long OooO00o2 = C7843oO0O00o.OooO00o();
        try {
            AbstractC7641o0oOoO<X> OooO00o3 = this.f20667OooO00o.OooO00o(obj);
            C7676o0oo0O o0oo0o = new C7676o0oo0O(OooO00o3, obj, this.f20667OooO00o.m19314OooO00o());
            this.f20668OooO00o = new C7691o0oo0o(this.f20669OooO00o.OooO00o, this.f20667OooO00o.m19313OooO00o());
            this.f20667OooO00o.m19318OooO00o().OooO00o(this.f20668OooO00o, o0oo0o);
            if (Log.isLoggable(o0ooOOo, 2)) {
                String str = "Finished encoding source to cache, key: " + this.f20668OooO00o + ", data: " + obj + ", encoder: " + OooO00o3 + ", duration: " + C7843oO0O00o.OooO00o(OooO00o2);
            }
            this.f20669OooO00o.f20801OooO00o.m19298OooO00o();
            this.OooO00o = new C7680o0oo0O0o(Collections.singletonList(this.f20669OooO00o.OooO00o), this.f20667OooO00o, this);
        } catch (Throwable th) {
            this.f20669OooO00o.f20801OooO00o.m19298OooO00o();
            throw th;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0.OooO00o
    public void OooO00o(Object obj) {
        AbstractC7684o0oo0OOo OooO00o2 = this.f20667OooO00o.m19315OooO00o();
        if (obj == null || !OooO00o2.OooO00o(this.f20669OooO00o.f20801OooO00o.OooO00o())) {
            this.f20666OooO00o.OooO00o(this.f20669OooO00o.OooO00o, obj, this.f20669OooO00o.f20801OooO00o, this.f20669OooO00o.f20801OooO00o.OooO00o(), this.f20668OooO00o);
            return;
        }
        this.f20670OooO00o = obj;
        this.f20666OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0.OooO00o
    public void OooO00o(@NonNull Exception exc) {
        this.f20666OooO00o.OooO00o(this.f20668OooO00o, exc, this.f20669OooO00o.f20801OooO00o, this.f20669OooO00o.f20801OooO00o.OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC7682o0oo0OO0, com.p118pd.sdk.AbstractC7682o0oo0OO0.OooO00o
    public void OooO00o() {
        throw new UnsupportedOperationException();
    }

    @Override // com.p118pd.sdk.AbstractC7682o0oo0OO0.OooO00o
    public void OooO00o(AbstractC7644o0oOoOO o0ooooo, Object obj, AbstractC7662o0oOooo0<?> o0ooooo0, DataSource dataSource, AbstractC7644o0oOoOO o0ooooo2) {
        this.f20666OooO00o.OooO00o(o0ooooo, obj, o0ooooo0, this.f20669OooO00o.f20801OooO00o.OooO00o(), o0ooooo);
    }

    @Override // com.p118pd.sdk.AbstractC7682o0oo0OO0.OooO00o
    public void OooO00o(AbstractC7644o0oOoOO o0ooooo, Exception exc, AbstractC7662o0oOooo0<?> o0ooooo0, DataSource dataSource) {
        this.f20666OooO00o.OooO00o(o0ooooo, exc, o0ooooo0, this.f20669OooO00o.f20801OooO00o.OooO00o());
    }
}
