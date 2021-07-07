package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.pd.sdk.LlLI1 */
public class LlLI1 extends AbstractC6122iIlLiL {
    public static final long OooO00o = 72057594037927808L;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ConcurrentMap<OooO00o, LlLI1> f16721OooO00o = new ConcurrentHashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16722OooO00o;
    public final String o0ooOOo;

    /* renamed from: com.pd.sdk.LlLI1$OooO00o */
    public static class OooO00o {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final byte[] f16723OooO00o;

        public OooO00o(byte[] bArr) {
            this.OooO00o = C9586iIILl.OooO00o(bArr);
            this.f16723OooO00o = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof OooO00o) {
                return C9586iIILl.m21627OooO00o(this.f16723OooO00o, ((OooO00o) obj).f16723OooO00o);
            }
            return false;
        }

        public int hashCode() {
            return this.OooO00o;
        }
    }

    public LlLI1(LlLI1 llLI1, String str) {
        if (OooO00o(str, 0)) {
            this.o0ooOOo = llLI1.m16387OooO0O0() + C9058ooOoOoOO.OooOO0 + str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not a valid OID branch");
    }

    public LlLI1(String str) {
        if (str == null) {
            throw new IllegalArgumentException("'identifier' cannot be null");
        } else if (OooO00o(str)) {
            this.o0ooOOo = str;
        } else {
            throw new IllegalArgumentException("string " + str + " not an OID");
        }
    }

    public LlLI1(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        long j = 0;
        BigInteger bigInteger = null;
        for (int i = 0; i != bArr.length; i++) {
            int i2 = bArr[i] & 255;
            if (j <= OooO00o) {
                long j2 = j + ((long) (i2 & 127));
                if ((i2 & 128) == 0) {
                    if (z) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf((long) (i2 & 127)));
                if ((i2 & 128) == 0) {
                    if (z) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80));
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    j = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.o0ooOOo = stringBuffer.toString();
        this.f16722OooO00o = C9586iIILl.m21630OooO00o(bArr);
    }

    public static LlLI1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        AbstractC6122iIlLiL OooO0o = r0.OooO0o();
        return (z || (OooO0o instanceof LlLI1)) ? OooO00o((Object) OooO0o) : OooO00o(AbstractC6804llL1ii.OooO00o((Object) OooO0o).m17938OooO00o());
    }

    public static LlLI1 OooO00o(Object obj) {
        if (obj == null || (obj instanceof LlLI1)) {
            return (LlLI1) obj;
        }
        if (obj instanceof AbstractC6854lLi1LL) {
            AbstractC6854lLi1LL r0 = (AbstractC6854lLi1LL) obj;
            if (r0.OooO0O0() instanceof LlLI1) {
                return (LlLI1) r0.OooO0O0();
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (LlLI1) AbstractC6122iIlLiL.OooO00o((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e.getMessage());
            }
        } else {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
    }

    public static LlLI1 OooO00o(byte[] bArr) {
        LlLI1 llLI1 = f16721OooO00o.get(new OooO00o(bArr));
        return llLI1 == null ? new LlLI1(bArr) : llLI1;
    }

    private void OooO00o(ByteArrayOutputStream byteArrayOutputStream) {
        C1705i r0 = new C1705i(this.o0ooOOo);
        int parseInt = Integer.parseInt(r0.OooO00o()) * 40;
        String OooO00o2 = r0.OooO00o();
        if (OooO00o2.length() <= 18) {
            OooO00o(byteArrayOutputStream, ((long) parseInt) + Long.parseLong(OooO00o2));
        } else {
            OooO00o(byteArrayOutputStream, new BigInteger(OooO00o2).add(BigInteger.valueOf((long) parseInt)));
        }
        while (r0.m21612OooO00o()) {
            String OooO00o3 = r0.OooO00o();
            if (OooO00o3.length() <= 18) {
                OooO00o(byteArrayOutputStream, Long.parseLong(OooO00o3));
            } else {
                OooO00o(byteArrayOutputStream, new BigInteger(OooO00o3));
            }
        }
    }

    private void OooO00o(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    private void OooO00o(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & O0O00O.OooO0O0);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    public static boolean OooO00o(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2') {
            return false;
        }
        return OooO00o(str, 2);
    }

    public static boolean OooO00o(String str, int i) {
        boolean z;
        char charAt;
        int length = str.length();
        do {
            z = false;
            while (true) {
                length--;
                if (length < i) {
                    return z;
                }
                charAt = str.charAt(length);
                if ('0' <= charAt && charAt <= '9') {
                    z = true;
                }
            }
            if (charAt != '.') {
                break;
            }
        } while (z);
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    private synchronized byte[] OooO00o() {
        if (this.f16722OooO00o == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            OooO00o(byteArrayOutputStream);
            this.f16722OooO00o = byteArrayOutputStream.toByteArray();
        }
        return this.f16722OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m16384OooO00o() {
        OooO00o oooO00o = new OooO00o(OooO00o());
        LlLI1 llLI1 = f16721OooO00o.get(oooO00o);
        if (llLI1 != null) {
            return llLI1;
        }
        LlLI1 putIfAbsent = f16721OooO00o.putIfAbsent(oooO00o, this);
        return putIfAbsent == null ? this : putIfAbsent;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m16385OooO00o(String str) {
        return new LlLI1(this, str);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        byte[] OooO00o2 = OooO00o();
        iii1.OooO00o(6);
        iii1.OooO0O0(OooO00o2.length);
        iii1.OooO00o(OooO00o2);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16386OooO00o() {
        return false;
    }

    public boolean OooO00o(LlLI1 llLI1) {
        String OooO0O0 = m16387OooO0O0();
        String OooO0O02 = llLI1.m16387OooO0O0();
        return OooO0O0.length() > OooO0O02.length() && OooO0O0.charAt(OooO0O02.length()) == '.' && OooO0O0.startsWith(OooO0O02);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        if (iillil == this) {
            return true;
        }
        if (!(iillil instanceof LlLI1)) {
            return false;
        }
        return this.o0ooOOo.equals(((LlLI1) iillil).o0ooOOo);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() throws IOException {
        int length = OooO00o().length;
        return L1li1.OooO00o(length) + 1 + length;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m16387OooO0O0() {
        return this.o0ooOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL
    public int hashCode() {
        return this.o0ooOOo.hashCode();
    }

    public String toString() {
        return m16387OooO0O0();
    }
}
