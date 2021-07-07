package com.p118pd.sdk;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p118pd.sdk.AbstractC7745o0oooO0o;

/* renamed from: com.pd.sdk.o0oooO0  reason: case insensitive filesystem */
public class C7742o0oooO0 extends oO0O00oO<AbstractC7644o0oOoOO, AbstractC7700o0oo0oo0<?>> implements AbstractC7745o0oooO0o {
    public AbstractC7745o0oooO0o.OooO00o OooO00o;

    public C7742o0oooO0(long j) {
        super(j);
    }

    @Override // com.p118pd.sdk.AbstractC7745o0oooO0o
    @Nullable
    public /* bridge */ /* synthetic */ AbstractC7700o0oo0oo0 OooO00o(@NonNull AbstractC7644o0oOoOO o0ooooo) {
        return (AbstractC7700o0oo0oo0) super.OooO0O0(o0ooooo);
    }

    @Override // com.p118pd.sdk.AbstractC7745o0oooO0o
    public void OooO00o(@NonNull AbstractC7745o0oooO0o.OooO00o oooO00o) {
        this.OooO00o = oooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7745o0oooO0o
    public void OooO00o(@NonNull AbstractC7644o0oOoOO o0ooooo, @Nullable AbstractC7700o0oo0oo0<?> o0oo0oo0) {
        AbstractC7745o0oooO0o.OooO00o oooO00o = this.OooO00o;
        if (oooO00o != null && o0oo0oo0 != null) {
            oooO00o.OooO00o(o0oo0oo0);
        }
    }

    public int OooO00o(@Nullable AbstractC7700o0oo0oo0<?> o0oo0oo0) {
        if (o0oo0oo0 == null) {
            return super.OooO00o((Object) null);
        }
        return o0oo0oo0.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7745o0oooO0o
    @SuppressLint({"InlinedApi"})
    public void OooO00o(int i) {
        if (i >= 40) {
            m19520OooO00o();
        } else if (i >= 20 || i == 15) {
            OooO00o(m19518OooO00o() / 2);
        }
    }
}
