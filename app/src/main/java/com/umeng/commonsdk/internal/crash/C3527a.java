package com.umeng.commonsdk.internal.crash;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.umeng.commonsdk.internal.crash.a */
public class C3527a {
    /* renamed from: a */
    public static String m9076a(Throwable th) {
        if (th == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                cause.printStackTrace(printWriter);
            }
            String obj = stringWriter.toString();
            printWriter.close();
            stringWriter.close();
            return obj;
        } catch (Exception unused) {
            return null;
        }
    }
}
