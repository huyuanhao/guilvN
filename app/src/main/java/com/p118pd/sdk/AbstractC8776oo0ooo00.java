package com.p118pd.sdk;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.pd.sdk.oo0ooo00  reason: case insensitive filesystem */
public abstract class AbstractC8776oo0ooo00<T> {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f21955OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f21956OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Runnable f21957OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f21958OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<T> f21959OooO00o = new CopyOnWriteArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21960OooO00o = false;

    /* renamed from: com.pd.sdk.oo0ooo00$OooO00o */
    public class OooO00o implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ List f21961OooO00o;

        public OooO00o(List list) {
            this.f21961OooO00o = list;
        }

        public void run() {
            AbstractC8776oo0ooo00.this.f21959OooO00o.addAll(this.f21961OooO00o);
            if (C8879ooO0oOoO.m20523OooO00o() - AbstractC8776oo0ooo00.this.f21955OooO00o >= ((long) AbstractC8776oo0ooo00.this.OooO00o)) {
                AbstractC8776oo0ooo00.this.OooO0O0();
            } else if (!AbstractC8776oo0ooo00.this.f21960OooO00o) {
                AbstractC8776oo0ooo00.this.OooO00o().postDelayed(AbstractC8776oo0ooo00.this.f21957OooO00o, (long) AbstractC8776oo0ooo00.this.OooO00o);
                AbstractC8776oo0ooo00.this.f21960OooO00o = true;
            }
        }
    }

    /* renamed from: com.pd.sdk.oo0ooo00$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void run() {
            AbstractC8776oo0ooo00.this.OooO00o().removeCallbacks(AbstractC8776oo0ooo00.this.f21957OooO00o);
            AbstractC8776oo0ooo00.this.OooO0O0();
            AbstractC8776oo0ooo00.this.f21960OooO00o = false;
        }
    }

    public AbstractC8776oo0ooo00(int i, String str) {
        this.OooO00o = i;
        this.f21958OooO00o = str;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0O0() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f21959OooO00o);
        this.f21959OooO00o.clear();
        if (!arrayList.isEmpty()) {
            OooO0O0(arrayList);
            this.f21955OooO00o = C8879ooO0oOoO.m20523OooO00o();
        }
    }

    public abstract void OooO0O0(List<T> list);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20416OooO00o() {
        OooO00o().removeCallbacks(this.f21957OooO00o);
        this.f21956OooO00o = null;
        this.f21959OooO00o.clear();
        this.f21955OooO00o = 0;
        this.f21960OooO00o = false;
    }

    public void OooO00o(List<T> list) {
        if (list != null && !list.isEmpty()) {
            OooO00o().post(new OooO00o(list));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Handler OooO00o() {
        if (this.f21956OooO00o == null) {
            this.f21956OooO00o = C8775oo0ooo0.OooO00o().m20415OooO00o(this.f21958OooO00o);
        }
        return this.f21956OooO00o;
    }
}
