package com.p118pd.sdk;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.C0045R;
import androidx.core.view.ViewCompat;

/* renamed from: com.pd.sdk.o00Oo0o  reason: case insensitive filesystem */
public final class C7112o00Oo0o {
    public static final int OooO00o = 0;
    public static final int OooO0O0 = 1;

    @Deprecated
    public static boolean OooO00o(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void OooO0O0(@NonNull ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            viewGroup.setTransitionGroup(z);
        } else {
            viewGroup.setTag(C0045R.C0048id.tag_transition_group, Boolean.valueOf(z));
        }
    }

    @Deprecated
    public static void OooO00o(ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }

    public static int OooO00o(@NonNull ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return viewGroup.getLayoutMode();
        }
        return 0;
    }

    public static int OooO0O0(@NonNull ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.getNestedScrollAxes();
        }
        if (viewGroup instanceof AbstractC7103o00OOooo) {
            return ((AbstractC7103o00OOooo) viewGroup).getNestedScrollAxes();
        }
        return 0;
    }

    public static void OooO00o(@NonNull ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 18) {
            viewGroup.setLayoutMode(i);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18381OooO00o(@NonNull ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C0045R.C0048id.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && ViewCompat.m14574OooO00o(viewGroup) == null) ? false : true;
    }
}
