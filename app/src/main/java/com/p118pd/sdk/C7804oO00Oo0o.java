package com.p118pd.sdk;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oO00Oo0o  reason: case insensitive filesystem */
public class C7804oO00Oo0o {
    public final List<OooO00o<?, ?>> OooO00o = new ArrayList();

    /* renamed from: com.pd.sdk.oO00Oo0o$OooO00o */
    public static final class OooO00o<Z, R> {
        public final AbstractC7803oO00Oo0O<Z, R> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Class<Z> f20858OooO00o;
        public final Class<R> OooO0O0;

        public OooO00o(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull AbstractC7803oO00Oo0O<Z, R> oo00oo0o) {
            this.f20858OooO00o = cls;
            this.OooO0O0 = cls2;
            this.OooO00o = oo00oo0o;
        }

        public boolean OooO00o(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f20858OooO00o.isAssignableFrom(cls) && cls2.isAssignableFrom(this.OooO0O0);
        }
    }

    public synchronized <Z, R> void OooO00o(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull AbstractC7803oO00Oo0O<Z, R> oo00oo0o) {
        this.OooO00o.add(new OooO00o<>(cls, cls2, oo00oo0o));
    }

    @NonNull
    public synchronized <Z, R> AbstractC7803oO00Oo0O<Z, R> OooO00o(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C7801oO00Oo.OooO00o();
        }
        for (OooO00o<?, ?> oooO00o : this.OooO00o) {
            if (oooO00o.OooO00o(cls, cls2)) {
                return oooO00o.OooO00o;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized <Z, R> List<Class<R>> m19507OooO00o(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (OooO00o<?, ?> oooO00o : this.OooO00o) {
            if (oooO00o.OooO00o(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }
}
