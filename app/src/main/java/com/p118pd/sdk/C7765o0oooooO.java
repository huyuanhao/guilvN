package com.p118pd.sdk;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.o0oooooO  reason: case insensitive filesystem */
public final class C7765o0oooooO implements AbstractC9099ooo0Oo0 {
    public final Map<String, List<AbstractC7763o0ooooo>> OooO00o;
    public volatile Map<String, String> OooO0O0;

    /* renamed from: com.pd.sdk.o0oooooO$OooO00o */
    public static final class OooO00o {
        public static final String OooO00o = "User-Agent";
        public static final String OooO0O0 = OooO00o();

        /* renamed from: OooO0O0  reason: collision with other field name */
        public static final Map<String, List<AbstractC7763o0ooooo>> f20791OooO0O0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Map<String, List<AbstractC7763o0ooooo>> f20792OooO00o = f20791OooO0O0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f20793OooO00o = true;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f20794OooO0O0 = true;

        static {
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(OooO0O0)) {
                hashMap.put("User-Agent", Collections.singletonList(new OooO0O0(OooO0O0)));
            }
            f20791OooO0O0 = Collections.unmodifiableMap(hashMap);
        }

        public OooO00o OooO00o(String str, String str2) {
            return OooO00o(str, new OooO0O0(str2));
        }

        public OooO00o OooO0O0(String str, String str2) {
            return OooO0O0(str, str2 == null ? null : new OooO0O0(str2));
        }

        public OooO00o OooO00o(String str, AbstractC7763o0ooooo o0ooooo) {
            if (this.f20794OooO0O0 && "User-Agent".equalsIgnoreCase(str)) {
                return OooO0O0(str, o0ooooo);
            }
            m19413OooO00o();
            OooO00o(str).add(o0ooooo);
            return this;
        }

        public OooO00o OooO0O0(String str, AbstractC7763o0ooooo o0ooooo) {
            m19413OooO00o();
            if (o0ooooo == null) {
                this.f20792OooO00o.remove(str);
            } else {
                List<AbstractC7763o0ooooo> OooO00o2 = OooO00o(str);
                OooO00o2.clear();
                OooO00o2.add(o0ooooo);
            }
            if (this.f20794OooO0O0 && "User-Agent".equalsIgnoreCase(str)) {
                this.f20794OooO0O0 = false;
            }
            return this;
        }

        private List<AbstractC7763o0ooooo> OooO00o(String str) {
            List<AbstractC7763o0ooooo> list = this.f20792OooO00o.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f20792OooO00o.put(str, arrayList);
            return arrayList;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        private void m19413OooO00o() {
            if (this.f20793OooO00o) {
                this.f20793OooO00o = false;
                this.f20792OooO00o = m19412OooO00o();
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public C7765o0oooooO m19414OooO00o() {
            this.f20793OooO00o = true;
            return new C7765o0oooooO(this.f20792OooO00o);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        private Map<String, List<AbstractC7763o0ooooo>> m19412OooO00o() {
            HashMap hashMap = new HashMap(this.f20792OooO00o.size());
            for (Map.Entry<String, List<AbstractC7763o0ooooo>> entry : this.f20792OooO00o.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
            }
            return hashMap;
        }

        @VisibleForTesting
        public static String OooO00o() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }
    }

    /* renamed from: com.pd.sdk.o0oooooO$OooO0O0 */
    public static final class OooO0O0 implements AbstractC7763o0ooooo {
        public final String OooO00o;

        public OooO0O0(String str) {
            this.OooO00o = str;
        }

        @Override // com.p118pd.sdk.AbstractC7763o0ooooo
        public String OooO00o() {
            return this.OooO00o;
        }

        public boolean equals(Object obj) {
            if (obj instanceof OooO0O0) {
                return this.OooO00o.equals(((OooO0O0) obj).OooO00o);
            }
            return false;
        }

        public int hashCode() {
            return this.OooO00o.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.OooO00o + '\'' + '}';
        }
    }

    public C7765o0oooooO(Map<String, List<AbstractC7763o0ooooo>> map) {
        this.OooO00o = Collections.unmodifiableMap(map);
    }

    private Map<String, String> OooO0O0() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<AbstractC7763o0ooooo>> entry : this.OooO00o.entrySet()) {
            String OooO00o2 = OooO00o(entry.getValue());
            if (!TextUtils.isEmpty(OooO00o2)) {
                hashMap.put(entry.getKey(), OooO00o2);
            }
        }
        return hashMap;
    }

    @Override // com.p118pd.sdk.AbstractC9099ooo0Oo0
    public Map<String, String> OooO00o() {
        if (this.OooO0O0 == null) {
            synchronized (this) {
                if (this.OooO0O0 == null) {
                    this.OooO0O0 = Collections.unmodifiableMap(OooO0O0());
                }
            }
        }
        return this.OooO0O0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7765o0oooooO) {
            return this.OooO00o.equals(((C7765o0oooooO) obj).OooO00o);
        }
        return false;
    }

    public int hashCode() {
        return this.OooO00o.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.OooO00o + '}';
    }

    @NonNull
    private String OooO00o(@NonNull List<AbstractC7763o0ooooo> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String OooO00o2 = list.get(i).OooO00o();
            if (!TextUtils.isEmpty(OooO00o2)) {
                sb.append(OooO00o2);
                if (i != list.size() - 1) {
                    sb.append(AbstractC1299b.COMMA);
                }
            }
        }
        return sb.toString();
    }
}
