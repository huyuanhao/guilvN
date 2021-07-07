package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oO00o0Oo  reason: case insensitive filesystem */
public class C7820oO00o0Oo {
    public final List<OooO00o<?>> OooO00o = new ArrayList();

    /* renamed from: com.pd.sdk.oO00o0Oo$OooO00o */
    public static final class OooO00o<T> {
        public final AbstractC7653o0oOoo0<T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Class<T> f20874OooO00o;

        public OooO00o(@NonNull Class<T> cls, @NonNull AbstractC7653o0oOoo0<T> o0oooo0) {
            this.f20874OooO00o = cls;
            this.OooO00o = o0oooo0;
        }

        public boolean OooO00o(@NonNull Class<?> cls) {
            return this.f20874OooO00o.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void OooO00o(@NonNull Class<Z> cls, @NonNull AbstractC7653o0oOoo0<Z> o0oooo0) {
        this.OooO00o.add(new OooO00o<>(cls, o0oooo0));
    }

    public synchronized <Z> void OooO0O0(@NonNull Class<Z> cls, @NonNull AbstractC7653o0oOoo0<Z> o0oooo0) {
        this.OooO00o.add(0, new OooO00o<>(cls, o0oooo0));
    }

    /* JADX DEBUG: Type inference failed for r5v3. Raw type applied. Possible types: com.pd.sdk.o0oOoo0<T>, com.pd.sdk.o0oOoo0<Z> */
    @Nullable
    public synchronized <Z> AbstractC7653o0oOoo0<Z> OooO00o(@NonNull Class<Z> cls) {
        int size = this.OooO00o.size();
        for (int i = 0; i < size; i++) {
            OooO00o<?> oooO00o = this.OooO00o.get(i);
            if (oooO00o.OooO00o(cls)) {
                return (AbstractC7653o0oOoo0<T>) oooO00o.OooO00o;
            }
        }
        return null;
    }
}
