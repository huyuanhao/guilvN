package com.p118pd.sdk;

import com.p118pd.sdk.C5771LlII;
import com.p118pd.sdk.C9703liILI;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import javax.crypto.Cipher;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.operator.jcajce.OperatorHelper;

/* renamed from: com.pd.sdk.ILIi丨  reason: invalid class name and case insensitive filesystem */
public class C5301ILIi extends AbstractC9728l1 {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f15574OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PublicKey f15575OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f15576OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OperatorHelper f15577OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f15578OooO00o;
    public final byte[] OooO0O0;

    public C5301ILIi(PublicKey publicKey, String str, int i, byte[] bArr, byte[] bArr2) {
        super(new C6456l1ilL(AbstractC5711LiLli.o0000Oo0, new C1693lI(new C6456l1ilL(AbstractC9849l1i1L.OooO0oo, new ILIIiI(new C6456l1ilL(AbstractC5420Il1iIL.o00OoOOO, new C6456l1ilL(AbstractC5905LllI.OooO0OO)), (i + 7) / 8)), Iiiii.OooO00o(str, i))));
        this.f15577OooO00o = new OperatorHelper(new ILLli());
        this.f15575OooO00o = publicKey;
        this.f15574OooO00o = str;
        this.OooO00o = i;
        this.f15578OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.OooO0O0 = C9586iIILl.m21630OooO00o(bArr2);
    }

    public C5301ILIi(X509Certificate x509Certificate, String str, int i, byte[] bArr, byte[] bArr2) {
        this(x509Certificate.getPublicKey(), str, i, bArr, bArr2);
    }

    public C5301ILIi OooO00o(String str) {
        this.f15577OooO00o = new OperatorHelper(new C9588iIi(str));
        return this;
    }

    public C5301ILIi OooO00o(Provider provider) {
        this.f15577OooO00o = new OperatorHelper(new LLIlii(provider));
        return this;
    }

    public C5301ILIi OooO00o(SecureRandom secureRandom) {
        this.f15576OooO00o = secureRandom;
        return this;
    }

    @Override // com.p118pd.sdk.lI111ll
    public byte[] OooO00o(LIiI11 r6) throws OperatorException {
        Cipher OooO00o2 = this.f15577OooO00o.OooO00o(OooO00o().OooO00o(), new HashMap());
        try {
            OooO00o2.init(3, this.f15575OooO00o, new C9703liILI.OooO0O0(this.f15574OooO00o, this.OooO00o, new C5771LlII.OooO0O0(Iiiii.OooO00o(this.f15574OooO00o, this.OooO00o), this.f15578OooO00o, this.OooO0O0).OooO00o().OooO00o()).OooO00o(), this.f15576OooO00o);
            return OooO00o2.wrap(C9799L1Il.OooO00o(r6));
        } catch (Exception e) {
            throw new OperatorException("Unable to wrap contents key: " + e.getMessage(), e);
        }
    }
}
