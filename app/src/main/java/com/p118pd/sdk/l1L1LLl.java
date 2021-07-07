package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.p290dh.BCDHPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.p290dh.BCDHPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.l1L1LLl丨  reason: invalid class name */
public class l1L1LLl extends KeyPairGenerator {
    public static Object OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Hashtable f18259OooO00o = new Hashtable();

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f18260OooO00o = 2048;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6528lI1IL f18261OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6815l11li f18262OooO00o = new C6815l11li();

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18263OooO00o = IIllii.OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18264OooO00o = false;

    public l1L1LLl() {
        super("DH");
    }

    private C6528lI1IL OooO00o(SecureRandom secureRandom, DHParameterSpec dHParameterSpec) {
        return dHParameterSpec instanceof C5194I1 ? new C6528lI1IL(secureRandom, ((C5194I1) dHParameterSpec).m15342OooO00o()) : new C6528lI1IL(secureRandom, new C6017i1Il(dHParameterSpec.getP(), dHParameterSpec.getG(), null, dHParameterSpec.getL()));
    }

    public KeyPair generateKeyPair() {
        C6528lI1IL OooO00o2;
        if (!this.f18264OooO00o) {
            Integer OooO00o3 = I11I.OooO00o(this.f18260OooO00o);
            if (f18259OooO00o.containsKey(OooO00o3)) {
                OooO00o2 = (C6528lI1IL) f18259OooO00o.get(OooO00o3);
            } else {
                DHParameterSpec OooO00o4 = BouncyCastleProvider.CONFIGURATION.m21534OooO00o(this.f18260OooO00o);
                if (OooO00o4 != null) {
                    OooO00o2 = OooO00o(this.f18263OooO00o, OooO00o4);
                } else {
                    synchronized (OooO00o) {
                        if (f18259OooO00o.containsKey(OooO00o3)) {
                            this.f18261OooO00o = (C6528lI1IL) f18259OooO00o.get(OooO00o3);
                        } else {
                            C6369iII r2 = new C6369iII();
                            r2.OooO00o(this.f18260OooO00o, C5746LilliL.OooO00o(this.f18260OooO00o), this.f18263OooO00o);
                            C6528lI1IL r3 = new C6528lI1IL(this.f18263OooO00o, r2.OooO00o());
                            this.f18261OooO00o = r3;
                            f18259OooO00o.put(OooO00o3, r3);
                        }
                    }
                    this.f18262OooO00o.OooO00o(this.f18261OooO00o);
                    this.f18264OooO00o = true;
                }
            }
            this.f18261OooO00o = OooO00o2;
            this.f18262OooO00o.OooO00o(this.f18261OooO00o);
            this.f18264OooO00o = true;
        }
        i1LLl1L OooO00o5 = this.f18262OooO00o.OooO00o();
        return new KeyPair(new BCDHPublicKey((LiIiLii) OooO00o5.OooO0O0()), new BCDHPrivateKey((C6389ii) OooO00o5.OooO00o()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.f18260OooO00o = i;
        this.f18263OooO00o = secureRandom;
        this.f18264OooO00o = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof DHParameterSpec) {
            try {
                C6528lI1IL OooO00o2 = OooO00o(secureRandom, (DHParameterSpec) algorithmParameterSpec);
                this.f18261OooO00o = OooO00o2;
                this.f18262OooO00o.OooO00o(OooO00o2);
                this.f18264OooO00o = true;
            } catch (IllegalArgumentException e) {
                throw new InvalidAlgorithmParameterException(e.getMessage(), e);
            }
        } else {
            throw new InvalidAlgorithmParameterException("parameter object not a DHParameterSpec");
        }
    }
}
