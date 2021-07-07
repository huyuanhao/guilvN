package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = ToastModule.NAME)
public class ToastModule extends ReactContextBaseJavaModule {
    public static final String DURATION_LONG_KEY = "LONG";
    public static final String DURATION_SHORT_KEY = "SHORT";
    public static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    public static final String GRAVITY_CENTER = "CENTER";
    public static final String GRAVITY_TOP_KEY = "TOP";
    public static final String NAME = "ToastAndroid";

    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap newHashMap = MapBuilder.newHashMap();
        newHashMap.put(DURATION_SHORT_KEY, 0);
        newHashMap.put(DURATION_LONG_KEY, 1);
        newHashMap.put(GRAVITY_TOP_KEY, 49);
        newHashMap.put(GRAVITY_BOTTOM_KEY, 81);
        newHashMap.put(GRAVITY_CENTER, 17);
        return newHashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void show(final String str, final int i) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.modules.toast.ToastModule.RunnableC07981 */

            public void run() {
                Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i).show();
            }
        });
    }

    @ReactMethod
    public void showWithGravity(final String str, final int i, final int i2) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.modules.toast.ToastModule.RunnableC07992 */

            public void run() {
                Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i);
                makeText.setGravity(i2, 0, 0);
                makeText.show();
            }
        });
    }

    @ReactMethod
    public void showWithGravityAndOffset(final String str, final int i, final int i2, final int i3, final int i4) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.modules.toast.ToastModule.RunnableC08003 */

            public void run() {
                Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i);
                makeText.setGravity(i2, i3, i4);
                makeText.show();
            }
        });
    }
}
