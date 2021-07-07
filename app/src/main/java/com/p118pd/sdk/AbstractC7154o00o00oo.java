package com.p118pd.sdk;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.p118pd.sdk.C7143o00o0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.o00o00oo  reason: case insensitive filesystem */
public abstract class AbstractC7154o00o00oo extends C7087o00OO0o {
    public static final C7143o00o0.OooO00o<C7120o00OoOO> OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C7143o00o0.OooO0O0<C7010o000Ooo<C7120o00OoOO>, C7120o00OoOO> f19526OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19527OooO00o = "android.view.View";
    public static final int OooO0Oo = Integer.MIN_VALUE;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final Rect f19528OooO0Oo = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final int OooO0o0 = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f19529OooO00o = Integer.MIN_VALUE;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Rect f19530OooO00o = new Rect();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final View f19531OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AccessibilityManager f19532OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0OO f19533OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int[] f19534OooO00o = new int[2];
    public int OooO0O0 = Integer.MIN_VALUE;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final Rect f19535OooO0O0 = new Rect();
    public int OooO0OO = Integer.MIN_VALUE;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public final Rect f19536OooO0OO = new Rect();

    /* renamed from: com.pd.sdk.o00o00oo$OooO00o */
    public static class OooO00o implements C7143o00o0.OooO00o<C7120o00OoOO> {
        public void OooO00o(C7120o00OoOO o00oooo, Rect rect) {
            o00oooo.OooO00o(rect);
        }
    }

    public AbstractC7154o00o00oo(@NonNull View view) {
        if (view != null) {
            this.f19531OooO00o = view;
            this.f19532OooO00o = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (ViewCompat.m14581OooO0O0(view) == 0) {
                ViewCompat.OooO0o(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public static int OooO00o(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean OooO0Oo(int i) {
        int i2;
        if (!this.f19532OooO00o.isEnabled() || !this.f19532OooO00o.isTouchExplorationEnabled() || (i2 = this.f19529OooO00o) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            OooO0OO(i2);
        }
        this.f19529OooO00o = i;
        this.f19531OooO00o.invalidate();
        m18541OooO00o(i, 32768);
        return true;
    }

    public abstract int OooO00o(float f, float f2);

    public void OooO00o(int i, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    public abstract void OooO00o(int i, @NonNull C7120o00OoOO o00oooo);

    public void OooO00o(int i, boolean z) {
    }

    public void OooO00o(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void OooO00o(@NonNull C7120o00OoOO o00oooo) {
    }

    public abstract void OooO00o(List<Integer> list);

    public abstract boolean OooO00o(int i, int i2, @Nullable Bundle bundle);

    public final boolean OooO00o(@NonNull MotionEvent motionEvent) {
        if (!this.f19532OooO00o.isEnabled() || !this.f19532OooO00o.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int OooO00o2 = OooO00o(motionEvent.getX(), motionEvent.getY());
            m18534OooO0O0(OooO00o2);
            if (OooO00o2 != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || this.OooO0OO == Integer.MIN_VALUE) {
            return false;
        } else {
            m18534OooO0O0(Integer.MIN_VALUE);
            return true;
        }
    }

    @Deprecated
    public int OooO0O0() {
        return m18535OooO00o();
    }

    public final int OooO0OO() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.C7087o00OO0o
    public C7125o00OoOOO getAccessibilityNodeProvider(View view) {
        if (this.f19533OooO00o == null) {
            this.f19533OooO00o = new OooO0OO();
        }
        return this.f19533OooO00o;
    }

    @Override // com.p118pd.sdk.C7087o00OO0o
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        OooO00o(accessibilityEvent);
    }

    @Override // com.p118pd.sdk.C7087o00OO0o
    public void onInitializeAccessibilityNodeInfo(View view, C7120o00OoOO o00oooo) {
        super.onInitializeAccessibilityNodeInfo(view, o00oooo);
        OooO00o(o00oooo);
    }

    /* renamed from: com.pd.sdk.o00o00oo$OooO0O0 */
    public static class OooO0O0 implements C7143o00o0.OooO0O0<C7010o000Ooo<C7120o00OoOO>, C7120o00OoOO> {
        public C7120o00OoOO OooO00o(C7010o000Ooo<C7120o00OoOO> o000ooo, int i) {
            return o000ooo.m18269OooO0O0(i);
        }

        public int OooO00o(C7010o000Ooo<C7120o00OoOO> o000ooo) {
            return o000ooo.OooO00o();
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    private void m18534OooO0O0(int i) {
        int i2 = this.OooO0OO;
        if (i2 != i) {
            this.OooO0OO = i;
            m18541OooO00o(i, 128);
            m18541OooO00o(i2, 256);
        }
    }

    private boolean OooO0OO(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return m18542OooO0O0(i);
        }
        if (i2 == 2) {
            return m18540OooO00o(i);
        }
        if (i2 == 64) {
            return OooO0Oo(i);
        }
        if (i2 != 128) {
            return OooO00o(i, i2, bundle);
        }
        return OooO0OO(i);
    }

    /* renamed from: com.pd.sdk.o00o00oo$OooO0OO */
    public class OooO0OO extends C7125o00OoOOO {
        public OooO0OO() {
        }

        @Override // com.p118pd.sdk.C7125o00OoOOO
        public C7120o00OoOO OooO00o(int i) {
            return C7120o00OoOO.OooO00o(AbstractC7154o00o00oo.this.m18536OooO00o(i));
        }

        @Override // com.p118pd.sdk.C7125o00OoOOO
        public C7120o00OoOO OooO0O0(int i) {
            int i2 = i == 2 ? AbstractC7154o00o00oo.this.f19529OooO00o : AbstractC7154o00o00oo.this.OooO0O0;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return OooO00o(i2);
        }

        @Override // com.p118pd.sdk.C7125o00OoOOO
        public boolean OooO00o(int i, int i2, Bundle bundle) {
            return AbstractC7154o00o00oo.this.OooO0O0(i, i2, bundle);
        }
    }

    private AccessibilityEvent OooO0O0(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C7120o00OoOO OooO00o2 = m18536OooO00o(i);
        obtain.getText().add(OooO00o2.m18446OooO0oo());
        obtain.setContentDescription(OooO00o2.m18428OooO0O0());
        obtain.setScrollable(OooO00o2.OooOOoo());
        obtain.setPassword(OooO00o2.OooOOo0());
        obtain.setEnabled(OooO00o2.m18448OooOO0());
        obtain.setChecked(OooO00o2.m18437OooO0Oo());
        OooO00o(i, obtain);
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(OooO00o2.m18411OooO00o());
            C7126o00OoOOo.OooO00o(obtain, this.f19531OooO00o, i);
            obtain.setPackageName(this.f19531OooO00o.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    private boolean OooO0OO(int i) {
        if (this.f19529OooO00o != i) {
            return false;
        }
        this.f19529OooO00o = Integer.MIN_VALUE;
        this.f19531OooO00o.invalidate();
        m18541OooO00o(i, 65536);
        return true;
    }

    public final boolean OooO00o(@NonNull KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int OooO00o2 = OooO00o(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m18533OooO00o(OooO00o2, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m18532OooO00o();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m18533OooO00o(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m18533OooO00o(1, (Rect) null);
            }
            return false;
        }
    }

    @NonNull
    private C7120o00OoOO OooO0O0(int i) {
        C7120o00OoOO OooO0o = C7120o00OoOO.OooO0o();
        OooO0o.OooOO0(true);
        OooO0o.OooOO0O(true);
        OooO0o.OooO00o(f19527OooO00o);
        OooO0o.OooO0OO(f19528OooO0Oo);
        OooO0o.OooO0Oo(f19528OooO0Oo);
        OooO0o.OooO0Oo(this.f19531OooO00o);
        OooO00o(i, OooO0o);
        if (OooO0o.m18446OooO0oo() == null && OooO0o.m18428OooO0O0() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        OooO0o.OooO00o(this.f19535OooO0O0);
        if (!this.f19535OooO0O0.equals(f19528OooO0Oo)) {
            int OooO00o2 = OooO0o.OooO00o();
            if ((OooO00o2 & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((OooO00o2 & 128) == 0) {
                OooO0o.OooO0o0(this.f19531OooO00o.getContext().getPackageName());
                OooO0o.OooO0o0(this.f19531OooO00o, i);
                if (this.f19529OooO00o == i) {
                    OooO0o.OooO00o(true);
                    OooO0o.m18416OooO00o(128);
                } else {
                    OooO0o.OooO00o(false);
                    OooO0o.m18416OooO00o(64);
                }
                boolean z = this.OooO0O0 == i;
                if (z) {
                    OooO0o.m18416OooO00o(2);
                } else if (OooO0o.OooOO0O()) {
                    OooO0o.m18416OooO00o(1);
                }
                OooO0o.OooOO0o(z);
                this.f19531OooO00o.getLocationOnScreen(this.f19534OooO00o);
                OooO0o.OooO0O0(this.f19530OooO00o);
                if (this.f19530OooO00o.equals(f19528OooO0Oo)) {
                    OooO0o.OooO00o(this.f19530OooO00o);
                    if (OooO0o.f19467OooO00o != -1) {
                        C7120o00OoOO OooO0o2 = C7120o00OoOO.OooO0o();
                        for (int i2 = OooO0o.f19467OooO00o; i2 != -1; i2 = OooO0o2.f19467OooO00o) {
                            OooO0o2.OooO0Oo(this.f19531OooO00o, -1);
                            OooO0o2.OooO0OO(f19528OooO0Oo);
                            OooO00o(i2, OooO0o2);
                            OooO0o2.OooO00o(this.f19535OooO0O0);
                            Rect rect = this.f19530OooO00o;
                            Rect rect2 = this.f19535OooO0O0;
                            rect.offset(rect2.left, rect2.top);
                        }
                        OooO0o2.m18415OooO00o();
                    }
                    this.f19530OooO00o.offset(this.f19534OooO00o[0] - this.f19531OooO00o.getScrollX(), this.f19534OooO00o[1] - this.f19531OooO00o.getScrollY());
                }
                if (this.f19531OooO00o.getLocalVisibleRect(this.f19536OooO0OO)) {
                    this.f19536OooO0OO.offset(this.f19534OooO00o[0] - this.f19531OooO00o.getScrollX(), this.f19534OooO00o[1] - this.f19531OooO00o.getScrollY());
                    if (this.f19530OooO00o.intersect(this.f19536OooO0OO)) {
                        OooO0o.OooO0Oo(this.f19530OooO00o);
                        if (OooO00o(this.f19530OooO00o)) {
                            OooO0o.OooOo0O(true);
                        }
                    }
                }
                return OooO0o;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public final void OooO00o(boolean z, int i, @Nullable Rect rect) {
        int i2 = this.OooO0O0;
        if (i2 != Integer.MIN_VALUE) {
            m18540OooO00o(i2);
        }
        if (z) {
            m18533OooO00o(i, rect);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final int m18535OooO00o() {
        return this.f19529OooO00o;
    }

    private void OooO00o(int i, Rect rect) {
        m18536OooO00o(i).OooO00o(rect);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m18533OooO00o(int i, @Nullable Rect rect) {
        C7120o00OoOO o00oooo;
        C7120o00OoOO o00oooo2;
        C7010o000Ooo<C7120o00OoOO> OooO00o2 = OooO00o();
        int i2 = this.OooO0O0;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            o00oooo = null;
        } else {
            o00oooo = OooO00o2.m18264OooO00o(i2);
        }
        if (i == 1 || i == 2) {
            o00oooo2 = (C7120o00OoOO) C7143o00o0.OooO00o(OooO00o2, f19526OooO00o, OooO00o, o00oooo, i, ViewCompat.m14593OooO0o(this.f19531OooO00o) == 1, false);
        } else if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            int i4 = this.OooO0O0;
            if (i4 != Integer.MIN_VALUE) {
                OooO00o(i4, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                OooO00o(this.f19531OooO00o, i, rect2);
            }
            o00oooo2 = (C7120o00OoOO) C7143o00o0.OooO00o(OooO00o2, f19526OooO00o, OooO00o, o00oooo, rect2, i);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        if (o00oooo2 != null) {
            i3 = OooO00o2.OooO0O0(OooO00o2.OooO00o(o00oooo2));
        }
        return m18542OooO0O0(i3);
    }

    private C7010o000Ooo<C7120o00OoOO> OooO00o() {
        ArrayList arrayList = new ArrayList();
        OooO00o(arrayList);
        C7010o000Ooo<C7120o00OoOO> o000ooo = new C7010o000Ooo<>();
        for (int i = 0; i < arrayList.size(); i++) {
            o000ooo.OooO0O0(i, OooO0O0(i));
        }
        return o000ooo;
    }

    public static Rect OooO00o(@NonNull View view, int i, @NonNull Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m18532OooO00o() {
        int i = this.OooO0O0;
        return i != Integer.MIN_VALUE && OooO00o(i, 16, null);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final boolean m18541OooO00o(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f19532OooO00o.isEnabled() || (parent = this.f19531OooO00o.getParent()) == null) {
            return false;
        }
        return C7114o00Oo0oO.OooO00o(parent, this.f19531OooO00o, OooO00o(i, i2));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m18537OooO00o() {
        m18539OooO00o(-1, 1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m18538OooO00o(int i) {
        m18539OooO00o(i, 0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final void m18539OooO00o(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.f19532OooO00o.isEnabled() && (parent = this.f19531OooO00o.getParent()) != null) {
            AccessibilityEvent OooO00o2 = OooO00o(i, 2048);
            C7116o00OoO.OooO0O0(OooO00o2, i2);
            C7114o00Oo0oO.OooO00o(parent, this.f19531OooO00o, OooO00o2);
        }
    }

    private AccessibilityEvent OooO00o(int i, int i2) {
        if (i != -1) {
            return OooO0O0(i, i2);
        }
        return m18530OooO00o(i2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private AccessibilityEvent m18530OooO00o(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f19531OooO00o.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7120o00OoOO m18536OooO00o(int i) {
        if (i == -1) {
            return m18531OooO00o();
        }
        return OooO0O0(i);
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    private C7120o00OoOO m18531OooO00o() {
        C7120o00OoOO OooO00o2 = C7120o00OoOO.OooO00o(this.f19531OooO00o);
        ViewCompat.OooO00o(this.f19531OooO00o, OooO00o2);
        ArrayList arrayList = new ArrayList();
        OooO00o(arrayList);
        if (OooO00o2.OooO0O0() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                OooO00o2.m18418OooO00o(this.f19531OooO00o, ((Integer) arrayList.get(i)).intValue());
            }
            return OooO00o2;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public boolean OooO0O0(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return OooO0OO(i, i2, bundle);
        }
        return OooO00o(i2, bundle);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final boolean m18542OooO0O0(int i) {
        int i2;
        if ((!this.f19531OooO00o.isFocused() && !this.f19531OooO00o.requestFocus()) || (i2 = this.OooO0O0) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m18540OooO00o(i2);
        }
        this.OooO0O0 = i;
        OooO00o(i, true);
        m18541OooO00o(i, 8);
        return true;
    }

    private boolean OooO00o(int i, Bundle bundle) {
        return ViewCompat.OooO00o(this.f19531OooO00o, i, bundle);
    }

    private boolean OooO00o(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f19531OooO00o.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f19531OooO00o.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final boolean m18540OooO00o(int i) {
        if (this.OooO0O0 != i) {
            return false;
        }
        this.OooO0O0 = Integer.MIN_VALUE;
        OooO00o(i, false);
        m18541OooO00o(i, 8);
        return true;
    }
}
