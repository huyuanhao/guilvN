package com.p118pd.sdk;

import com.facebook.react.modules.network.CountingOutputStream;
import com.facebook.react.modules.network.ProgressListener;
import java.io.IOException;
import java.io.OutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* renamed from: com.pd.sdk.oo0OoOo0  reason: case insensitive filesystem */
public class C8674oo0OoOo0 extends RequestBody {
    public long OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ProgressListener f21827OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RequestBody f21828OooO00o;

    public C8674oo0OoOo0(RequestBody requestBody, ProgressListener progressListener) {
        this.f21828OooO00o = requestBody;
        this.f21827OooO00o = progressListener;
    }

    private AbstractC8210oOOoO0o0 outputStreamSink(oOOO0000 oooo0000) {
        return C9143oooO0oOo.OooO00o(new OooO00o(oooo0000.m19752OooO00o()));
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        if (this.OooO00o == 0) {
            this.OooO00o = this.f21828OooO00o.contentLength();
        }
        return this.OooO00o;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.f21828OooO00o.contentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(oOOO0000 oooo0000) throws IOException {
        oOOO0000 OooO00o2 = C9143oooO0oOo.OooO00o(outputStreamSink(oooo0000));
        contentLength();
        this.f21828OooO00o.writeTo(OooO00o2);
        OooO00o2.flush();
    }

    /* renamed from: com.pd.sdk.oo0OoOo0$OooO00o */
    public class OooO00o extends CountingOutputStream {
        public OooO00o(OutputStream outputStream) {
            super(outputStream);
        }

        private void sendProgressUpdate() throws IOException {
            long count = getCount();
            long contentLength = C8674oo0OoOo0.this.contentLength();
            C8674oo0OoOo0.this.f21827OooO00o.onProgress(count, contentLength, count == contentLength);
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
    }

    public RequestBody OooO00o() {
        return this.f21828OooO00o;
    }
}
