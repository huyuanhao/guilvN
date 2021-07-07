package okhttp3;

import com.umeng.message.util.HttpRequest;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;
import okhttp3.internal.Util;

public final class Challenge {
    public final Map<String, String> authParams;
    public final String scheme;

    public Challenge(String str, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        } else if (map != null) {
            this.scheme = str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey() == null ? null : entry.getKey().toLowerCase(Locale.US), entry.getValue());
            }
            this.authParams = Collections.unmodifiableMap(linkedHashMap);
        } else {
            throw new NullPointerException("authParams == null");
        }
    }

    public Map<String, String> authParams() {
        return this.authParams;
    }

    public Charset charset() {
        String str = this.authParams.get(HttpRequest.PARAM_CHARSET);
        if (str != null) {
            try {
                return Charset.forName(str);
            } catch (Exception unused) {
            }
        }
        return Util.ISO_8859_1;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            return challenge.scheme.equals(this.scheme) && challenge.authParams.equals(this.authParams);
        }
    }

    public int hashCode() {
        return ((899 + this.scheme.hashCode()) * 31) + this.authParams.hashCode();
    }

    public String realm() {
        return this.authParams.get("realm");
    }

    public String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }

    public Challenge withCharset(Charset charset) {
        if (charset != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.authParams);
            linkedHashMap.put(HttpRequest.PARAM_CHARSET, charset.name());
            return new Challenge(this.scheme, linkedHashMap);
        }
        throw new NullPointerException("charset == null");
    }

    public Challenge(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        } else if (str2 != null) {
            this.scheme = str;
            this.authParams = Collections.singletonMap("realm", str2);
        } else {
            throw new NullPointerException("realm == null");
        }
    }
}
