package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.ShortBufferException;
import org.bouncycastle.pqc.jcajce.provider.newhope.BCNHPrivateKey;
import org.bouncycastle.pqc.jcajce.provider.newhope.BCNHPublicKey;

/* renamed from: com.pd.sdk.IL丨lI1  reason: invalid class name */
public class ILlI1 extends AbstractC5549Ii1 {
    public IliILllI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public i1lLLi f15656OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BCNHPublicKey f15657OooO00o;
    public byte[] OooO0O0;

    public ILlI1() {
        super("NH", null);
    }

    @Override // com.p118pd.sdk.AbstractC5549Ii1
    public byte[] OooO00o() {
        return engineGenerateSecret();
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        if (z) {
            BCNHPublicKey bCNHPublicKey = (BCNHPublicKey) key;
            this.f15657OooO00o = bCNHPublicKey;
            IliILllI iliILllI = this.OooO00o;
            if (iliILllI != null) {
                C6595lLiLl OooO00o2 = iliILllI.OooO00o((C6213iL11I) bCNHPublicKey.getKeyParams());
                this.OooO0O0 = OooO00o2.m17690OooO00o();
                return new BCNHPublicKey((IL1IILIl) OooO00o2.OooO00o());
            }
            this.OooO0O0 = this.f15656OooO00o.m21618OooO00o(bCNHPublicKey.getKeyParams());
            return null;
        }
        throw new IllegalStateException("NewHope can only be between two parties.");
    }

    @Override // javax.crypto.KeyAgreementSpi, com.p118pd.sdk.AbstractC5549Ii1
    public int engineGenerateSecret(byte[] bArr, int i) throws IllegalStateException, ShortBufferException {
        byte[] bArr2 = this.OooO0O0;
        System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
        C9586iIILl.OooO00o(this.OooO0O0, (byte) 0);
        return this.OooO0O0.length;
    }

    @Override // javax.crypto.KeyAgreementSpi, com.p118pd.sdk.AbstractC5549Ii1
    public byte[] engineGenerateSecret() throws IllegalStateException {
        byte[] OooO00o2 = C9586iIILl.m21630OooO00o(this.OooO0O0);
        C9586iIILl.OooO00o(this.OooO0O0, (byte) 0);
        return OooO00o2;
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (key != null) {
            i1lLLi r2 = new i1lLLi();
            this.f15656OooO00o = r2;
            r2.OooO00o(((BCNHPrivateKey) key).getKeyParams());
            return;
        }
        this.OooO00o = new IliILllI(secureRandom);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException("NewHope does not require parameters");
    }
}
