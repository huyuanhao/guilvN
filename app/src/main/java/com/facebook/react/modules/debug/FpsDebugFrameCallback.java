package com.facebook.react.modules.debug;

import androidx.core.app.FrameMetricsAggregator;
import com.facebook.infer.annotation.Assertions;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.ChoreographerCompat;
import com.facebook.react.uimanager.UIManagerModule;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import java.util.Map;
import java.util.TreeMap;
import javax.annotation.Nullable;

public class FpsDebugFrameCallback extends ChoreographerCompat.FrameCallback {
    public static final double EXPECTED_FRAME_TIME = 16.9d;
    public int m4PlusFrameStutters = 0;
    @Nullable
    public ChoreographerCompat mChoreographer;
    public final DidJSUpdateUiDuringFrameDetector mDidJSUpdateUiDuringFrameDetector;
    public int mExpectedNumFramesPrev = 0;
    public long mFirstFrameTime = -1;
    public boolean mIsRecordingFpsInfoAtEachFrame = false;
    public long mLastFrameTime = -1;
    public int mNumFrameCallbacks = 0;
    public int mNumFrameCallbacksWithBatchDispatches = 0;
    public final ReactContext mReactContext;
    public boolean mShouldStop = false;
    @Nullable
    public TreeMap<Long, FpsInfo> mTimeToFps;
    public final UIManagerModule mUIManagerModule;

    public static class FpsInfo {
        public final double fps;
        public final double jsFps;
        public final int total4PlusFrameStutters;
        public final int totalExpectedFrames;
        public final int totalFrames;
        public final int totalJsFrames;
        public final int totalTimeMs;

        public FpsInfo(int i, int i2, int i3, int i4, double d, double d2, int i5) {
            this.totalFrames = i;
            this.totalJsFrames = i2;
            this.totalExpectedFrames = i3;
            this.total4PlusFrameStutters = i4;
            this.fps = d;
            this.jsFps = d2;
            this.totalTimeMs = i5;
        }
    }

    public FpsDebugFrameCallback(ReactContext reactContext) {
        this.mReactContext = reactContext;
        this.mUIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.mDidJSUpdateUiDuringFrameDetector = new DidJSUpdateUiDuringFrameDetector();
    }

    @Override // com.facebook.react.modules.core.ChoreographerCompat.FrameCallback
    public void doFrame(long j) {
        if (!this.mShouldStop) {
            if (this.mFirstFrameTime == -1) {
                this.mFirstFrameTime = j;
            }
            long j2 = this.mLastFrameTime;
            this.mLastFrameTime = j;
            if (this.mDidJSUpdateUiDuringFrameDetector.getDidJSHitFrameAndCleanup(j2, j)) {
                this.mNumFrameCallbacksWithBatchDispatches++;
            }
            this.mNumFrameCallbacks++;
            int expectedNumFrames = getExpectedNumFrames();
            if ((expectedNumFrames - this.mExpectedNumFramesPrev) - 1 >= 4) {
                this.m4PlusFrameStutters++;
            }
            if (this.mIsRecordingFpsInfoAtEachFrame) {
                Assertions.assertNotNull(this.mTimeToFps);
                this.mTimeToFps.put(Long.valueOf(System.currentTimeMillis()), new FpsInfo(getNumFrames(), getNumJSFrames(), expectedNumFrames, this.m4PlusFrameStutters, getFPS(), getJSFPS(), getTotalTimeMS()));
            }
            this.mExpectedNumFramesPrev = expectedNumFrames;
            ChoreographerCompat choreographerCompat = this.mChoreographer;
            if (choreographerCompat != null) {
                choreographerCompat.postFrameCallback(this);
            }
        }
    }

    public int get4PlusFrameStutters() {
        return this.m4PlusFrameStutters;
    }

    public int getExpectedNumFrames() {
        double totalTimeMS = (double) getTotalTimeMS();
        Double.isNaN(totalTimeMS);
        return (int) ((totalTimeMS / 16.9d) + 1.0d);
    }

    public double getFPS() {
        if (this.mLastFrameTime == this.mFirstFrameTime) {
            return AbstractC8352oOoOOoO0.OooO0O0;
        }
        double numFrames = (double) getNumFrames();
        Double.isNaN(numFrames);
        double d = (double) (this.mLastFrameTime - this.mFirstFrameTime);
        Double.isNaN(d);
        return (numFrames * 1.0E9d) / d;
    }

    @Nullable
    public FpsInfo getFpsInfo(long j) {
        Assertions.assertNotNull(this.mTimeToFps, "FPS was not recorded at each frame!");
        Map.Entry<Long, FpsInfo> floorEntry = this.mTimeToFps.floorEntry(Long.valueOf(j));
        if (floorEntry == null) {
            return null;
        }
        return floorEntry.getValue();
    }

    public double getJSFPS() {
        if (this.mLastFrameTime == this.mFirstFrameTime) {
            return AbstractC8352oOoOOoO0.OooO0O0;
        }
        double numJSFrames = (double) getNumJSFrames();
        Double.isNaN(numJSFrames);
        double d = (double) (this.mLastFrameTime - this.mFirstFrameTime);
        Double.isNaN(d);
        return (numJSFrames * 1.0E9d) / d;
    }

    public int getNumFrames() {
        return this.mNumFrameCallbacks - 1;
    }

    public int getNumJSFrames() {
        return this.mNumFrameCallbacksWithBatchDispatches - 1;
    }

    public int getTotalTimeMS() {
        double d = (double) this.mLastFrameTime;
        double d2 = (double) this.mFirstFrameTime;
        Double.isNaN(d);
        Double.isNaN(d2);
        return ((int) (d - d2)) / FrameMetricsAggregator.OooO00o.OooO0O0;
    }

    public void reset() {
        this.mFirstFrameTime = -1;
        this.mLastFrameTime = -1;
        this.mNumFrameCallbacks = 0;
        this.m4PlusFrameStutters = 0;
        this.mNumFrameCallbacksWithBatchDispatches = 0;
        this.mIsRecordingFpsInfoAtEachFrame = false;
        this.mTimeToFps = null;
    }

    public void start() {
        this.mShouldStop = false;
        this.mReactContext.getCatalystInstance().addBridgeIdleDebugListener(this.mDidJSUpdateUiDuringFrameDetector);
        this.mUIManagerModule.setViewHierarchyUpdateDebugListener(this.mDidJSUpdateUiDuringFrameDetector);
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.modules.debug.FpsDebugFrameCallback.RunnableC07591 */

            public void run() {
                FpsDebugFrameCallback.this.mChoreographer = ChoreographerCompat.getInstance();
                FpsDebugFrameCallback.this.mChoreographer.postFrameCallback(this);
            }
        });
    }

    public void startAndRecordFpsAtEachFrame() {
        this.mTimeToFps = new TreeMap<>();
        this.mIsRecordingFpsInfoAtEachFrame = true;
        start();
    }

    public void stop() {
        this.mShouldStop = true;
        this.mReactContext.getCatalystInstance().removeBridgeIdleDebugListener(this.mDidJSUpdateUiDuringFrameDetector);
        this.mUIManagerModule.setViewHierarchyUpdateDebugListener(null);
    }
}
