package com.p118pd.sdk;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.oO0OOOoO  reason: case insensitive filesystem */
public class C7869oO0OOOoO {
    public final List<String> OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Map<String, List<OooO00o<?, ?>>> f20946OooO00o = new HashMap();

    /* renamed from: com.pd.sdk.oO0OOOoO$OooO00o */
    public static class OooO00o<T, R> {
        public final AbstractC7650o0oOoOoO<T, R> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Class<T> f20947OooO00o;
        public final Class<R> OooO0O0;

        public OooO00o(@NonNull Class<T> cls, @NonNull Class<R> cls2, AbstractC7650o0oOoOoO<T, R> o0oooooo) {
            this.f20947OooO00o = cls;
            this.OooO0O0 = cls2;
            this.OooO00o = o0oooooo;
        }

        public boolean OooO00o(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f20947OooO00o.isAssignableFrom(cls) && cls2.isAssignableFrom(this.OooO0O0);
        }
    }

    public synchronized void OooO00o(@NonNull List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.OooO00o);
        this.OooO00o.clear();
        this.OooO00o.addAll(list);
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.OooO00o.add(str);
            }
        }
    }

    @NonNull
    public synchronized <T, R> List<Class<R>> OooO0O0(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.OooO00o) {
            List<OooO00o<?, ?>> list = this.f20946OooO00o.get(str);
            if (list != null) {
                for (OooO00o<?, ?> oooO00o : list) {
                    if (oooO00o.OooO00o(cls, cls2) && !arrayList.contains(oooO00o.OooO0O0)) {
                        arrayList.add(oooO00o.OooO0O0);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public synchronized <T, R> List<AbstractC7650o0oOoOoO<T, R>> OooO00o(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (String str : this.OooO00o) {
            List<OooO00o<?, ?>> list = this.f20946OooO00o.get(str);
            if (list != null) {
                for (OooO00o<?, ?> oooO00o : list) {
                    if (oooO00o.OooO00o(cls, cls2)) {
                        arrayList.add(oooO00o.OooO00o);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void OooO0O0(@NonNull String str, @NonNull AbstractC7650o0oOoOoO<T, R> o0oooooo, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        OooO00o(str).add(0, new OooO00o<>(cls, cls2, o0oooooo));
    }

    public synchronized <T, R> void OooO00o(@NonNull String str, @NonNull AbstractC7650o0oOoOoO<T, R> o0oooooo, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        OooO00o(str).add(new OooO00o<>(cls, cls2, o0oooooo));
    }

    @NonNull
    private synchronized List<OooO00o<?, ?>> OooO00o(@NonNull String str) {
        List<OooO00o<?, ?>> list;
        if (!this.OooO00o.contains(str)) {
            this.OooO00o.add(str);
        }
        list = this.f20946OooO00o.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f20946OooO00o.put(str, list);
        }
        return list;
    }
}
