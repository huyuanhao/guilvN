package com.p118pd.sdk;

import androidx.core.util.Pools;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.text.FontMetricsUtil;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import java.util.Formatter;
import org.reactnative.camera.CameraViewManager;

/* renamed from: com.pd.sdk.丨iiiII丨i  reason: invalid class name and case insensitive filesystem */
public class C9619iiiIIi extends Event<C9619iiiIIi> {
    public static final Pools.OooO0O0<C9619iiiIIi> OooO00o = new Pools.OooO0O0<>(3);

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f23201OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Result f23202OooO00o;
    public int OooO0O0;

    public static C9619iiiIIi OooO00o(int i, Result result, int i2, int i3) {
        C9619iiiIIi acquire = OooO00o.acquire();
        if (acquire == null) {
            acquire = new C9619iiiIIi();
        }
        acquire.m21680OooO00o(i, result, i2, i3);
        return acquire;
    }

    private WritableMap serializeEventData() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putString("data", this.f23202OooO00o.getText());
        byte[] rawBytes = this.f23202OooO00o.getRawBytes();
        if (rawBytes != null && rawBytes.length > 0) {
            Formatter formatter = new Formatter();
            int length = rawBytes.length;
            for (int i = 0; i < length; i++) {
                formatter.format("%02x", Byte.valueOf(rawBytes[i]));
            }
            createMap.putString("rawData", formatter.toString());
            formatter.close();
        }
        createMap.putString("type", this.f23202OooO00o.getBarcodeFormat().toString());
        WritableArray createArray = Arguments.createArray();
        ResultPoint[] resultPoints = this.f23202OooO00o.getResultPoints();
        for (ResultPoint resultPoint : resultPoints) {
            if (resultPoint != null) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putString(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, String.valueOf(resultPoint.getX()));
                createMap3.putString("y", String.valueOf(resultPoint.getY()));
                createArray.pushMap(createMap3);
            }
        }
        createMap2.putArray("origin", createArray);
        createMap2.putInt("height", this.OooO0O0);
        createMap2.putInt("width", this.f23201OooO00o);
        createMap.putMap("bounds", createMap2);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) (this.f23202OooO00o.getText().hashCode() % 32767);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return CameraViewManager.Events.EVENT_ON_BAR_CODE_READ.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m21680OooO00o(int i, Result result, int i2, int i3) {
        super.init(i);
        this.f23202OooO00o = result;
        this.f23201OooO00o = i2;
        this.OooO0O0 = i3;
    }
}
