package com.p118pd.sdk;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import com.p118pd.sdk.AbstractC7662o0oOooo0;
import com.p118pd.sdk.AbstractC7682o0oo0OO0;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.io.File;
import java.util.List;

/* renamed from: com.pd.sdk.o0oo0O0o  reason: case insensitive filesystem */
public class C7680o0oo0O0o implements AbstractC7682o0oo0OO0, AbstractC7662o0oOooo0.OooO00o<Object> {
    public AbstractC7644o0oOoOO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7682o0oo0OO0.OooO00o f20573OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7681o0oo0OO<?> f20574OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile AbstractC7770oO00000o.OooO00o<?> f20575OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public File f20576OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<AbstractC7644o0oOoOO> f20577OooO00o;
    public List<AbstractC7770oO00000o<File, ?>> OooO0O0;
    public int o00oO0O;
    public int o0ooOO0;

    public C7680o0oo0O0o(C7681o0oo0OO<?> o0oo0oo, AbstractC7682o0oo0OO0.OooO00o oooO00o) {
        this(o0oo0oo.m19320OooO00o(), o0oo0oo, oooO00o);
    }

    private boolean OooO0O0() {
        return this.o0ooOO0 < this.OooO0O0.size();
    }

    @Override // com.p118pd.sdk.AbstractC7682o0oo0OO0
    public boolean OooO00o() {
        while (true) {
            boolean z = false;
            if (this.OooO0O0 == null || !OooO0O0()) {
                int i = this.o00oO0O + 1;
                this.o00oO0O = i;
                if (i >= this.f20577OooO00o.size()) {
                    return false;
                }
                AbstractC7644o0oOoOO o0ooooo = this.f20577OooO00o.get(this.o00oO0O);
                File OooO00o2 = this.f20574OooO00o.m19318OooO00o().OooO00o((AbstractC7644o0oOoOO) new C7691o0oo0o(o0ooooo, this.f20574OooO00o.m19313OooO00o()));
                this.f20576OooO00o = OooO00o2;
                if (OooO00o2 != null) {
                    this.OooO00o = o0ooooo;
                    this.OooO0O0 = this.f20574OooO00o.OooO00o(OooO00o2);
                    this.o0ooOO0 = 0;
                }
            } else {
                this.f20575OooO00o = null;
                while (!z && OooO0O0()) {
                    List<AbstractC7770oO00000o<File, ?>> list = this.OooO0O0;
                    int i2 = this.o0ooOO0;
                    this.o0ooOO0 = i2 + 1;
                    this.f20575OooO00o = list.get(i2).OooO00o(this.f20576OooO00o, this.f20574OooO00o.OooO0O0(), this.f20574OooO00o.OooO00o(), this.f20574OooO00o.m19314OooO00o());
                    if (this.f20575OooO00o != null && this.f20574OooO00o.m19324OooO00o((Class<?>) this.f20575OooO00o.f20801OooO00o.m19297OooO00o())) {
                        this.f20575OooO00o.f20801OooO00o.OooO00o(this.f20574OooO00o.m19312OooO00o(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7682o0oo0OO0
    public void cancel() {
        AbstractC7770oO00000o.OooO00o<?> oooO00o = this.f20575OooO00o;
        if (oooO00o != null) {
            oooO00o.f20801OooO00o.cancel();
        }
    }

    public C7680o0oo0O0o(List<AbstractC7644o0oOoOO> list, C7681o0oo0OO<?> o0oo0oo, AbstractC7682o0oo0OO0.OooO00o oooO00o) {
        this.o00oO0O = -1;
        this.f20577OooO00o = list;
        this.f20574OooO00o = o0oo0oo;
        this.f20573OooO00o = oooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0.OooO00o
    public void OooO00o(Object obj) {
        this.f20573OooO00o.OooO00o(this.OooO00o, obj, this.f20575OooO00o.f20801OooO00o, DataSource.DATA_DISK_CACHE, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7662o0oOooo0.OooO00o
    public void OooO00o(@NonNull Exception exc) {
        this.f20573OooO00o.OooO00o(this.OooO00o, exc, this.f20575OooO00o.f20801OooO00o, DataSource.DATA_DISK_CACHE);
    }
}
