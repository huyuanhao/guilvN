package com.p118pd.sdk;

import androidx.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.p118pd.sdk.AbstractC7662o0oOooo0;
import com.p118pd.sdk.AbstractC7770oO00000o;

/* renamed from: com.pd.sdk.oO000O0 */
public class oO000O0<Model> implements AbstractC7770oO00000o<Model, Model> {
    public static final oO000O0<?> OooO00o = new oO000O0<>();

    /* renamed from: com.pd.sdk.oO000O0$OooO00o */
    public static class OooO00o<Model> implements AbstractC7771oO0000O<Model, Model> {
        public static final OooO00o<?> OooO00o = new OooO00o<>();

        public static <T> OooO00o<T> OooO00o() {
            return (OooO00o<T>) OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m19427OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC7771oO0000O
        @NonNull
        public AbstractC7770oO00000o<Model, Model> OooO00o(C7772oO0000o oo0000o) {
            return oO000O0.OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.oO000O0$OooO0O0 */
    public static class OooO0O0<Model> implements AbstractC7662o0oOooo0<Model> {
        public final Model OooO00o;

        public OooO0O0(Model model) {
            this.OooO00o = model;
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m19429OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
        public void OooO00o(@NonNull Priority priority, @NonNull AbstractC7662o0oOooo0.OooO00o<? super Model> oooO00o) {
            oooO00o.OooO00o((Object) this.OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
        public void cancel() {
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Class<Model> m19428OooO00o() {
            return (Class<Model>) this.OooO00o.getClass();
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        @NonNull
        public DataSource OooO00o() {
            return DataSource.LOCAL;
        }
    }

    public static <T> oO000O0<T> OooO00o() {
        return (oO000O0<T>) OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7770oO00000o
    public boolean OooO00o(@NonNull Model model) {
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7770oO00000o
    public AbstractC7770oO00000o.OooO00o<Model> OooO00o(@NonNull Model model, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        return new AbstractC7770oO00000o.OooO00o<>(new C7885oO0Oo00O(model), new OooO0O0(model));
    }
}
