package com.facebook.react.fabric.jsi;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.events.BatchEventDispatchedListener;

@SuppressLint({"MissingNativeLoadLibrary"})
public class EventBeatManager implements BatchEventDispatchedListener {
    @DoNotStrip
    public final HybridData mHybridData;
    public final ReactApplicationContext mReactApplicationContext;

    static {
        FabricSoLoader.staticInit();
    }

    public EventBeatManager(JavaScriptContextHolder javaScriptContextHolder, ReactApplicationContext reactApplicationContext) {
        this.mHybridData = initHybrid(javaScriptContextHolder.get());
        this.mReactApplicationContext = reactApplicationContext;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native void beat();

    private void dispatchEventsAsync() {
        if (this.mReactApplicationContext.isOnJSQueueThread()) {
            beat();
        } else {
            this.mReactApplicationContext.runOnJSQueueThread(new Runnable() {
                /* class com.facebook.react.fabric.jsi.EventBeatManager.RunnableC07371 */

                public void run() {
                    EventBeatManager.this.beat();
                }
            });
        }
    }

    public static native HybridData initHybrid(long j);

    @Override // com.facebook.react.uimanager.events.BatchEventDispatchedListener
    public void onBatchEventDispatched() {
        dispatchEventsAsync();
    }
}
