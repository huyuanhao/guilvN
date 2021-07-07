package com.facebook.react.jstasks;

import android.os.Handler;
import android.util.SparseArray;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.p118pd.sdk.C9058ooOoOoOO;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

public class HeadlessJsTaskContext {
    public static final WeakHashMap<ReactContext, HeadlessJsTaskContext> INSTANCES = new WeakHashMap<>();
    public final Set<Integer> mActiveTasks = new CopyOnWriteArraySet();
    public final Handler mHandler = new Handler();
    public final Set<HeadlessJsTaskEventListener> mHeadlessJsTaskEventListeners = new CopyOnWriteArraySet();
    public final AtomicInteger mLastTaskId = new AtomicInteger(0);
    public final WeakReference<ReactContext> mReactContext;
    public final SparseArray<Runnable> mTaskTimeouts = new SparseArray<>();

    public HeadlessJsTaskContext(ReactContext reactContext) {
        this.mReactContext = new WeakReference<>(reactContext);
    }

    public static HeadlessJsTaskContext getInstance(ReactContext reactContext) {
        HeadlessJsTaskContext headlessJsTaskContext = INSTANCES.get(reactContext);
        if (headlessJsTaskContext != null) {
            return headlessJsTaskContext;
        }
        HeadlessJsTaskContext headlessJsTaskContext2 = new HeadlessJsTaskContext(reactContext);
        INSTANCES.put(reactContext, headlessJsTaskContext2);
        return headlessJsTaskContext2;
    }

    private void scheduleTaskTimeout(final int i, long j) {
        RunnableC07402 r0 = new Runnable() {
            /* class com.facebook.react.jstasks.HeadlessJsTaskContext.RunnableC07402 */

            public void run() {
                HeadlessJsTaskContext.this.finishTask(i);
            }
        };
        this.mTaskTimeouts.append(i, r0);
        this.mHandler.postDelayed(r0, j);
    }

    public void addTaskEventListener(HeadlessJsTaskEventListener headlessJsTaskEventListener) {
        this.mHeadlessJsTaskEventListeners.add(headlessJsTaskEventListener);
    }

    public synchronized void finishTask(final int i) {
        boolean remove = this.mActiveTasks.remove(Integer.valueOf(i));
        Assertions.assertCondition(remove, "Tried to finish non-existent task with id " + i + C9058ooOoOoOO.OooOO0);
        Runnable runnable = this.mTaskTimeouts.get(i);
        if (runnable != null) {
            this.mHandler.removeCallbacks(runnable);
            this.mTaskTimeouts.remove(i);
        }
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.jstasks.HeadlessJsTaskContext.RunnableC07391 */

            public void run() {
                for (HeadlessJsTaskEventListener headlessJsTaskEventListener : HeadlessJsTaskContext.this.mHeadlessJsTaskEventListeners) {
                    headlessJsTaskEventListener.onHeadlessJsTaskFinish(i);
                }
            }
        });
    }

    public boolean hasActiveTasks() {
        return this.mActiveTasks.size() > 0;
    }

    public synchronized boolean isTaskRunning(int i) {
        return this.mActiveTasks.contains(Integer.valueOf(i));
    }

    public void removeTaskEventListener(HeadlessJsTaskEventListener headlessJsTaskEventListener) {
        this.mHeadlessJsTaskEventListeners.remove(headlessJsTaskEventListener);
    }

    public synchronized int startTask(HeadlessJsTaskConfig headlessJsTaskConfig) {
        int incrementAndGet;
        UiThreadUtil.assertOnUiThread();
        ReactContext reactContext = (ReactContext) Assertions.assertNotNull(this.mReactContext.get(), "Tried to start a task on a react context that has already been destroyed");
        if (reactContext.getLifecycleState() == LifecycleState.RESUMED) {
            if (!headlessJsTaskConfig.isAllowedInForeground()) {
                throw new IllegalStateException("Tried to start task " + headlessJsTaskConfig.getTaskKey() + " while in foreground, but this is not allowed.");
            }
        }
        incrementAndGet = this.mLastTaskId.incrementAndGet();
        this.mActiveTasks.add(Integer.valueOf(incrementAndGet));
        ((AppRegistry) reactContext.getJSModule(AppRegistry.class)).startHeadlessTask(incrementAndGet, headlessJsTaskConfig.getTaskKey(), headlessJsTaskConfig.getData());
        if (headlessJsTaskConfig.getTimeout() > 0) {
            scheduleTaskTimeout(incrementAndGet, headlessJsTaskConfig.getTimeout());
        }
        for (HeadlessJsTaskEventListener headlessJsTaskEventListener : this.mHeadlessJsTaskEventListeners) {
            headlessJsTaskEventListener.onHeadlessJsTaskStart(incrementAndGet);
        }
        return incrementAndGet;
    }
}
