package com.p118pd.sdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;

/* renamed from: com.pd.sdk.o00OoOO0  reason: case insensitive filesystem */
public final class C7122o00OoOO0 {

    @Deprecated
    /* renamed from: com.pd.sdk.o00OoOO0$OooO00o */
    public interface OooO00o {
        @Deprecated
        void onAccessibilityStateChanged(boolean z);
    }

    @Deprecated
    /* renamed from: com.pd.sdk.o00OoOO0$OooO0O0 */
    public static abstract class OooO0O0 implements OooO00o {
    }

    /* renamed from: com.pd.sdk.o00OoOO0$OooO0OO */
    public static class OooO0OO implements AccessibilityManager.AccessibilityStateChangeListener {
        public OooO00o OooO00o;

        public OooO0OO(@NonNull OooO00o oooO00o) {
            this.OooO00o = oooO00o;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OooO0OO.class != obj.getClass()) {
                return false;
            }
            return this.OooO00o.equals(((OooO0OO) obj).OooO00o);
        }

        public int hashCode() {
            return this.OooO00o.hashCode();
        }

        public void onAccessibilityStateChanged(boolean z) {
            this.OooO00o.onAccessibilityStateChanged(z);
        }
    }

    /* renamed from: com.pd.sdk.o00OoOO0$OooO0Oo  reason: case insensitive filesystem */
    public interface AbstractC7123OooO0Oo {
        void onTouchExplorationStateChanged(boolean z);
    }

    @RequiresApi(19)
    /* renamed from: com.pd.sdk.o00OoOO0$OooO0o0  reason: case insensitive filesystem */
    public static class accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC7124OooO0o0 implements AccessibilityManager.TouchExplorationStateChangeListener {
        public final AbstractC7123OooO0Oo OooO00o;

        public accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC7124OooO0o0(@NonNull AbstractC7123OooO0Oo oooO0Oo) {
            this.OooO00o = oooO0Oo;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC7124OooO0o0.class != obj.getClass()) {
                return false;
            }
            return this.OooO00o.equals(((accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC7124OooO0o0) obj).OooO00o);
        }

        public int hashCode() {
            return this.OooO00o.hashCode();
        }

        public void onTouchExplorationStateChanged(boolean z) {
            this.OooO00o.onTouchExplorationStateChanged(z);
        }
    }

    @Deprecated
    public static boolean OooO00o(AccessibilityManager accessibilityManager, OooO00o oooO00o) {
        if (oooO00o == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new OooO0OO(oooO00o));
    }

    @Deprecated
    public static boolean OooO0O0(AccessibilityManager accessibilityManager, OooO00o oooO00o) {
        if (oooO00o == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new OooO0OO(oooO00o));
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> OooO00o(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    public static boolean OooO0O0(AccessibilityManager accessibilityManager, AbstractC7123OooO0Oo oooO0Oo) {
        if (Build.VERSION.SDK_INT < 19 || oooO0Oo == null) {
            return false;
        }
        return accessibilityManager.removeTouchExplorationStateChangeListener(new accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC7124OooO0o0(oooO0Oo));
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> OooO00o(AccessibilityManager accessibilityManager, int i) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i);
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18454OooO00o(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    public static boolean OooO00o(AccessibilityManager accessibilityManager, AbstractC7123OooO0Oo oooO0Oo) {
        if (Build.VERSION.SDK_INT < 19 || oooO0Oo == null) {
            return false;
        }
        return accessibilityManager.addTouchExplorationStateChangeListener(new accessibility.AccessibilityManager$TouchExplorationStateChangeListenerC7124OooO0o0(oooO0Oo));
    }
}
