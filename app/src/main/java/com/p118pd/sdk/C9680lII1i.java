package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC6840lI;
import com.p118pd.sdk.LLLilLi;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;

/* renamed from: com.pd.sdk.丨lII1i丨  reason: invalid class name and case insensitive filesystem */
public class C9680lII1i extends MacSpi implements AbstractC6840lI {
    public static final Class OooO00o = C6443l1Il.OooO00o(C9680lII1i.class, "javax.crypto.spec.GCMParameterSpec");

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6769llL1L f23287OooO00o;
    public int o00oO0O = 2;
    public int o0ooOO0 = 1;
    public int o0ooOOo = 160;

    public C9680lII1i(AbstractC6769llL1L lll1l) {
        this.f23287OooO00o = lll1l;
    }

    public C9680lII1i(AbstractC6769llL1L lll1l, int i, int i2, int i3) {
        this.f23287OooO00o = lll1l;
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
        this.o0ooOOo = i3;
    }

    public static Hashtable OooO00o(Map map) {
        Hashtable hashtable = new Hashtable();
        for (Object obj : map.keySet()) {
            hashtable.put(obj, map.get(obj));
        }
        return hashtable;
    }

    public byte[] engineDoFinal() {
        byte[] bArr = new byte[engineGetMacLength()];
        this.f23287OooO00o.OooO00o(bArr, 0);
        return bArr;
    }

    public int engineGetMacLength() {
        return this.f23287OooO00o.OooO00o();
    }

    @Override // javax.crypto.MacSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AbstractC6370iIIIl r0;
        if (key != null) {
            if (key instanceof PKCS12Key) {
                try {
                    SecretKey secretKey = (SecretKey) key;
                    try {
                        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                        if ((secretKey instanceof PBEKey) && pBEParameterSpec == null) {
                            PBEKey pBEKey = (PBEKey) secretKey;
                            pBEParameterSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                        }
                        int i = 1;
                        int i2 = 256;
                        if (this.f23287OooO00o.m17871OooO00o().startsWith("GOST")) {
                            i = 6;
                        } else {
                            AbstractC6769llL1L lll1l = this.f23287OooO00o;
                            if ((lll1l instanceof C6383iLl1) && !lll1l.m17871OooO00o().startsWith(LL1i.OooO0O0)) {
                                if (this.f23287OooO00o.m17871OooO00o().startsWith(LL1i.OooO0OO)) {
                                    i = 7;
                                    i2 = C7967oO0oOo00.Ooooo0o;
                                } else if (this.f23287OooO00o.m17871OooO00o().startsWith(LL1i.OooO0Oo)) {
                                    i = 4;
                                } else if (this.f23287OooO00o.m17871OooO00o().startsWith(LL1i.f16409OooO0o0)) {
                                    i = 8;
                                    i2 = 384;
                                } else if (this.f23287OooO00o.m17871OooO00o().startsWith(LL1i.f16408OooO0o)) {
                                    i = 9;
                                    i2 = 512;
                                } else if (this.f23287OooO00o.m17871OooO00o().startsWith("RIPEMD160")) {
                                    i = 2;
                                } else {
                                    throw new InvalidAlgorithmParameterException("no PKCS12 mapping for HMAC: " + this.f23287OooO00o.m17871OooO00o());
                                }
                            }
                            i2 = 160;
                        }
                        r0 = AbstractC6840lI.OooO00o.OooO00o(secretKey, 2, i, i2, pBEParameterSpec);
                    } catch (Exception unused) {
                        throw new InvalidAlgorithmParameterException("PKCS12 requires a PBEParameterSpec");
                    }
                } catch (Exception unused2) {
                    throw new InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
                }
            } else if (key instanceof BCPBEKey) {
                BCPBEKey bCPBEKey = (BCPBEKey) key;
                if (bCPBEKey.getParam() != null) {
                    r0 = bCPBEKey.getParam();
                } else if (algorithmParameterSpec instanceof PBEParameterSpec) {
                    r0 = AbstractC6840lI.OooO00o.OooO00o(bCPBEKey, algorithmParameterSpec);
                } else {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
            } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                r0 = new C6642li1LI(key.getEncoded());
            } else {
                throw new InvalidAlgorithmParameterException("inappropriate parameter type: " + algorithmParameterSpec.getClass().getName());
            }
            C6642li1LI r1 = r0 instanceof C6274iilL1L ? (C6642li1LI) ((C6274iilL1L) r0).OooO00o() : (C6642li1LI) r0;
            if (algorithmParameterSpec instanceof C5363IiiI) {
                C5363IiiI iiiI = (C5363IiiI) algorithmParameterSpec;
                r0 = new C5553Iili(r1, iiiI.OooO00o(), iiiI.OooO0O0(), iiiI.m15612OooO00o());
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                r0 = new C6274iilL1L(r1, ((IvParameterSpec) algorithmParameterSpec).getIV());
            } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                r0 = new C6274iilL1L(new C6148iL11L(r1.OooO00o(), rC2ParameterSpec.getEffectiveKeyBits()), rC2ParameterSpec.getIV());
            } else if (algorithmParameterSpec instanceof C9467L1l) {
                r0 = new LLLilLi.OooO0O0(OooO00o(((C9467L1l) algorithmParameterSpec).OooO00o())).OooO00o(r1.OooO00o()).OooO00o();
            } else if (algorithmParameterSpec == null) {
                r0 = new C6642li1LI(key.getEncoded());
            } else {
                Class cls = OooO00o;
                if (cls != null && cls.isAssignableFrom(algorithmParameterSpec.getClass())) {
                    try {
                        r0 = new C5553Iili(r1, ((Integer) OooO00o.getDeclaredMethod("getTLen", new Class[0]).invoke(algorithmParameterSpec, new Object[0])).intValue(), (byte[]) OooO00o.getDeclaredMethod("getIV", new Class[0]).invoke(algorithmParameterSpec, new Object[0]));
                    } catch (Exception unused3) {
                        throw new InvalidAlgorithmParameterException("Cannot process GCMParameterSpec.");
                    }
                } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("unknown parameter type: " + algorithmParameterSpec.getClass().getName());
                }
            }
            try {
                this.f23287OooO00o.OooO00o(r0);
            } catch (Exception e) {
                throw new InvalidAlgorithmParameterException("cannot initialize MAC: " + e.getMessage());
            }
        } else {
            throw new InvalidKeyException("key is null");
        }
    }

    public void engineReset() {
        this.f23287OooO00o.reset();
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte b) {
        this.f23287OooO00o.update(b);
    }

    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.f23287OooO00o.update(bArr, i, i2);
    }
}
