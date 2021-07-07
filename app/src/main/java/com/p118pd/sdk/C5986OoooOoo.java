package com.p118pd.sdk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import androidx.core.widget.TextViewCompat;

/* renamed from: com.pd.sdk.OoooOoo  reason: case insensitive filesystem */
public class C5986OoooOoo extends AutoCompleteTextView implements AbstractC7109o00Oo0O {
    public static final int[] OooO00o = {16843126};

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5988Ooooo00 f17287OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7718o0ooOO0 f17288OooO00o;

    public C5986OoooOoo(Context context) {
        this(context, null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5988Ooooo00 ooooo00 = this.f17287OooO00o;
        if (ooooo00 != null) {
            ooooo00.m16826OooO00o();
        }
        C7718o0ooOO0 o0oooo0 = this.f17288OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.m19361OooO00o();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7109o00Oo0O
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        C5988Ooooo00 ooooo00 = this.f17287OooO00o;
        if (ooooo00 != null) {
            return ooooo00.m16824OooO00o();
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7109o00Oo0O
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5988Ooooo00 ooooo00 = this.f17287OooO00o;
        if (ooooo00 != null) {
            return ooooo00.m16825OooO00o();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C5997OoooooO.OooO00o(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5988Ooooo00 ooooo00 = this.f17287OooO00o;
        if (ooooo00 != null) {
            ooooo00.m16827OooO00o(drawable);
        }
    }

    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        C5988Ooooo00 ooooo00 = this.f17287OooO00o;
        if (ooooo00 != null) {
            ooooo00.OooO00o(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.OooO00o((TextView) this, callback));
    }

    public void setDropDownBackgroundResource(@DrawableRes int i) {
        setDropDownBackgroundDrawable(C5945OooOOO0.m16716OooO00o(getContext(), i));
    }

    @Override // com.p118pd.sdk.AbstractC7109o00Oo0O
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C5988Ooooo00 ooooo00 = this.f17287OooO00o;
        if (ooooo00 != null) {
            ooooo00.OooO0O0(colorStateList);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7109o00Oo0O
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C5988Ooooo00 ooooo00 = this.f17287OooO00o;
        if (ooooo00 != null) {
            ooooo00.OooO00o(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C7718o0ooOO0 o0oooo0 = this.f17288OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.OooO00o(context, i);
        }
    }

    public C5986OoooOoo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0033R.attr.autoCompleteTextViewStyle);
    }

    public C5986OoooOoo(Context context, AttributeSet attributeSet, int i) {
        super(o0000.OooO00o(context), attributeSet, i);
        C6970o0000oO OooO00o2 = C6970o0000oO.OooO00o(getContext(), attributeSet, OooO00o, i, 0);
        if (OooO00o2.m18168OooO00o(0)) {
            setDropDownBackgroundDrawable(OooO00o2.m18162OooO00o(0));
        }
        OooO00o2.m18167OooO00o();
        C5988Ooooo00 ooooo00 = new C5988Ooooo00(this);
        this.f17287OooO00o = ooooo00;
        ooooo00.OooO00o(attributeSet, i);
        C7718o0ooOO0 o0oooo0 = new C7718o0ooOO0(this);
        this.f17288OooO00o = o0oooo0;
        o0oooo0.OooO00o(attributeSet, i);
        this.f17288OooO00o.m19361OooO00o();
    }
}
