package com.p118pd.sdk;

import androidx.annotation.NonNull;

@Deprecated
/* renamed from: com.pd.sdk.oO00oOOo  reason: case insensitive filesystem */
public abstract class AbstractC7831oO00oOOo<Z> extends AbstractC7826oO00oO00<Z> {
    public final int height;
    public final int width;

    public AbstractC7831oO00oOOo() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public final void getSize(@NonNull AbstractC8301oOo00oO0 ooo00oo0) {
        if (oO0O0O00.m19527OooO00o(this.width, this.height)) {
            ooo00oo0.OooO00o(this.width, this.height);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.width + " and height: " + this.height + ", either provide dimensions in the constructor or call override()");
    }

    @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
    public void removeCallback(@NonNull AbstractC8301oOo00oO0 ooo00oo0) {
    }

    public AbstractC7831oO00oOOo(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
