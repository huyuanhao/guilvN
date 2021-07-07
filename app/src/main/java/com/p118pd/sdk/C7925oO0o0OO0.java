package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.pd.sdk.oO0o0OO0  reason: case insensitive filesystem */
public final class C7925oO0o0OO0 {
    @NotNull
    public final List<AbstractC7922oO0o0O0O> OooO00o = new ArrayList();

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Iterable<AbstractC7922oO0o0O0O> m19661OooO00o() {
        return this.OooO00o;
    }

    public String toString() {
        int OooO00o2 = OooO00o();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(OooO00o2);
        objArr[1] = OooO00o2 == 1 ? "directory" : "directories";
        return String.format("Metadata (%d %s)", objArr);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public <T extends AbstractC7922oO0o0O0O> Collection<T> m19662OooO00o(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC7922oO0o0O0O oo0o0o0o : this.OooO00o) {
            if (cls.isAssignableFrom(oo0o0o0o.getClass())) {
                arrayList.add(oo0o0o0o);
            }
        }
        return arrayList;
    }

    public int OooO00o() {
        return this.OooO00o.size();
    }

    public <T extends AbstractC7922oO0o0O0O> void OooO00o(@NotNull T t) {
        this.OooO00o.add(t);
    }

    @Nullable
    public <T extends AbstractC7922oO0o0O0O> T OooO00o(@NotNull Class<T> cls) {
        Iterator<AbstractC7922oO0o0O0O> it = this.OooO00o.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (cls.isAssignableFrom(t.getClass())) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19664OooO00o(Class<? extends AbstractC7922oO0o0O0O> cls) {
        for (AbstractC7922oO0o0O0O oo0o0o0o : this.OooO00o) {
            if (cls.isAssignableFrom(oo0o0o0o.getClass())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19663OooO00o() {
        for (AbstractC7922oO0o0O0O oo0o0o0o : m19661OooO00o()) {
            if (oo0o0o0o.m19649OooO00o()) {
                return true;
            }
        }
        return false;
    }
}
