package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.i1Li1 */
public class i1Li1 implements AbstractC6186iLi1 {
    public static final Hashtable OooO00o = new Hashtable();
    public static final int OooO0O0 = 256;
    public static final int OooO0OO = 512;
    public static final int OooO0Oo = 1024;
    public static final int OooO0o = 4;
    public static final int OooO0o0 = 0;
    public static final int OooO0oO = 48;
    public static final int OooO0oo = 63;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f17365OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5803Ll f17366OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0OO f17367OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17368OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long[] f17369OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0O0[] f17370OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final byte[] f17371OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long[] f17372OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public OooO0O0[] f17373OooO0O0;

    /* renamed from: com.pd.sdk.i1Li1$OooO00o */
    public static class OooO00o {
        public byte[] OooO00o;

        public OooO00o(long j) {
            byte[] bArr = new byte[32];
            this.OooO00o = bArr;
            bArr[0] = 83;
            bArr[1] = 72;
            bArr[2] = C8027oOO00oo.OooO00o;
            bArr[3] = 51;
            bArr[4] = 1;
            bArr[5] = 0;
            C5803Ll.OooO00o(j, bArr, 8);
        }

        public byte[] OooO00o() {
            return this.OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.i1Li1$OooO0O0 */
    public static class OooO0O0 {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f17374OooO00o;

        public OooO0O0(int i, byte[] bArr) {
            this.OooO00o = i;
            this.f17374OooO00o = bArr;
        }

        public int OooO00o() {
            return this.OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m16876OooO00o() {
            return this.f17374OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.i1Li1$OooO0OO */
    public class OooO0OO {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C6023OooO0Oo f17375OooO00o = new C6023OooO0Oo();

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f17377OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long[] f17378OooO00o;

        public OooO0OO(int i) {
            byte[] bArr = new byte[i];
            this.f17377OooO00o = bArr;
            this.f17378OooO00o = new long[(bArr.length / 8)];
        }

        private void OooO0O0(long[] jArr) {
            long[] jArr2;
            i1Li1 i1li1 = i1Li1.this;
            i1li1.f17366OooO00o.OooO00o(true, i1li1.f17369OooO00o, this.f17375OooO00o.m16879OooO00o());
            int i = 0;
            while (true) {
                jArr2 = this.f17378OooO00o;
                if (i >= jArr2.length) {
                    break;
                }
                jArr2[i] = C5803Ll.OooO00o(this.f17377OooO00o, i * 8);
                i++;
            }
            i1Li1.this.f17366OooO00o.OooO00o(jArr2, jArr);
            for (int i2 = 0; i2 < jArr.length; i2++) {
                jArr[i2] = jArr[i2] ^ this.f17378OooO00o[i2];
            }
        }

        public void OooO00o(int i) {
            this.f17375OooO00o.m16877OooO00o();
            this.f17375OooO00o.OooO0O0(i);
            this.OooO00o = 0;
        }

        public void OooO00o(OooO0OO oooO0OO) {
            this.f17377OooO00o = C9586iIILl.m21633OooO00o(oooO0OO.f17377OooO00o, this.f17377OooO00o);
            this.OooO00o = oooO0OO.OooO00o;
            this.f17378OooO00o = C9586iIILl.m21641OooO00o(oooO0OO.f17378OooO00o, this.f17378OooO00o);
            this.f17375OooO00o.OooO00o(oooO0OO.f17375OooO00o);
        }

        public void OooO00o(byte[] bArr, int i, int i2, long[] jArr) {
            int i3 = 0;
            while (i2 > i3) {
                if (this.OooO00o == this.f17377OooO00o.length) {
                    OooO0O0(jArr);
                    this.f17375OooO00o.OooO0O0(false);
                    this.OooO00o = 0;
                }
                int min = Math.min(i2 - i3, this.f17377OooO00o.length - this.OooO00o);
                System.arraycopy(bArr, i + i3, this.f17377OooO00o, this.OooO00o, min);
                i3 += min;
                this.OooO00o += min;
                this.f17375OooO00o.OooO00o(min);
            }
        }

        public void OooO00o(long[] jArr) {
            int i = this.OooO00o;
            while (true) {
                byte[] bArr = this.f17377OooO00o;
                if (i < bArr.length) {
                    bArr[i] = 0;
                    i++;
                } else {
                    this.f17375OooO00o.OooO00o(true);
                    OooO0O0(jArr);
                    return;
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.i1Li1$OooO0Oo  reason: case insensitive filesystem */
    public static class C6023OooO0Oo {
        public static final long OooO00o = 9223372034707292160L;
        public static final long OooO0O0 = Long.MIN_VALUE;
        public static final long OooO0OO = 4611686018427387904L;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f17379OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long[] f17380OooO00o = new long[2];

        public C6023OooO0Oo() {
            m16877OooO00o();
        }

        public int OooO00o() {
            return (int) ((this.f17380OooO00o[1] >>> 56) & 63);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m16877OooO00o() {
            long[] jArr = this.f17380OooO00o;
            jArr[0] = 0;
            jArr[1] = 0;
            this.f17379OooO00o = false;
            OooO0O0(true);
        }

        public void OooO00o(int i) {
            if (this.f17379OooO00o) {
                long[] jArr = this.f17380OooO00o;
                long[] jArr2 = {jArr[0] & 4294967295L, (jArr[0] >>> 32) & 4294967295L, jArr[1] & 4294967295L};
                long j = (long) i;
                for (int i2 = 0; i2 < 3; i2++) {
                    long j2 = j + jArr2[i2];
                    jArr2[i2] = j2;
                    j = j2 >>> 32;
                }
                long[] jArr3 = this.f17380OooO00o;
                jArr3[0] = ((jArr2[1] & 4294967295L) << 32) | (jArr2[0] & 4294967295L);
                jArr3[1] = (jArr2[2] & 4294967295L) | (jArr3[1] & -4294967296L);
                return;
            }
            long[] jArr4 = this.f17380OooO00o;
            long j3 = jArr4[0] + ((long) i);
            jArr4[0] = j3;
            if (j3 > OooO00o) {
                this.f17379OooO00o = true;
            }
        }

        public void OooO00o(C6023OooO0Oo oooO0Oo) {
            this.f17380OooO00o = C9586iIILl.m21641OooO00o(oooO0Oo.f17380OooO00o, this.f17380OooO00o);
            this.f17379OooO00o = oooO0Oo.f17379OooO00o;
        }

        public void OooO00o(boolean z) {
            if (z) {
                long[] jArr = this.f17380OooO00o;
                jArr[1] = jArr[1] | Long.MIN_VALUE;
                return;
            }
            long[] jArr2 = this.f17380OooO00o;
            jArr2[1] = jArr2[1] & Long.MAX_VALUE;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m16878OooO00o() {
            return (this.f17380OooO00o[1] & Long.MIN_VALUE) != 0;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public long[] m16879OooO00o() {
            return this.f17380OooO00o;
        }

        public void OooO0O0(int i) {
            long[] jArr = this.f17380OooO00o;
            jArr[1] = (jArr[1] & -274877906944L) | ((((long) i) & 63) << 56);
        }

        public void OooO0O0(boolean z) {
            if (z) {
                long[] jArr = this.f17380OooO00o;
                jArr[1] = jArr[1] | OooO0OO;
                return;
            }
            long[] jArr2 = this.f17380OooO00o;
            jArr2[1] = jArr2[1] & -4611686018427387905L;
        }

        public boolean OooO0O0() {
            return (this.f17380OooO00o[1] & OooO0OO) != 0;
        }

        public String toString() {
            return OooO00o() + " first: " + OooO0O0() + ", final: " + m16878OooO00o();
        }
    }

    static {
        OooO00o(256, 128, new long[]{-2228972824489528736L, -8629553674646093540L, 1155188648486244218L, -3677226592081559102L});
        OooO00o(256, 160, new long[]{1450197650740764312L, 3081844928540042640L, -3136097061834271170L, 3301952811952417661L});
        OooO00o(256, (int) C7967oO0oOo00.Ooooo0o, new long[]{-4176654842910610933L, -8688192972455077604L, -7364642305011795836L, 4056579644589979102L});
        OooO00o(256, 256, new long[]{-243853671043386295L, 3443677322885453875L, -5531612722399640561L, 7662005193972177513L});
        OooO00o(512, 128, new long[]{-6288014694233956526L, 2204638249859346602L, 3502419045458743507L, -4829063503441264548L, 983504137758028059L, 1880512238245786339L, -6715892782214108542L, 7602827311880509485L});
        OooO00o(512, 160, new long[]{2934123928682216849L, -4399710721982728305L, 1684584802963255058L, 5744138295201861711L, 2444857010922934358L, -2807833639722848072L, -5121587834665610502L, 118355523173251694L});
        OooO00o(512, (int) C7967oO0oOo00.Ooooo0o, new long[]{-3688341020067007964L, -3772225436291745297L, -8300862168937575580L, 4146387520469897396L, 1106145742801415120L, 7455425944880474941L, -7351063101234211863L, -7048981346965512457L});
        OooO00o(512, 384, new long[]{-6631894876634615969L, -5692838220127733084L, -7099962856338682626L, -2911352911530754598L, 2000907093792408677L, 9140007292425499655L, 6093301768906360022L, 2769176472213098488L});
        OooO00o(512, 512, new long[]{5261240102383538638L, 978932832955457283L, -8083517948103779378L, -7339365279355032399L, 6752626034097301424L, -1531723821829733388L, -7417126464950782685L, -5901786942805128141L});
    }

    public i1Li1(int i, int i2) {
        this.f17371OooO0O0 = new byte[1];
        if (i2 % 8 == 0) {
            this.f17365OooO00o = i2 / 8;
            C5803Ll r4 = new C5803Ll(i);
            this.f17366OooO00o = r4;
            this.f17367OooO00o = new OooO0OO(r4.OooO00o());
            return;
        }
        throw new IllegalArgumentException("Output size must be a multiple of 8 bits. :" + i2);
    }

    public i1Li1(i1Li1 i1li1) {
        this(i1li1.OooO00o() * 8, i1li1.m16875OooO0O0() * 8);
        OooO00o(i1li1);
    }

    public static Integer OooO00o(int i, int i2) {
        return new Integer(i | (i2 << 16));
    }

    private void OooO00o(int i) {
        this.f17367OooO00o.OooO00o(i);
    }

    public static void OooO00o(int i, int i2, long[] jArr) {
        OooO00o.put(OooO00o(i / 8, i2 / 8), jArr);
    }

    private void OooO00o(int i, byte[] bArr) {
        OooO00o(i);
        this.f17367OooO00o.OooO00o(bArr, 0, bArr.length, this.f17369OooO00o);
        OooO0Oo();
    }

    private void OooO00o(long j, byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[8];
        C5803Ll.OooO00o(j, bArr2, 0);
        long[] jArr = new long[this.f17369OooO00o.length];
        OooO00o(63);
        this.f17367OooO00o.OooO00o(bArr2, 0, 8, jArr);
        this.f17367OooO00o.OooO00o(jArr);
        int i3 = ((i2 + 8) - 1) / 8;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i4 * 8;
            int min = Math.min(8, i2 - i5);
            if (min == 8) {
                C5803Ll.OooO00o(jArr[i4], bArr, i5 + i);
            } else {
                C5803Ll.OooO00o(jArr[i4], bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i5 + i, min);
            }
        }
    }

    private void OooO00o(i1Li1 i1li1) {
        this.f17367OooO00o.OooO00o(i1li1.f17367OooO00o);
        this.f17369OooO00o = C9586iIILl.m21641OooO00o(i1li1.f17369OooO00o, this.f17369OooO00o);
        this.f17372OooO0O0 = C9586iIILl.m21641OooO00o(i1li1.f17372OooO0O0, this.f17372OooO0O0);
        this.f17368OooO00o = C9586iIILl.m21633OooO00o(i1li1.f17368OooO00o, this.f17368OooO00o);
        this.f17370OooO00o = OooO00o(i1li1.f17370OooO00o, this.f17370OooO00o);
        this.f17373OooO0O0 = OooO00o(i1li1.f17373OooO0O0, this.f17373OooO0O0);
    }

    private void OooO00o(Hashtable hashtable) {
        Enumeration keys = hashtable.keys();
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            byte[] bArr = (byte[]) hashtable.get(num);
            if (num.intValue() == 0) {
                this.f17368OooO00o = bArr;
            } else if (num.intValue() < 48) {
                vector.addElement(new OooO0O0(num.intValue(), bArr));
            } else {
                vector2.addElement(new OooO0O0(num.intValue(), bArr));
            }
        }
        OooO0O0[] oooO0O0Arr = new OooO0O0[vector.size()];
        this.f17370OooO00o = oooO0O0Arr;
        vector.copyInto(oooO0O0Arr);
        OooO00o(this.f17370OooO00o);
        OooO0O0[] oooO0O0Arr2 = new OooO0O0[vector2.size()];
        this.f17373OooO0O0 = oooO0O0Arr2;
        vector2.copyInto(oooO0O0Arr2);
        OooO00o(this.f17373OooO0O0);
    }

    public static void OooO00o(OooO0O0[] oooO0O0Arr) {
        if (oooO0O0Arr != null) {
            for (int i = 1; i < oooO0O0Arr.length; i++) {
                OooO0O0 oooO0O0 = oooO0O0Arr[i];
                int i2 = i;
                while (i2 > 0) {
                    int i3 = i2 - 1;
                    if (oooO0O0.OooO00o() >= oooO0O0Arr[i3].OooO00o()) {
                        break;
                    }
                    oooO0O0Arr[i2] = oooO0O0Arr[i3];
                    i2 = i3;
                }
                oooO0O0Arr[i2] = oooO0O0;
            }
        }
    }

    public static OooO0O0[] OooO00o(OooO0O0[] oooO0O0Arr, OooO0O0[] oooO0O0Arr2) {
        if (oooO0O0Arr == null) {
            return null;
        }
        if (oooO0O0Arr2 == null || oooO0O0Arr2.length != oooO0O0Arr.length) {
            oooO0O0Arr2 = new OooO0O0[oooO0O0Arr.length];
        }
        System.arraycopy(oooO0O0Arr, 0, oooO0O0Arr2, 0, oooO0O0Arr2.length);
        return oooO0O0Arr2;
    }

    private void OooO0O0() {
        if (this.f17367OooO00o == null) {
            throw new IllegalArgumentException("Skein engine is not initialised.");
        }
    }

    private void OooO0OO() {
        long[] jArr = (long[]) OooO00o.get(OooO00o(OooO00o(), m16875OooO0O0()));
        int i = 0;
        if (this.f17368OooO00o != null || jArr == null) {
            this.f17369OooO00o = new long[(OooO00o() / 8)];
            byte[] bArr = this.f17368OooO00o;
            if (bArr != null) {
                OooO00o(0, bArr);
            }
            OooO00o(4, new OooO00o((long) (this.f17365OooO00o * 8)).OooO00o());
        } else {
            this.f17369OooO00o = C9586iIILl.m21639OooO00o(jArr);
        }
        if (this.f17370OooO00o != null) {
            while (true) {
                OooO0O0[] oooO0O0Arr = this.f17370OooO00o;
                if (i >= oooO0O0Arr.length) {
                    break;
                }
                OooO0O0 oooO0O0 = oooO0O0Arr[i];
                OooO00o(oooO0O0.OooO00o(), oooO0O0.m16876OooO00o());
                i++;
            }
        }
        this.f17372OooO0O0 = C9586iIILl.m21639OooO00o(this.f17369OooO00o);
    }

    private void OooO0Oo() {
        this.f17367OooO00o.OooO00o(this.f17369OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public int OooO00o() {
        return this.f17366OooO00o.OooO00o();
    }

    public int OooO00o(byte[] bArr, int i) {
        OooO0O0();
        if (bArr.length >= this.f17365OooO00o + i) {
            OooO0Oo();
            if (this.f17373OooO0O0 != null) {
                int i2 = 0;
                while (true) {
                    OooO0O0[] oooO0O0Arr = this.f17373OooO0O0;
                    if (i2 >= oooO0O0Arr.length) {
                        break;
                    }
                    OooO0O0 oooO0O0 = oooO0O0Arr[i2];
                    OooO00o(oooO0O0.OooO00o(), oooO0O0.m16876OooO00o());
                    i2++;
                }
            }
            int OooO00o2 = OooO00o();
            int i3 = ((this.f17365OooO00o + OooO00o2) - 1) / OooO00o2;
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i4 * OooO00o2;
                OooO00o((long) i4, bArr, i + i5, Math.min(OooO00o2, this.f17365OooO00o - i5));
            }
            m16874OooO00o();
            return this.f17365OooO00o;
        }
        throw new OutputLengthException("Output buffer is too short to hold output");
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6186iLi1 m16873OooO00o() {
        return new i1Li1(this);
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16874OooO00o() {
        long[] jArr = this.f17372OooO0O0;
        long[] jArr2 = this.f17369OooO00o;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        OooO00o(48);
    }

    public void OooO00o(byte b) {
        byte[] bArr = this.f17371OooO0O0;
        bArr[0] = b;
        OooO00o(bArr, 0, 1);
    }

    public void OooO00o(LLLilLi r3) {
        this.f17369OooO00o = null;
        this.f17368OooO00o = null;
        this.f17370OooO00o = null;
        this.f17373OooO0O0 = null;
        if (r3 != null) {
            if (r3.m16431OooO00o().length >= 16) {
                OooO00o(r3.OooO00o());
            } else {
                throw new IllegalArgumentException("Skein key must be at least 128 bits.");
            }
        }
        OooO0OO();
        OooO00o(48);
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r3) {
        i1Li1 i1li1 = (i1Li1) r3;
        if (OooO00o() == i1li1.OooO00o() && this.f17365OooO00o == i1li1.f17365OooO00o) {
            OooO00o(i1li1);
            return;
        }
        throw new IllegalArgumentException("Incompatible parameters in provided SkeinEngine.");
    }

    public void OooO00o(byte[] bArr, int i, int i2) {
        OooO0O0();
        this.f17367OooO00o.OooO00o(bArr, i, i2, this.f17369OooO00o);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m16875OooO0O0() {
        return this.f17365OooO00o;
    }
}
