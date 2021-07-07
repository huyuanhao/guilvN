package com.p118pd.sdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.modules.netinfo.NetInfoModule;

/* renamed from: com.pd.sdk.o000O00  reason: case insensitive filesystem */
public final class C6979o000O00 {
    public static final int OooO = 8;
    public static final int OooO00o = 1;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 4;
    public static final int OooO0Oo = 8;
    public static final int OooO0o = -1;
    public static final int OooO0o0 = 32;
    public static final int OooO0oO = 2;
    public static final int OooO0oo = 4;
    public static final int OooOO0 = 16;
    public static final int OooOO0O = 32;

    @NonNull
    public static String OooO00o(int i) {
        return i != 1 ? i != 2 ? i != 4 ? i != 8 ? NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED : "CAPABILITY_CAN_FILTER_KEY_EVENTS" : "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY" : "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION" : "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
    }

    @Nullable
    public static String OooO00o(@NonNull AccessibilityServiceInfo accessibilityServiceInfo, @NonNull PackageManager packageManager) {
        if (Build.VERSION.SDK_INT >= 16) {
            return accessibilityServiceInfo.loadDescription(packageManager);
        }
        return accessibilityServiceInfo.getDescription();
    }

    @NonNull
    public static String OooO0O0(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (i > 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i);
            i &= numberOfTrailingZeros ^ -1;
            if (sb.length() > 1) {
                sb.append(", ");
            }
            if (numberOfTrailingZeros == 1) {
                sb.append("FEEDBACK_SPOKEN");
            } else if (numberOfTrailingZeros == 2) {
                sb.append("FEEDBACK_HAPTIC");
            } else if (numberOfTrailingZeros == 4) {
                sb.append("FEEDBACK_AUDIBLE");
            } else if (numberOfTrailingZeros == 8) {
                sb.append("FEEDBACK_VISUAL");
            } else if (numberOfTrailingZeros == 16) {
                sb.append("FEEDBACK_GENERIC");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Nullable
    public static String OooO0OO(int i) {
        if (i == 1) {
            return C8775oo0ooo0.f21953OooO00o;
        }
        if (i == 2) {
            return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
        }
        if (i == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i != 32) {
            return null;
        }
        return "FLAG_REQUEST_FILTER_KEY_EVENTS";
    }

    public static int OooO00o(@NonNull AccessibilityServiceInfo accessibilityServiceInfo) {
        if (Build.VERSION.SDK_INT >= 18) {
            return accessibilityServiceInfo.getCapabilities();
        }
        return accessibilityServiceInfo.getCanRetrieveWindowContent() ? 1 : 0;
    }
}
