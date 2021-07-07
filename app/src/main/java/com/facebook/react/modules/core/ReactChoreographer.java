package com.facebook.react.modules.core;

import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.core.ChoreographerCompat;
import java.util.ArrayDeque;
import javax.annotation.Nullable;

public class ReactChoreographer {
    public static ReactChoreographer sInstance;
    public final ArrayDeque<ChoreographerCompat.FrameCallback>[] mCallbackQueues = new ArrayDeque[CallbackType.values().length];
    @Nullable
    public volatile ChoreographerCompat mChoreographer;
    public boolean mHasPostedCallback = false;
    public final ReactChoreographerDispatcher mReactChoreographerDispatcher = new ReactChoreographerDispatcher();
    public int mTotalCallbacks = 0;

    public enum CallbackType {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);
        
        public final int mOrder;

        /* access modifiers changed from: public */
        CallbackType(int i) {
            this.mOrder = i;
        }

        public int getOrder() {
            return this.mOrder;
        }
    }

    public class ReactChoreographerDispatcher extends ChoreographerCompat.FrameCallback {
        public ReactChoreographerDispatcher() {
        }

        @Override // com.facebook.react.modules.core.ChoreographerCompat.FrameCallback
        public void doFrame(long j) {
            synchronized (ReactChoreographer.this) {
                ReactChoreographer.this.mHasPostedCallback = false;
                for (int i = 0; i < ReactChoreographer.this.mCallbackQueues.length; i++) {
                    int size = ReactChoreographer.this.mCallbackQueues[i].size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((ChoreographerCompat.FrameCallback) ReactChoreographer.this.mCallbackQueues[i].removeFirst()).doFrame(j);
                        ReactChoreographer.access$410(ReactChoreographer.this);
                    }
                }
                ReactChoreographer.this.maybeRemoveFrameCallback();
            }
        }
    }

    public ReactChoreographer() {
        int i = 0;
        while (true) {
            ArrayDeque<ChoreographerCompat.FrameCallback>[] arrayDequeArr = this.mCallbackQueues;
            if (i < arrayDequeArr.length) {
                arrayDequeArr[i] = new ArrayDeque<>();
                i++;
            } else {
                initializeChoreographer(null);
                return;
            }
        }
    }

    public static /* synthetic */ int access$410(ReactChoreographer reactChoreographer) {
        int i = reactChoreographer.mTotalCallbacks;
        reactChoreographer.mTotalCallbacks = i - 1;
        return i;
    }

    public static ReactChoreographer getInstance() {
        Assertions.assertNotNull(sInstance, "ReactChoreographer needs to be initialized.");
        return sInstance;
    }

    public static void initialize() {
        if (sInstance == null) {
            sInstance = new ReactChoreographer();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void maybeRemoveFrameCallback() {
        Assertions.assertCondition(this.mTotalCallbacks >= 0);
        if (this.mTotalCallbacks == 0 && this.mHasPostedCallback) {
            if (this.mChoreographer != null) {
                this.mChoreographer.removeFrameCallback(this.mReactChoreographerDispatcher);
            }
            this.mHasPostedCallback = false;
        }
    }

    public void initializeChoreographer(@Nullable final Runnable runnable) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.modules.core.ReactChoreographer.RunnableC07552 */

            public void run() {
                synchronized (ReactChoreographer.class) {
                    if (ReactChoreographer.this.mChoreographer == null) {
                        ReactChoreographer.this.mChoreographer = ChoreographerCompat.getInstance();
                    }
                }
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    public synchronized void postFrameCallback(CallbackType callbackType, ChoreographerCompat.FrameCallback frameCallback) {
        this.mCallbackQueues[callbackType.getOrder()].addLast(frameCallback);
        boolean z = true;
        int i = this.mTotalCallbacks + 1;
        this.mTotalCallbacks = i;
        if (i <= 0) {
            z = false;
        }
        Assertions.assertCondition(z);
        if (!this.mHasPostedCallback) {
            if (this.mChoreographer == null) {
                initializeChoreographer(new Runnable() {
                    /* class com.facebook.react.modules.core.ReactChoreographer.RunnableC07541 */

                    public void run() {
                        ReactChoreographer.this.postFrameCallbackOnChoreographer();
                    }
                });
            } else {
                postFrameCallbackOnChoreographer();
            }
        }
    }

    public void postFrameCallbackOnChoreographer() {
        this.mChoreographer.postFrameCallback(this.mReactChoreographerDispatcher);
        this.mHasPostedCallback = true;
    }

    public synchronized void removeFrameCallback(CallbackType callbackType, ChoreographerCompat.FrameCallback frameCallback) {
        if (this.mCallbackQueues[callbackType.getOrder()].removeFirstOccurrence(frameCallback)) {
            this.mTotalCallbacks--;
            maybeRemoveFrameCallback();
        } else {
            FLog.m873e(ReactConstants.TAG, "Tried to remove non-existent frame callback");
        }
    }
}
