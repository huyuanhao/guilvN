package okhttp3.internal.http;

import com.p118pd.sdk.C7490o0OoOO0o;
import com.p118pd.sdk.OOOO000;
import com.xiaomi.mipush.sdk.Constants;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okio.ByteString;

public final class HttpHeaders {
    public static final ByteString QUOTED_STRING_DELIMITERS = ByteString.encodeUtf8("\"\\");
    public static final ByteString TOKEN_DELIMITERS = ByteString.encodeUtf8("\t ,=");

    public static long contentLength(Response response) {
        return contentLength(response.headers());
    }

    public static boolean hasBody(Response response) {
        if (response.request().method().equals("HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && contentLength(response) == -1 && !"chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    public static boolean hasVaryAll(Response response) {
        return hasVaryAll(response.headers());
    }

    public static void parseChallengeHeader(List<Challenge> list, OOOO000 oooo000) {
        String readToken;
        int skipAll;
        String str;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    skipWhitespaceAndCommas(oooo000);
                    str2 = readToken(oooo000);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean skipWhitespaceAndCommas = skipWhitespaceAndCommas(oooo000);
                readToken = readToken(oooo000);
                if (readToken != null) {
                    skipAll = skipAll(oooo000, (byte) 61);
                    boolean skipWhitespaceAndCommas2 = skipWhitespaceAndCommas(oooo000);
                    if (skipWhitespaceAndCommas || (!skipWhitespaceAndCommas2 && !oooo000.m16616OooO0OO())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int skipAll2 = skipAll + skipAll(oooo000, (byte) 61);
                        while (true) {
                            if (readToken == null) {
                                readToken = readToken(oooo000);
                                if (skipWhitespaceAndCommas(oooo000)) {
                                    continue;
                                    break;
                                }
                                skipAll2 = skipAll(oooo000, (byte) 61);
                            }
                            if (skipAll2 == 0) {
                                continue;
                                break;
                            } else if (skipAll2 <= 1 && !skipWhitespaceAndCommas(oooo000)) {
                                if (oooo000.m16616OooO0OO() || oooo000.OooO00o(0L) != 34) {
                                    str = readToken(oooo000);
                                } else {
                                    str = readQuotedString(oooo000);
                                }
                                if (str == null || ((String) linkedHashMap.put(readToken, str)) != null) {
                                    return;
                                }
                                if (skipWhitespaceAndCommas(oooo000) || oooo000.m16616OooO0OO()) {
                                    readToken = null;
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list.add(new Challenge(str2, linkedHashMap));
                        str2 = readToken;
                    }
                } else if (oooo000.m16616OooO0OO()) {
                    list.add(new Challenge(str2, Collections.emptyMap()));
                    return;
                } else {
                    return;
                }
            }
            list.add(new Challenge(str2, Collections.singletonMap(null, readToken + repeat(C7490o0OoOO0o.OooO00o, skipAll))));
        }
    }

    public static List<Challenge> parseChallenges(Headers headers, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < headers.size(); i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                parseChallengeHeader(arrayList, new OOOO000().OooO00o(headers.value(i)));
            }
        }
        return arrayList;
    }

    public static int parseSeconds(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static String readQuotedString(OOOO000 oooo000) {
        if (oooo000.readByte() == 34) {
            OOOO000 oooo0002 = new OOOO000();
            while (true) {
                long OooO0O0 = oooo000.OooO0O0(QUOTED_STRING_DELIMITERS);
                if (OooO0O0 == -1) {
                    return null;
                }
                if (oooo000.OooO00o(OooO0O0) == 34) {
                    oooo0002.write(oooo000, OooO0O0);
                    oooo000.readByte();
                    return oooo0002.m16606OooO0O0();
                } else if (oooo000.OooO0o0() == OooO0O0 + 1) {
                    return null;
                } else {
                    oooo0002.write(oooo000, OooO0O0);
                    oooo000.readByte();
                    oooo0002.write(oooo000, 1);
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static String readToken(OOOO000 oooo000) {
        try {
            long OooO0O0 = oooo000.OooO0O0(TOKEN_DELIMITERS);
            if (OooO0O0 == -1) {
                OooO0O0 = oooo000.OooO0o0();
            }
            if (OooO0O0 != 0) {
                return oooo000.m16607OooO0O0(OooO0O0);
            }
            return null;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public static void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        if (cookieJar != CookieJar.NO_COOKIES) {
            List<Cookie> parseAll = Cookie.parseAll(httpUrl, headers);
            if (!parseAll.isEmpty()) {
                cookieJar.saveFromResponse(httpUrl, parseAll);
            }
        }
    }

    public static String repeat(char c, int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, c);
        return new String(cArr);
    }

    public static int skipAll(OOOO000 oooo000, byte b) {
        int i = 0;
        while (!oooo000.m16616OooO0OO() && oooo000.OooO00o(0L) == b) {
            i++;
            oooo000.readByte();
        }
        return i;
    }

    public static int skipUntil(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int skipWhitespace(String str, int i) {
        while (i < str.length() && ((r0 = str.charAt(i)) == ' ' || r0 == '\t')) {
            i++;
        }
        return i;
    }

    public static boolean skipWhitespaceAndCommas(OOOO000 oooo000) {
        boolean z = false;
        while (!oooo000.m16616OooO0OO()) {
            byte OooO00o = oooo000.OooO00o(0L);
            if (OooO00o != 44) {
                if (OooO00o != 32 && OooO00o != 9) {
                    break;
                }
                oooo000.readByte();
            } else {
                oooo000.readByte();
                z = true;
            }
        }
        return z;
    }

    public static long stringToLong(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static Set<String> varyFields(Response response) {
        return varyFields(response.headers());
    }

    public static Headers varyHeaders(Response response) {
        return varyHeaders(response.networkResponse().request().headers(), response.headers());
    }

    public static boolean varyMatches(Response response, Headers headers, Request request) {
        for (String str : varyFields(response)) {
            if (!Util.equal(headers.values(str), request.headers(str))) {
                return false;
            }
        }
        return true;
    }

    public static long contentLength(Headers headers) {
        return stringToLong(headers.get("Content-Length"));
    }

    public static boolean hasVaryAll(Headers headers) {
        return varyFields(headers).contains("*");
    }

    public static Set<String> varyFields(Headers headers) {
        Set<String> emptySet = Collections.emptySet();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(headers.name(i))) {
                String value = headers.value(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
                }
                for (String str : value.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    emptySet.add(str.trim());
                }
            }
        }
        return emptySet;
    }

    public static Headers varyHeaders(Headers headers, Headers headers2) {
        Set<String> varyFields = varyFields(headers2);
        if (varyFields.isEmpty()) {
            return new Headers.Builder().build();
        }
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            if (varyFields.contains(name)) {
                builder.add(name, headers.value(i));
            }
        }
        return builder.build();
    }
}
