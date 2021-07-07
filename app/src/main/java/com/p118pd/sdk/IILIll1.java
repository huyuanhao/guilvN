package com.p118pd.sdk;

import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

/* renamed from: com.pd.sdk.IILI丨ll1  reason: invalid class name */
public class IILIll1 {
    public static final Class OooO00o = C6443l1Il.OooO00o(IILIll1.class, "javax.crypto.spec.GCMParameterSpec");

    public static IlLLII1I OooO00o(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        try {
            return new IlLLII1I((byte[]) OooO00o.getDeclaredMethod("getIV", new Class[0]).invoke(algorithmParameterSpec, new Object[0]), ((Integer) OooO00o.getDeclaredMethod("getTLen", new Class[0]).invoke(algorithmParameterSpec, new Object[0])).intValue() / 8);
        } catch (Exception unused) {
            throw new InvalidParameterSpecException("Cannot process GCMParameterSpec");
        }
    }

    public static AlgorithmParameterSpec OooO00o(AbstractC6122iIlLiL iillil) throws InvalidParameterSpecException {
        try {
            IlLLII1I OooO00o2 = IlLLII1I.OooO00o(iillil);
            return (AlgorithmParameterSpec) OooO00o.getConstructor(Integer.TYPE, byte[].class).newInstance(I11I.OooO00o(OooO00o2.OooO0O0() * 8), OooO00o2.OooO00o());
        } catch (NoSuchMethodException unused) {
            throw new InvalidParameterSpecException("No constructor found!");
        } catch (Exception e) {
            throw new InvalidParameterSpecException("Construction failed: " + e.getMessage());
        }
    }

    public static boolean OooO00o() {
        return OooO00o != null;
    }

    public static boolean OooO00o(Class cls) {
        return OooO00o == cls;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m15378OooO00o(AlgorithmParameterSpec algorithmParameterSpec) {
        Class cls = OooO00o;
        return cls != null && cls.isInstance(algorithmParameterSpec);
    }
}
