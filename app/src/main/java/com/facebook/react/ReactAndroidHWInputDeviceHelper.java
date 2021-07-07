package com.facebook.react;

import android.view.KeyEvent;
import android.view.View;
import com.beefe.picker.Ilil1111;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.MapBuilder;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.util.Map;

public class ReactAndroidHWInputDeviceHelper {
    public static final Map<Integer, String> KEY_EVENTS_ACTIONS = MapBuilder.builder().put(23, Ilil1111.EVENT_KEY_SELECTED).put(66, Ilil1111.EVENT_KEY_SELECTED).put(62, Ilil1111.EVENT_KEY_SELECTED).put(85, "playPause").put(89, "rewind").put(90, "fastForward").put(19, CommonNetImpl.f10820UP).put(22, "right").put(20, "down").put(21, "left").build();
    public int mLastFocusedViewId = -1;
    public final ReactRootView mReactRootView;

    public ReactAndroidHWInputDeviceHelper(ReactRootView reactRootView) {
        this.mReactRootView = reactRootView;
    }

    private void dispatchEvent(String str, int i) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        if (i != -1) {
            writableNativeMap.putInt(CommonNetImpl.TAG, i);
        }
        this.mReactRootView.sendEvent("onHWKeyEvent", writableNativeMap);
    }

    public void clearFocus() {
        int i = this.mLastFocusedViewId;
        if (i != -1) {
            dispatchEvent("blur", i);
        }
        this.mLastFocusedViewId = -1;
    }

    public void handleKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 1 && KEY_EVENTS_ACTIONS.containsKey(Integer.valueOf(keyCode))) {
            dispatchEvent(KEY_EVENTS_ACTIONS.get(Integer.valueOf(keyCode)), this.mLastFocusedViewId);
        }
    }

    public void onFocusChanged(View view) {
        if (this.mLastFocusedViewId != view.getId()) {
            int i = this.mLastFocusedViewId;
            if (i != -1) {
                dispatchEvent("blur", i);
            }
            this.mLastFocusedViewId = view.getId();
            dispatchEvent("focus", view.getId());
        }
    }
}
