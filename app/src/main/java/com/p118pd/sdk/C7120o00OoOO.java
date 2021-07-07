package com.p118pd.sdk;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.pd.sdk.o00OoOO  reason: case insensitive filesystem */
public class C7120o00OoOO {
    public static final int OooO = 16;

    /* renamed from: OooO  reason: collision with other field name */
    public static final String f19452OooO = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String OooO00o = "AccessibilityNodeInfo.roleDescription";
    public static final int OooO0O0 = 1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f19453OooO0O0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";
    public static final int OooO0OO = 2;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final String f19454OooO0OO = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";
    public static final int OooO0Oo = 4;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final String f19455OooO0Oo = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";
    public static final int OooO0o = 2;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final String f19456OooO0o = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final int OooO0o0 = 1;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final String f19457OooO0o0 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
    public static final int OooO0oO = 4;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static final String f19458OooO0oO = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final int OooO0oo = 8;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public static final String f19459OooO0oo = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final int OooOO0 = 32;

    /* renamed from: OooOO0  reason: collision with other field name */
    public static final String f19460OooOO0 = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final int OooOO0O = 64;

    /* renamed from: OooOO0O  reason: collision with other field name */
    public static final String f19461OooOO0O = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final int OooOO0o = 128;

    /* renamed from: OooOO0o  reason: collision with other field name */
    public static final String f19462OooOO0o = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final int OooOOO = 512;

    /* renamed from: OooOOO  reason: collision with other field name */
    public static final String f19463OooOOO = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final int OooOOO0 = 256;

    /* renamed from: OooOOO0  reason: collision with other field name */
    public static final String f19464OooOOO0 = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final int OooOOOO = 1024;

    /* renamed from: OooOOOO  reason: collision with other field name */
    public static final String f19465OooOOOO = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final int OooOOOo = 2048;

    /* renamed from: OooOOOo  reason: collision with other field name */
    public static final String f19466OooOOOo = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    public static final int OooOOo = 8192;
    public static final int OooOOo0 = 4096;
    public static final int OooOOoo = 16384;
    public static final int OooOo = 524288;
    public static final int OooOo0 = 65536;
    public static final int OooOo00 = 32768;
    public static final int OooOo0O = 131072;
    public static final int OooOo0o = 262144;
    public static final int OooOoO = 2097152;
    public static final int OooOoO0 = 1048576;
    public static final int OooOoOO = 1;
    public static final int OooOoo = 1;
    public static final int OooOoo0 = 2;
    public static final int OooOooO = 2;
    public static final int OooOooo = 4;
    public static final int Oooo000 = 8;
    public static final int Oooo00O = 16;
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f19467OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AccessibilityNodeInfo f19468OooO00o;

    /* renamed from: com.pd.sdk.o00OoOO$OooO00o */
    public static class OooO00o {
        public static final OooO00o OooO = new OooO00o(256, null);
        public static final OooO00o OooO00o = new OooO00o(1, null);
        public static final OooO00o OooO0O0 = new OooO00o(2, null);
        public static final OooO00o OooO0OO = new OooO00o(4, null);
        public static final OooO00o OooO0Oo = new OooO00o(8, null);
        public static final OooO00o OooO0o = new OooO00o(32, null);
        public static final OooO00o OooO0o0 = new OooO00o(16, null);
        public static final OooO00o OooO0oO = new OooO00o(64, null);
        public static final OooO00o OooO0oo = new OooO00o(128, null);
        public static final OooO00o OooOO0 = new OooO00o(512, null);
        public static final OooO00o OooOO0O = new OooO00o(1024, null);
        public static final OooO00o OooOO0o = new OooO00o(2048, null);
        public static final OooO00o OooOOO = new OooO00o(8192, null);
        public static final OooO00o OooOOO0 = new OooO00o(4096, null);
        public static final OooO00o OooOOOO = new OooO00o(16384, null);
        public static final OooO00o OooOOOo = new OooO00o(32768, null);
        public static final OooO00o OooOOo = new OooO00o(131072, null);
        public static final OooO00o OooOOo0 = new OooO00o(65536, null);
        public static final OooO00o OooOOoo = new OooO00o(262144, null);
        public static final OooO00o OooOo = new OooO00o(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null);
        public static final OooO00o OooOo0 = new OooO00o(1048576, null);
        public static final OooO00o OooOo00 = new OooO00o(524288, null);
        public static final OooO00o OooOo0O = new OooO00o(2097152, null);
        public static final OooO00o OooOo0o = new OooO00o(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null);
        public static final OooO00o OooOoO = new OooO00o(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null);
        public static final OooO00o OooOoO0 = new OooO00o(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null);
        public static final OooO00o OooOoOO = new OooO00o(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null);
        public static final OooO00o OooOoo = new OooO00o(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null);
        public static final OooO00o OooOoo0 = new OooO00o(Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null);
        public static final OooO00o OooOooO = new OooO00o(Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null);
        public static final OooO00o OooOooo = new OooO00o(Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null);
        public static final OooO00o Oooo000 = new OooO00o(Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null);
        public static final OooO00o Oooo00O;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Object f19469OooO00o;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            if (Build.VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            Oooo00O = new OooO00o(accessibilityAction);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, CharSequence charSequence) {
            this(Build.VERSION.SDK_INT >= 21 ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : null);
        }

        public int OooO00o() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f19469OooO00o).getId();
            }
            return 0;
        }

        public OooO00o(Object obj) {
            this.f19469OooO00o = obj;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public CharSequence m18449OooO00o() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f19469OooO00o).getLabel();
            }
            return null;
        }
    }

    @Deprecated
    public C7120o00OoOO(Object obj) {
        this.f19468OooO00o = (AccessibilityNodeInfo) obj;
    }

    public static C7120o00OoOO OooO00o(Object obj) {
        if (obj != null) {
            return new C7120o00OoOO(obj);
        }
        return null;
    }

    public static String OooO00o(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    public static C7120o00OoOO OooO0o() {
        return OooO00o(AccessibilityNodeInfo.obtain());
    }

    public int OooO() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f19468OooO00o.getTextSelectionStart();
        }
        return -1;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C7120o00OoOO m18427OooO0O0(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            return OooO00o((Object) this.f19468OooO00o.focusSearch(i));
        }
        return null;
    }

    public C7120o00OoOO OooO0OO(int i) {
        return OooO00o((Object) this.f19468OooO00o.getChild(i));
    }

    public void OooO0Oo(View view) {
        this.f19468OooO00o.setParent(view);
    }

    public void OooO0o0(View view) {
        this.f19468OooO00o.setSource(view);
    }

    public int OooO0oO() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f19468OooO00o.getMovementGranularities();
        }
        return 0;
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public CharSequence m18446OooO0oo() {
        return this.f19468OooO00o.getText();
    }

    public int OooOO0() {
        return this.f19468OooO00o.getWindowId();
    }

    public boolean OooOO0O() {
        return this.f19468OooO00o.isFocusable();
    }

    public boolean OooOO0o() {
        return this.f19468OooO00o.isFocused();
    }

    public boolean OooOOO() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f19468OooO00o.isImportantForAccessibility();
        }
        return true;
    }

    public boolean OooOOO0() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f19468OooO00o.isHeading();
        }
        if (OooO0O0(2)) {
            return true;
        }
        OooO0OO OooO00o2 = m18406OooO00o();
        if (OooO00o2 == null || !OooO00o2.m18451OooO00o()) {
            return false;
        }
        return true;
    }

    public boolean OooOOOO() {
        return this.f19468OooO00o.isLongClickable();
    }

    public boolean OooOOOo() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f19468OooO00o.isMultiLine();
        }
        return false;
    }

    public boolean OooOOo() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f19468OooO00o.isScreenReaderFocusable();
        }
        return OooO0O0(1);
    }

    public boolean OooOOo0() {
        return this.f19468OooO00o.isPassword();
    }

    public boolean OooOOoo() {
        return this.f19468OooO00o.isScrollable();
    }

    public boolean OooOo0() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f19468OooO00o.isShowingHintText();
        }
        return OooO0O0(4);
    }

    public boolean OooOo00() {
        return this.f19468OooO00o.isSelected();
    }

    public boolean OooOo0O() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f19468OooO00o.isVisibleToUser();
        }
        return false;
    }

    public boolean OooOo0o() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f19468OooO00o.refresh();
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7120o00OoOO.class != obj.getClass()) {
            return false;
        }
        C7120o00OoOO o00oooo = (C7120o00OoOO) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f19468OooO00o;
        if (accessibilityNodeInfo == null) {
            if (o00oooo.f19468OooO00o != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(o00oooo.f19468OooO00o)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f19468OooO00o;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        OooO00o(rect);
        sb.append("; boundsInParent: " + rect);
        OooO0O0(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(m18442OooO0o0());
        sb.append("; className: ");
        sb.append(m18411OooO00o());
        sb.append("; text: ");
        sb.append(m18446OooO0oo());
        sb.append("; contentDescription: ");
        sb.append(m18428OooO0O0());
        sb.append("; viewId: ");
        sb.append(m18413OooO00o());
        sb.append("; checkable: ");
        sb.append(m18434OooO0OO());
        sb.append("; checked: ");
        sb.append(m18437OooO0Oo());
        sb.append("; focusable: ");
        sb.append(OooOO0O());
        sb.append("; focused: ");
        sb.append(OooOO0o());
        sb.append("; selected: ");
        sb.append(OooOo00());
        sb.append("; clickable: ");
        sb.append(m18443OooO0o0());
        sb.append("; longClickable: ");
        sb.append(OooOOOO());
        sb.append("; enabled: ");
        sb.append(m18448OooOO0());
        sb.append("; password: ");
        sb.append(OooOOo0());
        sb.append("; scrollable: " + OooOOoo());
        sb.append("; [");
        int OooO00o2 = OooO00o();
        while (OooO00o2 != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(OooO00o2);
            OooO00o2 &= numberOfTrailingZeros ^ -1;
            sb.append(OooO00o(numberOfTrailingZeros));
            if (OooO00o2 != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: com.pd.sdk.o00OoOO$OooO0OO */
    public static class OooO0OO {
        public final Object OooO00o;

        public OooO0OO(Object obj) {
            this.OooO00o = obj;
        }

        public static OooO0OO OooO00o(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 21) {
                return new OooO0OO(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
            }
            if (i5 >= 19) {
                return new OooO0OO(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new OooO0OO(null);
        }

        public int OooO0O0() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.OooO00o).getColumnSpan();
            }
            return 0;
        }

        public int OooO0OO() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.OooO00o).getRowIndex();
            }
            return 0;
        }

        public int OooO0Oo() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.OooO00o).getRowSpan();
            }
            return 0;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m18452OooO0O0() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.OooO00o).isSelected();
            }
            return false;
        }

        public static OooO0OO OooO00o(int i, int i2, int i3, int i4, boolean z) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new OooO0OO(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new OooO0OO(null);
        }

        public int OooO00o() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.OooO00o).getColumnIndex();
            }
            return 0;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18451OooO00o() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionItemInfo) this.OooO00o).isHeading();
            }
            return false;
        }
    }

    public static C7120o00OoOO OooO00o(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C7120o00OoOO(accessibilityNodeInfo);
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public C7120o00OoOO m18431OooO0OO() {
        return OooO00o((Object) this.f19468OooO00o.getParent());
    }

    public void OooO0Oo(View view, int i) {
        this.f19467OooO00o = i;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f19468OooO00o.setParent(view, i);
        }
    }

    public void OooO0o(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f19468OooO00o.setMovementGranularities(i);
        }
    }

    public void OooO0o0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f19468OooO00o.setSource(view, i);
        }
    }

    public void OooO0oo(CharSequence charSequence) {
        this.f19468OooO00o.setText(charSequence);
    }

    /* renamed from: OooOO0  reason: collision with other method in class */
    public boolean m18448OooOO0() {
        return this.f19468OooO00o.isEnabled();
    }

    public void OooOO0O(boolean z) {
        this.f19468OooO00o.setFocusable(z);
    }

    public void OooOO0o(boolean z) {
        this.f19468OooO00o.setFocused(z);
    }

    public void OooOOOO(boolean z) {
        this.f19468OooO00o.setLongClickable(z);
    }

    public void OooOOo0(boolean z) {
        this.f19468OooO00o.setPassword(z);
    }

    public void OooOOoo(boolean z) {
        this.f19468OooO00o.setScrollable(z);
    }

    public void OooOo00(boolean z) {
        this.f19468OooO00o.setSelected(z);
    }

    /* renamed from: OooO  reason: collision with other method in class */
    public boolean m18402OooO() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f19468OooO00o.isEditable();
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AccessibilityNodeInfo m18404OooO00o() {
        return this.f19468OooO00o;
    }

    public int OooO0O0() {
        return this.f19468OooO00o.getChildCount();
    }

    public void OooO0OO(Rect rect) {
        this.f19468OooO00o.setBoundsInParent(rect);
    }

    /* renamed from: OooO0oO  reason: collision with other method in class */
    public boolean m18445OooO0oO() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.f19468OooO00o.isContextClickable();
        }
        return false;
    }

    public int OooO0oo() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f19468OooO00o.getTextSelectionEnd();
        }
        return -1;
    }

    public void OooOO0(boolean z) {
        this.f19468OooO00o.setEnabled(z);
    }

    public void OooOOO(boolean z) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f19468OooO00o.setImportantForAccessibility(z);
        }
    }

    public void OooOOOo(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f19468OooO00o.setMultiLine(z);
        }
    }

    public void OooOo0O(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f19468OooO00o.setVisibleToUser(z);
        }
    }

    /* renamed from: com.pd.sdk.o00OoOO$OooO0O0 */
    public static class OooO0O0 {
        public static final int OooO00o = 0;
        public static final int OooO0O0 = 1;
        public static final int OooO0OO = 2;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Object f19470OooO00o;

        public OooO0O0(Object obj) {
            this.f19470OooO00o = obj;
        }

        public static OooO0O0 OooO00o(int i, int i2, boolean z, int i3) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 21) {
                return new OooO0O0(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
            }
            if (i4 >= 19) {
                return new OooO0O0(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new OooO0O0(null);
        }

        public int OooO0O0() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionInfo) this.f19470OooO00o).getRowCount();
            }
            return 0;
        }

        public int OooO0OO() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.CollectionInfo) this.f19470OooO00o).getSelectionMode();
            }
            return 0;
        }

        public static OooO0O0 OooO00o(int i, int i2, boolean z) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new OooO0O0(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
            }
            return new OooO0O0(null);
        }

        public int OooO00o() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionInfo) this.f19470OooO00o).getColumnCount();
            }
            return 0;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m18450OooO00o() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.CollectionInfo) this.f19470OooO00o).isHierarchical();
            }
            return false;
        }
    }

    /* renamed from: com.pd.sdk.o00OoOO$OooO0Oo  reason: case insensitive filesystem */
    public static class C7121OooO0Oo {
        public static final int OooO00o = 0;
        public static final int OooO0O0 = 1;
        public static final int OooO0OO = 2;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Object f19471OooO00o;

        public C7121OooO0Oo(Object obj) {
            this.f19471OooO00o = obj;
        }

        public static C7121OooO0Oo OooO00o(int i, float f, float f2, float f3) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new C7121OooO0Oo(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
            }
            return new C7121OooO0Oo(null);
        }

        public float OooO0O0() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.RangeInfo) this.f19471OooO00o).getMax();
            }
            return 0.0f;
        }

        public float OooO0OO() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.RangeInfo) this.f19471OooO00o).getMin();
            }
            return 0.0f;
        }

        public float OooO00o() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.RangeInfo) this.f19471OooO00o).getCurrent();
            }
            return 0.0f;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public int m18453OooO00o() {
            if (Build.VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo.RangeInfo) this.f19471OooO00o).getType();
            }
            return 0;
        }
    }

    public C7120o00OoOO(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f19468OooO00o = accessibilityNodeInfo;
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m18412OooO00o() {
        return this.f19468OooO00o;
    }

    public void OooO0O0(Rect rect) {
        this.f19468OooO00o.getBoundsInScreen(rect);
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m18434OooO0OO() {
        return this.f19468OooO00o.isCheckable();
    }

    public void OooO0o(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f19468OooO00o.setContentInvalid(z);
        }
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m18443OooO0o0() {
        return this.f19468OooO00o.isClickable();
    }

    public void OooOOo(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f19468OooO00o.setScreenReaderFocusable(z);
        } else {
            OooO00o(1, z);
        }
    }

    public void OooOo0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f19468OooO00o.setShowingHintText(z);
        } else {
            OooO00o(4, z);
        }
    }

    public static C7120o00OoOO OooO00o(View view) {
        return OooO00o(AccessibilityNodeInfo.obtain(view));
    }

    public void OooO(boolean z) {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f19468OooO00o.setEditable(z);
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18430OooO0O0() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f19468OooO00o.isAccessibilityFocused();
        }
        return false;
    }

    public void OooO0OO(boolean z) {
        this.f19468OooO00o.setCheckable(z);
    }

    public void OooO0Oo(Rect rect) {
        this.f19468OooO00o.setBoundsInScreen(rect);
    }

    public void OooO0o0(boolean z) {
        this.f19468OooO00o.setClickable(z);
    }

    public void OooO0oO(boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f19468OooO00o.setContextClickable(z);
        }
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public boolean m18447OooO0oo() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f19468OooO00o.isDismissable();
        }
        return false;
    }

    public static C7120o00OoOO OooO00o(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            return OooO00o((Object) AccessibilityNodeInfo.obtain(view, i));
        }
        return null;
    }

    public int OooO0OO() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f19468OooO00o.getDrawingOrder();
        }
        return 0;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m18437OooO0Oo() {
        return this.f19468OooO00o.isChecked();
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public boolean m18440OooO0o() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f19468OooO00o.isContentInvalid();
        }
        return false;
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public CharSequence m18442OooO0o0() {
        return this.f19468OooO00o.getPackageName();
    }

    public void OooOOO0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f19468OooO00o.setHeading(z);
        } else {
            OooO00o(2, z);
        }
    }

    @Nullable
    /* renamed from: OooO  reason: collision with other method in class */
    public CharSequence m18401OooO() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return this.f19468OooO00o.getTooltipText();
        }
        if (i >= 19) {
            return this.f19468OooO00o.getExtras().getCharSequence(f19454OooO0OO);
        }
        return null;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public CharSequence m18428OooO0O0() {
        return this.f19468OooO00o.getContentDescription();
    }

    public void OooO0Oo(boolean z) {
        this.f19468OooO00o.setChecked(z);
    }

    public void OooO0o0(CharSequence charSequence) {
        this.f19468OooO00o.setPackageName(charSequence);
    }

    public void OooO0oO(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f19468OooO00o.setTraversalBefore(view);
        }
    }

    public void OooO0oo(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f19468OooO00o.setDismissable(z);
        }
    }

    public void OooO0O0(CharSequence charSequence) {
        this.f19468OooO00o.setContentDescription(charSequence);
    }

    public void OooO0OO(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f19468OooO00o.setError(charSequence);
        }
    }

    public void OooO0Oo(int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f19468OooO00o.setLiveRegion(i);
        }
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public int m18438OooO0o() {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f19468OooO00o.getMaxTextLength();
        }
        return -1;
    }

    public int OooO0o0() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f19468OooO00o.getLiveRegion();
        }
        return 0;
    }

    public static C7120o00OoOO OooO00o(C7120o00OoOO o00oooo) {
        return OooO00o(AccessibilityNodeInfo.obtain(o00oooo.f19468OooO00o));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m18429OooO0O0(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f19468OooO00o.setDrawingOrder(i);
        }
    }

    public void OooO0oO(View view, int i) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f19468OooO00o.setTraversalBefore(view, i);
        }
    }

    public void OooO(@Nullable CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f19468OooO00o.setTooltipText(charSequence);
        } else if (i >= 19) {
            this.f19468OooO00o.getExtras().putCharSequence(f19454OooO0OO, charSequence);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7120o00OoOO m18409OooO00o(int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            return OooO00o((Object) this.f19468OooO00o.findFocus(i));
        }
        return null;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public CharSequence m18432OooO0OO() {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f19468OooO00o.getError();
        }
        return null;
    }

    @Nullable
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public CharSequence m18436OooO0Oo() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return this.f19468OooO00o.getHintText();
        }
        if (i >= 19) {
            return this.f19468OooO00o.getExtras().getCharSequence(f19455OooO0Oo);
        }
        return null;
    }

    public void OooO0o(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f19468OooO00o.setTraversalAfter(view);
        }
    }

    public void OooO0o0(int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f19468OooO00o.setMaxTextLength(i);
        }
    }

    public void OooO0O0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f19468OooO00o.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((OooO0OO) obj).OooO00o);
        }
    }

    @Nullable
    /* renamed from: OooO0oO  reason: collision with other method in class */
    public CharSequence m18444OooO0oO() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f19468OooO00o.getExtras().getCharSequence(OooO00o);
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18417OooO00o(View view) {
        this.f19468OooO00o.addChild(view);
    }

    public void OooO0OO(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f19468OooO00o.setLabeledBy(view);
        }
    }

    public void OooO0o(View view, int i) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f19468OooO00o.setTraversalAfter(view, i);
        }
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public C7120o00OoOO m18441OooO0o0() {
        if (Build.VERSION.SDK_INT >= 22) {
            return OooO00o((Object) this.f19468OooO00o.getTraversalBefore());
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18418OooO00o(View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f19468OooO00o.addChild(view, i);
        }
    }

    public void OooO0O0(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f19468OooO00o.setLabelFor(view);
        }
    }

    public void OooO0Oo(@Nullable CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f19468OooO00o.setHintText(charSequence);
        } else if (i >= 19) {
            this.f19468OooO00o.getExtras().putCharSequence(f19455OooO0Oo, charSequence);
        }
    }

    public void OooO0oO(@Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f19468OooO00o.getExtras().putCharSequence(OooO00o, charSequence);
        }
    }

    public void OooO0OO(View view, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f19468OooO00o.setLabeledBy(view, i);
        }
    }

    public void OooO0o(@Nullable CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f19468OooO00o.setPaneTitle(charSequence);
        } else if (i >= 19) {
            this.f19468OooO00o.getExtras().putCharSequence(f19453OooO0O0, charSequence);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18423OooO00o(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f19468OooO00o.removeChild(view);
        }
        return false;
    }

    public void OooO0O0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f19468OooO00o.setLabelFor(view, i);
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m18433OooO0OO(int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f19468OooO00o.setInputType(i);
        }
    }

    public int OooO0Oo() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f19468OooO00o.getInputType();
        }
        return 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18424OooO00o(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f19468OooO00o.removeChild(view, i);
        }
        return false;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C7120o00OoOO m18426OooO0O0() {
        if (Build.VERSION.SDK_INT >= 17) {
            return OooO00o((Object) this.f19468OooO00o.getLabeledBy());
        }
        return null;
    }

    @Nullable
    /* renamed from: OooO0o  reason: collision with other method in class */
    public CharSequence m18439OooO0o() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return this.f19468OooO00o.getPaneTitle();
        }
        if (i >= 19) {
            return this.f19468OooO00o.getExtras().getCharSequence(f19453OooO0O0);
        }
        return null;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public C7120o00OoOO m18435OooO0Oo() {
        if (Build.VERSION.SDK_INT >= 22) {
            return OooO00o((Object) this.f19468OooO00o.getTraversalAfter());
        }
        return null;
    }

    public int OooO00o() {
        return this.f19468OooO00o.getActions();
    }

    public void OooO0O0(boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f19468OooO00o.setCanOpenPopup(z);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18416OooO00o(int i) {
        this.f19468OooO00o.addAction(i);
    }

    public void OooO00o(OooO00o oooO00o) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f19468OooO00o.addAction((AccessibilityNodeInfo.AccessibilityAction) oooO00o.f19469OooO00o);
        }
    }

    public List<C7120o00OoOO> OooO0O0(String str) {
        if (Build.VERSION.SDK_INT < 18) {
            return Collections.emptyList();
        }
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId = this.f19468OooO00o.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        for (AccessibilityNodeInfo accessibilityNodeInfo : findAccessibilityNodeInfosByViewId) {
            arrayList.add(OooO00o(accessibilityNodeInfo));
        }
        return arrayList;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18425OooO00o(OooO00o oooO00o) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f19468OooO00o.removeAction((AccessibilityNodeInfo.AccessibilityAction) oooO00o.f19469OooO00o);
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18422OooO00o(int i) {
        return this.f19468OooO00o.performAction(i);
    }

    public boolean OooO00o(int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f19468OooO00o.performAction(i, bundle);
        }
        return false;
    }

    private boolean OooO0O0(int i) {
        Bundle OooO00o2 = m18403OooO00o();
        if (OooO00o2 != null && (OooO00o2.getInt(f19457OooO0o0, 0) & i) == i) {
            return true;
        }
        return false;
    }

    public List<C7120o00OoOO> OooO00o(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText = this.f19468OooO00o.findAccessibilityNodeInfosByText(str);
        int size = findAccessibilityNodeInfosByText.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(OooO00o(findAccessibilityNodeInfosByText.get(i)));
        }
        return arrayList;
    }

    public void OooO00o(Rect rect) {
        this.f19468OooO00o.getBoundsInParent(rect);
    }

    public void OooO00o(boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f19468OooO00o.setAccessibilityFocused(z);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m18411OooO00o() {
        return this.f19468OooO00o.getClassName();
    }

    public void OooO00o(CharSequence charSequence) {
        this.f19468OooO00o.setClassName(charSequence);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18415OooO00o() {
        this.f19468OooO00o.recycle();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18420OooO00o(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f19468OooO00o.setViewIdResourceName(str);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18413OooO00o() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f19468OooO00o.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public OooO0O0 m18405OooO00o() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        if (Build.VERSION.SDK_INT < 19 || (collectionInfo = this.f19468OooO00o.getCollectionInfo()) == null) {
            return null;
        }
        return new OooO0O0(collectionInfo);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18419OooO00o(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f19468OooO00o.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((OooO0O0) obj).f19470OooO00o);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public OooO0OO m18406OooO00o() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        if (Build.VERSION.SDK_INT < 19 || (collectionItemInfo = this.f19468OooO00o.getCollectionItemInfo()) == null) {
            return null;
        }
        return new OooO0OO(collectionItemInfo);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7121OooO0Oo m18407OooO00o() {
        AccessibilityNodeInfo.RangeInfo rangeInfo;
        if (Build.VERSION.SDK_INT < 19 || (rangeInfo = this.f19468OooO00o.getRangeInfo()) == null) {
            return null;
        }
        return new C7121OooO0Oo(rangeInfo);
    }

    public void OooO00o(C7121OooO0Oo oooO0Oo) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f19468OooO00o.setRangeInfo((AccessibilityNodeInfo.RangeInfo) oooO0Oo.f19471OooO00o);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<OooO00o> m18414OooO00o() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f19468OooO00o.getActionList() : null;
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new OooO00o(actionList.get(i)));
        }
        return arrayList;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7120o00OoOO m18408OooO00o() {
        if (Build.VERSION.SDK_INT >= 17) {
            return OooO00o((Object) this.f19468OooO00o.getLabelFor());
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18421OooO00o() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f19468OooO00o.canOpenPopup();
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Bundle m18403OooO00o() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f19468OooO00o.getExtras();
        }
        return new Bundle();
    }

    public void OooO00o(int i, int i2) {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f19468OooO00o.setTextSelection(i, i2);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7128o00OoOo0 m18410OooO00o() {
        if (Build.VERSION.SDK_INT >= 21) {
            return C7128o00OoOo0.OooO00o(this.f19468OooO00o.getWindow());
        }
        return null;
    }

    private void OooO00o(int i, boolean z) {
        Bundle OooO00o2 = m18403OooO00o();
        if (OooO00o2 != null) {
            int i2 = OooO00o2.getInt(f19457OooO0o0, 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            OooO00o2.putInt(f19457OooO0o0, i | i2);
        }
    }
}
