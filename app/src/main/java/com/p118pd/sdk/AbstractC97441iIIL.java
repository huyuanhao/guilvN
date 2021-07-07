package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Random;

/* renamed from: com.pd.sdk.丨丨1iIIL丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC97441iIIL implements AbstractC5490IlLL {

    /* renamed from: com.pd.sdk.丨丨1iIIL丨$OooO00o */
    public static abstract class OooO00o extends AbstractC97441iIIL {
        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
        public int OooO0OO() {
            int OooO0O0 = OooO0O0();
            AbstractC97441iIIL r3 = this;
            AbstractC97441iIIL r4 = r3;
            for (int i = 1; i < OooO0O0; i++) {
                r4 = r4.OooO0o0();
                r3 = r3.OooO00o(r4);
            }
            if (r3.m21863OooO0O0()) {
                return 0;
            }
            if (r3.m21860OooO00o()) {
                return 1;
            }
            throw new IllegalStateException("Internal error in trace calculation");
        }

        public AbstractC97441iIIL OooO0o() {
            int OooO0O0 = OooO0O0();
            if ((OooO0O0 & 1) != 0) {
                AbstractC97441iIIL r3 = this;
                AbstractC97441iIIL r4 = r3;
                for (int i = 2; i < OooO0O0; i += 2) {
                    r4 = r4.OooO00o(2);
                    r3 = r3.OooO00o(r4);
                }
                return r3;
            }
            throw new IllegalStateException("Half-trace only defined for odd m");
        }
    }

    /* renamed from: com.pd.sdk.丨丨1iIIL丨$OooO0O0 */
    public static abstract class OooO0O0 extends AbstractC97441iIIL {
    }

    /* renamed from: com.pd.sdk.丨丨1iIIL丨$OooO0OO */
    public static class OooO0OO extends OooO00o {
        public static final int OooO0OO = 1;
        public static final int OooO0Oo = 2;
        public static final int OooO0o0 = 3;
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public IiL1Li f23379OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f23380OooO00o;
        public int OooO0O0;

        public OooO0OO(int i, int i2, int i3, int i4, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i3 == 0 && i4 == 0) {
                this.OooO00o = 2;
                this.f23380OooO00o = new int[]{i2};
            } else if (i3 >= i4) {
                throw new IllegalArgumentException("k2 must be smaller than k3");
            } else if (i3 > 0) {
                this.OooO00o = 3;
                this.f23380OooO00o = new int[]{i2, i3, i4};
            } else {
                throw new IllegalArgumentException("k2 must be larger than 0");
            }
            this.OooO0O0 = i;
            this.f23379OooO00o = new IiL1Li(bigInteger);
        }

        public OooO0OO(int i, int[] iArr, IiL1Li r4) {
            this.OooO0O0 = i;
            this.OooO00o = iArr.length == 1 ? 2 : 3;
            this.f23380OooO00o = iArr;
            this.f23379OooO00o = r4;
        }

        public static void OooO00o(AbstractC97441iIIL r2, AbstractC97441iIIL r3) {
            if (!(r2 instanceof OooO0OO) || !(r3 instanceof OooO0OO)) {
                throw new IllegalArgumentException("Field elements are not both instances of ECFieldElement.F2m");
            }
            OooO0OO oooO0OO = (OooO0OO) r2;
            OooO0OO oooO0OO2 = (OooO0OO) r3;
            if (oooO0OO.OooO00o != oooO0OO2.OooO00o) {
                throw new IllegalArgumentException("One of the F2m field elements has incorrect representation");
            } else if (oooO0OO.OooO0O0 != oooO0OO2.OooO0O0 || !C9586iIILl.OooO00o(oooO0OO.f23380OooO00o, oooO0OO2.f23380OooO00o)) {
                throw new IllegalArgumentException("Field elements are not elements of the same field F2m");
            }
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
        public int OooO00o() {
            return this.f23379OooO00o.OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public AbstractC97441iIIL m21865OooO00o() {
            return new OooO0OO(this.OooO0O0, this.f23380OooO00o, this.f23379OooO00o.m15587OooO00o());
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO00o(int i) {
            if (i < 1) {
                return this;
            }
            int i2 = this.OooO0O0;
            int[] iArr = this.f23380OooO00o;
            return new OooO0OO(i2, iArr, this.f23379OooO00o.OooO00o(i, i2, iArr));
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r4) {
            IiL1Li r0 = (IiL1Li) this.f23379OooO00o.clone();
            r0.OooO00o(((OooO0OO) r4).f23379OooO00o, 0);
            return new OooO0OO(this.OooO0O0, this.f23380OooO00o, r0);
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public AbstractC97441iIIL m21866OooO00o(AbstractC97441iIIL r1, AbstractC97441iIIL r2) {
            return OooO0O0(r1, r2);
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3) {
            return OooO0O0(r1, r2, r3);
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m21867OooO00o() {
            return "F2m";
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public BigInteger m21868OooO00o() {
            return this.f23379OooO00o.m15588OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m21869OooO00o() {
            return this.f23379OooO00o.m15590OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
        public int OooO0O0() {
            return this.OooO0O0;
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public AbstractC97441iIIL m21870OooO0O0() {
            int i = this.OooO0O0;
            int[] iArr = this.f23380OooO00o;
            return new OooO0OO(i, iArr, this.f23379OooO00o.OooO00o(i, iArr));
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r1) {
            return OooO0OO(r1.m21862OooO0O0());
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r5, AbstractC97441iIIL r6) {
            IiL1Li r0 = this.f23379OooO00o;
            IiL1Li r52 = ((OooO0OO) r5).f23379OooO00o;
            IiL1Li r62 = ((OooO0OO) r6).f23379OooO00o;
            IiL1Li OooO0Oo2 = r0.OooO0Oo(this.OooO0O0, this.f23380OooO00o);
            IiL1Li OooO0Oo3 = r52.OooO0Oo(r62, this.OooO0O0, this.f23380OooO00o);
            if (OooO0Oo2 == r0) {
                OooO0Oo2 = (IiL1Li) OooO0Oo2.clone();
            }
            OooO0Oo2.OooO00o(OooO0Oo3, 0);
            OooO0Oo2.m15589OooO00o(this.OooO0O0, this.f23380OooO00o);
            return new OooO0OO(this.OooO0O0, this.f23380OooO00o, OooO0Oo2);
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r5, AbstractC97441iIIL r6, AbstractC97441iIIL r7) {
            IiL1Li r0 = this.f23379OooO00o;
            IiL1Li r52 = ((OooO0OO) r5).f23379OooO00o;
            IiL1Li r62 = ((OooO0OO) r6).f23379OooO00o;
            IiL1Li r72 = ((OooO0OO) r7).f23379OooO00o;
            IiL1Li OooO0Oo2 = r0.OooO0Oo(r52, this.OooO0O0, this.f23380OooO00o);
            IiL1Li OooO0Oo3 = r62.OooO0Oo(r72, this.OooO0O0, this.f23380OooO00o);
            if (OooO0Oo2 == r0 || OooO0Oo2 == r52) {
                OooO0Oo2 = (IiL1Li) OooO0Oo2.clone();
            }
            OooO0Oo2.OooO00o(OooO0Oo3, 0);
            OooO0Oo2.m15589OooO00o(this.OooO0O0, this.f23380OooO00o);
            return new OooO0OO(this.OooO0O0, this.f23380OooO00o, OooO0Oo2);
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m21871OooO0O0() {
            return this.f23379OooO00o.m15591OooO0O0();
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL.OooO00o
        public AbstractC97441iIIL OooO0OO() {
            return this;
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r5) {
            int i = this.OooO0O0;
            int[] iArr = this.f23380OooO00o;
            return new OooO0OO(i, iArr, this.f23379OooO00o.OooO00o(((OooO0OO) r5).f23379OooO00o, i, iArr));
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL.OooO00o
        /* renamed from: OooO0OO  reason: collision with other method in class */
        public boolean m21872OooO0OO() {
            return this.f23379OooO00o.m15592OooO0OO();
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public int OooO0Oo() {
            return this.f23380OooO00o[0];
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        /* renamed from: OooO0Oo  reason: collision with other method in class */
        public AbstractC97441iIIL m21873OooO0Oo() {
            return (this.f23379OooO00o.m15591OooO0O0() || this.f23379OooO00o.m15590OooO00o()) ? this : OooO00o(this.OooO0O0 - 1);
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r1) {
            return OooO00o(r1);
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL.OooO00o
        public int OooO0o() {
            int[] iArr = this.f23380OooO00o;
            if (iArr.length >= 3) {
                return iArr[2];
            }
            return 0;
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public int OooO0o0() {
            int[] iArr = this.f23380OooO00o;
            if (iArr.length >= 2) {
                return iArr[1];
            }
            return 0;
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        /* renamed from: OooO0o0  reason: collision with other method in class */
        public AbstractC97441iIIL m21874OooO0o0() {
            int i = this.OooO0O0;
            int[] iArr = this.f23380OooO00o;
            return new OooO0OO(i, iArr, this.f23379OooO00o.OooO0OO(i, iArr));
        }

        public int OooO0oO() {
            return this.OooO0O0;
        }

        public int OooO0oo() {
            return this.OooO00o;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OooO0OO)) {
                return false;
            }
            OooO0OO oooO0OO = (OooO0OO) obj;
            return this.OooO0O0 == oooO0OO.OooO0O0 && this.OooO00o == oooO0OO.OooO00o && C9586iIILl.OooO00o(this.f23380OooO00o, oooO0OO.f23380OooO00o) && this.f23379OooO00o.equals(oooO0OO.f23379OooO00o);
        }

        public int hashCode() {
            return (this.f23379OooO00o.hashCode() ^ this.OooO0O0) ^ C9586iIILl.OooO00o(this.f23380OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.丨丨1iIIL丨$OooO0Oo  reason: case insensitive filesystem */
    public static class C9745OooO0Oo extends OooO0O0 {
        public BigInteger OooO;
        public BigInteger OooO0oO;
        public BigInteger OooO0oo;

        public C9745OooO0Oo(BigInteger bigInteger, BigInteger bigInteger2) {
            this(bigInteger, OooO0o(bigInteger), bigInteger2);
        }

        public C9745OooO0Oo(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.OooO0oO = bigInteger;
            this.OooO0oo = bigInteger2;
            this.OooO = bigInteger3;
        }

        private BigInteger[] OooO00o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int bitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigInteger4 = AbstractC5490IlLL.OooO0O0;
            BigInteger bigInteger5 = AbstractC5490IlLL.OooO0OO;
            BigInteger bigInteger6 = AbstractC5490IlLL.OooO0O0;
            BigInteger bigInteger7 = bigInteger;
            BigInteger bigInteger8 = bigInteger6;
            for (int i = bitLength - 1; i >= lowestSetBit + 1; i--) {
                bigInteger6 = OooO0O0(bigInteger6, bigInteger8);
                if (bigInteger3.testBit(i)) {
                    bigInteger8 = OooO0O0(bigInteger6, bigInteger2);
                    bigInteger4 = OooO0O0(bigInteger4, bigInteger7);
                    bigInteger5 = OooO0o0(bigInteger7.multiply(bigInteger5).subtract(bigInteger.multiply(bigInteger6)));
                    bigInteger7 = OooO0o0(bigInteger7.multiply(bigInteger7).subtract(bigInteger8.shiftLeft(1)));
                } else {
                    bigInteger4 = OooO0o0(bigInteger4.multiply(bigInteger5).subtract(bigInteger6));
                    BigInteger OooO0o0 = OooO0o0(bigInteger7.multiply(bigInteger5).subtract(bigInteger.multiply(bigInteger6)));
                    bigInteger5 = OooO0o0(bigInteger5.multiply(bigInteger5).subtract(bigInteger6.shiftLeft(1)));
                    bigInteger7 = OooO0o0;
                    bigInteger8 = bigInteger6;
                }
            }
            BigInteger OooO0O0 = OooO0O0(bigInteger6, bigInteger8);
            BigInteger OooO0O02 = OooO0O0(OooO0O0, bigInteger2);
            BigInteger OooO0o02 = OooO0o0(bigInteger4.multiply(bigInteger5).subtract(OooO0O0));
            BigInteger OooO0o03 = OooO0o0(bigInteger7.multiply(bigInteger5).subtract(bigInteger.multiply(OooO0O0)));
            BigInteger OooO0O03 = OooO0O0(OooO0O0, OooO0O02);
            for (int i2 = 1; i2 <= lowestSetBit; i2++) {
                OooO0o02 = OooO0O0(OooO0o02, OooO0o03);
                OooO0o03 = OooO0o0(OooO0o03.multiply(OooO0o03).subtract(OooO0O03.shiftLeft(1)));
                OooO0O03 = OooO0O0(OooO0O03, OooO0O03);
            }
            return new BigInteger[]{OooO0o02, OooO0o03};
        }

        public static BigInteger OooO0o(BigInteger bigInteger) {
            int bitLength = bigInteger.bitLength();
            if (bitLength < 96 || bigInteger.shiftRight(bitLength - 64).longValue() != -1) {
                return null;
            }
            return AbstractC5490IlLL.OooO0O0.shiftLeft(bitLength).subtract(bigInteger);
        }

        private AbstractC97441iIIL OooO0o0(AbstractC97441iIIL r2) {
            if (r2.OooO0o0().equals(this)) {
                return r2;
            }
            return null;
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO00o() {
            BigInteger add = this.OooO.add(AbstractC5490IlLL.OooO0O0);
            if (add.compareTo(this.OooO0oO) == 0) {
                add = AbstractC5490IlLL.OooO00o;
            }
            return new C9745OooO0Oo(this.OooO0oO, this.OooO0oo, add);
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r5) {
            return new C9745OooO0Oo(this.OooO0oO, this.OooO0oo, OooO00o(this.OooO, r5.m21859OooO00o()));
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r4, AbstractC97441iIIL r5) {
            BigInteger bigInteger = this.OooO;
            BigInteger OooO00o = r4.m21859OooO00o();
            BigInteger OooO00o2 = r5.m21859OooO00o();
            return new C9745OooO0Oo(this.OooO0oO, this.OooO0oo, OooO0o0(bigInteger.multiply(bigInteger).subtract(OooO00o.multiply(OooO00o2))));
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r3, AbstractC97441iIIL r4, AbstractC97441iIIL r5) {
            BigInteger bigInteger = this.OooO;
            BigInteger OooO00o = r3.m21859OooO00o();
            BigInteger OooO00o2 = r4.m21859OooO00o();
            BigInteger OooO00o3 = r5.m21859OooO00o();
            return new C9745OooO0Oo(this.OooO0oO, this.OooO0oo, OooO0o0(bigInteger.multiply(OooO00o).subtract(OooO00o2.multiply(OooO00o3))));
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m21875OooO00o() {
            return "Fp";
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
        /* renamed from: OooO00o  reason: collision with other method in class */
        public BigInteger m21876OooO00o() {
            return this.OooO;
        }

        public BigInteger OooO00o(BigInteger bigInteger) {
            BigInteger shiftLeft = bigInteger.shiftLeft(1);
            return shiftLeft.compareTo(this.OooO0oO) >= 0 ? shiftLeft.subtract(this.OooO0oO) : shiftLeft;
        }

        public BigInteger OooO00o(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger add = bigInteger.add(bigInteger2);
            return add.compareTo(this.OooO0oO) >= 0 ? add.subtract(this.OooO0oO) : add;
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
        public int OooO0O0() {
            return this.OooO0oO.bitLength();
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public AbstractC97441iIIL m21877OooO0O0() {
            return new C9745OooO0Oo(this.OooO0oO, this.OooO0oo, OooO0Oo(this.OooO));
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r5) {
            return new C9745OooO0Oo(this.OooO0oO, this.OooO0oo, OooO0O0(this.OooO, OooO0Oo(r5.m21859OooO00o())));
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r4, AbstractC97441iIIL r5) {
            BigInteger bigInteger = this.OooO;
            BigInteger OooO00o = r4.m21859OooO00o();
            BigInteger OooO00o2 = r5.m21859OooO00o();
            return new C9745OooO0Oo(this.OooO0oO, this.OooO0oo, OooO0o0(bigInteger.multiply(bigInteger).add(OooO00o.multiply(OooO00o2))));
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r3, AbstractC97441iIIL r4, AbstractC97441iIIL r5) {
            BigInteger bigInteger = this.OooO;
            BigInteger OooO00o = r3.m21859OooO00o();
            BigInteger OooO00o2 = r4.m21859OooO00o();
            BigInteger OooO00o3 = r5.m21859OooO00o();
            return new C9745OooO0Oo(this.OooO0oO, this.OooO0oo, OooO0o0(bigInteger.multiply(OooO00o).add(OooO00o2.multiply(OooO00o3))));
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public BigInteger m21878OooO0O0() {
            return this.OooO0oO;
        }

        public BigInteger OooO0O0(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.OooO0oO.add(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger OooO0O0(BigInteger bigInteger, BigInteger bigInteger2) {
            return OooO0o0(bigInteger.multiply(bigInteger2));
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL, com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO0OO() {
            if (this.OooO.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.OooO0oO;
            return new C9745OooO0Oo(bigInteger, this.OooO0oo, bigInteger.subtract(this.OooO));
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r5) {
            return new C9745OooO0Oo(this.OooO0oO, this.OooO0oo, OooO0O0(this.OooO, r5.m21859OooO00o()));
        }

        public BigInteger OooO0OO(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.OooO0oO.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }

        public BigInteger OooO0OO(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger subtract = bigInteger.subtract(bigInteger2);
            return subtract.signum() < 0 ? subtract.add(this.OooO0oO) : subtract;
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO0Oo() {
            if (m21863OooO0O0() || m21860OooO00o()) {
                return this;
            }
            if (!this.OooO0oO.testBit(0)) {
                throw new RuntimeException("not done yet");
            } else if (this.OooO0oO.testBit(1)) {
                BigInteger add = this.OooO0oO.shiftRight(2).add(AbstractC5490IlLL.OooO0O0);
                BigInteger bigInteger = this.OooO0oO;
                return OooO0o0(new C9745OooO0Oo(bigInteger, this.OooO0oo, this.OooO.modPow(add, bigInteger)));
            } else if (this.OooO0oO.testBit(2)) {
                BigInteger modPow = this.OooO.modPow(this.OooO0oO.shiftRight(3), this.OooO0oO);
                BigInteger OooO0O0 = OooO0O0(modPow, this.OooO);
                if (OooO0O0(OooO0O0, modPow).equals(AbstractC5490IlLL.OooO0O0)) {
                    return OooO0o0(new C9745OooO0Oo(this.OooO0oO, this.OooO0oo, OooO0O0));
                }
                return OooO0o0(new C9745OooO0Oo(this.OooO0oO, this.OooO0oo, OooO0O0(OooO0O0, AbstractC5490IlLL.OooO0OO.modPow(this.OooO0oO.shiftRight(2), this.OooO0oO))));
            } else {
                BigInteger shiftRight = this.OooO0oO.shiftRight(1);
                if (!this.OooO.modPow(shiftRight, this.OooO0oO).equals(AbstractC5490IlLL.OooO0O0)) {
                    return null;
                }
                BigInteger bigInteger2 = this.OooO;
                BigInteger OooO00o = OooO00o(OooO00o(bigInteger2));
                BigInteger add2 = shiftRight.add(AbstractC5490IlLL.OooO0O0);
                BigInteger subtract = this.OooO0oO.subtract(AbstractC5490IlLL.OooO0O0);
                Random random = new Random();
                while (true) {
                    BigInteger bigInteger3 = new BigInteger(this.OooO0oO.bitLength(), random);
                    if (bigInteger3.compareTo(this.OooO0oO) < 0 && OooO0o0(bigInteger3.multiply(bigInteger3).subtract(OooO00o)).modPow(shiftRight, this.OooO0oO).equals(subtract)) {
                        BigInteger[] OooO00o2 = OooO00o(bigInteger3, bigInteger2, add2);
                        BigInteger bigInteger4 = OooO00o2[0];
                        BigInteger bigInteger5 = OooO00o2[1];
                        if (OooO0O0(bigInteger5, bigInteger5).equals(OooO00o)) {
                            return new C9745OooO0Oo(this.OooO0oO, this.OooO0oo, OooO0OO(bigInteger5));
                        }
                        if (!bigInteger4.equals(AbstractC5490IlLL.OooO0O0) && !bigInteger4.equals(subtract)) {
                            return null;
                        }
                    }
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r5) {
            return new C9745OooO0Oo(this.OooO0oO, this.OooO0oo, OooO0OO(this.OooO, r5.m21859OooO00o()));
        }

        public BigInteger OooO0Oo(BigInteger bigInteger) {
            int OooO0O0 = OooO0O0();
            int i = (OooO0O0 + 31) >> 5;
            int[] OooO00o = C1iiIiI.OooO00o(OooO0O0, this.OooO0oO);
            int[] OooO00o2 = C1iiIiI.OooO00o(OooO0O0, bigInteger);
            int[] OooO00o3 = C1iiIiI.OooO00o(i);
            AbstractC9859lil.OooO00o(OooO00o, OooO00o2, OooO00o3);
            return C1iiIiI.m21315OooO00o(i, OooO00o3);
        }

        @Override // com.p118pd.sdk.AbstractC97441iIIL
        public AbstractC97441iIIL OooO0o0() {
            BigInteger bigInteger = this.OooO0oO;
            BigInteger bigInteger2 = this.OooO0oo;
            BigInteger bigInteger3 = this.OooO;
            return new C9745OooO0Oo(bigInteger, bigInteger2, OooO0O0(bigInteger3, bigInteger3));
        }

        public BigInteger OooO0o0(BigInteger bigInteger) {
            if (this.OooO0oo == null) {
                return bigInteger.mod(this.OooO0oO);
            }
            boolean z = bigInteger.signum() < 0;
            if (z) {
                bigInteger = bigInteger.abs();
            }
            int bitLength = this.OooO0oO.bitLength();
            boolean equals = this.OooO0oo.equals(AbstractC5490IlLL.OooO0O0);
            while (bigInteger.bitLength() > bitLength + 1) {
                BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                if (!equals) {
                    shiftRight = shiftRight.multiply(this.OooO0oo);
                }
                bigInteger = shiftRight.add(subtract);
            }
            while (bigInteger.compareTo(this.OooO0oO) >= 0) {
                bigInteger = bigInteger.subtract(this.OooO0oO);
            }
            return (!z || bigInteger.signum() == 0) ? bigInteger : this.OooO0oO.subtract(bigInteger);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C9745OooO0Oo)) {
                return false;
            }
            C9745OooO0Oo oooO0Oo = (C9745OooO0Oo) obj;
            return this.OooO0oO.equals(oooO0Oo.OooO0oO) && this.OooO.equals(oooO0Oo.OooO);
        }

        public int hashCode() {
            return this.OooO0oO.hashCode() ^ this.OooO.hashCode();
        }
    }

    public int OooO00o() {
        return m21859OooO00o().bitLength();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract AbstractC97441iIIL m21857OooO00o();

    public AbstractC97441iIIL OooO00o(int i) {
        AbstractC97441iIIL r1 = this;
        for (int i2 = 0; i2 < i; i2++) {
            r1 = r1.OooO0o0();
        }
        return r1;
    }

    public abstract AbstractC97441iIIL OooO00o(AbstractC97441iIIL v);

    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r2, AbstractC97441iIIL r3) {
        return OooO0o0().OooO0Oo(r2.OooO0OO(r3));
    }

    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3) {
        return OooO0OO(r1).OooO0Oo(r2.OooO0OO(r3));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract String m21858OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract BigInteger m21859OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21860OooO00o() {
        return OooO00o() == 1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21861OooO00o() {
        return IIiL.OooO00o((OooO0O0() + 7) / 8, m21859OooO00o());
    }

    public abstract int OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public abstract AbstractC97441iIIL m21862OooO0O0();

    public abstract AbstractC97441iIIL OooO0O0(AbstractC97441iIIL v);

    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r2, AbstractC97441iIIL r3) {
        return OooO0o0().OooO00o(r2.OooO0OO(r3));
    }

    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3) {
        return OooO0OO(r1).OooO00o(r2.OooO0OO(r3));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m21863OooO0O0() {
        return m21859OooO00o().signum() == 0;
    }

    public abstract AbstractC97441iIIL OooO0OO();

    public abstract AbstractC97441iIIL OooO0OO(AbstractC97441iIIL v);

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m21864OooO0OO() {
        return m21859OooO00o().testBit(0);
    }

    public abstract AbstractC97441iIIL OooO0Oo();

    public abstract AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL v);

    public abstract AbstractC97441iIIL OooO0o0();

    public String toString() {
        return m21859OooO00o().toString(16);
    }
}
