package com.facebook.drawee.components;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.internal.Preconditions;
import java.util.HashSet;
import java.util.Set;

public class DeferredReleaser {
    public static DeferredReleaser sInstance;
    public final Set<Releasable> mPendingReleasables = new HashSet();
    public final Handler mUiHandler = new Handler(Looper.getMainLooper());
    public final Runnable releaseRunnable = new Runnable() {
        /* class com.facebook.drawee.components.DeferredReleaser.RunnableC04861 */

        public void run() {
            DeferredReleaser.ensureOnUiThread();
            for (Releasable releasable : DeferredReleaser.this.mPendingReleasables) {
                releasable.release();
            }
            DeferredReleaser.this.mPendingReleasables.clear();
        }
    };

    public interface Releasable {
        void release();
    }

    public static void ensureOnUiThread() {
        Preconditions.checkState(Looper.getMainLooper().getThread() == Thread.currentThread());
    }

    public static synchronized DeferredReleaser getInstance() {
        DeferredReleaser deferredReleaser;
        synchronized (DeferredReleaser.class) {
            if (sInstance == null) {
                sInstance = new DeferredReleaser();
            }
            deferredReleaser = sInstance;
        }
        return deferredReleaser;
    }

    public void cancelDeferredRelease(Releasable releasable) {
        ensureOnUiThread();
        this.mPendingReleasables.remove(releasable);
    }

    public void scheduleDeferredRelease(Releasable releasable) {
        ensureOnUiThread();
        if (this.mPendingReleasables.add(releasable) && this.mPendingReleasables.size() == 1) {
            this.mUiHandler.post(this.releaseRunnable);
        }
    }
}
