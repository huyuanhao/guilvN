package com.p118pd.sdk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;

/* renamed from: com.pd.sdk.OooooO0  reason: case insensitive filesystem */
public class C5990OooooO0 extends CheckBox implements AbstractC8562oo00oO {
    public final C5992OooooOo mCompoundButtonHelper;

    public C5990OooooO0(Context context) {
        this(context, null);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C5992OooooOo oooooOo = this.mCompoundButtonHelper;
        return oooooOo != null ? oooooOo.OooO00o(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // com.p118pd.sdk.AbstractC8562oo00oO
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportButtonTintList() {
        C5992OooooOo oooooOo = this.mCompoundButtonHelper;
        if (oooooOo != null) {
            return oooooOo.OooO00o();
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC8562oo00oO
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportButtonTintMode() {
        C5992OooooOo oooooOo = this.mCompoundButtonHelper;
        if (oooooOo != null) {
            return oooooOo.m16828OooO00o();
        }
        return null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C5992OooooOo oooooOo = this.mCompoundButtonHelper;
        if (oooooOo != null) {
            oooooOo.OooO0O0();
        }
    }

    @Override // com.p118pd.sdk.AbstractC8562oo00oO
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        C5992OooooOo oooooOo = this.mCompoundButtonHelper;
        if (oooooOo != null) {
            oooooOo.OooO00o(colorStateList);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8562oo00oO
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        C5992OooooOo oooooOo = this.mCompoundButtonHelper;
        if (oooooOo != null) {
            oooooOo.OooO00o(mode);
        }
    }

    public C5990OooooO0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0033R.attr.checkboxStyle);
    }

    public C5990OooooO0(Context context, AttributeSet attributeSet, int i) {
        super(o0000.OooO00o(context), attributeSet, i);
        C5992OooooOo oooooOo = new C5992OooooOo(this);
        this.mCompoundButtonHelper = oooooOo;
        oooooOo.OooO00o(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i) {
        setButtonDrawable(C5945OooOOO0.m16716OooO00o(getContext(), i));
    }
}
