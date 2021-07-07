package com.facebook.cache.common;

import com.facebook.common.internal.ByteStreams;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class WriterCallbacks {
    public static WriterCallback from(final InputStream inputStream) {
        return new WriterCallback() {
            /* class com.facebook.cache.common.WriterCallbacks.C04541 */

            @Override // com.facebook.cache.common.WriterCallback
            public void write(OutputStream outputStream) throws IOException {
                ByteStreams.copy(inputStream, outputStream);
            }
        };
    }

    public static WriterCallback from(final byte[] bArr) {
        return new WriterCallback() {
            /* class com.facebook.cache.common.WriterCallbacks.C04552 */

            @Override // com.facebook.cache.common.WriterCallback
            public void write(OutputStream outputStream) throws IOException {
                outputStream.write(bArr);
            }
        };
    }
}
