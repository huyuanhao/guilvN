package com.p254ta.utdid2.device;

import android.content.Context;
import com.p254ta.utdid2.p255a.p256a.C3062e;
import com.p254ta.utdid2.p255a.p256a.C3066g;
import java.util.zip.Adler32;

/* renamed from: com.ta.utdid2.device.b */
public class C3078b {

    /* renamed from: a */
    public static C3077a f6805a;

    /* renamed from: d */
    public static final Object f6806d = new Object();

    /* renamed from: a */
    public static long m7202a(C3077a aVar) {
        if (aVar == null) {
            return 0;
        }
        String format = String.format("%s%s%s%s%s", aVar.mo37306f(), aVar.getDeviceId(), Long.valueOf(aVar.mo37298a()), aVar.getImsi(), aVar.mo37304e());
        if (C3066g.m7133a(format)) {
            return 0;
        }
        Adler32 adler32 = new Adler32();
        adler32.reset();
        adler32.update(format.getBytes());
        return adler32.getValue();
    }

    /* renamed from: b */
    public static synchronized C3077a m7204b(Context context) {
        synchronized (C3078b.class) {
            if (f6805a != null) {
                return f6805a;
            } else if (context == null) {
                return null;
            } else {
                C3077a a = m7203a(context);
                f6805a = a;
                return a;
            }
        }
    }

    /* renamed from: a */
    public static C3077a m7203a(Context context) {
        if (context == null) {
            return null;
        }
        synchronized (f6806d) {
            String value = C3079c.m7205a(context).getValue();
            if (C3066g.m7133a(value)) {
                return null;
            }
            if (value.endsWith("\n")) {
                value = value.substring(0, value.length() - 1);
            }
            C3077a aVar = new C3077a();
            long currentTimeMillis = System.currentTimeMillis();
            String a = C3062e.m7124a(context);
            String c = C3062e.m7128c(context);
            aVar.mo37303d(a);
            aVar.mo37301b(a);
            aVar.mo37300b(currentTimeMillis);
            aVar.mo37302c(c);
            aVar.mo37305e(value);
            aVar.mo37299a(m7202a(aVar));
            return aVar;
        }
    }
}
