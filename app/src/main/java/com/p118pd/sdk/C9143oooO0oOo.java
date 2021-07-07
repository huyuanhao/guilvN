package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* renamed from: com.pd.sdk.oooO0oOo  reason: case insensitive filesystem */
public final class C9143oooO0oOo {
    public static final Logger OooO00o = Logger.getLogger(C9143oooO0oOo.class.getName());

    /* renamed from: com.pd.sdk.oooO0oOo$OooO00o */
    public class OooO00o implements AbstractC8210oOOoO0o0 {
        public final /* synthetic */ C9193oooOoo OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ OutputStream f22618OooO00o;

        public OooO00o(C9193oooOoo oooooo, OutputStream outputStream) {
            this.OooO00o = oooooo;
            this.f22618OooO00o = outputStream;
        }

        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8210oOOoO0o0, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f22618OooO00o.close();
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0, java.io.Flushable
        public void flush() throws IOException {
            this.f22618OooO00o.flush();
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
        public C9193oooOoo timeout() {
            return this.OooO00o;
        }

        public String toString() {
            return "sink(" + this.f22618OooO00o + C3848l.f10402t;
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
        public void write(OOOO000 oooo000, long j) throws IOException {
            C8976ooOOoO00.OooO00o(oooo000.f16981OooO00o, 0, j);
            while (j > 0) {
                this.OooO00o.throwIfReached();
                C8927ooOOO00o ooooo00o = oooo000.f16982OooO00o;
                int min = (int) Math.min(j, (long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o));
                this.f22618OooO00o.write(ooooo00o.f22170OooO00o, ooooo00o.OooO00o, min);
                int i = ooooo00o.OooO00o + min;
                ooooo00o.OooO00o = i;
                long j2 = (long) min;
                j -= j2;
                oooo000.f16981OooO00o -= j2;
                if (i == ooooo00o.OooO0O0) {
                    oooo000.f16982OooO00o = ooooo00o.OooO00o();
                    OOOOO0O.OooO00o(ooooo00o);
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.oooO0oOo$OooO0O0 */
    public class OooO0O0 implements AbstractC8930ooOOO0OO {
        public final /* synthetic */ C9193oooOoo OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ InputStream f22619OooO00o;

        public OooO0O0(C9193oooOoo oooooo, InputStream inputStream) {
            this.OooO00o = oooooo;
            this.f22619OooO00o = inputStream;
        }

        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8930ooOOO0OO, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f22619OooO00o.close();
        }

        @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
        public long read(OOOO000 oooo000, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            } else if (j == 0) {
                return 0;
            } else {
                try {
                    this.OooO00o.throwIfReached();
                    C8927ooOOO00o OooO00o2 = oooo000.m16590OooO00o(1);
                    int read = this.f22619OooO00o.read(OooO00o2.f22170OooO00o, OooO00o2.OooO0O0, (int) Math.min(j, (long) (8192 - OooO00o2.OooO0O0)));
                    if (read == -1) {
                        return -1;
                    }
                    OooO00o2.OooO0O0 += read;
                    long j2 = (long) read;
                    oooo000.f16981OooO00o += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (C9143oooO0oOo.OooO00o(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
        public C9193oooOoo timeout() {
            return this.OooO00o;
        }

        public String toString() {
            return "source(" + this.f22619OooO00o + C3848l.f10402t;
        }
    }

    /* renamed from: com.pd.sdk.oooO0oOo$OooO0OO */
    public class OooO0OO implements AbstractC8210oOOoO0o0 {
        @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8210oOOoO0o0, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0, java.io.Flushable
        public void flush() throws IOException {
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
        public C9193oooOoo timeout() {
            return C9193oooOoo.NONE;
        }

        @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
        public void write(OOOO000 oooo000, long j) throws IOException {
            oooo000.m16600OooO00o(j);
        }
    }

    /* renamed from: com.pd.sdk.oooO0oOo$OooO0Oo  reason: case insensitive filesystem */
    public class C9144OooO0Oo extends OooO0 {
        public final /* synthetic */ Socket OooO00o;

        public C9144OooO0Oo(Socket socket) {
            this.OooO00o = socket;
        }

        @Override // com.p118pd.sdk.OooO0
        public IOException newTimeoutException(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(C7486o0OoO0oO.f20312OooO0Oo);
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.p118pd.sdk.OooO0
        public void timedOut() {
            try {
                this.OooO00o.close();
            } catch (Exception e) {
                Logger logger = C9143oooO0oOo.OooO00o;
                Level level = Level.WARNING;
                logger.log(level, "Failed to close timed out socket " + this.OooO00o, (Throwable) e);
            } catch (AssertionError e2) {
                if (C9143oooO0oOo.OooO00o(e2)) {
                    Logger logger2 = C9143oooO0oOo.OooO00o;
                    Level level2 = Level.WARNING;
                    logger2.log(level2, "Failed to close timed out socket " + this.OooO00o, (Throwable) e2);
                    return;
                }
                throw e2;
            }
        }
    }

    public static oOOO000O OooO00o(AbstractC8930ooOOO0OO ooooo0oo) {
        return new C8925ooOOO000(ooooo0oo);
    }

    public static AbstractC8210oOOoO0o0 OooO0O0(File file) throws FileNotFoundException {
        if (file != null) {
            return OooO00o(new FileOutputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    public static oOOO0000 OooO00o(AbstractC8210oOOoO0o0 ooooo0o0) {
        return new OoOOO00(ooooo0o0);
    }

    public static AbstractC8210oOOoO0o0 OooO00o(OutputStream outputStream) {
        return OooO00o(outputStream, new C9193oooOoo());
    }

    public static AbstractC8210oOOoO0o0 OooO00o(OutputStream outputStream, C9193oooOoo oooooo) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        } else if (oooooo != null) {
            return new OooO00o(oooooo, outputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC8210oOOoO0o0 m20887OooO00o(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            OooO0 OooO00o2 = OooO00o(socket);
            return OooO00o2.sink(OooO00o(socket.getOutputStream(), OooO00o2));
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static AbstractC8930ooOOO0OO OooO00o(InputStream inputStream) {
        return OooO00o(inputStream, new C9193oooOoo());
    }

    public static AbstractC8930ooOOO0OO OooO00o(InputStream inputStream, C9193oooOoo oooooo) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (oooooo != null) {
            return new OooO0O0(oooooo, inputStream);
        } else {
            throw new IllegalArgumentException("timeout == null");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC8930ooOOO0OO m20888OooO00o(File file) throws FileNotFoundException {
        if (file != null) {
            return OooO00o(new FileInputStream(file));
        }
        throw new IllegalArgumentException("file == null");
    }

    @IgnoreJRERequirement
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC8930ooOOO0OO m20890OooO00o(Path path, OpenOption... openOptionArr) throws IOException {
        if (path != null) {
            return OooO00o(Files.newInputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    public static AbstractC8210oOOoO0o0 OooO00o(File file) throws FileNotFoundException {
        if (file != null) {
            return OooO00o(new FileOutputStream(file, true));
        }
        throw new IllegalArgumentException("file == null");
    }

    @IgnoreJRERequirement
    public static AbstractC8210oOOoO0o0 OooO00o(Path path, OpenOption... openOptionArr) throws IOException {
        if (path != null) {
            return OooO00o(Files.newOutputStream(path, openOptionArr));
        }
        throw new IllegalArgumentException("path == null");
    }

    public static AbstractC8210oOOoO0o0 OooO00o() {
        return new OooO0OO();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC8930ooOOO0OO m20889OooO00o(Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            OooO0 OooO00o2 = OooO00o(socket);
            return OooO00o2.source(OooO00o(socket.getInputStream(), OooO00o2));
        } else {
            throw new IOException("socket's input stream == null");
        }
    }

    public static OooO0 OooO00o(Socket socket) {
        return new C9144OooO0Oo(socket);
    }

    public static boolean OooO00o(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
