package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.MotionEvent;

@TargetApi(5)
/* renamed from: com.pd.sdk.l丨i丨I丨  reason: invalid class name and case insensitive filesystem */
public class C6869liI extends C9585iI1ll {
    public static final int OooO0OO = -1;
    public int OooO00o = -1;
    public int OooO0O0 = 0;

    public C6869liI(Context context) {
        super(context);
    }

    @Override // com.p118pd.sdk.C9585iI1ll
    public float OooO00o(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.OooO0O0);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    @Override // com.p118pd.sdk.C9585iI1ll
    public float OooO0O0(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.OooO0O0);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    @Override // com.p118pd.sdk.AbstractC9478LILL, com.p118pd.sdk.C9585iI1ll
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        int i = 0;
        if (action != 0) {
            int i2 = 1;
            if (action == 1 || action == 3) {
                this.OooO00o = -1;
            } else if (action == 6) {
                int OooO00o2 = L1IlIlI.OooO00o(motionEvent.getAction());
                if (motionEvent.getPointerId(OooO00o2) == this.OooO00o) {
                    if (OooO00o2 != 0) {
                        i2 = 0;
                    }
                    this.OooO00o = motionEvent.getPointerId(i2);
                    ((C9585iI1ll) this).f23158OooO00o = motionEvent.getX(i2);
                    super.OooO0O0 = motionEvent.getY(i2);
                }
            }
        } else {
            this.OooO00o = motionEvent.getPointerId(0);
        }
        int i3 = this.OooO00o;
        if (i3 != -1) {
            i = i3;
        }
        this.OooO0O0 = motionEvent.findPointerIndex(i);
        return super.onTouchEvent(motionEvent);
    }
}
