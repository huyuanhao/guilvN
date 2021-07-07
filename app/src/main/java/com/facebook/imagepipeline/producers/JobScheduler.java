package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.image.EncodedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

public class JobScheduler {
    public static final String QUEUE_TIME_KEY = "queueTime";
    public final Runnable mDoJobRunnable = new Runnable() {
        /* class com.facebook.imagepipeline.producers.JobScheduler.RunnableC05461 */

        public void run() {
            JobScheduler.this.doJob();
        }
    };
    @VisibleForTesting
    @GuardedBy("this")
    public EncodedImage mEncodedImage = null;
    public final Executor mExecutor;
    public final JobRunnable mJobRunnable;
    @VisibleForTesting
    @GuardedBy("this")
    public long mJobStartTime = 0;
    @VisibleForTesting
    @GuardedBy("this")
    public JobState mJobState = JobState.IDLE;
    @VisibleForTesting
    @GuardedBy("this")
    public long mJobSubmitTime = 0;
    public final int mMinimumJobIntervalMs;
    @VisibleForTesting
    @GuardedBy("this")
    public int mStatus = 0;
    public final Runnable mSubmitJobRunnable = new Runnable() {
        /* class com.facebook.imagepipeline.producers.JobScheduler.RunnableC05472 */

        public void run() {
            JobScheduler.this.submitJob();
        }
    };

    /* renamed from: com.facebook.imagepipeline.producers.JobScheduler$3 */
    public static /* synthetic */ class C05483 {

        /* renamed from: $SwitchMap$com$facebook$imagepipeline$producers$JobScheduler$JobState */
        public static final /* synthetic */ int[] f968xca5c4655;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.imagepipeline.producers.JobScheduler$JobState[] r0 = com.facebook.imagepipeline.producers.JobScheduler.JobState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.imagepipeline.producers.JobScheduler.C05483.f968xca5c4655 = r0
                com.facebook.imagepipeline.producers.JobScheduler$JobState r1 = com.facebook.imagepipeline.producers.JobScheduler.JobState.IDLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.facebook.imagepipeline.producers.JobScheduler.C05483.f968xca5c4655     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.imagepipeline.producers.JobScheduler$JobState r1 = com.facebook.imagepipeline.producers.JobScheduler.JobState.QUEUED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.facebook.imagepipeline.producers.JobScheduler.C05483.f968xca5c4655     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.imagepipeline.producers.JobScheduler$JobState r1 = com.facebook.imagepipeline.producers.JobScheduler.JobState.RUNNING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.facebook.imagepipeline.producers.JobScheduler.C05483.f968xca5c4655     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.imagepipeline.producers.JobScheduler$JobState r1 = com.facebook.imagepipeline.producers.JobScheduler.JobState.RUNNING_AND_PENDING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.JobScheduler.C05483.<clinit>():void");
        }
    }

    public interface JobRunnable {
        void run(EncodedImage encodedImage, int i);
    }

    @VisibleForTesting
    public static class JobStartExecutorSupplier {
        public static ScheduledExecutorService sJobStarterExecutor;

        public static ScheduledExecutorService get() {
            if (sJobStarterExecutor == null) {
                sJobStarterExecutor = Executors.newSingleThreadScheduledExecutor();
            }
            return sJobStarterExecutor;
        }
    }

    @VisibleForTesting
    public enum JobState {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public JobScheduler(Executor executor, JobRunnable jobRunnable, int i) {
        this.mExecutor = executor;
        this.mJobRunnable = jobRunnable;
        this.mMinimumJobIntervalMs = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void doJob() {
        EncodedImage encodedImage;
        int i;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            encodedImage = this.mEncodedImage;
            i = this.mStatus;
            this.mEncodedImage = null;
            this.mStatus = 0;
            this.mJobState = JobState.RUNNING;
            this.mJobStartTime = uptimeMillis;
        }
        try {
            if (shouldProcess(encodedImage, i)) {
                this.mJobRunnable.run(encodedImage, i);
            }
        } finally {
            EncodedImage.closeSafely(encodedImage);
            onJobFinished();
        }
    }

    private void enqueueJob(long j) {
        if (j > 0) {
            JobStartExecutorSupplier.get().schedule(this.mSubmitJobRunnable, j, TimeUnit.MILLISECONDS);
        } else {
            this.mSubmitJobRunnable.run();
        }
    }

    private void onJobFinished() {
        boolean z;
        long j;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.mJobState == JobState.RUNNING_AND_PENDING) {
                j = Math.max(this.mJobStartTime + ((long) this.mMinimumJobIntervalMs), uptimeMillis);
                z = true;
                this.mJobSubmitTime = uptimeMillis;
                this.mJobState = JobState.QUEUED;
            } else {
                this.mJobState = JobState.IDLE;
                j = 0;
                z = false;
            }
        }
        if (z) {
            enqueueJob(j - uptimeMillis);
        }
    }

    public static boolean shouldProcess(EncodedImage encodedImage, int i) {
        return BaseConsumer.isLast(i) || BaseConsumer.statusHasFlag(i, 4) || EncodedImage.isValid(encodedImage);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void submitJob() {
        this.mExecutor.execute(this.mDoJobRunnable);
    }

    public void clearJob() {
        EncodedImage encodedImage;
        synchronized (this) {
            encodedImage = this.mEncodedImage;
            this.mEncodedImage = null;
            this.mStatus = 0;
        }
        EncodedImage.closeSafely(encodedImage);
    }

    public synchronized long getQueuedTime() {
        return this.mJobStartTime - this.mJobSubmitTime;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r3 == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        enqueueJob(r5 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean scheduleJob() {
        /*
            r7 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            monitor-enter(r7)
            com.facebook.imagepipeline.image.EncodedImage r2 = r7.mEncodedImage     // Catch:{ all -> 0x0043 }
            int r3 = r7.mStatus     // Catch:{ all -> 0x0043 }
            boolean r2 = shouldProcess(r2, r3)     // Catch:{ all -> 0x0043 }
            r3 = 0
            if (r2 != 0) goto L_0x0012
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            return r3
        L_0x0012:
            int[] r2 = com.facebook.imagepipeline.producers.JobScheduler.C05483.f968xca5c4655     // Catch:{ all -> 0x0043 }
            com.facebook.imagepipeline.producers.JobScheduler$JobState r4 = r7.mJobState     // Catch:{ all -> 0x0043 }
            int r4 = r4.ordinal()     // Catch:{ all -> 0x0043 }
            r2 = r2[r4]     // Catch:{ all -> 0x0043 }
            r4 = 1
            if (r2 == r4) goto L_0x002a
            r5 = 3
            if (r2 == r5) goto L_0x0023
            goto L_0x0027
        L_0x0023:
            com.facebook.imagepipeline.producers.JobScheduler$JobState r2 = com.facebook.imagepipeline.producers.JobScheduler.JobState.RUNNING_AND_PENDING     // Catch:{ all -> 0x0043 }
            r7.mJobState = r2     // Catch:{ all -> 0x0043 }
        L_0x0027:
            r5 = 0
            goto L_0x003b
        L_0x002a:
            long r2 = r7.mJobStartTime     // Catch:{ all -> 0x0043 }
            int r5 = r7.mMinimumJobIntervalMs     // Catch:{ all -> 0x0043 }
            long r5 = (long) r5     // Catch:{ all -> 0x0043 }
            long r2 = r2 + r5
            long r5 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x0043 }
            r7.mJobSubmitTime = r0     // Catch:{ all -> 0x0043 }
            com.facebook.imagepipeline.producers.JobScheduler$JobState r2 = com.facebook.imagepipeline.producers.JobScheduler.JobState.QUEUED     // Catch:{ all -> 0x0043 }
            r7.mJobState = r2     // Catch:{ all -> 0x0043 }
            r3 = 1
        L_0x003b:
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x0042
            long r5 = r5 - r0
            r7.enqueueJob(r5)
        L_0x0042:
            return r4
        L_0x0043:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.JobScheduler.scheduleJob():boolean");
    }

    public boolean updateJob(EncodedImage encodedImage, int i) {
        EncodedImage encodedImage2;
        if (!shouldProcess(encodedImage, i)) {
            return false;
        }
        synchronized (this) {
            encodedImage2 = this.mEncodedImage;
            this.mEncodedImage = EncodedImage.cloneOrNull(encodedImage);
            this.mStatus = i;
        }
        EncodedImage.closeSafely(encodedImage2);
        return true;
    }
}
