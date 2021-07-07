package com.facebook.common.statfs;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.facebook.common.internal.Throwables;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class StatFsHelper {
    public static final long RESTAT_INTERVAL_MS = TimeUnit.MINUTES.toMillis(2);
    public static StatFsHelper sStatsFsHelper;
    public final Lock lock = new ReentrantLock();
    public volatile File mExternalPath;
    public volatile StatFs mExternalStatFs = null;
    public volatile boolean mInitialized = false;
    public volatile File mInternalPath;
    public volatile StatFs mInternalStatFs = null;
    @GuardedBy("lock")
    public long mLastRestatTime;

    public enum StorageType {
        INTERNAL,
        EXTERNAL
    }

    public static StatFs createStatFs(String str) {
        return new StatFs(str);
    }

    private void ensureInitialized() {
        if (!this.mInitialized) {
            this.lock.lock();
            try {
                if (!this.mInitialized) {
                    this.mInternalPath = Environment.getDataDirectory();
                    this.mExternalPath = Environment.getExternalStorageDirectory();
                    updateStats();
                    this.mInitialized = true;
                }
            } finally {
                this.lock.unlock();
            }
        }
    }

    public static synchronized StatFsHelper getInstance() {
        StatFsHelper statFsHelper;
        synchronized (StatFsHelper.class) {
            if (sStatsFsHelper == null) {
                sStatsFsHelper = new StatFsHelper();
            }
            statFsHelper = sStatsFsHelper;
        }
        return statFsHelper;
    }

    private void maybeUpdateStats() {
        if (this.lock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - this.mLastRestatTime > RESTAT_INTERVAL_MS) {
                    updateStats();
                }
            } finally {
                this.lock.unlock();
            }
        }
    }

    @GuardedBy("lock")
    private void updateStats() {
        this.mInternalStatFs = updateStatsHelper(this.mInternalStatFs, this.mInternalPath);
        this.mExternalStatFs = updateStatsHelper(this.mExternalStatFs, this.mExternalPath);
        this.mLastRestatTime = SystemClock.uptimeMillis();
    }

    private StatFs updateStatsHelper(@Nullable StatFs statFs, @Nullable File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        if (statFs == null) {
            try {
                statFs = createStatFs(file.getAbsolutePath());
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Throwable th) {
                throw Throwables.propagate(th);
            }
        } else {
            statFs.restat(file.getAbsolutePath());
        }
        return statFs;
    }

    @SuppressLint({"DeprecatedMethod"})
    public long getAvailableStorageSpace(StorageType storageType) {
        long j;
        long j2;
        ensureInitialized();
        maybeUpdateStats();
        StatFs statFs = storageType == StorageType.INTERNAL ? this.mInternalStatFs : this.mExternalStatFs;
        if (statFs == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            j2 = statFs.getBlockSizeLong();
            j = statFs.getAvailableBlocksLong();
        } else {
            j2 = (long) statFs.getBlockSize();
            j = (long) statFs.getAvailableBlocks();
        }
        return j2 * j;
    }

    @SuppressLint({"DeprecatedMethod"})
    public long getFreeStorageSpace(StorageType storageType) {
        long j;
        long j2;
        ensureInitialized();
        maybeUpdateStats();
        StatFs statFs = storageType == StorageType.INTERNAL ? this.mInternalStatFs : this.mExternalStatFs;
        if (statFs == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            j2 = statFs.getBlockSizeLong();
            j = statFs.getFreeBlocksLong();
        } else {
            j2 = (long) statFs.getBlockSize();
            j = (long) statFs.getFreeBlocks();
        }
        return j2 * j;
    }

    @SuppressLint({"DeprecatedMethod"})
    public long getTotalStorageSpace(StorageType storageType) {
        long j;
        long j2;
        ensureInitialized();
        maybeUpdateStats();
        StatFs statFs = storageType == StorageType.INTERNAL ? this.mInternalStatFs : this.mExternalStatFs;
        if (statFs == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            j2 = statFs.getBlockSizeLong();
            j = statFs.getBlockCountLong();
        } else {
            j2 = (long) statFs.getBlockSize();
            j = (long) statFs.getBlockCount();
        }
        return j2 * j;
    }

    public void resetStats() {
        if (this.lock.tryLock()) {
            try {
                ensureInitialized();
                updateStats();
            } finally {
                this.lock.unlock();
            }
        }
    }

    public boolean testLowDiskSpace(StorageType storageType, long j) {
        ensureInitialized();
        long availableStorageSpace = getAvailableStorageSpace(storageType);
        return availableStorageSpace <= 0 || availableStorageSpace < j;
    }
}
