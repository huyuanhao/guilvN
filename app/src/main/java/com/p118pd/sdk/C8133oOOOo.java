package com.p118pd.sdk;

import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.p118pd.sdk.C8179oOOo00Oo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: com.pd.sdk.oOOOo  reason: case insensitive filesystem */
public class C8133oOOOo {
    public final OooO00o OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f21146OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<C8168oOOOooo0> f21147OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final PriorityQueue<C8168oOOOooo0> f21148OooO00o = new PriorityQueue<>(C8179oOOo00Oo.OooO00o.OooO00o, this.OooO00o);
    public final PriorityQueue<C8168oOOOooo0> OooO0O0 = new PriorityQueue<>(C8179oOOo00Oo.OooO00o.OooO00o, this.OooO00o);

    /* renamed from: com.pd.sdk.oOOOo$OooO00o */
    public class OooO00o implements Comparator<C8168oOOOooo0> {
        public OooO00o() {
        }

        /* renamed from: OooO00o */
        public int compare(C8168oOOOooo0 ooooooo0, C8168oOOOooo0 ooooooo02) {
            if (ooooooo0.OooO00o() == ooooooo02.OooO00o()) {
                return 0;
            }
            return ooooooo0.OooO00o() > ooooooo02.OooO00o() ? 1 : -1;
        }
    }

    private void OooO0OO() {
        synchronized (this.f21146OooO00o) {
            while (this.OooO0O0.size() + this.f21148OooO00o.size() >= C8179oOOo00Oo.OooO00o.OooO00o && !this.f21148OooO00o.isEmpty()) {
                this.f21148OooO00o.poll().m19818OooO00o().recycle();
            }
            while (this.OooO0O0.size() + this.f21148OooO00o.size() >= C8179oOOo00Oo.OooO00o.OooO00o && !this.OooO0O0.isEmpty()) {
                this.OooO0O0.poll().m19818OooO00o().recycle();
            }
        }
    }

    public void OooO00o(C8168oOOOooo0 ooooooo0) {
        synchronized (this.f21146OooO00o) {
            OooO0OO();
            this.OooO0O0.offer(ooooooo0);
        }
    }

    public void OooO0O0(C8168oOOOooo0 ooooooo0) {
        synchronized (this.f21147OooO00o) {
            while (this.f21147OooO00o.size() >= C8179oOOo00Oo.OooO00o.OooO0O0) {
                this.f21147OooO00o.remove(0).m19818OooO00o().recycle();
            }
            OooO00o(this.f21147OooO00o, ooooooo0);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19791OooO00o() {
        synchronized (this.f21146OooO00o) {
            this.f21148OooO00o.addAll(this.OooO0O0);
            this.OooO0O0.clear();
        }
    }

    public List<C8168oOOOooo0> OooO0O0() {
        List<C8168oOOOooo0> list;
        synchronized (this.f21147OooO00o) {
            list = this.f21147OooO00o;
        }
        return list;
    }

    public boolean OooO00o(int i, RectF rectF, int i2) {
        C8168oOOOooo0 ooooooo0 = new C8168oOOOooo0(i, null, rectF, false, 0);
        synchronized (this.f21146OooO00o) {
            C8168oOOOooo0 OooO00o2 = OooO00o(this.f21148OooO00o, ooooooo0);
            boolean z = true;
            if (OooO00o2 != null) {
                this.f21148OooO00o.remove(OooO00o2);
                OooO00o2.OooO00o(i2);
                this.OooO0O0.offer(OooO00o2);
                return true;
            }
            if (OooO00o(this.OooO0O0, ooooooo0) == null) {
                z = false;
            }
            return z;
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m19792OooO0O0() {
        synchronized (this.f21146OooO00o) {
            Iterator<C8168oOOOooo0> it = this.f21148OooO00o.iterator();
            while (it.hasNext()) {
                it.next().m19818OooO00o().recycle();
            }
            this.f21148OooO00o.clear();
            Iterator<C8168oOOOooo0> it2 = this.OooO0O0.iterator();
            while (it2.hasNext()) {
                it2.next().m19818OooO00o().recycle();
            }
            this.OooO0O0.clear();
        }
        synchronized (this.f21147OooO00o) {
            for (C8168oOOOooo0 ooooooo0 : this.f21147OooO00o) {
                ooooooo0.m19818OooO00o().recycle();
            }
            this.f21147OooO00o.clear();
        }
    }

    public boolean OooO00o(int i, RectF rectF) {
        C8168oOOOooo0 ooooooo0 = new C8168oOOOooo0(i, null, rectF, true, 0);
        synchronized (this.f21147OooO00o) {
            for (C8168oOOOooo0 ooooooo02 : this.f21147OooO00o) {
                if (ooooooo02.equals(ooooooo0)) {
                    return true;
                }
            }
            return false;
        }
    }

    private void OooO00o(Collection<C8168oOOOooo0> collection, C8168oOOOooo0 ooooooo0) {
        for (C8168oOOOooo0 ooooooo02 : collection) {
            if (ooooooo02.equals(ooooooo0)) {
                ooooooo0.m19818OooO00o().recycle();
                return;
            }
        }
        collection.add(ooooooo0);
    }

    @Nullable
    public static C8168oOOOooo0 OooO00o(PriorityQueue<C8168oOOOooo0> priorityQueue, C8168oOOOooo0 ooooooo0) {
        Iterator<C8168oOOOooo0> it = priorityQueue.iterator();
        while (it.hasNext()) {
            C8168oOOOooo0 next = it.next();
            if (next.equals(ooooooo0)) {
                return next;
            }
        }
        return null;
    }

    public List<C8168oOOOooo0> OooO00o() {
        ArrayList arrayList;
        synchronized (this.f21146OooO00o) {
            arrayList = new ArrayList(this.f21148OooO00o);
            arrayList.addAll(this.OooO0O0);
        }
        return arrayList;
    }
}
