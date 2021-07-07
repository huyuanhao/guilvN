package com.qiyukf.unicorn.api;

import android.app.Activity;
import android.app.Fragment;
import org.json.JSONObject;
import s.h.e.l.l.C;

public class QiyuTracker {
    static {
        C.i(16777272);
    }

    public static native void onBehavior(Activity activity, String str, JSONObject jSONObject);

    public static native void onBehavior(Fragment fragment, String str, JSONObject jSONObject);

    public static native void onBehavior(androidx.fragment.app.Fragment fragment, String str, JSONObject jSONObject);

    public static native void onPause(Activity activity);

    public static native void onPause(Activity activity, CharSequence charSequence);

    public static native void onPause(Fragment fragment, CharSequence charSequence);

    public static native void onPause(androidx.fragment.app.Fragment fragment, CharSequence charSequence);

    public static native void onResume(Activity activity);

    public static native void onResume(Activity activity, CharSequence charSequence);

    public static native void onResume(Fragment fragment, CharSequence charSequence);

    public static native void onResume(androidx.fragment.app.Fragment fragment, CharSequence charSequence);
}
