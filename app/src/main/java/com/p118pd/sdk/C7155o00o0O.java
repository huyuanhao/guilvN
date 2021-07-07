package com.p118pd.sdk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;

/* renamed from: com.pd.sdk.o00o0O  reason: case insensitive filesystem */
public class C7155o00o0O extends RadioButton implements AbstractC8562oo00oO {
    public final C5992OooooOo OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7718o0ooOO0 f19537OooO00o;

    public C7155o00o0O(Context context) {
        this(context, null);
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C5992OooooOo oooooOo = this.OooO00o;
        return oooooOo != null ? oooooOo.OooO00o(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // com.p118pd.sdk.AbstractC8562oo00oO
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportButtonTintList() {
        C5992OooooOo oooooOo = this.OooO00o;
        if (oooooOo != null) {
            return oooooOo.OooO00o();
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC8562oo00oO
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportButtonTintMode() {
        C5992OooooOo oooooOo = this.OooO00o;
        if (oooooOo != null) {
            return oooooOo.m16828OooO00o();
        }
        return null;
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C5992OooooOo oooooOo = this.OooO00o;
        if (oooooOo != null) {
            oooooOo.OooO0O0();
        }
    }

    @Override // com.p118pd.sdk.AbstractC8562oo00oO
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        C5992OooooOo oooooOo = this.OooO00o;
        if (oooooOo != null) {
            oooooOo.OooO00o(colorStateList);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8562oo00oO
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        C5992OooooOo oooooOo = this.OooO00o;
        if (oooooOo != null) {
            oooooOo.OooO00o(mode);
        }
    }

    public C7155o00o0O(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0033R.attr.radioButtonStyle);
    }

    public C7155o00o0O(Context context, AttributeSet attributeSet, int i) {
        super(o0000.OooO00o(context), attributeSet, i);
        C5992OooooOo oooooOo = new C5992OooooOo(this);
        this.OooO00o = oooooOo;
        oooooOo.OooO00o(attributeSet, i);
        C7718o0ooOO0 o0oooo0 = new C7718o0ooOO0(this);
        this.f19537OooO00o = o0oooo0;
        o0oooo0.OooO00o(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i) {
        setButtonDrawable(C5945OooOOO0.m16716OooO00o(getContext(), i));
    }
}
