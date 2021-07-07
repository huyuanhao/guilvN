package com.p118pd.sdk;

import com.p118pd.sdk.IIiLIli;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.IllIli1 */
public class IllIli1 {
    public static AbstractC9754II OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Hashtable f15894OooO00o = new Hashtable();
    public static AbstractC9754II OooO0O0 = new OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Hashtable f15895OooO0O0 = new Hashtable();
    public static final Hashtable OooO0OO = new Hashtable();

    /* renamed from: com.pd.sdk.IllIli1$OooO00o */
    public static class OooO00o extends AbstractC9754II {
        @Override // com.p118pd.sdk.AbstractC9754II
        public C9387Iill OooO00o() {
            BigInteger OooO0O0 = IllIli1.OooO0O0("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            BigInteger OooO0O02 = IllIli1.OooO0O0("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            BigInteger OooO0O03 = IllIli1.OooO0O0("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            BigInteger OooO0O04 = IllIli1.OooO0O0("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            BigInteger valueOf = BigInteger.valueOf(1);
            IIiLIli OooO0O05 = IllIli1.OooO0O0(new IIiLIli.OooO0o(OooO0O0, OooO0O02, OooO0O03, OooO0O04, valueOf));
            return new C9387Iill(OooO0O05, new C6147iL1(OooO0O05, C6472l1l1l.OooO00o("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0")), OooO0O04, valueOf, (byte[]) null);
        }
    }

    /* renamed from: com.pd.sdk.IllIli1$OooO0O0 */
    public static class OooO0O0 extends AbstractC9754II {
        @Override // com.p118pd.sdk.AbstractC9754II
        public C9387Iill OooO00o() {
            BigInteger OooO0O0 = IllIli1.OooO0O0("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            BigInteger OooO0O02 = IllIli1.OooO0O0("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            BigInteger OooO0O03 = IllIli1.OooO0O0("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            BigInteger OooO0O04 = IllIli1.OooO0O0("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            BigInteger valueOf = BigInteger.valueOf(1);
            IIiLIli OooO0O05 = IllIli1.OooO0O0(new IIiLIli.OooO0o(OooO0O0, OooO0O02, OooO0O03, OooO0O04, valueOf));
            return new C9387Iill(OooO0O05, new C6147iL1(OooO0O05, C6472l1l1l.OooO00o("044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2")), OooO0O04, valueOf, (byte[]) null);
        }
    }

    static {
        OooO00o("wapip192v1", AbstractC6041i1l.Oooo0O0, OooO0O0);
        OooO00o("sm2p256v1", AbstractC6041i1l.Oooo000, OooO00o);
    }

    public static LlLI1 OooO00o(String str) {
        return (LlLI1) f15894OooO00o.get(Strings.OooO00o(str));
    }

    public static C9387Iill OooO00o(LlLI1 llLI1) {
        AbstractC9754II r1 = (AbstractC9754II) f15895OooO0O0.get(llLI1);
        if (r1 == null) {
            return null;
        }
        return r1.OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C9387Iill m15709OooO00o(String str) {
        LlLI1 OooO00o2 = OooO00o(str);
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o(OooO00o2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m15710OooO00o(LlLI1 llLI1) {
        return (String) OooO0OO.get(llLI1);
    }

    public static Enumeration OooO00o() {
        return OooO0OO.elements();
    }

    public static void OooO00o(String str, LlLI1 llLI1, AbstractC9754II r4) {
        f15894OooO00o.put(Strings.OooO00o(str), llLI1);
        OooO0OO.put(llLI1, str);
        f15895OooO0O0.put(llLI1, r4);
    }

    public static IIiLIli OooO0O0(IIiLIli r0) {
        return r0;
    }

    public static BigInteger OooO0O0(String str) {
        return new BigInteger(1, C6472l1l1l.OooO00o(str));
    }
}
