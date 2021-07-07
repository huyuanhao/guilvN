package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC9738llL1L;
import com.p118pd.sdk.AbstractC97441iIIL;
import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Random;

/* renamed from: com.pd.sdk.IIi丨LIli  reason: invalid class name */
public abstract class IIiLIli {
    public static final int OooO = 7;
    public static final int OooO0O0 = 0;
    public static final int OooO0OO = 1;
    public static final int OooO0Oo = 2;
    public static final int OooO0o = 4;
    public static final int OooO0o0 = 3;
    public static final int OooO0oO = 5;
    public static final int OooO0oo = 6;
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IILLii1l f15495OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6047i1lLI f15496OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6615lLl1Ii f15497OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC97441iIIL f15498OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f15499OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public AbstractC97441iIIL f15500OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public BigInteger f15501OooO0O0;

    /* renamed from: com.pd.sdk.IIi丨LIli$OooO00o */
    public class OooO00o implements AbstractC6100iILll {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ byte[] f15503OooO00o;
        public final /* synthetic */ int OooO0O0;

        public OooO00o(int i, int i2, byte[] bArr) {
            this.OooO00o = i;
            this.OooO0O0 = i2;
            this.f15503OooO00o = bArr;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public int OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6100iILll
        public AbstractC9738llL1L OooO00o(int i) {
            int i2;
            int i3 = this.OooO0O0;
            byte[] bArr = new byte[i3];
            byte[] bArr2 = new byte[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < this.OooO00o; i5++) {
                int i6 = ((i5 ^ i) - 1) >> 31;
                int i7 = 0;
                while (true) {
                    i2 = this.OooO0O0;
                    if (i7 >= i2) {
                        break;
                    }
                    byte b = bArr[i7];
                    byte[] bArr3 = this.f15503OooO00o;
                    bArr[i7] = (byte) (b ^ (bArr3[i4 + i7] & i6));
                    bArr2[i7] = (byte) ((bArr3[(i2 + i4) + i7] & i6) ^ bArr2[i7]);
                    i7++;
                }
                i4 += i2 * 2;
            }
            IIiLIli r12 = IIiLIli.this;
            return r12.OooO00o(r12.OooO00o(new BigInteger(1, bArr)), IIiLIli.this.OooO00o(new BigInteger(1, bArr2)), false);
        }
    }

    /* renamed from: com.pd.sdk.IIi丨LIli$OooO0O0 */
    public static abstract class OooO0O0 extends IIiLIli {
        public BigInteger[] OooO00o = null;

        public OooO0O0(int i, int i2, int i3, int i4) {
            super(OooO00o(i, i2, i3, i4));
        }

        public static AbstractC6047i1lLI OooO00o(int i, int i2, int i3, int i4) {
            if (i2 == 0) {
                throw new IllegalArgumentException("k1 must be > 0");
            } else if (i3 == 0) {
                if (i4 == 0) {
                    return AbstractC5207IIii.OooO00o(new int[]{0, i2, i});
                }
                throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
            } else if (i3 <= i2) {
                throw new IllegalArgumentException("k2 must be > k1");
            } else if (i4 > i3) {
                return AbstractC5207IIii.OooO00o(new int[]{0, i2, i3, i4, i});
            } else {
                throw new IllegalArgumentException("k3 must be > k2");
            }
        }

        public static BigInteger OooO00o(int i, int[] iArr, BigInteger bigInteger) {
            return new IiL1Li(bigInteger).OooO00o(i, iArr).m15588OooO00o();
        }

        @Override // com.p118pd.sdk.IIiLIli
        public AbstractC9738llL1L OooO00o(int i, BigInteger bigInteger) {
            AbstractC97441iIIL r4;
            AbstractC97441iIIL OooO00o2 = OooO00o(bigInteger);
            if (OooO00o2.m21863OooO0O0()) {
                r4 = m15400OooO0O0().OooO0Oo();
            } else {
                AbstractC97441iIIL OooO00o3 = OooO00o(OooO00o2.OooO0o0().m21862OooO0O0().OooO0OO(m15400OooO0O0()).OooO00o(m15394OooO00o()).OooO00o(OooO00o2));
                if (OooO00o3 != null) {
                    if (OooO00o3.m21864OooO0OO() != (i == 1)) {
                        OooO00o3 = OooO00o3.m21857OooO00o();
                    }
                    int OooO00o4 = m15387OooO00o();
                    r4 = (OooO00o4 == 5 || OooO00o4 == 6) ? OooO00o3.OooO00o(OooO00o2) : OooO00o3.OooO0OO(OooO00o2);
                } else {
                    r4 = null;
                }
            }
            if (r4 != null) {
                return OooO00o(OooO00o2, r4, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        @Override // com.p118pd.sdk.IIiLIli
        public AbstractC9738llL1L OooO00o(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
            AbstractC97441iIIL OooO00o2 = OooO00o(bigInteger);
            AbstractC97441iIIL OooO00o3 = OooO00o(bigInteger2);
            int OooO00o4 = m15387OooO00o();
            if (OooO00o4 == 5 || OooO00o4 == 6) {
                if (!OooO00o2.m21863OooO0O0()) {
                    OooO00o3 = OooO00o3.OooO0O0(OooO00o2).OooO00o(OooO00o2);
                } else if (!OooO00o3.OooO0o0().equals(m15400OooO0O0())) {
                    throw new IllegalArgumentException();
                }
            }
            return OooO00o(OooO00o2, OooO00o3, z);
        }

        public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r9) {
            AbstractC97441iIIL r6;
            if (r9.m21863OooO0O0()) {
                return r9;
            }
            AbstractC97441iIIL OooO00o2 = OooO00o(AbstractC5490IlLL.OooO00o);
            int OooO0O0 = OooO0O0();
            Random random = new Random();
            do {
                AbstractC97441iIIL OooO00o3 = OooO00o(new BigInteger(OooO0O0, random));
                AbstractC97441iIIL r5 = r9;
                r6 = OooO00o2;
                for (int i = 1; i < OooO0O0; i++) {
                    AbstractC97441iIIL OooO0o0 = r5.OooO0o0();
                    r6 = r6.OooO0o0().OooO00o(OooO0o0.OooO0OO(OooO00o3));
                    r5 = OooO0o0.OooO00o(r9);
                }
                if (!r5.m21863OooO0O0()) {
                    return null;
                }
            } while (r6.OooO0o0().OooO00o(r6).m21863OooO0O0());
            return r6;
        }

        @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
        public boolean OooO00o() {
            return ((IIiLIli) this).f15499OooO00o != null && ((IIiLIli) this).f15501OooO0O0 != null && ((IIiLIli) this).f15500OooO0O0.m21860OooO00o() && (((IIiLIli) this).f15498OooO00o.m21863OooO0O0() || ((IIiLIli) this).f15498OooO00o.m21860OooO00o());
        }

        @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
        public boolean OooO00o(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= OooO0O0();
        }

        @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
        /* renamed from: OooO00o  reason: collision with other method in class */
        public synchronized BigInteger[] m15402OooO00o() {
            if (this.OooO00o == null) {
                this.OooO00o = C9609iLi.m21666OooO00o(this);
            }
            return this.OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.IIi丨LIli$OooO0OO */
    public static abstract class OooO0OO extends IIiLIli {
        public OooO0OO(BigInteger bigInteger) {
            super(AbstractC5207IIii.OooO00o(bigInteger));
        }

        @Override // com.p118pd.sdk.IIiLIli
        public AbstractC9738llL1L OooO00o(int i, BigInteger bigInteger) {
            AbstractC97441iIIL OooO00o = OooO00o(bigInteger);
            AbstractC97441iIIL OooO0Oo = OooO00o.OooO0o0().OooO00o(((IIiLIli) this).f15498OooO00o).OooO0OO(OooO00o).OooO00o(((IIiLIli) this).f15500OooO0O0).OooO0Oo();
            if (OooO0Oo != null) {
                if (OooO0Oo.m21864OooO0OO() != (i == 1)) {
                    OooO0Oo = OooO0Oo.OooO0OO();
                }
                return OooO00o(OooO00o, OooO0Oo, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
        public boolean OooO00o(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(m15391OooO00o().OooO00o()) < 0;
        }
    }

    /* renamed from: com.pd.sdk.IIi丨LIli$OooO0Oo  reason: case insensitive filesystem */
    public class C5230OooO0Oo {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public IILLii1l f15504OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC6615lLl1Ii f15506OooO00o;

        public C5230OooO0Oo(int i, IILLii1l iILLii1l, AbstractC6615lLl1Ii r4) {
            this.OooO00o = i;
            this.f15504OooO00o = iILLii1l;
            this.f15506OooO00o = r4;
        }

        public C5230OooO0Oo OooO00o(int i) {
            this.OooO00o = i;
            return this;
        }

        public C5230OooO0Oo OooO00o(IILLii1l iILLii1l) {
            this.f15504OooO00o = iILLii1l;
            return this;
        }

        public C5230OooO0Oo OooO00o(AbstractC6615lLl1Ii r1) {
            this.f15506OooO00o = r1;
            return this;
        }

        public IIiLIli OooO00o() {
            if (IIiLIli.this.OooO00o(this.OooO00o)) {
                IIiLIli OooO00o2 = IIiLIli.this.m15390OooO00o();
                if (OooO00o2 != IIiLIli.this) {
                    synchronized (OooO00o2) {
                        OooO00o2.OooO00o = this.OooO00o;
                        OooO00o2.f15495OooO00o = this.f15504OooO00o;
                        OooO00o2.f15497OooO00o = this.f15506OooO00o;
                    }
                    return OooO00o2;
                }
                throw new IllegalStateException("implementation returned current curve");
            }
            throw new IllegalStateException("unsupported coordinate system");
        }
    }

    /* renamed from: com.pd.sdk.IIi丨LIli$OooO0o */
    public static class OooO0o extends OooO0OO {
        public static final int OooOO0 = 4;
        public AbstractC9738llL1L.C9740OooO0o0 OooO00o;
        public BigInteger OooO0OO;
        public BigInteger OooO0Oo;

        public OooO0o(BigInteger bigInteger, BigInteger bigInteger2, AbstractC97441iIIL r10, AbstractC97441iIIL r11) {
            this(bigInteger, bigInteger2, r10, r11, null, null);
        }

        public OooO0o(BigInteger bigInteger, BigInteger bigInteger2, AbstractC97441iIIL r4, AbstractC97441iIIL r5, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.OooO0OO = bigInteger;
            this.OooO0Oo = bigInteger2;
            this.OooO00o = new AbstractC9738llL1L.C9740OooO0o0(this, null, null, false);
            ((IIiLIli) this).f15498OooO00o = r4;
            ((IIiLIli) this).f15500OooO0O0 = r5;
            ((IIiLIli) this).f15499OooO00o = bigInteger3;
            ((IIiLIli) this).f15501OooO0O0 = bigInteger4;
            ((IIiLIli) this).OooO00o = 4;
        }

        public OooO0o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        public OooO0o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.OooO0OO = bigInteger;
            this.OooO0Oo = AbstractC97441iIIL.C9745OooO0Oo.OooO0o(bigInteger);
            this.OooO00o = new AbstractC9738llL1L.C9740OooO0o0(this, null, null, false);
            ((IIiLIli) this).f15498OooO00o = OooO00o(bigInteger2);
            ((IIiLIli) this).f15500OooO0O0 = OooO00o(bigInteger3);
            ((IIiLIli) this).f15499OooO00o = bigInteger4;
            ((IIiLIli) this).f15501OooO0O0 = bigInteger5;
            ((IIiLIli) this).OooO00o = 4;
        }

        @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
        public IIiLIli OooO00o() {
            return new OooO0o(this.OooO0OO, this.OooO0Oo, ((IIiLIli) this).f15498OooO00o, ((IIiLIli) this).f15500OooO0O0, ((IIiLIli) this).f15499OooO00o, ((IIiLIli) this).f15501OooO0O0);
        }

        @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
        /* renamed from: OooO00o  reason: collision with other method in class */
        public AbstractC9738llL1L m15403OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
        public AbstractC9738llL1L OooO00o(AbstractC9738llL1L r9) {
            int OooO00o2;
            return (this == r9.m21800OooO00o() || m15387OooO00o() != 2 || r9.m21814OooO0OO() || !((OooO00o2 = r9.m21800OooO00o().m15387OooO00o()) == 2 || OooO00o2 == 3 || OooO00o2 == 4)) ? IIiLIli.super.OooO00o(r9) : new AbstractC9738llL1L.C9740OooO0o0(this, OooO00o(r9.f23369OooO00o.m21859OooO00o()), OooO00o(r9.f23373OooO0O0.m21859OooO00o()), new AbstractC97441iIIL[]{OooO00o(r9.f23372OooO00o[0].m21859OooO00o())}, r9.f23371OooO00o);
        }

        @Override // com.p118pd.sdk.IIiLIli
        public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r2, AbstractC97441iIIL r3, boolean z) {
            return new AbstractC9738llL1L.C9740OooO0o0(this, r2, r3, z);
        }

        @Override // com.p118pd.sdk.IIiLIli
        public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r8, AbstractC97441iIIL r9, AbstractC97441iIIL[] r10, boolean z) {
            return new AbstractC9738llL1L.C9740OooO0o0(this, r8, r9, r10, z);
        }

        @Override // com.p118pd.sdk.IIiLIli.OooO0OO, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
        public AbstractC97441iIIL OooO00o(BigInteger bigInteger) {
            return new AbstractC97441iIIL.C9745OooO0Oo(this.OooO0OO, this.OooO0Oo, bigInteger);
        }

        @Override // com.p118pd.sdk.IIiLIli
        public boolean OooO00o(int i) {
            return i == 0 || i == 1 || i == 2 || i == 4;
        }

        @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
        public int OooO0O0() {
            return this.OooO0OO.bitLength();
        }

        public BigInteger OooO0OO() {
            return this.OooO0OO;
        }
    }

    /* renamed from: com.pd.sdk.IIi丨LIli$OooO0o0  reason: case insensitive filesystem */
    public static class C5231OooO0o0 extends OooO0O0 {
        public static final int OooOOO = 6;
        public AbstractC9738llL1L.C9739OooO0Oo OooO00o;
        public int OooOO0;
        public int OooOO0O;
        public int OooOO0o;
        public int OooOOO0;

        /* renamed from: com.pd.sdk.IIi丨LIli$OooO0o0$OooO00o */
        public class OooO00o implements AbstractC6100iILll {
            public final /* synthetic */ int OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ int[] f15508OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ long[] f15509OooO00o;
            public final /* synthetic */ int OooO0O0;

            public OooO00o(int i, int i2, long[] jArr, int[] iArr) {
                this.OooO00o = i;
                this.OooO0O0 = i2;
                this.f15509OooO00o = jArr;
                this.f15508OooO00o = iArr;
            }

            @Override // com.p118pd.sdk.AbstractC6100iILll
            public int OooO00o() {
                return this.OooO00o;
            }

            @Override // com.p118pd.sdk.AbstractC6100iILll
            public AbstractC9738llL1L OooO00o(int i) {
                int i2;
                long[] OooO00o2 = C1iiIiI.m21325OooO00o(this.OooO0O0);
                long[] OooO00o3 = C1iiIiI.m21325OooO00o(this.OooO0O0);
                int i3 = 0;
                for (int i4 = 0; i4 < this.OooO00o; i4++) {
                    long j = (long) (((i4 ^ i) - 1) >> 31);
                    int i5 = 0;
                    while (true) {
                        i2 = this.OooO0O0;
                        if (i5 >= i2) {
                            break;
                        }
                        long j2 = OooO00o2[i5];
                        long[] jArr = this.f15509OooO00o;
                        OooO00o2[i5] = j2 ^ (jArr[i3 + i5] & j);
                        OooO00o3[i5] = OooO00o3[i5] ^ (jArr[(i2 + i3) + i5] & j);
                        i5++;
                    }
                    i3 += i2 * 2;
                }
                return C5231OooO0o0.this.OooO00o((AbstractC97441iIIL) new AbstractC97441iIIL.OooO0OO(C5231OooO0o0.this.OooOO0, this.f15508OooO00o, new IiL1Li(OooO00o2)), (AbstractC97441iIIL) new AbstractC97441iIIL.OooO0OO(C5231OooO0o0.this.OooOO0, this.f15508OooO00o, new IiL1Li(OooO00o3)), false);
            }
        }

        public C5231OooO0o0(int i, int i2, int i3, int i4, AbstractC97441iIIL r5, AbstractC97441iIIL r6, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i, i2, i3, i4);
            this.OooOO0 = i;
            this.OooOO0O = i2;
            this.OooOO0o = i3;
            this.OooOOO0 = i4;
            ((IIiLIli) this).f15499OooO00o = bigInteger;
            ((IIiLIli) this).f15501OooO0O0 = bigInteger2;
            this.OooO00o = new AbstractC9738llL1L.C9739OooO0Oo(this, null, null, false);
            ((IIiLIli) this).f15498OooO00o = r5;
            ((IIiLIli) this).f15500OooO0O0 = r6;
            ((IIiLIli) this).OooO00o = 6;
        }

        public C5231OooO0o0(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i, i2, i3, i4, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public C5231OooO0o0(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            this.OooOO0 = i;
            this.OooOO0O = i2;
            this.OooOO0o = i3;
            this.OooOOO0 = i4;
            ((IIiLIli) this).f15499OooO00o = bigInteger3;
            ((IIiLIli) this).f15501OooO0O0 = bigInteger4;
            this.OooO00o = new AbstractC9738llL1L.C9739OooO0Oo(this, null, null, false);
            ((IIiLIli) this).f15498OooO00o = OooO00o(bigInteger);
            ((IIiLIli) this).f15500OooO0O0 = OooO00o(bigInteger2);
            ((IIiLIli) this).OooO00o = 6;
        }

        public C5231OooO0o0(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public C5231OooO0o0(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
        public IIiLIli OooO00o() {
            return new C5231OooO0o0(this.OooOO0, this.OooOO0O, this.OooOO0o, this.OooOOO0, ((IIiLIli) this).f15498OooO00o, ((IIiLIli) this).f15500OooO0O0, ((IIiLIli) this).f15499OooO00o, ((IIiLIli) this).f15501OooO0O0);
        }

        @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
        public AbstractC6100iILll OooO00o(AbstractC9738llL1L[] r8, int i, int i2) {
            int i3 = (this.OooOO0 + 63) >>> 6;
            int[] iArr = m15406OooO0O0() ? new int[]{this.OooOO0O} : new int[]{this.OooOO0O, this.OooOO0o, this.OooOOO0};
            long[] jArr = new long[(i2 * i3 * 2)];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                AbstractC9738llL1L r1 = r8[i + i5];
                ((AbstractC97441iIIL.OooO0OO) r1.m21813OooO0OO()).f23379OooO00o.OooO00o(jArr, i4);
                int i6 = i4 + i3;
                ((AbstractC97441iIIL.OooO0OO) r1.m21815OooO0Oo()).f23379OooO00o.OooO00o(jArr, i6);
                i4 = i6 + i3;
            }
            return new OooO00o(i2, i3, jArr, iArr);
        }

        @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
        /* renamed from: OooO00o  reason: collision with other method in class */
        public AbstractC6615lLl1Ii m15404OooO00o() {
            return OooO00o() ? new lL1LiiI() : IIiLIli.super.m15392OooO00o();
        }

        @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
        /* renamed from: OooO00o  reason: collision with other method in class */
        public AbstractC9738llL1L m15405OooO00o() {
            return this.OooO00o;
        }

        @Override // com.p118pd.sdk.IIiLIli
        public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r2, AbstractC97441iIIL r3, boolean z) {
            return new AbstractC9738llL1L.C9739OooO0Oo(this, r2, r3, z);
        }

        @Override // com.p118pd.sdk.IIiLIli
        public AbstractC9738llL1L OooO00o(AbstractC97441iIIL r8, AbstractC97441iIIL r9, AbstractC97441iIIL[] r10, boolean z) {
            return new AbstractC9738llL1L.C9739OooO0Oo(this, r8, r9, r10, z);
        }

        @Override // com.p118pd.sdk.IIiLIli.OooO0O0, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
        public AbstractC97441iIIL OooO00o(BigInteger bigInteger) {
            return new AbstractC97441iIIL.OooO0OO(this.OooOO0, this.OooOO0O, this.OooOO0o, this.OooOOO0, bigInteger);
        }

        @Override // com.p118pd.sdk.IIiLIli
        public boolean OooO00o(int i) {
            return i == 0 || i == 1 || i == 6;
        }

        @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
        public int OooO0O0() {
            return this.OooOO0;
        }

        @Override // com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli, com.p118pd.sdk.IIiLIli
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m15406OooO0O0() {
            return this.OooOO0o == 0 && this.OooOOO0 == 0;
        }

        public int OooO0OO() {
            return this.OooOO0O;
        }

        public int OooO0Oo() {
            return this.OooOO0o;
        }

        public int OooO0o() {
            return this.OooOO0;
        }

        public int OooO0o0() {
            return this.OooOOO0;
        }
    }

    public IIiLIli(AbstractC6047i1lLI i1lli) {
        this.f15496OooO00o = i1lli;
    }

    public static int[] OooO00o() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7};
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m15387OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public IILLii1l m15388OooO00o() {
        return this.f15495OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized C5230OooO0Oo m15389OooO00o() {
        return new C5230OooO0Oo(this.OooO00o, this.f15495OooO00o, this.f15497OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract IIiLIli m15390OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6047i1lLI m15391OooO00o() {
        return this.f15496OooO00o;
    }

    public AbstractC6100iILll OooO00o(AbstractC9738llL1L[] r13, int i, int i2) {
        int OooO0O02 = (OooO0O0() + 7) >>> 3;
        byte[] bArr = new byte[(i2 * OooO0O02 * 2)];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            AbstractC9738llL1L r5 = r13[i + i4];
            byte[] byteArray = r5.m21813OooO0OO().m21859OooO00o().toByteArray();
            byte[] byteArray2 = r5.m21815OooO0Oo().m21859OooO00o().toByteArray();
            int i5 = 1;
            int i6 = byteArray.length > OooO0O02 ? 1 : 0;
            int length = byteArray.length - i6;
            if (byteArray2.length <= OooO0O02) {
                i5 = 0;
            }
            int length2 = byteArray2.length - i5;
            int i7 = i3 + OooO0O02;
            System.arraycopy(byteArray, i6, bArr, i7 - length, length);
            i3 = i7 + OooO0O02;
            System.arraycopy(byteArray2, i5, bArr, i3 - length2, length2);
        }
        return new OooO00o(i2, OooO0O02, bArr);
    }

    public AbstractC6375iL1 OooO00o(AbstractC9738llL1L r2, String str) {
        Hashtable hashtable;
        AbstractC6375iL1 r22;
        m15396OooO00o(r2);
        synchronized (r2) {
            hashtable = r2.f23370OooO00o;
        }
        if (hashtable == null) {
            return null;
        }
        synchronized (hashtable) {
            r22 = (AbstractC6375iL1) hashtable.get(str);
        }
        return r22;
    }

    public AbstractC6375iL1 OooO00o(AbstractC9738llL1L r3, String str, iLLLIil illliil) {
        Hashtable hashtable;
        AbstractC6375iL1 OooO00o2;
        m15396OooO00o(r3);
        synchronized (r3) {
            hashtable = r3.f23370OooO00o;
            if (hashtable == null) {
                hashtable = new Hashtable(4);
                r3.f23370OooO00o = hashtable;
            }
        }
        synchronized (hashtable) {
            AbstractC6375iL1 r32 = (AbstractC6375iL1) hashtable.get(str);
            OooO00o2 = illliil.OooO00o(r32);
            if (OooO00o2 != r32) {
                hashtable.put(str, OooO00o2);
            }
        }
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6615lLl1Ii m15392OooO00o() {
        IILLii1l iILLii1l = this.f15495OooO00o;
        return iILLii1l instanceof AbstractC9584iI1I ? new C6775llLl1(this, (AbstractC9584iI1I) iILLii1l) : new iLil1lI();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract AbstractC9738llL1L m15393OooO00o();

    public abstract AbstractC9738llL1L OooO00o(int i, BigInteger bigInteger);

    public AbstractC9738llL1L OooO00o(AbstractC9738llL1L r3) {
        if (this == r3.m21800OooO00o()) {
            return r3;
        }
        if (r3.m21814OooO0OO()) {
            return m15393OooO00o();
        }
        AbstractC9738llL1L OooO0Oo2 = r3.OooO0Oo();
        return OooO00o(OooO0Oo2.m21819OooO0o0().m21859OooO00o(), OooO0Oo2.m21817OooO0o().m21859OooO00o(), OooO0Oo2.f23371OooO00o);
    }

    public abstract AbstractC9738llL1L OooO00o(AbstractC97441iIIL v, AbstractC97441iIIL v2, boolean z);

    public abstract AbstractC9738llL1L OooO00o(AbstractC97441iIIL v, AbstractC97441iIIL v2, AbstractC97441iIIL[] v3, boolean z);

    public AbstractC9738llL1L OooO00o(BigInteger bigInteger, BigInteger bigInteger2) {
        return OooO00o(bigInteger, bigInteger2, false);
    }

    public AbstractC9738llL1L OooO00o(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        return OooO00o(OooO00o(bigInteger), OooO00o(bigInteger2), z);
    }

    public AbstractC9738llL1L OooO00o(byte[] bArr) {
        AbstractC9738llL1L r8;
        int OooO0O02 = (OooO0O0() + 7) / 8;
        boolean z = false;
        byte b = bArr[0];
        if (b != 0) {
            if (b == 2 || b == 3) {
                if (bArr.length == OooO0O02 + 1) {
                    r8 = OooO00o(b & 1, IIiL.OooO00o(bArr, 1, OooO0O02));
                    if (!r8.m21820OooO0o0()) {
                        throw new IllegalArgumentException("Invalid point");
                    }
                } else {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
            } else if (b != 4) {
                if (b != 6 && b != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b, 16));
                } else if (bArr.length == (OooO0O02 * 2) + 1) {
                    BigInteger OooO00o2 = IIiL.OooO00o(bArr, 1, OooO0O02);
                    BigInteger OooO00o3 = IIiL.OooO00o(bArr, OooO0O02 + 1, OooO0O02);
                    boolean testBit = OooO00o3.testBit(0);
                    if (b == 7) {
                        z = true;
                    }
                    if (testBit == z) {
                        r8 = OooO0O0(OooO00o2, OooO00o3);
                    } else {
                        throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                    }
                } else {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
            } else if (bArr.length == (OooO0O02 * 2) + 1) {
                r8 = OooO0O0(IIiL.OooO00o(bArr, 1, OooO0O02), IIiL.OooO00o(bArr, OooO0O02 + 1, OooO0O02));
            } else {
                throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
            }
        } else if (bArr.length == 1) {
            r8 = m15393OooO00o();
        } else {
            throw new IllegalArgumentException("Incorrect length for infinity encoding");
        }
        if (b == 0 || !r8.m21814OooO0OO()) {
            return r8;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC97441iIIL m15394OooO00o() {
        return this.f15498OooO00o;
    }

    public abstract AbstractC97441iIIL OooO00o(BigInteger bigInteger);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15395OooO00o() {
        return this.f15501OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15396OooO00o(AbstractC9738llL1L r2) {
        if (r2 == null || this != r2.m21800OooO00o()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    public void OooO00o(AbstractC9738llL1L[] r3) {
        m15397OooO00o(r3, 0, r3.length);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15397OooO00o(AbstractC9738llL1L[] r3, int i, int i2) {
        if (r3 == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        } else if (i < 0 || i2 < 0 || i > r3.length - i2) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                AbstractC9738llL1L r1 = r3[i + i3];
                if (r1 != null && this != r1.m21800OooO00o()) {
                    throw new IllegalArgumentException("'points' entries must be null or on this curve");
                }
            }
        }
    }

    public void OooO00o(AbstractC9738llL1L[] r9, int i, int i2, AbstractC97441iIIL r12) {
        m15397OooO00o(r9, i, i2);
        int OooO00o2 = m15387OooO00o();
        if (OooO00o2 != 0 && OooO00o2 != 5) {
            AbstractC97441iIIL[] r0 = new AbstractC97441iIIL[i2];
            int[] iArr = new int[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = i + i4;
                AbstractC9738llL1L r6 = r9[i5];
                if (r6 != null && (r12 != null || !r6.m21816OooO0Oo())) {
                    r0[i3] = r6.m21803OooO00o(0);
                    iArr[i3] = i5;
                    i3++;
                }
            }
            if (i3 != 0) {
                Lii1I.OooO00o(r0, 0, i3, r12);
                for (int i6 = 0; i6 < i3; i6++) {
                    int i7 = iArr[i6];
                    r9[i7] = r9[i7].OooO00o(r0[i6]);
                }
            }
        } else if (r12 != null) {
            throw new IllegalArgumentException("'iso' not valid for affine coordinates");
        }
    }

    public boolean OooO00o(int i) {
        return i == 0;
    }

    public boolean OooO00o(IIiLIli r3) {
        return this == r3 || (r3 != null && m15391OooO00o().equals(r3.m15391OooO00o()) && m15394OooO00o().m21859OooO00o().equals(r3.m15394OooO00o().m21859OooO00o()) && m15400OooO0O0().m21859OooO00o().equals(r3.m15400OooO0O0().m21859OooO00o()));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m15398OooO00o(BigInteger bigInteger);

    public abstract int OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public synchronized AbstractC6615lLl1Ii m15399OooO0O0() {
        if (this.f15497OooO00o == null) {
            this.f15497OooO00o = m15392OooO00o();
        }
        return this.f15497OooO00o;
    }

    public AbstractC9738llL1L OooO0O0(BigInteger bigInteger, BigInteger bigInteger2) {
        AbstractC9738llL1L OooO00o2 = OooO00o(bigInteger, bigInteger2);
        if (OooO00o2.m21820OooO0o0()) {
            return OooO00o2;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public AbstractC9738llL1L OooO0O0(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        AbstractC9738llL1L OooO00o2 = OooO00o(bigInteger, bigInteger2, z);
        if (OooO00o2.m21820OooO0o0()) {
            return OooO00o2;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC97441iIIL m15400OooO0O0() {
        return this.f15500OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m15401OooO0O0() {
        return this.f15499OooO00o;
    }

    public void OooO0O0(AbstractC9738llL1L[] r4) {
        OooO00o(r4, 0, r4.length, (AbstractC97441iIIL) null);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof IIiLIli) && OooO00o((IIiLIli) obj));
    }

    public int hashCode() {
        return (m15391OooO00o().hashCode() ^ I11I.OooO00o(m15394OooO00o().m21859OooO00o().hashCode(), 8)) ^ I11I.OooO00o(m15400OooO0O0().m21859OooO00o().hashCode(), 16);
    }
}
