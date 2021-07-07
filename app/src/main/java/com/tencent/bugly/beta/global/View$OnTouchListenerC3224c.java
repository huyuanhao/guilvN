package com.tencent.bugly.beta.global;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.bugly.proguard.C3321an;

/* renamed from: com.tencent.bugly.beta.global.c */
public class View$OnTouchListenerC3224c implements View.OnTouchListener {

    /* renamed from: a */
    public final int f7353a;

    /* renamed from: b */
    public final Object[] f7354b;

    public View$OnTouchListenerC3224c(int i, Object... objArr) {
        this.f7353a = i;
        this.f7354b = objArr;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        try {
            if (this.f7353a != 1) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0 || action == 2) {
                view.setBackgroundDrawable((Drawable) this.f7354b[0]);
            } else {
                view.setBackgroundDrawable((Drawable) this.f7354b[1]);
            }
            return false;
        } catch (Exception e) {
            if (!C3321an.m8353b(e)) {
                e.printStackTrace();
            }
        }
    }
}
