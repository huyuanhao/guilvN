package com.qiyukf.basesdk.p120b.p121a.p122a;

import android.os.Handler;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1805a;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.qiyukf.basesdk.b.a.a.b */
public final class C1719b implements AbstractC1718a {

    /* renamed from: a */
    public static final Handler f3103a = C1805a.m3404b();

    /* renamed from: b */
    public String f3104b;

    /* renamed from: c */
    public String f3105c;

    /* renamed from: d */
    public long f3106d = 0;

    public C1719b(String str, String str2) {
        this.f3104b = str;
        this.f3105c = str2;
    }

    /* renamed from: a */
    private void m3072a(final Runnable runnable) {
        f3103a.post(new Runnable() {
            /* class com.qiyukf.basesdk.p120b.p121a.p122a.C1719b.RunnableC17256 */

            public final void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    C1709a.m3011a("RES", "download listener exception: " + th.getMessage());
                }
            }
        });
    }

    /* renamed from: a */
    private synchronized void m3073a(List<C1730d> list) {
        HashSet<String> hashSet = new HashSet();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            hashSet.add(list.get(i2).mo33893b());
        }
        for (String str : hashSet) {
            i++;
            if (i == hashSet.size()) {
                C1806a.m3413b(this.f3105c, str);
            } else {
                C1806a.m3408a(this.f3105c, str);
            }
        }
    }

    /* renamed from: c */
    public static List<C1730d> m3074c(String str) {
        List<C1730d> a = C1732f.m3104a().mo33904a(str);
        if (a == null) {
            return null;
        }
        return new ArrayList(a);
    }

    @Override // com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1718a
    /* renamed from: a */
    public final void mo33876a(String str) {
        final List<C1730d> c = m3074c(str);
        if (c != null) {
            m3072a(new Runnable() {
                /* class com.qiyukf.basesdk.p120b.p121a.p122a.C1719b.RunnableC17201 */

                public final void run() {
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            });
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r2 = m3074c(r8);
     */
    @Override // com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1718a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33877a(final java.lang.String r8, final long r9) {
        /*
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r7.f3106d
            long r2 = r0 - r2
            r4 = 200(0xc8, double:9.9E-322)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0022
            java.util.List r2 = m3074c(r8)
            if (r2 == 0) goto L_0x0022
            r7.f3106d = r0
            com.qiyukf.basesdk.b.a.a.b$3 r6 = new com.qiyukf.basesdk.b.a.a.b$3
            r0 = r6
            r1 = r7
            r3 = r9
            r5 = r8
            r0.<init>(r2, r3, r5)
            r7.m3072a(r6)
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p120b.p121a.p122a.C1719b.mo33877a(java.lang.String, long):void");
    }

    @Override // com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1718a
    /* renamed from: a */
    public final void mo33878a(String str, final String str2) {
        final List<C1730d> c = m3074c(str);
        if (c != null) {
            m3072a(new Runnable() {
                /* class com.qiyukf.basesdk.p120b.p121a.p122a.C1719b.RunnableC17245 */

                public final void run() {
                    for (C1730d dVar : c) {
                        if (!dVar.mo33897f() && dVar.mo33898g() != null) {
                            dVar.mo33898g().mo33901b();
                        }
                    }
                }
            });
        }
    }

    @Override // com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1718a
    /* renamed from: b */
    public final void mo33879b(String str) {
        final List<C1730d> c = m3074c(str);
        if (c != null) {
            m3073a(c);
            m3072a(new Runnable() {
                /* class com.qiyukf.basesdk.p120b.p121a.p122a.C1719b.RunnableC17234 */

                public final void run() {
                    for (C1730d dVar : c) {
                        if (!dVar.mo33897f() && dVar.mo33898g() != null) {
                            dVar.mo33898g().mo33899a();
                        }
                    }
                }
            });
        }
    }

    @Override // com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1718a
    /* renamed from: b */
    public final void mo33880b(String str, final long j) {
        final List<C1730d> c = m3074c(str);
        if (c != null) {
            m3072a(new Runnable() {
                /* class com.qiyukf.basesdk.p120b.p121a.p122a.C1719b.RunnableC17212 */

                public final void run() {
                    for (C1730d dVar : c) {
                        if (!dVar.mo33897f() && dVar.mo33898g() != null) {
                            dVar.mo33898g().mo33902b(j);
                        }
                    }
                }
            });
        }
    }
}
