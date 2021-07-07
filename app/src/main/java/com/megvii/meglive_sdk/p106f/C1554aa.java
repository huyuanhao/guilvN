package com.megvii.meglive_sdk.p106f;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.megvii.meglive_sdk.f.aa */
public final class C1554aa {
    /* renamed from: a */
    public static String m2619a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            return stringWriter.toString();
        } finally {
            printWriter.close();
        }
    }
}
