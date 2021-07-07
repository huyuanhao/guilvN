package com.qiyukf.unicorn.p232k;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;

/* renamed from: com.qiyukf.unicorn.k.g */
public final class C2706g {
    /* renamed from: a */
    public static void m6258a(Activity activity) {
        if (activity != null && activity.getCurrentFocus() != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 2);
        }
    }

    /* renamed from: a */
    public static void m6259a(final View view) {
        if (view != null) {
            view.setFocusable(true);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            view.postDelayed(new Runnable() {
                /* class com.qiyukf.unicorn.p232k.C2706g.RunnableC27071 */

                public final void run() {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            }, 200);
        }
    }

    /* renamed from: a */
    public static void m6260a(Fragment fragment) {
        if (fragment != null) {
            m6258a(fragment.getActivity());
        }
    }

    /* renamed from: b */
    public static void m6261b(View view) {
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 2);
        }
    }
}
