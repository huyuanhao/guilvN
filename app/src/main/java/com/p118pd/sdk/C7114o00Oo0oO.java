package com.p118pd.sdk;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: com.pd.sdk.o00Oo0oO  reason: case insensitive filesystem */
public final class C7114o00Oo0oO {
    public static final String OooO00o = "ViewParentCompat";

    @Deprecated
    public static boolean OooO00o(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void OooO0O0(ViewParent viewParent, View view, View view2, int i) {
        OooO00o(viewParent, view, view2, i, 0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18384OooO00o(ViewParent viewParent, View view, View view2, int i) {
        return m18385OooO00o(viewParent, view, view2, i, 0);
    }

    public static void OooO00o(ViewParent viewParent, View view) {
        OooO00o(viewParent, view, 0);
    }

    public static void OooO00o(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        OooO00o(viewParent, view, i, i2, i3, i4, 0);
    }

    public static void OooO00o(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        OooO00o(viewParent, view, i, i2, iArr, 0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18385OooO00o(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof AbstractC7102o00OOooO) {
            return ((AbstractC7102o00OOooO) viewParent).m18380OooO00o(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError unused) {
                String str = "ViewParent " + viewParent + " does not implement interface " + "method onStartNestedScroll";
                return false;
            }
        } else if (viewParent instanceof AbstractC7103o00OOooo) {
            return ((AbstractC7103o00OOooo) viewParent).onStartNestedScroll(view, view2, i);
        } else {
            return false;
        }
    }

    public static void OooO00o(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof AbstractC7102o00OOooO) {
            ((AbstractC7102o00OOooO) viewParent).OooO00o(view, view2, i, i2);
        } else if (i2 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError unused) {
                    String str = "ViewParent " + viewParent + " does not implement interface " + "method onNestedScrollAccepted";
                }
            } else if (viewParent instanceof AbstractC7103o00OOooo) {
                ((AbstractC7103o00OOooo) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    public static void OooO00o(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof AbstractC7102o00OOooO) {
            ((AbstractC7102o00OOooO) viewParent).OooO00o(view, i);
        } else if (i != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError unused) {
                    String str = "ViewParent " + viewParent + " does not implement interface " + "method onStopNestedScroll";
                }
            } else if (viewParent instanceof AbstractC7103o00OOooo) {
                ((AbstractC7103o00OOooo) viewParent).onStopNestedScroll(view);
            }
        }
    }

    public static void OooO00o(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof AbstractC7102o00OOooO) {
            ((AbstractC7102o00OOooO) viewParent).OooO00o(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                    String str = "ViewParent " + viewParent + " does not implement interface " + "method onNestedScroll";
                }
            } else if (viewParent instanceof AbstractC7103o00OOooo) {
                ((AbstractC7103o00OOooo) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    public static void OooO00o(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof AbstractC7102o00OOooO) {
            ((AbstractC7102o00OOooO) viewParent).OooO00o(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError unused) {
                    String str = "ViewParent " + viewParent + " does not implement interface " + "method onNestedPreScroll";
                }
            } else if (viewParent instanceof AbstractC7103o00OOooo) {
                ((AbstractC7103o00OOooo) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    public static boolean OooO00o(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError unused) {
                String str = "ViewParent " + viewParent + " does not implement interface " + "method onNestedFling";
                return false;
            }
        } else if (viewParent instanceof AbstractC7103o00OOooo) {
            return ((AbstractC7103o00OOooo) viewParent).onNestedFling(view, f, f2, z);
        } else {
            return false;
        }
    }

    public static boolean OooO00o(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError unused) {
                String str = "ViewParent " + viewParent + " does not implement interface " + "method onNestedPreFling";
                return false;
            }
        } else if (viewParent instanceof AbstractC7103o00OOooo) {
            return ((AbstractC7103o00OOooo) viewParent).onNestedPreFling(view, f, f2);
        } else {
            return false;
        }
    }

    public static void OooO00o(ViewParent viewParent, View view, View view2, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }
    }
}
