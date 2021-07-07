package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CertSelector;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.pd.sdk.liIlI1 */
public class liIlI1 extends L1lLI {
    public Set OooO0o0 = Collections.EMPTY_SET;
    public int o0ooOoO = 5;

    public liIlI1(Set set, AbstractC6317ilLi illi) throws InvalidAlgorithmParameterException {
        super(set);
        OooO00o(illi);
    }

    public static L1lLI OooO00o(PKIXParameters pKIXParameters) {
        try {
            liIlI1 liili1 = new liIlI1(pKIXParameters.getTrustAnchors(), C6175iLLl.OooO00o((X509CertSelector) pKIXParameters.getTargetCertConstraints()));
            liili1.m17743OooO00o(pKIXParameters);
            return liili1;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override // com.p118pd.sdk.L1lLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17743OooO00o(PKIXParameters pKIXParameters) {
        super.m15986OooO00o(pKIXParameters);
        if (pKIXParameters instanceof liIlI1) {
            liIlI1 liili1 = (liIlI1) pKIXParameters;
            this.o0ooOoO = liili1.o0ooOoO;
            this.OooO0o0 = new HashSet(liili1.OooO0o0);
        }
        if (pKIXParameters instanceof PKIXBuilderParameters) {
            this.o0ooOoO = ((PKIXBuilderParameters) pKIXParameters).getMaxPathLength();
        }
    }

    @Override // com.p118pd.sdk.L1lLI, com.p118pd.sdk.L1lLI, com.p118pd.sdk.L1lLI
    public int OooO0O0() {
        return this.o0ooOoO;
    }

    public void OooO0O0(int i) {
        if (i >= -1) {
            this.o0ooOoO = i;
            return;
        }
        throw new InvalidParameterException("The maximum path length parameter can not be less than -1.");
    }

    public Set OooO0o0() {
        return Collections.unmodifiableSet(this.OooO0o0);
    }

    public void OooO0o0(Set set) {
        if (set == null) {
            Set set2 = Collections.EMPTY_SET;
        } else {
            this.OooO0o0 = new HashSet(set);
        }
    }

    @Override // com.p118pd.sdk.L1lLI, java.lang.Object
    public Object clone() {
        try {
            liIlI1 liili1 = new liIlI1(getTrustAnchors(), m15983OooO00o());
            liili1.m17743OooO00o((PKIXParameters) this);
            return liili1;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
