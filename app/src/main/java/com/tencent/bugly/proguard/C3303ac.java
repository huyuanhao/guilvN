package com.tencent.bugly.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.common.info.C3269a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.tencent.bugly.proguard.ac */
public class C3303ac {

    /* renamed from: a */
    public static final long f7949a = System.currentTimeMillis();

    /* renamed from: b */
    public static C3303ac f7950b;

    /* renamed from: c */
    public Context f7951c;

    /* renamed from: d */
    public String f7952d = C3269a.m7966b().f7681e;

    /* renamed from: e */
    public Map<Integer, Map<String, C3302ab>> f7953e = new HashMap();

    /* renamed from: f */
    public SharedPreferences f7954f;

    public C3303ac(Context context) {
        this.f7951c = context;
        this.f7954f = context.getSharedPreferences("crashrecord", 0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r6 != null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        if (r6 != null) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized <T extends java.util.List<?>> T m8239c(int r6) {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3303ac.m8239c(int):java.util.List");
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private synchronized boolean m8236b(int i) {
        try {
            List<C3302ab> c = m8239c(i);
            if (c == null) {
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C3302ab abVar : c) {
                if (abVar.f7943b != null && abVar.f7943b.equalsIgnoreCase(this.f7952d) && abVar.f7945d > 0) {
                    arrayList.add(abVar);
                }
                if (abVar.f7944c + 86400000 < currentTimeMillis) {
                    arrayList2.add(abVar);
                }
            }
            Collections.sort(arrayList);
            if (arrayList.size() < 2) {
                c.removeAll(arrayList2);
                m8233a(i, c);
                return false;
            } else if (arrayList.size() <= 0 || ((C3302ab) arrayList.get(arrayList.size() - 1)).f7944c + 86400000 >= currentTimeMillis) {
                return true;
            } else {
                c.clear();
                m8233a(i, c);
                return false;
            }
        } catch (Exception unused) {
            C3321an.m8357e("isFrequentCrash failed", new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    public static synchronized C3303ac m8230a(Context context) {
        C3303ac acVar;
        synchronized (C3303ac.class) {
            if (f7950b == null) {
                f7950b = new C3303ac(context);
            }
            acVar = f7950b;
        }
        return acVar;
    }

    /* renamed from: a */
    public static synchronized C3303ac m8229a() {
        C3303ac acVar;
        synchronized (C3303ac.class) {
            acVar = f7950b;
        }
        return acVar;
    }

    /* renamed from: a */
    public void mo38334a(final int i, final int i2) {
        C3319am.m8340a().mo38398a(new Runnable() {
            /* class com.tencent.bugly.proguard.C3303ac.RunnableC33041 */

            public void run() {
                C3302ab abVar;
                try {
                    if (!TextUtils.isEmpty(C3303ac.this.f7952d)) {
                        List<C3302ab> c = C3303ac.this.m8239c((C3303ac) i);
                        if (c == null) {
                            c = new ArrayList();
                        }
                        if (C3303ac.this.f7953e.get(Integer.valueOf(i)) == null) {
                            C3303ac.this.f7953e.put(Integer.valueOf(i), new HashMap());
                        }
                        if (((Map) C3303ac.this.f7953e.get(Integer.valueOf(i))).get(C3303ac.this.f7952d) == null) {
                            abVar = new C3302ab();
                            abVar.f7942a = (long) i;
                            abVar.f7948g = C3303ac.f7949a;
                            abVar.f7943b = C3303ac.this.f7952d;
                            abVar.f7947f = C3269a.m7966b().f7692p;
                            C3269a.m7966b().getClass();
                            abVar.f7946e = "2.6.5";
                            abVar.f7944c = System.currentTimeMillis();
                            abVar.f7945d = i2;
                            ((Map) C3303ac.this.f7953e.get(Integer.valueOf(i))).put(C3303ac.this.f7952d, abVar);
                        } else {
                            abVar = (C3302ab) ((Map) C3303ac.this.f7953e.get(Integer.valueOf(i))).get(C3303ac.this.f7952d);
                            abVar.f7945d = i2;
                        }
                        ArrayList arrayList = new ArrayList();
                        boolean z = false;
                        for (C3302ab abVar2 : c) {
                            if (abVar2.f7948g == abVar.f7948g && abVar2.f7943b != null && abVar2.f7943b.equalsIgnoreCase(abVar.f7943b)) {
                                z = true;
                                abVar2.f7945d = abVar.f7945d;
                            }
                            if (!(abVar2.f7946e == null || abVar2.f7946e.equalsIgnoreCase(abVar.f7946e)) || (!(abVar2.f7947f == null || abVar2.f7947f.equalsIgnoreCase(abVar.f7947f)) || abVar2.f7945d <= 0)) {
                                arrayList.add(abVar2);
                            }
                        }
                        c.removeAll(arrayList);
                        if (!z) {
                            c.add(abVar);
                        }
                        C3303ac.this.m8233a((C3303ac) i, (int) c);
                    }
                } catch (Exception unused) {
                    C3321an.m8357e("saveCrashRecord failed", new Object[0]);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r2 != null) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized <T extends java.util.List<?>> void m8233a(int r5, T r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r6 != 0) goto L_0x0005
            monitor-exit(r4)
            return
        L_0x0005:
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0055 }
            android.content.Context r2 = r4.f7951c     // Catch:{ Exception -> 0x0055 }
            java.lang.String r3 = "crashrecord"
            java.io.File r2 = r2.getDir(r3, r0)     // Catch:{ Exception -> 0x0055 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0055 }
            r3.<init>()     // Catch:{ Exception -> 0x0055 }
            r3.append(r5)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r5 = ""
            r3.append(r5)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r5 = r3.toString()     // Catch:{ Exception -> 0x0055 }
            r1.<init>(r2, r5)     // Catch:{ Exception -> 0x0055 }
            r5 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x003c, all -> 0x0038 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x003c, all -> 0x0038 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x003c, all -> 0x0038 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x003c, all -> 0x0038 }
            r2.writeObject(r6)     // Catch:{ IOException -> 0x0036 }
        L_0x0032:
            r2.close()
            goto L_0x005c
        L_0x0036:
            r5 = move-exception
            goto L_0x003f
        L_0x0038:
            r6 = move-exception
            r2 = r5
            r5 = r6
            goto L_0x004d
        L_0x003c:
            r6 = move-exception
            r2 = r5
            r5 = r6
        L_0x003f:
            r5.printStackTrace()     // Catch:{ all -> 0x004c }
            java.lang.String r5 = "open record file error"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ all -> 0x004c }
            com.tencent.bugly.proguard.C3321an.m8349a(r5, r6)     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x005c
            goto L_0x0032
        L_0x004c:
            r5 = move-exception
        L_0x004d:
            if (r2 == 0) goto L_0x0052
            r2.close()
        L_0x0052:
            throw r5
        L_0x0053:
            r5 = move-exception
            goto L_0x005e
        L_0x0055:
            java.lang.String r5 = "writeCrashRecord error"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ all -> 0x0053 }
            com.tencent.bugly.proguard.C3321an.m8357e(r5, r6)     // Catch:{ all -> 0x0053 }
        L_0x005c:
            monitor-exit(r4)
            return
        L_0x005e:
            monitor-exit(r4)
            goto L_0x0061
        L_0x0060:
            throw r5
        L_0x0061:
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C3303ac.m8233a(int, java.util.List):void");
    }

    /* renamed from: a */
    public synchronized boolean mo38335a(final int i) {
        boolean z;
        z = true;
        try {
            SharedPreferences sharedPreferences = this.f7954f;
            z = sharedPreferences.getBoolean(i + "_" + this.f7952d, true);
            C3319am.m8340a().mo38398a(new Runnable() {
                /* class com.tencent.bugly.proguard.C3303ac.RunnableC33052 */

                public void run() {
                    boolean b = C3303ac.this.m8236b((C3303ac) i);
                    SharedPreferences.Editor edit = C3303ac.this.f7954f.edit();
                    edit.putBoolean(i + "_" + C3303ac.this.f7952d, !b).commit();
                }
            });
        } catch (Exception unused) {
            C3321an.m8357e("canInit error", new Object[0]);
            return z;
        }
        return z;
    }
}
