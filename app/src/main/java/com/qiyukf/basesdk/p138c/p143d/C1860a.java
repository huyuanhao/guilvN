package com.qiyukf.basesdk.p138c.p143d;

import android.content.Context;
import android.text.ClipboardManager;

/* renamed from: com.qiyukf.basesdk.c.d.a */
public final class C1860a {
    /* renamed from: a */
    public static final void m3527a(Context context, CharSequence charSequence) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setText(charSequence);
        }
    }
}
