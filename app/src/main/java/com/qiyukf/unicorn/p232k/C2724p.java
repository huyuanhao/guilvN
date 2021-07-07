package com.qiyukf.unicorn.p232k;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: com.qiyukf.unicorn.k.p */
public final class C2724p {
    /* renamed from: a */
    public static void m6289a(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m6289a(viewGroup.getChildAt(i), z);
            }
        }
    }

    /* renamed from: a */
    public static void m6290a(Window window, float f) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = f;
        window.setAttributes(attributes);
    }
}
