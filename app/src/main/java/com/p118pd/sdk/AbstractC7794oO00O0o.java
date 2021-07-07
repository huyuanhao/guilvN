package com.p118pd.sdk;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.oO00O0o  reason: case insensitive filesystem */
public abstract class AbstractC7794oO00O0o<T extends Drawable> implements AbstractC7700o0oo0oo0<T>, AbstractC7695o0oo0o0o {
    public final T OooO00o;

    public AbstractC7794oO00O0o(T t) {
        this.OooO00o = (T) ((Drawable) C7842oO0O0.OooO00o(t));
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0
    @NonNull
    /* renamed from: OooO00o */
    public final T get() {
        Drawable.ConstantState constantState = this.OooO00o.getConstantState();
        return constantState == null ? this.OooO00o : (T) constantState.newDrawable();
    }

    @Override // com.p118pd.sdk.AbstractC7695o0oo0o0o
    public void initialize() {
        T t = this.OooO00o;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C7796oO00OO) {
            ((C7796oO00OO) t).m19486OooO00o().prepareToDraw();
        }
    }
}
