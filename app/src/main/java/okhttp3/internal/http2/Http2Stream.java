package okhttp3.internal.http2;

import com.p118pd.sdk.AbstractC8210oOOoO0o0;
import com.p118pd.sdk.AbstractC8930ooOOO0OO;
import com.p118pd.sdk.C7486o0OoO0oO;
import com.p118pd.sdk.C9193oooOoo;
import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.OooO0;
import com.p118pd.sdk.oOOO000O;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;

public final class Http2Stream {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public long bytesLeftInWriteWindow;
    public final Http2Connection connection;
    public ErrorCode errorCode = null;
    public boolean hasResponseHeaders;
    public Header.Listener headersListener;
    public final Deque<Headers> headersQueue = new ArrayDeque();

    /* renamed from: id */
    public final int f13424id;
    public final StreamTimeout readTimeout = new StreamTimeout();
    public final FramingSink sink;
    public final FramingSource source;
    public long unacknowledgedBytesRead = 0;
    public final StreamTimeout writeTimeout = new StreamTimeout();

    public final class FramingSink implements AbstractC8210oOOoO0o0 {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public static final long EMIT_BUFFER_SIZE = 16384;
        public boolean closed;
        public boolean finished;
        public final OOOO000 sendBuffer = new OOOO000();

        public FramingSink() {
        }

        /* JADX INFO: finally extract failed */
        private void emitFrame(boolean z) throws IOException {
            long min;
            synchronized (Http2Stream.this) {
                Http2Stream.this.writeTimeout.enter();
                while (Http2Stream.this.bytesLeftInWriteWindow <= 0 && !this.finished && !this.closed && Http2Stream.this.errorCode == null) {
                    try {
                        Http2Stream.this.waitForIo();
                    } catch (Throwable th) {
                        Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                        throw th;
                    }
                }
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed();
                min = Math.min(Http2Stream.this.bytesLeftInWriteWindow, this.sendBuffer.OooO0o0());
                Http2Stream.this.bytesLeftInWriteWindow -= min;
            }
            Http2Stream.this.writeTimeout.enter();
            try {
                Http2Stream.this.connection.writeData(Http2Stream.this.f13424id, z && min == this.sendBuffer.OooO0o0(), this.sendBuffer, min);
            } finally {
                Http2Stream.this.writeTimeout.exitAndThrowIfTimedOut();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.sendBuffer.OooO0o0() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.sendBuffer.OooO0o0() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            emitFrame(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            r0 = r8.this$0;
            r0.connection.writeData(r0.f13424id, true, null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
            r2 = r8.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.closed = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
            r8.this$0.connection.flush();
            r8.this$0.cancelStreamIfNecessary();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.this$0.sink.finished != false) goto L_0x003a;
         */
        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8210oOOoO0o0, java.lang.AutoCloseable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r8 = this;
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r0)
                boolean r1 = r8.closed     // Catch:{ all -> 0x0050 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0050 }
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Stream$FramingSink r0 = r0.sink
                boolean r0 = r0.finished
                r1 = 1
                if (r0 != 0) goto L_0x003a
                com.pd.sdk.OOOO000 r0 = r8.sendBuffer
                long r2 = r0.OooO0o0()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                com.pd.sdk.OOOO000 r0 = r8.sendBuffer
                long r2 = r0.OooO0o0()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x003a
                r8.emitFrame(r1)
                goto L_0x001f
            L_0x002d:
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r2 = r0.connection
                int r3 = r0.f13424id
                r4 = 1
                r5 = 0
                r6 = 0
                r2.writeData(r3, r4, r5, r6)
            L_0x003a:
                okhttp3.internal.http2.Http2Stream r2 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r2)
                r8.closed = r1     // Catch:{ all -> 0x004d }
                monitor-exit(r2)     // Catch:{ all -> 0x004d }
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r0 = r0.connection
                r0.flush()
                okhttp3.internal.http2.Http2Stream r0 = okhttp3.internal.http2.Http2Stream.this
                r0.cancelStreamIfNecessary()
                return
            L_0x004d:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            L_0x0050:
                r1 = move-exception
                monitor-exit(r0)
                goto L_0x0054
            L_0x0053:
                throw r1
            L_0x0054:
                goto L_0x0053
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.FramingSink.close():void");
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0, java.io.Flushable
        public void flush() throws IOException {
            synchronized (Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed();
            }
            while (this.sendBuffer.OooO0o0() > 0) {
                emitFrame(false);
                Http2Stream.this.connection.flush();
            }
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
        public C9193oooOoo timeout() {
            return Http2Stream.this.writeTimeout;
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
        public void write(OOOO000 oooo000, long j) throws IOException {
            this.sendBuffer.write(oooo000, j);
            while (this.sendBuffer.OooO0o0() >= 16384) {
                emitFrame(false);
            }
        }
    }

    public final class FramingSource implements AbstractC8930ooOOO0OO {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public boolean closed;
        public boolean finished;
        public final long maxByteCount;
        public final OOOO000 readBuffer = new OOOO000();
        public final OOOO000 receiveBuffer = new OOOO000();

        public FramingSource(long j) {
            this.maxByteCount = j;
        }

        private void updateConnectionFlowControl(long j) {
            Http2Stream.this.connection.updateConnectionFlowControl(j);
        }

        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8930ooOOO0OO, java.lang.AutoCloseable
        public void close() throws IOException {
            long OooO0o0;
            Header.Listener listener;
            ArrayList<Headers> arrayList;
            synchronized (Http2Stream.this) {
                this.closed = true;
                OooO0o0 = this.readBuffer.OooO0o0();
                this.readBuffer.m16610OooO0O0();
                listener = null;
                if (Http2Stream.this.headersQueue.isEmpty() || Http2Stream.this.headersListener == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(Http2Stream.this.headersQueue);
                    Http2Stream.this.headersQueue.clear();
                    listener = Http2Stream.this.headersListener;
                    arrayList = arrayList2;
                }
                Http2Stream.this.notifyAll();
            }
            if (OooO0o0 > 0) {
                updateConnectionFlowControl(OooO0o0);
            }
            Http2Stream.this.cancelStreamIfNecessary();
            if (listener != null) {
                for (Headers headers : arrayList) {
                    listener.onHeaders(headers);
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
        public long read(OOOO000 oooo000, long j) throws IOException {
            ErrorCode errorCode;
            long j2;
            Header.Listener listener;
            Headers headers;
            if (j >= 0) {
                while (true) {
                    synchronized (Http2Stream.this) {
                        Http2Stream.this.readTimeout.enter();
                        try {
                            errorCode = Http2Stream.this.errorCode != null ? Http2Stream.this.errorCode : null;
                            if (!this.closed) {
                                if (Http2Stream.this.headersQueue.isEmpty() || Http2Stream.this.headersListener == null) {
                                    if (this.readBuffer.OooO0o0() > 0) {
                                        j2 = this.readBuffer.read(oooo000, Math.min(j, this.readBuffer.OooO0o0()));
                                        Http2Stream.this.unacknowledgedBytesRead += j2;
                                        if (errorCode == null && Http2Stream.this.unacknowledgedBytesRead >= ((long) (Http2Stream.this.connection.okHttpSettings.getInitialWindowSize() / 2))) {
                                            Http2Stream.this.connection.writeWindowUpdateLater(Http2Stream.this.f13424id, Http2Stream.this.unacknowledgedBytesRead);
                                            Http2Stream.this.unacknowledgedBytesRead = 0;
                                        }
                                    } else if (this.finished || errorCode != null) {
                                        j2 = -1;
                                    } else {
                                        Http2Stream.this.waitForIo();
                                        Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                                    }
                                    headers = null;
                                    listener = null;
                                } else {
                                    headers = (Headers) Http2Stream.this.headersQueue.removeFirst();
                                    listener = Http2Stream.this.headersListener;
                                    j2 = -1;
                                }
                                if (headers != null && listener != null) {
                                    listener.onHeaders(headers);
                                }
                            } else {
                                throw new IOException("stream closed");
                            }
                        } finally {
                            Http2Stream.this.readTimeout.exitAndThrowIfTimedOut();
                        }
                    }
                }
                if (j2 != -1) {
                    updateConnectionFlowControl(j2);
                    return j2;
                } else if (errorCode == null) {
                    return -1;
                } else {
                    throw new StreamResetException(errorCode);
                }
            } else {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
        }

        public void receive(oOOO000O oooo000o, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (Http2Stream.this) {
                    z = this.finished;
                    z2 = true;
                    z3 = this.readBuffer.OooO0o0() + j > this.maxByteCount;
                }
                if (z3) {
                    oooo000o.m19759OooO00o(j);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    oooo000o.m19759OooO00o(j);
                    return;
                } else {
                    long read = oooo000o.read(this.receiveBuffer, j);
                    if (read != -1) {
                        j -= read;
                        synchronized (Http2Stream.this) {
                            if (this.readBuffer.OooO0o0() != 0) {
                                z2 = false;
                            }
                            this.readBuffer.OooO00o((AbstractC8930ooOOO0OO) this.receiveBuffer);
                            if (z2) {
                                Http2Stream.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
        public C9193oooOoo timeout() {
            return Http2Stream.this.readTimeout;
        }
    }

    public class StreamTimeout extends OooO0 {
        public StreamTimeout() {
        }

        public void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // com.p118pd.sdk.OooO0
        public IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(C7486o0OoO0oO.f20312OooO0Oo);
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.p118pd.sdk.OooO0
        public void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
        }
    }

    public Http2Stream(int i, Http2Connection http2Connection, boolean z, boolean z2, @Nullable Headers headers) {
        if (http2Connection != null) {
            this.f13424id = i;
            this.connection = http2Connection;
            this.bytesLeftInWriteWindow = (long) http2Connection.peerSettings.getInitialWindowSize();
            this.source = new FramingSource((long) http2Connection.okHttpSettings.getInitialWindowSize());
            FramingSink framingSink = new FramingSink();
            this.sink = framingSink;
            this.source.finished = z2;
            framingSink.finished = z;
            if (headers != null) {
                this.headersQueue.add(headers);
            }
            if (isLocallyInitiated() && headers != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!isLocallyInitiated() && headers == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    private boolean closeInternal(ErrorCode errorCode2) {
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.finished && this.sink.finished) {
                return false;
            }
            this.errorCode = errorCode2;
            notifyAll();
            this.connection.removeStream(this.f13424id);
            return true;
        }
    }

    public void addBytesToWriteWindow(long j) {
        this.bytesLeftInWriteWindow += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public void cancelStreamIfNecessary() throws IOException {
        boolean z;
        boolean isOpen;
        synchronized (this) {
            z = !this.source.finished && this.source.closed && (this.sink.finished || this.sink.closed);
            isOpen = isOpen();
        }
        if (z) {
            close(ErrorCode.CANCEL);
        } else if (!isOpen) {
            this.connection.removeStream(this.f13424id);
        }
    }

    public void checkOutNotClosed() throws IOException {
        FramingSink framingSink = this.sink;
        if (framingSink.closed) {
            throw new IOException("stream closed");
        } else if (framingSink.finished) {
            throw new IOException("stream finished");
        } else if (this.errorCode != null) {
            throw new StreamResetException(this.errorCode);
        }
    }

    public void close(ErrorCode errorCode2) throws IOException {
        if (closeInternal(errorCode2)) {
            this.connection.writeSynReset(this.f13424id, errorCode2);
        }
    }

    public void closeLater(ErrorCode errorCode2) {
        if (closeInternal(errorCode2)) {
            this.connection.writeSynResetLater(this.f13424id, errorCode2);
        }
    }

    public Http2Connection getConnection() {
        return this.connection;
    }

    public synchronized ErrorCode getErrorCode() {
        return this.errorCode;
    }

    public int getId() {
        return this.f13424id;
    }

    public AbstractC8210oOOoO0o0 getSink() {
        synchronized (this) {
            if (!this.hasResponseHeaders) {
                if (!isLocallyInitiated()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.sink;
    }

    public AbstractC8930ooOOO0OO getSource() {
        return this.source;
    }

    public boolean isLocallyInitiated() {
        if (this.connection.client == ((this.f13424id & 1) == 1)) {
            return true;
        }
        return false;
    }

    public synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        if ((this.source.finished || this.source.closed) && ((this.sink.finished || this.sink.closed) && this.hasResponseHeaders)) {
            return false;
        }
        return true;
    }

    public C9193oooOoo readTimeout() {
        return this.readTimeout;
    }

    public void receiveData(oOOO000O oooo000o, int i) throws IOException {
        this.source.receive(oooo000o, (long) i);
    }

    public void receiveFin() {
        boolean isOpen;
        synchronized (this) {
            this.source.finished = true;
            isOpen = isOpen();
            notifyAll();
        }
        if (!isOpen) {
            this.connection.removeStream(this.f13424id);
        }
    }

    public void receiveHeaders(List<Header> list) {
        boolean isOpen;
        synchronized (this) {
            this.hasResponseHeaders = true;
            this.headersQueue.add(Util.toHeaders(list));
            isOpen = isOpen();
            notifyAll();
        }
        if (!isOpen) {
            this.connection.removeStream(this.f13424id);
        }
    }

    public synchronized void receiveRstStream(ErrorCode errorCode2) {
        if (this.errorCode == null) {
            this.errorCode = errorCode2;
            notifyAll();
        }
    }

    public synchronized void setHeadersListener(Header.Listener listener) {
        this.headersListener = listener;
        if (!this.headersQueue.isEmpty() && listener != null) {
            notifyAll();
        }
    }

    /* JADX INFO: finally extract failed */
    public synchronized Headers takeHeaders() throws IOException {
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo();
            } catch (Throwable th) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!this.headersQueue.isEmpty()) {
        } else {
            throw new StreamResetException(this.errorCode);
        }
        return this.headersQueue.removeFirst();
    }

    public void waitForIo() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public void writeHeaders(List<Header> list, boolean z) throws IOException {
        boolean z2;
        boolean z3;
        boolean z4;
        if (list != null) {
            synchronized (this) {
                z2 = true;
                this.hasResponseHeaders = true;
                if (!z) {
                    this.sink.finished = true;
                    z3 = true;
                    z4 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
            }
            if (!z3) {
                synchronized (this.connection) {
                    if (this.connection.bytesLeftInWriteWindow != 0) {
                        z2 = false;
                    }
                }
                z3 = z2;
            }
            this.connection.writeSynReply(this.f13424id, z4, list);
            if (z3) {
                this.connection.flush();
                return;
            }
            return;
        }
        throw new NullPointerException("headers == null");
    }

    public C9193oooOoo writeTimeout() {
        return this.writeTimeout;
    }
}
