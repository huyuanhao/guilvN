package com.p118pd.sdk;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.Li丨I  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC5752LiI implements lILLi1iL {
    public static AbstractC5430IlIl OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Set f16658OooO00o;
    public static AbstractC5430IlIl OooO0O0 = new C6516lIl1Li();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Illiiil f16659OooO00o = new C9702liIIL();

    /* renamed from: OooO00o  reason: collision with other field name */
    public LIlL f16660OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PrivateKey f16661OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public LIlL f16662OooO0O0;

    /* renamed from: com.pd.sdk.Li丨I$OooO00o */
    public static class OooO00o implements AbstractC5430IlIl {
        @Override // com.p118pd.sdk.AbstractC5430IlIl
        public byte[] OooO00o(C6456l1ilL r4, int i, byte[] bArr) {
            try {
                return new LiiLIiIL(new C6456l1ilL(r4.OooO00o(), C6452l1Lll.OooO00o), bArr, AbstractC6464l1l.OooO00o(i)).OooO00o(AbstractC5533IiL.OooO00o);
            } catch (IOException e) {
                throw new IllegalStateException("Unable to create KDF material: " + e);
            }
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f16658OooO00o = hashSet;
        hashSet.add(AbstractC5420Il1iIL.o00Oo00);
        f16658OooO00o.add(AbstractC5420Il1iIL.o00Oo0O0);
    }

    public AbstractC5752LiI(PrivateKey privateKey) {
        LIlL lIlL = new LIlL(new C6858liI());
        this.f16660OooO00o = lIlL;
        this.f16662OooO0O0 = lIlL;
        this.f16661OooO00o = privateKey;
    }

    private Key OooO00o(LlLI1 llLI1, SecretKey secretKey, LlLI1 llLI12, byte[] bArr) throws CMSException, InvalidKeyException, NoSuchAlgorithmException {
        Cipher OooO00o2 = this.f16660OooO00o.m16122OooO00o(llLI1);
        OooO00o2.init(4, secretKey);
        return OooO00o2.unwrap(bArr, this.f16660OooO00o.OooO00o(llLI12), 3);
    }

    private SecretKey OooO00o(C6456l1ilL r6, C6456l1ilL r7, PublicKey publicKey, AbstractC6804llL1ii r9, PrivateKey privateKey, AbstractC5430IlIl ilIl) throws CMSException, GeneralSecurityException, IOException {
        C6350illI1i r2 = null;
        byte[] bArr = null;
        r2 = null;
        if (C5334IL1.OooO0OO(r6.OooO00o())) {
            C5794LliLiLl OooO00o2 = C5794LliLiLl.OooO00o(r9.m17938OooO00o());
            PublicKey generatePublic = this.f16660OooO00o.m16120OooO00o(r6.OooO00o()).generatePublic(new X509EncodedKeySpec(new C6888ll(OooO00o(), OooO00o2.OooO00o().OooO00o().m15475OooO00o()).getEncoded()));
            KeyAgreement OooO00o3 = this.f16660OooO00o.m16123OooO00o(r6.OooO00o());
            if (OooO00o2.m16397OooO00o() != null) {
                bArr = OooO00o2.m16397OooO00o().m17938OooO00o();
            }
            AbstractC5430IlIl ilIl2 = OooO00o;
            if (ilIl == ilIl2) {
                bArr = ilIl2.OooO00o(r7, this.f16659OooO00o.OooO00o(r7), bArr);
            }
            OooO00o3.init(privateKey, new IilLi1(privateKey, generatePublic, bArr));
            OooO00o3.doPhase(publicKey, true);
            return OooO00o3.generateSecret(r7.OooO00o().m16387OooO0O0());
        }
        KeyAgreement OooO00o4 = this.f16660OooO00o.m16123OooO00o(r6.OooO00o());
        if (C5334IL1.OooO00o(r6.OooO00o())) {
            int OooO00o5 = this.f16659OooO00o.OooO00o(r7);
            r2 = r9 != null ? new C6350illI1i(ilIl.OooO00o(r7, OooO00o5, r9.m17938OooO00o())) : new C6350illI1i(ilIl.OooO00o(r7, OooO00o5, null));
        } else if (C5334IL1.OooO0Oo(r6.OooO00o())) {
            if (r9 != null) {
                r2 = new C6350illI1i(r9.m17938OooO00o());
            }
        } else if (!C5334IL1.OooO0O0(r6.OooO00o())) {
            throw new CMSException("Unknown key agreement algorithm: " + r6.OooO00o());
        } else if (r9 != null) {
            r2 = new C6350illI1i(r9.m17938OooO00o());
        }
        OooO00o4.init(privateKey, r2);
        OooO00o4.doPhase(publicKey, true);
        return OooO00o4.generateSecret(r7.OooO00o().m16387OooO0O0());
    }

    public AbstractC5752LiI OooO00o(String str) {
        this.f16662OooO0O0 = C5334IL1.OooO00o(str);
        return this;
    }

    public AbstractC5752LiI OooO00o(Provider provider) {
        this.f16662OooO0O0 = C5334IL1.OooO00o(provider);
        return this;
    }

    @Override // com.p118pd.sdk.lILLi1iL
    public C6456l1ilL OooO00o() {
        return C5464IlilIi.OooO00o(this.f16661OooO00o.getEncoded()).m15707OooO0O0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c1, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c9, code lost:
        throw new org.bouncycastle.cms.CMSException("originator key invalid.", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ca, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d2, code lost:
        throw new org.bouncycastle.cms.CMSException("required padding not supported.", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d3, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00db, code lost:
        throw new org.bouncycastle.cms.CMSException("originator key spec invalid.", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00dc, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e4, code lost:
        throw new org.bouncycastle.cms.CMSException("key invalid in message.", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e5, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ed, code lost:
        throw new org.bouncycastle.cms.CMSException("can't find algorithm.", r9);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c1 A[ExcHandler: Exception (r9v5 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ca A[ExcHandler: NoSuchPaddingException (r9v4 'e' javax.crypto.NoSuchPaddingException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d3 A[ExcHandler: InvalidKeySpecException (r9v3 'e' java.security.spec.InvalidKeySpecException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e5 A[ExcHandler: NoSuchAlgorithmException (r9v1 'e' java.security.NoSuchAlgorithmException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    @Override // com.p118pd.sdk.lILLi1iL
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.security.Key OooO00o(com.p118pd.sdk.C6456l1ilL r9, com.p118pd.sdk.C6456l1ilL r10, com.p118pd.sdk.C6888ll r11, com.p118pd.sdk.AbstractC6804llL1ii r12, byte[] r13) throws org.bouncycastle.cms.CMSException {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.AbstractC5752LiI.OooO00o(com.pd.sdk.l1i丨lL丨丨, com.pd.sdk.l1i丨lL丨丨, com.pd.sdk.l丨l丨, com.pd.sdk.ll丨L1ii, byte[]):java.security.Key");
    }

    public AbstractC5752LiI OooO0O0(String str) {
        LIlL lIlL = new LIlL(new C6224ii11l(str));
        this.f16660OooO00o = lIlL;
        this.f16662OooO0O0 = lIlL;
        return this;
    }

    public AbstractC5752LiI OooO0O0(Provider provider) {
        LIlL lIlL = new LIlL(new C9443ILiII(provider));
        this.f16660OooO00o = lIlL;
        this.f16662OooO0O0 = lIlL;
        return this;
    }
}
