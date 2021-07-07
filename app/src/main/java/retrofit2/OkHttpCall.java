package retrofit2;

import com.p118pd.sdk.C9143oooO0oOo;
import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO000O;
import com.p118pd.sdk.oOOO00OO;
import java.io.IOException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class OkHttpCall<T> implements Call<T> {
    @Nullable
    public final Object[] args;
    public volatile boolean canceled;
    @GuardedBy("this")
    @Nullable
    public Throwable creationFailure;
    @GuardedBy("this")
    public boolean executed;
    @GuardedBy("this")
    @Nullable
    public Call rawCall;
    public final ServiceMethod<T, ?> serviceMethod;

    public static final class ExceptionCatchingRequestBody extends ResponseBody {
        public final ResponseBody delegate;
        public IOException thrownException;

        public ExceptionCatchingRequestBody(ResponseBody responseBody) {
            this.delegate = responseBody;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, okhttp3.ResponseBody
        public void close() {
            this.delegate.close();
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.delegate.contentType();
        }

        @Override // okhttp3.ResponseBody
        public oOOO000O source() {
            return C9143oooO0oOo.OooO00o(new oOOO00OO(this.delegate.source()) {
                /* class retrofit2.OkHttpCall.ExceptionCatchingRequestBody.C48761 */

                @Override // com.p118pd.sdk.oOOO00OO, com.p118pd.sdk.AbstractC8930ooOOO0OO
                public long read(OOOO000 oooo000, long j) throws IOException {
                    try {
                        return super.read(oooo000, j);
                    } catch (IOException e) {
                        ExceptionCatchingRequestBody.this.thrownException = e;
                        throw e;
                    }
                }
            });
        }

        public void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public static final class NoContentResponseBody extends ResponseBody {
        public final long contentLength;
        public final MediaType contentType;

        public NoContentResponseBody(MediaType mediaType, long j) {
            this.contentType = mediaType;
            this.contentLength = j;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.contentType;
        }

        @Override // okhttp3.ResponseBody
        public oOOO000O source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(ServiceMethod<T, ?> serviceMethod2, @Nullable Object[] objArr) {
        this.serviceMethod = serviceMethod2;
        this.args = objArr;
    }

    private Call createRawCall() throws IOException {
        Call newCall = this.serviceMethod.callFactory.newCall(this.serviceMethod.toRequest(this.args));
        if (newCall != null) {
            return newCall;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // retrofit2.Call
    public void cancel() {
        Call call;
        this.canceled = true;
        synchronized (this) {
            call = this.rawCall;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // retrofit2.Call
    public void enqueue(final Callback<T> callback) {
        Call call;
        Throwable th;
        Utils.checkNotNull(callback, "callback == null");
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                call = this.rawCall;
                th = this.creationFailure;
                if (call == null && th == null) {
                    try {
                        Call createRawCall = createRawCall();
                        this.rawCall = createRawCall;
                        call = createRawCall;
                    } catch (Throwable th2) {
                        th = th2;
                        this.creationFailure = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.canceled) {
            call.cancel();
        }
        call.enqueue(new Callback() {
            /* class retrofit2.OkHttpCall.C48751 */

            private void callFailure(Throwable th) {
                try {
                    callback.onFailure(OkHttpCall.this, th);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }

            private void callSuccess(Response<T> response) {
                try {
                    callback.onResponse(OkHttpCall.this, response);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException iOException) {
                try {
                    callback.onFailure(OkHttpCall.this, iOException);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) throws IOException {
                try {
                    callSuccess(OkHttpCall.this.parseResponse(response));
                } catch (Throwable th) {
                    callFailure(th);
                }
            }
        });
    }

    @Override // retrofit2.Call
    public Response<T> execute() throws IOException {
        Call call;
        synchronized (this) {
            if (!this.executed) {
                this.executed = true;
                if (this.creationFailure == null) {
                    call = this.rawCall;
                    if (call == null) {
                        try {
                            call = createRawCall();
                            this.rawCall = call;
                        } catch (IOException | RuntimeException e) {
                            this.creationFailure = e;
                            throw e;
                        }
                    }
                } else if (this.creationFailure instanceof IOException) {
                    throw ((IOException) this.creationFailure);
                } else {
                    throw ((RuntimeException) this.creationFailure);
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.canceled) {
            call.cancel();
        }
        return parseResponse(call.execute());
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z = true;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            if (this.rawCall == null || !this.rawCall.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    @Override // retrofit2.Call
    public synchronized boolean isExecuted() {
        return this.executed;
    }

    public Response<T> parseResponse(Response response) throws IOException {
        ResponseBody body = response.body();
        Response build = response.newBuilder().body(new NoContentResponseBody(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                return Response.error(Utils.buffer(body), build);
            } finally {
                body.close();
            }
        } else if (code == 204 || code == 205) {
            body.close();
            return Response.success((Object) null, build);
        } else {
            ExceptionCatchingRequestBody exceptionCatchingRequestBody = new ExceptionCatchingRequestBody(body);
            try {
                return Response.success(this.serviceMethod.toResponse(exceptionCatchingRequestBody), build);
            } catch (RuntimeException e) {
                exceptionCatchingRequestBody.throwIfCaught();
                throw e;
            }
        }
    }

    @Override // retrofit2.Call
    public synchronized Request request() {
        Call call = this.rawCall;
        if (call != null) {
            return call.request();
        } else if (this.creationFailure == null) {
            try {
                Call createRawCall = createRawCall();
                this.rawCall = createRawCall;
                return createRawCall.request();
            } catch (RuntimeException e) {
                this.creationFailure = e;
                throw e;
            } catch (IOException e2) {
                this.creationFailure = e2;
                throw new RuntimeException("Unable to create request.", e2);
            }
        } else if (this.creationFailure instanceof IOException) {
            throw new RuntimeException("Unable to create request.", this.creationFailure);
        } else {
            throw ((RuntimeException) this.creationFailure);
        }
    }

    @Override // java.lang.Object, retrofit2.Call
    public OkHttpCall<T> clone() {
        return new OkHttpCall<>(this.serviceMethod, this.args);
    }
}
