package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Throwables;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteStreams;
import com.facebook.common.references.CloseableReference;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public class NativePooledByteBufferFactory implements PooledByteBufferFactory {
    public final NativeMemoryChunkPool mPool;
    public final PooledByteStreams mPooledByteStreams;

    public NativePooledByteBufferFactory(NativeMemoryChunkPool nativeMemoryChunkPool, PooledByteStreams pooledByteStreams) {
        this.mPool = nativeMemoryChunkPool;
        this.mPooledByteStreams = pooledByteStreams;
    }

    @VisibleForTesting
    public NativePooledByteBuffer newByteBuf(InputStream inputStream, NativePooledByteBufferOutputStream nativePooledByteBufferOutputStream) throws IOException {
        this.mPooledByteStreams.copy(inputStream, nativePooledByteBufferOutputStream);
        return nativePooledByteBufferOutputStream.toByteBuffer();
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public NativePooledByteBufferOutputStream newOutputStream() {
        return new NativePooledByteBufferOutputStream(this.mPool);
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public NativePooledByteBufferOutputStream newOutputStream(int i) {
        return new NativePooledByteBufferOutputStream(this.mPool, i);
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public NativePooledByteBuffer newByteBuffer(int i) {
        Preconditions.checkArgument(i > 0);
        CloseableReference of = CloseableReference.m938of(this.mPool.get(i), this.mPool);
        try {
            return new NativePooledByteBuffer(of, i);
        } finally {
            of.close();
        }
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public NativePooledByteBuffer newByteBuffer(InputStream inputStream) throws IOException {
        NativePooledByteBufferOutputStream nativePooledByteBufferOutputStream = new NativePooledByteBufferOutputStream(this.mPool);
        try {
            return newByteBuf(inputStream, nativePooledByteBufferOutputStream);
        } finally {
            nativePooledByteBufferOutputStream.close();
        }
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public NativePooledByteBuffer newByteBuffer(byte[] bArr) {
        NativePooledByteBufferOutputStream nativePooledByteBufferOutputStream = new NativePooledByteBufferOutputStream(this.mPool, bArr.length);
        try {
            nativePooledByteBufferOutputStream.write(bArr, 0, bArr.length);
            NativePooledByteBuffer byteBuffer = nativePooledByteBufferOutputStream.toByteBuffer();
            nativePooledByteBufferOutputStream.close();
            return byteBuffer;
        } catch (IOException e) {
            throw Throwables.propagate(e);
        } catch (Throwable th) {
            nativePooledByteBufferOutputStream.close();
            throw th;
        }
    }

    @Override // com.facebook.common.memory.PooledByteBufferFactory
    public NativePooledByteBuffer newByteBuffer(InputStream inputStream, int i) throws IOException {
        NativePooledByteBufferOutputStream nativePooledByteBufferOutputStream = new NativePooledByteBufferOutputStream(this.mPool, i);
        try {
            return newByteBuf(inputStream, nativePooledByteBufferOutputStream);
        } finally {
            nativePooledByteBufferOutputStream.close();
        }
    }
}
