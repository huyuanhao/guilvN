package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.AbstractC5079OooOoo0;
import com.p118pd.sdk.C7505o0OoOoOO;
import com.p118pd.sdk.o0O0000O;
import java.util.List;

/* renamed from: com.pd.sdk.o0O00OO  reason: case insensitive filesystem */
public abstract class AbstractC7274o0O00OO<T, VH extends RecyclerView.AbstractC5079OooOoo0> extends RecyclerView.AbstractC5065OooO0oO<VH> {
    public final C7255o0O0000o<T> OooO00o;

    public AbstractC7274o0O00OO(@NonNull C7505o0OoOoOO.AbstractC7506OooO0Oo<T> oooO0Oo) {
        this.OooO00o = new C7255o0O0000o<>(new o0O00000(this), new o0O0000O.OooO00o(oooO0Oo).OooO00o());
    }

    public void OooO00o(@Nullable List<T> list) {
        this.OooO00o.OooO00o(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO, androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO, androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO
    public T OooO00o(int i) {
        return this.OooO00o.OooO00o().get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO, androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO, androidx.recyclerview.widget.RecyclerView.AbstractC5065OooO0oO
    public int OooO00o() {
        return this.OooO00o.OooO00o().size();
    }

    public AbstractC7274o0O00OO(@NonNull o0O0000O<T> o0o0000o) {
        this.OooO00o = new C7255o0O0000o<>(new o0O00000(this), o0o0000o);
    }
}
