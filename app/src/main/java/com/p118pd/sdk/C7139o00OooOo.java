package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.annotation.NonNull;

/* renamed from: com.pd.sdk.o00OooOo  reason: case insensitive filesystem */
public final class C7139o00OooOo {
    public EdgeEffect OooO00o;

    @Deprecated
    public C7139o00OooOo(Context context) {
        this.OooO00o = new EdgeEffect(context);
    }

    @Deprecated
    public void OooO00o(int i, int i2) {
        this.OooO00o.setSize(i, i2);
    }

    @Deprecated
    public boolean OooO0O0() {
        this.OooO00o.onRelease();
        return this.OooO00o.isFinished();
    }

    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18508OooO00o() {
        return this.OooO00o.isFinished();
    }

    @Deprecated
    public void OooO00o() {
        this.OooO00o.finish();
    }

    @Deprecated
    public boolean OooO00o(float f) {
        this.OooO00o.onPull(f);
        return true;
    }

    @Deprecated
    public boolean OooO00o(float f, float f2) {
        OooO00o(this.OooO00o, f, f2);
        return true;
    }

    public static void OooO00o(@NonNull EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f, f2);
        } else {
            edgeEffect.onPull(f);
        }
    }

    @Deprecated
    public boolean OooO00o(int i) {
        this.OooO00o.onAbsorb(i);
        return true;
    }

    @Deprecated
    public boolean OooO00o(Canvas canvas) {
        return this.OooO00o.draw(canvas);
    }
}
