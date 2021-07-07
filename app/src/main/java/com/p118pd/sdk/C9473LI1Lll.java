package com.p118pd.sdk;

import org.bouncycastle.cms.CMSException;
import org.bouncycastle.pkcs.PKCSException;

/* renamed from: com.pd.sdk.丨LI1Ll丨l  reason: invalid class name and case insensitive filesystem */
public class C9473LI1Lll {
    public I11li1 OooO00o;

    public C9473LI1Lll(C6903lil r3) {
        if (!r3.OooO00o().equals(AbstractC5711LiLli.o00oO0o)) {
            this.OooO00o = I11li1.OooO00o((Object) AbstractC6804llL1ii.OooO00o(r3.m18069OooO0O0()).m17938OooO00o());
            return;
        }
        throw new IllegalArgumentException("encryptedData requires constructor with decryptor.");
    }

    public C9473LI1Lll(C6903lil r3, AbstractC6429iliL r4) throws PKCSException {
        if (r3.OooO00o().equals(AbstractC5711LiLli.o00oO0o)) {
            try {
                this.OooO00o = I11li1.OooO00o((Object) new C5823L11(C5753LiI1.OooO00o(r3)).m16417OooO00o(r4));
            } catch (CMSException e) {
                throw new PKCSException("unable to extract data: " + e.getMessage(), e);
            }
        } else {
            throw new IllegalArgumentException("encryptedData requires constructor with decryptor.");
        }
    }

    public C6481lI1i[] OooO00o() {
        C6481lI1i[] li1iArr = new C6481lI1i[this.OooO00o.size()];
        for (int i = 0; i != this.OooO00o.size(); i++) {
            li1iArr[i] = new C6481lI1i(C5717LiiIll.OooO00o(this.OooO00o.OooO00o(i)));
        }
        return li1iArr;
    }
}
