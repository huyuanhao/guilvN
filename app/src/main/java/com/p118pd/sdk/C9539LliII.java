package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import org.bouncycastle.cert.crmf.CRMFException;
import org.bouncycastle.operator.RuntimeOperatorException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.丨Ll丨iII  reason: invalid class name and case insensitive filesystem */
public class C9539LliII {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5612LI1l f23102OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f23103OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6594lLi1l1 f23104OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23105OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C6456l1ilL f23106OooO0O0;
    public int OooO0OO;

    /* renamed from: com.pd.sdk.丨Ll丨iII$OooO00o */
    public class OooO00o implements AbstractC6296il1il1 {
        public final /* synthetic */ C5612LI1l OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ByteArrayOutputStream f23108OooO00o = new ByteArrayOutputStream();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ byte[] f23109OooO00o;

        public OooO00o(C5612LI1l r2, byte[] bArr) {
            this.OooO00o = r2;
            this.f23109OooO00o = bArr;
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        public LIiI11 OooO00o() {
            return new LIiI11(m21593OooO00o(), this.f23109OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public C6456l1ilL m21593OooO00o() {
            return new C6456l1ilL(lILIlI.OooO00o, this.OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m21594OooO00o() {
            return this.f23108OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1, com.p118pd.sdk.AbstractC6296il1il1
        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m21595OooO00o() {
            try {
                return C9539LliII.this.f23104OooO00o.OooO00o(this.f23109OooO00o, this.f23108OooO00o.toByteArray());
            } catch (CRMFException e) {
                throw new RuntimeOperatorException("exception calculating mac: " + e.getMessage(), e);
            }
        }
    }

    public C9539LliII(C6456l1ilL r2, int i, C6456l1ilL r4, AbstractC6594lLi1l1 r5) {
        this.OooO0O0 = 20;
        this.f23103OooO00o = r2;
        this.OooO00o = i;
        this.f23106OooO0O0 = r4;
        this.f23104OooO00o = r5;
    }

    public C9539LliII(AbstractC6594lLi1l1 r5) {
        this(new C6456l1ilL(AbstractC9733l.OooO), 1000, new C6456l1ilL(AbstractC5604L1ll.OooOOOO, C6452l1Lll.OooO00o), r5);
    }

    public C9539LliII(AbstractC6594lLi1l1 r2, int i) {
        this.OooO0O0 = 20;
        this.OooO0OO = i;
        this.f23104OooO00o = r2;
    }

    private AbstractC6296il1il1 OooO00o(C5612LI1l r5, char[] cArr) throws CRMFException {
        byte[] OooO0O02 = Strings.OooO0O0(cArr);
        byte[] OooO00o2 = r5.m16021OooO00o().m17938OooO00o();
        byte[] bArr = new byte[(OooO0O02.length + OooO00o2.length)];
        System.arraycopy(OooO0O02, 0, bArr, 0, OooO0O02.length);
        System.arraycopy(OooO00o2, 0, bArr, OooO0O02.length, OooO00o2.length);
        this.f23104OooO00o.OooO00o(r5.m16022OooO0O0(), r5.OooO00o());
        int intValue = r5.m16020OooO00o().m17647OooO0O0().intValue();
        do {
            bArr = this.f23104OooO00o.OooO00o(bArr);
            intValue--;
        } while (intValue > 0);
        return new OooO00o(r5, bArr);
    }

    private void OooO00o(int i) {
        int i2 = this.OooO0OO;
        if (i2 > 0 && i > i2) {
            throw new IllegalArgumentException("iteration count exceeds limit (" + i + " > " + this.OooO0OO + C3848l.f10402t);
        }
    }

    public AbstractC6296il1il1 OooO00o(char[] cArr) throws CRMFException {
        C5612LI1l r0 = this.f23102OooO00o;
        if (r0 != null) {
            return OooO00o(r0, cArr);
        }
        byte[] bArr = new byte[this.OooO0O0];
        if (this.f23105OooO00o == null) {
            this.f23105OooO00o = new SecureRandom();
        }
        this.f23105OooO00o.nextBytes(bArr);
        return OooO00o(new C5612LI1l(bArr, this.f23103OooO00o, this.OooO00o, this.f23106OooO0O0), cArr);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9539LliII m21592OooO00o(int i) {
        if (i >= 100) {
            OooO00o(i);
            this.OooO00o = i;
            return this;
        }
        throw new IllegalArgumentException("iteration count must be at least 100");
    }

    public C9539LliII OooO00o(C5612LI1l r2) {
        OooO00o(r2.m16020OooO00o().m17647OooO0O0().intValue());
        this.f23102OooO00o = r2;
        return this;
    }

    public C9539LliII OooO00o(SecureRandom secureRandom) {
        this.f23105OooO00o = secureRandom;
        return this;
    }

    public C9539LliII OooO0O0(int i) {
        if (i >= 8) {
            this.OooO0O0 = i;
            return this;
        }
        throw new IllegalArgumentException("salt length must be at least 8 bytes");
    }
}
