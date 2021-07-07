package com.facebook.react;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import com.facebook.react.jstasks.HeadlessJsTaskEventListener;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nullable;
import s.h.e.l.l.C;

public abstract class HeadlessJsTaskService extends Service implements HeadlessJsTaskEventListener {
    @Nullable
    public static PowerManager.WakeLock sWakeLock;
    public final Set<Integer> mActiveTasks = new CopyOnWriteArraySet();

    static {
        C.i(5);
    }

    @SuppressLint({"WakelockTimeout"})
    public static void acquireWakeLockNow(Context context) {
        PowerManager.WakeLock wakeLock = sWakeLock;
        if (wakeLock == null || !wakeLock.isHeld()) {
            PowerManager.WakeLock newWakeLock = ((PowerManager) Assertions.assertNotNull((PowerManager) context.getSystemService("power"))).newWakeLock(1, HeadlessJsTaskService.class.getSimpleName());
            sWakeLock = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            sWakeLock.acquire();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native void invokeStartTask(ReactContext reactContext, HeadlessJsTaskConfig headlessJsTaskConfig);

    public native ReactNativeHost getReactNativeHost();

    @Nullable
    public HeadlessJsTaskConfig getTaskConfig(Intent intent) {
        return null;
    }

    @Nullable
    public IBinder onBind(Intent intent) {
        return null;
    }

    public native void onDestroy();

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public native void onHeadlessJsTaskFinish(int i);

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public native void onHeadlessJsTaskStart(int i);

    public native int onStartCommand(Intent intent, int i, int i2);

    public native void startTask(HeadlessJsTaskConfig headlessJsTaskConfig);
}
