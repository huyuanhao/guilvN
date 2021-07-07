package com.p118pd.sdk;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import s.h.e.l.l.C;

/* renamed from: com.pd.sdk.oO0OOO00 */
public final class oO0OOO00 implements AbstractC7811oO00OooO {
    public final Set<AbstractC7833oO00oOo0<?>> OooO00o = Collections.newSetFromMap(new WeakHashMap());

    static {
        C.i(27);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public native void m19556OooO00o();

    public void OooO00o(@NonNull AbstractC7833oO00oOo0<?> oo00ooo0) {
        this.OooO00o.add(oo00ooo0);
    }

    public void OooO0O0(@NonNull AbstractC7833oO00oOo0<?> oo00ooo0) {
        this.OooO00o.remove(oo00ooo0);
    }

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onDestroy();

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onStart();

    @Override // com.p118pd.sdk.AbstractC7811oO00OooO
    public native void onStop();

    @NonNull
    public List<AbstractC7833oO00oOo0<?>> OooO00o() {
        return oO0O0O00.OooO00o(this.OooO00o);
    }
}
