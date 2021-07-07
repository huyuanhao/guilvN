package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

@TargetApi(8)
/* renamed from: com.pd.sdk.丨ili1l丨1  reason: invalid class name and case insensitive filesystem */
public class C9630ili1l1 extends C6869liI {
    public final ScaleGestureDetector OooO00o;

    /* renamed from: com.pd.sdk.丨ili1l丨1$OooO00o */
    public class OooO00o implements ScaleGestureDetector.OnScaleGestureListener {
        public OooO00o() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            ((C9585iI1ll) C9630ili1l1.this).f23160OooO00o.OooO00o(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public C9630ili1l1(Context context) {
        super(context);
        this.OooO00o = new ScaleGestureDetector(context, new OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC9478LILL, com.p118pd.sdk.C9585iI1ll
    public boolean OooO00o() {
        return this.OooO00o.isInProgress();
    }

    @Override // com.p118pd.sdk.C6869liI, com.p118pd.sdk.AbstractC9478LILL, com.p118pd.sdk.C9585iI1ll
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.OooO00o.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
