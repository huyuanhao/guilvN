package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.C0033R;
import com.p118pd.sdk.AbstractC5951OooOo00;
import com.p118pd.sdk.AbstractC7179o00o0oOo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class ActionBar {
    @Deprecated
    public static final int OooO00o = 0;
    @Deprecated
    public static final int OooO0O0 = 1;
    @Deprecated
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 1;
    public static final int OooO0o = 4;
    public static final int OooO0o0 = 2;
    public static final int OooO0oO = 8;
    public static final int OooO0oo = 16;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface DisplayOptions {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface NavigationMode {
    }

    public interface OooO0O0 {
        void OooO00o(boolean z);
    }

    @Deprecated
    public interface OooO0OO {
        boolean OooO00o(int i, long j);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.ActionBar$OooO0Oo  reason: case insensitive filesystem */
    public static abstract class AbstractC4991OooO0Oo {
        public static final int OooO00o = -1;

        public abstract int OooO00o();

        /* renamed from: OooO00o  reason: collision with other method in class */
        public abstract Drawable m14339OooO00o();

        /* renamed from: OooO00o  reason: collision with other method in class */
        public abstract View m14340OooO00o();

        public abstract AbstractC4991OooO0Oo OooO00o(@StringRes int i);

        public abstract AbstractC4991OooO0Oo OooO00o(Drawable drawable);

        public abstract AbstractC4991OooO0Oo OooO00o(View view);

        public abstract AbstractC4991OooO0Oo OooO00o(AbstractC4992OooO0o0 oooO0o0);

        public abstract AbstractC4991OooO0Oo OooO00o(CharSequence charSequence);

        public abstract AbstractC4991OooO0Oo OooO00o(Object obj);

        /* renamed from: OooO00o  reason: collision with other method in class */
        public abstract CharSequence m14341OooO00o();

        /* renamed from: OooO00o  reason: collision with other method in class */
        public abstract Object m14342OooO00o();

        /* renamed from: OooO00o  reason: collision with other method in class */
        public abstract void m14343OooO00o();

        public abstract AbstractC4991OooO0Oo OooO0O0(int i);

        public abstract AbstractC4991OooO0Oo OooO0O0(CharSequence charSequence);

        public abstract CharSequence OooO0O0();

        public abstract AbstractC4991OooO0Oo OooO0OO(@DrawableRes int i);

        public abstract AbstractC4991OooO0Oo OooO0Oo(int i);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.ActionBar$OooO0o0  reason: case insensitive filesystem */
    public interface AbstractC4992OooO0o0 {
        void OooO00o(AbstractC4991OooO0Oo oooO0Oo, AbstractC7179o00o0oOo o00o0ooo);

        void OooO0O0(AbstractC4991OooO0Oo oooO0Oo, AbstractC7179o00o0oOo o00o0ooo);

        void OooO0OO(AbstractC4991OooO0Oo oooO0Oo, AbstractC7179o00o0oOo o00o0ooo);
    }

    public abstract void OooO(@DrawableRes int i);

    public void OooO(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        }
    }

    public float OooO00o() {
        return 0.0f;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract int m14321OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Context m14322OooO00o() {
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract View m14323OooO00o();

    @Nullable
    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract AbstractC4991OooO0Oo m14324OooO00o();

    @Deprecated
    public abstract AbstractC4991OooO0Oo OooO00o(int i);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public AbstractC5951OooOo00 OooO00o(AbstractC5951OooOo00.OooO00o oooO00o) {
        return null;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract CharSequence m14325OooO00o();

    public void OooO00o(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public abstract void OooO00o(int i, int i2);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO00o(Configuration configuration) {
    }

    public abstract void OooO00o(@Nullable Drawable drawable);

    public abstract void OooO00o(View view);

    public abstract void OooO00o(View view, OooO00o oooO00o);

    @Deprecated
    public abstract void OooO00o(SpinnerAdapter spinnerAdapter, OooO0OO oooO0OO);

    public abstract void OooO00o(OooO0O0 oooO0O0);

    @Deprecated
    public abstract void OooO00o(AbstractC4991OooO0Oo oooO0Oo);

    @Deprecated
    public abstract void OooO00o(AbstractC4991OooO0Oo oooO0Oo, int i);

    @Deprecated
    public abstract void OooO00o(AbstractC4991OooO0Oo oooO0Oo, int i, boolean z);

    @Deprecated
    public abstract void OooO00o(AbstractC4991OooO0Oo oooO0Oo, boolean z);

    public void OooO00o(@Nullable CharSequence charSequence) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m14326OooO00o() {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean OooO00o(int i, KeyEvent keyEvent) {
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean OooO00o(KeyEvent keyEvent) {
        return false;
    }

    public abstract int OooO0O0();

    @Deprecated
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public abstract AbstractC4991OooO0Oo m14327OooO0O0();

    @Nullable
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public abstract CharSequence m14328OooO0O0();

    @Deprecated
    public abstract void OooO0O0(int i);

    public void OooO0O0(@Nullable Drawable drawable) {
    }

    public abstract void OooO0O0(OooO0O0 oooO0O0);

    @Deprecated
    public abstract void OooO0O0(AbstractC4991OooO0Oo oooO0Oo);

    public abstract void OooO0O0(CharSequence charSequence);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO0O0(boolean z) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m14329OooO0O0() {
        return false;
    }

    public int OooO0OO() {
        return 0;
    }

    public abstract void OooO0OO(int i);

    public abstract void OooO0OO(Drawable drawable);

    @Deprecated
    public abstract void OooO0OO(AbstractC4991OooO0Oo oooO0Oo);

    public abstract void OooO0OO(CharSequence charSequence);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO0OO(boolean z) {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m14330OooO0OO() {
        return false;
    }

    @Deprecated
    public abstract int OooO0Oo();

    public abstract void OooO0Oo(int i);

    public abstract void OooO0Oo(Drawable drawable);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooO0Oo(CharSequence charSequence) {
    }

    public abstract void OooO0Oo(boolean z);

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m14331OooO0Oo() {
        return false;
    }

    @Deprecated
    public abstract int OooO0o();

    /* renamed from: OooO0o  reason: collision with other method in class */
    public void m14332OooO0o() {
    }

    public void OooO0o(@StringRes int i) {
    }

    public void OooO0o(Drawable drawable) {
    }

    public abstract void OooO0o(boolean z);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO0o  reason: collision with other method in class */
    public boolean m14333OooO0o() {
        return false;
    }

    @Deprecated
    public abstract int OooO0o0();

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public abstract void m14334OooO0o0();

    public void OooO0o0(int i) {
        if (i != 0) {
            throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
        }
    }

    public void OooO0o0(Drawable drawable) {
    }

    public abstract void OooO0o0(boolean z);

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public abstract boolean m14335OooO0o0();

    @Deprecated
    public abstract int OooO0oO();

    @Deprecated
    /* renamed from: OooO0oO  reason: collision with other method in class */
    public abstract void m14336OooO0oO();

    public void OooO0oO(@DrawableRes int i) {
    }

    public abstract void OooO0oO(boolean z);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO0oO  reason: collision with other method in class */
    public boolean m14337OooO0oO() {
        return false;
    }

    public abstract void OooO0oo();

    public abstract void OooO0oo(@DrawableRes int i);

    public abstract void OooO0oo(boolean z);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: OooO0oo  reason: collision with other method in class */
    public boolean m14338OooO0oo() {
        return false;
    }

    @Deprecated
    public abstract void OooOO0(int i);

    public void OooOO0(boolean z) {
    }

    @Deprecated
    public abstract void OooOO0O(int i);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void OooOO0O(boolean z) {
    }

    public abstract void OooOO0o(int i);

    public abstract void OooOOO0(@StringRes int i);

    public static class OooO00o extends ViewGroup.MarginLayoutParams {
        public int OooO00o;

        public OooO00o(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.OooO00o = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0033R.styleable.OooO0O0);
            this.OooO00o = obtainStyledAttributes.getInt(C0033R.styleable.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public OooO00o(int i, int i2) {
            super(i, i2);
            this.OooO00o = 0;
            this.OooO00o = 8388627;
        }

        public OooO00o(int i, int i2, int i3) {
            super(i, i2);
            this.OooO00o = 0;
            this.OooO00o = i3;
        }

        public OooO00o(int i) {
            this(-2, -1, i);
        }

        public OooO00o(OooO00o oooO00o) {
            super((ViewGroup.MarginLayoutParams) oooO00o);
            this.OooO00o = 0;
            this.OooO00o = oooO00o.OooO00o;
        }

        public OooO00o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.OooO00o = 0;
        }
    }
}
