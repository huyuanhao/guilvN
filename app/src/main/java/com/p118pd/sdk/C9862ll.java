package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.pd.sdk.丨丨ll  reason: invalid class name and case insensitive filesystem */
public final class C9862ll implements LlIiLii {
    public List<LlIiLii> OooO00o;
    public volatile boolean OooO0O0;

    public C9862ll() {
    }

    public void OooO00o(LlIiLii llIiLii) {
        if (!llIiLii.isUnsubscribed()) {
            if (!this.OooO0O0) {
                synchronized (this) {
                    if (!this.OooO0O0) {
                        List list = this.OooO00o;
                        if (list == null) {
                            list = new LinkedList();
                            this.OooO00o = list;
                        }
                        list.add(llIiLii);
                        return;
                    }
                }
            }
            llIiLii.unsubscribe();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r3.unsubscribe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO0O0(com.p118pd.sdk.LlIiLii r3) {
        /*
            r2 = this;
            boolean r0 = r2.OooO0O0
            if (r0 != 0) goto L_0x001e
            monitor-enter(r2)
            java.util.List<com.pd.sdk.LlIiLii> r0 = r2.OooO00o     // Catch:{ all -> 0x001b }
            boolean r1 = r2.OooO0O0     // Catch:{ all -> 0x001b }
            if (r1 != 0) goto L_0x0019
            if (r0 != 0) goto L_0x000e
            goto L_0x0019
        L_0x000e:
            boolean r0 = r0.remove(r3)     // Catch:{ all -> 0x001b }
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x001e
            r3.unsubscribe()
            goto L_0x001e
        L_0x0019:
            monitor-exit(r2)
            return
        L_0x001b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9862ll.OooO0O0(com.pd.sdk.LlIiLii):void");
    }

    @Override // com.p118pd.sdk.LlIiLii
    public boolean isUnsubscribed() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.LlIiLii
    public void unsubscribe() {
        if (!this.OooO0O0) {
            synchronized (this) {
                if (!this.OooO0O0) {
                    this.OooO0O0 = true;
                    List<LlIiLii> list = this.OooO00o;
                    this.OooO00o = null;
                    OooO00o(list);
                }
            }
        }
    }

    public C9862ll(LlIiLii... llIiLiiArr) {
        this.OooO00o = new LinkedList(Arrays.asList(llIiLiiArr));
    }

    public C9862ll(LlIiLii llIiLii) {
        LinkedList linkedList = new LinkedList();
        this.OooO00o = linkedList;
        linkedList.add(llIiLii);
    }

    public static void OooO00o(Collection<LlIiLii> collection) {
        if (collection != null) {
            ArrayList arrayList = null;
            for (LlIiLii llIiLii : collection) {
                try {
                    llIiLii.unsubscribe();
                } catch (Throwable th) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            IIl11.OooO00o(arrayList);
        }
    }

    public void OooO00o() {
        List<LlIiLii> list;
        if (!this.OooO0O0) {
            synchronized (this) {
                list = this.OooO00o;
                this.OooO00o = null;
            }
            OooO00o(list);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21949OooO00o() {
        boolean z = false;
        if (this.OooO0O0) {
            return false;
        }
        synchronized (this) {
            if (!this.OooO0O0 && this.OooO00o != null && !this.OooO00o.isEmpty()) {
                z = true;
            }
        }
        return z;
    }
}
