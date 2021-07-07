package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4251ai;
import com.xiaomi.push.C4282bc;
import com.xiaomi.push.C4285bf;
import com.xiaomi.push.C4498hs;
import com.xiaomi.push.C4567p;
import java.util.Arrays;

/* renamed from: com.xiaomi.push.service.bg */
public class C4642bg {

    /* renamed from: a */
    public static final Object f13299a = new Object();

    /* renamed from: a */
    public static void m14059a(Context context, C4498hs hsVar) {
        if (C4641bf.m14058a(hsVar.mo42031e())) {
            AbstractC4163b.m11301a("TinyData TinyDataStorage.cacheTinyData cache data to file begin item:" + hsVar.mo42029d() + "  ts:" + System.currentTimeMillis());
            C4251ai.m11641a(context).mo41474a(new RunnableC4643bh(context, hsVar));
        }
    }

    /* renamed from: a */
    public static byte[] m14060a(Context context) {
        String a = C4567p.m13738a(context).mo42603a("mipush", "td_key", "");
        if (TextUtils.isEmpty(a)) {
            a = C4285bf.m11799a(20);
            C4567p.m13738a(context).m13742a("mipush", "td_key", a);
        }
        return m14061a(a);
    }

    /* renamed from: a */
    public static byte[] m14061a(String str) {
        byte[] copyOf = Arrays.copyOf(C4282bc.m11788a(str), 16);
        copyOf[0] = 68;
        copyOf[15] = 84;
        return copyOf;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:1:0x0005 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.io.Closeable, java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m14063c(android.content.Context r7, com.xiaomi.push.C4498hs r8) {
        /*
        // Method dump skipped, instructions count: 264
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4642bg.m14063c(android.content.Context, com.xiaomi.push.hs):void");
    }
}
