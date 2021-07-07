package com.facebook.react.modules.core;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.SystemClock;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.jstasks.HeadlessJsTaskEventListener;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.ChoreographerCompat;
import com.facebook.react.modules.core.ReactChoreographer;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

@ReactModule(name = Timing.NAME)
public final class Timing extends ReactContextBaseJavaModule implements LifecycleEventListener, HeadlessJsTaskEventListener {
    public static final float FRAME_DURATION_MS = 16.666666f;
    public static final float IDLE_CALLBACK_FRAME_DEADLINE_MS = 1.0f;
    public static final String NAME = "Timing";
    public final AtomicBoolean isPaused = new AtomicBoolean(true);
    public final AtomicBoolean isRunningTasks = new AtomicBoolean(false);
    @Nullable
    public IdleCallbackRunnable mCurrentIdleCallbackRunnable;
    public final DevSupportManager mDevSupportManager;
    public boolean mFrameCallbackPosted = false;
    public boolean mFrameIdleCallbackPosted = false;
    public final Object mIdleCallbackGuard = new Object();
    public final IdleFrameCallback mIdleFrameCallback = new IdleFrameCallback();
    public final ReactChoreographer mReactChoreographer;
    public boolean mSendIdleEvents = false;
    public final TimerFrameCallback mTimerFrameCallback = new TimerFrameCallback();
    public final Object mTimerGuard = new Object();
    public final SparseArray<Timer> mTimerIdsToTimers;
    public final PriorityQueue<Timer> mTimers;

    public class IdleCallbackRunnable implements Runnable {
        public volatile boolean mCancelled = false;
        public final long mFrameStartTime;

        public IdleCallbackRunnable(long j) {
            this.mFrameStartTime = j;
        }

        public void cancel() {
            this.mCancelled = true;
        }

        public void run() {
            boolean z;
            if (!this.mCancelled) {
                long uptimeMillis = SystemClock.uptimeMillis() - (this.mFrameStartTime / 1000000);
                long currentTimeMillis = SystemClock.currentTimeMillis() - uptimeMillis;
                if (16.666666f - ((float) uptimeMillis) >= 1.0f) {
                    synchronized (Timing.this.mIdleCallbackGuard) {
                        z = Timing.this.mSendIdleEvents;
                    }
                    if (z) {
                        ((JSTimers) Timing.this.getReactApplicationContext().getJSModule(JSTimers.class)).callIdleCallbacks((double) currentTimeMillis);
                    }
                    Timing.this.mCurrentIdleCallbackRunnable = null;
                }
            }
        }
    }

    public class IdleFrameCallback extends ChoreographerCompat.FrameCallback {
        public IdleFrameCallback() {
        }

        @Override // com.facebook.react.modules.core.ChoreographerCompat.FrameCallback
        public void doFrame(long j) {
            if (!Timing.this.isPaused.get() || Timing.this.isRunningTasks.get()) {
                if (Timing.this.mCurrentIdleCallbackRunnable != null) {
                    Timing.this.mCurrentIdleCallbackRunnable.cancel();
                }
                Timing timing = Timing.this;
                timing.mCurrentIdleCallbackRunnable = new IdleCallbackRunnable(j);
                Timing.this.getReactApplicationContext().runOnJSQueueThread(Timing.this.mCurrentIdleCallbackRunnable);
                Timing.this.mReactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.IDLE_EVENT, this);
            }
        }
    }

    public static class Timer {
        public final int mCallbackID;
        public final int mInterval;
        public final boolean mRepeat;
        public long mTargetTime;

        public Timer(int i, long j, int i2, boolean z) {
            this.mCallbackID = i;
            this.mTargetTime = j;
            this.mInterval = i2;
            this.mRepeat = z;
        }
    }

    public class TimerFrameCallback extends ChoreographerCompat.FrameCallback {
        @Nullable
        public WritableArray mTimersToCall;

        public TimerFrameCallback() {
            this.mTimersToCall = null;
        }

        @Override // com.facebook.react.modules.core.ChoreographerCompat.FrameCallback
        public void doFrame(long j) {
            if (!Timing.this.isPaused.get() || Timing.this.isRunningTasks.get()) {
                long j2 = j / 1000000;
                synchronized (Timing.this.mTimerGuard) {
                    while (!Timing.this.mTimers.isEmpty() && ((Timer) Timing.this.mTimers.peek()).mTargetTime < j2) {
                        Timer timer = (Timer) Timing.this.mTimers.poll();
                        if (this.mTimersToCall == null) {
                            this.mTimersToCall = Arguments.createArray();
                        }
                        this.mTimersToCall.pushInt(timer.mCallbackID);
                        if (timer.mRepeat) {
                            timer.mTargetTime = ((long) timer.mInterval) + j2;
                            Timing.this.mTimers.add(timer);
                        } else {
                            Timing.this.mTimerIdsToTimers.remove(timer.mCallbackID);
                        }
                    }
                }
                if (this.mTimersToCall != null) {
                    ((JSTimers) Timing.this.getReactApplicationContext().getJSModule(JSTimers.class)).callTimers(this.mTimersToCall);
                    this.mTimersToCall = null;
                }
                Timing.this.mReactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, this);
            }
        }
    }

    public Timing(ReactApplicationContext reactApplicationContext, DevSupportManager devSupportManager) {
        super(reactApplicationContext);
        this.mDevSupportManager = devSupportManager;
        this.mTimers = new PriorityQueue<>(11, new Comparator<Timer>() {
            /* class com.facebook.react.modules.core.Timing.C07561 */

            public int compare(Timer timer, Timer timer2) {
                long j = timer.mTargetTime - timer2.mTargetTime;
                if (j == 0) {
                    return 0;
                }
                return j < 0 ? -1 : 1;
            }
        });
        this.mTimerIdsToTimers = new SparseArray<>();
        this.mReactChoreographer = ReactChoreographer.getInstance();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearChoreographerIdleCallback() {
        if (this.mFrameIdleCallbackPosted) {
            this.mReactChoreographer.removeFrameCallback(ReactChoreographer.CallbackType.IDLE_EVENT, this.mIdleFrameCallback);
            this.mFrameIdleCallbackPosted = false;
        }
    }

    private void clearFrameCallback() {
        HeadlessJsTaskContext instance = HeadlessJsTaskContext.getInstance(getReactApplicationContext());
        if (this.mFrameCallbackPosted && this.isPaused.get() && !instance.hasActiveTasks()) {
            this.mReactChoreographer.removeFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, this.mTimerFrameCallback);
            this.mFrameCallbackPosted = false;
        }
    }

    private void maybeIdleCallback() {
        if (this.isPaused.get() && !this.isRunningTasks.get()) {
            clearFrameCallback();
        }
    }

    private void maybeSetChoreographerIdleCallback() {
        synchronized (this.mIdleCallbackGuard) {
            if (this.mSendIdleEvents) {
                setChoreographerIdleCallback();
            }
        }
    }

    private void setChoreographerCallback() {
        if (!this.mFrameCallbackPosted) {
            this.mReactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, this.mTimerFrameCallback);
            this.mFrameCallbackPosted = true;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setChoreographerIdleCallback() {
        if (!this.mFrameIdleCallbackPosted) {
            this.mReactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.IDLE_EVENT, this.mIdleFrameCallback);
            this.mFrameIdleCallbackPosted = true;
        }
    }

    @ReactMethod
    public void createTimer(int i, int i2, double d, boolean z) {
        long currentTimeMillis = SystemClock.currentTimeMillis();
        long j = (long) d;
        if (this.mDevSupportManager.getDevSupportEnabled() && Math.abs(j - currentTimeMillis) > 60000) {
            ((JSTimers) getReactApplicationContext().getJSModule(JSTimers.class)).emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long max = Math.max(0L, (j - currentTimeMillis) + ((long) i2));
        if (i2 != 0 || z) {
            Timer timer = new Timer(i, (SystemClock.nanoTime() / 1000000) + max, i2, z);
            synchronized (this.mTimerGuard) {
                this.mTimers.add(timer);
                this.mTimerIdsToTimers.put(i, timer);
            }
            return;
        }
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i);
        ((JSTimers) getReactApplicationContext().getJSModule(JSTimers.class)).callTimers(createArray);
    }

    @ReactMethod
    public void deleteTimer(int i) {
        synchronized (this.mTimerGuard) {
            Timer timer = this.mTimerIdsToTimers.get(i);
            if (timer != null) {
                this.mTimerIdsToTimers.remove(i);
                this.mTimers.remove(timer);
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        HeadlessJsTaskContext.getInstance(getReactApplicationContext()).addTaskEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        clearFrameCallback();
        clearChoreographerIdleCallback();
        HeadlessJsTaskContext.getInstance(getReactApplicationContext()).removeTaskEventListener(this);
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public void onHeadlessJsTaskFinish(int i) {
        if (!HeadlessJsTaskContext.getInstance(getReactApplicationContext()).hasActiveTasks()) {
            this.isRunningTasks.set(false);
            clearFrameCallback();
            maybeIdleCallback();
        }
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public void onHeadlessJsTaskStart(int i) {
        if (!this.isRunningTasks.getAndSet(true)) {
            setChoreographerCallback();
            maybeSetChoreographerIdleCallback();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
        maybeIdleCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.isPaused.set(true);
        clearFrameCallback();
        maybeIdleCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.isPaused.set(false);
        setChoreographerCallback();
        maybeSetChoreographerIdleCallback();
    }

    @ReactMethod
    public void setSendIdleEvents(final boolean z) {
        synchronized (this.mIdleCallbackGuard) {
            this.mSendIdleEvents = z;
        }
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.modules.core.Timing.RunnableC07572 */

            public void run() {
                synchronized (Timing.this.mIdleCallbackGuard) {
                    if (z) {
                        Timing.this.setChoreographerIdleCallback();
                    } else {
                        Timing.this.clearChoreographerIdleCallback();
                    }
                }
            }
        });
    }
}
