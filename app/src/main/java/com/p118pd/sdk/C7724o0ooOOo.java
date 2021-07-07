package com.p118pd.sdk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.AbstractC0032Px;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.widget.TextViewCompat;
import com.p118pd.sdk.C7072o00O0oOO;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.pd.sdk.o0ooOOo  reason: case insensitive filesystem */
public class C7724o0ooOOo extends TextView implements AbstractC7109o00Oo0O, AbstractC7137o00OooO0 {
    public final C5988Ooooo00 mBackgroundTintHelper;
    @Nullable
    public Future<C7072o00O0oOO> mPrecomputedTextFuture;
    public final C7718o0ooOO0 mTextHelper;

    public C7724o0ooOOo(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<C7072o00O0oOO> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                TextViewCompat.OooO00o(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5988Ooooo00 ooooo00 = this.mBackgroundTintHelper;
        if (ooooo00 != null) {
            ooooo00.m16826OooO00o();
        }
        C7718o0ooOO0 o0oooo0 = this.mTextHelper;
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
        C7718o0ooOO0 o0oooo0 = this.mTextHelper;
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
        C7718o0ooOO0 o0oooo0 = this.mTextHelper;
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
        C7718o0ooOO0 o0oooo0 = this.mTextHelper;
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
        C7718o0ooOO0 o0oooo0 = this.mTextHelper;
        return o0oooo0 != null ? o0oooo0.m19363OooO00o() : new int[0];
    }

    @Override // com.p118pd.sdk.AbstractC7137o00OooO0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getAutoSizeTextType() {
        if (!AbstractC7137o00OooO0.OooO00o) {
            C7718o0ooOO0 o0oooo0 = this.mTextHelper;
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

    public int getFirstBaselineToTopHeight() {
        return TextViewCompat.OooO0o0(this);
    }

    public int getLastBaselineToBottomHeight() {
        return TextViewCompat.OooO0o(this);
    }

    @Override // com.p118pd.sdk.AbstractC7109o00Oo0O
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        C5988Ooooo00 ooooo00 = this.mBackgroundTintHelper;
        if (ooooo00 != null) {
            return ooooo00.m16824OooO00o();
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7109o00Oo0O
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C5988Ooooo00 ooooo00 = this.mBackgroundTintHelper;
        if (ooooo00 != null) {
            return ooooo00.m16825OooO00o();
        }
        return null;
    }

    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @NonNull
    public C7072o00O0oOO.OooO00o getTextMetricsParamsCompat() {
        return TextViewCompat.m14635OooO00o((TextView) this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C5997OoooooO.OooO00o(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C7718o0ooOO0 o0oooo0 = this.mTextHelper;
        if (o0oooo0 != null) {
            o0oooo0.OooO00o(z, i, i2, i3, i4);
        }
    }

    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C7718o0ooOO0 o0oooo0 = this.mTextHelper;
        if (o0oooo0 != null && !AbstractC7137o00OooO0.OooO00o && o0oooo0.m19362OooO00o()) {
            this.mTextHelper.m19364OooO0O0();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7137o00OooO0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (AbstractC7137o00OooO0.OooO00o) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C7718o0ooOO0 o0oooo0 = this.mTextHelper;
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
        C7718o0ooOO0 o0oooo0 = this.mTextHelper;
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
        C7718o0ooOO0 o0oooo0 = this.mTextHelper;
        if (o0oooo0 != null) {
            o0oooo0.OooO00o(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C5988Ooooo00 ooooo00 = this.mBackgroundTintHelper;
        if (ooooo00 != null) {
            ooooo00.m16827OooO00o(drawable);
        }
    }

    public void setBackgroundResource(@DrawableRes int i) {
        super.setBackgroundResource(i);
        C5988Ooooo00 ooooo00 = this.mBackgroundTintHelper;
        if (ooooo00 != null) {
            ooooo00.OooO00o(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.OooO00o((TextView) this, callback));
    }

    public void setFirstBaselineToTopHeight(@IntRange(from = 0) @AbstractC0032Px int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            TextViewCompat.OooO0O0(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(@IntRange(from = 0) @AbstractC0032Px int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            TextViewCompat.OooO0OO(this, i);
        }
    }

    public void setLineHeight(@IntRange(from = 0) @AbstractC0032Px int i) {
        TextViewCompat.OooO0Oo(this, i);
    }

    public void setPrecomputedText(@NonNull C7072o00O0oOO o00o0ooo) {
        TextViewCompat.OooO00o(this, o00o0ooo);
    }

    @Override // com.p118pd.sdk.AbstractC7109o00Oo0O
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        C5988Ooooo00 ooooo00 = this.mBackgroundTintHelper;
        if (ooooo00 != null) {
            ooooo00.OooO0O0(colorStateList);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7109o00Oo0O
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        C5988Ooooo00 ooooo00 = this.mBackgroundTintHelper;
        if (ooooo00 != null) {
            ooooo00.OooO00o(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C7718o0ooOO0 o0oooo0 = this.mTextHelper;
        if (o0oooo0 != null) {
            o0oooo0.OooO00o(context, i);
        }
    }

    public void setTextFuture(@NonNull Future<C7072o00O0oOO> future) {
        this.mPrecomputedTextFuture = future;
        requestLayout();
    }

    public void setTextMetricsParamsCompat(@NonNull C7072o00O0oOO.OooO00o oooO00o) {
        TextViewCompat.OooO00o(this, oooO00o);
    }

    public void setTextSize(int i, float f) {
        if (AbstractC7137o00OooO0.OooO00o) {
            super.setTextSize(i, f);
            return;
        }
        C7718o0ooOO0 o0oooo0 = this.mTextHelper;
        if (o0oooo0 != null) {
            o0oooo0.OooO00o(i, f);
        }
    }

    public C7724o0ooOOo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C7724o0ooOOo(Context context, AttributeSet attributeSet, int i) {
        super(o0000.OooO00o(context), attributeSet, i);
        C5988Ooooo00 ooooo00 = new C5988Ooooo00(this);
        this.mBackgroundTintHelper = ooooo00;
        ooooo00.OooO00o(attributeSet, i);
        C7718o0ooOO0 o0oooo0 = new C7718o0ooOO0(this);
        this.mTextHelper = o0oooo0;
        o0oooo0.OooO00o(attributeSet, i);
        this.mTextHelper.m19361OooO00o();
    }
}
