package com.p118pd.sdk;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.丨i丨丨l  reason: invalid class name and case insensitive filesystem */
public class C9653il implements iLlLIL1 {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1iLii f23249OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9479LIiIL1i f23250OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Long f23251OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Set<String> f23252OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SSLSocketFactory f23253OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f23254OooO00o;

    public C9653il(SSLSocketFactory sSLSocketFactory, AbstractC9479LIiIL1i r2, int i, LL1iLii r4, Set<String> set, Long l, boolean z) throws GeneralSecurityException {
        this.f23253OooO00o = sSLSocketFactory;
        this.f23250OooO00o = r2;
        this.OooO00o = i;
        this.f23249OooO00o = r4;
        this.f23252OooO00o = set;
        this.f23251OooO00o = l;
        this.f23254OooO00o = z;
    }

    @Override // com.p118pd.sdk.iLlLIL1
    public C111 OooO00o(String str, int i) throws IOException {
        SSLSocket sSLSocket = (SSLSocket) this.f23253OooO00o.createSocket(str, i);
        sSLSocket.setSoTimeout(this.OooO00o);
        Set<String> set = this.f23252OooO00o;
        if (set != null && !set.isEmpty()) {
            if (this.f23254OooO00o) {
                HashSet hashSet = new HashSet();
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                for (int i2 = 0; i2 != supportedCipherSuites.length; i2++) {
                    hashSet.add(supportedCipherSuites[i2]);
                }
                ArrayList arrayList = new ArrayList();
                for (String str2 : this.f23252OooO00o) {
                    if (hashSet.contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
                } else {
                    throw new IllegalStateException("No supplied cipher suite is supported by the provider.");
                }
            } else {
                Set<String> set2 = this.f23252OooO00o;
                sSLSocket.setEnabledCipherSuites((String[]) set2.toArray(new String[set2.size()]));
            }
        }
        sSLSocket.startHandshake();
        AbstractC9479LIiIL1i r0 = this.f23250OooO00o;
        if (r0 == null || r0.OooO00o(str, sSLSocket.getSession())) {
            String OooO00o2 = Strings.OooO00o(sSLSocket.getSession().getCipherSuite());
            if (OooO00o2.contains("_des_") || OooO00o2.contains("_des40_") || OooO00o2.contains("_3des_")) {
                throw new IOException("EST clients must not use DES ciphers");
            } else if (Strings.OooO00o(sSLSocket.getSession().getCipherSuite()).contains("null")) {
                throw new IOException("EST clients must not use NULL ciphers");
            } else if (Strings.OooO00o(sSLSocket.getSession().getCipherSuite()).contains("anon")) {
                throw new IOException("EST clients must not use anon ciphers");
            } else if (Strings.OooO00o(sSLSocket.getSession().getCipherSuite()).contains("export")) {
                throw new IOException("EST clients must not use export ciphers");
            } else if (!sSLSocket.getSession().getProtocol().equalsIgnoreCase("tlsv1")) {
                AbstractC9479LIiIL1i r02 = this.f23250OooO00o;
                if (r02 == null || r02.OooO00o(str, sSLSocket.getSession())) {
                    return new C5671LLl(sSLSocket, this.f23249OooO00o, this.f23251OooO00o);
                }
                throw new IOException("Hostname was not verified: " + str);
            } else {
                try {
                    sSLSocket.close();
                } catch (Exception unused) {
                }
                throw new IOException("EST clients must not use TLSv1");
            }
        } else {
            throw new IOException("Host name could not be verified.");
        }
    }
}
