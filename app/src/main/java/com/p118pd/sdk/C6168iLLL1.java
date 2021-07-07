package com.p118pd.sdk;

import anet.channel.util.HttpConstant;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.cert.X509AttributeCertificateHolder;

/* renamed from: com.pd.sdk.iLLL1  reason: case insensitive filesystem */
public class C6168iLLL1 {
    public static final String OooO0OO = "1.3.6.1.4.1.8005.100.100.4";
    public String OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f17720OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public X509AttributeCertificateHolder f17721OooO00o;
    public String OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public List f17722OooO0O0 = new ArrayList();

    /* renamed from: com.pd.sdk.iLLL1$OooO00o */
    public class OooO00o {

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f17723OooO00o;
        public String OooO0O0;
        public String OooO0OO;
        public String OooO0Oo;

        public OooO00o(String str) {
            this.f17723OooO00o = str;
        }

        public OooO00o(String str, String str2, String str3) {
            this.OooO0O0 = str;
            this.OooO0OO = str2;
            this.OooO0Oo = str3;
        }

        public String OooO00o() {
            if (this.OooO0O0 == null && this.f17723OooO00o != null) {
                m17113OooO00o();
            }
            return this.OooO0Oo;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m17113OooO00o() {
            this.f17723OooO00o.length();
            int indexOf = this.f17723OooO00o.indexOf("/Role=");
            if (indexOf >= 0) {
                this.OooO0O0 = this.f17723OooO00o.substring(0, indexOf);
                int i = indexOf + 6;
                int indexOf2 = this.f17723OooO00o.indexOf("/Capability=", i);
                String str = this.f17723OooO00o;
                String substring = indexOf2 < 0 ? str.substring(i) : str.substring(i, indexOf2);
                String str2 = null;
                if (substring.length() == 0) {
                    substring = null;
                }
                this.OooO0OO = substring;
                String substring2 = indexOf2 < 0 ? null : this.f17723OooO00o.substring(indexOf2 + 12);
                if (!(substring2 == null || substring2.length() == 0)) {
                    str2 = substring2;
                }
                this.OooO0Oo = str2;
            }
        }

        public String OooO0O0() {
            String str = this.f17723OooO00o;
            if (str != null) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.OooO0O0);
            sb.append("/Role=");
            String str2 = this.OooO0OO;
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            sb.append(str2);
            if (this.OooO0Oo != null) {
                str3 = "/Capability=" + this.OooO0Oo;
            }
            sb.append(str3);
            String sb2 = sb.toString();
            this.f17723OooO00o = sb2;
            return sb2;
        }

        public String OooO0OO() {
            if (this.OooO0O0 == null && this.f17723OooO00o != null) {
                m17113OooO00o();
            }
            return this.OooO0O0;
        }

        public String OooO0Oo() {
            if (this.OooO0O0 == null && this.f17723OooO00o != null) {
                m17113OooO00o();
            }
            return this.OooO0OO;
        }

        public String toString() {
            return OooO0O0();
        }
    }

    public C6168iLLL1(X509AttributeCertificateHolder x509AttributeCertificateHolder) {
        if (x509AttributeCertificateHolder != null) {
            this.f17721OooO00o = x509AttributeCertificateHolder;
            C5870LiLlI[] attributes = x509AttributeCertificateHolder.getAttributes(new LlLI1(OooO0OO));
            if (attributes != null) {
                for (int i = 0; i != attributes.length; i++) {
                    try {
                        C6828lIIIl OooO00o2 = C6828lIIIl.OooO00o(attributes[i].m16460OooO00o()[0]);
                        String OooO00o3 = ((L1iI1) OooO00o2.OooO00o().OooO00o()[0].m15483OooO0O0()).OooO00o();
                        int indexOf = OooO00o3.indexOf(HttpConstant.SCHEME_SPLIT);
                        if (indexOf < 0 || indexOf == OooO00o3.length() - 1) {
                            throw new IllegalArgumentException("Bad encoding of VOMS policyAuthority : [" + OooO00o3 + "]");
                        }
                        this.OooO0O0 = OooO00o3.substring(0, indexOf);
                        this.OooO00o = OooO00o3.substring(indexOf + 3);
                        if (OooO00o2.OooO0O0() == 1) {
                            AbstractC6804llL1ii[] r4 = (AbstractC6804llL1ii[]) OooO00o2.m17957OooO00o();
                            for (int i2 = 0; i2 != r4.length; i2++) {
                                String str = new String(r4[i2].m17938OooO00o());
                                OooO00o oooO00o = new OooO00o(str);
                                if (!this.f17720OooO00o.contains(str)) {
                                    if (str.startsWith(C8932ooOOO0o.OooO0OO + this.OooO0O0 + C8932ooOOO0o.OooO0OO)) {
                                        this.f17720OooO00o.add(str);
                                        this.f17722OooO0O0.add(oooO00o);
                                    }
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("VOMS attribute values are not encoded as octet strings, policyAuthority = " + OooO00o3);
                        }
                    } catch (IllegalArgumentException e) {
                        throw e;
                    } catch (Exception unused) {
                        throw new IllegalArgumentException("Badly encoded VOMS extension in AC issued by " + x509AttributeCertificateHolder.getIssuer());
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("VOMSAttribute: AttributeCertificate is NULL");
    }

    public String OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List m17110OooO00o() {
        return this.f17720OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public X509AttributeCertificateHolder m17111OooO00o() {
        return this.f17721OooO00o;
    }

    public String OooO0O0() {
        return this.OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public List m17112OooO0O0() {
        return this.f17722OooO0O0;
    }

    public String toString() {
        return "VO      :" + this.OooO0O0 + "\nHostPort:" + this.OooO00o + "\nFQANs   :" + this.f17722OooO0O0;
    }
}
