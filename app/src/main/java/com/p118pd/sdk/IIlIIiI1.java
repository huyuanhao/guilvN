package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.pd.sdk.IIlIIiI1 */
public final class IIlIIiI1 implements LlIiLii {
    public Set<LlIiLii> OooO00o;
    public volatile boolean OooO0O0;

    public IIlIIiI1() {
    }

    public void OooO00o(LlIiLii llIiLii) {
        if (!llIiLii.isUnsubscribed()) {
            if (!this.OooO0O0) {
                synchronized (this) {
                    if (!this.OooO0O0) {
                        if (this.OooO00o == null) {
                            this.OooO00o = new HashSet(4);
                        }
                        this.OooO00o.add(llIiLii);
                        return;
                    }
                }
            }
            llIiLii.unsubscribe();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        r2.unsubscribe();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO0O0(com.p118pd.sdk.LlIiLii r2) {
        /*
            r1 = this;
            boolean r0 = r1.OooO0O0
            if (r0 != 0) goto L_0x0020
            monitor-enter(r1)
            boolean r0 = r1.OooO0O0     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x001b
            java.util.Set<com.pd.sdk.LlIiLii> r0 = r1.OooO00o     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x000e
            goto L_0x001b
        L_0x000e:
            java.util.Set<com.pd.sdk.LlIiLii> r0 = r1.OooO00o     // Catch:{ all -> 0x001d }
            boolean r0 = r0.remove(r2)     // Catch:{ all -> 0x001d }
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            if (r0 == 0) goto L_0x0020
            r2.unsubscribe()
            goto L_0x0020
        L_0x001b:
            monitor-exit(r1)
            return
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.IIlIIiI1.OooO0O0(com.pd.sdk.LlIiLii):void");
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
                    Set<LlIiLii> set = this.OooO00o;
                    this.OooO00o = null;
                    OooO00o(set);
                }
            }
        }
    }

    public IIlIIiI1(LlIiLii... llIiLiiArr) {
        this.OooO00o = new HashSet(Arrays.asList(llIiLiiArr));
    }

    public void OooO00o(LlIiLii... llIiLiiArr) {
        int i = 0;
        if (!this.OooO0O0) {
            synchronized (this) {
                if (!this.OooO0O0) {
                    if (this.OooO00o == null) {
                        this.OooO00o = new HashSet(llIiLiiArr.length);
                    }
                    int length = llIiLiiArr.length;
                    while (i < length) {
                        LlIiLii llIiLii = llIiLiiArr[i];
                        if (!llIiLii.isUnsubscribed()) {
                            this.OooO00o.add(llIiLii);
                        }
                        i++;
                    }
                    return;
                }
            }
        }
        int length2 = llIiLiiArr.length;
        while (i < length2) {
            llIiLiiArr[i].unsubscribe();
            i++;
        }
    }

    public void OooO00o() {
        if (!this.OooO0O0) {
            synchronized (this) {
                if (!this.OooO0O0) {
                    if (this.OooO00o != null) {
                        Set<LlIiLii> set = this.OooO00o;
                        this.OooO00o = null;
                        OooO00o(set);
                    }
                }
            }
        }
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

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15409OooO00o() {
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
