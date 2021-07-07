package com.p118pd.sdk;

import com.tencent.bugly.beta.tinker.TinkerReport;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.est.ESTException;
import org.bouncycastle.est.HttpUtil;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.IliLIL  reason: case insensitive filesystem */
public class C5460IliLIL implements AbstractC6371iIIll {
    public static final AbstractC6092iILIii OooO00o = new C6056i1I();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Set<String> f15869OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6290ii f15870OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f15871OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SecureRandom f15872OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final char[] f15873OooO00o;
    public final String OooO0O0;

    /* renamed from: com.pd.sdk.IliLIL$OooO00o */
    public class OooO00o implements AbstractC5174I1Ii {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC5174I1Ii
        public C6860liLi OooO00o(C6773llLi r7, C111 r8) throws IOException {
            C6860liLi r0 = new C6860liLi(r7, r8);
            if (r0.OooO00o() != 401) {
                return r0;
            }
            String OooO00o2 = r0.OooO00o("WWW-Authenticate");
            if (OooO00o2 != null) {
                String OooO00o3 = Strings.OooO00o(OooO00o2);
                if (OooO00o3.startsWith(AbstractC9852lIli.OooO0O0)) {
                    return C5460IliLIL.this.OooO00o((C5460IliLIL) r0);
                }
                if (OooO00o3.startsWith("basic")) {
                    r0.m18013OooO00o();
                    Map<String, String> OooO00o4 = HttpUtil.OooO00o("Basic", r0.OooO00o("WWW-Authenticate"));
                    if (C5460IliLIL.this.f15871OooO00o == null || C5460IliLIL.this.f15871OooO00o.equals(OooO00o4.get("realm"))) {
                        C6820lI1ii OooO00o5 = new C6820lI1ii(r7).OooO00o((AbstractC5174I1Ii) null);
                        if (C5460IliLIL.this.f15871OooO00o != null && C5460IliLIL.this.f15871OooO00o.length() > 0) {
                            OooO00o5.OooO0O0("WWW-Authenticate", "Basic realm=\"" + C5460IliLIL.this.f15871OooO00o + "\"");
                        }
                        if (!C5460IliLIL.this.OooO0O0.contains(Constants.COLON_SEPARATOR)) {
                            char[] cArr = new char[(C5460IliLIL.this.OooO0O0.length() + 1 + C5460IliLIL.this.f15873OooO00o.length)];
                            System.arraycopy(C5460IliLIL.this.OooO0O0.toCharArray(), 0, cArr, 0, C5460IliLIL.this.OooO0O0.length());
                            cArr[C5460IliLIL.this.OooO0O0.length()] = ':';
                            System.arraycopy(C5460IliLIL.this.f15873OooO00o, 0, cArr, C5460IliLIL.this.OooO0O0.length() + 1, C5460IliLIL.this.f15873OooO00o.length);
                            OooO00o5.OooO0O0("Authorization", "Basic " + C6808lllI.OooO00o(Strings.OooO00o(cArr)));
                            C6860liLi OooO00o6 = r7.m17891OooO00o().OooO00o(OooO00o5.OooO00o());
                            C9586iIILl.OooO00o(cArr, (char) 0);
                            return OooO00o6;
                        }
                        throw new IllegalArgumentException("User must not contain a ':'");
                    }
                    throw new ESTException("Supplied realm '" + C5460IliLIL.this.f15871OooO00o + "' does not match server realm '" + OooO00o4.get("realm") + "'", null, TinkerReport.KEY_LOADED_SUCC_COST_1000_LESS, null);
                }
                throw new ESTException("Unknown auth mode: " + OooO00o3);
            }
            throw new ESTException("Status of 401 but no WWW-Authenticate header");
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("realm");
        hashSet.add("nonce");
        hashSet.add("opaque");
        hashSet.add("algorithm");
        hashSet.add("qop");
        f15869OooO00o = Collections.unmodifiableSet(hashSet);
    }

    public C5460IliLIL(String str, String str2, char[] cArr) {
        this(str, str2, cArr, null, null);
    }

    public C5460IliLIL(String str, String str2, char[] cArr, SecureRandom secureRandom, AbstractC6290ii r5) {
        this.f15871OooO00o = str;
        this.OooO0O0 = str2;
        this.f15873OooO00o = cArr;
        this.f15872OooO00o = secureRandom;
        this.f15870OooO00o = r5;
    }

    public C5460IliLIL(String str, char[] cArr) {
        this(null, str, cArr, null, null);
    }

    public C5460IliLIL(String str, char[] cArr, SecureRandom secureRandom, AbstractC6290ii r10) {
        this(null, str, cArr, secureRandom, r10);
    }

    private C6456l1ilL OooO00o(String str) {
        if (str.endsWith("-SESS")) {
            str = str.substring(0, str.length() - 5);
        }
        return str.equals("SHA-512-256") ? new C6456l1ilL(AbstractC5905LllI.OooO0oo, C6452l1Lll.OooO00o) : OooO00o.OooO00o(str);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private C6860liLi OooO00o(C6860liLi r25) throws IOException {
        String str;
        String str2;
        r25.m18013OooO00o();
        C6773llLi OooO00o2 = r25.m18007OooO00o();
        try {
            Map<String, String> OooO00o3 = HttpUtil.OooO00o("Digest", r25.OooO00o("WWW-Authenticate"));
            try {
                String path = OooO00o2.m17893OooO00o().toURI().getPath();
                for (String str3 : OooO00o3.keySet()) {
                    if (!f15869OooO00o.contains(str3)) {
                        throw new ESTException("Unrecognised entry in WWW-Authenticate header: '" + ((Object) str3) + "'");
                    }
                }
                String OooO00o4 = OooO00o2.m17892OooO00o();
                String str4 = OooO00o3.get("realm");
                String str5 = OooO00o3.get("nonce");
                String str6 = OooO00o3.get("opaque");
                String str7 = "algorithm";
                String str8 = OooO00o3.get(str7);
                String str9 = "qop";
                String str10 = OooO00o3.get(str9);
                ArrayList arrayList = new ArrayList();
                String str11 = this.f15871OooO00o;
                if (str11 == null || str11.equals(str4)) {
                    if (str8 == null) {
                        str8 = "MD5";
                    }
                    if (str8.length() != 0) {
                        String OooO0O02 = Strings.OooO0O0(str8);
                        if (str10 == null) {
                            throw new ESTException("Qop is not defined in WWW-Authenticate header.");
                        } else if (str10.length() != 0) {
                            String[] split = Strings.OooO00o(str10).split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                            int i = 0;
                            while (i != split.length) {
                                if (split[i].equals("auth") || split[i].equals("auth-int")) {
                                    String trim = split[i].trim();
                                    if (!arrayList.contains(trim)) {
                                        arrayList.add(trim);
                                    }
                                    i++;
                                    str7 = str7;
                                    str9 = str9;
                                } else {
                                    throw new ESTException("QoP value unknown: '" + i + "'");
                                }
                            }
                            C6456l1ilL OooO00o5 = OooO00o(OooO0O02);
                            if (OooO00o5 == null || OooO00o5.OooO00o() == null) {
                                throw new IOException("auth digest algorithm unknown: " + OooO0O02);
                            }
                            I111LIL OooO00o6 = OooO00o(OooO0O02, OooO00o5);
                            OutputStream OooO00o7 = OooO00o6.m21370OooO00o();
                            String OooO00o8 = OooO00o(10);
                            OooO00o(OooO00o7, this.OooO0O0);
                            OooO00o(OooO00o7, Constants.COLON_SEPARATOR);
                            OooO00o(OooO00o7, str4);
                            OooO00o(OooO00o7, Constants.COLON_SEPARATOR);
                            OooO00o(OooO00o7, this.f15873OooO00o);
                            OooO00o7.close();
                            byte[] OooO00o9 = OooO00o6.m21371OooO00o();
                            if (OooO0O02.endsWith("-SESS")) {
                                I111LIL OooO00o10 = OooO00o(OooO0O02, OooO00o5);
                                OutputStream OooO00o11 = OooO00o10.m21370OooO00o();
                                OooO00o(OooO00o11, C6472l1l1l.OooO00o(OooO00o9));
                                OooO00o(OooO00o11, Constants.COLON_SEPARATOR);
                                OooO00o(OooO00o11, str5);
                                OooO00o(OooO00o11, Constants.COLON_SEPARATOR);
                                OooO00o(OooO00o11, OooO00o8);
                                OooO00o11.close();
                                OooO00o9 = OooO00o10.m21371OooO00o();
                            }
                            String OooO00o12 = C6472l1l1l.OooO00o(OooO00o9);
                            I111LIL OooO00o13 = OooO00o(OooO0O02, OooO00o5);
                            OutputStream OooO00o14 = OooO00o13.m21370OooO00o();
                            if (((String) arrayList.get(0)).equals("auth-int")) {
                                I111LIL OooO00o15 = OooO00o(OooO0O02, OooO00o5);
                                str = "auth-int";
                                OutputStream OooO00o16 = OooO00o15.m21370OooO00o();
                                OooO00o2.OooO00o(OooO00o16);
                                OooO00o16.close();
                                byte[] OooO00o17 = OooO00o15.m21371OooO00o();
                                OooO00o(OooO00o14, OooO00o4);
                                OooO00o(OooO00o14, Constants.COLON_SEPARATOR);
                                OooO00o(OooO00o14, path);
                                OooO00o(OooO00o14, Constants.COLON_SEPARATOR);
                                OooO00o(OooO00o14, C6472l1l1l.OooO00o(OooO00o17));
                            } else {
                                str = "auth-int";
                                if (((String) arrayList.get(0)).equals("auth")) {
                                    OooO00o(OooO00o14, OooO00o4);
                                    OooO00o(OooO00o14, Constants.COLON_SEPARATOR);
                                    OooO00o(OooO00o14, path);
                                }
                            }
                            OooO00o14.close();
                            String OooO00o18 = C6472l1l1l.OooO00o(OooO00o13.m21371OooO00o());
                            I111LIL OooO00o19 = OooO00o(OooO0O02, OooO00o5);
                            OutputStream OooO00o20 = OooO00o19.m21370OooO00o();
                            boolean contains = arrayList.contains("missing");
                            OooO00o(OooO00o20, OooO00o12);
                            OooO00o(OooO00o20, Constants.COLON_SEPARATOR);
                            OooO00o(OooO00o20, str5);
                            OooO00o(OooO00o20, Constants.COLON_SEPARATOR);
                            if (contains) {
                                OooO00o(OooO00o20, OooO00o18);
                                str2 = str;
                            } else {
                                OooO00o(OooO00o20, "00000001");
                                OooO00o(OooO00o20, Constants.COLON_SEPARATOR);
                                OooO00o(OooO00o20, OooO00o8);
                                OooO00o(OooO00o20, Constants.COLON_SEPARATOR);
                                str2 = str;
                                if (((String) arrayList.get(0)).equals(str2)) {
                                    OooO00o(OooO00o20, str2);
                                } else {
                                    OooO00o(OooO00o20, "auth");
                                }
                                OooO00o(OooO00o20, Constants.COLON_SEPARATOR);
                                OooO00o(OooO00o20, OooO00o18);
                            }
                            OooO00o20.close();
                            String OooO00o21 = C6472l1l1l.OooO00o(OooO00o19.m21371OooO00o());
                            HashMap hashMap = new HashMap();
                            hashMap.put("username", this.OooO0O0);
                            hashMap.put("realm", str4);
                            hashMap.put("nonce", str5);
                            hashMap.put("uri", path);
                            hashMap.put("response", OooO00o21);
                            if (((String) arrayList.get(0)).equals(str2)) {
                                hashMap.put(str9, str2);
                            } else {
                                if (((String) arrayList.get(0)).equals("auth")) {
                                    hashMap.put(str9, "auth");
                                }
                                hashMap.put(str7, OooO0O02);
                                if (str6 == null || str6.length() == 0) {
                                    hashMap.put("opaque", OooO00o(20));
                                }
                                C6820lI1ii OooO00o22 = new C6820lI1ii(OooO00o2).OooO00o((AbstractC5174I1Ii) null);
                                OooO00o22.OooO0O0("Authorization", HttpUtil.OooO00o("Digest", hashMap));
                                return OooO00o2.m17891OooO00o().OooO00o(OooO00o22.OooO00o());
                            }
                            hashMap.put("nc", "00000001");
                            hashMap.put("cnonce", OooO00o8);
                            hashMap.put(str7, OooO0O02);
                            hashMap.put("opaque", OooO00o(20));
                            C6820lI1ii OooO00o222 = new C6820lI1ii(OooO00o2).OooO00o((AbstractC5174I1Ii) null);
                            OooO00o222.OooO0O0("Authorization", HttpUtil.OooO00o("Digest", hashMap));
                            return OooO00o2.m17891OooO00o().OooO00o(OooO00o222.OooO00o());
                        } else {
                            throw new ESTException("QoP value is empty.");
                        }
                    } else {
                        throw new ESTException("WWW-Authenticate no algorithm defined.");
                    }
                } else {
                    throw new ESTException("Supplied realm '" + this.f15871OooO00o + "' does not match server realm '" + str4 + "'", null, TinkerReport.KEY_LOADED_SUCC_COST_1000_LESS, null);
                }
            } catch (Exception e) {
                throw new IOException("unable to process URL in request: " + e.getMessage());
            }
        } catch (Throwable th) {
            throw new ESTException("Parsing WWW-Authentication header: " + th.getMessage(), th, r25.OooO00o(), new ByteArrayInputStream(r25.OooO00o("WWW-Authenticate").getBytes()));
        }
    }

    private I111LIL OooO00o(String str, C6456l1ilL r5) throws IOException {
        try {
            return this.f15870OooO00o.OooO00o(r5);
        } catch (OperatorCreationException e) {
            throw new IOException("cannot create digest calculator for " + str + ": " + e.getMessage());
        }
    }

    private String OooO00o(int i) {
        byte[] bArr = new byte[i];
        this.f15872OooO00o.nextBytes(bArr);
        return C6472l1l1l.OooO00o(bArr);
    }

    private void OooO00o(OutputStream outputStream, String str) throws IOException {
        outputStream.write(Strings.m22987OooO0O0(str));
    }

    private void OooO00o(OutputStream outputStream, char[] cArr) throws IOException {
        outputStream.write(Strings.OooO0O0(cArr));
    }

    @Override // com.p118pd.sdk.AbstractC6371iIIll
    public void OooO00o(C6820lI1ii r2) {
        r2.OooO00o(new OooO00o());
    }
}
