package com.p118pd.sdk;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.p118pd.sdk.C8348oOoOOo0;

@SuppressLint({"NewApi"})
/* renamed from: com.pd.sdk.oOo0000  reason: case insensitive filesystem */
public class C8273oOo0000 extends AbstractC8272oOo000 {
    public static C8348oOoOOo0<C8273oOo0000> OooO00o;

    static {
        C8348oOoOOo0<C8273oOo0000> OooO00o2 = C8348oOoOOo0.OooO00o(4, new C8273oOo0000(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0));
        OooO00o = OooO00o2;
        OooO00o2.OooO00o(0.5f);
    }

    public C8273oOo0000(C8353oOoOOoOO oooooooo, float f, float f2, C8351oOoOOo0o oooooo0o, View view, float f3, float f4, long j) {
        super(oooooooo, f, f2, oooooo0o, view, f3, f4, j);
    }

    public static C8273oOo0000 OooO00o(C8353oOoOOoOO oooooooo, float f, float f2, C8351oOoOOo0o oooooo0o, View view, float f3, float f4, long j) {
        C8273oOo0000 OooO00o2 = OooO00o.m20014OooO00o();
        ((AbstractRunnableC8285oOo00O0) OooO00o2).f21373OooO00o = oooooooo;
        OooO00o2.OooO0Oo = f;
        OooO00o2.OooO0o0 = f2;
        ((AbstractRunnableC8285oOo00O0) OooO00o2).f21372OooO00o = oooooo0o;
        ((AbstractRunnableC8285oOo00O0) OooO00o2).OooO00o = view;
        OooO00o2.OooO0oO = f3;
        OooO00o2.OooO0oo = f4;
        ((AbstractC8272oOo000) OooO00o2).OooO00o.setDuration(j);
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC8272oOo000
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr = ((AbstractRunnableC8285oOo00O0) this).f21374OooO00o;
        float f = this.OooO0oO;
        float f2 = this.OooO0o;
        fArr[0] = f + ((this.OooO0Oo - f) * f2);
        float f3 = this.OooO0oo;
        fArr[1] = f3 + ((this.OooO0o0 - f3) * f2);
        ((AbstractRunnableC8285oOo00O0) this).f21372OooO00o.OooO0O0(fArr);
        ((AbstractRunnableC8285oOo00O0) this).f21373OooO00o.OooO00o(((AbstractRunnableC8285oOo00O0) this).f21374OooO00o, ((AbstractRunnableC8285oOo00O0) this).OooO00o);
    }

    public static void OooO00o(C8273oOo0000 ooo0000) {
        OooO00o.OooO00o(ooo0000);
    }

    @Override // com.p118pd.sdk.AbstractC8272oOo000, com.p118pd.sdk.AbstractRunnableC8285oOo00O0, com.p118pd.sdk.C8348oOoOOo0.OooO00o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19975OooO00o() {
        OooO00o(this);
    }

    @Override // com.p118pd.sdk.AbstractC8272oOo000, com.p118pd.sdk.AbstractRunnableC8285oOo00O0, com.p118pd.sdk.C8348oOoOOo0.OooO00o
    public C8348oOoOOo0.OooO00o OooO00o() {
        return new C8273oOo0000(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0);
    }
}
