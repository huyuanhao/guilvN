package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSession;
import org.bouncycastle.est.ESTException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.iiI1LI1 */
public class iiI1LI1 implements AbstractC9479LIiIL1i {
    public static Logger OooO00o = Logger.getLogger(iiI1LI1.class.getName());

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Set<String> f17842OooO00o;

    public iiI1LI1(Set<String> set) {
        this.f17842OooO00o = set;
    }

    public static boolean OooO00o(String str, String str2, Set<String> set) throws IOException {
        if (!str2.contains("*")) {
            return str.equalsIgnoreCase(str2);
        }
        int indexOf = str2.indexOf(42);
        if (indexOf != str2.lastIndexOf("*") || str2.contains("..") || str2.charAt(str2.length() - 1) == '*') {
            return false;
        }
        int indexOf2 = str2.indexOf(46, indexOf);
        if (set == null || !set.contains(Strings.OooO00o(str2.substring(indexOf2)))) {
            String OooO00o2 = Strings.OooO00o(str2.substring(indexOf + 1));
            String OooO00o3 = Strings.OooO00o(str);
            if (OooO00o3.equals(OooO00o2) || OooO00o2.length() > OooO00o3.length()) {
                return false;
            }
            if (indexOf > 0) {
                return OooO00o3.startsWith(str2.substring(0, indexOf)) && OooO00o3.endsWith(OooO00o2) && OooO00o3.substring(indexOf, OooO00o3.length() - OooO00o2.length()).indexOf(46) < 0;
            }
            if (OooO00o3.substring(0, OooO00o3.length() - OooO00o2.length()).indexOf(46) > 0) {
                return false;
            }
            return OooO00o3.endsWith(OooO00o2);
        }
        throw new IOException("Wildcard `" + str2 + "` matches known public suffix.");
    }

    public boolean OooO00o(String str, X509Certificate x509Certificate) throws IOException {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                for (List<?> list : subjectAlternativeNames) {
                    int intValue = ((Number) list.get(0)).intValue();
                    if (intValue != 2) {
                        if (intValue != 7) {
                            if (OooO00o.isLoggable(Level.INFO)) {
                                String OooO00o2 = list.get(1) instanceof byte[] ? C6472l1l1l.OooO00o((byte[]) list.get(1)) : list.get(1).toString();
                                Logger logger = OooO00o;
                                Level level = Level.INFO;
                                logger.log(level, "ignoring type " + intValue + " value = " + OooO00o2);
                            }
                        } else if (InetAddress.getByName(str).equals(InetAddress.getByName(list.get(1).toString()))) {
                            return true;
                        }
                    } else if (OooO00o(str, list.get(1).toString(), this.f17842OooO00o)) {
                        return true;
                    }
                }
                return false;
            } else if (x509Certificate.getSubjectX500Principal() == null) {
                return false;
            } else {
                LILlIL[] OooO00o3 = l1LILI1.OooO00o(x509Certificate.getSubjectX500Principal().getEncoded()).m17571OooO00o();
                for (int i = 0; i != OooO00o3.length; i++) {
                    LILlIL lILlIL = OooO00o3[i];
                    C5605L1ll[] OooO00o4 = lILlIL.m16061OooO00o();
                    for (int i2 = 0; i2 != OooO00o4.length; i2++) {
                        if (OooO00o4[i2].OooO00o().equals(C9388IiLL.OooO0o0)) {
                            return OooO00o(str, lILlIL.OooO00o().m16007OooO0O0().toString(), this.f17842OooO00o);
                        }
                    }
                }
                return false;
            }
        } catch (Exception e) {
            throw new ESTException(e.getMessage(), e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9479LIiIL1i
    public boolean OooO00o(String str, SSLSession sSLSession) throws IOException {
        try {
            return OooO00o(str, (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(sSLSession.getPeerCertificates()[0].getEncoded())));
        } catch (Exception e) {
            if (e instanceof ESTException) {
                throw ((ESTException) e);
            }
            throw new ESTException(e.getMessage(), e);
        }
    }
}
