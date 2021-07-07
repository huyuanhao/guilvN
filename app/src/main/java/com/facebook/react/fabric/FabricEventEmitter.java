package com.facebook.react.fabric;

import android.util.Pair;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.TouchesHelper;
import com.facebook.systrace.Systrace;
import java.util.HashSet;
import javax.annotation.Nullable;

public class FabricEventEmitter implements RCTEventEmitter {
    public static final String TAG = "FabricEventEmitter";
    public final FabricUIManager mUIManager;

    public FabricEventEmitter(FabricUIManager fabricUIManager) {
        this.mUIManager = fabricUIManager;
    }

    private WritableArray copyWritableArray(WritableArray writableArray) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i = 0; i < writableArray.size(); i++) {
            writableNativeArray.pushMap(getWritableMap(writableArray.getMap(i)));
        }
        return writableNativeArray;
    }

    private WritableMap getWritableMap(ReadableMap readableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.merge(readableMap);
        return writableNativeMap;
    }

    private Pair<WritableArray, WritableArray> removeTouchesAtIndices(WritableArray writableArray, WritableArray writableArray2) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < writableArray2.size(); i++) {
            int i2 = writableArray2.getInt(i);
            writableNativeArray.pushMap(getWritableMap(writableArray.getMap(i2)));
            hashSet.add(Integer.valueOf(i2));
        }
        for (int i3 = 0; i3 < writableArray.size(); i3++) {
            if (!hashSet.contains(Integer.valueOf(i3))) {
                writableNativeArray2.pushMap(getWritableMap(writableArray.getMap(i3)));
            }
        }
        return new Pair<>(writableNativeArray, writableNativeArray2);
    }

    private Pair<WritableArray, WritableArray> touchSubsequence(WritableArray writableArray, WritableArray writableArray2) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i = 0; i < writableArray2.size(); i++) {
            writableNativeArray.pushMap(getWritableMap(writableArray.getMap(writableArray2.getInt(i))));
        }
        return new Pair<>(writableNativeArray, writableArray);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveEvent(int i, String str, @Nullable WritableMap writableMap) {
        Systrace.beginSection(0, "FabricEventEmitter.receiveEvent('" + str + "')");
        this.mUIManager.receiveEvent(i, str, writableMap);
        Systrace.endSection(0);
    }

    @Override // com.facebook.react.uimanager.events.RCTEventEmitter
    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        Pair<WritableArray, WritableArray> pair;
        if (TouchesHelper.TOP_TOUCH_END_KEY.equalsIgnoreCase(str) || TouchesHelper.TOP_TOUCH_CANCEL_KEY.equalsIgnoreCase(str)) {
            pair = removeTouchesAtIndices(writableArray, writableArray2);
        } else {
            pair = touchSubsequence(writableArray, writableArray2);
        }
        WritableArray writableArray3 = (WritableArray) pair.first;
        WritableArray writableArray4 = (WritableArray) pair.second;
        for (int i = 0; i < writableArray3.size(); i++) {
            WritableMap writableMap = getWritableMap(writableArray3.getMap(i));
            writableMap.putArray(TouchesHelper.CHANGED_TOUCHES_KEY, copyWritableArray(writableArray3));
            writableMap.putArray(TouchesHelper.TOUCHES_KEY, copyWritableArray(writableArray4));
            int i2 = writableMap.getInt("target");
            if (i2 < 1) {
                FLog.m873e(TAG, "A view is reporting that a touch occurred on tag zero.");
                i2 = 0;
            }
            receiveEvent(i2, str, writableMap);
        }
    }
}
