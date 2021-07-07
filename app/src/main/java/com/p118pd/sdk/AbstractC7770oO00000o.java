package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* renamed from: com.pd.sdk.oO00000o  reason: case insensitive filesystem */
public interface AbstractC7770oO00000o<Model, Data> {

    /* renamed from: com.pd.sdk.oO00000o$OooO00o */
    public static class OooO00o<Data> {
        public final AbstractC7644o0oOoOO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC7662o0oOooo0<Data> f20801OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final List<AbstractC7644o0oOoOO> f20802OooO00o;

        public OooO00o(@NonNull AbstractC7644o0oOoOO o0ooooo, @NonNull AbstractC7662o0oOooo0<Data> o0ooooo0) {
            this(o0ooooo, Collections.emptyList(), o0ooooo0);
        }

        public OooO00o(@NonNull AbstractC7644o0oOoOO o0ooooo, @NonNull List<AbstractC7644o0oOoOO> list, @NonNull AbstractC7662o0oOooo0<Data> o0ooooo0) {
            this.OooO00o = (AbstractC7644o0oOoOO) C7842oO0O0.OooO00o(o0ooooo);
            this.f20802OooO00o = (List) C7842oO0O0.OooO00o((Object) list);
            this.f20801OooO00o = (AbstractC7662o0oOooo0) C7842oO0O0.OooO00o(o0ooooo0);
        }
    }

    @Nullable
    OooO00o<Data> OooO00o(@NonNull Model model, int i, int i2, @NonNull C7648o0oOoOo o0ooooo);

    boolean OooO00o(@NonNull Model model);
}
