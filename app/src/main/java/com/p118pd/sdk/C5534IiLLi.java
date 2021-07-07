package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Principal;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import javax.naming.NamingException;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.util.StreamParsingException;

/* renamed from: com.pd.sdk.I丨iLLi  reason: invalid class name and case insensitive filesystem */
public class C5534IiLLi {
    public static int OooO00o = 32;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static long f16044OooO00o = 60000;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static String f16045OooO00o = "com.sun.jndi.ldap.LdapCtxFactory";
    public static String OooO0O0 = "ignore";
    public static final String OooO0OO = "none";
    public static final String OooO0Oo = "com.sun.jndi.url";

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5590L1il f16046OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map f16047OooO00o = new HashMap(OooO00o);

    public C5534IiLLi(C5590L1il r3) {
        this.f16046OooO00o = r3;
    }

    private String OooO00o(C6175iLLl r4) {
        try {
            byte[] subjectAsBytes = r4.getSubjectAsBytes();
            if (subjectAsBytes != null) {
                return new X500Principal(subjectAsBytes).getName("RFC1779");
            }
            return null;
        } catch (IOException e) {
            throw new StoreException("exception processing name: " + e.getMessage(), e);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0042  */
    private java.lang.String OooO00o(java.lang.String r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5534IiLLi.OooO00o(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c A[LOOP:0: B:26:0x009c->B:28:0x009f, LOOP_START, PHI: r4 
      PHI: (r4v5 int) = (r4v1 int), (r4v6 int) binds: [B:25:0x009a, B:28:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d9 A[LOOP:1: B:34:0x00d3->B:36:0x00d9, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List OooO00o(com.p118pd.sdk.C6088iIII r7, java.lang.String[] r8, java.lang.String[] r9, java.lang.String[] r10) throws org.bouncycastle.util.StoreException {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5534IiLLi.OooO00o(com.pd.sdk.iII丨I, java.lang.String[], java.lang.String[], java.lang.String[]):java.util.List");
    }

    private List OooO00o(C6175iLLl r7, String[] strArr, String[] strArr2, String[] strArr3) throws StoreException {
        ArrayList arrayList = new ArrayList();
        String OooO00o2 = OooO00o(r7);
        String bigInteger = r7.getSerialNumber() != null ? r7.getSerialNumber().toString() : null;
        if (r7.getCertificate() != null) {
            OooO00o2 = r7.getCertificate().getSubjectX500Principal().getName("RFC1779");
            bigInteger = r7.getCertificate().getSerialNumber().toString();
        }
        if (OooO00o2 != null) {
            for (String str : strArr3) {
                arrayList.addAll(OooO00o(strArr2, "*" + OooO00o(OooO00o2, str) + "*", strArr));
            }
        }
        if (!(bigInteger == null || this.f16046OooO00o.Oooo0OO() == null)) {
            arrayList.addAll(OooO00o(m15809OooO00o(this.f16046OooO00o.Oooo0OO()), bigInteger, strArr));
        }
        if (bigInteger == null && OooO00o2 == null) {
            arrayList.addAll(OooO00o(strArr2, "*", strArr));
        }
        return arrayList;
    }

    private List OooO00o(C6900li r6, String[] strArr, String[] strArr2, String[] strArr3) throws StoreException {
        ArrayList arrayList = new ArrayList();
        String OooO00o2 = r6.OooO00o() != null ? OooO00o(r6.OooO00o()) : null;
        if (!(r6.m18067OooO00o() == null || r6.m18067OooO00o().OooO00o() == null)) {
            OooO00o2 = r6.m18067OooO00o().OooO00o().getSubjectX500Principal().getName("RFC1779");
        }
        if (OooO00o2 != null) {
            for (String str : strArr3) {
                arrayList.addAll(OooO00o(strArr2, "*" + OooO00o(OooO00o2, str) + "*", strArr));
            }
        }
        if (OooO00o2 == null) {
            arrayList.addAll(OooO00o(strArr2, "*", strArr));
        }
        return arrayList;
    }

    private List OooO00o(C9801LIL r8, String[] strArr, String[] strArr2, String[] strArr3) throws StoreException {
        ArrayList arrayList = new ArrayList();
        HashSet<X500Principal> hashSet = new HashSet();
        if (r8.getIssuers() != null) {
            hashSet.addAll(r8.getIssuers());
        }
        if (r8.getCertificateChecking() != null) {
            hashSet.add(OooO00o(r8.getCertificateChecking()));
        }
        if (r8.OooO00o() != null) {
            Principal[] OooO00o2 = r8.OooO00o().m21662OooO00o().m21591OooO00o();
            for (int i = 0; i < OooO00o2.length; i++) {
                if (OooO00o2[i] instanceof X500Principal) {
                    hashSet.add(OooO00o2[i]);
                }
            }
        }
        String str = null;
        for (X500Principal x500Principal : hashSet) {
            str = x500Principal.getName("RFC1779");
            for (String str2 : strArr3) {
                arrayList.addAll(OooO00o(strArr2, "*" + OooO00o(str, str2) + "*", strArr));
            }
        }
        if (str == null) {
            arrayList.addAll(OooO00o(strArr2, "*", strArr));
        }
        return arrayList;
    }

    private List OooO00o(String str) {
        List list = (List) this.f16047OooO00o.get(str);
        long currentTimeMillis = System.currentTimeMillis();
        if (list == null || ((Date) list.get(0)).getTime() < currentTimeMillis - f16044OooO00o) {
            return null;
        }
        return (List) list.get(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fb, code lost:
        if (r3 != null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0108, code lost:
        if (0 == 0) goto L_0x010b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List OooO00o(java.lang.String[] r10, java.lang.String r11, java.lang.String[] r12) throws org.bouncycastle.util.StoreException {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5534IiLLi.OooO00o(java.lang.String[], java.lang.String, java.lang.String[]):java.util.List");
    }

    private Set OooO00o(List list, C6088iIII r6) throws StoreException {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        C5328IL1Li r1 = new C5328IL1Li();
        while (it.hasNext()) {
            try {
                r1.m15530OooO00o((InputStream) new ByteArrayInputStream((byte[]) it.next()));
                AbstractC9605iL11 r2 = (AbstractC9605iL11) r1.m15528OooO00o();
                if (r6.OooO00o((Object) r2)) {
                    hashSet.add(r2);
                }
            } catch (StreamParsingException unused) {
            }
        }
        return hashSet;
    }

    private Set OooO00o(List list, C6175iLLl r6) throws StoreException {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        C5195II1 r1 = new C5195II1();
        while (it.hasNext()) {
            try {
                r1.m15363OooO00o((InputStream) new ByteArrayInputStream((byte[]) it.next()));
                X509Certificate x509Certificate = (X509Certificate) r1.m15361OooO00o();
                if (r6.OooO00o(x509Certificate)) {
                    hashSet.add(x509Certificate);
                }
            } catch (Exception unused) {
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:3|4|5|6|7|(2:9|14)(1:15)|10|1) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0026 */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[ExcHandler: IOException | CertificateParsingException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:5:0x0026] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Set OooO00o(java.util.List r9, com.p118pd.sdk.C6900li r10) throws org.bouncycastle.util.StoreException {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5534IiLLi.OooO00o(java.util.List, com.pd.sdk.l丨丨i):java.util.Set");
    }

    private Set OooO00o(List list, C9801LIL r6) throws StoreException {
        HashSet hashSet = new HashSet();
        C9654iliI r1 = new C9654iliI();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                r1.m21714OooO00o((InputStream) new ByteArrayInputStream((byte[]) it.next()));
                X509CRL x509crl = (X509CRL) r1.m21712OooO00o();
                if (r6.OooO00o(x509crl)) {
                    hashSet.add(x509crl);
                }
            } catch (StreamParsingException unused) {
            }
        }
        return hashSet;
    }

    private DirContext OooO00o() throws NamingException {
        Properties properties = new Properties();
        properties.setProperty("java.naming.factory.initial", f16045OooO00o);
        properties.setProperty("java.naming.batchsize", "0");
        properties.setProperty("java.naming.provider.url", this.f16046OooO00o.Oooo0());
        properties.setProperty("java.naming.factory.url.pkgs", "com.sun.jndi.url");
        properties.setProperty("java.naming.referral", OooO0O0);
        properties.setProperty("java.naming.security.authentication", "none");
        return new InitialDirContext(properties);
    }

    private X500Principal OooO00o(X509Certificate x509Certificate) {
        return x509Certificate.getIssuerX500Principal();
    }

    private synchronized void OooO00o(String str, List list) {
        Map map;
        Date date = new Date(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        arrayList.add(date);
        arrayList.add(list);
        if (this.f16047OooO00o.containsKey(str)) {
            map = this.f16047OooO00o;
        } else {
            if (this.f16047OooO00o.size() >= OooO00o) {
                long time = date.getTime();
                Object obj = null;
                for (Map.Entry entry : this.f16047OooO00o.entrySet()) {
                    long time2 = ((Date) ((List) entry.getValue()).get(0)).getTime();
                    if (time2 < time) {
                        obj = entry.getKey();
                        time = time2;
                    }
                }
                this.f16047OooO00o.remove(obj);
            }
            map = this.f16047OooO00o;
        }
        map.put(str, arrayList);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private String[] m15809OooO00o(String str) {
        return str.split("\\s+");
    }

    public Collection OooO00o(C6088iIII r6) throws StoreException {
        String[] OooO00o2 = m15809OooO00o(this.f16046OooO00o.OooO0O0());
        String[] OooO00o3 = m15809OooO00o(this.f16046OooO00o.OooOoO0());
        String[] OooO00o4 = m15809OooO00o(this.f16046OooO00o.OooO0Oo());
        Set OooO00o5 = OooO00o(OooO00o(r6, OooO00o2, OooO00o3, OooO00o4), r6);
        if (OooO00o5.size() == 0) {
            OooO00o5.addAll(OooO00o(OooO00o(new C6088iIII(), OooO00o2, OooO00o3, OooO00o4), r6));
        }
        return OooO00o5;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Collection m15810OooO00o(C6175iLLl r6) throws StoreException {
        String[] OooO00o2 = m15809OooO00o(this.f16046OooO00o.OooOOo0());
        String[] OooO00o3 = m15809OooO00o(this.f16046OooO00o.OooOooo());
        String[] OooO00o4 = m15809OooO00o(this.f16046OooO00o.OooOOo());
        Set OooO00o5 = OooO00o(OooO00o(r6, OooO00o2, OooO00o3, OooO00o4), r6);
        if (OooO00o5.size() == 0) {
            OooO00o5.addAll(OooO00o(OooO00o(new C6175iLLl(), OooO00o2, OooO00o3, OooO00o4), r6));
        }
        return OooO00o5;
    }

    public Collection OooO00o(C6900li r7) throws StoreException {
        String[] OooO00o2 = m15809OooO00o(this.f16046OooO00o.OooOo0());
        String[] OooO00o3 = m15809OooO00o(this.f16046OooO00o.Oooo00O());
        String[] OooO00o4 = m15809OooO00o(this.f16046OooO00o.OooOo0O());
        Set OooO00o5 = OooO00o(OooO00o(r7, OooO00o2, OooO00o3, OooO00o4), r7);
        if (OooO00o5.size() == 0) {
            C6175iLLl r4 = new C6175iLLl();
            C6900li r5 = new C6900li();
            r5.OooO00o(r4);
            r5.OooO0O0(r4);
            OooO00o5.addAll(OooO00o(OooO00o(r5, OooO00o2, OooO00o3, OooO00o4), r7));
        }
        return OooO00o5;
    }

    public Collection OooO00o(C9801LIL r6) throws StoreException {
        String[] OooO00o2 = m15809OooO00o(this.f16046OooO00o.OooO0o0());
        String[] OooO00o3 = m15809OooO00o(this.f16046OooO00o.OooOoO());
        String[] OooO00o4 = m15809OooO00o(this.f16046OooO00o.OooO0o());
        Set OooO00o5 = OooO00o(OooO00o(r6, OooO00o2, OooO00o3, OooO00o4), r6);
        if (OooO00o5.size() == 0) {
            OooO00o5.addAll(OooO00o(OooO00o(new C9801LIL(), OooO00o2, OooO00o3, OooO00o4), r6));
        }
        return OooO00o5;
    }

    public Collection OooO0O0(C6088iIII r6) throws StoreException {
        String[] OooO00o2 = m15809OooO00o(this.f16046OooO00o.OooO0oo());
        String[] OooO00o3 = m15809OooO00o(this.f16046OooO00o.OooOoOO());
        String[] OooO00o4 = m15809OooO00o(this.f16046OooO00o.OooO());
        Set OooO00o5 = OooO00o(OooO00o(r6, OooO00o2, OooO00o3, OooO00o4), r6);
        if (OooO00o5.size() == 0) {
            OooO00o5.addAll(OooO00o(OooO00o(new C6088iIII(), OooO00o2, OooO00o3, OooO00o4), r6));
        }
        return OooO00o5;
    }

    public Collection OooO0O0(C6175iLLl r6) throws StoreException {
        String[] OooO00o2 = m15809OooO00o(this.f16046OooO00o.Oooo0o0());
        String[] OooO00o3 = m15809OooO00o(this.f16046OooO00o.Oooo0O0());
        String[] OooO00o4 = m15809OooO00o(this.f16046OooO00o.Oooo0o());
        Set OooO00o5 = OooO00o(OooO00o(r6, OooO00o2, OooO00o3, OooO00o4), r6);
        if (OooO00o5.size() == 0) {
            OooO00o5.addAll(OooO00o(OooO00o(new C6175iLLl(), OooO00o2, OooO00o3, OooO00o4), r6));
        }
        return OooO00o5;
    }

    public Collection OooO0O0(C9801LIL r6) throws StoreException {
        String[] OooO00o2 = m15809OooO00o(this.f16046OooO00o.OooOO0());
        String[] OooO00o3 = m15809OooO00o(this.f16046OooO00o.OooOoo0());
        String[] OooO00o4 = m15809OooO00o(this.f16046OooO00o.OooOO0O());
        Set OooO00o5 = OooO00o(OooO00o(r6, OooO00o2, OooO00o3, OooO00o4), r6);
        if (OooO00o5.size() == 0) {
            OooO00o5.addAll(OooO00o(OooO00o(new C9801LIL(), OooO00o2, OooO00o3, OooO00o4), r6));
        }
        return OooO00o5;
    }

    public Collection OooO0OO(C6088iIII r6) throws StoreException {
        String[] OooO00o2 = m15809OooO00o(this.f16046OooO00o.OooOO0o());
        String[] OooO00o3 = m15809OooO00o(this.f16046OooO00o.OooOoo());
        String[] OooO00o4 = m15809OooO00o(this.f16046OooO00o.OooOOO0());
        Set OooO00o5 = OooO00o(OooO00o(r6, OooO00o2, OooO00o3, OooO00o4), r6);
        if (OooO00o5.size() == 0) {
            OooO00o5.addAll(OooO00o(OooO00o(new C6088iIII(), OooO00o2, OooO00o3, OooO00o4), r6));
        }
        return OooO00o5;
    }

    public Collection OooO0OO(C9801LIL r6) throws StoreException {
        String[] OooO00o2 = m15809OooO00o(this.f16046OooO00o.OooOOO());
        String[] OooO00o3 = m15809OooO00o(this.f16046OooO00o.OooOooO());
        String[] OooO00o4 = m15809OooO00o(this.f16046OooO00o.OooOOOO());
        Set OooO00o5 = OooO00o(OooO00o(r6, OooO00o2, OooO00o3, OooO00o4), r6);
        if (OooO00o5.size() == 0) {
            OooO00o5.addAll(OooO00o(OooO00o(new C9801LIL(), OooO00o2, OooO00o3, OooO00o4), r6));
        }
        return OooO00o5;
    }

    public Collection OooO0Oo(C9801LIL r6) throws StoreException {
        String[] OooO00o2 = m15809OooO00o(this.f16046OooO00o.OooOOoo());
        String[] OooO00o3 = m15809OooO00o(this.f16046OooO00o.Oooo000());
        String[] OooO00o4 = m15809OooO00o(this.f16046OooO00o.OooOo00());
        Set OooO00o5 = OooO00o(OooO00o(r6, OooO00o2, OooO00o3, OooO00o4), r6);
        if (OooO00o5.size() == 0) {
            OooO00o5.addAll(OooO00o(OooO00o(new C9801LIL(), OooO00o2, OooO00o3, OooO00o4), r6));
        }
        return OooO00o5;
    }

    public Collection OooO0o0(C9801LIL r6) throws StoreException {
        String[] OooO00o2 = m15809OooO00o(this.f16046OooO00o.OooOo0o());
        String[] OooO00o3 = m15809OooO00o(this.f16046OooO00o.Oooo00o());
        String[] OooO00o4 = m15809OooO00o(this.f16046OooO00o.OooOo());
        Set OooO00o5 = OooO00o(OooO00o(r6, OooO00o2, OooO00o3, OooO00o4), r6);
        if (OooO00o5.size() == 0) {
            OooO00o5.addAll(OooO00o(OooO00o(new C9801LIL(), OooO00o2, OooO00o3, OooO00o4), r6));
        }
        return OooO00o5;
    }
}
