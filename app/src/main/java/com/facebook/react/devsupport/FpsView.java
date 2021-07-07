package com.facebook.react.devsupport;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.common.logging.FLog;
import com.facebook.react.C0587R;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.debug.FpsDebugFrameCallback;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import java.util.Locale;

public class FpsView extends FrameLayout {
    public static final int UPDATE_INTERVAL_MS = 500;
    public final FPSMonitorRunnable mFPSMonitorRunnable;
    public final FpsDebugFrameCallback mFrameCallback;
    public final TextView mTextView = ((TextView) findViewById(C0587R.C0590id.fps_text));

    public class FPSMonitorRunnable implements Runnable {
        public boolean mShouldStop;
        public int mTotal4PlusFrameStutters;
        public int mTotalFramesDropped;

        public FPSMonitorRunnable() {
            this.mShouldStop = false;
            this.mTotalFramesDropped = 0;
            this.mTotal4PlusFrameStutters = 0;
        }

        public void run() {
            if (!this.mShouldStop) {
                this.mTotalFramesDropped += FpsView.this.mFrameCallback.getExpectedNumFrames() - FpsView.this.mFrameCallback.getNumFrames();
                this.mTotal4PlusFrameStutters += FpsView.this.mFrameCallback.get4PlusFrameStutters();
                FpsView fpsView = FpsView.this;
                fpsView.setCurrentFPS(fpsView.mFrameCallback.getFPS(), FpsView.this.mFrameCallback.getJSFPS(), this.mTotalFramesDropped, this.mTotal4PlusFrameStutters);
                FpsView.this.mFrameCallback.reset();
                FpsView.this.postDelayed(this, 500);
            }
        }

        public void start() {
            this.mShouldStop = false;
            FpsView.this.post(this);
        }

        public void stop() {
            this.mShouldStop = true;
        }
    }

    public FpsView(ReactContext reactContext) {
        super(reactContext);
        FrameLayout.inflate(reactContext, C0587R.layout.fps_view, this);
        this.mFrameCallback = new FpsDebugFrameCallback(reactContext);
        this.mFPSMonitorRunnable = new FPSMonitorRunnable();
        setCurrentFPS(AbstractC8352oOoOOoO0.OooO0O0, AbstractC8352oOoOOoO0.OooO0O0, 0, 0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setCurrentFPS(double d, double d2, int i, int i2) {
        String format = String.format(Locale.US, "UI: %.1f fps\n%d dropped so far\n%d stutters (4+) so far\nJS: %.1f fps", Double.valueOf(d), Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d2));
        this.mTextView.setText(format);
        FLog.m861d(ReactConstants.TAG, format);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFrameCallback.reset();
        this.mFrameCallback.start();
        this.mFPSMonitorRunnable.start();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFrameCallback.stop();
        this.mFPSMonitorRunnable.stop();
    }
}
