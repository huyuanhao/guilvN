package com.p118pd.sdk;

import android.os.Build;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.NonNull;
import java.util.List;

/* renamed from: com.pd.sdk.o00OoOOo  reason: case insensitive filesystem */
public class C7126o00OoOOo {
    public final AccessibilityRecord OooO00o;

    @Deprecated
    public C7126o00OoOOo(Object obj) {
        this.OooO00o = (AccessibilityRecord) obj;
    }

    @Deprecated
    public int OooO() {
        return this.OooO00o.getScrollY();
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m18459OooO00o() {
        return this.OooO00o;
    }

    @Deprecated
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18464OooO0O0() {
        return this.OooO00o.isEnabled();
    }

    @Deprecated
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m18466OooO0OO() {
        return this.OooO00o.isFullScreen();
    }

    @Deprecated
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m18467OooO0Oo() {
        return this.OooO00o.isPassword();
    }

    @Deprecated
    public int OooO0o() {
        return OooO0O0(this.OooO00o);
    }

    @Deprecated
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m18468OooO0o0() {
        return this.OooO00o.isScrollable();
    }

    @Deprecated
    public int OooO0oO() {
        return this.OooO00o.getRemovedCount();
    }

    @Deprecated
    public int OooO0oo() {
        return this.OooO00o.getScrollX();
    }

    @Deprecated
    public int OooOO0() {
        return this.OooO00o.getToIndex();
    }

    @Deprecated
    public int OooOO0O() {
        return this.OooO00o.getWindowId();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7126o00OoOOo.class != obj.getClass()) {
            return false;
        }
        C7126o00OoOOo o00ooooo = (C7126o00OoOOo) obj;
        AccessibilityRecord accessibilityRecord = this.OooO00o;
        if (accessibilityRecord == null) {
            if (o00ooooo.OooO00o != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(o00ooooo.OooO00o)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.OooO00o;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public static C7126o00OoOOo OooO00o(C7126o00OoOOo o00ooooo) {
        return new C7126o00OoOOo(AccessibilityRecord.obtain(o00ooooo.OooO00o));
    }

    @Deprecated
    public void OooO(int i) {
        this.OooO00o.setScrollY(i);
    }

    @Deprecated
    public void OooO0O0(boolean z) {
        this.OooO00o.setEnabled(z);
    }

    @Deprecated
    public void OooO0OO(boolean z) {
        this.OooO00o.setFullScreen(z);
    }

    @Deprecated
    public void OooO0Oo(boolean z) {
        this.OooO00o.setPassword(z);
    }

    @Deprecated
    public void OooO0o(int i) {
        OooO0O0(this.OooO00o, i);
    }

    @Deprecated
    public void OooO0o0(boolean z) {
        this.OooO00o.setScrollable(z);
    }

    @Deprecated
    public void OooO0oO(int i) {
        this.OooO00o.setRemovedCount(i);
    }

    @Deprecated
    public void OooO0oo(int i) {
        this.OooO00o.setScrollX(i);
    }

    @Deprecated
    public void OooOO0(int i) {
        this.OooO00o.setToIndex(i);
    }

    @Deprecated
    public static C7126o00OoOOo OooO00o() {
        return new C7126o00OoOOo(AccessibilityRecord.obtain());
    }

    @Deprecated
    public int OooO0O0() {
        return this.OooO00o.getCurrentItemIndex();
    }

    @Deprecated
    public int OooO0OO() {
        return this.OooO00o.getFromIndex();
    }

    @Deprecated
    public int OooO0Oo() {
        return this.OooO00o.getItemCount();
    }

    @Deprecated
    public int OooO0o0() {
        return OooO00o(this.OooO00o);
    }

    @Deprecated
    public void OooO00o(View view) {
        this.OooO00o.setSource(view);
    }

    @Deprecated
    public void OooO0O0(int i) {
        this.OooO00o.setCurrentItemIndex(i);
    }

    @Deprecated
    public void OooO0OO(int i) {
        this.OooO00o.setFromIndex(i);
    }

    @Deprecated
    public void OooO0Oo(int i) {
        this.OooO00o.setItemCount(i);
    }

    @Deprecated
    public void OooO0o0(int i) {
        OooO00o(this.OooO00o, i);
    }

    public static int OooO0O0(AccessibilityRecord accessibilityRecord) {
        if (Build.VERSION.SDK_INT >= 15) {
            return accessibilityRecord.getMaxScrollY();
        }
        return 0;
    }

    @Deprecated
    public void OooO00o(View view, int i) {
        OooO00o(this.OooO00o, view, i);
    }

    @Deprecated
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public CharSequence m18465OooO0OO() {
        return this.OooO00o.getContentDescription();
    }

    public static void OooO00o(@NonNull AccessibilityRecord accessibilityRecord, View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, i);
        }
    }

    @Deprecated
    public void OooO0OO(CharSequence charSequence) {
        this.OooO00o.setContentDescription(charSequence);
    }

    public static void OooO0O0(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7120o00OoOO m18457OooO00o() {
        return C7120o00OoOO.OooO00o((Object) this.OooO00o.getSource());
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18462OooO00o() {
        return this.OooO00o.isChecked();
    }

    @Deprecated
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public CharSequence m18463OooO0O0() {
        return this.OooO00o.getClassName();
    }

    @Deprecated
    public void OooO00o(boolean z) {
        this.OooO00o.setChecked(z);
    }

    @Deprecated
    public void OooO0O0(CharSequence charSequence) {
        this.OooO00o.setClassName(charSequence);
    }

    public static int OooO00o(AccessibilityRecord accessibilityRecord) {
        if (Build.VERSION.SDK_INT >= 15) {
            return accessibilityRecord.getMaxScrollX();
        }
        return 0;
    }

    public static void OooO00o(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18455OooO00o() {
        return this.OooO00o.getAddedCount();
    }

    @Deprecated
    public void OooO00o(int i) {
        this.OooO00o.setAddedCount(i);
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<CharSequence> m18460OooO00o() {
        return this.OooO00o.getText();
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public CharSequence m18458OooO00o() {
        return this.OooO00o.getBeforeText();
    }

    @Deprecated
    public void OooO00o(CharSequence charSequence) {
        this.OooO00o.setBeforeText(charSequence);
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Parcelable m18456OooO00o() {
        return this.OooO00o.getParcelableData();
    }

    @Deprecated
    public void OooO00o(Parcelable parcelable) {
        this.OooO00o.setParcelableData(parcelable);
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18461OooO00o() {
        this.OooO00o.recycle();
    }
}
