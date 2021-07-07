package com.p118pd.sdk;

import android.util.Pair;
import com.huawei.hianalytics.p030f.p031g.C1097f;
import com.p118pd.sdk.AbstractC8499oo000O;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oo000oOo  reason: case insensitive filesystem */
public class C8517oo000oOo {

    /* renamed from: com.pd.sdk.oo000oOo$OooO00o */
    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.huawei.hianalytics.c.b[] r0 = com.huawei.hianalytics.p029c.EnumC1096b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.p118pd.sdk.C8517oo000oOo.OooO00o.OooO00o = r0
                com.huawei.hianalytics.c.b r1 = com.huawei.hianalytics.p029c.EnumC1096b.SN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.p118pd.sdk.C8517oo000oOo.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                com.huawei.hianalytics.c.b r1 = com.huawei.hianalytics.p029c.EnumC1096b.IMEI     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.p118pd.sdk.C8517oo000oOo.OooO00o.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.huawei.hianalytics.c.b r1 = com.huawei.hianalytics.p029c.EnumC1096b.UDID     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8517oo000oOo.OooO00o.<clinit>():void");
        }
    }

    /* renamed from: com.pd.sdk.oo000oOo$OooO0O0 */
    public static class OooO0O0 implements AbstractC8499oo000O.OooO00o {
        public C8487oo000 OooO00o;

        public OooO0O0(C8487oo000 oo000) {
            this.OooO00o = oo000;
        }

        @Override // com.p118pd.sdk.AbstractC8499oo000O.OooO00o
        public void OooO00o(long j, byte[] bArr) {
            this.OooO00o.OooO0oO(String.valueOf(j));
            this.OooO00o.OooO0o(AbstractC8522oo00O000.OooO00o(bArr));
        }
    }

    public static C8491oo0000O OooO00o(String str, String str2) {
        C8491oo0000O oo0000o = new C8491oo0000O();
        OooO00o(oo0000o, str, str2);
        return oo0000o;
    }

    public static C8498oo0000oo OooO00o(List<C8492oo0000O0> list, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        C8502oo000O0o OooO00o2 = C8511oo000o0.OooO00o().m20183OooO00o();
        long OooO00o3 = OooO00o2.OooO00o();
        if (OooO00o3 == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            str6 = AbstractC8522oo00O000.OooO00o();
            str5 = C1097f.OooO00o(str6);
            OooO00o2.OooO00o(currentTimeMillis);
            OooO00o2.OooO00o(str6);
            OooO00o2.OooO0O0(str5);
        } else {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (currentTimeMillis2 - OooO00o3 > 43200000) {
                String OooO00o4 = AbstractC8522oo00O000.OooO00o();
                String OooO00o5 = C1097f.OooO00o(OooO00o4);
                OooO00o2.OooO00o(currentTimeMillis2);
                OooO00o2.OooO00o(OooO00o4);
                OooO00o2.OooO0O0(OooO00o5);
                str6 = OooO00o4;
                str5 = OooO00o5;
            } else {
                str6 = OooO00o2.m20179OooO00o();
                str5 = OooO00o2.OooO0O0();
            }
        }
        C8498oo0000oo oo0000oo = new C8498oo0000oo(str6, str2, str);
        oo0000oo.OooO00o(OooO00o(str5, str2, str, str4));
        oo0000oo.OooO00o(OooO00o(str, str2));
        oo0000oo.OooO00o(OooO00o(str, str2, str3));
        oo0000oo.OooO00o(list);
        return oo0000oo;
    }

    public static C8487oo000 OooO00o(String str, String str2, String str3, String str4) {
        String str5;
        C8487oo000 oo000 = new C8487oo000();
        oo000.OooO0OO(str);
        oo000.OooO0o0(AbstractC8453oOooOoOO.OooO0o0());
        oo000.OooO0O0(str2);
        oo000.OooO00o(str4);
        StringBuffer stringBuffer = new StringBuffer("hmshi");
        stringBuffer.append(str3);
        stringBuffer.append("qrt");
        oo000.OooO0Oo(stringBuffer.toString());
        try {
            AbstractC8499oo000O.OooO00o(oo000.OooO00o(), AbstractC8453oOooOoOO.OooO00o(C8476oOoooO0o.OooO00o().m20139OooO00o(str2, str3)), new OooO0O0(oo000));
        } catch (NoSuchAlgorithmException unused) {
            str5 = "generateHeadData(): NoSuchAlgorithmException";
        } catch (UnsatisfiedLinkError unused2) {
            str5 = "generateHeadData(): UnsatisfiedLinkError";
        }
        return oo000;
        AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/event", str5);
        return oo000;
    }

    public static C8500oo000O0 OooO00o(String str, String str2, String str3) {
        C8500oo000O0 oo000o0 = new C8500oo000O0();
        OooO00o(oo000o0, str, str2, str3);
        return oo000o0;
    }

    public static List<AbstractC8496oo0000o0> OooO00o(AbstractC8493oo0000OO[] oo0000ooArr) {
        ArrayList arrayList = new ArrayList(oo0000ooArr.length);
        for (AbstractC8493oo0000OO oo0000oo : oo0000ooArr) {
            arrayList.add(new C8497oo0000oO(oo0000oo));
        }
        return arrayList;
    }

    public static void OooO00o(C8491oo0000O oo0000o, String str, String str2) {
        String str3;
        String str4;
        if (oo0000o != null) {
            String OooO0O02 = C8476oOoooO0o.OooO00o().OooO0O0(str2, str);
            C8473oOoooO0 OooO00o2 = C8476oOoooO0o.OooO00o().m20136OooO00o(str2, str);
            int i = OooO00o.OooO00o[OooO00o2.OooO00o().ordinal()];
            String str5 = "";
            if (i == 1) {
                str3 = OooO00o2.m20133OooO00o();
                str4 = str5;
            } else if (i == 2) {
                str3 = str5;
                str5 = OooO00o2.m20133OooO00o();
                str4 = str3;
            } else if (i != 3) {
                str4 = str5;
                str3 = str4;
            } else {
                str4 = OooO00o2.m20133OooO00o();
                str3 = str5;
            }
            oo0000o.OooO00o(OooO0O02);
            oo0000o.OooO0OO(AbstractC8453oOooOoOO.OooO00o(C8476oOoooO0o.OooO00o().m20139OooO00o(str2, str)));
            oo0000o.OooO0O0(str5);
            oo0000o.OooO0Oo(C8476oOoooO0o.OooO00o().m20138OooO00o(str2, str));
            String OooO00o3 = AbstractC8454oOooOoOo.m20101OooO00o(str2, str);
            oo0000o.OooO0o0(str4);
            oo0000o.OooO0oO(str3);
            oo0000o.OooO0o(OooO00o3);
        }
    }

    public static void OooO00o(C8500oo000O0 oo000o0, String str, String str2, String str3) {
        oo000o0.OooO0OO(AbstractC8453oOooOoOO.m20098OooO0O0());
        Pair<String, String> OooO00o2 = C8476oOoooO0o.OooO00o().OooO00o(str2, str);
        oo000o0.OooO0o((String) OooO00o2.first);
        oo000o0.OooO0oO((String) OooO00o2.second);
        oo000o0.OooO0Oo(AbstractC8453oOooOoOO.OooO0Oo());
        oo000o0.OooO0o0(str3);
        oo000o0.OooO0O0(C8476oOoooO0o.OooO00o().OooO0OO(str2, str));
        oo000o0.OooO00o(C8476oOoooO0o.OooO00o().OooO0Oo(str2, str));
    }
}
