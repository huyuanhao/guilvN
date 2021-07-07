package com.p118pd.sdk;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import javax.annotation.Nullable;

/* renamed from: com.pd.sdk.ooOooOoo  reason: case insensitive filesystem */
public class C9086ooOooOoo extends ReactViewGroup {
    @Nullable
    public C9084ooOooOo OooO00o;

    public C9086ooOooOoo(Context context) {
        super(context);
    }

    public void OooO00o() {
        C9084ooOooOo ooooooo = this.OooO00o;
        if (ooooooo != null) {
            ooooooo.m20761OooO00o();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((C9084ooOooOo) Assertions.assertNotNull(this.OooO00o)).OooO00o(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.OooO00o == null) {
            this.OooO00o = new C9084ooOooOo((ReactContext) getContext(), this);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        ((C9084ooOooOo) Assertions.assertNotNull(this.OooO00o)).OooO00o(z);
        super.requestDisallowInterceptTouchEvent(z);
    }
}
