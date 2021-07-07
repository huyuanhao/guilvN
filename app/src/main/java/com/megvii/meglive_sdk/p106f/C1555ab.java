package com.megvii.meglive_sdk.p106f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;

/* renamed from: com.megvii.meglive_sdk.f.ab */
public final class C1555ab extends Toast {

    /* renamed from: a */
    public static Toast f2554a;

    public C1555ab(Context context) {
        super(context);
    }

    /* renamed from: a */
    public static void m2620a(Context context, int i) {
        if (f2554a == null) {
            Toast toast = new Toast(context);
            toast.setView(((LayoutInflater) context.getSystemService("layout_inflater")).inflate(i, (ViewGroup) null));
            toast.setGravity(17, 0, 250);
            toast.setDuration(0);
            f2554a = toast;
        }
        f2554a.show();
    }
}
