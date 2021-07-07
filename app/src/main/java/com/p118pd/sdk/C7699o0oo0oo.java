package com.p118pd.sdk;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.p118pd.sdk.AbstractC7662o0oOooo0;
import com.p118pd.sdk.AbstractC7682o0oo0OO0;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.io.File;
import java.util.List;

/* renamed from: com.pd.sdk.o0oo0oo  reason: case insensitive filesystem */
public class C7699o0oo0oo implements AbstractC7682o0oo0OO0, AbstractC7662o0oOooo0.OooO00o<Object> {
    public AbstractC7644o0oOoOO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7682o0oo0OO0.OooO00o f20642OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7681o0oo0OO<?> f20643OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7701o0oo0ooO f20644OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile AbstractC7770oO00000o.OooO00o<?> f20645OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public File f20646OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<AbstractC7770oO00000o<File, ?>> f20647OooO00o;
    public int o00oO0O;
    public int o0ooOO0 = -1;
    public int o0ooOOo;

    public C7699o0oo0oo(C7681o0oo0OO<?> o0oo0oo, AbstractC7682o0oo0OO0.OooO00o oooO00o) {
        this.f20643OooO00o = o0oo0oo;
        this.f20642OooO00o = oooO00o;
    }

    private boolean OooO0O0() {
        return this.o0ooOOo < this.f20647OooO00o.size();
    }

    @Override // com.p118pd.sdk.AbstractC7682o0oo0OO0
    public boolean OooO00o() {
        List<AbstractC7644o0oOoOO> OooO00o2 = this.f20643OooO00o.m19320OooO00o();
        boolean z = false;
        if (OooO00o2.isEmpty()) {
            return false;
        }
        List<Class<?>> OooO0OO = this.f20643OooO00o.OooO0OO();
        if (OooO0OO.isEmpty() && File.class.equals(this.f20643OooO00o.m19325OooO0O0())) {
            return false;
        }
        while (true) {
            if (this.f20647OooO00o == null || !OooO0O0()) {
                int i = this.o0ooOO0 + 1;
                this.o0ooOO0 = i;
                if (i >= OooO0OO.size()) {
                    int i2 = this.o00oO0O + 1;
                    this.o00oO0O = i2;
                    if (i2 >= OooO00o2.size()) {
                        return false;
                    }
                    this.o0ooOO0 = 0;
                }
                AbstractC7644o0oOoOO o0ooooo = OooO00o2.get(this.o00oO0O);
                Class<?> cls = OooO0OO.get(this.o0ooOO0);
                this.f20644OooO00o = new C7701o0oo0ooO(this.f20643OooO00o.m19317OooO00o(), o0ooooo, this.f20643OooO00o.m19313OooO00o(), this.f20643OooO00o.OooO0O0(), this.f20643OooO00o.OooO00o(), this.f20643OooO00o.OooO00o((Class) cls), cls, this.f20643OooO00o.m19314OooO00o());
                File OooO00o3 = this.f20643OooO00o.m19318OooO00o().OooO00o((AbstractC7644o0oOoOO) this.f20644OooO00o);
                this.f20646OooO00o = OooO00o3;
                if (OooO00o3 != null) {
                    this.OooO00o = o0ooooo;
                    this.f20647OooO00o = this.f20643OooO00o.OooO00o(OooO00o3);
                    this.o0ooOOo = 0;
                }
            } else {
                this.f20645OooO00o = null;
                while (!z && OooO0O0()) {
                    List<AbstractC7770oO00000o<File, ?>> list = this.f20647OooO00o;
                    int i3 = this.o0ooOOo;
                    this.o0ooOOo = i3 + 1;
                    this.f20645OooO00o = list.get(i3).OooO00o(this.f20646OooO00o, this.f20643OooO00o.OooO0O0(), this.f20643OooO00o.OooO00o(), this.f20643OooO00o.m19314OooO00o());
                    if (this.f20645OooO00o != null && this.f20643OooO00o.m19324OooO00o((Class<?>) this.f20645OooO00o.f20801OooO00o.m19297OooO00o())) {
                        this.f20645OooO00o.f20801OooO00o.OooO00o(this.f20643OooO00o.m19312OooO00o(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7682o0oo0OO0
    public void cancel() {
        AbstractC7770oO00000o.OooO00o<?> oooO00o = this.f20645OooO00o;
        if (oooO00o != null) {
            oooO00o.f20801OooO00o.cancel();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0.OooO00o
    public void OooO00o(Object obj) {
        this.f20642OooO00o.OooO00o(this.OooO00o, obj, this.f20645OooO00o.f20801OooO00o, DataSource.RESOURCE_DISK_CACHE, this.f20644OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0.OooO00o
    public void OooO00o(@NonNull Exception exc) {
        this.f20642OooO00o.OooO00o(this.f20644OooO00o, exc, this.f20645OooO00o.f20801OooO00o, DataSource.RESOURCE_DISK_CACHE);
    }
}
