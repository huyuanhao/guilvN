package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.URL;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyNode;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException;
import org.bouncycastle.x509.CertPathReviewerException;

/* renamed from: com.pd.sdk.iLLLl  reason: case insensitive filesystem */
public class C6169iLLLl extends C9614ii1iiI {
    public static final String OooOOOo = C5237III.o00o0O00.m16387OooO0O0();
    public static final String OooOOo = C5237III.o00o00o.m16387OooO0O0();
    public static final String OooOOo0 = C5237III.o00o000.m16387OooO0O0();
    public static final String OooOOoo = "org.bouncycastle.x509.CertPathReviewerMessages";
    public PublicKey OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public CertPath f17724OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PKIXParameters f17725OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PolicyNode f17726OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TrustAnchor f17727OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Date f17728OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f17729OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17730OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List[] f17731OooO00o;
    public List[] OooO0O0;
    public int OooO0OO;

    public C6169iLLLl() {
    }

    public C6169iLLLl(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        OooO00o(certPath, pKIXParameters);
    }

    private String OooO00o(byte[] bArr) {
        try {
            return InetAddress.getByAddress(bArr).getHostAddress();
        } catch (Exception unused) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i != bArr.length; i++) {
                stringBuffer.append(Integer.toHexString(bArr[i] & 255));
                stringBuffer.append(' ');
            }
            return stringBuffer.toString();
        }
    }

    private X509CRL OooO00o(String str) throws CertPathReviewerException {
        try {
            URL url = new URL(str);
            if (!url.getProtocol().equals("http")) {
                if (!url.getProtocol().equals("https")) {
                    return null;
                }
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return (X509CRL) CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME).generateCRL(httpURLConnection.getInputStream());
            }
            throw new Exception(httpURLConnection.getResponseMessage());
        } catch (Exception e) {
            throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.loadCrlDistPointError", new Object[]{new C6467l1Ii(str), e.getMessage(), e, e.getClass().getName()}));
        }
    }

    private boolean OooO00o(X509Certificate x509Certificate, int i) {
        lLL1Il lll1il;
        try {
            I11li1 i11li1 = (I11li1) C9614ii1iiI.OooO00o(x509Certificate, OooOOOo);
            boolean z = false;
            for (int i2 = 0; i2 < i11li1.size(); i2++) {
                C9351IILl OooO00o2 = C9351IILl.OooO00o(i11li1.OooO00o(i2));
                if (AbstractC6406il1i1.o00O00oO.equals(OooO00o2.OooO00o())) {
                    lll1il = new lLL1Il(OooOOoo, "CertPathReviewer.QcEuCompliance");
                } else {
                    if (!AbstractC5339Ii1l.o00O0OO.equals(OooO00o2.OooO00o())) {
                        if (AbstractC6406il1i1.o00O0O00.equals(OooO00o2.OooO00o())) {
                            lll1il = new lLL1Il(OooOOoo, "CertPathReviewer.QcSSCD");
                        } else if (AbstractC6406il1i1.oo00o.equals(OooO00o2.OooO00o())) {
                            C5345IiI OooO00o3 = C5345IiI.OooO00o(OooO00o2.m21410OooO0O0());
                            OooO00o3.OooO00o();
                            double doubleValue = OooO00o3.m15561OooO00o().doubleValue() * Math.pow(10.0d, OooO00o3.m15562OooO0O0().doubleValue());
                            OooO0O0(OooO00o3.OooO00o().OooO00o() ? new lLL1Il(OooOOoo, "CertPathReviewer.QcLimitValueAlpha", new Object[]{OooO00o3.OooO00o().m16869OooO0O0(), new IIi1L(new Double(doubleValue)), OooO00o3}) : new lLL1Il(OooOOoo, "CertPathReviewer.QcLimitValueNum", new Object[]{I11I.OooO00o(OooO00o3.OooO00o().OooO0O0()), new IIi1L(new Double(doubleValue)), OooO00o3}), i);
                        } else {
                            OooO0O0(new lLL1Il(OooOOoo, "CertPathReviewer.QcUnknownStatement", new Object[]{OooO00o2.OooO00o(), new C6467l1Ii(OooO00o2)}), i);
                            z = true;
                        }
                    }
                }
                OooO0O0(lll1il, i);
            }
            return true ^ z;
        } catch (AnnotatedException unused) {
            OooO00o(new lLL1Il(OooOOoo, "CertPathReviewer.QcStatementExtError"), i);
            return false;
        }
    }

    private void OooO0O0() {
        List<PKIXCertPathChecker> certPathCheckers = this.f17725OooO00o.getCertPathCheckers();
        for (PKIXCertPathChecker pKIXCertPathChecker : certPathCheckers) {
            try {
                pKIXCertPathChecker.init(false);
            } catch (CertPathValidatorException e) {
                throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.certPathCheckerError", new Object[]{e.getMessage(), e, e.getClass().getName()}), e);
            }
        }
        try {
            for (int size = this.f17729OooO00o.size() - 1; size >= 0; size--) {
                X509Certificate x509Certificate = (X509Certificate) this.f17729OooO00o.get(size);
                Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
                if (criticalExtensionOIDs != null) {
                    if (!criticalExtensionOIDs.isEmpty()) {
                        criticalExtensionOIDs.remove(C9614ii1iiI.OooO0o);
                        criticalExtensionOIDs.remove(C9614ii1iiI.f23197OooO00o);
                        criticalExtensionOIDs.remove(C9614ii1iiI.OooO0OO);
                        criticalExtensionOIDs.remove(C9614ii1iiI.OooO0oO);
                        criticalExtensionOIDs.remove(C9614ii1iiI.OooO0oo);
                        criticalExtensionOIDs.remove(C9614ii1iiI.OooO);
                        criticalExtensionOIDs.remove(C9614ii1iiI.OooOO0);
                        criticalExtensionOIDs.remove(C9614ii1iiI.f23199OooO0O0);
                        criticalExtensionOIDs.remove(C9614ii1iiI.OooO0Oo);
                        criticalExtensionOIDs.remove(C9614ii1iiI.OooO0o0);
                        if (criticalExtensionOIDs.contains(OooOOOo) && OooO00o(x509Certificate, size)) {
                            criticalExtensionOIDs.remove(OooOOOo);
                        }
                        for (PKIXCertPathChecker pKIXCertPathChecker2 : certPathCheckers) {
                            try {
                                pKIXCertPathChecker2.check(x509Certificate, criticalExtensionOIDs);
                            } catch (CertPathValidatorException e2) {
                                throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.criticalExtensionError", new Object[]{e2.getMessage(), e2, e2.getClass().getName()}), e2.getCause(), this.f17724OooO00o, size);
                            }
                        }
                        if (!criticalExtensionOIDs.isEmpty()) {
                            Iterator<String> it = criticalExtensionOIDs.iterator();
                            while (it.hasNext()) {
                                OooO00o(new lLL1Il(OooOOoo, "CertPathReviewer.unknownCriticalExt", new Object[]{new LlLI1(it.next())}), size);
                            }
                        }
                    }
                }
            }
        } catch (CertPathReviewerException e3) {
            OooO00o(e3.getErrorMessage(), e3.getIndex());
        }
    }

    private void OooO0OO() {
        C5244II1 r0 = new C5244II1();
        try {
            for (int size = this.f17729OooO00o.size() - 1; size > 0; size--) {
                X509Certificate x509Certificate = (X509Certificate) this.f17729OooO00o.get(size);
                if (!C9614ii1iiI.m21678OooO00o(x509Certificate)) {
                    X500Principal OooO00o2 = C9614ii1iiI.OooO00o(x509Certificate);
                    try {
                        I11li1 i11li1 = (I11li1) new C5805Ll1(new ByteArrayInputStream(OooO00o2.getEncoded())).OooO00o();
                        try {
                            r0.OooO0O0(i11li1);
                            try {
                                r0.OooO00o(i11li1);
                                try {
                                    I11li1 i11li12 = (I11li1) C9614ii1iiI.OooO00o(x509Certificate, C9614ii1iiI.OooO0Oo);
                                    if (i11li12 != null) {
                                        for (int i = 0; i < i11li12.size(); i++) {
                                            ILI OooO00o3 = ILI.OooO00o(i11li12.OooO00o(i));
                                            try {
                                                r0.OooO0O0(OooO00o3);
                                                r0.m15459OooO00o(OooO00o3);
                                            } catch (PKIXNameConstraintValidatorException e) {
                                                throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.notPermittedEmail", new Object[]{new C6467l1Ii(OooO00o3)}), e, this.f17724OooO00o, size);
                                            }
                                        }
                                    }
                                } catch (AnnotatedException e2) {
                                    throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.subjAltNameExtError"), e2, this.f17724OooO00o, size);
                                }
                            } catch (PKIXNameConstraintValidatorException e3) {
                                throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.excludedDN", new Object[]{new C6467l1Ii(OooO00o2.getName())}), e3, this.f17724OooO00o, size);
                            }
                        } catch (PKIXNameConstraintValidatorException e4) {
                            throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.notPermittedDN", new Object[]{new C6467l1Ii(OooO00o2.getName())}), e4, this.f17724OooO00o, size);
                        }
                    } catch (IOException e5) {
                        throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.ncSubjectNameError", new Object[]{new C6467l1Ii(OooO00o2)}), e5, this.f17724OooO00o, size);
                    }
                }
                try {
                    I11li1 i11li13 = (I11li1) C9614ii1iiI.OooO00o(x509Certificate, C9614ii1iiI.OooO0o0);
                    if (i11li13 != null) {
                        llLil1l OooO00o4 = llLil1l.OooO00o((Object) i11li13);
                        C9603iL1[] OooO0O02 = OooO00o4.m17889OooO0O0();
                        if (OooO0O02 != null) {
                            r0.OooO00o(OooO0O02);
                        }
                        C9603iL1[] OooO00o5 = OooO00o4.OooO00o();
                        if (OooO00o5 != null) {
                            for (int i2 = 0; i2 != OooO00o5.length; i2++) {
                                r0.OooO00o(OooO00o5[i2]);
                            }
                        }
                    }
                } catch (AnnotatedException e6) {
                    throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.ncExtError"), e6, this.f17724OooO00o, size);
                }
            }
        } catch (CertPathReviewerException e7) {
            OooO00o(e7.getErrorMessage(), e7.getIndex());
        }
    }

    private void OooO0Oo() {
        iLII1ii r5;
        BigInteger OooO00o2;
        int intValue;
        int i = this.OooO0OO;
        int i2 = 0;
        for (int size = this.f17729OooO00o.size() - 1; size > 0; size--) {
            X509Certificate x509Certificate = (X509Certificate) this.f17729OooO00o.get(size);
            if (!C9614ii1iiI.m21678OooO00o(x509Certificate)) {
                if (i <= 0) {
                    OooO00o(new lLL1Il(OooOOoo, "CertPathReviewer.pathLengthExtended"));
                }
                i--;
                i2++;
            }
            try {
                r5 = iLII1ii.OooO00o(C9614ii1iiI.OooO00o(x509Certificate, C9614ii1iiI.f23199OooO0O0));
            } catch (AnnotatedException unused) {
                OooO00o(new lLL1Il(OooOOoo, "CertPathReviewer.processLengthConstError"), size);
                r5 = null;
            }
            if (!(r5 == null || (OooO00o2 = r5.OooO00o()) == null || (intValue = OooO00o2.intValue()) >= i)) {
                i = intValue;
            }
        }
        OooO0O0(new lLL1Il(OooOOoo, "CertPathReviewer.totalPathLength", new Object[]{I11I.OooO00o(i2)}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00bf, code lost:
        OooO00o(new com.p118pd.sdk.lLL1Il(com.p118pd.sdk.C6169iLLLl.OooOOoo, "CertPathReviewer.trustButInvalidCert"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ca, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02cf A[LOOP:1: B:101:0x02c9->B:103:0x02cf, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02f8 A[LOOP:2: B:105:0x02f2->B:107:0x02f8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ca A[ExcHandler: all (th java.lang.Throwable), Splitter:B:10:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x028b A[SYNTHETIC, Splitter:B:86:0x028b] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02ad A[Catch:{ AnnotatedException -> 0x02b2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO0o() {
        /*
        // Method dump skipped, instructions count: 1033
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6169iLLLl.OooO0o():void");
    }

    private void OooO0o0() {
        int i;
        int i2;
        C9511Lil r15;
        int i3;
        int i4;
        String str;
        Set<String> set;
        HashSet hashSet;
        String str2;
        int i5;
        int intValue;
        String str3;
        HashSet hashSet2;
        HashSet hashSet3;
        String str4;
        int i6;
        String str5 = "CertPathReviewer.policyExtError";
        Set<String> initialPolicies = this.f17725OooO00o.getInitialPolicies();
        int i7 = this.OooO0OO + 1;
        ArrayList[] arrayListArr = new ArrayList[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            arrayListArr[i8] = new ArrayList();
        }
        HashSet hashSet4 = new HashSet();
        hashSet4.add("2.5.29.32.0");
        C9511Lil r152 = new C9511Lil(new ArrayList(), 0, hashSet4, null, new HashSet(), "2.5.29.32.0", false);
        arrayListArr[0].add(r152);
        if (this.f17725OooO00o.isExplicitPolicyRequired()) {
            i2 = 0;
            i = 1;
        } else {
            i = 1;
            i2 = this.OooO0OO + 1;
        }
        int i9 = this.f17725OooO00o.isAnyPolicyInhibited() ? 0 : this.OooO0OO + i;
        int i10 = this.f17725OooO00o.isPolicyMappingInhibited() ? 0 : this.OooO0OO + i;
        try {
            int size = this.f17729OooO00o.size() - i;
            C9511Lil r153 = r152;
            X509Certificate x509Certificate = null;
            HashSet hashSet5 = null;
            while (size >= 0) {
                int i11 = this.OooO0OO - size;
                X509Certificate x509Certificate2 = (X509Certificate) this.f17729OooO00o.get(size);
                try {
                    I11li1 i11li1 = (I11li1) C9614ii1iiI.OooO00o(x509Certificate2, C9614ii1iiI.f23197OooO00o);
                    if (i11li1 == null || r153 == null) {
                        set = initialPolicies;
                        str = str5;
                        i4 = i9;
                        i3 = i10;
                        r153 = r153;
                    } else {
                        Enumeration OooO00o2 = i11li1.m15236OooO00o();
                        set = initialPolicies;
                        HashSet hashSet6 = new HashSet();
                        while (OooO00o2.hasMoreElements()) {
                            C9879iI OooO00o3 = C9879iI.OooO00o(OooO00o2.nextElement());
                            LlLI1 OooO00o4 = OooO00o3.m21960OooO00o();
                            hashSet6.add(OooO00o4.m16387OooO0O0());
                            if (!"2.5.29.32.0".equals(OooO00o4.m16387OooO0O0())) {
                                try {
                                    Set OooO00o5 = C9614ii1iiI.OooO00o(OooO00o3.OooO00o());
                                    if (!C9614ii1iiI.m21676OooO00o(i11, (List[]) arrayListArr, OooO00o4, OooO00o5)) {
                                        C9614ii1iiI.OooO00o(i11, (List[]) arrayListArr, OooO00o4, OooO00o5);
                                    }
                                } catch (CertPathValidatorException e) {
                                    throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.policyQualifierError"), e, this.f17724OooO00o, size);
                                }
                            }
                            r153 = r153;
                            str5 = str5;
                        }
                        str = str5;
                        if (hashSet5 == null || hashSet5.contains("2.5.29.32.0")) {
                            hashSet2 = hashSet6;
                        } else {
                            hashSet2 = new HashSet();
                            for (Object obj : hashSet5) {
                                if (hashSet6.contains(obj)) {
                                    hashSet2.add(obj);
                                }
                            }
                        }
                        if (i9 > 0 || (i11 < this.OooO0OO && C9614ii1iiI.m21678OooO00o(x509Certificate2))) {
                            Enumeration OooO00o6 = i11li1.m15236OooO00o();
                            while (true) {
                                if (!OooO00o6.hasMoreElements()) {
                                    break;
                                }
                                C9879iI OooO00o7 = C9879iI.OooO00o(OooO00o6.nextElement());
                                if ("2.5.29.32.0".equals(OooO00o7.m21960OooO00o().m16387OooO0O0())) {
                                    try {
                                        Set OooO00o8 = C9614ii1iiI.OooO00o(OooO00o7.OooO00o());
                                        ArrayList arrayList = arrayListArr[i11 - 1];
                                        hashSet3 = hashSet2;
                                        for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                            C9511Lil r13 = (C9511Lil) arrayList.get(i12);
                                            for (Object obj2 : r13.getExpectedPolicies()) {
                                                if (obj2 instanceof String) {
                                                    str4 = (String) obj2;
                                                } else if (obj2 instanceof LlLI1) {
                                                    str4 = ((LlLI1) obj2).m16387OooO0O0();
                                                } else {
                                                    arrayList = arrayList;
                                                    i9 = i9;
                                                }
                                                boolean z = false;
                                                for (Iterator children = r13.getChildren(); children.hasNext(); children = children) {
                                                    if (str4.equals(((C9511Lil) children.next()).getValidPolicy())) {
                                                        z = true;
                                                    }
                                                }
                                                if (!z) {
                                                    HashSet hashSet7 = new HashSet();
                                                    hashSet7.add(str4);
                                                    i6 = i10;
                                                    C9511Lil r11 = new C9511Lil(new ArrayList(), i11, hashSet7, r13, OooO00o8, str4, false);
                                                    r13.OooO00o(r11);
                                                    arrayListArr[i11].add(r11);
                                                } else {
                                                    i6 = i10;
                                                }
                                                arrayList = arrayList;
                                                i9 = i9;
                                                i10 = i6;
                                            }
                                        }
                                        i4 = i9;
                                        i3 = i10;
                                    } catch (CertPathValidatorException e2) {
                                        throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.policyQualifierError"), e2, this.f17724OooO00o, size);
                                    }
                                }
                            }
                        }
                        i4 = i9;
                        i3 = i10;
                        hashSet3 = hashSet2;
                        r153 = r153;
                        for (int i13 = i11 - 1; i13 >= 0; i13--) {
                            ArrayList arrayList2 = arrayListArr[i13];
                            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                                C9511Lil r112 = (C9511Lil) arrayList2.get(i14);
                                if (!r112.m21574OooO00o()) {
                                    C9511Lil OooO00o9 = C9614ii1iiI.OooO00o(r153, arrayListArr, r112);
                                    r153 = OooO00o9;
                                    if (OooO00o9 == null) {
                                        break;
                                    }
                                }
                            }
                        }
                        Set<String> criticalExtensionOIDs = x509Certificate2.getCriticalExtensionOIDs();
                        if (criticalExtensionOIDs != null) {
                            boolean contains = criticalExtensionOIDs.contains(C9614ii1iiI.f23197OooO00o);
                            ArrayList arrayList3 = arrayListArr[i11];
                            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                                ((C9511Lil) arrayList3.get(i15)).OooO00o(contains);
                            }
                        }
                        hashSet5 = hashSet3;
                    }
                    if (i11li1 == null) {
                        r153 = null;
                    }
                    if (i2 > 0 || r153 != null) {
                        if (i11 != this.OooO0OO) {
                            try {
                                AbstractC6122iIlLiL OooO00o10 = C9614ii1iiI.OooO00o(x509Certificate2, C9614ii1iiI.OooO0OO);
                                if (OooO00o10 != null) {
                                    int i16 = 0;
                                    for (I11li1 i11li12 = (I11li1) OooO00o10; i16 < i11li12.size(); i11li12 = i11li12) {
                                        I11li1 i11li13 = (I11li1) i11li12.OooO00o(i16);
                                        LlLI1 llLI1 = (LlLI1) i11li13.OooO00o(1);
                                        if ("2.5.29.32.0".equals(((LlLI1) i11li13.OooO00o(0)).m16387OooO0O0())) {
                                            throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.invalidPolicyMapping"), this.f17724OooO00o, size);
                                        } else if (!"2.5.29.32.0".equals(llLI1.m16387OooO0O0())) {
                                            i16++;
                                        } else {
                                            throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.invalidPolicyMapping"), this.f17724OooO00o, size);
                                        }
                                    }
                                }
                                if (OooO00o10 != null) {
                                    I11li1 i11li14 = (I11li1) OooO00o10;
                                    HashMap hashMap = new HashMap();
                                    HashSet<String> hashSet8 = new HashSet();
                                    int i17 = 0;
                                    while (i17 < i11li14.size()) {
                                        I11li1 i11li15 = (I11li1) i11li14.OooO00o(i17);
                                        String OooO0O02 = ((LlLI1) i11li15.OooO00o(0)).m16387OooO0O0();
                                        String OooO0O03 = ((LlLI1) i11li15.OooO00o(1)).m16387OooO0O0();
                                        if (!hashMap.containsKey(OooO0O02)) {
                                            HashSet hashSet9 = new HashSet();
                                            hashSet9.add(OooO0O03);
                                            hashMap.put(OooO0O02, hashSet9);
                                            hashSet8.add(OooO0O02);
                                        } else {
                                            ((Set) hashMap.get(OooO0O02)).add(OooO0O03);
                                        }
                                        i17++;
                                        i11li14 = i11li14;
                                        hashSet5 = hashSet5;
                                    }
                                    hashSet = hashSet5;
                                    for (String str6 : hashSet8) {
                                        if (i3 > 0) {
                                            try {
                                                C9614ii1iiI.OooO00o(i11, arrayListArr, str6, hashMap, x509Certificate2);
                                                str3 = str;
                                            } catch (AnnotatedException e3) {
                                                throw new CertPathReviewerException(new lLL1Il(OooOOoo, str), e3, this.f17724OooO00o, size);
                                            } catch (CertPathValidatorException e4) {
                                                throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.policyQualifierError"), e4, this.f17724OooO00o, size);
                                            }
                                        } else {
                                            str3 = str;
                                            if (i3 <= 0) {
                                                r153 = C9614ii1iiI.OooO00o(i11, arrayListArr, str6, r153);
                                            }
                                        }
                                        str = str3;
                                    }
                                } else {
                                    hashSet = hashSet5;
                                }
                                str2 = str;
                                if (!C9614ii1iiI.m21678OooO00o(x509Certificate2)) {
                                    if (i2 != 0) {
                                        i2--;
                                    }
                                    i10 = i3 != 0 ? i3 - 1 : i3;
                                    i5 = i4 != 0 ? i4 - 1 : i4;
                                } else {
                                    i5 = i4;
                                    i10 = i3;
                                }
                                try {
                                    I11li1 i11li16 = (I11li1) C9614ii1iiI.OooO00o(x509Certificate2, C9614ii1iiI.OooOO0);
                                    if (i11li16 != null) {
                                        Enumeration OooO00o11 = i11li16.m15236OooO00o();
                                        while (OooO00o11.hasMoreElements()) {
                                            AbstractC5903LlLLL r3 = (AbstractC5903LlLLL) OooO00o11.nextElement();
                                            int OooO00o12 = r3.OooO00o();
                                            if (OooO00o12 == 0) {
                                                int intValue2 = C6513lIiI.OooO00o(r3, false).m17647OooO0O0().intValue();
                                                if (intValue2 < i2) {
                                                    i2 = intValue2;
                                                }
                                            } else if (OooO00o12 == 1) {
                                                int intValue3 = C6513lIiI.OooO00o(r3, false).m17647OooO0O0().intValue();
                                                if (intValue3 < i10) {
                                                    i10 = intValue3;
                                                }
                                            }
                                        }
                                    }
                                    try {
                                        C6513lIiI r2 = (C6513lIiI) C9614ii1iiI.OooO00o(x509Certificate2, C9614ii1iiI.OooO0oO);
                                        if (r2 != null && (intValue = r2.m17647OooO0O0().intValue()) < i5) {
                                            i5 = intValue;
                                        }
                                    } catch (AnnotatedException unused) {
                                        throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.policyInhibitExtError"), this.f17724OooO00o, size);
                                    }
                                } catch (AnnotatedException unused2) {
                                    throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.policyConstExtError"), this.f17724OooO00o, size);
                                }
                            } catch (AnnotatedException e5) {
                                throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.policyMapExtError"), e5, this.f17724OooO00o, size);
                            }
                        } else {
                            hashSet = hashSet5;
                            str2 = str;
                            i5 = i4;
                            i10 = i3;
                        }
                        size--;
                        x509Certificate = x509Certificate2;
                        str5 = str2;
                        hashSet5 = hashSet;
                        i7 = i7;
                        i9 = i5;
                        initialPolicies = set;
                    } else {
                        throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.noValidPolicyTree"));
                    }
                } catch (AnnotatedException e6) {
                    throw new CertPathReviewerException(new lLL1Il(OooOOoo, str5), e6, this.f17724OooO00o, size);
                }
            }
            Set<String> set2 = initialPolicies;
            int i18 = i7;
            if (!C9614ii1iiI.m21678OooO00o(x509Certificate) && i2 > 0) {
                i2--;
            }
            try {
                I11li1 i11li17 = (I11li1) C9614ii1iiI.OooO00o(x509Certificate, C9614ii1iiI.OooOO0);
                if (i11li17 != null) {
                    Enumeration OooO00o13 = i11li17.m15236OooO00o();
                    int i19 = i2;
                    while (OooO00o13.hasMoreElements()) {
                        AbstractC5903LlLLL r32 = (AbstractC5903LlLLL) OooO00o13.nextElement();
                        if (r32.OooO00o() == 0) {
                            if (C6513lIiI.OooO00o(r32, false).m17647OooO0O0().intValue() == 0) {
                                i19 = 0;
                            }
                        }
                    }
                    i2 = i19;
                }
                if (r153 == null) {
                    if (!this.f17725OooO00o.isExplicitPolicyRequired()) {
                        r15 = null;
                    } else {
                        throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.explicitPolicy"), this.f17724OooO00o, size);
                    }
                } else if (C9614ii1iiI.OooO00o((Set) set2)) {
                    if (this.f17725OooO00o.isExplicitPolicyRequired()) {
                        if (!hashSet5.isEmpty()) {
                            HashSet<C9511Lil> hashSet10 = new HashSet();
                            int i20 = 0;
                            while (i20 < i18) {
                                ArrayList arrayList4 = arrayListArr[i20];
                                for (int i21 = 0; i21 < arrayList4.size(); i21++) {
                                    C9511Lil r10 = (C9511Lil) arrayList4.get(i21);
                                    if ("2.5.29.32.0".equals(r10.getValidPolicy())) {
                                        Iterator children2 = r10.getChildren();
                                        while (children2.hasNext()) {
                                            hashSet10.add(children2.next());
                                        }
                                    }
                                }
                                i20++;
                                i18 = i18;
                            }
                            for (C9511Lil r22 : hashSet10) {
                                hashSet5.contains(r22.getValidPolicy());
                            }
                            if (r153 != null) {
                                r15 = r153;
                                for (int i22 = this.OooO0OO - 1; i22 >= 0; i22--) {
                                    ArrayList arrayList5 = arrayListArr[i22];
                                    for (int i23 = 0; i23 < arrayList5.size(); i23++) {
                                        C9511Lil r33 = (C9511Lil) arrayList5.get(i23);
                                        if (!r33.m21574OooO00o()) {
                                            r15 = C9614ii1iiI.OooO00o(r15, arrayListArr, r33);
                                        }
                                    }
                                }
                            }
                        } else {
                            throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.explicitPolicy"), this.f17724OooO00o, size);
                        }
                    }
                    r15 = r153;
                } else {
                    HashSet<C9511Lil> hashSet11 = new HashSet();
                    for (int i24 = 0; i24 < i18; i24++) {
                        ArrayList arrayList6 = arrayListArr[i24];
                        for (int i25 = 0; i25 < arrayList6.size(); i25++) {
                            C9511Lil r102 = (C9511Lil) arrayList6.get(i25);
                            if ("2.5.29.32.0".equals(r102.getValidPolicy())) {
                                Iterator children3 = r102.getChildren();
                                while (children3.hasNext()) {
                                    C9511Lil r12 = (C9511Lil) children3.next();
                                    if (!"2.5.29.32.0".equals(r12.getValidPolicy())) {
                                        hashSet11.add(r12);
                                    }
                                }
                            }
                        }
                    }
                    r15 = r153;
                    for (C9511Lil r23 : hashSet11) {
                        if (!set2.contains(r23.getValidPolicy())) {
                            r15 = C9614ii1iiI.OooO00o(r15, arrayListArr, r23);
                        }
                        set2 = set2;
                    }
                    if (r15 != null) {
                        for (int i26 = this.OooO0OO - 1; i26 >= 0; i26--) {
                            ArrayList arrayList7 = arrayListArr[i26];
                            for (int i27 = 0; i27 < arrayList7.size(); i27++) {
                                C9511Lil r34 = (C9511Lil) arrayList7.get(i27);
                                if (!r34.m21574OooO00o()) {
                                    r15 = C9614ii1iiI.OooO00o(r15, arrayListArr, r34);
                                }
                            }
                        }
                    }
                }
                if (i2 <= 0 && r15 == null) {
                    throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.invalidPolicy"));
                }
            } catch (AnnotatedException unused3) {
                throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.policyConstExtError"), this.f17724OooO00o, size);
            }
        } catch (CertPathReviewerException e7) {
            OooO00o(e7.getErrorMessage(), e7.getIndex());
        }
    }

    public int OooO00o() {
        return this.OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public PublicKey m17114OooO00o() {
        m17118OooO00o();
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public CertPath m17115OooO00o() {
        return this.f17724OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public PolicyNode m17116OooO00o() {
        m17118OooO00o();
        return this.f17726OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public TrustAnchor m17117OooO00o() {
        m17118OooO00o();
        return this.f17727OooO00o;
    }

    public Collection OooO00o(X509Certificate x509Certificate, Set set) throws CertPathReviewerException {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(C9614ii1iiI.m21675OooO00o((Object) x509Certificate).getEncoded());
            byte[] extensionValue = x509Certificate.getExtensionValue(C5237III.oo00oO.m16387OooO0O0());
            if (extensionValue != null) {
                ilililIi OooO00o2 = ilililIi.OooO00o(AbstractC6122iIlLiL.OooO00o(((AbstractC6804llL1ii) AbstractC6122iIlLiL.OooO00o(extensionValue)).m17938OooO00o()));
                x509CertSelector.setSerialNumber(OooO00o2.m17391OooO00o());
                byte[] OooO00o3 = OooO00o2.m17392OooO00o();
                if (OooO00o3 != null) {
                    x509CertSelector.setSubjectKeyIdentifier(new C6487lIIiIlL(OooO00o3).getEncoded());
                }
            }
            while (it.hasNext()) {
                TrustAnchor trustAnchor = (TrustAnchor) it.next();
                if (trustAnchor.getTrustedCert() != null) {
                    if (!x509CertSelector.match(trustAnchor.getTrustedCert())) {
                    }
                } else if (trustAnchor.getCAName() != null) {
                    if (trustAnchor.getCAPublicKey() != null) {
                        if (!C9614ii1iiI.m21675OooO00o((Object) x509Certificate).equals(new X500Principal(trustAnchor.getCAName()))) {
                        }
                    }
                }
                arrayList.add(trustAnchor);
            }
            return arrayList;
        } catch (IOException unused) {
            throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.trustAnchorIssuerError"));
        }
    }

    public List OooO00o(int i) {
        m17118OooO00o();
        return this.OooO0O0[i + 1];
    }

    public Vector OooO00o(C6039i1ii r6) {
        Vector vector = new Vector();
        if (r6 != null) {
            C9445Ii1[] OooO00o2 = r6.OooO00o();
            for (int i = 0; i < OooO00o2.length; i++) {
                if (OooO00o2[i].m21484OooO00o().equals(C9445Ii1.o00OoOo)) {
                    ILI OooO00o3 = OooO00o2[i].OooO00o();
                    if (OooO00o3.OooO00o() == 6) {
                        vector.add(((L1iI1) OooO00o3.m15483OooO0O0()).OooO00o());
                    }
                }
            }
        }
        return vector;
    }

    public Vector OooO00o(C6251iiLilL r8) {
        C9621ii1iL[] OooO00o2;
        Vector vector = new Vector();
        if (r8 != null) {
            for (C9621ii1iL r3 : r8.OooO00o()) {
                C5633LIiII OooO00o3 = r3.m21682OooO00o();
                if (OooO00o3.OooO0O0() == 0) {
                    ILI[] OooO00o4 = C5845LIillll.OooO00o(OooO00o3.m16111OooO0O0()).OooO00o();
                    for (int i = 0; i < OooO00o4.length; i++) {
                        if (OooO00o4[i].OooO00o() == 6) {
                            vector.add(((L1iI1) OooO00o4[i].m15483OooO0O0()).OooO00o());
                        }
                    }
                }
            }
        }
        return vector;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17118OooO00o() {
        if (!this.f17730OooO00o) {
            throw new IllegalStateException("Object not initialized. Call init() first.");
        } else if (this.f17731OooO00o == null) {
            int i = this.OooO0OO;
            this.f17731OooO00o = new List[(i + 1)];
            this.OooO0O0 = new List[(i + 1)];
            int i2 = 0;
            while (true) {
                List[] listArr = this.f17731OooO00o;
                if (i2 < listArr.length) {
                    listArr[i2] = new ArrayList();
                    this.OooO0O0[i2] = new ArrayList();
                    i2++;
                } else {
                    OooO0o();
                    OooO0OO();
                    OooO0Oo();
                    OooO0o0();
                    OooO0O0();
                    return;
                }
            }
        }
    }

    public void OooO00o(lLL1Il lll1il) {
        this.OooO0O0[0].add(lll1il);
    }

    public void OooO00o(lLL1Il lll1il, int i) {
        if (i < -1 || i >= this.OooO0OO) {
            throw new IndexOutOfBoundsException();
        }
        this.OooO0O0[i + 1].add(lll1il);
    }

    public void OooO00o(CertPath certPath, PKIXParameters pKIXParameters) throws CertPathReviewerException {
        if (!this.f17730OooO00o) {
            this.f17730OooO00o = true;
            if (certPath != null) {
                this.f17724OooO00o = certPath;
                List<? extends Certificate> certificates = certPath.getCertificates();
                this.f17729OooO00o = certificates;
                this.OooO0OO = certificates.size();
                if (!this.f17729OooO00o.isEmpty()) {
                    PKIXParameters pKIXParameters2 = (PKIXParameters) pKIXParameters.clone();
                    this.f17725OooO00o = pKIXParameters2;
                    this.f17728OooO00o = C9614ii1iiI.OooO00o(pKIXParameters2);
                    this.f17731OooO00o = null;
                    this.OooO0O0 = null;
                    this.f17727OooO00o = null;
                    this.OooO00o = null;
                    this.f17726OooO00o = null;
                    return;
                }
                throw new CertPathReviewerException(new lLL1Il(OooOOoo, "CertPathReviewer.emptyCertPath"));
            }
            throw new NullPointerException("certPath was null");
        }
        throw new IllegalStateException("object is already initialized!");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03b2, code lost:
        r12 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(java.security.cert.PKIXParameters r22, java.security.cert.X509Certificate r23, java.util.Date r24, java.security.cert.X509Certificate r25, java.security.PublicKey r26, java.util.Vector r27, int r28) throws org.bouncycastle.x509.CertPathReviewerException {
        /*
        // Method dump skipped, instructions count: 1202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6169iLLLl.OooO00o(java.security.cert.PKIXParameters, java.security.cert.X509Certificate, java.util.Date, java.security.cert.X509Certificate, java.security.PublicKey, java.util.Vector, int):void");
    }

    public void OooO00o(PKIXParameters pKIXParameters, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, Vector vector, Vector vector2, int i) throws CertPathReviewerException {
        OooO00o(pKIXParameters, x509Certificate, date, x509Certificate2, publicKey, vector, i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17119OooO00o() {
        m17118OooO00o();
        int i = 0;
        while (true) {
            List[] listArr = this.OooO0O0;
            if (i >= listArr.length) {
                return true;
            }
            if (!listArr[i].isEmpty()) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List[] m17120OooO00o() {
        m17118OooO00o();
        return this.OooO0O0;
    }

    public List OooO0O0(int i) {
        m17118OooO00o();
        return this.f17731OooO00o[i + 1];
    }

    public void OooO0O0(lLL1Il lll1il) {
        this.f17731OooO00o[0].add(lll1il);
    }

    public void OooO0O0(lLL1Il lll1il, int i) {
        if (i < -1 || i >= this.OooO0OO) {
            throw new IndexOutOfBoundsException();
        }
        this.f17731OooO00o[i + 1].add(lll1il);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public List[] m17121OooO0O0() {
        m17118OooO00o();
        return this.f17731OooO00o;
    }
}
