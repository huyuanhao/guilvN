package com.p118pd.sdk;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import javax.annotation.Nullable;

/* renamed from: com.pd.sdk.ooOooOO  reason: case insensitive filesystem */
public class C9082ooOooOO implements AbstractC9091ooOooo0o {
    public final SparseArray<C9063ooOoOooo> OooO00o = new SparseArray<>();
    public final SparseArray<Integer> OooO0O0 = new SparseArray<>();
    public final SparseArray<ArrayList<C9063ooOoOooo>> OooO0OO = new SparseArray<>();

    private synchronized void OooO0O0(C9063ooOoOooo oooooooo) {
        Integer num = this.OooO0O0.get(oooooooo.m20740OooO0OO());
        if (num != null) {
            this.OooO0O0.remove(oooooooo.m20740OooO0OO());
            ArrayList<C9063ooOoOooo> arrayList = this.OooO0OO.get(num.intValue());
            if (arrayList != null) {
                arrayList.remove(oooooooo);
                if (arrayList.size() == 0) {
                    this.OooO0OO.remove(num.intValue());
                }
            }
        }
        if (oooooooo.m20731OooO00o() != null) {
            oooooooo.m20741OooO0OO();
        }
    }

    public synchronized void OooO00o(C9063ooOoOooo oooooooo) {
        this.OooO00o.put(oooooooo.m20740OooO0OO(), oooooooo);
    }

    @Nullable
    public synchronized C9063ooOoOooo OooO00o(int i) {
        return this.OooO00o.get(i);
    }

    public synchronized boolean OooO00o(int i, int i2) {
        C9063ooOoOooo oooooooo = this.OooO00o.get(i);
        if (oooooooo == null) {
            return false;
        }
        OooO0O0(oooooooo);
        OooO00o(i2, oooooooo);
        return true;
    }

    private synchronized void OooO00o(int i, C9063ooOoOooo oooooooo) {
        if (this.OooO0O0.get(oooooooo.m20740OooO0OO()) == null) {
            this.OooO0O0.put(oooooooo.m20740OooO0OO(), Integer.valueOf(i));
            ArrayList<C9063ooOoOooo> arrayList = this.OooO0OO.get(i);
            if (arrayList == null) {
                ArrayList<C9063ooOoOooo> arrayList2 = new ArrayList<>(1);
                arrayList2.add(oooooooo);
                this.OooO0OO.put(i, arrayList2);
            } else {
                arrayList.add(oooooooo);
            }
        } else {
            throw new IllegalStateException("Handler " + oooooooo + " already attached");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized void m20760OooO00o(int i) {
        C9063ooOoOooo oooooooo = this.OooO00o.get(i);
        if (oooooooo != null) {
            OooO0O0(oooooooo);
            this.OooO00o.remove(i);
        }
    }

    public synchronized void OooO00o() {
        this.OooO00o.clear();
        this.OooO0O0.clear();
        this.OooO0OO.clear();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized ArrayList<C9063ooOoOooo> m20759OooO00o(int i) {
        return this.OooO0OO.get(i);
    }

    @Override // com.p118pd.sdk.AbstractC9091ooOooo0o
    public synchronized ArrayList<C9063ooOoOooo> OooO00o(View view) {
        return m20759OooO00o(view.getId());
    }
}
