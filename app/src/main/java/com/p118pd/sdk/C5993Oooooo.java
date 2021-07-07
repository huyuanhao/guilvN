package com.p118pd.sdk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0033R;
import androidx.core.widget.TextViewCompat;

/* renamed from: com.pd.sdk.Oooooo  reason: case insensitive filesystem */
public class C5993Oooooo extends EditText implements AbstractC7109o00Oo0O {
    public final C5988Ooooo00 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7718o0ooOO0 f17298OooO00o;

    public C5993Oooooo(Context context) {
        this(context, null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5988Ooooo00 ooooo00 = this.OooO00o;
        if (ooooo00 != null) {
            ooooo00.m16826OooO00o();
        }
        C7718o0ooOO0 o0oooo0 = this.f17298OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.m19361OooO00o();
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

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C5997OoooooO.OooO00o(super.onCreateInputConnection(editorInfo), editorInfo, this);
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
        C7718o0ooOO0 o0oooo0 = this.f17298OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.OooO00o(context, i);
        }
    }

    public C5993Oooooo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0033R.attr.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.EditText
    @Nullable
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public C5993Oooooo(Context context, AttributeSet attributeSet, int i) {
        super(o0000.OooO00o(context), attributeSet, i);
        C5988Ooooo00 ooooo00 = new C5988Ooooo00(this);
        this.OooO00o = ooooo00;
        ooooo00.OooO00o(attributeSet, i);
        C7718o0ooOO0 o0oooo0 = new C7718o0ooOO0(this);
        this.f17298OooO00o = o0oooo0;
        o0oooo0.OooO00o(attributeSet, i);
        this.f17298OooO00o.m19361OooO00o();
    }
}
