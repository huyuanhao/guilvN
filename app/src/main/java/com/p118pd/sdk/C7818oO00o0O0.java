package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oO00o0O0  reason: case insensitive filesystem */
public class C7818oO00o0O0 {
    public final List<OooO00o<?>> OooO00o = new ArrayList();

    /* renamed from: com.pd.sdk.oO00o0O0$OooO00o */
    public static final class OooO00o<T> {
        public final AbstractC7641o0oOoO<T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Class<T> f20872OooO00o;

        public OooO00o(@NonNull Class<T> cls, @NonNull AbstractC7641o0oOoO<T> o0oooo) {
            this.f20872OooO00o = cls;
            this.OooO00o = o0oooo;
        }

        public boolean OooO00o(@NonNull Class<?> cls) {
            return this.f20872OooO00o.isAssignableFrom(cls);
        }
    }

    @Nullable
    public synchronized <T> AbstractC7641o0oOoO<T> OooO00o(@NonNull Class<T> cls) {
        for (OooO00o<?> oooO00o : this.OooO00o) {
            if (oooO00o.OooO00o(cls)) {
                return oooO00o.OooO00o;
            }
        }
        return null;
    }

    public synchronized <T> void OooO0O0(@NonNull Class<T> cls, @NonNull AbstractC7641o0oOoO<T> o0oooo) {
        this.OooO00o.add(0, new OooO00o<>(cls, o0oooo));
    }

    public synchronized <T> void OooO00o(@NonNull Class<T> cls, @NonNull AbstractC7641o0oOoO<T> o0oooo) {
        this.OooO00o.add(new OooO00o<>(cls, o0oooo));
    }
}
