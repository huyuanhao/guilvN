package com.p118pd.sdk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* renamed from: com.pd.sdk.ooOO  reason: case insensitive filesystem */
public class C8888ooOO extends ImageView implements AbstractC7109o00Oo0O, AbstractC7144o00o00 {
    public final C5988Ooooo00 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C7499o0OoOo0 f22091OooO00o;

    public C8888ooOO(Context context) {
        this(context, null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C5988Ooooo00 ooooo00 = this.OooO00o;
        if (ooooo00 != null) {
            ooooo00.m16826OooO00o();
        }
        C7499o0OoOo0 o0oooo0 = this.f22091OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.m19123OooO00o();
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

    @Override // com.p118pd.sdk.AbstractC7144o00o00
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportImageTintList() {
        C7499o0OoOo0 o0oooo0 = this.f22091OooO00o;
        if (o0oooo0 != null) {
            return o0oooo0.OooO00o();
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC7144o00o00
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportImageTintMode() {
        C7499o0OoOo0 o0oooo0 = this.f22091OooO00o;
        if (o0oooo0 != null) {
            return o0oooo0.m19122OooO00o();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.f22091OooO00o.m19124OooO00o() && super.hasOverlappingRendering();
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

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C7499o0OoOo0 o0oooo0 = this.f22091OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.m19123OooO00o();
        }
    }

    public void setImageDrawable(@Nullable Drawable drawable) {
        super.setImageDrawable(drawable);
        C7499o0OoOo0 o0oooo0 = this.f22091OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.m19123OooO00o();
        }
    }

    public void setImageResource(@DrawableRes int i) {
        C7499o0OoOo0 o0oooo0 = this.f22091OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.OooO00o(i);
        }
    }

    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        C7499o0OoOo0 o0oooo0 = this.f22091OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.m19123OooO00o();
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

    @Override // com.p118pd.sdk.AbstractC7144o00o00
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        C7499o0OoOo0 o0oooo0 = this.f22091OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.OooO0O0(colorStateList);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7144o00o00
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        C7499o0OoOo0 o0oooo0 = this.f22091OooO00o;
        if (o0oooo0 != null) {
            o0oooo0.OooO00o(mode);
        }
    }

    public C8888ooOO(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C8888ooOO(Context context, AttributeSet attributeSet, int i) {
        super(o0000.OooO00o(context), attributeSet, i);
        C5988Ooooo00 ooooo00 = new C5988Ooooo00(this);
        this.OooO00o = ooooo00;
        ooooo00.OooO00o(attributeSet, i);
        C7499o0OoOo0 o0oooo0 = new C7499o0OoOo0(this);
        this.f22091OooO00o = o0oooo0;
        o0oooo0.OooO00o(attributeSet, i);
    }
}
