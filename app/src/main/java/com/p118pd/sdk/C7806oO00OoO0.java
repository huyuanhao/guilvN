package com.p118pd.sdk;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.pd.sdk.oO00OoO0  reason: case insensitive filesystem */
public class C7806oO00OoO0 implements AbstractC7809oO00Ooo {
    public final Set<AbstractC7811oO00OooO> OooO00o = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20859OooO00o;
    public boolean OooO0O0;

    @Override // com.p118pd.sdk.AbstractC7809oO00Ooo
    public void OooO00o(@NonNull AbstractC7811oO00OooO oo00oooo) {
        this.OooO00o.add(oo00oooo);
        if (this.OooO0O0) {
            oo00oooo.onDestroy();
        } else if (this.f20859OooO00o) {
            oo00oooo.onStart();
        } else {
            oo00oooo.onStop();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7809oO00Ooo
    public void OooO0O0(@NonNull AbstractC7811oO00OooO oo00oooo) {
        this.OooO00o.remove(oo00oooo);
    }

    public void OooO0OO() {
        this.f20859OooO00o = false;
        for (AbstractC7811oO00OooO oo00oooo : oO0O0O00.OooO00o(this.OooO00o)) {
            oo00oooo.onStop();
        }
    }

    public void OooO0O0() {
        this.f20859OooO00o = true;
        for (AbstractC7811oO00OooO oo00oooo : oO0O0O00.OooO00o(this.OooO00o)) {
            oo00oooo.onStart();
        }
    }

    public void OooO00o() {
        this.OooO0O0 = true;
        for (AbstractC7811oO00OooO oo00oooo : oO0O0O00.OooO00o(this.OooO00o)) {
            oo00oooo.onDestroy();
        }
    }
}
