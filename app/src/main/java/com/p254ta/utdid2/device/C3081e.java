package com.p254ta.utdid2.device;

import com.p254ta.utdid2.p255a.p256a.C3055a;
import com.p254ta.utdid2.p255a.p256a.C3056b;
import com.p254ta.utdid2.p255a.p256a.C3066g;

/* renamed from: com.ta.utdid2.device.e */
public class C3081e {
    /* renamed from: d */
    public String mo37315d(String str) {
        return C3055a.m7117b(str);
    }

    /* renamed from: e */
    public String mo37316e(String str) {
        String b = C3055a.m7117b(str);
        if (!C3066g.m7133a(b)) {
            try {
                return new String(C3056b.decode(b, 0));
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }
}
