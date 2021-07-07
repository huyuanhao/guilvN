package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.丨II丨1  reason: invalid class name and case insensitive filesystem */
public class C9358II1 {
    public static final ThreadLocal OooO00o = new ThreadLocal();

    /* renamed from: com.pd.sdk.丨II丨1$OooO00o */
    public static class OooO00o implements PrivilegedAction {
        public final /* synthetic */ String OooO00o;

        public OooO00o(String str) {
            this.OooO00o = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            Map map = (Map) C9358II1.OooO00o.get();
            return map != null ? map.get(this.OooO00o) : System.getProperty(this.OooO00o);
        }
    }

    public static String OooO00o(String str) {
        return (String) AccessController.doPrivileged(new OooO00o(str));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static BigInteger m21420OooO00o(String str) {
        String OooO00o2 = OooO00o(str);
        if (OooO00o2 != null) {
            return new BigInteger(OooO00o2);
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Set<String> m21421OooO00o(String str) {
        HashSet hashSet = new HashSet();
        String OooO00o2 = OooO00o(str);
        if (OooO00o2 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(OooO00o2, Constants.ACCEPT_TIME_SEPARATOR_SP);
            while (stringTokenizer.hasMoreElements()) {
                hashSet.add(Strings.OooO00o(stringTokenizer.nextToken()).trim());
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21422OooO00o(String str) {
        try {
            String OooO00o2 = OooO00o(str);
            if (OooO00o2 != null) {
                return "true".equals(Strings.OooO00o(OooO00o2));
            }
        } catch (AccessControlException unused) {
        }
        return false;
    }

    public static boolean OooO00o(String str, boolean z) {
        boolean OooO00o2 = m21422OooO00o(str);
        Map map = (Map) OooO00o.get();
        if (map == null) {
            map = new HashMap();
        }
        map.put(str, z ? "true" : "false");
        OooO00o.set(map);
        return OooO00o2;
    }

    public static boolean OooO0O0(String str) {
        boolean OooO00o2 = m21422OooO00o(str);
        Map map = (Map) OooO00o.get();
        if (map == null) {
            return false;
        }
        map.remove(str);
        if (map.isEmpty()) {
            OooO00o.remove();
        } else {
            OooO00o.set(map);
        }
        return OooO00o2;
    }
}
