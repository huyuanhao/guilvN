package org.bouncycastle.crypto.engines;

import com.p118pd.sdk.AbstractC6370iIIIl;
import com.p118pd.sdk.AbstractC6436l11LI;
import com.p118pd.sdk.C6236iiI1l;
import com.p118pd.sdk.C9617iiLil;
import com.p118pd.sdk.I1LiIl;
import com.p118pd.sdk.IIiL;
import com.p118pd.sdk.IIllii;
import com.p118pd.sdk.liLL1l;
import com.p118pd.sdk.liiilI;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.DataLengthException;

public class CramerShoupCoreEngine {
    public static final BigInteger OooO00o = BigInteger.valueOf(1);

    /* renamed from: OooO00o  reason: collision with other field name */
    public I1LiIl f23886OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f23887OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23888OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23889OooO00o;

    public static class CramerShoupCiphertextException extends Exception {
        public static final long serialVersionUID = -6360977166495345076L;

        public CramerShoupCiphertextException(String str) {
            super(str);
        }
    }

    private BigInteger OooO00o(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger bigInteger2 = OooO00o;
        return IIiL.OooO00o(bigInteger2, bigInteger.subtract(bigInteger2), secureRandom);
    }

    private boolean OooO00o(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.compareTo(bigInteger2) < 0;
    }

    public int OooO00o() {
        int bitLength = (this.f23886OooO00o.OooO00o().OooO0OO().bitLength() + 7) / 8;
        return this.f23889OooO00o ? bitLength - 1 : bitLength;
    }

    public liiilI OooO00o(BigInteger bigInteger) {
        if (this.f23886OooO00o.OooO00o() || !this.f23889OooO00o) {
            return null;
        }
        I1LiIl r0 = this.f23886OooO00o;
        if (!(r0 instanceof C6236iiI1l)) {
            return null;
        }
        C6236iiI1l r02 = (C6236iiI1l) r0;
        BigInteger OooO0OO = r02.OooO00o().OooO0OO();
        BigInteger OooO00o2 = r02.OooO00o().m15877OooO00o();
        BigInteger OooO0O0 = r02.OooO00o().OooO0O0();
        BigInteger OooO0OO2 = r02.OooO0OO();
        if (!OooO00o(bigInteger, OooO0OO)) {
            return null;
        }
        BigInteger OooO00o3 = OooO00o(OooO0OO, this.f23888OooO00o);
        BigInteger modPow = OooO00o2.modPow(OooO00o3, OooO0OO);
        BigInteger modPow2 = OooO0O0.modPow(OooO00o3, OooO0OO);
        BigInteger mod = OooO0OO2.modPow(OooO00o3, OooO0OO).multiply(bigInteger).mod(OooO0OO);
        AbstractC6436l11LI OooO00o4 = r02.OooO00o().OooO00o();
        byte[] byteArray = modPow.toByteArray();
        OooO00o4.update(byteArray, 0, byteArray.length);
        byte[] byteArray2 = modPow2.toByteArray();
        OooO00o4.update(byteArray2, 0, byteArray2.length);
        byte[] byteArray3 = mod.toByteArray();
        OooO00o4.update(byteArray3, 0, byteArray3.length);
        String str = this.f23887OooO00o;
        if (str != null) {
            byte[] bytes = str.getBytes();
            OooO00o4.update(bytes, 0, bytes.length);
        }
        byte[] bArr = new byte[OooO00o4.OooO0O0()];
        OooO00o4.OooO00o(bArr, 0);
        return new liiilI(modPow, modPow2, mod, r02.OooO00o().modPow(OooO00o3, OooO0OO).multiply(r02.OooO0O0().modPow(OooO00o3.multiply(new BigInteger(1, bArr)), OooO0OO)).mod(OooO0OO));
    }

    public BigInteger OooO00o(liiilI liiili) throws CramerShoupCiphertextException {
        if (this.f23886OooO00o.OooO00o() && !this.f23889OooO00o) {
            I1LiIl r0 = this.f23886OooO00o;
            if (r0 instanceof C9617iiLil) {
                C9617iiLil r02 = (C9617iiLil) r0;
                BigInteger OooO0OO = r02.OooO00o().OooO0OO();
                AbstractC6436l11LI OooO00o2 = r02.OooO00o().OooO00o();
                byte[] byteArray = liiili.OooO0O0().toByteArray();
                OooO00o2.update(byteArray, 0, byteArray.length);
                byte[] byteArray2 = liiili.OooO0OO().toByteArray();
                OooO00o2.update(byteArray2, 0, byteArray2.length);
                byte[] byteArray3 = liiili.OooO00o().toByteArray();
                OooO00o2.update(byteArray3, 0, byteArray3.length);
                String str = this.f23887OooO00o;
                if (str != null) {
                    byte[] bytes = str.getBytes();
                    OooO00o2.update(bytes, 0, bytes.length);
                }
                byte[] bArr = new byte[OooO00o2.OooO0O0()];
                OooO00o2.OooO00o(bArr, 0);
                BigInteger bigInteger = new BigInteger(1, bArr);
                if (liiili.OooO0Oo.equals(liiili.OooO00o.modPow(r02.m21679OooO00o().add(r02.OooO0OO().multiply(bigInteger)), OooO0OO).multiply(liiili.OooO0O0.modPow(r02.OooO0O0().add(r02.OooO0Oo().multiply(bigInteger)), OooO0OO)).mod(OooO0OO))) {
                    return liiili.OooO0OO.multiply(liiili.OooO00o.modPow(r02.OooO0o0(), OooO0OO).modInverse(OooO0OO)).mod(OooO0OO);
                }
                throw new CramerShoupCiphertextException("Sorry, that ciphertext is not correct");
            }
        }
        return null;
    }

    public BigInteger OooO00o(byte[] bArr, int i, int i2) {
        if (i2 > OooO00o() + 1) {
            throw new DataLengthException("input too large for Cramer Shoup cipher.");
        } else if (i2 != OooO00o() + 1 || !this.f23889OooO00o) {
            if (!(i == 0 && i2 == bArr.length)) {
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                bArr = bArr2;
            }
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.compareTo(this.f23886OooO00o.OooO00o().OooO0OO()) < 0) {
                return bigInteger;
            }
            throw new DataLengthException("input too large for Cramer Shoup cipher.");
        } else {
            throw new DataLengthException("input too large for Cramer Shoup cipher.");
        }
    }

    public SecureRandom OooO00o(boolean z, SecureRandom secureRandom) {
        if (!z) {
            return null;
        }
        return secureRandom != null ? secureRandom : IIllii.OooO00o();
    }

    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        SecureRandom secureRandom;
        if (r3 instanceof liLL1l) {
            liLL1l r32 = (liLL1l) r3;
            this.f23886OooO00o = (I1LiIl) r32.OooO00o();
            secureRandom = r32.m17752OooO00o();
        } else {
            this.f23886OooO00o = (I1LiIl) r3;
            secureRandom = null;
        }
        this.f23888OooO00o = OooO00o(z, secureRandom);
        this.f23889OooO00o = z;
    }

    public void OooO00o(boolean z, AbstractC6370iIIIl r2, String str) {
        OooO00o(z, r2);
        this.f23887OooO00o = str;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m22959OooO00o(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (!this.f23889OooO00o) {
            if (byteArray[0] == 0 && byteArray.length > OooO0O0()) {
                int length = byteArray.length - 1;
                byte[] bArr = new byte[length];
                System.arraycopy(byteArray, 1, bArr, 0, length);
                return bArr;
            } else if (byteArray.length < OooO0O0()) {
                int OooO0O0 = OooO0O0();
                byte[] bArr2 = new byte[OooO0O0];
                System.arraycopy(byteArray, 0, bArr2, OooO0O0 - byteArray.length, byteArray.length);
                return bArr2;
            }
        } else if (byteArray[0] == 0) {
            int length2 = byteArray.length - 1;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(byteArray, 1, bArr3, 0, length2);
            return bArr3;
        }
        return byteArray;
    }

    public int OooO0O0() {
        int bitLength = (this.f23886OooO00o.OooO00o().OooO0OO().bitLength() + 7) / 8;
        return this.f23889OooO00o ? bitLength : bitLength - 1;
    }
}
