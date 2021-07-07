package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.widget.OverScroller;

@TargetApi(9)
/* renamed from: com.pd.sdk.丨LI丨Ii  reason: invalid class name and case insensitive filesystem */
public class C9483LIIi extends AbstractC6180iLiL1L {
    public final OverScroller OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23055OooO00o = false;

    public C9483LIIi(Context context) {
        this.OooO00o = new OverScroller(context);
    }

    @Override // com.p118pd.sdk.AbstractC6180iLiL1L, com.p118pd.sdk.AbstractC6180iLiL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21537OooO00o() {
        if (this.f23055OooO00o) {
            this.OooO00o.computeScrollOffset();
            this.f23055OooO00o = false;
        }
        return this.OooO00o.computeScrollOffset();
    }

    @Override // com.p118pd.sdk.AbstractC6180iLiL1L, com.p118pd.sdk.AbstractC6180iLiL1L
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m21538OooO0O0() {
        return this.OooO00o.isFinished();
    }

    @Override // com.p118pd.sdk.AbstractC6180iLiL1L, com.p118pd.sdk.AbstractC6180iLiL1L
    public int OooO0O0() {
        return this.OooO00o.getCurrY();
    }

    @Override // com.p118pd.sdk.AbstractC6180iLiL1L
    public void OooO00o(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.OooO00o.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
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
