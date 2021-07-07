package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.PooledByteBufferOutputStream;
import com.facebook.common.references.CloseableReference;
import java.io.IOException;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
public class NativePooledByteBufferOutputStream extends PooledByteBufferOutputStream {
    public CloseableReference<NativeMemoryChunk> mBufRef;
    public int mCount;
    public final NativeMemoryChunkPool mPool;

    public static class InvalidStreamException extends RuntimeException {
        public InvalidStreamException() {
            super("OutputStream no longer valid");
        }
    }

    public NativePooledByteBufferOutputStream(NativeMemoryChunkPool nativeMemoryChunkPool) {
        this(nativeMemoryChunkPool, nativeMemoryChunkPool.getMinBufferSize());
    }

    private void ensureValid() {
        if (!CloseableReference.isValid(this.mBufRef)) {
            throw new InvalidStreamException();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, com.facebook.common.memory.PooledByteBufferOutputStream, java.lang.AutoCloseable
    public void close() {
        CloseableReference.closeSafely(this.mBufRef);
        this.mBufRef = null;
        this.mCount = -1;
        super.close();
    }

    @VisibleForTesting
    public void realloc(int i) {
        ensureValid();
        if (i > this.mBufRef.get().getSize()) {
            NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) this.mPool.get(i);
            this.mBufRef.get().copy(0, nativeMemoryChunk, 0, this.mCount);
            this.mBufRef.close();
            this.mBufRef = CloseableReference.m938of(nativeMemoryChunk, this.mPool);
        }
    }

    @Override // com.facebook.common.memory.PooledByteBufferOutputStream
    public int size() {
        return this.mCount;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    public NativePooledByteBufferOutputStream(NativeMemoryChunkPool nativeMemoryChunkPool, int i) {
        Preconditions.checkArgument(i > 0);
        NativeMemoryChunkPool nativeMemoryChunkPool2 = (NativeMemoryChunkPool) Preconditions.checkNotNull(nativeMemoryChunkPool);
        this.mPool = nativeMemoryChunkPool2;
        this.mCount = 0;
        this.mBufRef = CloseableReference.m938of(nativeMemoryChunkPool2.get(i), this.mPool);
    }

    @Override // com.facebook.common.memory.PooledByteBufferOutputStream
    public NativePooledByteBuffer toByteBuffer() {
        ensureValid();
        return new NativePooledByteBuffer(this.mBufRef, this.mCount);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        ensureValid();
        realloc(this.mCount + i2);
        this.mBufRef.get().write(this.mCount, bArr, i, i2);
        this.mCount += i2;
    }
}
