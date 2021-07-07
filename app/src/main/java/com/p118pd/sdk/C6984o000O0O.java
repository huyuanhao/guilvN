package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.pd.sdk.o000O0O  reason: case insensitive filesystem */
public final class C6984o000O0O<T> {
    public final Pools.OooO00o<ArrayList<T>> OooO00o = new Pools.SimplePool(10);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6987o000O0o<T, ArrayList<T>> f19186OooO00o = new C6987o000O0o<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ArrayList<T> f19187OooO00o = new ArrayList<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final HashSet<T> f19188OooO00o = new HashSet<>();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18197OooO00o(@NonNull T t) {
        if (!this.f19186OooO00o.containsKey(t)) {
            this.f19186OooO00o.put(t, null);
        }
    }

    @Nullable
    public List<T> OooO0O0(@NonNull T t) {
        int size = this.f19186OooO00o.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> OooO0OO = this.f19186OooO00o.OooO0OO(i);
            if (OooO0OO != null && OooO0OO.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f19186OooO00o.OooO00o(i));
            }
        }
        return arrayList;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18198OooO00o(@NonNull T t) {
        return this.f19186OooO00o.containsKey(t);
    }

    public void OooO00o(@NonNull T t, @NonNull T t2) {
        if (!this.f19186OooO00o.containsKey(t) || !this.f19186OooO00o.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = this.f19186OooO00o.get(t);
        if (arrayList == null) {
            arrayList = OooO0O0();
            this.f19186OooO00o.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18199OooO0O0(@NonNull T t) {
        int size = this.f19186OooO00o.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> OooO0OO = this.f19186OooO00o.OooO0OO(i);
            if (OooO0OO != null && OooO0OO.contains(t)) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    private ArrayList<T> OooO0O0() {
        ArrayList<T> acquire = this.OooO00o.acquire();
        return acquire == null ? new ArrayList<>() : acquire;
    }

    @Nullable
    public List OooO00o(@NonNull T t) {
        return this.f19186OooO00o.get(t);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18196OooO00o() {
        int size = this.f19186OooO00o.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> OooO0OO = this.f19186OooO00o.OooO0OO(i);
            if (OooO0OO != null) {
                OooO00o((ArrayList) OooO0OO);
            }
        }
        this.f19186OooO00o.clear();
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ArrayList<T> m18195OooO00o() {
        this.f19187OooO00o.clear();
        this.f19188OooO00o.clear();
        int size = this.f19186OooO00o.size();
        for (int i = 0; i < size; i++) {
            OooO00o(this.f19186OooO00o.OooO00o(i), this.f19187OooO00o, this.f19188OooO00o);
        }
        return this.f19187OooO00o;
    }

    private void OooO00o(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList<T> arrayList2 = this.f19186OooO00o.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        OooO00o(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public int OooO00o() {
        return this.f19186OooO00o.size();
    }

    private void OooO00o(@NonNull ArrayList<T> arrayList) {
        arrayList.clear();
        this.OooO00o.release(arrayList);
    }
}
