package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TSPValidationException;

/* renamed from: com.pd.sdk.丨丨1LI1l  reason: invalid class name */
public class C1LI1l {
    public static Set OooO00o = Collections.unmodifiableSet(new HashSet());

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f23377OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6816l1Ii f23378OooO00o;

    public C1LI1l(C6816l1Ii r1) {
        this.f23378OooO00o = r1;
        this.f23377OooO00o = r1.m17951OooO00o();
    }

    public C1LI1l(InputStream inputStream) throws IOException {
        this(OooO00o(inputStream));
    }

    public C1LI1l(byte[] bArr) throws IOException {
        this(new ByteArrayInputStream(bArr));
    }

    public static C6816l1Ii OooO00o(InputStream inputStream) throws IOException {
        try {
            return C6816l1Ii.OooO00o(new C5805Ll1(inputStream).OooO00o());
        } catch (ClassCastException e) {
            throw new IOException("malformed request: " + e);
        } catch (IllegalArgumentException e2) {
            throw new IOException("malformed request: " + e2);
        }
    }

    private Set OooO00o(Set set) {
        if (set == null) {
            return set;
        }
        HashSet hashSet = new HashSet(set.size());
        for (Object obj : set) {
            if (obj instanceof String) {
                hashSet.add(new LlLI1((String) obj));
            } else {
                hashSet.add(obj);
            }
        }
        return hashSet;
    }

    public int OooO00o() {
        return this.f23378OooO00o.m17954OooO0O0().m17647OooO0O0().intValue();
    }

    public C5237III OooO00o(LlLI1 llLI1) {
        iI11IL r0 = this.f23377OooO00o;
        if (r0 != null) {
            return r0.OooO00o(llLI1);
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m21827OooO00o() {
        return this.f23378OooO00o.m17952OooO00o().OooO00o().OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iI11IL m21828OooO00o() {
        return this.f23377OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21829OooO00o() {
        if (this.f23378OooO00o.m17953OooO00o() != null) {
            return this.f23378OooO00o.m17953OooO00o().m17647OooO0O0();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List m21830OooO00o() {
        return IL11iL.OooO00o(this.f23377OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set m21831OooO00o() {
        return this.f23377OooO00o == null ? OooO00o : Collections.unmodifiableSet(new HashSet(Arrays.asList(this.f23377OooO00o.m17473OooO00o())));
    }

    public void OooO00o(Set set, Set set2, Set set3) throws TSPException {
        Set OooO00o2 = OooO00o(set);
        Set OooO00o3 = OooO00o(set2);
        Set OooO00o4 = OooO00o(set3);
        if (!OooO00o2.contains(m21827OooO00o())) {
            throw new TSPValidationException("request contains unknown algorithm", 128);
        } else if (OooO00o3 == null || OooO0O0() == null || OooO00o3.contains(OooO0O0())) {
            if (!(m21828OooO00o() == null || OooO00o4 == null)) {
                Enumeration OooO00o5 = m21828OooO00o().OooO00o();
                while (OooO00o5.hasMoreElements()) {
                    if (!OooO00o4.contains((LlLI1) OooO00o5.nextElement())) {
                        throw new TSPValidationException("request contains unknown extension", 8388608);
                    }
                }
            }
            if (IL11iL.OooO00o(m21827OooO00o().m16387OooO0O0()) != m21836OooO0O0().length) {
                throw new TSPValidationException("imprint digest the wrong length", 4);
            }
        } else {
            throw new TSPValidationException("request contains unknown policy", 256);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21832OooO00o() {
        if (this.f23378OooO00o.OooO00o() != null) {
            return this.f23378OooO00o.OooO00o().m15792OooO0O0();
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21833OooO00o() throws IOException {
        return this.f23378OooO00o.getEncoded();
    }

    public LlLI1 OooO0O0() {
        if (this.f23378OooO00o.m17950OooO00o() != null) {
            return this.f23378OooO00o.m17950OooO00o();
        }
        return null;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Set m21834OooO0O0() {
        return this.f23377OooO00o == null ? OooO00o : Collections.unmodifiableSet(new HashSet(Arrays.asList(this.f23377OooO00o.OooO0OO())));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m21835OooO0O0() {
        return this.f23377OooO00o != null;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m21836OooO0O0() {
        return this.f23378OooO00o.m17952OooO00o().m17633OooO00o();
    }
}
