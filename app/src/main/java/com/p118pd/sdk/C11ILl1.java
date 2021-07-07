package com.p118pd.sdk;

import android.content.Context;
import android.widget.Scroller;

/* renamed from: com.pd.sdk.丨1丨1ILl1  reason: invalid class name */
public class C11ILl1 extends AbstractC6180iLiL1L {
    public final Scroller OooO00o;

    public C11ILl1(Context context) {
        this.OooO00o = new Scroller(context);
    }

    @Override // com.p118pd.sdk.AbstractC6180iLiL1L, com.p118pd.sdk.AbstractC6180iLiL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21340OooO00o() {
        return this.OooO00o.computeScrollOffset();
    }

    @Override // com.p118pd.sdk.AbstractC6180iLiL1L, com.p118pd.sdk.AbstractC6180iLiL1L
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m21341OooO0O0() {
        return this.OooO00o.isFinished();
    }

    @Override // com.p118pd.sdk.AbstractC6180iLiL1L
    public void OooO00o(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.OooO00o.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Override // com.p118pd.sdk.AbstractC6180iLiL1L, com.p118pd.sdk.AbstractC6180iLiL1L
    public int OooO0O0() {
        return this.OooO00o.getCurrY();
    }

    @Override // com.p118pd.sdk.AbstractC6180iLiL1L
    public void OooO00o(boolean z) {
        this.OooO00o.forceFinished(z);
    }

    @Override // com.p118pd.sdk.AbstractC6180iLiL1L, com.p118pd.sdk.AbstractC6180iLiL1L
    public int OooO00o() {
        return this.OooO00o.getCurrX();
    }
}
