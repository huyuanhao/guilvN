package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* renamed from: com.pd.sdk.oOo00Oo0  reason: case insensitive filesystem */
public class C8293oOo00Oo0 implements AbstractC7655o0oOoo0O<C7796oO00OO> {
    public final AbstractC7655o0oOoo0O<Bitmap> OooO00o;

    public C8293oOo00Oo0(AbstractC7655o0oOoo0O<Bitmap> o0oooo0o) {
        this.OooO00o = (AbstractC7655o0oOoo0O) C7842oO0O0.OooO00o(o0oooo0o);
    }

    @Override // com.p118pd.sdk.AbstractC7655o0oOoo0O
    @NonNull
    public AbstractC7700o0oo0oo0<C7796oO00OO> OooO00o(@NonNull Context context, @NonNull AbstractC7700o0oo0oo0<C7796oO00OO> o0oo0oo0, int i, int i2) {
        C7796oO00OO oo00oo = o0oo0oo0.get();
        AbstractC7700o0oo0oo0<Bitmap> oo0ooo0o = new C7875oO0OOo0o(oo00oo.m19486OooO00o(), ComponentCallbacks2C7604o0o0Oo0o.OooO00o(context).m19238OooO00o());
        AbstractC7700o0oo0oo0<Bitmap> OooO00o2 = this.OooO00o.OooO00o(context, oo0ooo0o, i, i2);
        if (!oo0ooo0o.equals(OooO00o2)) {
            oo0ooo0o.recycle();
        }
        oo00oo.OooO00o(this.OooO00o, OooO00o2.get());
        return o0oo0oo0;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public boolean equals(Object obj) {
        if (obj instanceof C8293oOo00Oo0) {
            return this.OooO00o.equals(((C8293oOo00Oo0) obj).OooO00o);
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public int hashCode() {
        return this.OooO00o.hashCode();
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public void OooO00o(@NonNull MessageDigest messageDigest) {
        this.OooO00o.OooO00o(messageDigest);
    }
}
