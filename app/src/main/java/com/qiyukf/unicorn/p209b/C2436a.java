package com.qiyukf.unicorn.p209b;

import android.content.Context;
import com.qiyukf.unicorn.api.YSFOptions;
import java.io.Serializable;

/* renamed from: com.qiyukf.unicorn.b.a */
public final class C2436a implements Serializable {

    /* renamed from: a */
    public String f4776a;

    /* renamed from: b */
    public YSFOptions f4777b;

    public C2436a(String str, YSFOptions ySFOptions) {
        this.f4776a = str;
        this.f4777b = ySFOptions;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0034 A[SYNTHETIC, Splitter:B:20:0x0034] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.qiyukf.unicorn.p209b.C2436a m5232a(android.content.Context r5) {
        /*
            java.lang.Class<com.qiyukf.unicorn.b.a> r0 = com.qiyukf.unicorn.p209b.C2436a.class
            monitor-enter(r0)
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x002d }
            java.lang.String r5 = m5234b(r5)     // Catch:{ all -> 0x002d }
            r2.<init>(r5)     // Catch:{ all -> 0x002d }
            java.io.ObjectInputStream r5 = new java.io.ObjectInputStream     // Catch:{ all -> 0x002b }
            r5.<init>(r2)     // Catch:{ all -> 0x002b }
            java.lang.String r3 = r5.readUTF()     // Catch:{ all -> 0x002b }
            java.lang.Object r5 = r5.readObject()     // Catch:{ all -> 0x002b }
            com.qiyukf.unicorn.api.YSFOptions r5 = (com.qiyukf.unicorn.api.YSFOptions) r5     // Catch:{ all -> 0x002b }
            com.qiyukf.unicorn.b.a r4 = new com.qiyukf.unicorn.b.a     // Catch:{ all -> 0x002b }
            r4.<init>(r3, r5)     // Catch:{ all -> 0x002b }
            r2.close()     // Catch:{ IOException -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            r5 = move-exception
            r5.printStackTrace()     // Catch:{ all -> 0x0038 }
        L_0x0029:
            monitor-exit(r0)
            return r4
        L_0x002b:
            r5 = move-exception
            goto L_0x002f
        L_0x002d:
            r5 = move-exception
            r2 = r1
        L_0x002f:
            r5.printStackTrace()     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x003e
            r2.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003e
        L_0x0038:
            r5 = move-exception
            goto L_0x004c
        L_0x003a:
            r5 = move-exception
            r5.printStackTrace()
        L_0x003e:
            monitor-exit(r0)
            return r1
        L_0x0040:
            r5 = move-exception
            if (r2 == 0) goto L_0x004b
            r2.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x004b
        L_0x0047:
            r1 = move-exception
            r1.printStackTrace()
        L_0x004b:
            throw r5
        L_0x004c:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p209b.C2436a.m5232a(android.content.Context):com.qiyukf.unicorn.b.a");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x002c A[SYNTHETIC, Splitter:B:22:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0039 A[DONT_GENERATE] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m5233a(android.content.Context r3, java.lang.String r4, com.qiyukf.unicorn.api.YSFOptions r5) {
        /*
            java.lang.Class<com.qiyukf.unicorn.b.a> r0 = com.qiyukf.unicorn.p209b.C2436a.class
            monitor-enter(r0)
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ all -> 0x0026 }
            java.lang.String r3 = m5234b(r3)     // Catch:{ all -> 0x0026 }
            r2.<init>(r3)     // Catch:{ all -> 0x0026 }
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0023 }
            r3.<init>(r2)     // Catch:{ all -> 0x0023 }
            r3.writeUTF(r4)     // Catch:{ all -> 0x0023 }
            r3.writeObject(r5)     // Catch:{ all -> 0x0023 }
            r2.close()     // Catch:{ IOException -> 0x001d }
            monitor-exit(r0)
            return
        L_0x001d:
            r3 = move-exception
            r3.printStackTrace()     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)
            return
        L_0x0023:
            r3 = move-exception
            r1 = r2
            goto L_0x0027
        L_0x0026:
            r3 = move-exception
        L_0x0027:
            r3.printStackTrace()     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0039
            r1.close()     // Catch:{ IOException -> 0x0033 }
            monitor-exit(r0)
            return
        L_0x0031:
            r3 = move-exception
            goto L_0x0047
        L_0x0033:
            r3 = move-exception
            r3.printStackTrace()
            monitor-exit(r0)
            return
        L_0x0039:
            monitor-exit(r0)
            return
        L_0x003b:
            r3 = move-exception
            if (r1 == 0) goto L_0x0046
            r1.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0046:
            throw r3
        L_0x0047:
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p209b.C2436a.m5233a(android.content.Context, java.lang.String, com.qiyukf.unicorn.api.YSFOptions):void");
    }

    /* renamed from: b */
    public static String m5234b(Context context) {
        return context.getApplicationInfo().dataDir + "/unicorn#cheese#";
    }

    /* renamed from: a */
    public final String mo35651a() {
        return this.f4776a;
    }

    /* renamed from: b */
    public final YSFOptions mo35652b() {
        return this.f4777b;
    }
}
