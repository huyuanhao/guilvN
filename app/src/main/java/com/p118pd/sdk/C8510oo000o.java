package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.C0033R;

/* renamed from: com.pd.sdk.oo000o  reason: case insensitive filesystem */
public class C8510oo000o extends SeekBar {
    public final C7193o00oO0o mAppCompatSeekBarHelper;

    public C8510oo000o(Context context) {
        this(context, null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.mAppCompatSeekBarHelper.m18684OooO00o();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.mAppCompatSeekBarHelper.OooO0O0();
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mAppCompatSeekBarHelper.OooO00o(canvas);
    }

    public C8510oo000o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0033R.attr.seekBarStyle);
    }

    public C8510oo000o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C7193o00oO0o o00oo0o = new C7193o00oO0o(this);
        this.mAppCompatSeekBarHelper = o00oo0o;
        o00oo0o.OooO00o(attributeSet, i);
    }
}
