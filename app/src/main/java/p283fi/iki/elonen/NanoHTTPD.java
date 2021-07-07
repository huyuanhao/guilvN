package p283fi.iki.elonen;

import anet.channel.util.HttpConstant;
import com.google.zxing.common.StringUtils;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.p118pd.sdk.C8713oo0o0o;
import com.p118pd.sdk.C8932ooOOO0o;
import com.tencent.bugly.beta.tinker.TinkerReport;
import com.umeng.message.proguard.C3848l;
import com.umeng.message.util.HttpRequest;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.security.KeyStore;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import okhttp3.internal.http2.Http2Codec;

/* renamed from: fi.iki.elonen.NanoHTTPD */
public abstract class NanoHTTPD {
    public static final Pattern BOUNDARY_PATTERN = Pattern.compile(BOUNDARY_REGEX, 2);
    public static final String BOUNDARY_REGEX = "[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;]*)['|\"]?";
    public static final Pattern CHARSET_PATTERN = Pattern.compile(CHARSET_REGEX, 2);
    public static final String CHARSET_REGEX = "[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;]*)['|\"]?";
    public static final Pattern CONTENT_DISPOSITION_ATTRIBUTE_PATTERN = Pattern.compile(CONTENT_DISPOSITION_ATTRIBUTE_REGEX);
    public static final String CONTENT_DISPOSITION_ATTRIBUTE_REGEX = "[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]";
    public static final Pattern CONTENT_DISPOSITION_PATTERN = Pattern.compile(CONTENT_DISPOSITION_REGEX, 2);
    public static final String CONTENT_DISPOSITION_REGEX = "([ |\t]*Content-Disposition[ |\t]*:)(.*)";
    public static final Pattern CONTENT_TYPE_PATTERN = Pattern.compile(CONTENT_TYPE_REGEX, 2);
    public static final String CONTENT_TYPE_REGEX = "([ |\t]*content-type[ |\t]*:)(.*)";
    public static final Logger LOG = Logger.getLogger(NanoHTTPD.class.getName());
    public static final String MIME_HTML = "text/html";
    public static final String MIME_PLAINTEXT = "text/plain";
    public static Map<String, String> MIME_TYPES = null;
    public static final String QUERY_STRING_PARAMETER = "NanoHttpd.QUERY_STRING";
    public static final int SOCKET_READ_TIMEOUT = 5000;
    public OooO0O0 asyncRunner;
    public final String hostname;
    public final int myPort;
    public volatile ServerSocket myServerSocket;
    public Thread myThread;
    public OooOOOO serverSocketFactory;
    public AbstractC9901OooOOo tempFileManagerFactory;

    /* renamed from: fi.iki.elonen.NanoHTTPD$Method */
    public enum Method {
        GET,
        PUT,
        POST,
        DELETE,
        HEAD,
        OPTIONS,
        TRACE,
        CONNECT,
        PATCH;

        public static Method lookup(String str) {
            Method[] values = values();
            for (Method method : values) {
                if (method.toString().equalsIgnoreCase(str)) {
                    return method;
                }
            }
            return null;
        }
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$OooO */
    public static class OooO implements AbstractC9902OooOOo0 {
        public final File OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final List<AbstractC9900OooOOOo> f23833OooO00o;

        public OooO() {
            File file = new File(System.getProperty("java.io.tmpdir"));
            this.OooO00o = file;
            if (!file.exists()) {
                this.OooO00o.mkdirs();
            }
            this.f23833OooO00o = new ArrayList();
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.AbstractC9902OooOOo0
        public AbstractC9900OooOOOo OooO00o(String str) throws Exception {
            C9898OooO0oo oooO0oo = new C9898OooO0oo(this.OooO00o);
            this.f23833OooO00o.add(oooO0oo);
            return oooO0oo;
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.AbstractC9902OooOOo0
        public void clear() {
            for (AbstractC9900OooOOOo oooOOOo : this.f23833OooO00o) {
                try {
                    oooOOOo.m22096OooO00o();
                } catch (Exception e) {
                    NanoHTTPD.LOG.log(Level.WARNING, "could not delete file ", (Throwable) e);
                }
            }
            this.f23833OooO00o.clear();
        }
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$OooO0O0 */
    public interface OooO0O0 {
        void OooO00o();

        void OooO00o(OooO0OO oooO0OO);

        void OooO0O0(OooO0OO oooO0OO);
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$OooO0OO */
    public class OooO0OO implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final InputStream f23834OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Socket f23835OooO00o;

        public void OooO00o() {
            NanoHTTPD.safeClose(this.f23834OooO00o);
            NanoHTTPD.safeClose(this.f23835OooO00o);
        }

        public void run() {
            OutputStream outputStream = null;
            try {
                outputStream = this.f23835OooO00o.getOutputStream();
                OooOO0O oooOO0O = new OooOO0O(NanoHTTPD.this.tempFileManagerFactory.OooO00o(), this.f23834OooO00o, outputStream, this.f23835OooO00o.getInetAddress());
                while (!this.f23835OooO00o.isClosed()) {
                    oooOO0O.execute();
                }
            } catch (Exception e) {
                if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                    NanoHTTPD.LOG.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                }
            } catch (Throwable th) {
                NanoHTTPD.safeClose(null);
                NanoHTTPD.safeClose(this.f23834OooO00o);
                NanoHTTPD.safeClose(this.f23835OooO00o);
                NanoHTTPD.this.asyncRunner.OooO00o(this);
                throw th;
            }
            NanoHTTPD.safeClose(outputStream);
            NanoHTTPD.safeClose(this.f23834OooO00o);
            NanoHTTPD.safeClose(this.f23835OooO00o);
            NanoHTTPD.this.asyncRunner.OooO00o(this);
        }

        public OooO0OO(InputStream inputStream, Socket socket) {
            this.f23834OooO00o = inputStream;
            this.f23835OooO00o = socket;
        }
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$OooO0Oo  reason: case insensitive filesystem */
    public static class C9895OooO0Oo {
        public final String OooO00o;
        public final String OooO0O0;
        public final String OooO0OO;

        public C9895OooO0Oo(String str, String str2) {
            this(str, str2, 30);
        }

        public static String OooO00o(int i) {
            Calendar instance = Calendar.getInstance();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            instance.add(5, i);
            return simpleDateFormat.format(instance.getTime());
        }

        public C9895OooO0Oo(String str, String str2, int i) {
            this.OooO00o = str;
            this.OooO0O0 = str2;
            this.OooO0OO = OooO00o(i);
        }

        public C9895OooO0Oo(String str, String str2, String str3) {
            this.OooO00o = str;
            this.OooO0O0 = str2;
            this.OooO0OO = str3;
        }

        public String OooO00o() {
            return String.format("%s=%s; expires=%s", this.OooO00o, this.OooO0O0, this.OooO0OO);
        }
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$OooO0o */
    public static class OooO0o implements OooO0O0 {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final List<OooO0OO> f23836OooO00o = Collections.synchronizedList(new ArrayList());

        @Override // p283fi.iki.elonen.NanoHTTPD.OooO0O0
        public List<OooO0OO> OooO00o() {
            return this.f23836OooO00o;
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.OooO0O0
        public void OooO0O0(OooO0OO oooO0OO) {
            this.OooO00o++;
            Thread thread = new Thread(oooO0OO);
            thread.setDaemon(true);
            thread.setName("NanoHttpd Request Processor (#" + this.OooO00o + C3848l.f10402t);
            this.f23836OooO00o.add(oooO0OO);
            thread.start();
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.OooO0O0
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m22081OooO00o() {
            Iterator it = new ArrayList(this.f23836OooO00o).iterator();
            while (it.hasNext()) {
                ((OooO0OO) it.next()).OooO00o();
            }
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.OooO0O0
        public void OooO00o(OooO0OO oooO0OO) {
            this.f23836OooO00o.remove(oooO0OO);
        }
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$OooO0o0  reason: case insensitive filesystem */
    public class C9896OooO0o0 implements Iterable<String> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ArrayList<C9895OooO0Oo> f23837OooO00o = new ArrayList<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final HashMap<String, String> f23838OooO00o = new HashMap<>();

        public C9896OooO0o0(Map<String, String> map) {
            String str = map.get("cookie");
            if (str != null) {
                for (String str2 : str.split(C7522o0Ooo0o.OooO0O0)) {
                    String[] split = str2.trim().split(C8932ooOOO0o.OooO0Oo);
                    if (split.length == 2) {
                        this.f23838OooO00o.put(split[0], split[1]);
                    }
                }
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m22082OooO00o(String str) {
            OooO00o(str, "-delete-", -30);
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return this.f23838OooO00o.keySet().iterator();
        }

        public String OooO00o(String str) {
            return this.f23838OooO00o.get(str);
        }

        public void OooO00o(C9895OooO0Oo oooO0Oo) {
            this.f23837OooO00o.add(oooO0Oo);
        }

        public void OooO00o(String str, String str2, int i) {
            this.f23837OooO00o.add(new C9895OooO0Oo(str, str2, C9895OooO0Oo.OooO00o(i)));
        }

        public void OooO00o(Response response) {
            Iterator<C9895OooO0Oo> it = this.f23837OooO00o.iterator();
            while (it.hasNext()) {
                response.OooO00o(HttpConstant.SET_COOKIE, it.next().OooO00o());
            }
        }
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$OooO0oO  reason: case insensitive filesystem */
    public static class C9897OooO0oO implements OooOOOO {
        @Override // p283fi.iki.elonen.NanoHTTPD.OooOOOO
        public ServerSocket OooO00o() throws IOException {
            return new ServerSocket();
        }
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$OooOO0 */
    public class OooOO0 implements AbstractC9901OooOOo {
        public OooOO0() {
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.AbstractC9901OooOOo
        public AbstractC9902OooOOo0 OooO00o() {
            return new OooO();
        }
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$OooOO0O */
    public class OooOO0O implements AbstractC9899OooOO0o {
        public static final int OooO0OO = 512;
        public static final int OooO0Oo = 1024;
        public static final int OooO0o = 1024;
        public static final int OooO0o0 = 8192;
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Method f23840OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C9896OooO0o0 f23841OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9902OooOOo0 f23842OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final BufferedInputStream f23844OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OutputStream f23845OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f23846OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Map<String, String> f23847OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public String f23848OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public Map<String, String> f23849OooO0O0;

        /* renamed from: OooO0OO  reason: collision with other field name */
        public String f23850OooO0OO;

        /* renamed from: OooO0Oo  reason: collision with other field name */
        public String f23851OooO0Oo;

        public OooOO0O(AbstractC9902OooOOo0 oooOOo0, InputStream inputStream, OutputStream outputStream) {
            this.f23842OooO00o = oooOOo0;
            this.f23844OooO00o = new BufferedInputStream(inputStream, 8192);
            this.f23845OooO00o = outputStream;
        }

        private void OooO00o(BufferedReader bufferedReader, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) throws ResponseException {
            String str;
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                    if (stringTokenizer.hasMoreTokens()) {
                        map.put(AbstractC7726o0ooOOoo.OooOOo0, stringTokenizer.nextToken());
                        if (stringTokenizer.hasMoreTokens()) {
                            String nextToken = stringTokenizer.nextToken();
                            int indexOf = nextToken.indexOf(63);
                            if (indexOf >= 0) {
                                OooO00o(nextToken.substring(indexOf + 1), map2);
                                str = NanoHTTPD.decodePercent(nextToken.substring(0, indexOf));
                            } else {
                                str = NanoHTTPD.decodePercent(nextToken);
                            }
                            if (stringTokenizer.hasMoreTokens()) {
                                this.f23851OooO0Oo = stringTokenizer.nextToken();
                            } else {
                                this.f23851OooO0Oo = "HTTP/1.1";
                                NanoHTTPD.LOG.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                            }
                            String readLine2 = bufferedReader.readLine();
                            while (readLine2 != null && readLine2.trim().length() > 0) {
                                int indexOf2 = readLine2.indexOf(58);
                                if (indexOf2 >= 0) {
                                    map3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                                }
                                readLine2 = bufferedReader.readLine();
                            }
                            map.put("uri", str);
                            return;
                        }
                        throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                    }
                    throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
                }
            } catch (IOException e) {
                Response.Status status = Response.Status.INTERNAL_ERROR;
                throw new ResponseException(status, "SERVER INTERNAL ERROR: IOException: " + e.getMessage(), e);
            }
        }

        private int OooO0O0(byte[] bArr, int i) {
            while (bArr[i] != 10) {
                i++;
            }
            return i + 1;
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o
        public void execute() throws IOException {
            Response response = null;
            try {
                byte[] bArr = new byte[8192];
                boolean z = false;
                this.OooO00o = 0;
                this.OooO0O0 = 0;
                this.f23844OooO00o.mark(8192);
                try {
                    int read = this.f23844OooO00o.read(bArr, 0, 8192);
                    if (read != -1) {
                        while (read > 0) {
                            int i = this.OooO0O0 + read;
                            this.OooO0O0 = i;
                            int OooO00o2 = OooO00o(bArr, i);
                            this.OooO00o = OooO00o2;
                            if (OooO00o2 > 0) {
                                break;
                            }
                            read = this.f23844OooO00o.read(bArr, this.OooO0O0, 8192 - this.OooO0O0);
                        }
                        if (this.OooO00o < this.OooO0O0) {
                            this.f23844OooO00o.reset();
                            this.f23844OooO00o.skip((long) this.OooO00o);
                        }
                        this.f23847OooO00o = new HashMap();
                        if (this.f23849OooO0O0 == null) {
                            this.f23849OooO0O0 = new HashMap();
                        } else {
                            this.f23849OooO0O0.clear();
                        }
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.OooO0O0)));
                        HashMap hashMap = new HashMap();
                        OooO00o(bufferedReader, hashMap, this.f23847OooO00o, this.f23849OooO0O0);
                        if (this.f23850OooO0OO != null) {
                            this.f23849OooO0O0.put("remote-addr", this.f23850OooO0OO);
                            this.f23849OooO0O0.put("http-client-ip", this.f23850OooO0OO);
                        }
                        Method lookup = Method.lookup(hashMap.get(AbstractC7726o0ooOOoo.OooOOo0));
                        this.f23840OooO00o = lookup;
                        if (lookup != null) {
                            this.f23846OooO00o = hashMap.get("uri");
                            this.f23841OooO00o = new C9896OooO0o0(this.f23849OooO0O0);
                            String str = this.f23849OooO0O0.get(Http2Codec.CONNECTION);
                            boolean z2 = this.f23851OooO0Oo.equals("HTTP/1.1") && (str == null || !str.matches("(?i).*close.*"));
                            response = NanoHTTPD.this.serve(this);
                            if (response != null) {
                                String str2 = this.f23849OooO0O0.get("accept-encoding");
                                this.f23841OooO00o.OooO00o(response);
                                response.OooO00o(this.f23840OooO00o);
                                if (NanoHTTPD.this.useGzipWhenAccepted(response) && str2 != null && str2.contains("gzip")) {
                                    z = true;
                                }
                                response.OooO0O0(z);
                                response.OooO0OO(z2);
                                response.OooO00o(this.f23845OooO00o);
                                if (!z2 || "close".equalsIgnoreCase(response.OooO00o(Http2Codec.CONNECTION))) {
                                    throw new SocketException("NanoHttpd Shutdown");
                                }
                                NanoHTTPD.safeClose(response);
                                this.f23842OooO00o.clear();
                                return;
                            }
                            throw new ResponseException(Response.Status.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                        }
                        throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Syntax error.");
                    }
                    NanoHTTPD.safeClose(this.f23844OooO00o);
                    NanoHTTPD.safeClose(this.f23845OooO00o);
                    throw new SocketException("NanoHttpd Shutdown");
                } catch (Exception unused) {
                    NanoHTTPD.safeClose(this.f23844OooO00o);
                    NanoHTTPD.safeClose(this.f23845OooO00o);
                    throw new SocketException("NanoHttpd Shutdown");
                }
            } catch (SocketException e) {
                throw e;
            } catch (SocketTimeoutException e2) {
                throw e2;
            } catch (IOException e3) {
                Response.Status status = Response.Status.INTERNAL_ERROR;
                NanoHTTPD.newFixedLengthResponse(status, NanoHTTPD.MIME_PLAINTEXT, "SERVER INTERNAL ERROR: IOException: " + e3.getMessage()).OooO00o(this.f23845OooO00o);
                NanoHTTPD.safeClose(this.f23845OooO00o);
            } catch (ResponseException e4) {
                NanoHTTPD.newFixedLengthResponse(e4.getStatus(), NanoHTTPD.MIME_PLAINTEXT, e4.getMessage()).OooO00o(this.f23845OooO00o);
                NanoHTTPD.safeClose(this.f23845OooO00o);
            } catch (Throwable th) {
                NanoHTTPD.safeClose(null);
                this.f23842OooO00o.clear();
                throw th;
            }
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public final Map<String, String> m22090OooO0O0() {
            return this.f23847OooO00o;
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o
        public String OooO0O0() {
            return this.f23848OooO0O0;
        }

        public OooOO0O(AbstractC9902OooOOo0 oooOOo0, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            this.f23842OooO00o = oooOOo0;
            this.f23844OooO00o = new BufferedInputStream(inputStream, 8192);
            this.f23845OooO00o = outputStream;
            this.f23850OooO0OO = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
            this.f23849OooO0O0 = new HashMap();
        }

        private void OooO00o(String str, String str2, ByteBuffer byteBuffer, Map<String, String> map, Map<String, String> map2) throws ResponseException {
            try {
                int[] OooO00o2 = OooO00o(byteBuffer, str.getBytes());
                int i = 2;
                if (OooO00o2.length >= 2) {
                    int i2 = 1024;
                    byte[] bArr = new byte[1024];
                    int i3 = 0;
                    int i4 = 0;
                    while (i4 < OooO00o2.length - 1) {
                        byteBuffer.position(OooO00o2[i4]);
                        int remaining = byteBuffer.remaining() < i2 ? byteBuffer.remaining() : 1024;
                        byteBuffer.get(bArr, i3, remaining);
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, i3, remaining), Charset.forName(str2)), remaining);
                        if (bufferedReader.readLine().contains(str)) {
                            String readLine = bufferedReader.readLine();
                            String str3 = null;
                            String str4 = null;
                            String str5 = null;
                            int i5 = 2;
                            while (readLine != null && readLine.trim().length() > 0) {
                                Matcher matcher = NanoHTTPD.CONTENT_DISPOSITION_PATTERN.matcher(readLine);
                                if (matcher.matches()) {
                                    Matcher matcher2 = NanoHTTPD.CONTENT_DISPOSITION_ATTRIBUTE_PATTERN.matcher(matcher.group(i));
                                    while (matcher2.find()) {
                                        String group = matcher2.group(1);
                                        if (group.equalsIgnoreCase("name")) {
                                            str5 = matcher2.group(2);
                                        } else if (group.equalsIgnoreCase("filename")) {
                                            str4 = matcher2.group(2);
                                        }
                                        str4 = str4;
                                    }
                                }
                                Matcher matcher3 = NanoHTTPD.CONTENT_TYPE_PATTERN.matcher(readLine);
                                if (matcher3.matches()) {
                                    str3 = matcher3.group(2).trim();
                                }
                                readLine = bufferedReader.readLine();
                                i5++;
                                i = 2;
                            }
                            int i6 = 0;
                            while (true) {
                                int i7 = i5 - 1;
                                if (i5 <= 0) {
                                    break;
                                }
                                i6 = OooO0O0(bArr, i6);
                                i5 = i7;
                            }
                            if (i6 < remaining - 4) {
                                int i8 = OooO00o2[i4] + i6;
                                i4++;
                                int i9 = OooO00o2[i4] - 4;
                                byteBuffer.position(i8);
                                if (str3 == null) {
                                    byte[] bArr2 = new byte[(i9 - i8)];
                                    byteBuffer.get(bArr2);
                                    map.put(str5, new String(bArr2, str2));
                                } else {
                                    String OooO00o3 = OooO00o(byteBuffer, i8, i9 - i8, str4);
                                    if (!map2.containsKey(str5)) {
                                        map2.put(str5, OooO00o3);
                                    } else {
                                        int i10 = 2;
                                        while (true) {
                                            if (!map2.containsKey(str5 + i10)) {
                                                break;
                                            }
                                            i10++;
                                        }
                                        map2.put(str5 + i10, OooO00o3);
                                    }
                                    map.put(str5, str4);
                                }
                                i2 = 1024;
                                i = 2;
                                i3 = 0;
                            } else {
                                throw new ResponseException(Response.Status.INTERNAL_ERROR, "Multipart header size exceeds MAX_HEADER_SIZE.");
                            }
                        } else {
                            throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
                        }
                    }
                    return;
                }
                throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but contains less than two boundary strings.");
            } catch (ResponseException e) {
                throw e;
            } catch (Exception e2) {
                throw new ResponseException(Response.Status.INTERNAL_ERROR, e2.toString());
            }
        }

        private void OooO00o(String str, Map<String, String> map) {
            if (str == null) {
                this.f23848OooO0O0 = "";
                return;
            }
            this.f23848OooO0O0 = str;
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf >= 0) {
                    map.put(NanoHTTPD.decodePercent(nextToken.substring(0, indexOf)).trim(), NanoHTTPD.decodePercent(nextToken.substring(indexOf + 1)));
                } else {
                    map.put(NanoHTTPD.decodePercent(nextToken).trim(), "");
                }
            }
        }

        private int OooO00o(byte[] bArr, int i) {
            int i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i4 >= i) {
                    return 0;
                }
                if (bArr[i3] == 13 && bArr[i4] == 10 && (i2 = i3 + 3) < i && bArr[i3 + 2] == 13 && bArr[i2] == 10) {
                    return i3 + 4;
                }
                if (bArr[i3] == 10 && bArr[i4] == 10) {
                    return i3 + 2;
                }
                i3 = i4;
            }
        }

        private int[] OooO00o(ByteBuffer byteBuffer, byte[] bArr) {
            int[] iArr = new int[0];
            if (byteBuffer.remaining() < bArr.length) {
                return iArr;
            }
            int length = bArr.length + 4096;
            byte[] bArr2 = new byte[length];
            int remaining = byteBuffer.remaining() < length ? byteBuffer.remaining() : length;
            byteBuffer.get(bArr2, 0, remaining);
            int length2 = remaining - bArr.length;
            int i = 0;
            do {
                int i2 = 0;
                while (i2 < length2) {
                    int i3 = 0;
                    while (i3 < bArr.length && bArr2[i2 + i3] == bArr[i3]) {
                        if (i3 == bArr.length - 1) {
                            int[] iArr2 = new int[(iArr.length + 1)];
                            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                            iArr2[iArr.length] = i + i2;
                            iArr = iArr2;
                        }
                        i3++;
                    }
                    i2++;
                }
                i += length2;
                System.arraycopy(bArr2, length - bArr.length, bArr2, 0, bArr.length);
                length2 = length - bArr.length;
                if (byteBuffer.remaining() < length2) {
                    length2 = byteBuffer.remaining();
                }
                byteBuffer.get(bArr2, bArr.length, length2);
            } while (length2 > 0);
            return iArr;
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C9896OooO0o0 m22086OooO00o() {
            return this.f23841OooO00o;
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final Map<String, String> m22089OooO00o() {
            return this.f23849OooO0O0;
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final InputStream m22087OooO00o() {
            return this.f23844OooO00o;
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final Method m22085OooO00o() {
            return this.f23840OooO00o;
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o
        private RandomAccessFile OooO00o() {
            try {
                return new RandomAccessFile(this.f23842OooO00o.OooO00o(null).getName(), "rw");
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final String m22088OooO00o() {
            return this.f23846OooO00o;
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o, p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public long m22084OooO00o() {
            if (this.f23849OooO0O0.containsKey("content-length")) {
                return Long.parseLong(this.f23849OooO0O0.get("content-length"));
            }
            int i = this.OooO00o;
            int i2 = this.OooO0O0;
            if (i < i2) {
                return (long) (i2 - i);
            }
            return 0;
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.AbstractC9899OooOO0o
        public void OooO00o(Map<String, String> map) throws IOException, ResponseException {
            Throwable th;
            RandomAccessFile randomAccessFile;
            DataOutput dataOutput;
            ByteArrayOutputStream byteArrayOutputStream;
            ByteBuffer map2;
            StringTokenizer stringTokenizer;
            RandomAccessFile randomAccessFile2 = null;
            try {
                long OooO00o2 = m22084OooO00o();
                if (OooO00o2 < 1024) {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    randomAccessFile = null;
                    dataOutput = new DataOutputStream(byteArrayOutputStream);
                } else {
                    DataOutput OooO00o3 = OooO00o();
                    byteArrayOutputStream = null;
                    randomAccessFile = OooO00o3;
                    dataOutput = OooO00o3;
                }
                try {
                    byte[] bArr = new byte[512];
                    while (this.OooO0O0 >= 0 && OooO00o2 > 0) {
                        int read = this.f23844OooO00o.read(bArr, 0, (int) Math.min(OooO00o2, 512L));
                        this.OooO0O0 = read;
                        OooO00o2 -= (long) read;
                        if (read > 0) {
                            dataOutput.write(bArr, 0, read);
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        map2 = ByteBuffer.wrap(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
                    } else {
                        map2 = randomAccessFile.getChannel().map(FileChannel.MapMode.READ_ONLY, 0, randomAccessFile.length());
                        randomAccessFile.seek(0);
                    }
                    if (Method.POST.equals(this.f23840OooO00o)) {
                        String str = "";
                        String str2 = this.f23849OooO0O0.get("content-type");
                        if (str2 != null) {
                            stringTokenizer = new StringTokenizer(str2, ",; ");
                            if (stringTokenizer.hasMoreTokens()) {
                                str = stringTokenizer.nextToken();
                            }
                        } else {
                            stringTokenizer = null;
                        }
                        if (!"multipart/form-data".equalsIgnoreCase(str)) {
                            byte[] bArr2 = new byte[map2.remaining()];
                            map2.get(bArr2);
                            String trim = new String(bArr2).trim();
                            if (HttpRequest.CONTENT_TYPE_FORM.equalsIgnoreCase(str)) {
                                OooO00o(trim, this.f23847OooO00o);
                            } else if (trim.length() != 0) {
                                map.put("postData", trim);
                            }
                        } else if (stringTokenizer.hasMoreTokens()) {
                            OooO00o(OooO00o(str2, NanoHTTPD.BOUNDARY_PATTERN, null), OooO00o(str2, NanoHTTPD.CHARSET_PATTERN, "US-ASCII"), map2, this.f23847OooO00o, map);
                        } else {
                            throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but boundary missing. Usage: GET /example/file.html");
                        }
                    } else if (Method.PUT.equals(this.f23840OooO00o)) {
                        map.put("content", OooO00o(map2, 0, map2.limit(), (String) null));
                    }
                    NanoHTTPD.safeClose(randomAccessFile);
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile2 = randomAccessFile;
                    NanoHTTPD.safeClose(randomAccessFile2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                NanoHTTPD.safeClose(randomAccessFile2);
                throw th;
            }
        }

        private String OooO00o(String str, Pattern pattern, String str2) {
            Matcher matcher = pattern.matcher(str);
            return matcher.find() ? matcher.group(2) : str2;
        }

        private String OooO00o(ByteBuffer byteBuffer, int i, int i2, String str) {
            Throwable th;
            Exception e;
            if (i2 <= 0) {
                return "";
            }
            FileOutputStream fileOutputStream = null;
            try {
                AbstractC9900OooOOOo OooO00o2 = this.f23842OooO00o.OooO00o(str);
                ByteBuffer duplicate = byteBuffer.duplicate();
                FileOutputStream fileOutputStream2 = new FileOutputStream(OooO00o2.getName());
                try {
                    FileChannel channel = fileOutputStream2.getChannel();
                    duplicate.position(i).limit(i + i2);
                    channel.write(duplicate.slice());
                    String name = OooO00o2.getName();
                    NanoHTTPD.safeClose(fileOutputStream2);
                    return name;
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    try {
                        throw new Error(e);
                    } catch (Throwable th2) {
                        th = th2;
                        NanoHTTPD.safeClose(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    NanoHTTPD.safeClose(fileOutputStream);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                throw new Error(e);
            }
        }
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$OooOO0o  reason: case insensitive filesystem */
    public interface AbstractC9899OooOO0o {
        Method OooO00o();

        /* renamed from: OooO00o  reason: collision with other method in class */
        C9896OooO0o0 m22091OooO00o();

        /* renamed from: OooO00o  reason: collision with other method in class */
        InputStream m22092OooO00o();

        /* renamed from: OooO00o  reason: collision with other method in class */
        String m22093OooO00o();

        /* renamed from: OooO00o  reason: collision with other method in class */
        Map<String, String> m22094OooO00o();

        void OooO00o(Map<String, String> map) throws IOException, ResponseException;

        String OooO0O0();

        /* renamed from: OooO0O0  reason: collision with other method in class */
        Map<String, String> m22095OooO0O0();

        void execute() throws IOException;
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$OooOOO */
    public class OooOOO implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public IOException f23852OooO00o;
        public boolean OooO0O0;
        public final int o00oO0O;

        public void run() {
            try {
                NanoHTTPD.this.myServerSocket.bind(NanoHTTPD.this.hostname != null ? new InetSocketAddress(NanoHTTPD.this.hostname, NanoHTTPD.this.myPort) : new InetSocketAddress(NanoHTTPD.this.myPort));
                this.OooO0O0 = true;
                do {
                    try {
                        Socket accept = NanoHTTPD.this.myServerSocket.accept();
                        if (this.o00oO0O > 0) {
                            accept.setSoTimeout(this.o00oO0O);
                        }
                        NanoHTTPD.this.asyncRunner.OooO0O0(NanoHTTPD.this.createClientHandler(accept, accept.getInputStream()));
                    } catch (IOException e) {
                        NanoHTTPD.LOG.log(Level.FINE, "Communication with the client broken", (Throwable) e);
                    }
                } while (!NanoHTTPD.this.myServerSocket.isClosed());
            } catch (IOException e2) {
                this.f23852OooO00o = e2;
            }
        }

        public OooOOO(int i) {
            this.OooO0O0 = false;
            this.o00oO0O = i;
        }
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$OooOOO0 */
    public static class OooOOO0 implements OooOOOO {
        public SSLServerSocketFactory OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String[] f23853OooO00o;

        public OooOOO0(SSLServerSocketFactory sSLServerSocketFactory, String[] strArr) {
            this.OooO00o = sSLServerSocketFactory;
            this.f23853OooO00o = strArr;
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.OooOOOO
        public ServerSocket OooO00o() throws IOException {
            SSLServerSocket sSLServerSocket = (SSLServerSocket) this.OooO00o.createServerSocket();
            String[] strArr = this.f23853OooO00o;
            if (strArr != null) {
                sSLServerSocket.setEnabledProtocols(strArr);
            } else {
                sSLServerSocket.setEnabledProtocols(sSLServerSocket.getSupportedProtocols());
            }
            sSLServerSocket.setUseClientMode(false);
            sSLServerSocket.setWantClientAuth(false);
            sSLServerSocket.setNeedClientAuth(false);
            return sSLServerSocket;
        }
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$OooOOOO */
    public interface OooOOOO {
        ServerSocket OooO00o() throws IOException;
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$OooOOOo  reason: case insensitive filesystem */
    public interface AbstractC9900OooOOOo {
        OutputStream OooO00o() throws Exception;

        /* renamed from: OooO00o  reason: collision with other method in class */
        void m22096OooO00o() throws Exception;

        String getName();
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$OooOOo  reason: case insensitive filesystem */
    public interface AbstractC9901OooOOo {
        AbstractC9902OooOOo0 OooO00o();
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$OooOOo0  reason: case insensitive filesystem */
    public interface AbstractC9902OooOOo0 {
        AbstractC9900OooOOOo OooO00o(String str) throws Exception;

        void clear();
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$Response */
    public static class Response implements Closeable {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Method f23854OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OooO0O0 f23855OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public InputStream f23856OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Map<String, String> f23857OooO00o = new HashMap();
        public boolean OooO0O0;
        public boolean OooO0OO;
        public boolean OooO0Oo;
        public String o0ooOOo;

        /* renamed from: fi.iki.elonen.NanoHTTPD$Response$OooO00o */
        public static class OooO00o extends FilterOutputStream {
            public OooO00o(OutputStream outputStream) {
                super(outputStream);
            }

            public void OooO00o() throws IOException {
                ((FilterOutputStream) this).out.write("0\r\n\r\n".getBytes());
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(int i) throws IOException {
                write(new byte[]{(byte) i}, 0, 1);
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(byte[] bArr) throws IOException {
                write(bArr, 0, bArr.length);
            }

            @Override // java.io.OutputStream, java.io.FilterOutputStream
            public void write(byte[] bArr, int i, int i2) throws IOException {
                if (i2 != 0) {
                    ((FilterOutputStream) this).out.write(String.format("%x\r\n", Integer.valueOf(i2)).getBytes());
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                    ((FilterOutputStream) this).out.write("\r\n".getBytes());
                }
            }
        }

        /* renamed from: fi.iki.elonen.NanoHTTPD$Response$OooO0O0 */
        public interface OooO0O0 {
            String getDescription();

            int getRequestStatus();
        }

        /* renamed from: fi.iki.elonen.NanoHTTPD$Response$Status */
        public enum Status implements OooO0O0 {
            SWITCH_PROTOCOL(101, "Switching Protocols"),
            OK(200, "OK"),
            CREATED(201, "Created"),
            ACCEPTED(202, "Accepted"),
            NO_CONTENT(204, "No Content"),
            PARTIAL_CONTENT(206, "Partial Content"),
            REDIRECT(301, "Moved Permanently"),
            NOT_MODIFIED(304, "Not Modified"),
            BAD_REQUEST(400, "Bad Request"),
            UNAUTHORIZED(TinkerReport.KEY_LOADED_SUCC_COST_1000_LESS, "Unauthorized"),
            FORBIDDEN(TinkerReport.KEY_LOADED_SUCC_COST_5000_LESS, "Forbidden"),
            NOT_FOUND(404, "Not Found"),
            METHOD_NOT_ALLOWED(C8713oo0o0o.OooO0o, "Method Not Allowed"),
            NOT_ACCEPTABLE(406, "Not Acceptable"),
            REQUEST_TIMEOUT(408, "Request Timeout"),
            CONFLICT(409, "Conflict"),
            RANGE_NOT_SATISFIABLE(HttpConstant.SC_REQUESTED_RANGE_NOT_SATISFIABLE, "Requested Range Not Satisfiable"),
            INTERNAL_ERROR(500, "Internal Server Error"),
            NOT_IMPLEMENTED(C8713oo0o0o.OooO0oO, "Not Implemented"),
            UNSUPPORTED_HTTP_VERSION(C8713oo0o0o.OooOO0O, "HTTP Version Not Supported");
            
            public final String description;
            public final int requestStatus;

            /* access modifiers changed from: public */
            Status(int i, String str) {
                this.requestStatus = i;
                this.description = str;
            }

            @Override // p283fi.iki.elonen.NanoHTTPD.Response.OooO0O0
            public String getDescription() {
                return "" + this.requestStatus + " " + this.description;
            }

            @Override // p283fi.iki.elonen.NanoHTTPD.Response.OooO0O0
            public int getRequestStatus() {
                return this.requestStatus;
            }
        }

        public Response(OooO0O0 oooO0O0, String str, InputStream inputStream, long j) {
            this.f23855OooO00o = oooO0O0;
            this.o0ooOOo = str;
            boolean z = false;
            if (inputStream == null) {
                this.f23856OooO00o = new ByteArrayInputStream(new byte[0]);
                this.OooO00o = 0;
            } else {
                this.f23856OooO00o = inputStream;
                this.OooO00o = j;
            }
            this.OooO0O0 = this.OooO00o < 0 ? true : z;
            this.OooO0Oo = true;
        }

        public void OooO00o(String str, String str2) {
            this.f23857OooO00o.put(str, str2);
        }

        public InputStream OooO0O0() {
            return this.f23856OooO00o;
        }

        public void OooO0OO(boolean z) {
            this.OooO0Oo = z;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            InputStream inputStream = this.f23856OooO00o;
            if (inputStream != null) {
                inputStream.close();
            }
        }

        private void OooO0OO(OutputStream outputStream, long j) throws IOException {
            if (this.f23854OooO00o == Method.HEAD || !this.OooO0O0) {
                OooO0O0(outputStream, j);
                return;
            }
            OooO00o oooO00o = new OooO00o(outputStream);
            OooO0O0(oooO00o, -1);
            oooO00o.OooO00o();
        }

        public String OooO00o(String str) {
            for (String str2 : this.f23857OooO00o.keySet()) {
                if (str2.equalsIgnoreCase(str)) {
                    return this.f23857OooO00o.get(str2);
                }
            }
            return null;
        }

        public void OooO0O0(boolean z) {
            this.OooO0OO = z;
        }

        private void OooO0O0(OutputStream outputStream, long j) throws IOException {
            if (this.OooO0OO) {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                OooO00o(gZIPOutputStream, -1);
                gZIPOutputStream.finish();
                return;
            }
            OooO00o(outputStream, j);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m22098OooO00o() {
            return this.o0ooOOo;
        }

        public Method OooO00o() {
            return this.f23854OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public OooO0O0 m22097OooO00o() {
            return this.f23855OooO00o;
        }

        public static boolean OooO00o(Map<String, String> map, String str) {
            boolean z = false;
            for (String str2 : map.keySet()) {
                z |= str2.equalsIgnoreCase(str);
            }
            return z;
        }

        public void OooO00o(OutputStream outputStream) {
            String str = this.o0ooOOo;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            try {
                if (this.f23855OooO00o != null) {
                    PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8")), false);
                    printWriter.print("HTTP/1.1 " + this.f23855OooO00o.getDescription() + " \r\n");
                    if (str != null) {
                        printWriter.print("Content-Type: " + str + "\r\n");
                    }
                    if (this.f23857OooO00o == null || this.f23857OooO00o.get(HttpRequest.HEADER_DATE) == null) {
                        printWriter.print("Date: " + simpleDateFormat.format(new Date()) + "\r\n");
                    }
                    if (this.f23857OooO00o != null) {
                        for (String str2 : this.f23857OooO00o.keySet()) {
                            printWriter.print(str2 + ": " + this.f23857OooO00o.get(str2) + "\r\n");
                        }
                    }
                    if (!OooO00o(this.f23857OooO00o, Http2Codec.CONNECTION)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Connection: ");
                        sb.append(this.OooO0Oo ? Http2Codec.KEEP_ALIVE : "close");
                        sb.append("\r\n");
                        printWriter.print(sb.toString());
                    }
                    if (OooO00o(this.f23857OooO00o, "content-length")) {
                        this.OooO0OO = false;
                    }
                    if (this.OooO0OO) {
                        printWriter.print("Content-Encoding: gzip\r\n");
                        OooO00o(true);
                    }
                    long j = this.f23856OooO00o != null ? this.OooO00o : 0;
                    if (this.f23854OooO00o != Method.HEAD && this.OooO0O0) {
                        printWriter.print("Transfer-Encoding: chunked\r\n");
                    } else if (!this.OooO0OO) {
                        j = OooO00o(printWriter, this.f23857OooO00o, j);
                    }
                    printWriter.print("\r\n");
                    printWriter.flush();
                    OooO0OO(outputStream, j);
                    outputStream.flush();
                    NanoHTTPD.safeClose(this.f23856OooO00o);
                    return;
                }
                throw new Error("sendResponse(): Status can't be null.");
            } catch (IOException e) {
                NanoHTTPD.LOG.log(Level.SEVERE, "Could not send response to the client", (Throwable) e);
            }
        }

        private void OooO00o(OutputStream outputStream, long j) throws IOException {
            long j2;
            byte[] bArr = new byte[((int) 16384)];
            boolean z = j == -1;
            while (true) {
                if (j > 0 || z) {
                    if (z) {
                        j2 = 16384;
                    } else {
                        j2 = Math.min(j, 16384L);
                    }
                    int read = this.f23856OooO00o.read(bArr, 0, (int) j2);
                    if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        if (!z) {
                            j -= (long) read;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        public static long OooO00o(PrintWriter printWriter, Map<String, String> map, long j) {
            for (String str : map.keySet()) {
                if (str.equalsIgnoreCase("content-length")) {
                    try {
                        return Long.parseLong(map.get(str));
                    } catch (NumberFormatException unused) {
                        return j;
                    }
                }
            }
            printWriter.print("Content-Length: " + j + "\r\n");
            return j;
        }

        public void OooO00o(boolean z) {
            this.OooO0O0 = z;
        }

        public void OooO00o(InputStream inputStream) {
            this.f23856OooO00o = inputStream;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m22099OooO00o(String str) {
            this.o0ooOOo = str;
        }

        public void OooO00o(Method method) {
            this.f23854OooO00o = method;
        }

        public void OooO00o(OooO0O0 oooO0O0) {
            this.f23855OooO00o = oooO0O0;
        }
    }

    public NanoHTTPD(int i) {
        this(null, i);
    }

    public static Map<String, List<String>> decodeParameters(Map<String, String> map) {
        return decodeParameters(map.get(QUERY_STRING_PARAMETER));
    }

    public static String decodePercent(String str) {
        try {
            return URLDecoder.decode(str, StringUtils.UTF8);
        } catch (UnsupportedEncodingException e) {
            LOG.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e);
            return null;
        }
    }

    public static String getMimeTypeForFile(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        String str2 = lastIndexOf >= 0 ? mimeTypes().get(str.substring(lastIndexOf + 1).toLowerCase()) : null;
        return str2 == null ? "application/octet-stream" : str2;
    }

    public static void loadMimeTypes(Map<String, String> map, String str) {
        try {
            Enumeration<URL> resources = NanoHTTPD.class.getClassLoader().getResources(str);
            while (resources.hasMoreElements()) {
                URL nextElement = resources.nextElement();
                Properties properties = new Properties();
                InputStream inputStream = null;
                try {
                    inputStream = nextElement.openStream();
                    properties.load(nextElement.openStream());
                } catch (IOException e) {
                    Logger logger = LOG;
                    Level level = Level.SEVERE;
                    logger.log(level, "could not load mimetypes from " + nextElement, (Throwable) e);
                } catch (Throwable th) {
                    safeClose(inputStream);
                    throw th;
                }
                safeClose(inputStream);
                map.putAll(properties);
            }
        } catch (IOException unused) {
            Logger logger2 = LOG;
            Level level2 = Level.INFO;
            logger2.log(level2, "no mime types available at " + str);
        }
    }

    public static SSLServerSocketFactory makeSSLSocketFactory(KeyStore keyStore, KeyManager[] keyManagerArr) throws IOException {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(keyStore);
            SSLContext instance2 = SSLContext.getInstance("TLS");
            instance2.init(keyManagerArr, instance.getTrustManagers(), null);
            return instance2.getServerSocketFactory();
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    public static Map<String, String> mimeTypes() {
        if (MIME_TYPES == null) {
            HashMap hashMap = new HashMap();
            MIME_TYPES = hashMap;
            loadMimeTypes(hashMap, "META-INF/nanohttpd/default-mimetypes.properties");
            loadMimeTypes(MIME_TYPES, "META-INF/nanohttpd/mimetypes.properties");
            if (MIME_TYPES.isEmpty()) {
                LOG.log(Level.WARNING, "no mime types found in the classpath! please provide mimetypes.properties");
            }
        }
        return MIME_TYPES;
    }

    public static Response newChunkedResponse(Response.OooO0O0 oooO0O0, String str, InputStream inputStream) {
        return new Response(oooO0O0, str, inputStream, -1);
    }

    public static Response newFixedLengthResponse(Response.OooO0O0 oooO0O0, String str, InputStream inputStream, long j) {
        return new Response(oooO0O0, str, inputStream, j);
    }

    public static final void safeClose(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else if (obj instanceof ServerSocket) {
                    ((ServerSocket) obj).close();
                } else {
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e) {
                LOG.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    public synchronized void closeAllConnections() {
        stop();
    }

    public OooO0OO createClientHandler(Socket socket, InputStream inputStream) {
        return new OooO0OO(inputStream, socket);
    }

    public OooOOO createServerRunnable(int i) {
        return new OooOOO(i);
    }

    public String getHostname() {
        return this.hostname;
    }

    public final int getListeningPort() {
        if (this.myServerSocket == null) {
            return -1;
        }
        return this.myServerSocket.getLocalPort();
    }

    public OooOOOO getServerSocketFactory() {
        return this.serverSocketFactory;
    }

    public AbstractC9901OooOOo getTempFileManagerFactory() {
        return this.tempFileManagerFactory;
    }

    public final boolean isAlive() {
        return wasStarted() && !this.myServerSocket.isClosed() && this.myThread.isAlive();
    }

    public void makeSecure(SSLServerSocketFactory sSLServerSocketFactory, String[] strArr) {
        this.serverSocketFactory = new OooOOO0(sSLServerSocketFactory, strArr);
    }

    public Response serve(AbstractC9899OooOO0o oooOO0o) {
        HashMap hashMap = new HashMap();
        Method OooO00o2 = oooOO0o.OooO00o();
        if (Method.PUT.equals(OooO00o2) || Method.POST.equals(OooO00o2)) {
            try {
                oooOO0o.OooO00o(hashMap);
            } catch (IOException e) {
                Response.Status status = Response.Status.INTERNAL_ERROR;
                return newFixedLengthResponse(status, MIME_PLAINTEXT, "SERVER INTERNAL ERROR: IOException: " + e.getMessage());
            } catch (ResponseException e2) {
                return newFixedLengthResponse(e2.getStatus(), MIME_PLAINTEXT, e2.getMessage());
            }
        }
        Map<String, String> OooO0O02 = oooOO0o.m22095OooO0O0();
        OooO0O02.put(QUERY_STRING_PARAMETER, oooOO0o.OooO0O0());
        return serve(oooOO0o.m22093OooO00o(), OooO00o2, oooOO0o.m22094OooO00o(), OooO0O02, hashMap);
    }

    public void setAsyncRunner(OooO0O0 oooO0O0) {
        this.asyncRunner = oooO0O0;
    }

    public void setServerSocketFactory(OooOOOO oooOOOO) {
        this.serverSocketFactory = oooOOOO;
    }

    public void setTempFileManagerFactory(AbstractC9901OooOOo oooOOo) {
        this.tempFileManagerFactory = oooOOo;
    }

    public void start() throws IOException {
        start(5000);
    }

    public void stop() {
        try {
            safeClose(this.myServerSocket);
            this.asyncRunner.OooO00o();
            if (this.myThread != null) {
                this.myThread.join();
            }
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "Could not stop all connections", (Throwable) e);
        }
    }

    public boolean useGzipWhenAccepted(Response response) {
        return response.m22098OooO00o() != null && response.m22098OooO00o().toLowerCase().contains("text/");
    }

    public final boolean wasStarted() {
        return (this.myServerSocket == null || this.myThread == null) ? false : true;
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$ResponseException */
    public static final class ResponseException extends Exception {
        public static final long serialVersionUID = 6569838532917408380L;
        public final Response.Status status;

        public ResponseException(Response.Status status2, String str) {
            super(str);
            this.status = status2;
        }

        public Response.Status getStatus() {
            return this.status;
        }

        public ResponseException(Response.Status status2, String str, Exception exc) {
            super(str, exc);
            this.status = status2;
        }
    }

    public NanoHTTPD(String str, int i) {
        this.serverSocketFactory = new C9897OooO0oO();
        this.hostname = str;
        this.myPort = i;
        setTempFileManagerFactory(new OooOO0());
        setAsyncRunner(new OooO0o());
    }

    public static Map<String, List<String>> decodeParameters(String str) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                String trim = (indexOf >= 0 ? decodePercent(nextToken.substring(0, indexOf)) : decodePercent(nextToken)).trim();
                if (!hashMap.containsKey(trim)) {
                    hashMap.put(trim, new ArrayList());
                }
                String decodePercent = indexOf >= 0 ? decodePercent(nextToken.substring(indexOf + 1)) : null;
                if (decodePercent != null) {
                    ((List) hashMap.get(trim)).add(decodePercent);
                }
            }
        }
        return hashMap;
    }

    public static Response newFixedLengthResponse(Response.OooO0O0 oooO0O0, String str, String str2) {
        byte[] bArr;
        if (str2 == null) {
            return newFixedLengthResponse(oooO0O0, str, new ByteArrayInputStream(new byte[0]), 0);
        }
        try {
            bArr = str2.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            LOG.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bArr = new byte[0];
        }
        return newFixedLengthResponse(oooO0O0, str, new ByteArrayInputStream(bArr), (long) bArr.length);
    }

    public void start(int i) throws IOException {
        start(i, true);
    }

    /* renamed from: fi.iki.elonen.NanoHTTPD$OooO0oo  reason: case insensitive filesystem */
    public static class C9898OooO0oo implements AbstractC9900OooOOOo {
        public final File OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OutputStream f23839OooO00o = new FileOutputStream(this.OooO00o);

        public C9898OooO0oo(File file) throws IOException {
            this.OooO00o = File.createTempFile("NanoHTTPD-", "", file);
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.AbstractC9900OooOOOo, p283fi.iki.elonen.NanoHTTPD.AbstractC9900OooOOOo
        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m22083OooO00o() throws Exception {
            NanoHTTPD.safeClose(this.f23839OooO00o);
            if (!this.OooO00o.delete()) {
                throw new Exception("could not delete temporary file");
            }
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.AbstractC9900OooOOOo
        public String getName() {
            return this.OooO00o.getAbsolutePath();
        }

        @Override // p283fi.iki.elonen.NanoHTTPD.AbstractC9900OooOOOo, p283fi.iki.elonen.NanoHTTPD.AbstractC9900OooOOOo
        public OutputStream OooO00o() throws Exception {
            return this.f23839OooO00o;
        }
    }

    public void start(int i, boolean z) throws IOException {
        this.myServerSocket = getServerSocketFactory().OooO00o();
        this.myServerSocket.setReuseAddress(true);
        OooOOO createServerRunnable = createServerRunnable(i);
        Thread thread = new Thread(createServerRunnable);
        this.myThread = thread;
        thread.setDaemon(z);
        this.myThread.setName("NanoHttpd Main Listener");
        this.myThread.start();
        while (!createServerRunnable.OooO0O0 && createServerRunnable.f23852OooO00o == null) {
            try {
                Thread.sleep(10);
            } catch (Throwable unused) {
            }
        }
        if (createServerRunnable.f23852OooO00o != null) {
            throw createServerRunnable.f23852OooO00o;
        }
    }

    public static Response newFixedLengthResponse(String str) {
        return newFixedLengthResponse(Response.Status.OK, "text/html", str);
    }

    public static SSLServerSocketFactory makeSSLSocketFactory(KeyStore keyStore, KeyManagerFactory keyManagerFactory) throws IOException {
        try {
            return makeSSLSocketFactory(keyStore, keyManagerFactory.getKeyManagers());
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    public static SSLServerSocketFactory makeSSLSocketFactory(String str, char[] cArr) throws IOException {
        try {
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            instance.load(NanoHTTPD.class.getResourceAsStream(str), cArr);
            KeyManagerFactory instance2 = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            instance2.init(instance, cArr);
            return makeSSLSocketFactory(instance, instance2);
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    @Deprecated
    public Response serve(String str, Method method, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        return newFixedLengthResponse(Response.Status.NOT_FOUND, MIME_PLAINTEXT, "Not Found");
    }
}
