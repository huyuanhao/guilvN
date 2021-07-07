package com.p118pd.sdk;

import com.p118pd.sdk.IIiLIli;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.IL11L丨  reason: invalid class name */
public class IL11L {
    public static AbstractC9754II OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Hashtable f15528OooO00o = new Hashtable();
    public static final Hashtable OooO0O0 = new Hashtable();
    public static final Hashtable OooO0OO = new Hashtable();

    /* renamed from: com.pd.sdk.IL11L丨$OooO00o */
    public static class OooO00o extends AbstractC9754II {
        @Override // com.p118pd.sdk.AbstractC9754II
        public C9387Iill OooO00o() {
            BigInteger OooO0O0 = IL11L.OooO0O0("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger OooO0O02 = IL11L.OooO0O0("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger OooO0O03 = IL11L.OooO0O0("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            BigInteger OooO0O04 = IL11L.OooO0O0("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger valueOf = BigInteger.valueOf(1);
            IIiLIli OooO0O05 = IL11L.OooO0O0(new IIiLIli.OooO0o(OooO0O0, OooO0O02, OooO0O03, OooO0O04, valueOf));
            return new C9387Iill(OooO0O05, new C6147iL1(OooO0O05, C6472l1l1l.OooO00o("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB")), OooO0O04, valueOf, (byte[]) null);
        }
    }

    static {
        OooO00o("FRP256v1", AbstractC5589L1ii1.OooO00o, OooO00o);
    }

    public static LlLI1 OooO00o(String str) {
        return (LlLI1) f15528OooO00o.get(Strings.OooO00o(str));
    }

    public static C9387Iill OooO00o(LlLI1 llLI1) {
        AbstractC9754II r1 = (AbstractC9754II) OooO0O0.get(llLI1);
        if (r1 == null) {
            return null;
        }
        return r1.OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C9387Iill m15467OooO00o(String str) {
        LlLI1 OooO00o2 = OooO00o(str);
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o(OooO00o2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m15468OooO00o(LlLI1 llLI1) {
        return (String) OooO0OO.get(llLI1);
    }

    public static Enumeration OooO00o() {
        return OooO0OO.elements();
    }

    public static void OooO00o(String str, LlLI1 llLI1, AbstractC9754II r4) {
        f15528OooO00o.put(Strings.OooO00o(str), llLI1);
        OooO0OO.put(llLI1, str);
        OooO0O0.put(llLI1, r4);
    }

    public static IIiLIli OooO0O0(IIiLIli r0) {
        return r0;
    }

    public static BigInteger OooO0O0(String str) {
        return new BigInteger(1, C6472l1l1l.OooO00o(str));
    }
}
