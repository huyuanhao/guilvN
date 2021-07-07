package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.nativecode.ImagePipelineNativeLoader;
import java.io.Closeable;

@DoNotStrip
public class NativeMemoryChunk implements Closeable {
    public static final String TAG = "NativeMemoryChunk";
    public boolean mClosed;
    public final long mNativePtr;
    public final int mSize;

    static {
        ImagePipelineNativeLoader.load();
    }

    public NativeMemoryChunk(int i) {
        Preconditions.checkArgument(i > 0);
        this.mSize = i;
        this.mNativePtr = nativeAllocate(i);
        this.mClosed = false;
    }

    private int adjustByteCount(int i, int i2) {
        return Math.min(Math.max(0, this.mSize - i), i2);
    }

    private void checkBounds(int i, int i2, int i3, int i4) {
        boolean z = true;
        Preconditions.checkArgument(i4 >= 0);
        Preconditions.checkArgument(i >= 0);
        Preconditions.checkArgument(i3 >= 0);
        Preconditions.checkArgument(i + i4 <= this.mSize);
        if (i3 + i4 > i2) {
            z = false;
        }
        Preconditions.checkArgument(z);
    }

    private void doCopy(int i, NativeMemoryChunk nativeMemoryChunk, int i2, int i3) {
        Preconditions.checkState(!isClosed());
        Preconditions.checkState(!nativeMemoryChunk.isClosed());
        checkBounds(i, nativeMemoryChunk.mSize, i2, i3);
        nativeMemcpy(nativeMemoryChunk.mNativePtr + ((long) i2), this.mNativePtr + ((long) i), i3);
    }

    @DoNotStrip
    public static native long nativeAllocate(int i);

    @DoNotStrip
    public static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @DoNotStrip
    public static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @DoNotStrip
    public static native void nativeFree(long j);

    @DoNotStrip
    public static native void nativeMemcpy(long j, long j2, int i);

    @DoNotStrip
    public static native byte nativeReadByte(long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.mClosed) {
            this.mClosed = true;
            nativeFree(this.mNativePtr);
        }
    }

    public void copy(int i, NativeMemoryChunk nativeMemoryChunk, int i2, int i3) {
        Preconditions.checkNotNull(nativeMemoryChunk);
        if (nativeMemoryChunk.mNativePtr == this.mNativePtr) {
            String str = "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(nativeMemoryChunk)) + " which share the same address " + Long.toHexString(this.mNativePtr);
            Preconditions.checkArgument(false);
        }
        if (nativeMemoryChunk.mNativePtr < this.mNativePtr) {
            synchronized (nativeMemoryChunk) {
                synchronized (this) {
                    doCopy(i, nativeMemoryChunk, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (nativeMemoryChunk) {
                doCopy(i, nativeMemoryChunk, i2, i3);
            }
        }
    }

    @Override // java.lang.Object
    public void finalize() throws Throwable {
        if (!isClosed()) {
            String str = "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. Underlying address = " + Long.toHexString(this.mNativePtr);
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public long getNativePtr() {
        return this.mNativePtr;
    }

    public int getSize() {
        return this.mSize;
    }

    public synchronized boolean isClosed() {
        return this.mClosed;
    }

    public synchronized int read(int i, byte[] bArr, int i2, int i3) {
        int adjustByteCount;
        Preconditions.checkNotNull(bArr);
        Preconditions.checkState(!isClosed());
        adjustByteCount = adjustByteCount(i, i3);
        checkBounds(i, bArr.length, i2, adjustByteCount);
        nativeCopyToByteArray(this.mNativePtr + ((long) i), bArr, i2, adjustByteCount);
        return adjustByteCount;
    }

    public synchronized int write(int i, byte[] bArr, int i2, int i3) {
        int adjustByteCount;
        Preconditions.checkNotNull(bArr);
        Preconditions.checkState(!isClosed());
        adjustByteCount = adjustByteCount(i, i3);
        checkBounds(i, bArr.length, i2, adjustByteCount);
        nativeCopyFromByteArray(this.mNativePtr + ((long) i), bArr, i2, adjustByteCount);
        return adjustByteCount;
    }

    @VisibleForTesting
    public NativeMemoryChunk() {
        this.mSize = 0;
        this.mNativePtr = 0;
        this.mClosed = true;
    }

    public synchronized byte read(int i) {
        boolean z = true;
        Preconditions.checkState(!isClosed());
        Preconditions.checkArgument(i >= 0);
        if (i >= this.mSize) {
            z = false;
        }
        Preconditions.checkArgument(z);
        return nativeReadByte(this.mNativePtr + ((long) i));
    }
}
