package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class NativePooledByteBuffer implements PooledByteBuffer {
    @VisibleForTesting
    @GuardedBy("this")
    public CloseableReference<NativeMemoryChunk> mBufRef;
    public final int mSize;

    public NativePooledByteBuffer(CloseableReference<NativeMemoryChunk> closeableReference, int i) {
        Preconditions.checkNotNull(closeableReference);
        Preconditions.checkArgument(i >= 0 && i <= closeableReference.get().getSize());
        this.mBufRef = closeableReference.clone();
        this.mSize = i;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        CloseableReference.closeSafely(this.mBufRef);
        this.mBufRef = null;
    }

    public synchronized void ensureValid() {
        if (isClosed()) {
            throw new PooledByteBuffer.ClosedException();
        }
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized long getNativePtr() {
        ensureValid();
        return this.mBufRef.get().getNativePtr();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized boolean isClosed() {
        return !CloseableReference.isValid(this.mBufRef);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized byte read(int i) {
        ensureValid();
        boolean z = true;
        Preconditions.checkArgument(i >= 0);
        if (i >= this.mSize) {
            z = false;
        }
        Preconditions.checkArgument(z);
        return this.mBufRef.get().read(i);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized int size() {
        ensureValid();
        return this.mSize;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized int read(int i, byte[] bArr, int i2, int i3) {
        ensureValid();
        Preconditions.checkArgument(i + i3 <= this.mSize);
        return this.mBufRef.get().read(i, bArr, i2, i3);
    }
}
