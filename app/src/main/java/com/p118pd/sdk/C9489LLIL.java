package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.丨LLIL  reason: invalid class name and case insensitive filesystem */
public class C9489LLIL implements i11ILLIi {
    public final C1II1L OooO00o;

    public C9489LLIL(C1II1L r1) {
        this.OooO00o = r1;
    }

    public C9489LLIL(byte[] bArr) {
        this.OooO00o = C1II1L.OooO00o(bArr);
    }

    public AbstractC6122iIlLiL OooO00o() {
        return this.OooO00o.OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6888ll m21540OooO00o() {
        return this.OooO00o.m21265OooO00o().m21727OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1II1L m21541OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9682lIL m21542OooO00o() {
        return this.OooO00o.m21265OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21543OooO00o() {
        return this.OooO00o.m21265OooO00o().OooO00o().OooO00o();
    }

    public PublicKey OooO00o(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeyException {
        C6888ll OooO00o2 = this.OooO00o.m21265OooO00o().m21727OooO00o();
        try {
            return KeyFactory.getInstance(OooO00o2.m18041OooO00o().OooO00o().m16387OooO0O0(), str).generatePublic(new X509EncodedKeySpec(new iIilII1(OooO00o2).OooO0O0()));
        } catch (Exception unused) {
            throw new InvalidKeyException("error encoding public key");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21544OooO00o() throws NoSuchAlgorithmException, SignatureException, NoSuchProviderException, InvalidKeyException {
        return m21545OooO00o((String) null);
    }

    public boolean OooO00o(AbstractC9449II r4) throws OperatorCreationException, IOException {
        lliLLL OooO00o2 = r4.OooO00o(this.OooO00o.m21264OooO00o());
        OutputStream OooO00o3 = OooO00o2.m17912OooO00o();
        new C6119iIl1il(OooO00o3).OooO00o(this.OooO00o.m21265OooO00o());
        OooO00o3.close();
        return OooO00o2.verify(this.OooO00o.OooO00o().OooO0O0());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21545OooO00o(String str) throws NoSuchAlgorithmException, SignatureException, NoSuchProviderException, InvalidKeyException {
        String OooO0O0 = this.OooO00o.m21264OooO00o().OooO00o().m16387OooO0O0();
        Signature instance = str == null ? Signature.getInstance(OooO0O0) : Signature.getInstance(OooO0O0, str);
        instance.initVerify(OooO00o(str));
        try {
            instance.update(this.OooO00o.m21265OooO00o().getEncoded());
            return instance.verify(this.OooO00o.OooO00o().m15475OooO00o());
        } catch (Exception unused) {
            throw new InvalidKeyException("error encoding public key");
        }
    }

    @Override // com.p118pd.sdk.i11ILLIi
    public byte[] getEncoded() throws IOException {
        return m21541OooO00o().getEncoded();
    }
}
