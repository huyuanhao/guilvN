package okhttp3.internal;

import com.p118pd.sdk.AbstractC8930ooOOO0OO;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.p118pd.sdk.OOOO000;
import com.p118pd.sdk.oOOO000O;
import com.umeng.message.proguard.C3817f;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okio.ByteString;

public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final RequestBody EMPTY_REQUEST = RequestBody.create((MediaType) null, EMPTY_BYTE_ARRAY);
    public static final ResponseBody EMPTY_RESPONSE;
    public static final String[] EMPTY_STRING_ARRAY = new String[0];
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    public static final Comparator<String> NATURAL_ORDER = new Comparator<String>() {
        /* class okhttp3.internal.Util.C47641 */

        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    };
    public static final TimeZone UTC = TimeZone.getTimeZone("GMT");
    public static final Charset UTF_16_BE = Charset.forName(C3817f.f10342d);
    public static final ByteString UTF_16_BE_BOM = ByteString.decodeHex("feff");
    public static final Charset UTF_16_LE = Charset.forName(C3817f.f10343e);
    public static final ByteString UTF_16_LE_BOM = ByteString.decodeHex("fffe");
    public static final Charset UTF_32_BE = Charset.forName("UTF-32BE");
    public static final ByteString UTF_32_BE_BOM = ByteString.decodeHex("0000ffff");
    public static final Charset UTF_32_LE = Charset.forName("UTF-32LE");
    public static final ByteString UTF_32_LE_BOM = ByteString.decodeHex("ffff0000");
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final ByteString UTF_8_BOM = ByteString.decodeHex("efbbbf");
    public static final Pattern VERIFY_AS_IP_ADDRESS = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    public static final Method addSuppressedExceptionMethod;

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        Method method = null;
        EMPTY_RESPONSE = ResponseBody.create((MediaType) null, bArr);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        addSuppressedExceptionMethod = method;
    }

    public static void addSuppressedIfPossible(Throwable th, Throwable th2) {
        Method method = addSuppressedExceptionMethod;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static AssertionError assertionError(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static Charset bomAwareCharset(oOOO000O oooo000o, Charset charset) throws IOException {
        if (oooo000o.OooO00o(0, UTF_8_BOM)) {
            oooo000o.m19759OooO00o((long) UTF_8_BOM.size());
            return UTF_8;
        } else if (oooo000o.OooO00o(0, UTF_16_BE_BOM)) {
            oooo000o.m19759OooO00o((long) UTF_16_BE_BOM.size());
            return UTF_16_BE;
        } else if (oooo000o.OooO00o(0, UTF_16_LE_BOM)) {
            oooo000o.m19759OooO00o((long) UTF_16_LE_BOM.size());
            return UTF_16_LE;
        } else if (oooo000o.OooO00o(0, UTF_32_BE_BOM)) {
            oooo000o.m19759OooO00o((long) UTF_32_BE_BOM.size());
            return UTF_32_BE;
        } else if (!oooo000o.OooO00o(0, UTF_32_LE_BOM)) {
            return charset;
        } else {
            oooo000o.m19759OooO00o((long) UTF_32_LE_BOM.size());
            return UTF_32_LE;
        }
    }

    public static String canonicalizeHost(String str) {
        InetAddress inetAddress;
        if (str.contains(Constants.COLON_SEPARATOR)) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = decodeIpv6(str, 0, str.length());
            } else {
                inetAddress = decodeIpv6(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                return inet6AddressToAscii(address);
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !containsInvalidHostnameAsciiCodes(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int checkDuration(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException(str + " < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            } else if (millis != 0 || j <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException(str + " too small.");
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public static void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static String[] concat(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    public static boolean containsInvalidHostnameAsciiCodes(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int decodeHexDigit(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public static boolean decodeIpv4Suffix(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + charAt) - 48) > 255) {
                    return false;
                } else {
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        if (i4 != i3 + 4) {
            return false;
        }
        return true;
    }

    @Nullable
    public static InetAddress decodeIpv6(String str, int i, int i2) {
        byte[] bArr = new byte[16];
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            if (i >= i2) {
                break;
            } else if (i3 == 16) {
                return null;
            } else {
                int i6 = i + 2;
                if (i6 > i2 || !str.regionMatches(i, "::", 0, 2)) {
                    if (i3 != 0) {
                        if (str.regionMatches(i, Constants.COLON_SEPARATOR, 0, 1)) {
                            i++;
                        } else if (!str.regionMatches(i, C9058ooOoOoOO.OooOO0, 0, 1) || !decodeIpv4Suffix(str, i5, i2, bArr, i3 - 2)) {
                            return null;
                        } else {
                            i3 += 2;
                        }
                    }
                    i5 = i;
                } else if (i4 != -1) {
                    return null;
                } else {
                    i3 += 2;
                    i4 = i3;
                    if (i6 == i2) {
                        break;
                    }
                    i5 = i6;
                }
                i = i5;
                int i7 = 0;
                while (i < i2) {
                    int decodeHexDigit = decodeHexDigit(str.charAt(i));
                    if (decodeHexDigit == -1) {
                        break;
                    }
                    i7 = (i7 << 4) + decodeHexDigit;
                    i++;
                }
                int i8 = i - i5;
                if (i8 == 0 || i8 > 4) {
                    return null;
                }
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((i7 >>> 8) & 255);
                i3 = i9 + 1;
                bArr[i9] = (byte) (i7 & 255);
            }
        }
        if (i3 != 16) {
            if (i4 == -1) {
                return null;
            }
            int i10 = i3 - i4;
            System.arraycopy(bArr, i4, bArr, 16 - i10, i10);
            Arrays.fill(bArr, i4, (16 - i3) + i4, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public static int delimiterOffset(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean discard(AbstractC8930ooOOO0OO ooooo0oo, int i, TimeUnit timeUnit) {
        try {
            return skipAll(ooooo0oo, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean equal(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String format(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String hostHeader(HttpUrl httpUrl, boolean z) {
        String str;
        if (httpUrl.host().contains(Constants.COLON_SEPARATOR)) {
            str = "[" + httpUrl.host() + "]";
        } else {
            str = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.defaultPort(httpUrl.scheme())) {
            return str;
        }
        return str + Constants.COLON_SEPARATOR + httpUrl.port();
    }

    public static <T> List<T> immutableList(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <K, V> Map<K, V> immutableMap(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static int indexOf(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfControlOrNonAscii(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    public static String inet6AddressToAscii(byte[] bArr) {
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i2 = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        OOOO000 oooo000 = new OOOO000();
        while (i < bArr.length) {
            if (i == i2) {
                oooo000.OooO0o0(58);
                i += i4;
                if (i == 16) {
                    oooo000.OooO0o0(58);
                }
            } else {
                if (i > 0) {
                    oooo000.OooO0o0(58);
                }
                oooo000.OooO00o((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                i += 2;
            }
        }
        return oooo000.m16606OooO0O0();
    }

    public static String[] intersect(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean isAndroidGetsocknameError(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean nonEmptyIntersection(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static X509TrustManager platformTrustManager() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
        } catch (GeneralSecurityException e) {
            throw assertionError("No System TLS", e);
        }
    }

    public static boolean skipAll(AbstractC8930ooOOO0OO ooooo0oo, int i, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = ooooo0oo.timeout().hasDeadline() ? ooooo0oo.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        ooooo0oo.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            OOOO000 oooo000 = new OOOO000();
            while (ooooo0oo.read(oooo000, 8192) != -1) {
                oooo000.m16610OooO0O0();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                ooooo0oo.timeout().clearDeadline();
            } else {
                ooooo0oo.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                ooooo0oo.timeout().clearDeadline();
            } else {
                ooooo0oo.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                ooooo0oo.timeout().clearDeadline();
            } else {
                ooooo0oo.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    public static int skipLeadingAsciiWhitespace(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int skipTrailingAsciiWhitespace(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (!(charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ')) {
                return i3 + 1;
            }
        }
        return i;
    }

    public static ThreadFactory threadFactory(final String str, final boolean z) {
        return new ThreadFactory() {
            /* class okhttp3.internal.Util.ThreadFactoryC47652 */

            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, str);
                thread.setDaemon(z);
                return thread;
            }
        };
    }

    public static Headers toHeaders(List<Header> list) {
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            Internal.instance.addLenient(builder, header.name.utf8(), header.value.utf8());
        }
        return builder.build();
    }

    public static String trimSubstring(String str, int i, int i2) {
        int skipLeadingAsciiWhitespace = skipLeadingAsciiWhitespace(str, i, i2);
        return str.substring(skipLeadingAsciiWhitespace, skipTrailingAsciiWhitespace(str, skipLeadingAsciiWhitespace, i2));
    }

    public static boolean verifyAsIpAddress(String str) {
        return VERIFY_AS_IP_ADDRESS.matcher(str).matches();
    }

    public static int delimiterOffset(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static <T> List<T> immutableList(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static void closeQuietly(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!isAndroidGetsocknameError(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void closeQuietly(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
