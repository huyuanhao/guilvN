package com.tencent.bugly.beta.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/* renamed from: com.tencent.bugly.beta.utils.f */
public class C3255f {

    /* renamed from: a */
    public static Toast f7562a;

    /* renamed from: a */
    public static void m7896a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            Toast toast = f7562a;
            if (toast == null) {
                f7562a = Toast.makeText(context, str, 0);
            } else {
                toast.setText(str);
            }
            f7562a.show();
        }
    }
}
