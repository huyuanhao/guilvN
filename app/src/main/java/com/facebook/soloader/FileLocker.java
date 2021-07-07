package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import javax.annotation.Nullable;

public final class FileLocker implements Closeable {
    @Nullable
    public final FileLock mLock;
    public final FileOutputStream mLockFileOutputStream;

    public FileLocker(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.mLockFileOutputStream = fileOutputStream;
        try {
            FileLock lock = fileOutputStream.getChannel().lock();
            if (lock == null) {
            }
            this.mLock = lock;
        } finally {
            this.mLockFileOutputStream.close();
        }
    }

    public static FileLocker lock(File file) throws IOException {
        return new FileLocker(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            if (this.mLock != null) {
                this.mLock.release();
            }
        } finally {
            this.mLockFileOutputStream.close();
        }
    }
}
