package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.UnpackingSoSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class ExoSoSource extends UnpackingSoSource {

    public final class ExoUnpacker extends UnpackingSoSource.Unpacker {
        public final FileDso[] mDsos;

        public final class FileBackedInputDsoIterator extends UnpackingSoSource.InputDsoIterator {
            public int mCurrentDso;

            public FileBackedInputDsoIterator() {
            }

            @Override // com.facebook.soloader.UnpackingSoSource.InputDsoIterator
            public boolean hasNext() {
                return this.mCurrentDso < ExoUnpacker.this.mDsos.length;
            }

            @Override // com.facebook.soloader.UnpackingSoSource.InputDsoIterator
            public UnpackingSoSource.InputDso next() throws IOException {
                FileDso[] fileDsoArr = ExoUnpacker.this.mDsos;
                int i = this.mCurrentDso;
                this.mCurrentDso = i + 1;
                FileDso fileDso = fileDsoArr[i];
                FileInputStream fileInputStream = new FileInputStream(fileDso.backingFile);
                try {
                    return new UnpackingSoSource.InputDso(fileDso, fileInputStream);
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f3, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
            r8.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f9, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00fa, code lost:
            r0.addSuppressed(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fe, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0102, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
            r10.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0108, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0109, code lost:
            r0.addSuppressed(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x010d, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ExoUnpacker(com.facebook.soloader.UnpackingSoSource r19) throws java.io.IOException {
            /*
            // Method dump skipped, instructions count: 302
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.ExoSoSource.ExoUnpacker.<init>(com.facebook.soloader.ExoSoSource, com.facebook.soloader.UnpackingSoSource):void");
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public UnpackingSoSource.DsoManifest getDsoManifest() throws IOException {
            return new UnpackingSoSource.DsoManifest(this.mDsos);
        }

        @Override // com.facebook.soloader.UnpackingSoSource.Unpacker
        public UnpackingSoSource.InputDsoIterator openDsoIterator() throws IOException {
            return new FileBackedInputDsoIterator();
        }
    }

    public static final class FileDso extends UnpackingSoSource.Dso {
        public final File backingFile;

        public FileDso(String str, String str2, File file) {
            super(str, str2);
            this.backingFile = file;
        }
    }

    public ExoSoSource(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.UnpackingSoSource
    public UnpackingSoSource.Unpacker makeUnpacker() throws IOException {
        return new ExoUnpacker(this);
    }
}
