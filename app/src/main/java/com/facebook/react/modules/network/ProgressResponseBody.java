package com.facebook.react.modules.network;

import com.p118pd.sdk.AbstractC8930ooOOO0OO;
import com.p118pd.sdk.C9143oooO0oOo;
import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO000O;
import com.p118pd.sdk.oOOO00OO;
import java.io.IOException;
import javax.annotation.Nullable;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

public class ProgressResponseBody extends ResponseBody {
    @Nullable
    public oOOO000O mBufferedSource;
    public final ProgressListener mProgressListener;
    public final ResponseBody mResponseBody;
    public long mTotalBytesRead = 0;

    public ProgressResponseBody(ResponseBody responseBody, ProgressListener progressListener) {
        this.mResponseBody = responseBody;
        this.mProgressListener = progressListener;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.mResponseBody.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.mResponseBody.contentType();
    }

    @Override // okhttp3.ResponseBody
    public oOOO000O source() {
        if (this.mBufferedSource == null) {
            this.mBufferedSource = C9143oooO0oOo.OooO00o(source(this.mResponseBody.source()));
        }
        return this.mBufferedSource;
    }

    public long totalBytesRead() {
        return this.mTotalBytesRead;
    }

    private AbstractC8930ooOOO0OO source(AbstractC8930ooOOO0OO ooooo0oo) {
        return new oOOO00OO(ooooo0oo) {
            /* class com.facebook.react.modules.network.ProgressResponseBody.C07811 */

            @Override // com.p118pd.sdk.oOOO00OO, com.p118pd.sdk.AbstractC8930ooOOO0OO
            public long read(OOOO000 oooo000, long j) throws IOException {
                long read = super.read(oooo000, j);
                ProgressResponseBody.this.mTotalBytesRead += read != -1 ? read : 0;
                ProgressResponseBody.this.mProgressListener.onProgress(ProgressResponseBody.this.mTotalBytesRead, ProgressResponseBody.this.mResponseBody.contentLength(), read == -1);
                return read;
            }
        };
    }
}
