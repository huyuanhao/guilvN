package com.p118pd.sdk;

import com.p118pd.sdk.IIllii;
import java.security.Permission;
import java.security.spec.DSAParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.II11II */
public class II11II implements AbstractC9477LILlL {
    public static Permission OooO00o = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, l1I1L.o00o0O);
    public static Permission OooO0O0 = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, l1I1L.o00ooo);
    public static Permission OooO0OO = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, l1I1L.oo000o);
    public static Permission OooO0Oo = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, l1I1L.o00oO0o);
    public static Permission OooO0o = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, l1I1L.o0ooOO0);
    public static Permission OooO0o0 = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, l1I1L.o00oO0O);

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile C6106iIiIl f15435OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile Object f15436OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ThreadLocal f15437OooO00o = new ThreadLocal();

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile Map f15438OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile Set f15439OooO00o = new HashSet();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public ThreadLocal f15440OooO0O0 = new ThreadLocal();

    @Override // com.p118pd.sdk.AbstractC9477LILlL, com.p118pd.sdk.AbstractC9477LILlL, com.p118pd.sdk.AbstractC9477LILlL
    public C6106iIiIl OooO00o() {
        C6106iIiIl iiiil = (C6106iIiIl) this.f15437OooO00o.get();
        return iiiil != null ? iiiil : this.f15435OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC9477LILlL, com.p118pd.sdk.AbstractC9477LILlL
    public DSAParameterSpec OooO00o(int i) {
        L1llLl1 l1llLl1 = (L1llLl1) IIllii.OooO00o(IIllii.OooO0O0.OooO0OO, i);
        if (l1llLl1 != null) {
            return new DSAParameterSpec(l1llLl1.OooO0O0(), l1llLl1.OooO0OO(), l1llLl1.m15991OooO00o());
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC9477LILlL, com.p118pd.sdk.AbstractC9477LILlL, com.p118pd.sdk.AbstractC9477LILlL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map m15349OooO00o() {
        return Collections.unmodifiableMap(this.f15438OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9477LILlL, com.p118pd.sdk.AbstractC9477LILlL, com.p118pd.sdk.AbstractC9477LILlL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set m15350OooO00o() {
        return Collections.unmodifiableSet(this.f15439OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9477LILlL, com.p118pd.sdk.AbstractC9477LILlL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public DHParameterSpec m15351OooO00o(int i) {
        Object obj = this.f15440OooO0O0.get();
        if (obj == null) {
            obj = this.f15436OooO00o;
        }
        if (obj instanceof DHParameterSpec) {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) obj;
            if (dHParameterSpec.getP().bitLength() == i) {
                return dHParameterSpec;
            }
        } else if (obj instanceof DHParameterSpec[]) {
            DHParameterSpec[] dHParameterSpecArr = (DHParameterSpec[]) obj;
            for (int i2 = 0; i2 != dHParameterSpecArr.length; i2++) {
                if (dHParameterSpecArr[i2].getP().bitLength() == i) {
                    return dHParameterSpecArr[i2];
                }
            }
        }
        C6017i1Il i1il = (C6017i1Il) IIllii.OooO00o(IIllii.OooO0O0.OooO0O0, i);
        if (i1il != null) {
            return new C5194I1(i1il);
        }
        return null;
    }

    public void OooO00o(String str, Object obj) {
        ThreadLocal threadLocal;
        SecurityManager securityManager = System.getSecurityManager();
        if (str.equals(l1I1L.o00o0O)) {
            if (securityManager != null) {
                securityManager.checkPermission(OooO00o);
            }
            C6106iIiIl OooO00o2 = ((obj instanceof C6106iIiIl) || obj == null) ? (C6106iIiIl) obj : C6631lLlI.OooO00o((ECParameterSpec) obj, false);
            if (OooO00o2 == null) {
                threadLocal = this.f15437OooO00o;
            } else {
                this.f15437OooO00o.set(OooO00o2);
                return;
            }
        } else if (str.equals(l1I1L.o00ooo)) {
            if (securityManager != null) {
                securityManager.checkPermission(OooO0O0);
            }
            if ((obj instanceof C6106iIiIl) || obj == null) {
                this.f15435OooO00o = (C6106iIiIl) obj;
                return;
            } else {
                this.f15435OooO00o = C6631lLlI.OooO00o((ECParameterSpec) obj, false);
                return;
            }
        } else if (str.equals(l1I1L.oo000o)) {
            if (securityManager != null) {
                securityManager.checkPermission(OooO0OO);
            }
            if ((obj instanceof DHParameterSpec) || (obj instanceof DHParameterSpec[]) || obj == null) {
                threadLocal = this.f15440OooO0O0;
                if (obj != null) {
                    threadLocal.set(obj);
                    return;
                }
            } else {
                throw new IllegalArgumentException("not a valid DHParameterSpec");
            }
        } else if (str.equals(l1I1L.o00oO0o)) {
            if (securityManager != null) {
                securityManager.checkPermission(OooO0Oo);
            }
            if ((obj instanceof DHParameterSpec) || (obj instanceof DHParameterSpec[]) || obj == null) {
                this.f15436OooO00o = obj;
                return;
            }
            throw new IllegalArgumentException("not a valid DHParameterSpec or DHParameterSpec[]");
        } else if (str.equals(l1I1L.o00oO0O)) {
            if (securityManager != null) {
                securityManager.checkPermission(OooO0o0);
            }
            this.f15439OooO00o = (Set) obj;
            return;
        } else if (str.equals(l1I1L.o0ooOO0)) {
            if (securityManager != null) {
                securityManager.checkPermission(OooO0o);
            }
            this.f15438OooO00o = (Map) obj;
            return;
        } else {
            return;
        }
        threadLocal.remove();
    }
}
