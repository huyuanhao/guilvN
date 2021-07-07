package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC9523Ll1LI;
import java.security.SecureRandom;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.lI11L1I1 */
public abstract class lI11L1I1 implements AbstractC5760Lil {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LlLI1 f18315OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f18316OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9523Ll1LI.OooO00o f18317OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18318OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18319OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public char[] f18320OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;

    public lI11L1I1(LlLI1 llLI1, char[] cArr) {
        this(llLI1, cArr, OooO00o(llLI1), ((Integer) C5233IIl.OooO0O0.get(llLI1)).intValue());
    }

    public lI11L1I1(LlLI1 llLI1, char[] cArr, int i, int i2) {
        this.f18320OooO00o = cArr;
        this.OooO00o = 1;
        this.f18315OooO00o = llLI1;
        this.OooO0O0 = i;
        this.OooO0OO = i2;
        this.f18317OooO00o = AbstractC9523Ll1LI.OooO00o.OooO00o;
        this.OooO0Oo = 1024;
    }

    public static int OooO00o(LlLI1 llLI1) {
        Integer num = (Integer) C5233IIl.OooO00o.get(llLI1);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("cannot find key size for algorithm: " + llLI1);
    }

    public lI11L1I1 OooO00o(int i) {
        this.OooO00o = i;
        return this;
    }

    public lI11L1I1 OooO00o(AbstractC9523Ll1LI.OooO00o oooO00o) {
        this.f18317OooO00o = oooO00o;
        return this;
    }

    public lI11L1I1 OooO00o(SecureRandom secureRandom) {
        this.f18318OooO00o = secureRandom;
        return this;
    }

    public lI11L1I1 OooO00o(byte[] bArr, int i) {
        this.f18319OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.OooO0Oo = i;
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC5760Lil
    public C1lIii OooO00o(LIiI11 r8) throws CMSException {
        byte[] bArr = new byte[this.OooO0OO];
        if (this.f18318OooO00o == null) {
            this.f18318OooO00o = new SecureRandom();
        }
        this.f18318OooO00o.nextBytes(bArr);
        if (this.f18319OooO00o == null) {
            byte[] bArr2 = new byte[20];
            this.f18319OooO00o = bArr2;
            this.f18318OooO00o.nextBytes(bArr2);
        }
        C6456l1ilL r1 = new C6456l1ilL(AbstractC5711LiLli.OoooOo0, new C5772LlIII(this.f18319OooO00o, this.OooO0Oo, this.f18317OooO00o.f23096OooO00o));
        this.f18316OooO00o = r1;
        C6487lIIiIlL r12 = new C6487lIIiIlL(OooO00o(new C6456l1ilL(this.f18315OooO00o, new C6487lIIiIlL(bArr)), OooO00o(this.OooO00o, r1, this.OooO0O0), r8));
        iILLL1 r82 = new iILLL1();
        r82.OooO00o(this.f18315OooO00o);
        r82.OooO00o(new C6487lIIiIlL(bArr));
        return new C1lIii(new C6404il(this.f18316OooO00o, new C6456l1ilL(AbstractC5711LiLli.o0000OOo, new C5707LiL1(r82)), r12));
    }

    public abstract byte[] OooO00o(int i, C6456l1ilL v, int i2) throws CMSException;

    public abstract byte[] OooO00o(C6456l1ilL v, byte[] bArr, LIiI11 v2) throws CMSException;
}
