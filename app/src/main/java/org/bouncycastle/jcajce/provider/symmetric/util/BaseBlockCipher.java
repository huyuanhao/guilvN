package org.bouncycastle.jcajce.provider.symmetric.util;

import com.google.android.gms.stats.CodePackage;
import com.p118pd.sdk.AbstractC6370iIIIl;
import com.p118pd.sdk.AbstractC6840lI;
import com.p118pd.sdk.C1l1i;
import com.p118pd.sdk.C5415Iii1;
import com.p118pd.sdk.C5456IlLi;
import com.p118pd.sdk.C5553Iili;
import com.p118pd.sdk.C5698Li1LLL;
import com.p118pd.sdk.C5999i11;
import com.p118pd.sdk.C6116iIl;
import com.p118pd.sdk.C6234iiIl;
import com.p118pd.sdk.C6262iiiI1L;
import com.p118pd.sdk.C6274iilL1L;
import com.p118pd.sdk.C6443l1Il;
import com.p118pd.sdk.C6542lL1;
import com.p118pd.sdk.C6600lLi;
import com.p118pd.sdk.C6744ll1L;
import com.p118pd.sdk.C6784lli1l;
import com.p118pd.sdk.C6810llllil;
import com.p118pd.sdk.C6927lll1;
import com.p118pd.sdk.C9374IiI;
import com.p118pd.sdk.C9750I;
import com.p118pd.sdk.C98671L1lI;
import com.p118pd.sdk.C9873i1;
import com.p118pd.sdk.I1iIii;
import com.p118pd.sdk.IIILLI;
import com.p118pd.sdk.ILI1lI;
import com.p118pd.sdk.IlLLII1I;
import com.p118pd.sdk.IlLilI;
import com.p118pd.sdk.L1ILII;
import com.p118pd.sdk.LLLIl;
import com.p118pd.sdk.LLLi1iII;
import com.p118pd.sdk.LlLLI1;
import com.p118pd.sdk.Lll1IlI;
import com.p118pd.sdk.iL1Il;
import com.p118pd.sdk.iLIli1;
import com.p118pd.sdk.lIliL1l;
import com.p118pd.sdk.li1l11I1;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Strings;

public class BaseBlockCipher extends Lll1IlI implements AbstractC6840lI {
    public static final Class OooO00o = C6443l1Il.OooO00o(BaseBlockCipher.class, "javax.crypto.spec.GCMParameterSpec");

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5553Iili f23973OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6274iilL1L f23974OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f23975OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iL1Il f23976OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PBEParameterSpec f23977OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0OO f23978OooO00o;
    public Class[] OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;
    public int o0O0O00;
    public int o0OO00O;
    public int o0Oo0oo;
    public String o0ooOOo;
    public String o0ooOoO;
    public int oo0o0Oo;

    public static class InvalidKeyOrParametersException extends InvalidKeyException {
        public final Throwable cause;

        public InvalidKeyOrParametersException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        public Throwable getCause() {
            return this.cause;
        }
    }

    public static class OooO00o implements OooO0OO {
        public static final Constructor OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public LLLi1iII f23979OooO00o;

        static {
            Class OooO00o2 = C6443l1Il.OooO00o(BaseBlockCipher.class, "javax.crypto.AEADBadTagException");
            OooO00o = OooO00o2 != null ? OooO00o(OooO00o2) : null;
        }

        public OooO00o(LLLi1iII lLLi1iII) {
            this.f23979OooO00o = lLLi1iII;
        }

        public static Constructor OooO00o(Class cls) {
            try {
                return cls.getConstructor(String.class);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        public int OooO00o(byte b, byte[] bArr, int i) throws DataLengthException {
            return this.f23979OooO00o.OooO00o(b, bArr, i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        public int OooO00o(int i) {
            return this.f23979OooO00o.OooO00o(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        public int OooO00o(byte[] bArr, int i) throws IllegalStateException, BadPaddingException {
            try {
                return this.f23979OooO00o.OooO00o(bArr, i);
            } catch (InvalidCipherTextException e) {
                Constructor constructor = OooO00o;
                if (constructor != null) {
                    BadPaddingException badPaddingException = null;
                    try {
                        badPaddingException = (BadPaddingException) constructor.newInstance(e.getMessage());
                    } catch (Exception unused) {
                    }
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                }
                throw new BadPaddingException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
            return this.f23979OooO00o.OooO00o(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO, org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO, org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        public li1l11I1 OooO00o() {
            return this.f23979OooO00o.OooO00o();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO, org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO, org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m22970OooO00o() {
            return this.f23979OooO00o.OooO00o().m17732OooO00o();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        public void OooO00o(boolean z, AbstractC6370iIIIl r3) throws IllegalArgumentException {
            this.f23979OooO00o.OooO00o(z, r3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        public void OooO00o(byte[] bArr, int i, int i2) {
            this.f23979OooO00o.OooO00o(bArr, i, i2);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO, org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO, org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m22971OooO00o() {
            return false;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        public int OooO0O0(int i) {
            return this.f23979OooO00o.OooO0O0(i);
        }
    }

    public static class OooO0O0 implements OooO0OO {
        public C6744ll1L OooO00o;

        public OooO0O0(li1l11I1 li1l11i1) {
            this.OooO00o = new C6600lLi(li1l11i1);
        }

        public OooO0O0(li1l11I1 li1l11i1, LLLIl r3) {
            this.OooO00o = new C6600lLi(li1l11i1, r3);
        }

        public OooO0O0(C6744ll1L r1) {
            this.OooO00o = r1;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        public int OooO00o(byte b, byte[] bArr, int i) throws DataLengthException {
            return this.OooO00o.OooO00o(b, bArr, i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        public int OooO00o(int i) {
            return this.OooO00o.OooO00o(i);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        public int OooO00o(byte[] bArr, int i) throws IllegalStateException, BadPaddingException {
            try {
                return this.OooO00o.OooO00o(bArr, i);
            } catch (InvalidCipherTextException e) {
                throw new BadPaddingException(e.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
            return this.OooO00o.OooO00o(bArr, i, i2, bArr2, i3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO, org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO, org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        public li1l11I1 OooO00o() {
            return this.OooO00o.m17842OooO00o();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO, org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO, org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m22972OooO00o() {
            return this.OooO00o.m17842OooO00o().m17732OooO00o();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        public void OooO00o(boolean z, AbstractC6370iIIIl r3) throws IllegalArgumentException {
            this.OooO00o.OooO00o(z, r3);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        public void OooO00o(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO, org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO, org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m22973OooO00o() {
            return !(this.OooO00o instanceof C6810llllil);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.OooO0OO
        public int OooO0O0(int i) {
            return this.OooO00o.OooO0O0(i);
        }
    }

    public interface OooO0OO {
        int OooO00o(byte b, byte[] bArr, int i) throws DataLengthException;

        int OooO00o(int i);

        int OooO00o(byte[] bArr, int i) throws IllegalStateException, BadPaddingException;

        int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException;

        li1l11I1 OooO00o();

        /* renamed from: OooO00o  reason: collision with other method in class */
        String m22974OooO00o();

        void OooO00o(boolean z, AbstractC6370iIIIl v) throws IllegalArgumentException;

        void OooO00o(byte[] bArr, int i, int i2);

        /* renamed from: OooO00o  reason: collision with other method in class */
        boolean m22975OooO00o();

        int OooO0O0(int i);
    }

    public BaseBlockCipher(LLLi1iII lLLi1iII) {
        this.OooO0O0 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, OooO00o, C9873i1.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.o0OO00O = -1;
        this.o0O0O00 = 0;
        this.OooO0Oo = true;
        this.f23977OooO00o = null;
        this.o0ooOOo = null;
        this.o0ooOoO = null;
        li1l11I1 OooO00o2 = lLLi1iII.OooO00o();
        this.f23975OooO00o = OooO00o2;
        this.o0O0O00 = OooO00o2.OooO00o();
        this.f23978OooO00o = new OooO00o(lLLi1iII);
    }

    public BaseBlockCipher(LLLi1iII lLLi1iII, boolean z, int i) {
        this.OooO0O0 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, OooO00o, C9873i1.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.o0OO00O = -1;
        this.o0O0O00 = 0;
        this.OooO0Oo = true;
        this.f23977OooO00o = null;
        this.o0ooOOo = null;
        this.o0ooOoO = null;
        this.f23975OooO00o = lLLi1iII.OooO00o();
        this.OooO0Oo = z;
        this.o0O0O00 = i;
        this.f23978OooO00o = new OooO00o(lLLi1iII);
    }

    public BaseBlockCipher(li1l11I1 li1l11i1) {
        this.OooO0O0 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, OooO00o, C9873i1.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.o0OO00O = -1;
        this.o0O0O00 = 0;
        this.OooO0Oo = true;
        this.f23977OooO00o = null;
        this.o0ooOOo = null;
        this.o0ooOoO = null;
        this.f23975OooO00o = li1l11i1;
        this.f23978OooO00o = new OooO0O0(li1l11i1);
    }

    public BaseBlockCipher(li1l11I1 li1l11i1, int i) {
        this(li1l11i1, true, i);
    }

    public BaseBlockCipher(li1l11I1 li1l11i1, int i, int i2, int i3, int i4) {
        this.OooO0O0 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, OooO00o, C9873i1.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.o0OO00O = -1;
        this.o0O0O00 = 0;
        this.OooO0Oo = true;
        this.f23977OooO00o = null;
        this.o0ooOOo = null;
        this.o0ooOoO = null;
        this.f23975OooO00o = li1l11i1;
        this.o0OO00O = i;
        this.oo0o0Oo = i2;
        this.o0Oo0oo = i3;
        this.o0O0O00 = i4;
        this.f23978OooO00o = new OooO0O0(li1l11i1);
    }

    public BaseBlockCipher(li1l11I1 li1l11i1, boolean z, int i) {
        this.OooO0O0 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, OooO00o, C9873i1.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.o0OO00O = -1;
        this.o0O0O00 = 0;
        this.OooO0Oo = true;
        this.f23977OooO00o = null;
        this.o0ooOOo = null;
        this.o0ooOoO = null;
        this.f23975OooO00o = li1l11i1;
        this.OooO0Oo = z;
        this.f23978OooO00o = new OooO0O0(li1l11i1);
        this.o0O0O00 = i / 8;
    }

    public BaseBlockCipher(C6744ll1L r2, int i) {
        this(r2, true, i);
    }

    public BaseBlockCipher(C6744ll1L r6, boolean z, int i) {
        this.OooO0O0 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, OooO00o, C9873i1.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.o0OO00O = -1;
        this.o0O0O00 = 0;
        this.OooO0Oo = true;
        this.f23977OooO00o = null;
        this.o0ooOOo = null;
        this.o0ooOoO = null;
        this.f23975OooO00o = r6.m17842OooO00o();
        this.f23978OooO00o = new OooO0O0(r6);
        this.OooO0Oo = z;
        this.o0O0O00 = i / 8;
    }

    public BaseBlockCipher(iL1Il r6) {
        this.OooO0O0 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, OooO00o, C9873i1.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.o0OO00O = -1;
        this.o0O0O00 = 0;
        this.OooO0Oo = true;
        this.f23977OooO00o = null;
        this.o0ooOOo = null;
        this.o0ooOoO = null;
        this.f23975OooO00o = r6.OooO00o();
        this.f23976OooO00o = r6;
        this.f23978OooO00o = new OooO0O0(r6.OooO00o());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: com.pd.sdk.iilL1丨L丨 */
    /* JADX WARN: Multi-variable type inference failed */
    private AbstractC6370iIIIl OooO00o(AlgorithmParameterSpec algorithmParameterSpec, AbstractC6370iIIIl r5) {
        C9374IiI r0;
        C6274iilL1L r52;
        if (r5 instanceof C6274iilL1L) {
            AbstractC6370iIIIl OooO00o2 = ((C6274iilL1L) r5).OooO00o();
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                r52 = new C6274iilL1L(OooO00o2, ((IvParameterSpec) algorithmParameterSpec).getIV());
            } else if (!(algorithmParameterSpec instanceof C9873i1)) {
                return r5;
            } else {
                C9873i1 r4 = (C9873i1) algorithmParameterSpec;
                C9374IiI r1 = new C9374IiI(r5, r4.OooO0OO());
                if (r4.OooO00o() == null || this.o0O0O00 == 0) {
                    return r1;
                }
                r52 = new C6274iilL1L(OooO00o2, r4.OooO00o());
            }
            this.f23974OooO00o = r52;
            return r52;
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            C6274iilL1L r02 = new C6274iilL1L(r5, ((IvParameterSpec) algorithmParameterSpec).getIV());
            this.f23974OooO00o = r02;
            r0 = r02;
        } else if (!(algorithmParameterSpec instanceof C9873i1)) {
            return r5;
        } else {
            C9873i1 r42 = (C9873i1) algorithmParameterSpec;
            C9374IiI r03 = new C9374IiI(r5, r42.OooO0OO());
            r0 = r03;
            if (r42.OooO00o() != null) {
                r0 = r03;
                if (this.o0O0O00 != 0) {
                    return new C6274iilL1L(r03, r42.OooO00o());
                }
            }
        }
        return r0;
    }

    @Override // com.p118pd.sdk.Lll1IlI
    private boolean OooO00o(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || CodePackage.GCM.equals(str) || "OCB".equals(str);
    }

    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        int i4;
        if (engineGetOutputSize(i2) + i3 <= bArr2.length) {
            if (i2 != 0) {
                try {
                    i4 = this.f23978OooO00o.OooO00o(bArr, i, i2, bArr2, i3);
                } catch (OutputLengthException e) {
                    throw new IllegalBlockSizeException(e.getMessage());
                } catch (DataLengthException e2) {
                    throw new IllegalBlockSizeException(e2.getMessage());
                }
            } else {
                i4 = 0;
            }
            return i4 + this.f23978OooO00o.OooO00o(bArr2, i3 + i4);
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        int engineGetOutputSize = engineGetOutputSize(i2);
        byte[] bArr2 = new byte[engineGetOutputSize];
        int OooO00o2 = i2 != 0 ? this.f23978OooO00o.OooO00o(bArr, i, i2, bArr2, 0) : 0;
        try {
            int OooO00o3 = OooO00o2 + this.f23978OooO00o.OooO00o(bArr2, OooO00o2);
            if (OooO00o3 == engineGetOutputSize) {
                return bArr2;
            }
            byte[] bArr3 = new byte[OooO00o3];
            System.arraycopy(bArr2, 0, bArr3, 0, OooO00o3);
            return bArr3;
        } catch (DataLengthException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    @Override // com.p118pd.sdk.Lll1IlI
    public int engineGetBlockSize() {
        return this.f23975OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.Lll1IlI
    public byte[] engineGetIV() {
        C5553Iili r0 = this.f23973OooO00o;
        if (r0 != null) {
            return r0.OooO0O0();
        }
        C6274iilL1L r02 = this.f23974OooO00o;
        if (r02 != null) {
            return r02.m17301OooO00o();
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // com.p118pd.sdk.Lll1IlI
    public int engineGetOutputSize(int i) {
        return this.f23978OooO00o.OooO00o(i);
    }

    @Override // com.p118pd.sdk.Lll1IlI
    public AlgorithmParameters engineGetParameters() {
        if (((Lll1IlI) this).f16736OooO00o == null) {
            if (this.f23977OooO00o != null) {
                try {
                    AlgorithmParameters OooO00o2 = OooO00o(this.o0ooOOo);
                    ((Lll1IlI) this).f16736OooO00o = OooO00o2;
                    OooO00o2.init(this.f23977OooO00o);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.f23973OooO00o != null) {
                try {
                    AlgorithmParameters OooO00o3 = OooO00o(CodePackage.GCM);
                    ((Lll1IlI) this).f16736OooO00o = OooO00o3;
                    OooO00o3.init(new IlLLII1I(this.f23973OooO00o.OooO0O0(), this.f23973OooO00o.OooO00o() / 8).getEncoded());
                } catch (Exception e) {
                    throw new RuntimeException(e.toString());
                }
            } else if (this.f23974OooO00o != null) {
                String OooO00o4 = this.f23978OooO00o.OooO00o().m17732OooO00o();
                if (OooO00o4.indexOf(47) >= 0) {
                    OooO00o4 = OooO00o4.substring(0, OooO00o4.indexOf(47));
                }
                try {
                    AlgorithmParameters OooO00o5 = OooO00o(OooO00o4);
                    ((Lll1IlI) this).f16736OooO00o = OooO00o5;
                    OooO00o5.init(new IvParameterSpec(this.f23974OooO00o.m17301OooO00o()));
                } catch (Exception e2) {
                    throw new RuntimeException(e2.toString());
                }
            }
        }
        return ((Lll1IlI) this).f16736OooO00o;
    }

    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (algorithmParameters != null) {
            int i2 = 0;
            while (true) {
                Class[] clsArr = this.OooO0O0;
                if (i2 == clsArr.length) {
                    break;
                }
                if (clsArr[i2] != null) {
                    try {
                        algorithmParameterSpec = algorithmParameters.getParameterSpec(clsArr[i2]);
                        break;
                    } catch (Exception unused) {
                        continue;
                    }
                }
                i2++;
            }
            if (algorithmParameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        }
        engineInit(i, key, algorithmParameterSpec, secureRandom);
        ((Lll1IlI) this).f16736OooO00o = algorithmParameters;
    }

    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:198:0x045a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:219:0x04ad */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.pd.sdk.i丨IIIl] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.pd.sdk.i丨IIIl] */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.pd.sdk.iilL1丨L丨] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r5v12, types: [com.pd.sdk.LLiL1l, com.pd.sdk.i丨IIIl] */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.pd.sdk.i丨IIIl, com.pd.sdk.iL11L] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [com.pd.sdk.丨IiI, com.pd.sdk.i丨IIIl] */
    /* JADX WARN: Type inference failed for: r5v22, types: [com.pd.sdk.iilL1丨L丨] */
    /* JADX WARN: Type inference failed for: r5v25, types: [com.pd.sdk.I丨i丨li] */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        if (r7 != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f7, code lost:
        if (r7 != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0143, code lost:
        if (r7 != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01fb, code lost:
        if (r7 != false) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04ef A[Catch:{ Exception -> 0x0518 }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0204  */
    /* JADX WARNING: Unknown variable types count: 2 */
    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r21, java.security.Key r22, java.security.spec.AlgorithmParameterSpec r23, java.security.SecureRandom r24) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
        // Method dump skipped, instructions count: 1325
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        OooO0OO oooO00o;
        OooO0O0 oooO0O0;
        String OooO0O02 = Strings.OooO0O0(str);
        this.o0ooOoO = OooO0O02;
        if (OooO0O02.equals("ECB")) {
            this.o0O0O00 = 0;
            oooO00o = new OooO0O0(this.f23975OooO00o);
        } else if (this.o0ooOoO.equals("CBC")) {
            this.o0O0O00 = this.f23975OooO00o.OooO00o();
            oooO00o = new OooO0O0(new C6927lll1(this.f23975OooO00o));
        } else {
            if (this.o0ooOoO.startsWith("OFB")) {
                this.o0O0O00 = this.f23975OooO00o.OooO00o();
                if (this.o0ooOoO.length() != 3) {
                    oooO0O0 = new OooO0O0(new IlLilI(this.f23975OooO00o, Integer.parseInt(this.o0ooOoO.substring(3))));
                } else {
                    li1l11I1 li1l11i1 = this.f23975OooO00o;
                    oooO00o = new OooO0O0(new IlLilI(li1l11i1, li1l11i1.OooO00o() * 8));
                }
            } else if (this.o0ooOoO.startsWith("CFB")) {
                this.o0O0O00 = this.f23975OooO00o.OooO00o();
                if (this.o0ooOoO.length() != 3) {
                    oooO0O0 = new OooO0O0(new C9750I(this.f23975OooO00o, Integer.parseInt(this.o0ooOoO.substring(3))));
                } else {
                    li1l11I1 li1l11i12 = this.f23975OooO00o;
                    oooO00o = new OooO0O0(new C9750I(li1l11i12, li1l11i12.OooO00o() * 8));
                }
            } else if (this.o0ooOoO.startsWith("PGP")) {
                boolean equalsIgnoreCase = this.o0ooOoO.equalsIgnoreCase("PGPCFBwithIV");
                this.o0O0O00 = this.f23975OooO00o.OooO00o();
                oooO0O0 = new OooO0O0(new C6262iiiI1L(this.f23975OooO00o, equalsIgnoreCase));
            } else if (this.o0ooOoO.equalsIgnoreCase("OpenPGPCFB")) {
                this.o0O0O00 = 0;
                oooO00o = new OooO0O0(new ILI1lI(this.f23975OooO00o));
            } else if (this.o0ooOoO.startsWith("SIC")) {
                int OooO00o2 = this.f23975OooO00o.OooO00o();
                this.o0O0O00 = OooO00o2;
                if (OooO00o2 >= 16) {
                    this.OooO0Oo = false;
                    oooO00o = new OooO0O0(new C6744ll1L(new lIliL1l(this.f23975OooO00o)));
                } else {
                    throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
                }
            } else if (this.o0ooOoO.startsWith("CTR")) {
                this.o0O0O00 = this.f23975OooO00o.OooO00o();
                this.OooO0Oo = false;
                li1l11I1 li1l11i13 = this.f23975OooO00o;
                oooO0O0 = li1l11i13 instanceof I1iIii ? new OooO0O0(new C6744ll1L(new C1l1i(li1l11i13))) : new OooO0O0(new C6744ll1L(new lIliL1l(li1l11i13)));
            } else if (this.o0ooOoO.startsWith("GOFB")) {
                this.o0O0O00 = this.f23975OooO00o.OooO00o();
                oooO00o = new OooO0O0(new C6744ll1L(new C5698Li1LLL(this.f23975OooO00o)));
            } else if (this.o0ooOoO.startsWith("GCFB")) {
                this.o0O0O00 = this.f23975OooO00o.OooO00o();
                oooO00o = new OooO0O0(new C6744ll1L(new C6542lL1(this.f23975OooO00o)));
            } else if (this.o0ooOoO.startsWith("CTS")) {
                this.o0O0O00 = this.f23975OooO00o.OooO00o();
                oooO00o = new OooO0O0(new C6810llllil(new C6927lll1(this.f23975OooO00o)));
            } else if (this.o0ooOoO.startsWith("CCM")) {
                this.o0O0O00 = 12;
                oooO00o = this.f23975OooO00o instanceof I1iIii ? new OooO00o(new C5456IlLi(this.f23975OooO00o)) : new OooO00o(new LlLLI1(this.f23975OooO00o));
            } else if (this.o0ooOoO.startsWith("OCB")) {
                if (this.f23976OooO00o != null) {
                    this.o0O0O00 = 15;
                    oooO00o = new OooO00o(new C5999i11(this.f23975OooO00o, this.f23976OooO00o.OooO00o()));
                } else {
                    throw new NoSuchAlgorithmException("can't support mode " + str);
                }
            } else if (this.o0ooOoO.startsWith("EAX")) {
                this.o0O0O00 = this.f23975OooO00o.OooO00o();
                oooO00o = new OooO00o(new C6234iiIl(this.f23975OooO00o));
            } else if (this.o0ooOoO.startsWith(CodePackage.GCM)) {
                this.o0O0O00 = this.f23975OooO00o.OooO00o();
                oooO00o = this.f23975OooO00o instanceof I1iIii ? new OooO00o(new L1ILII(this.f23975OooO00o)) : new OooO00o(new iLIli1(this.f23975OooO00o));
            } else {
                throw new NoSuchAlgorithmException("can't support mode " + str);
            }
            this.f23978OooO00o = oooO0O0;
            return;
        }
        this.f23978OooO00o = oooO00o;
    }

    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        OooO0O0 oooO0O0;
        String OooO0O02 = Strings.OooO0O0(str);
        if (OooO0O02.equals("NOPADDING")) {
            if (this.f23978OooO00o.m22975OooO00o()) {
                oooO0O0 = new OooO0O0(new C6744ll1L(this.f23978OooO00o.OooO00o()));
            } else {
                return;
            }
        } else if (OooO0O02.equals("WITHCTS") || OooO0O02.equals("CTSPADDING") || OooO0O02.equals("CS3PADDING")) {
            oooO0O0 = new OooO0O0(new C6810llllil(this.f23978OooO00o.OooO00o()));
        } else {
            this.OooO0OO = true;
            if (OooO00o(this.o0ooOoO)) {
                throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
            } else if (OooO0O02.equals("PKCS5PADDING") || OooO0O02.equals("PKCS7PADDING")) {
                oooO0O0 = new OooO0O0(this.f23978OooO00o.OooO00o());
            } else if (OooO0O02.equals("ZEROBYTEPADDING")) {
                oooO0O0 = new OooO0O0(this.f23978OooO00o.OooO00o(), new C98671L1lI());
            } else if (OooO0O02.equals("ISO10126PADDING") || OooO0O02.equals("ISO10126-2PADDING")) {
                oooO0O0 = new OooO0O0(this.f23978OooO00o.OooO00o(), new IIILLI());
            } else if (OooO0O02.equals("X9.23PADDING") || OooO0O02.equals("X923PADDING")) {
                oooO0O0 = new OooO0O0(this.f23978OooO00o.OooO00o(), new C6784lli1l());
            } else if (OooO0O02.equals("ISO7816-4PADDING") || OooO0O02.equals("ISO9797-1PADDING")) {
                oooO0O0 = new OooO0O0(this.f23978OooO00o.OooO00o(), new C5415Iii1());
            } else if (OooO0O02.equals("TBCPADDING")) {
                oooO0O0 = new OooO0O0(this.f23978OooO00o.OooO00o(), new C6116iIl());
            } else {
                throw new NoSuchPaddingException("Padding " + str + " unknown.");
            }
        }
        this.f23978OooO00o = oooO0O0;
    }

    @Override // javax.crypto.CipherSpi, com.p118pd.sdk.Lll1IlI
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (this.f23978OooO00o.OooO0O0(i2) + i3 <= bArr2.length) {
            try {
                return this.f23978OooO00o.OooO00o(bArr, i, i2, bArr2, i3);
            } catch (DataLengthException e) {
                throw new IllegalStateException(e.toString());
            }
        } else {
            throw new ShortBufferException("output buffer too short for input.");
        }
    }

    @Override // com.p118pd.sdk.Lll1IlI
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int OooO0O02 = this.f23978OooO00o.OooO0O0(i2);
        if (OooO0O02 > 0) {
            byte[] bArr2 = new byte[OooO0O02];
            int OooO00o2 = this.f23978OooO00o.OooO00o(bArr, i, i2, bArr2, 0);
            if (OooO00o2 == 0) {
                return null;
            }
            if (OooO00o2 == OooO0O02) {
                return bArr2;
            }
            byte[] bArr3 = new byte[OooO00o2];
            System.arraycopy(bArr2, 0, bArr3, 0, OooO00o2);
            return bArr3;
        }
        this.f23978OooO00o.OooO00o(bArr, i, i2, null, 0);
        return null;
    }

    public void engineUpdateAAD(ByteBuffer byteBuffer) {
        engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    public void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.f23978OooO00o.OooO00o(bArr, i, i2);
    }
}
