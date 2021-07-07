package com.p118pd.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;

/* renamed from: com.pd.sdk.oO0OO0oo  reason: case insensitive filesystem */
public class C7864oO0OO0oo<DataType> implements AbstractC7650o0oOoOoO<DataType, BitmapDrawable> {
    public final Resources OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7650o0oOoOoO<DataType, Bitmap> f20929OooO00o;

    public C7864oO0OO0oo(Context context, AbstractC7650o0oOoOoO<DataType, Bitmap> o0oooooo) {
        this(context.getResources(), o0oooooo);
    }

    @Override // com.p118pd.sdk.AbstractC7650o0oOoOoO
    public boolean OooO00o(@NonNull DataType datatype, @NonNull C7648o0oOoOo o0ooooo) throws IOException {
        return this.f20929OooO00o.OooO00o(datatype, o0ooooo);
    }

    @Deprecated
    public C7864oO0OO0oo(Resources resources, AbstractC7711o0ooO0OO o0ooo0oo, AbstractC7650o0oOoOoO<DataType, Bitmap> o0oooooo) {
        this(resources, o0oooooo);
    }

    @Override // com.p118pd.sdk.AbstractC7650o0oOoOoO
    public AbstractC7700o0oo0oo0<BitmapDrawable> OooO00o(@NonNull DataType datatype, int i, int i2, @NonNull C7648o0oOoOo o0ooooo) throws IOException {
        return C7787oO000oO.OooO00o(this.OooO00o, this.f20929OooO00o.OooO00o(datatype, i, i2, o0ooooo));
    }

    public C7864oO0OO0oo(@NonNull Resources resources, @NonNull AbstractC7650o0oOoOoO<DataType, Bitmap> o0oooooo) {
        this.OooO00o = (Resources) C7842oO0O0.OooO00o(resources);
        this.f20929OooO00o = (AbstractC7650o0oOoOoO) C7842oO0O0.OooO00o(o0oooooo);
    }
}
