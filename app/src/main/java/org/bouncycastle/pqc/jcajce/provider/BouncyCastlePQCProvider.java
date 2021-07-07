package org.bouncycastle.pqc.jcajce.provider;

import com.p118pd.sdk.AbstractC5416IilI;
import com.p118pd.sdk.AbstractC9477LILlL;
import com.p118pd.sdk.C5464IlilIi;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.p118pd.sdk.II1ii1;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.l1I1L;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

public class BouncyCastlePQCProvider extends Provider implements l1I1L {
    public static final AbstractC9477LILlL CONFIGURATION = null;
    public static final Map OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String[] f23983OooO00o = {"Rainbow", "McEliece", "SPHINCS", "NH", "XMSS"};
    public static String PROVIDER_NAME = "BCPQC";
    public static String o0ooOOo = "BouncyCastle Post-Quantum Security Provider v1.60";
    public static final String o0ooOoO = "org.bouncycastle.pqc.jcajce.provider.";

    public class OooO00o implements PrivilegedAction {
        public OooO00o() {
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            BouncyCastlePQCProvider.this.OooO0O0();
            return null;
        }
    }

    public static class OooO0O0 implements PrivilegedAction {
        public final /* synthetic */ String OooO00o;

        public OooO0O0(String str) {
            this.OooO00o = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            try {
                return Class.forName(this.OooO00o);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public BouncyCastlePQCProvider() {
        super(PROVIDER_NAME, 1.6d, o0ooOOo);
        AccessController.doPrivileged(new OooO00o());
    }

    public static AbstractC5416IilI OooO00o(LlLI1 llLI1) {
        AbstractC5416IilI r2;
        synchronized (OooO00o) {
            r2 = (AbstractC5416IilI) OooO00o.get(llLI1);
        }
        return r2;
    }

    private void OooO00o(String str, String[] strArr) {
        for (int i = 0; i != strArr.length; i++) {
            Class loadClass = loadClass(BouncyCastlePQCProvider.class, str + strArr[i] + "$Mappings");
            if (loadClass != null) {
                try {
                    ((II1ii1) loadClass.newInstance()).OooO00o(this);
                } catch (Exception e) {
                    throw new InternalError("cannot create instance of " + str + strArr[i] + "$Mappings : " + e);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0O0() {
        OooO00o(o0ooOoO, f23983OooO00o);
    }

    public static PrivateKey getPrivateKey(C5464IlilIi r1) throws IOException {
        AbstractC5416IilI OooO00o2 = OooO00o(r1.m15707OooO0O0().OooO00o());
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o2.OooO00o(r1);
    }

    public static PublicKey getPublicKey(C6888ll r1) throws IOException {
        AbstractC5416IilI OooO00o2 = OooO00o(r1.m18041OooO00o().OooO00o());
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o2.OooO00o(r1);
    }

    public static Class loadClass(Class cls, String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new OooO0O0(str));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // com.p118pd.sdk.l1I1L
    public void addAlgorithm(String str, LlLI1 llLI1, String str2) {
        if (containsKey(str + C9058ooOoOoOO.OooOO0 + str2)) {
            addAlgorithm(str + C9058ooOoOoOO.OooOO0 + llLI1, str2);
            addAlgorithm(str + ".OID." + llLI1, str2);
            return;
        }
        throw new IllegalStateException("primary key (" + str + C9058ooOoOoOO.OooOO0 + str2 + ") not found");
    }

    @Override // com.p118pd.sdk.l1I1L
    public void addAlgorithm(String str, String str2) {
        if (!containsKey(str)) {
            put(str, str2);
            return;
        }
        throw new IllegalStateException("duplicate provider key (" + str + ") found");
    }

    @Override // com.p118pd.sdk.l1I1L
    public void addAttributes(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            String str3 = str + " " + str2;
            if (!containsKey(str3)) {
                put(str3, map.get(str2));
            } else {
                throw new IllegalStateException("duplicate provider attribute key (" + str3 + ") found");
            }
        }
    }

    @Override // com.p118pd.sdk.l1I1L
    public void addKeyInfoConverter(LlLI1 llLI1, AbstractC5416IilI r4) {
        synchronized (OooO00o) {
            OooO00o.put(llLI1, r4);
        }
    }

    @Override // com.p118pd.sdk.l1I1L
    public boolean hasAlgorithm(String str, String str2) {
        if (!containsKey(str + C9058ooOoOoOO.OooOO0 + str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Alg.Alias.");
            sb.append(str);
            sb.append(C9058ooOoOoOO.OooOO0);
            sb.append(str2);
            return containsKey(sb.toString());
        }
    }

    @Override // com.p118pd.sdk.l1I1L
    public void setParameter(String str, Object obj) {
        synchronized (CONFIGURATION) {
        }
    }
}
