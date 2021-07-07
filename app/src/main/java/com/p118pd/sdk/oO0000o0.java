package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.p118pd.sdk.AbstractC7662o0oOooo0;
import com.p118pd.sdk.AbstractC7770oO00000o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.pd.sdk.oO0000o0 */
public class oO0000o0<Model, Data> implements AbstractC7770oO00000o<Model, Data> {
    public final Pools.OooO00o<List<Throwable>> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<AbstractC7770oO00000o<Model, Data>> f20809OooO00o;

    public oO0000o0(@NonNull List<AbstractC7770oO00000o<Model, Data>> list, @NonNull Pools.OooO00o<List<Throwable>> oooO00o) {
        this.f20809OooO00o = list;
        this.OooO00o = oooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC7770oO00000o
    public AbstractC7770oO00000o.OooO00o<Data> OooO00o(@NonNull Model model, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) {
        AbstractC7770oO00000o.OooO00o<Data> OooO00o2;
        int size = this.f20809OooO00o.size();
        ArrayList arrayList = new ArrayList(size);
        AbstractC7644o0oOoOO o0ooooo2 = null;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC7770oO00000o<Model, Data> oo00000o = this.f20809OooO00o.get(i3);
            if (oo00000o.OooO00o(model) && (OooO00o2 = oo00000o.OooO00o(model, i, i2, o0ooooo)) != null) {
                o0ooooo2 = OooO00o2.OooO00o;
                arrayList.add(OooO00o2.f20801OooO00o);
            }
        }
        if (arrayList.isEmpty() || o0ooooo2 == null) {
            return null;
        }
        return new AbstractC7770oO00000o.OooO00o<>(o0ooooo2, new OooO00o(arrayList, this.OooO00o));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f20809OooO00o.toArray()) + '}';
    }

    /* renamed from: com.pd.sdk.oO0000o0$OooO00o */
    public static class OooO00o<Data> implements AbstractC7662o0oOooo0<Data>, AbstractC7662o0oOooo0.OooO00o<Data> {
        public final Pools.OooO00o<List<Throwable>> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Priority f20810OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC7662o0oOooo0.OooO00o<? super Data> f20811OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final List<AbstractC7662o0oOooo0<Data>> f20812OooO00o;
        @Nullable
        public List<Throwable> OooO0O0;
        public int o00oO0O = 0;

        public OooO00o(@NonNull List<AbstractC7662o0oOooo0<Data>> list, @NonNull Pools.OooO00o<List<Throwable>> oooO00o) {
            this.OooO00o = oooO00o;
            C7842oO0O0.OooO00o((Collection) list);
            this.f20812OooO00o = list;
        }

        private void OooO0O0() {
            if (this.o00oO0O < this.f20812OooO00o.size() - 1) {
                this.o00oO0O++;
                OooO00o(this.f20810OooO00o, this.f20811OooO00o);
                return;
            }
            C7842oO0O0.OooO00o((Object) this.OooO0O0);
            this.f20811OooO00o.OooO00o((Exception) new GlideException("Fetch failed", new ArrayList(this.OooO0O0)));
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
        public void OooO00o(@NonNull Priority priority, @NonNull AbstractC7662o0oOooo0.OooO00o<? super Data> oooO00o) {
            this.f20810OooO00o = priority;
            this.f20811OooO00o = oooO00o;
            this.OooO0O0 = this.OooO00o.acquire();
            this.f20812OooO00o.get(this.o00oO0O).OooO00o(priority, this);
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0
        public void cancel() {
            for (AbstractC7662o0oOooo0<Data> o0ooooo0 : this.f20812OooO00o) {
                o0ooooo0.cancel();
            }
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m19425OooO00o() {
            List<Throwable> list = this.OooO0O0;
            if (list != null) {
                this.OooO00o.release(list);
            }
            this.OooO0O0 = null;
            for (AbstractC7662o0oOooo0<Data> o0ooooo0 : this.f20812OooO00o) {
                o0ooooo0.m19298OooO00o();
            }
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        @NonNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Class<Data> m19424OooO00o() {
            return this.f20812OooO00o.get(0).m19297OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0, com.p118pd.sdk.AbstractC7662o0oOooo0
        @NonNull
        public DataSource OooO00o() {
            return this.f20812OooO00o.get(0).OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0.OooO00o
        public void OooO00o(@Nullable Data data) {
            if (data != null) {
                this.f20811OooO00o.OooO00o((Object) data);
            } else {
                OooO0O0();
            }
        }

        @Override // com.p118pd.sdk.AbstractC7662o0oOooo0.OooO00o
        public void OooO00o(@NonNull Exception exc) {
            ((List) C7842oO0O0.OooO00o((Object) this.OooO0O0)).add(exc);
            OooO0O0();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7770oO00000o
    public boolean OooO00o(@NonNull Model model) {
        for (AbstractC7770oO00000o<Model, Data> oo00000o : this.f20809OooO00o) {
            if (oo00000o.OooO00o(model)) {
                return true;
            }
        }
        return false;
    }
}
