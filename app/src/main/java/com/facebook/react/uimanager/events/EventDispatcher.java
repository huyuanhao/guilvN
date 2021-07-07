package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.modules.core.ChoreographerCompat;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.systrace.Systrace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.p288ws.WebSocketProtocol;

public class EventDispatcher implements LifecycleEventListener {
    public static final Comparator<Event> EVENT_COMPARATOR = new Comparator<Event>() {
        /* class com.facebook.react.uimanager.events.EventDispatcher.C08541 */

        public int compare(Event event, Event event2) {
            if (event == null && event2 == null) {
                return 0;
            }
            if (event == null) {
                return -1;
            }
            if (event2 == null) {
                return 1;
            }
            long timestampMs = event.getTimestampMs() - event2.getTimestampMs();
            if (timestampMs == 0) {
                return 0;
            }
            return timestampMs < 0 ? -1 : 1;
        }
    };
    public final ScheduleDispatchFrameCallback mCurrentFrameCallback = new ScheduleDispatchFrameCallback();
    public final DispatchEventsRunnable mDispatchEventsRunnable = new DispatchEventsRunnable();
    public final LongSparseArray<Integer> mEventCookieToLastEventIdx = new LongSparseArray<>();
    public final Map<String, Short> mEventNameToEventId = MapBuilder.newHashMap();
    public final ArrayList<Event> mEventStaging = new ArrayList<>();
    public final Object mEventsStagingLock = new Object();
    public Event[] mEventsToDispatch = new Event[16];
    public final Object mEventsToDispatchLock = new Object();
    public int mEventsToDispatchSize = 0;
    public volatile boolean mHasDispatchScheduled = false;
    public final AtomicInteger mHasDispatchScheduledCount = new AtomicInteger();
    public final ArrayList<EventDispatcherListener> mListeners = new ArrayList<>();
    public short mNextEventTypeId = 0;
    public final List<BatchEventDispatchedListener> mPostEventDispatchListeners = new ArrayList();
    public final ReactApplicationContext mReactContext;
    public volatile ReactEventEmitter mReactEventEmitter;

    public class DispatchEventsRunnable implements Runnable {
        public DispatchEventsRunnable() {
        }

        public void run() {
            Systrace.beginSection(0, "DispatchEventsRunnable");
            try {
                Systrace.endAsyncFlow(0, "ScheduleDispatchFrameCallback", EventDispatcher.this.mHasDispatchScheduledCount.getAndIncrement());
                EventDispatcher.this.mHasDispatchScheduled = false;
                Assertions.assertNotNull(EventDispatcher.this.mReactEventEmitter);
                synchronized (EventDispatcher.this.mEventsToDispatchLock) {
                    if (EventDispatcher.this.mEventsToDispatchSize > 0) {
                        if (EventDispatcher.this.mEventsToDispatchSize > 1) {
                            Arrays.sort(EventDispatcher.this.mEventsToDispatch, 0, EventDispatcher.this.mEventsToDispatchSize, EventDispatcher.EVENT_COMPARATOR);
                        }
                        for (int i = 0; i < EventDispatcher.this.mEventsToDispatchSize; i++) {
                            Event event = EventDispatcher.this.mEventsToDispatch[i];
                            if (event != null) {
                                Systrace.endAsyncFlow(0, event.getEventName(), event.getUniqueID());
                                event.dispatch(EventDispatcher.this.mReactEventEmitter);
                                event.dispose();
                            }
                        }
                        EventDispatcher.this.clearEventsToDispatch();
                        EventDispatcher.this.mEventCookieToLastEventIdx.clear();
                    }
                }
                for (BatchEventDispatchedListener batchEventDispatchedListener : EventDispatcher.this.mPostEventDispatchListeners) {
                    batchEventDispatchedListener.onBatchEventDispatched();
                }
            } finally {
                Systrace.endSection(0);
            }
        }
    }

    public class ScheduleDispatchFrameCallback extends ChoreographerCompat.FrameCallback {
        public volatile boolean mIsPosted;
        public boolean mShouldStop;

        public ScheduleDispatchFrameCallback() {
            this.mIsPosted = false;
            this.mShouldStop = false;
        }

        private void post() {
            ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, EventDispatcher.this.mCurrentFrameCallback);
        }

        @Override // com.facebook.react.modules.core.ChoreographerCompat.FrameCallback
        public void doFrame(long j) {
            UiThreadUtil.assertOnUiThread();
            if (this.mShouldStop) {
                this.mIsPosted = false;
            } else {
                post();
            }
            Systrace.beginSection(0, "ScheduleDispatchFrameCallback");
            try {
                EventDispatcher.this.moveStagedEventsToDispatchQueue();
                if (!EventDispatcher.this.mHasDispatchScheduled) {
                    EventDispatcher.this.mHasDispatchScheduled = true;
                    Systrace.startAsyncFlow(0, "ScheduleDispatchFrameCallback", EventDispatcher.this.mHasDispatchScheduledCount.get());
                    EventDispatcher.this.mReactContext.runOnJSQueueThread(EventDispatcher.this.mDispatchEventsRunnable);
                }
            } finally {
                Systrace.endSection(0);
            }
        }

        public void maybePost() {
            if (!this.mIsPosted) {
                this.mIsPosted = true;
                post();
            }
        }

        public void maybePostFromNonUI() {
            if (!this.mIsPosted) {
                if (EventDispatcher.this.mReactContext.isOnUiQueueThread()) {
                    maybePost();
                } else {
                    EventDispatcher.this.mReactContext.runOnUiQueueThread(new Runnable() {
                        /* class com.facebook.react.uimanager.events.EventDispatcher.ScheduleDispatchFrameCallback.RunnableC08561 */

                        public void run() {
                            ScheduleDispatchFrameCallback.this.maybePost();
                        }
                    });
                }
            }
        }

        public void stop() {
            this.mShouldStop = true;
        }
    }

    public EventDispatcher(ReactApplicationContext reactApplicationContext) {
        this.mReactContext = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.mReactEventEmitter = new ReactEventEmitter(this.mReactContext);
    }

    private void addEventToEventsToDispatch(Event event) {
        int i = this.mEventsToDispatchSize;
        Event[] eventArr = this.mEventsToDispatch;
        if (i == eventArr.length) {
            this.mEventsToDispatch = (Event[]) Arrays.copyOf(eventArr, eventArr.length * 2);
        }
        Event[] eventArr2 = this.mEventsToDispatch;
        int i2 = this.mEventsToDispatchSize;
        this.mEventsToDispatchSize = i2 + 1;
        eventArr2[i2] = event;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void clearEventsToDispatch() {
        Arrays.fill(this.mEventsToDispatch, 0, this.mEventsToDispatchSize, (Object) null);
        this.mEventsToDispatchSize = 0;
    }

    private long getEventCookie(int i, String str, short s) {
        short s2;
        Short sh = this.mEventNameToEventId.get(str);
        if (sh != null) {
            s2 = sh.shortValue();
        } else {
            short s3 = this.mNextEventTypeId;
            this.mNextEventTypeId = (short) (s3 + 1);
            this.mEventNameToEventId.put(str, Short.valueOf(s3));
            s2 = s3;
        }
        return getEventCookie(i, s2, s);
    }

    public static long getEventCookie(int i, short s, short s2) {
        return ((((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((long) i) | ((((long) s2) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48);
    }

    private void maybePostFrameCallbackFromNonUI() {
        if (this.mReactEventEmitter != null) {
            this.mCurrentFrameCallback.maybePostFromNonUI();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void moveStagedEventsToDispatchQueue() {
        synchronized (this.mEventsStagingLock) {
            synchronized (this.mEventsToDispatchLock) {
                for (int i = 0; i < this.mEventStaging.size(); i++) {
                    Event event = this.mEventStaging.get(i);
                    if (!event.canCoalesce()) {
                        addEventToEventsToDispatch(event);
                    } else {
                        long eventCookie = getEventCookie(event.getViewTag(), event.getEventName(), event.getCoalescingKey());
                        Integer num = this.mEventCookieToLastEventIdx.get(eventCookie);
                        Event event2 = null;
                        if (num == null) {
                            this.mEventCookieToLastEventIdx.put(eventCookie, Integer.valueOf(this.mEventsToDispatchSize));
                        } else {
                            Event event3 = this.mEventsToDispatch[num.intValue()];
                            Event coalesce = event.coalesce(event3);
                            if (coalesce != event3) {
                                this.mEventCookieToLastEventIdx.put(eventCookie, Integer.valueOf(this.mEventsToDispatchSize));
                                this.mEventsToDispatch[num.intValue()] = null;
                                event2 = event3;
                                event = coalesce;
                            } else {
                                event2 = event;
                                event = null;
                            }
                        }
                        if (event != null) {
                            addEventToEventsToDispatch(event);
                        }
                        if (event2 != null) {
                            event2.dispose();
                        }
                    }
                }
            }
            this.mEventStaging.clear();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void stopFrameCallback() {
        UiThreadUtil.assertOnUiThread();
        this.mCurrentFrameCallback.stop();
    }

    public void addBatchEventDispatchedListener(BatchEventDispatchedListener batchEventDispatchedListener) {
        this.mPostEventDispatchListeners.add(batchEventDispatchedListener);
    }

    public void addListener(EventDispatcherListener eventDispatcherListener) {
        this.mListeners.add(eventDispatcherListener);
    }

    public void dispatchAllEvents() {
        maybePostFrameCallbackFromNonUI();
    }

    public void dispatchEvent(Event event) {
        Assertions.assertCondition(event.isInitialized(), "Dispatched event hasn't been initialized");
        Iterator<EventDispatcherListener> it = this.mListeners.iterator();
        while (it.hasNext()) {
            it.next().onEventDispatch(event);
        }
        synchronized (this.mEventsStagingLock) {
            this.mEventStaging.add(event);
            Systrace.startAsyncFlow(0, event.getEventName(), event.getUniqueID());
        }
        maybePostFrameCallbackFromNonUI();
    }

    public void onCatalystInstanceDestroyed() {
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.uimanager.events.EventDispatcher.RunnableC08552 */

            public void run() {
                EventDispatcher.this.stopFrameCallback();
            }
        });
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        stopFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        stopFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mCurrentFrameCallback.maybePostFromNonUI();
    }

    public void registerEventEmitter(int i, RCTEventEmitter rCTEventEmitter) {
        this.mReactEventEmitter.register(i, rCTEventEmitter);
    }

    public void removeBatchEventDispatchedListener(BatchEventDispatchedListener batchEventDispatchedListener) {
        this.mPostEventDispatchListeners.remove(batchEventDispatchedListener);
    }

    public void removeListener(EventDispatcherListener eventDispatcherListener) {
        this.mListeners.remove(eventDispatcherListener);
    }

    public void unregisterEventEmitter(int i) {
        this.mReactEventEmitter.unregister(i);
    }
}
