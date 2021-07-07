package com.p118pd.sdk;

import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.pd.sdk.o00oOoO0  reason: case insensitive filesystem */
public class C7206o00oOoO0<T> extends C7207o00oOoOO<T> {
    public C6966o0000o0O<LiveData<?>, OooO00o<?>> OooO0O0 = new C6966o0000o0O<>();

    /* renamed from: com.pd.sdk.o00oOoO0$OooO00o */
    public static class OooO00o<V> implements AbstractC7208o00oOoOo<V> {
        public int OooO00o = -1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LiveData<V> f19695OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC7208o00oOoOo<? super V> f19696OooO00o;

        public OooO00o(LiveData<V> liveData, AbstractC7208o00oOoOo<? super V> o00ooooo) {
            this.f19695OooO00o = liveData;
            this.f19696OooO00o = o00ooooo;
        }

        public void OooO00o() {
            this.f19695OooO00o.OooO00o(this);
        }

        public void OooO0O0() {
            this.f19695OooO00o.OooO0O0(this);
        }

        @Override // com.p118pd.sdk.AbstractC7208o00oOoOo
        public void OooO00o(@Nullable V v) {
            if (this.OooO00o != this.f19695OooO00o.OooO00o()) {
                this.OooO00o = this.f19695OooO00o.OooO00o();
                this.f19696OooO00o.OooO00o(v);
            }
        }
    }

    @MainThread
    public <S> void OooO00o(@NonNull LiveData<S> liveData, @NonNull AbstractC7208o00oOoOo<? super S> o00ooooo) {
        OooO00o<?> oooO00o = new OooO00o<>(liveData, o00ooooo);
        OooO00o<?> OooO00o2 = this.OooO0O0.m18155OooO00o((LiveData<?>) liveData, oooO00o);
        if (OooO00o2 != null && OooO00o2.f19696OooO00o != o00ooooo) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        } else if (OooO00o2 == null && m14670OooO00o()) {
            oooO00o.OooO00o();
        }
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.LiveData
    @CallSuper
    public void OooO0O0() {
        Iterator<Map.Entry<LiveData<?>, OooO00o<?>>> it = this.OooO0O0.iterator();
        while (it.hasNext()) {
            it.next().getValue().OooO0O0();
        }
    }

    @MainThread
    public <S> void OooO00o(@NonNull LiveData<S> liveData) {
        OooO00o<?> OooO00o2 = this.OooO0O0.m18154OooO00o((LiveData<?>) liveData);
        if (OooO00o2 != null) {
            OooO00o2.OooO0O0();
        }
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.LiveData, androidx.lifecycle.LiveData, androidx.lifecycle.LiveData
    @CallSuper
    public void OooO00o() {
        Iterator<Map.Entry<LiveData<?>, OooO00o<?>>> it = this.OooO0O0.iterator();
        while (it.hasNext()) {
            it.next().getValue().OooO00o();
        }
    }
}
