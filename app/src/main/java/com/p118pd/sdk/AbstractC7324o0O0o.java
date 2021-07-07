package com.p118pd.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.p003os.OperationCanceledException;
import androidx.loader.content.ModernAsyncTask;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: com.pd.sdk.o0O0o  reason: case insensitive filesystem */
public abstract class AbstractC7324o0O0o<D> extends C7226o00ooO00<D> {
    public static final boolean DEBUG = false;
    public static final String TAG = "AsyncTaskLoader";
    public volatile AbstractC7324o0O0o<D>.OooO00o mCancellingTask;
    public final Executor mExecutor;
    public Handler mHandler;
    public long mLastLoadCompleteTime;
    public volatile AbstractC7324o0O0o<D>.OooO00o mTask;
    public long mUpdateThrottle;

    /* renamed from: com.pd.sdk.o0O0o$OooO00o */
    public final class OooO00o extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final CountDownLatch f20045OooO00o = new CountDownLatch(1);
        public boolean OooO0O0;

        public OooO00o() {
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public void OooO0O0(D d) {
            try {
                AbstractC7324o0O0o.this.dispatchOnCancelled(this, d);
            } finally {
                this.f20045OooO00o.countDown();
            }
        }

        @Override // androidx.loader.content.ModernAsyncTask
        public void OooO0OO(D d) {
            try {
                AbstractC7324o0O0o.this.dispatchOnLoadComplete(this, d);
            } finally {
                this.f20045OooO00o.countDown();
            }
        }

        public void run() {
            this.OooO0O0 = false;
            AbstractC7324o0O0o.this.executePendingTask();
        }

        public D OooO00o(Void... voidArr) {
            try {
                return (D) AbstractC7324o0O0o.this.onLoadInBackground();
            } catch (OperationCanceledException e) {
                if (m14681OooO00o()) {
                    return null;
                }
                throw e;
            }
        }

        public void OooO0OO() {
            try {
                this.f20045OooO00o.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public AbstractC7324o0O0o(@NonNull Context context) {
        this(context, ModernAsyncTask.f14399OooO00o);
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(AbstractC7324o0O0o<D>.OooO00o oooO00o, D d) {
        onCanceled(d);
        if (this.mCancellingTask == oooO00o) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(AbstractC7324o0O0o<D>.OooO00o oooO00o, D d) {
        if (this.mTask != oooO00o) {
            dispatchOnCancelled(oooO00o, d);
        } else if (isAbandoned()) {
            onCanceled(d);
        } else {
            commitContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mTask = null;
            deliverResult(d);
        }
    }

    @Override // com.p118pd.sdk.C7226o00ooO00
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.OooO0O0);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.OooO0O0);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C7088o00OO0o0.OooO00o(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C7088o00OO0o0.OooO00o(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask == null && this.mTask != null) {
            if (this.mTask.OooO0O0) {
                this.mTask.OooO0O0 = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            if (this.mUpdateThrottle <= 0 || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
                this.mTask.OooO00o(this.mExecutor, (Object[]) null);
                return;
            }
            this.mTask.OooO0O0 = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    @Nullable
    public abstract D loadInBackground();

    @Override // com.p118pd.sdk.C7226o00ooO00
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.OooO0O0) {
                this.mTask.OooO0O0 = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        } else if (this.mTask.OooO0O0) {
            this.mTask.OooO0O0 = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        } else {
            boolean OooO00o2 = this.mTask.OooO00o(false);
            if (OooO00o2) {
                this.mCancellingTask = this.mTask;
                cancelLoadInBackground();
            }
            this.mTask = null;
            return OooO00o2;
        }
    }

    public void onCanceled(@Nullable D d) {
    }

    @Override // com.p118pd.sdk.C7226o00ooO00
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new OooO00o();
        executePendingTask();
    }

    @Nullable
    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void waitForLoader() {
        AbstractC7324o0O0o<D>.OooO00o oooO00o = this.mTask;
        if (oooO00o != null) {
            oooO00o.OooO0OO();
        }
    }

    public AbstractC7324o0O0o(@NonNull Context context, @NonNull Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000;
        this.mExecutor = executor;
    }
}
