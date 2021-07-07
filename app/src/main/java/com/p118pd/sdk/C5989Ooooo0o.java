package com.p118pd.sdk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import androidx.core.widget.TextViewCompat;

/* renamed from: com.pd.sdk.Ooooo0o  reason: case insensitive filesystem */
public class C5989Ooooo0o extends Button implements AbstractC7109o00Oo0O, AbstractC7137o00OooO0 {
    public final C5988Ooooo00 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7718o0ooOO0 f17293OooO00o;

    public C5989Ooooo0o(Context context) {
        this(context, null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5988Ooooo00 ooooo00 = this.OooO00o;
        if (ooooo00 != null) {
            ooooo00.m16826OooO00o();
        }
        C7718o0ooOO0 o0oooo0 = this.f17293OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.m19361OooO00o();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7137o00OooO0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getAutoSizeMaxTextSize() {
        if (AbstractC7137o00OooO0.OooO00o) {
            return super.getAutoSizeMaxTextSize();
        }
        C7718o0ooOO0 o0oooo0 = this.f17293OooO00o;
        if (o0oooo0 != null) {
            return o0oooo0.OooO00o();
        }
        return -1;
    }

    @Override // com.p118pd.sdk.AbstractC7137o00OooO0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getAutoSizeMinTextSize() {
        if (AbstractC7137o00OooO0.OooO00o) {
            return super.getAutoSizeMinTextSize();
        }
        C7718o0ooOO0 o0oooo0 = this.f17293OooO00o;
        if (o0oooo0 != null) {
            return o0oooo0.OooO0O0();
        }
        return -1;
    }

    @Override // com.p118pd.sdk.AbstractC7137o00OooO0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getAutoSizeStepGranularity() {
        if (AbstractC7137o00OooO0.OooO00o) {
            return super.getAutoSizeStepGranularity();
        }
        C7718o0ooOO0 o0oooo0 = this.f17293OooO00o;
        if (o0oooo0 != null) {
            return o0oooo0.OooO0OO();
        }
        return -1;
    }

    @Override // com.p118pd.sdk.AbstractC7137o00OooO0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int[] getAutoSizeTextAvailableSizes() {
        if (AbstractC7137o00OooO0.OooO00o) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C7718o0ooOO0 o0oooo0 = this.f17293OooO00o;
        return o0oooo0 != null ? o0oooo0.m19363OooO00o() : new int[0];
    }

    @Override // com.p118pd.sdk.AbstractC7137o00OooO0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getAutoSizeTextType() {
        if (!AbstractC7137o00OooO0.OooO00o) {
            C7718o0ooOO0 o0oooo0 = this.f17293OooO00o;
            if (o0oooo0 != null) {
                return o0oooo0.OooO0Oo();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7109o00Oo0O
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        C5988Ooooo00 ooooo00 = this.OooO00o;
        if (ooooo00 != null) {
            return ooooo00.m16824OooO00o();
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7109o00Oo0O
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5988Ooooo00 ooooo00 = this.OooO00o;
        if (ooooo00 != null) {
            return ooooo00.m16825OooO00o();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C7718o0ooOO0 o0oooo0 = this.f17293OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.OooO00o(z, i, i2, i3, i4);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C7718o0ooOO0 o0oooo0 = this.f17293OooO00o;
        if (o0oooo0 != null && !AbstractC7137o00OooO0.OooO00o && o0oooo0.m19362OooO00o()) {
            this.f17293OooO00o.m19364OooO0O0();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7137o00OooO0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (AbstractC7137o00OooO0.OooO00o) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C7718o0ooOO0 o0oooo0 = this.f17293OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.OooO00o(i, i2, i3, i4);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7137o00OooO0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i) throws IllegalArgumentException {
        if (AbstractC7137o00OooO0.OooO00o) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C7718o0ooOO0 o0oooo0 = this.f17293OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.OooO00o(iArr, i);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7137o00OooO0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AbstractC7137o00OooO0.OooO00o) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C7718o0ooOO0 o0oooo0 = this.f17293OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.OooO00o(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5988Ooooo00 ooooo00 = this.OooO00o;
        if (ooooo00 != null) {
            ooooo00.m16827OooO00o(drawable);
        }
    }

    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        C5988Ooooo00 ooooo00 = this.OooO00o;
        if (ooooo00 != null) {
            ooooo00.OooO00o(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.OooO00o((TextView) this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C7718o0ooOO0 o0oooo0 = this.f17293OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.OooO00o(z);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7109o00Oo0O
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C5988Ooooo00 ooooo00 = this.OooO00o;
        if (ooooo00 != null) {
            ooooo00.OooO0O0(colorStateList);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7109o00Oo0O
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C5988Ooooo00 ooooo00 = this.OooO00o;
        if (ooooo00 != null) {
            ooooo00.OooO00o(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C7718o0ooOO0 o0oooo0 = this.f17293OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.OooO00o(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (AbstractC7137o00OooO0.OooO00o) {
            super.setTextSize(i, f);
            return;
        }
        C7718o0ooOO0 o0oooo0 = this.f17293OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.OooO00o(i, f);
        }
    }

    public C5989Ooooo0o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0033R.attr.buttonStyle);
    }

    public C5989Ooooo0o(Context context, AttributeSet attributeSet, int i) {
        super(o0000.OooO00o(context), attributeSet, i);
        C5988Ooooo00 ooooo00 = new C5988Ooooo00(this);
        this.OooO00o = ooooo00;
        ooooo00.OooO00o(attributeSet, i);
        C7718o0ooOO0 o0oooo0 = new C7718o0ooOO0(this);
        this.f17293OooO00o = o0oooo0;
        o0oooo0.OooO00o(attributeSet, i);
        this.f17293OooO00o.m19361OooO00o();
    }
}
