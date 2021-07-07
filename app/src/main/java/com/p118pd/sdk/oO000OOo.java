package com.p118pd.sdk;

import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.oO000OOo */
public class oO000OOo extends AbstractC7794oO00O0o<BitmapDrawable> implements AbstractC7695o0oo0o0o {
    public final AbstractC7711o0ooO0OO OooO00o;

    public oO000OOo(BitmapDrawable bitmapDrawable, AbstractC7711o0ooO0OO o0ooo0oo) {
        super(bitmapDrawable);
        this.OooO00o = o0ooo0oo;
    }

    /* Return type fixed from 'java.lang.Class<android.graphics.drawable.BitmapDrawable>' to match base method */
    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7794oO00O0o
    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BitmapDrawable m19434OooO00o() {
        return BitmapDrawable.class;
    }

    @Override // com.p118pd.sdk.AbstractC7695o0oo0o0o, com.p118pd.sdk.AbstractC7794oO00O0o
    public void initialize() {
        ((BitmapDrawable) super.OooO00o).getBitmap().prepareToDraw();
    }

    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0
    public void recycle() {
        this.OooO00o.OooO00o(((BitmapDrawable) super.OooO00o).getBitmap());
    }

    /* Return type fixed from 'int' to match base method */
    @Override // com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7700o0oo0oo0, com.p118pd.sdk.AbstractC7794oO00O0o
    public BitmapDrawable OooO00o() {
        return oO0O0O00.OooO00o(((BitmapDrawable) super.OooO00o).getBitmap());
    }
}
