package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import java.util.Hashtable;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.OperatorStreamException;
import org.bouncycastle.operator.RuntimeOperatorException;

/* renamed from: com.pd.sdk.ilI丨  reason: invalid class name and case insensitive filesystem */
public class C6306ilI {
    public static final Hashtable OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6617lLlIII f17991OooO00o = new iIlLLIiL();

    /* renamed from: com.pd.sdk.ilI丨$OooO00o */
    public class OooO00o implements AbstractC9839iiil {
        public final /* synthetic */ LlLI1 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ OooO0O0 f17992OooO00o;

        public OooO00o(LlLI1 llLI1, OooO0O0 oooO0O0) {
            this.OooO00o = llLI1;
            this.f17992OooO00o = oooO0O0;
        }

        @Override // com.p118pd.sdk.AbstractC9839iiil, com.p118pd.sdk.AbstractC9839iiil
        public LlLI1 OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC9839iiil, com.p118pd.sdk.AbstractC9839iiil
        /* renamed from: OooO00o  reason: collision with other method in class */
        public OutputStream m17340OooO00o() {
            return this.f17992OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC9839iiil
        public byte[] getSignature() {
            try {
                byte[] OooO0O0 = this.f17992OooO00o.OooO0O0();
                return this.OooO00o.OooO00o(AbstractC9525LlI1.OooOOo) ? C6306ilI.OooO0O0(OooO0O0) : OooO0O0;
            } catch (SignatureException e) {
                throw new RuntimeOperatorException("exception obtaining signature: " + e.getMessage(), e);
            }
        }
    }

    /* renamed from: com.pd.sdk.ilI丨$OooO0O0 */
    public class OooO0O0 extends OutputStream {

        /* renamed from: OooO00o  reason: collision with other field name */
        public Signature f17994OooO00o;

        public OooO0O0(Signature signature) {
            this.f17994OooO00o = signature;
        }

        public byte[] OooO0O0() throws SignatureException {
            return this.f17994OooO00o.sign();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            try {
                this.f17994OooO00o.update((byte) i);
            } catch (SignatureException e) {
                throw new OperatorStreamException("exception in content signer: " + e.getMessage(), e);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            try {
                this.f17994OooO00o.update(bArr);
            } catch (SignatureException e) {
                throw new OperatorStreamException("exception in content signer: " + e.getMessage(), e);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f17994OooO00o.update(bArr, i, i2);
            } catch (SignatureException e) {
                throw new OperatorStreamException("exception in content signer: " + e.getMessage(), e);
            }
        }
    }

    static {
        Hashtable hashtable = new Hashtable();
        OooO00o = hashtable;
        hashtable.put("SHA1withRSA", AbstractC9525LlI1.OooOO0o);
        OooO00o.put("SHA256withRSA", AbstractC9525LlI1.OooOOO0);
        OooO00o.put("SHA1withRSAandMGF1", AbstractC9525LlI1.OooOOO);
        OooO00o.put("SHA256withRSAandMGF1", AbstractC9525LlI1.OooOOOO);
        OooO00o.put("SHA512withRSA", AbstractC9525LlI1.OooOOOo);
        OooO00o.put("SHA512withRSAandMGF1", AbstractC9525LlI1.OooOOo0);
        OooO00o.put("SHA1withECDSA", AbstractC9525LlI1.OooOOoo);
        OooO00o.put("SHA224withECDSA", AbstractC9525LlI1.OooOo00);
        OooO00o.put("SHA256withECDSA", AbstractC9525LlI1.OooOo0);
        OooO00o.put("SHA384withECDSA", AbstractC9525LlI1.OooOo0O);
        OooO00o.put("SHA512withECDSA", AbstractC9525LlI1.OooOo0o);
    }

    public static int OooO00o(int i, int i2) {
        return i > i2 ? i : i2;
    }

    public static int OooO00o(byte[] bArr) {
        int length = bArr.length;
        return bArr[0] == 0 ? length - 1 : length;
    }

    public static void OooO00o(byte[] bArr, byte[] bArr2, int i) {
        int length = bArr.length;
        int i2 = 0;
        if (bArr[0] == 0) {
            length--;
            i2 = 1;
        }
        System.arraycopy(bArr, i2, bArr2, i, length);
    }

    public static byte[] OooO0O0(byte[] bArr) {
        I11li1 OooO00o2 = I11li1.OooO00o((Object) bArr);
        BigInteger OooO0O02 = C6513lIiI.OooO00o(OooO00o2.OooO00o(0)).m17647OooO0O0();
        BigInteger OooO0O03 = C6513lIiI.OooO00o(OooO00o2.OooO00o(1)).m17647OooO0O0();
        byte[] byteArray = OooO0O02.toByteArray();
        byte[] byteArray2 = OooO0O03.toByteArray();
        int OooO00o3 = OooO00o(byteArray);
        int OooO00o4 = OooO00o(byteArray2);
        int OooO00o5 = OooO00o(OooO00o3, OooO00o4);
        int i = OooO00o5 * 2;
        byte[] bArr2 = new byte[i];
        Arrays.fill(bArr2, (byte) 0);
        OooO00o(byteArray, bArr2, OooO00o5 - OooO00o3);
        OooO00o(byteArray2, bArr2, i - OooO00o4);
        return bArr2;
    }

    public C6306ilI OooO00o(String str) {
        this.f17991OooO00o = new I(str);
        return this;
    }

    public C6306ilI OooO00o(Provider provider) {
        this.f17991OooO00o = new C5572Ilili(provider);
        return this;
    }

    public AbstractC9839iiil OooO00o(LlLI1 llLI1, PrivateKey privateKey) throws OperatorCreationException {
        try {
            Signature OooO00o2 = this.f17991OooO00o.OooO00o(llLI1);
            OooO00o2.initSign(privateKey);
            return new OooO00o(llLI1, new OooO0O0(OooO00o2));
        } catch (NoSuchAlgorithmException e) {
            throw new OperatorCreationException("unable to find algorithm: " + e.getMessage(), e);
        } catch (NoSuchProviderException e2) {
            throw new OperatorCreationException("unable to find provider: " + e2.getMessage(), e2);
        } catch (InvalidKeyException e3) {
            throw new OperatorCreationException("invalid key: " + e3.getMessage(), e3);
        }
    }

    public AbstractC9839iiil OooO00o(String str, PrivateKey privateKey) throws OperatorCreationException {
        return OooO00o((LlLI1) OooO00o.get(str), privateKey);
    }
}
