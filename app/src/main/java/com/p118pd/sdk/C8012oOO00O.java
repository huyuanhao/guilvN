package com.p118pd.sdk;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.p118pd.sdk.C7045o00O00O;
import java.lang.reflect.Method;

@RequiresApi(21)
/* renamed from: com.pd.sdk.oOO00O  reason: case insensitive filesystem */
public class C8012oOO00O extends C7045o00O00O {
    public static Method OooO00o = null;
    public static final String o0ooOOo = "WrappedDrawableApi21";

    /* renamed from: com.pd.sdk.oOO00O$OooO00o */
    public static class OooO00o extends C7045o00O00O.OooO00o {
        public OooO00o(@Nullable C7045o00O00O.OooO00o oooO00o, @Nullable Resources resources) {
            super(oooO00o, resources);
        }

        @Override // com.p118pd.sdk.C7045o00O00O.OooO00o
        @NonNull
        public Drawable newDrawable(@Nullable Resources resources) {
            return new C8012oOO00O(this, resources);
        }
    }

    public C8012oOO00O(Drawable drawable) {
        super(drawable);
        OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7041o00O00, com.p118pd.sdk.C7045o00O00O, com.p118pd.sdk.C7045o00O00O, com.p118pd.sdk.C7045o00O00O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19712OooO00o() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = ((C7045o00O00O) this).f19311OooO00o;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    @NonNull
    public Rect getDirtyBounds() {
        return ((C7045o00O00O) this).f19311OooO00o.getDirtyBounds();
    }

    public void getOutline(@NonNull Outline outline) {
        ((C7045o00O00O) this).f19311OooO00o.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = ((C7045o00O00O) this).f19311OooO00o;
        if (!(drawable == null || (method = OooO00o) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void setHotspot(float f, float f2) {
        ((C7045o00O00O) this).f19311OooO00o.setHotspot(f, f2);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        ((C7045o00O00O) this).f19311OooO00o.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // com.p118pd.sdk.C7045o00O00O
    public boolean setState(@NonNull int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // com.p118pd.sdk.C7045o00O00O, com.p118pd.sdk.AbstractC7044o00O000o
    public void setTint(int i) {
        if (m19712OooO00o()) {
            super.setTint(i);
        } else {
            ((C7045o00O00O) this).f19311OooO00o.setTint(i);
        }
    }

    @Override // com.p118pd.sdk.C7045o00O00O, com.p118pd.sdk.AbstractC7044o00O000o
    public void setTintList(ColorStateList colorStateList) {
        if (m19712OooO00o()) {
            super.setTintList(colorStateList);
        } else {
            ((C7045o00O00O) this).f19311OooO00o.setTintList(colorStateList);
        }
    }

    @Override // com.p118pd.sdk.C7045o00O00O, com.p118pd.sdk.AbstractC7044o00O000o
    public void setTintMode(PorterDuff.Mode mode) {
        if (m19712OooO00o()) {
            super.setTintMode(mode);
        } else {
            ((C7045o00O00O) this).f19311OooO00o.setTintMode(mode);
        }
    }

    public C8012oOO00O(C7045o00O00O.OooO00o oooO00o, Resources resources) {
        super(oooO00o, resources);
        OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC7041o00O00, com.p118pd.sdk.C7045o00O00O, com.p118pd.sdk.C7045o00O00O, com.p118pd.sdk.C7045o00O00O
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C7045o00O00O.OooO00o m19711OooO00o() {
        return new OooO00o(((C7045o00O00O) this).f19312OooO00o, null);
    }

    @Override // com.p118pd.sdk.AbstractC7041o00O00, com.p118pd.sdk.C7045o00O00O, com.p118pd.sdk.C7045o00O00O, com.p118pd.sdk.C7045o00O00O
    private void OooO00o() {
        if (OooO00o == null) {
            try {
                OooO00o = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }
}
