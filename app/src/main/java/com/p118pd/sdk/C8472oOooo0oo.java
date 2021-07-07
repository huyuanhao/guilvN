package com.p118pd.sdk;

import android.view.MotionEvent;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.listener.ChartTouchListener;
import java.lang.ref.WeakReference;

/* renamed from: com.pd.sdk.oOooo0oo  reason: case insensitive filesystem */
public class C8472oOooo0oo implements AbstractC8311oOo0o00 {
    public WeakReference<AbstractC8194oOOo0OoO> OooO00o;

    public C8472oOooo0oo(AbstractC8194oOOo0OoO oooo0ooo) {
        this.OooO00o = new WeakReference<>(oooo0ooo);
    }

    @Override // com.p118pd.sdk.AbstractC8311oOo0o00
    public void OooO00o(MotionEvent motionEvent) {
    }

    @Override // com.p118pd.sdk.AbstractC8311oOo0o00
    public void OooO00o(MotionEvent motionEvent, float f, float f2) {
        OooO00o("chartScaled");
    }

    @Override // com.p118pd.sdk.AbstractC8311oOo0o00
    public void OooO00o(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
    }

    @Override // com.p118pd.sdk.AbstractC8311oOo0o00
    public void OooO00o(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
    }

    @Override // com.p118pd.sdk.AbstractC8311oOo0o00
    public void OooO0O0(MotionEvent motionEvent) {
    }

    @Override // com.p118pd.sdk.AbstractC8311oOo0o00
    public void OooO0O0(MotionEvent motionEvent, float f, float f2) {
        OooO00o("chartTranslated");
    }

    @Override // com.p118pd.sdk.AbstractC8311oOo0o00
    public void OooO0O0(MotionEvent motionEvent, ChartTouchListener.ChartGesture chartGesture) {
    }

    @Override // com.p118pd.sdk.AbstractC8311oOo0o00
    public void OooO0OO(MotionEvent motionEvent) {
    }

    private void OooO00o(String str) {
        WeakReference<AbstractC8194oOOo0OoO> weakReference = this.OooO00o;
        if (weakReference != null) {
            AbstractC8194oOOo0OoO oooo0ooo = weakReference.get();
            ((RCTEventEmitter) ((ReactContext) oooo0ooo.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(oooo0ooo.getId(), "topChange", OooO00o(str, oooo0ooo));
        }
    }

    private WritableMap OooO00o(String str, AbstractC8194oOOo0OoO oooo0ooo) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("action", str);
        if (oooo0ooo instanceof AbstractC8191oOOo0OOo) {
            C8353oOoOOoOO viewPortHandler = oooo0ooo.getViewPortHandler();
            createMap.putDouble(BaseViewManager.PROP_SCALE_X, (double) oooo0ooo.getScaleX());
            createMap.putDouble(BaseViewManager.PROP_SCALE_Y, (double) oooo0ooo.getScaleY());
            AbstractC8191oOOo0OOo oooo0ooo2 = (AbstractC8191oOOo0OOo) oooo0ooo;
            C8346oOoOOOoo OooO0O0 = oooo0ooo2.OooO0O0(viewPortHandler.m20028OooO00o().m20017OooO00o(), viewPortHandler.m20028OooO00o().OooO0O0(), YAxis.AxisDependency.LEFT);
            createMap.putDouble("centerX", OooO0O0.f21451OooO00o);
            createMap.putDouble("centerY", OooO0O0.OooO0O0);
            C8346oOoOOOoo OooO0O02 = oooo0ooo2.OooO0O0(viewPortHandler.OooO0OO(), viewPortHandler.OooO00o(), YAxis.AxisDependency.LEFT);
            C8346oOoOOOoo OooO0O03 = oooo0ooo2.OooO0O0(viewPortHandler.OooO0Oo(), viewPortHandler.OooO0o0(), YAxis.AxisDependency.LEFT);
            createMap.putDouble("left", OooO0O02.f21451OooO00o);
            createMap.putDouble("bottom", OooO0O02.OooO0O0);
            createMap.putDouble("right", OooO0O03.f21451OooO00o);
            createMap.putDouble("top", OooO0O03.OooO0O0);
        }
        return createMap;
    }
}
