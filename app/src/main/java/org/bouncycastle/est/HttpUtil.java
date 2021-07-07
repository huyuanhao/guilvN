package org.bouncycastle.est;

import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;
import com.p118pd.sdk.C7490o0OoOO0o;
import com.p118pd.sdk.C8318oOo0oooo;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class HttpUtil {

    public static class Headers extends HashMap<String, String[]> {
        private String OooO00o(String str) {
            if (containsKey(str)) {
                return str;
            }
            for (String str2 : keySet()) {
                if (str.equalsIgnoreCase(str2)) {
                    return str2;
                }
            }
            return null;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        private boolean m22960OooO00o(String str) {
            return OooO00o(str) != null;
        }

        private String[] OooO00o(String[] strArr) {
            int length = strArr.length;
            String[] strArr2 = new String[length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            return strArr2;
        }

        public void add(String str, String str2) {
            put(str, HttpUtil.OooO00o((String[]) get(str), str2));
        }

        @Override // java.util.AbstractMap, java.lang.Object
        public Object clone() {
            Headers headers = new Headers();
            for (Map.Entry entry : entrySet()) {
                headers.put((String) entry.getKey(), OooO00o((String[]) entry.getValue()));
            }
            return headers;
        }

        public void ensureHeader(String str, String str2) {
            if (!containsKey(str)) {
                set(str, str2);
            }
        }

        public String getFirstValue(String str) {
            String[] values = getValues(str);
            if (values == null || values.length <= 0) {
                return null;
            }
            return values[0];
        }

        public String[] getValues(String str) {
            String OooO00o = OooO00o(str);
            if (OooO00o == null) {
                return null;
            }
            return (String[]) get(OooO00o);
        }

        public void set(String str, String str2) {
            put(str, new String[]{str2});
        }
    }

    public static class OooO00o {
        public int OooO00o = 0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final String f23892OooO00o;
        public int OooO0O0 = 0;

        public OooO00o(String str) {
            this.f23892OooO00o = str;
        }

        private String OooO00o() {
            char charAt = this.f23892OooO00o.charAt(this.OooO0O0);
            while (this.OooO0O0 < this.f23892OooO00o.length() && ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                int i = this.OooO0O0 + 1;
                this.OooO0O0 = i;
                charAt = this.f23892OooO00o.charAt(i);
            }
            String substring = this.f23892OooO00o.substring(this.OooO00o, this.OooO0O0);
            this.OooO00o = this.OooO0O0;
            return substring;
        }

        private String OooO00o(char c) {
            while (this.OooO0O0 < this.f23892OooO00o.length() && this.f23892OooO00o.charAt(this.OooO0O0) != c) {
                this.OooO0O0++;
            }
            String substring = this.f23892OooO00o.substring(this.OooO00o, this.OooO0O0);
            this.OooO00o = this.OooO0O0;
            return substring;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        private void m22961OooO00o() {
            this.OooO00o = this.OooO0O0;
        }

        private void OooO00o(int i) {
            int i2 = this.OooO0O0 + i;
            this.OooO0O0 = i2;
            this.OooO00o = i2;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        private boolean m22962OooO00o(char c) {
            if (this.OooO0O0 >= this.f23892OooO00o.length() || this.f23892OooO00o.charAt(this.OooO0O0) != c) {
                return false;
            }
            this.OooO0O0++;
            return true;
        }

        private void OooO0O0() {
            while (this.OooO0O0 < this.f23892OooO00o.length() && this.f23892OooO00o.charAt(this.OooO0O0) < '!') {
                this.OooO0O0++;
            }
            this.OooO00o = this.OooO0O0;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Map<String, String> m22963OooO00o() {
            HashMap hashMap = new HashMap();
            while (this.OooO0O0 < this.f23892OooO00o.length()) {
                OooO0O0();
                String OooO00o2 = OooO00o();
                if (OooO00o2.length() != 0) {
                    OooO0O0();
                    if (m22962OooO00o(C7490o0OoOO0o.OooO00o)) {
                        OooO0O0();
                        if (m22962OooO00o(C8318oOo0oooo.OooO00o)) {
                            m22961OooO00o();
                            String OooO00o3 = OooO00o(C8318oOo0oooo.OooO00o);
                            OooO00o(1);
                            hashMap.put(OooO00o2, OooO00o3);
                            OooO0O0();
                            if (!m22962OooO00o(AbstractC1299b.COMMA)) {
                                break;
                            }
                            m22961OooO00o();
                        } else {
                            throw new IllegalArgumentException("Expecting start quote: '\"'");
                        }
                    } else {
                        throw new IllegalArgumentException("Expecting assign: '='");
                    }
                } else {
                    throw new IllegalArgumentException("Expecting alpha label.");
                }
            }
            return hashMap;
        }
    }

    public static String OooO00o(String str, Map<String, String> map) {
        StringWriter stringWriter = new StringWriter();
        stringWriter.write(str);
        stringWriter.write(32);
        boolean z = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!z) {
                z = true;
            } else {
                stringWriter.write(44);
            }
            stringWriter.write(entry.getKey());
            stringWriter.write("=\"");
            stringWriter.write(entry.getValue());
            stringWriter.write(34);
        }
        return stringWriter.toString();
    }

    public static Map<String, String> OooO00o(String str, String str2) {
        String trim = str2.trim();
        if (trim.startsWith(str)) {
            trim = trim.substring(str.length());
        }
        return new OooO00o(trim).m22963OooO00o();
    }

    public static String[] OooO00o(String[] strArr, String str) {
        if (strArr == null) {
            return new String[]{str};
        }
        int length = strArr.length;
        String[] strArr2 = new String[(length + 1)];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        strArr2[length] = str;
        return strArr2;
    }
}
