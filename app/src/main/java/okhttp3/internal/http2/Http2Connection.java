package okhttp3.internal.http2;

import com.p118pd.sdk.C9143oooO0oOo;
import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO0000;
import com.p118pd.sdk.oOOO000O;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Protocol;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Http2Reader;
import okio.ByteString;

public final class Http2Connection implements Closeable {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int OKHTTP_CLIENT_WINDOW_SIZE = 16777216;
    public static final ExecutorService listenerExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Http2Connection", true));
    public boolean awaitingPong;
    public long bytesLeftInWriteWindow;
    public final boolean client;
    public final Set<Integer> currentPushRequests = new LinkedHashSet();
    public final String hostname;
    public int lastGoodStreamId;
    public final Listener listener;
    public int nextStreamId;
    public Settings okHttpSettings = new Settings();
    public final Settings peerSettings = new Settings();
    public final ExecutorService pushExecutor;
    public final PushObserver pushObserver;
    public final ReaderRunnable readerRunnable;
    public boolean receivedInitialPeerSettings = false;
    public boolean shutdown;
    public final Socket socket;
    public final Map<Integer, Http2Stream> streams = new LinkedHashMap();
    public long unacknowledgedBytesRead = 0;
    public final Http2Writer writer;
    public final ScheduledExecutorService writerExecutor;

    public static abstract class Listener {
        public static final Listener REFUSE_INCOMING_STREAMS = new Listener() {
            /* class okhttp3.internal.http2.Http2Connection.Listener.C47801 */

            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void onStream(Http2Stream http2Stream) throws IOException {
                http2Stream.close(ErrorCode.REFUSED_STREAM);
            }
        };

        public void onSettings(Http2Connection http2Connection) {
        }

        public abstract void onStream(Http2Stream http2Stream) throws IOException;
    }

    public final class PingRunnable extends NamedRunnable {
        public final int payload1;
        public final int payload2;
        public final boolean reply;

        public PingRunnable(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", Http2Connection.this.hostname, Integer.valueOf(i), Integer.valueOf(i2));
            this.reply = z;
            this.payload1 = i;
            this.payload2 = i2;
        }

        @Override // okhttp3.internal.NamedRunnable
        public void execute() {
            Http2Connection.this.writePing(this.reply, this.payload1, this.payload2);
        }
    }

    public class ReaderRunnable extends NamedRunnable implements Http2Reader.Handler {
        public final Http2Reader reader;

        public ReaderRunnable(Http2Reader http2Reader) {
            super("OkHttp %s", Http2Connection.this.hostname);
            this.reader = http2Reader;
        }

        private void applyAndAckSettings(final Settings settings) {
            try {
                Http2Connection.this.writerExecutor.execute(new NamedRunnable("OkHttp %s ACK Settings", new Object[]{Http2Connection.this.hostname}) {
                    /* class okhttp3.internal.http2.Http2Connection.ReaderRunnable.C47833 */

                    @Override // okhttp3.internal.NamedRunnable
                    public void execute() {
                        try {
                            Http2Connection.this.writer.applyAndAckSettings(settings);
                        } catch (IOException unused) {
                            Http2Connection.this.failConnection();
                        }
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ackSettings() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void alternateService(int i, String str, ByteString byteString, String str2, int i2, long j) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void data(boolean z, int i, oOOO000O oooo000o, int i2) throws IOException {
            if (Http2Connection.this.pushedStream(i)) {
                Http2Connection.this.pushDataLater(i, oooo000o, i2, z);
                return;
            }
            Http2Stream stream = Http2Connection.this.getStream(i);
            if (stream == null) {
                Http2Connection.this.writeSynResetLater(i, ErrorCode.PROTOCOL_ERROR);
                long j = (long) i2;
                Http2Connection.this.updateConnectionFlowControl(j);
                oooo000o.m19759OooO00o(j);
                return;
            }
            stream.receiveData(oooo000o, i2);
            if (z) {
                stream.receiveFin();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
            r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
            r2 = r4.this$0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x002b, code lost:
            r2 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001c */
        @Override // okhttp3.internal.NamedRunnable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void execute() {
            /*
                r4 = this;
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
                okhttp3.internal.http2.Http2Reader r1 = r4.reader     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                r1.readConnectionPreface(r4)     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
            L_0x0007:
                okhttp3.internal.http2.Http2Reader r1 = r4.reader     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                r2 = 0
                boolean r1 = r1.nextFrame(r2, r4)     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                if (r1 == 0) goto L_0x0011
                goto L_0x0007
            L_0x0011:
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.NO_ERROR     // Catch:{ IOException -> 0x001b, all -> 0x0018 }
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x001c }
                okhttp3.internal.http2.Http2Connection r2 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ IOException -> 0x0025 }
                goto L_0x0022
            L_0x0018:
                r2 = move-exception
                r1 = r0
                goto L_0x002c
            L_0x001b:
                r1 = r0
            L_0x001c:
                okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x002b }
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x002b }
                okhttp3.internal.http2.Http2Connection r2 = okhttp3.internal.http2.Http2Connection.this
            L_0x0022:
                r2.close(r1, r0)
            L_0x0025:
                okhttp3.internal.http2.Http2Reader r0 = r4.reader
                okhttp3.internal.Util.closeQuietly(r0)
                return
            L_0x002b:
                r2 = move-exception
            L_0x002c:
                okhttp3.internal.http2.Http2Connection r3 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ IOException -> 0x0031 }
                r3.close(r1, r0)     // Catch:{ IOException -> 0x0031 }
            L_0x0031:
                okhttp3.internal.http2.Http2Reader r0 = r4.reader
                okhttp3.internal.Util.closeQuietly(r0)
                goto L_0x0038
            L_0x0037:
                throw r2
            L_0x0038:
                goto L_0x0037
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.ReaderRunnable.execute():void");
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void goAway(int i, ErrorCode errorCode, ByteString byteString) {
            Http2Stream[] http2StreamArr;
            byteString.size();
            synchronized (Http2Connection.this) {
                http2StreamArr = (Http2Stream[]) Http2Connection.this.streams.values().toArray(new Http2Stream[Http2Connection.this.streams.size()]);
                Http2Connection.this.shutdown = true;
            }
            for (Http2Stream http2Stream : http2StreamArr) {
                if (http2Stream.getId() > i && http2Stream.isLocallyInitiated()) {
                    http2Stream.receiveRstStream(ErrorCode.REFUSED_STREAM);
                    Http2Connection.this.removeStream(http2Stream.getId());
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
            r0.receiveHeaders(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
            if (r10 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
            r0.receiveFin();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        @Override // okhttp3.internal.http2.Http2Reader.Handler
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void headers(boolean r10, int r11, int r12, java.util.List<okhttp3.internal.http2.Header> r13) {
            /*
            // Method dump skipped, instructions count: 128
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.ReaderRunnable.headers(boolean, int, int, java.util.List):void");
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void ping(boolean z, int i, int i2) {
            if (z) {
                synchronized (Http2Connection.this) {
                    Http2Connection.this.awaitingPong = false;
                    Http2Connection.this.notifyAll();
                }
                return;
            }
            try {
                Http2Connection.this.writerExecutor.execute(new PingRunnable(true, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void priority(int i, int i2, int i3, boolean z) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void pushPromise(int i, int i2, List<Header> list) {
            Http2Connection.this.pushRequestLater(i2, list);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void rstStream(int i, ErrorCode errorCode) {
            if (Http2Connection.this.pushedStream(i)) {
                Http2Connection.this.pushResetLater(i, errorCode);
                return;
            }
            Http2Stream removeStream = Http2Connection.this.removeStream(i);
            if (removeStream != null) {
                removeStream.receiveRstStream(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void settings(boolean z, Settings settings) {
            Http2Stream[] http2StreamArr;
            long j;
            int i;
            synchronized (Http2Connection.this) {
                int initialWindowSize = Http2Connection.this.peerSettings.getInitialWindowSize();
                if (z) {
                    Http2Connection.this.peerSettings.clear();
                }
                Http2Connection.this.peerSettings.merge(settings);
                applyAndAckSettings(settings);
                int initialWindowSize2 = Http2Connection.this.peerSettings.getInitialWindowSize();
                http2StreamArr = null;
                if (initialWindowSize2 == -1 || initialWindowSize2 == initialWindowSize) {
                    j = 0;
                } else {
                    j = (long) (initialWindowSize2 - initialWindowSize);
                    if (!Http2Connection.this.receivedInitialPeerSettings) {
                        Http2Connection.this.receivedInitialPeerSettings = true;
                    }
                    if (!Http2Connection.this.streams.isEmpty()) {
                        http2StreamArr = (Http2Stream[]) Http2Connection.this.streams.values().toArray(new Http2Stream[Http2Connection.this.streams.size()]);
                    }
                }
                Http2Connection.listenerExecutor.execute(new NamedRunnable("OkHttp %s settings", Http2Connection.this.hostname) {
                    /* class okhttp3.internal.http2.Http2Connection.ReaderRunnable.C47822 */

                    @Override // okhttp3.internal.NamedRunnable
                    public void execute() {
                        Http2Connection http2Connection = Http2Connection.this;
                        http2Connection.listener.onSettings(http2Connection);
                    }
                });
            }
            if (!(http2StreamArr == null || j == 0)) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.addBytesToWriteWindow(j);
                    }
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void windowUpdate(int i, long j) {
            if (i == 0) {
                synchronized (Http2Connection.this) {
                    Http2Connection.this.bytesLeftInWriteWindow += j;
                    Http2Connection.this.notifyAll();
                }
                return;
            }
            Http2Stream stream = Http2Connection.this.getStream(i);
            if (stream != null) {
                synchronized (stream) {
                    stream.addBytesToWriteWindow(j);
                }
            }
        }
    }

    public Http2Connection(Builder builder) {
        this.pushObserver = builder.pushObserver;
        boolean z = builder.client;
        this.client = z;
        this.listener = builder.listener;
        int i = z ? 1 : 2;
        this.nextStreamId = i;
        if (builder.client) {
            this.nextStreamId = i + 2;
        }
        if (builder.client) {
            this.okHttpSettings.set(7, 16777216);
        }
        this.hostname = builder.hostname;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(Util.format("OkHttp %s Writer", this.hostname), false));
        this.writerExecutor = scheduledThreadPoolExecutor;
        if (builder.pingIntervalMillis != 0) {
            PingRunnable pingRunnable = new PingRunnable(false, 0, 0);
            int i2 = builder.pingIntervalMillis;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(pingRunnable, (long) i2, (long) i2, TimeUnit.MILLISECONDS);
        }
        this.pushExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory(Util.format("OkHttp %s Push Observer", this.hostname), true));
        this.peerSettings.set(7, 65535);
        this.peerSettings.set(5, 16384);
        this.bytesLeftInWriteWindow = (long) this.peerSettings.getInitialWindowSize();
        this.socket = builder.socket;
        this.writer = new Http2Writer(builder.sink, this.client);
        this.readerRunnable = new ReaderRunnable(new Http2Reader(builder.source, this.client));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void failConnection() {
        try {
            close(ErrorCode.PROTOCOL_ERROR, ErrorCode.PROTOCOL_ERROR);
        } catch (IOException unused) {
        }
    }

    private synchronized void pushExecutorExecute(NamedRunnable namedRunnable) {
        if (!isShutdown()) {
            this.pushExecutor.execute(namedRunnable);
        }
    }

    public synchronized void awaitPong() throws InterruptedException {
        while (this.awaitingPong) {
            wait();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        close(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public void flush() throws IOException {
        this.writer.flush();
    }

    public Protocol getProtocol() {
        return Protocol.HTTP_2;
    }

    public synchronized Http2Stream getStream(int i) {
        return this.streams.get(Integer.valueOf(i));
    }

    public synchronized boolean isShutdown() {
        return this.shutdown;
    }

    public synchronized int maxConcurrentStreams() {
        return this.peerSettings.getMaxConcurrentStreams(Integer.MAX_VALUE);
    }

    public Http2Stream newStream(List<Header> list, boolean z) throws IOException {
        return newStream(0, list, z);
    }

    public synchronized int openStreamCount() {
        return this.streams.size();
    }

    public void pushDataLater(final int i, oOOO000O oooo000o, final int i2, final boolean z) throws IOException {
        final OOOO000 oooo000 = new OOOO000();
        long j = (long) i2;
        oooo000o.m19764OooO0O0(j);
        oooo000o.read(oooo000, j);
        if (oooo000.OooO0o0() == j) {
            pushExecutorExecute(new NamedRunnable("OkHttp %s Push Data[%s]", new Object[]{this.hostname, Integer.valueOf(i)}) {
                /* class okhttp3.internal.http2.Http2Connection.C47785 */

                @Override // okhttp3.internal.NamedRunnable
                public void execute() {
                    try {
                        boolean onData = Http2Connection.this.pushObserver.onData(i, oooo000, i2, z);
                        if (onData) {
                            Http2Connection.this.writer.rstStream(i, ErrorCode.CANCEL);
                        }
                        if (onData || z) {
                            synchronized (Http2Connection.this) {
                                Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i));
                            }
                        }
                    } catch (IOException unused) {
                    }
                }
            });
            return;
        }
        throw new IOException(oooo000.OooO0o0() + " != " + i2);
    }

    public void pushHeadersLater(final int i, final List<Header> list, final boolean z) {
        try {
            pushExecutorExecute(new NamedRunnable("OkHttp %s Push Headers[%s]", new Object[]{this.hostname, Integer.valueOf(i)}) {
                /* class okhttp3.internal.http2.Http2Connection.C47774 */

                @Override // okhttp3.internal.NamedRunnable
                public void execute() {
                    boolean onHeaders = Http2Connection.this.pushObserver.onHeaders(i, list, z);
                    if (onHeaders) {
                        try {
                            Http2Connection.this.writer.rstStream(i, ErrorCode.CANCEL);
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    if (onHeaders || z) {
                        synchronized (Http2Connection.this) {
                            Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i));
                        }
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    public void pushRequestLater(final int i, final List<Header> list) {
        synchronized (this) {
            if (this.currentPushRequests.contains(Integer.valueOf(i))) {
                writeSynResetLater(i, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.currentPushRequests.add(Integer.valueOf(i));
            try {
                pushExecutorExecute(new NamedRunnable("OkHttp %s Push Request[%s]", new Object[]{this.hostname, Integer.valueOf(i)}) {
                    /* class okhttp3.internal.http2.Http2Connection.C47763 */

                    @Override // okhttp3.internal.NamedRunnable
                    public void execute() {
                        if (Http2Connection.this.pushObserver.onRequest(i, list)) {
                            try {
                                Http2Connection.this.writer.rstStream(i, ErrorCode.CANCEL);
                                synchronized (Http2Connection.this) {
                                    Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i));
                                }
                            } catch (IOException unused) {
                            }
                        }
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    public void pushResetLater(final int i, final ErrorCode errorCode) {
        pushExecutorExecute(new NamedRunnable("OkHttp %s Push Reset[%s]", new Object[]{this.hostname, Integer.valueOf(i)}) {
            /* class okhttp3.internal.http2.Http2Connection.C47796 */

            @Override // okhttp3.internal.NamedRunnable
            public void execute() {
                Http2Connection.this.pushObserver.onReset(i, errorCode);
                synchronized (Http2Connection.this) {
                    Http2Connection.this.currentPushRequests.remove(Integer.valueOf(i));
                }
            }
        });
    }

    public Http2Stream pushStream(int i, List<Header> list, boolean z) throws IOException {
        if (!this.client) {
            return newStream(i, list, z);
        }
        throw new IllegalStateException("Client cannot push requests.");
    }

    public boolean pushedStream(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public synchronized Http2Stream removeStream(int i) {
        Http2Stream remove;
        remove = this.streams.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public void setSettings(Settings settings) throws IOException {
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.shutdown) {
                    this.okHttpSettings.merge(settings);
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            this.writer.settings(settings);
        }
    }

    public void shutdown(ErrorCode errorCode) throws IOException {
        synchronized (this.writer) {
            synchronized (this) {
                if (!this.shutdown) {
                    this.shutdown = true;
                    this.writer.goAway(this.lastGoodStreamId, errorCode, Util.EMPTY_BYTE_ARRAY);
                }
            }
        }
    }

    public void start() throws IOException {
        start(true);
    }

    public synchronized void updateConnectionFlowControl(long j) {
        long j2 = this.unacknowledgedBytesRead + j;
        this.unacknowledgedBytesRead = j2;
        if (j2 >= ((long) (this.okHttpSettings.getInitialWindowSize() / 2))) {
            writeWindowUpdateLater(0, this.unacknowledgedBytesRead);
            this.unacknowledgedBytesRead = 0;
        }
    }

    public void writeData(int i, boolean z, OOOO000 oooo000, long j) throws IOException {
        int min;
        long j2;
        if (j == 0) {
            this.writer.data(z, i, oooo000, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (this.bytesLeftInWriteWindow <= 0) {
                    try {
                        if (this.streams.containsKey(Integer.valueOf(i))) {
                            wait();
                        } else {
                            throw new IOException("stream closed");
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j, this.bytesLeftInWriteWindow), this.writer.maxDataLength());
                j2 = (long) min;
                this.bytesLeftInWriteWindow -= j2;
            }
            j -= j2;
            this.writer.data(z && j == 0, i, oooo000, min);
        }
    }

    public void writePing(boolean z, int i, int i2) {
        boolean z2;
        if (!z) {
            synchronized (this) {
                z2 = this.awaitingPong;
                this.awaitingPong = true;
            }
            if (z2) {
                failConnection();
                return;
            }
        }
        try {
            this.writer.ping(z, i, i2);
        } catch (IOException unused) {
            failConnection();
        }
    }

    public void writePingAndAwaitPong() throws InterruptedException {
        writePing(false, 1330343787, -257978967);
        awaitPong();
    }

    public void writeSynReply(int i, boolean z, List<Header> list) throws IOException {
        this.writer.synReply(z, i, list);
    }

    public void writeSynReset(int i, ErrorCode errorCode) throws IOException {
        this.writer.rstStream(i, errorCode);
    }

    public void writeSynResetLater(final int i, final ErrorCode errorCode) {
        try {
            this.writerExecutor.execute(new NamedRunnable("OkHttp %s stream %d", new Object[]{this.hostname, Integer.valueOf(i)}) {
                /* class okhttp3.internal.http2.Http2Connection.C47741 */

                @Override // okhttp3.internal.NamedRunnable
                public void execute() {
                    try {
                        Http2Connection.this.writeSynReset(i, errorCode);
                    } catch (IOException unused) {
                        Http2Connection.this.failConnection();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    public void writeWindowUpdateLater(final int i, final long j) {
        try {
            this.writerExecutor.execute(new NamedRunnable("OkHttp Window Update %s stream %d", new Object[]{this.hostname, Integer.valueOf(i)}) {
                /* class okhttp3.internal.http2.Http2Connection.C47752 */

                @Override // okhttp3.internal.NamedRunnable
                public void execute() {
                    try {
                        Http2Connection.this.writer.windowUpdate(i, j);
                    } catch (IOException unused) {
                        Http2Connection.this.failConnection();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private okhttp3.internal.http2.Http2Stream newStream(int r11, java.util.List<okhttp3.internal.http2.Header> r12, boolean r13) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.newStream(int, java.util.List, boolean):okhttp3.internal.http2.Http2Stream");
    }

    public void close(ErrorCode errorCode, ErrorCode errorCode2) throws IOException {
        IOException e;
        Http2Stream[] http2StreamArr = null;
        try {
            shutdown(errorCode);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (!this.streams.isEmpty()) {
                http2StreamArr = (Http2Stream[]) this.streams.values().toArray(new Http2Stream[this.streams.size()]);
                this.streams.clear();
            }
        }
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.close(errorCode2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.writer.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.socket.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.writerExecutor.shutdown();
        this.pushExecutor.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public void start(boolean z) throws IOException {
        if (z) {
            this.writer.connectionPreface();
            this.writer.settings(this.okHttpSettings);
            int initialWindowSize = this.okHttpSettings.getInitialWindowSize();
            if (initialWindowSize != 65535) {
                this.writer.windowUpdate(0, (long) (initialWindowSize - 65535));
            }
        }
        new Thread(this.readerRunnable).start();
    }

    public static class Builder {
        public boolean client;
        public String hostname;
        public Listener listener = Listener.REFUSE_INCOMING_STREAMS;
        public int pingIntervalMillis;
        public PushObserver pushObserver = PushObserver.CANCEL;
        public oOOO0000 sink;
        public Socket socket;
        public oOOO000O source;

        public Builder(boolean z) {
            this.client = z;
        }

        public Http2Connection build() {
            return new Http2Connection(this);
        }

        public Builder listener(Listener listener2) {
            this.listener = listener2;
            return this;
        }

        public Builder pingIntervalMillis(int i) {
            this.pingIntervalMillis = i;
            return this;
        }

        public Builder pushObserver(PushObserver pushObserver2) {
            this.pushObserver = pushObserver2;
            return this;
        }

        public Builder socket(Socket socket2) throws IOException {
            return socket(socket2, ((InetSocketAddress) socket2.getRemoteSocketAddress()).getHostName(), C9143oooO0oOo.OooO00o(C9143oooO0oOo.m20889OooO00o(socket2)), C9143oooO0oOo.OooO00o(C9143oooO0oOo.m20887OooO00o(socket2)));
        }

        public Builder socket(Socket socket2, String str, oOOO000O oooo000o, oOOO0000 oooo0000) {
            this.socket = socket2;
            this.hostname = str;
            this.source = oooo000o;
            this.sink = oooo0000;
            return this;
        }
    }
}
