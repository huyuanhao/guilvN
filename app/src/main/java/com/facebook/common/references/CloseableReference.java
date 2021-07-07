package com.facebook.common.references;

import com.facebook.common.internal.Closeables;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.PropagatesNullable;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class CloseableReference<T> implements Cloneable, Closeable {
    public static final ResourceReleaser<Closeable> DEFAULT_CLOSEABLE_RELEASER = new ResourceReleaser<Closeable>() {
        /* class com.facebook.common.references.CloseableReference.C04701 */

        public void release(Closeable closeable) {
            try {
                Closeables.close(closeable, true);
            } catch (IOException unused) {
            }
        }
    };
    public static Class<CloseableReference> TAG = CloseableReference.class;
    @GuardedBy("this")
    public boolean mIsClosed = false;
    public final SharedReference<T> mSharedReference;

    public CloseableReference(SharedReference<T> sharedReference) {
        this.mSharedReference = (SharedReference) Preconditions.checkNotNull(sharedReference);
        sharedReference.addReference();
    }

    public static void closeSafely(@Nullable CloseableReference<?> closeableReference) {
        if (closeableReference != null) {
            closeableReference.close();
        }
    }

    /* renamed from: of */
    public static <T extends Closeable> CloseableReference<T> m937of(@PropagatesNullable T t) {
        if (t == null) {
            return null;
        }
        return new CloseableReference<>(t, DEFAULT_CLOSEABLE_RELEASER);
    }

    @Nullable
    public synchronized CloseableReference<T> cloneOrNull() {
        if (!isValid()) {
            return null;
        }
        return clone();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!this.mIsClosed) {
                this.mIsClosed = true;
                this.mSharedReference.deleteReference();
            }
        }
    }

    @Override // java.lang.Object
    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.mIsClosed) {
                    FLog.m911w(TAG, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.mSharedReference)), this.mSharedReference.get().getClass().getName());
                    close();
                    super.finalize();
                }
            }
        } finally {
            super.finalize();
        }
    }

    public synchronized T get() {
        Preconditions.checkState(!this.mIsClosed);
        return this.mSharedReference.get();
    }

    @VisibleForTesting
    public synchronized SharedReference<T> getUnderlyingReferenceTestOnly() {
        return this.mSharedReference;
    }

    public int getValueHash() {
        if (isValid()) {
            return System.identityHashCode(this.mSharedReference.get());
        }
        return 0;
    }

    public synchronized boolean isValid() {
        return !this.mIsClosed;
    }

    public static void closeSafely(@Nullable Iterable<? extends CloseableReference<?>> iterable) {
        if (iterable != null) {
            Iterator<? extends CloseableReference<?>> it = iterable.iterator();
            while (it.hasNext()) {
                closeSafely((CloseableReference) it.next());
            }
        }
    }

    public static boolean isValid(@Nullable CloseableReference<?> closeableReference) {
        return closeableReference != null && closeableReference.isValid();
    }

    /* renamed from: of */
    public static <T> CloseableReference<T> m938of(@PropagatesNullable T t, ResourceReleaser<T> resourceReleaser) {
        if (t == null) {
            return null;
        }
        return new CloseableReference<>(t, resourceReleaser);
    }

    @Override // java.lang.Object
    public synchronized CloseableReference<T> clone() {
        Preconditions.checkState(isValid());
        return new CloseableReference<>(this.mSharedReference);
    }

    @Nullable
    public static <T> CloseableReference<T> cloneOrNull(@Nullable CloseableReference<T> closeableReference) {
        if (closeableReference != null) {
            return closeableReference.cloneOrNull();
        }
        return null;
    }

    public CloseableReference(T t, ResourceReleaser<T> resourceReleaser) {
        this.mSharedReference = new SharedReference<>(t, resourceReleaser);
    }

    public static <T> List<CloseableReference<T>> cloneOrNull(@PropagatesNullable Collection<CloseableReference<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (CloseableReference<T> closeableReference : collection) {
            arrayList.add(cloneOrNull(closeableReference));
        }
        return arrayList;
    }
}
