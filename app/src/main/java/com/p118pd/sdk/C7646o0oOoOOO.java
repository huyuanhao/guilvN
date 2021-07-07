package com.p118pd.sdk;

import android.content.Context;
import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.pd.sdk.o0oOoOOO  reason: case insensitive filesystem */
public class C7646o0oOoOOO<T> implements AbstractC7655o0oOoo0O<T> {
    public final Collection<? extends AbstractC7655o0oOoo0O<T>> OooO00o;

    @SafeVarargs
    public C7646o0oOoOOO(@NonNull AbstractC7655o0oOoo0O<T>... o0oooo0oArr) {
        if (o0oooo0oArr.length != 0) {
            this.OooO00o = Arrays.asList(o0oooo0oArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @Override // com.p118pd.sdk.AbstractC7655o0oOoo0O
    @NonNull
    public AbstractC7700o0oo0oo0<T> OooO00o(@NonNull Context context, @NonNull AbstractC7700o0oo0oo0<T> o0oo0oo0, int i, int i2) {
        Iterator<? extends AbstractC7655o0oOoo0O<T>> it = this.OooO00o.iterator();
        AbstractC7700o0oo0oo0<T> o0oo0oo02 = o0oo0oo0;
        while (it.hasNext()) {
            AbstractC7700o0oo0oo0<T> OooO00o2 = ((AbstractC7655o0oOoo0O) it.next()).OooO00o(context, o0oo0oo02, i, i2);
            if (o0oo0oo02 != null && !o0oo0oo02.equals(o0oo0oo0) && !o0oo0oo02.equals(OooO00o2)) {
                o0oo0oo02.recycle();
            }
            o0oo0oo02 = OooO00o2;
        }
        return o0oo0oo02;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public boolean equals(Object obj) {
        if (obj instanceof C7646o0oOoOOO) {
            return this.OooO00o.equals(((C7646o0oOoOOO) obj).OooO00o);
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public int hashCode() {
        return this.OooO00o.hashCode();
    }

    public C7646o0oOoOOO(@NonNull Collection<? extends AbstractC7655o0oOoo0O<T>> collection) {
        if (!collection.isEmpty()) {
            this.OooO00o = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @Override // com.p118pd.sdk.AbstractC7644o0oOoOO
    public void OooO00o(@NonNull MessageDigest messageDigest) {
        Iterator<? extends AbstractC7655o0oOoo0O<T>> it = this.OooO00o.iterator();
        while (it.hasNext()) {
            ((AbstractC7655o0oOoo0O) it.next()).OooO00o(messageDigest);
        }
    }
}
