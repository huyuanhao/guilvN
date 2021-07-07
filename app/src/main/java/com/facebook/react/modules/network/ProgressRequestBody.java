package com.facebook.react.modules.network;

import com.p118pd.sdk.AbstractC8210oOOoO0o0;
import com.p118pd.sdk.C9143oooO0oOo;
import com.p118pd.sdk.oOOO0000;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;

public class ProgressRequestBody extends RequestBody {
    public long mContentLength = 0;
    public final ProgressListener mProgressListener;
    public final RequestBody mRequestBody;

    public ProgressRequestBody(RequestBody requestBody, ProgressListener progressListener) {
        this.mRequestBody = requestBody;
        this.mProgressListener = progressListener;
    }

    private AbstractC8210oOOoO0o0 outputStreamSink(oOOO0000 oooo0000) {
        return C9143oooO0oOo.OooO00o(new CountingOutputStream(oooo0000.m19752OooO00o()) {
            /* class com.facebook.react.modules.network.ProgressRequestBody.C07801 */

            private void sendProgressUpdate() throws IOException {
                long count = getCount();
                long contentLength = ProgressRequestBody.this.contentLength();
                ProgressRequestBody.this.mProgressListener.onProgress(count, contentLength, count == contentLength);
            }

            @Override // java.io.OutputStream, com.facebook.react.modules.network.CountingOutputStream, java.io.FilterOutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                super.write(bArr, i, i2);
                sendProgressUpdate();
            }

            @Override // java.io.OutputStream, com.facebook.react.modules.network.CountingOutputStream, java.io.FilterOutputStream
            public void write(int i) throws IOException {
                super.write(i);
                sendProgressUpdate();
            }
        });
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        if (this.mContentLength == 0) {
            this.mContentLength = this.mRequestBody.contentLength();
        }
        return this.mContentLength;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.mRequestBody.contentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(oOOO0000 oooo0000) throws IOException {
        oOOO0000 OooO00o = C9143oooO0oOo.OooO00o(outputStreamSink(oooo0000));
        contentLength();
        this.mRequestBody.writeTo(OooO00o);
        OooO00o.flush();
    }
}
