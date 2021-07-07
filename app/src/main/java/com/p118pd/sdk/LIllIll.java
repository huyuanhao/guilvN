package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.BCDSAPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.BCDSAPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.丨LIllIll  reason: invalid class name */
public class LIllIll extends KeyPairGenerator {
    public static Object OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Hashtable f23048OooO00o = new Hashtable();

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f23049OooO00o = 2048;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ILII f23050OooO00o = new ILII();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ILIIi1 f23051OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23052OooO00o = IIllii.OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23053OooO00o = false;

    public LIllIll() {
        super("DSA");
    }

    public KeyPair generateKeyPair() {
        C6891l r3;
        int i;
        SecureRandom secureRandom;
        if (!this.f23053OooO00o) {
            Integer OooO00o2 = I11I.OooO00o(this.f23049OooO00o);
            if (f23048OooO00o.containsKey(OooO00o2)) {
                this.f23051OooO00o = (ILIIi1) f23048OooO00o.get(OooO00o2);
            } else {
                synchronized (OooO00o) {
                    if (f23048OooO00o.containsKey(OooO00o2)) {
                        this.f23051OooO00o = (ILIIi1) f23048OooO00o.get(OooO00o2);
                    } else {
                        int OooO00o3 = C5746LilliL.OooO00o(this.f23049OooO00o);
                        if (this.f23049OooO00o == 1024) {
                            r3 = new C6891l();
                            if (C9358II1.m21422OooO00o("org.bouncycastle.dsa.FIPS186-2for1024bits")) {
                                i = this.f23049OooO00o;
                                secureRandom = this.f23052OooO00o;
                            } else {
                                r3.OooO00o(new IiLiII(1024, 160, OooO00o3, this.f23052OooO00o));
                                ILIIi1 r2 = new ILIIi1(this.f23052OooO00o, r3.OooO00o());
                                this.f23051OooO00o = r2;
                                f23048OooO00o.put(OooO00o2, r2);
                            }
                        } else if (this.f23049OooO00o > 1024) {
                            IiLiII r32 = new IiLiII(this.f23049OooO00o, 256, OooO00o3, this.f23052OooO00o);
                            C6891l r22 = new C6891l(new I1li1Ll());
                            r22.OooO00o(r32);
                            r3 = r22;
                            ILIIi1 r23 = new ILIIi1(this.f23052OooO00o, r3.OooO00o());
                            this.f23051OooO00o = r23;
                            f23048OooO00o.put(OooO00o2, r23);
                        } else {
                            r3 = new C6891l();
                            i = this.f23049OooO00o;
                            secureRandom = this.f23052OooO00o;
                        }
                        r3.OooO00o(i, OooO00o3, secureRandom);
                        ILIIi1 r232 = new ILIIi1(this.f23052OooO00o, r3.OooO00o());
                        this.f23051OooO00o = r232;
                        f23048OooO00o.put(OooO00o2, r232);
                    }
                }
            }
            this.f23050OooO00o.OooO00o(this.f23051OooO00o);
            this.f23053OooO00o = true;
        }
        i1LLl1L OooO00o4 = this.f23050OooO00o.OooO00o();
        return new KeyPair(new BCDSAPublicKey((C5242IIl) OooO00o4.OooO0O0()), new BCDSAPrivateKey((C5907Ll1LI) OooO00o4.OooO00o()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        boolean z;
        if (i < 512 || i > 4096 || ((i < 1024 && i % 64 != 0) || (i >= 1024 && i % 1024 != 0))) {
            throw new InvalidParameterException("strength must be from 512 - 4096 and a multiple of 1024 above 1024");
        }
        DSAParameterSpec OooO00o2 = BouncyCastleProvider.CONFIGURATION.OooO00o(i);
        if (OooO00o2 != null) {
            ILIIi1 r5 = new ILIIi1(secureRandom, new L1llLl1(OooO00o2.getP(), OooO00o2.getQ(), OooO00o2.getG()));
            this.f23051OooO00o = r5;
            this.f23050OooO00o.OooO00o(r5);
            z = true;
        } else {
            this.f23049OooO00o = i;
            this.f23052OooO00o = secureRandom;
            z = false;
        }
        this.f23053OooO00o = z;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof DSAParameterSpec) {
            DSAParameterSpec dSAParameterSpec = (DSAParameterSpec) algorithmParameterSpec;
            ILIIi1 r0 = new ILIIi1(secureRandom, new L1llLl1(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()));
            this.f23051OooO00o = r0;
            this.f23050OooO00o.OooO00o(r0);
            this.f23053OooO00o = true;
            return;
        }
        throw new InvalidAlgorithmParameterException("parameter object not a DSAParameterSpec");
    }
}
