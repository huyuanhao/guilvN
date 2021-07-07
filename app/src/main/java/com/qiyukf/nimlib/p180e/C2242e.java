package com.qiyukf.nimlib.p180e;

import android.os.Build;
import android.os.TransactionTooLargeException;

/* renamed from: com.qiyukf.nimlib.e.e */
public final class C2242e {
    /* renamed from: a */
    public static boolean m4688a(Exception exc) {
        if (!(Build.VERSION.SDK_INT >= 15 ? exc instanceof TransactionTooLargeException : false)) {
            return false;
        }
        try {
            Thread.sleep(20);
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return true;
        }
    }
}
