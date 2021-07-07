package com.p118pd.sdk;

import java.io.OutputStream;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.RuntimeOperatorException;

/* renamed from: com.pd.sdk.llLI  reason: case insensitive filesystem */
public abstract class AbstractC6770llLI {
    public C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9677lI1li f18759OooO00o = C5725Liill.OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18760OooO00o;
    public C6456l1ilL OooO0O0;

    /* renamed from: com.pd.sdk.llLI$OooO00o */
    public class OooO00o implements Lii1ii1 {
        public li1l1iL OooO00o = new li1l1iL(this.f18762OooO00o);

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC93171I1 f18762OooO00o;

        public OooO00o(AbstractC93171I1 r2) {
            this.f18762OooO00o = r2;
        }

        @Override // com.p118pd.sdk.Lii1ii1, com.p118pd.sdk.Lii1ii1
        public C6456l1ilL OooO00o() {
            return AbstractC6770llLI.this.OooO00o;
        }

        @Override // com.p118pd.sdk.Lii1ii1, com.p118pd.sdk.Lii1ii1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m17876OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.Lii1ii1
        public byte[] getSignature() {
            try {
                return this.OooO00o.OooO0O0();
            } catch (CryptoException e) {
                throw new RuntimeOperatorException("exception obtaining signature: " + e.getMessage(), e);
            }
        }
    }

    public AbstractC6770llLI(C6456l1ilL r1, C6456l1ilL r2) {
        this.OooO00o = r1;
        this.OooO0O0 = r2;
    }

    public Lii1ii1 OooO00o(C6213iL11I r5) throws OperatorCreationException {
        AbstractC93171I1 OooO00o2 = OooO00o(this.OooO00o, this.OooO0O0);
        SecureRandom secureRandom = this.f18760OooO00o;
        if (secureRandom != null) {
            OooO00o2.OooO00o(true, new liLL1l(r5, secureRandom));
        } else {
            OooO00o2.OooO00o(true, r5);
        }
        return new OooO00o(OooO00o2);
    }

    public AbstractC6770llLI OooO00o(SecureRandom secureRandom) {
        this.f18760OooO00o = secureRandom;
        return this;
    }

    public abstract AbstractC93171I1 OooO00o(C6456l1ilL v, C6456l1ilL v2) throws OperatorCreationException;
}
