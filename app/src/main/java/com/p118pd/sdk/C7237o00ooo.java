package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import androidx.appcompat.C0033R;

/* renamed from: com.pd.sdk.o00ooo  reason: case insensitive filesystem */
public class C7237o00ooo extends RatingBar {
    public final C7131o00Ooo OooO00o;

    public C7237o00ooo(Context context) {
        this(context, null);
    }

    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap OooO00o2 = this.OooO00o.m18479OooO00o();
        if (OooO00o2 != null) {
            setMeasuredDimension(View.resolveSizeAndState(OooO00o2.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public C7237o00ooo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0033R.attr.ratingBarStyle);
    }

    public C7237o00ooo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C7131o00Ooo o00ooo = new C7131o00Ooo(this);
        this.OooO00o = o00ooo;
        o00ooo.OooO00o(attributeSet, i);
    }
}
