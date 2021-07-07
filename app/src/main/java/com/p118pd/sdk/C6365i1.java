package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.i丨1丨丨  reason: invalid class name and case insensitive filesystem */
public class C6365i1 {
    public static final long OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final int f18141OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BigInteger f18142OooO00o;

    public C6365i1(BigInteger bigInteger, int i) {
        if (i >= 0) {
            this.f18142OooO00o = bigInteger;
            this.f18141OooO00o = i;
            return;
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    public static C6365i1 OooO00o(BigInteger bigInteger, int i) {
        return new C6365i1(bigInteger.shiftLeft(i), i);
    }

    private void OooO00o(C6365i1 r2) {
        if (this.f18141OooO00o != r2.f18141OooO00o) {
            throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
        }
    }

    public int OooO00o() {
        return this.f18141OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m17465OooO00o(C6365i1 r2) {
        OooO00o(r2);
        return this.f18142OooO00o.compareTo(r2.f18142OooO00o);
    }

    public int OooO00o(BigInteger bigInteger) {
        return this.f18142OooO00o.compareTo(bigInteger.shiftLeft(this.f18141OooO00o));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m17466OooO00o() {
        return m17470OooO00o().longValue();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6365i1 m17467OooO00o() {
        return new C6365i1(this.f18142OooO00o.negate(), this.f18141OooO00o);
    }

    public C6365i1 OooO00o(int i) {
        if (i >= 0) {
            int i2 = this.f18141OooO00o;
            return i == i2 ? this : new C6365i1(this.f18142OooO00o.shiftLeft(i - i2), i);
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6365i1 m17468OooO00o(C6365i1 r3) {
        OooO00o(r3);
        return new C6365i1(this.f18142OooO00o.add(r3.f18142OooO00o), this.f18141OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6365i1 m17469OooO00o(BigInteger bigInteger) {
        return new C6365i1(this.f18142OooO00o.add(bigInteger.shiftLeft(this.f18141OooO00o)), this.f18141OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17470OooO00o() {
        return this.f18142OooO00o.shiftRight(this.f18141OooO00o);
    }

    public int OooO0O0() {
        return m17470OooO00o().intValue();
    }

    public C6365i1 OooO0O0(int i) {
        return new C6365i1(this.f18142OooO00o.shiftLeft(i), this.f18141OooO00o);
    }

    public C6365i1 OooO0O0(C6365i1 r3) {
        OooO00o(r3);
        return new C6365i1(this.f18142OooO00o.shiftLeft(this.f18141OooO00o).divide(r3.f18142OooO00o), this.f18141OooO00o);
    }

    public C6365i1 OooO0O0(BigInteger bigInteger) {
        return new C6365i1(this.f18142OooO00o.divide(bigInteger), this.f18141OooO00o);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m17471OooO0O0() {
        return m17468OooO00o(new C6365i1(AbstractC5490IlLL.OooO0O0, 1).OooO00o(this.f18141OooO00o)).m17470OooO00o();
    }

    public C6365i1 OooO0OO(C6365i1 r3) {
        OooO00o(r3);
        BigInteger multiply = this.f18142OooO00o.multiply(r3.f18142OooO00o);
        int i = this.f18141OooO00o;
        return new C6365i1(multiply, i + i);
    }

    public C6365i1 OooO0OO(BigInteger bigInteger) {
        return new C6365i1(this.f18142OooO00o.multiply(bigInteger), this.f18141OooO00o);
    }

    public C6365i1 OooO0Oo(C6365i1 r1) {
        return m17468OooO00o(r1.m17467OooO00o());
    }

    public C6365i1 OooO0Oo(BigInteger bigInteger) {
        return new C6365i1(this.f18142OooO00o.subtract(bigInteger.shiftLeft(this.f18141OooO00o)), this.f18141OooO00o);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6365i1)) {
            return false;
        }
        C6365i1 r5 = (C6365i1) obj;
        return this.f18142OooO00o.equals(r5.f18142OooO00o) && this.f18141OooO00o == r5.f18141OooO00o;
    }

    public int hashCode() {
        return this.f18142OooO00o.hashCode() ^ this.f18141OooO00o;
    }

    public String toString() {
        if (this.f18141OooO00o == 0) {
            return this.f18142OooO00o.toString();
        }
        BigInteger OooO00o2 = m17470OooO00o();
        BigInteger subtract = this.f18142OooO00o.subtract(OooO00o2.shiftLeft(this.f18141OooO00o));
        if (this.f18142OooO00o.signum() == -1) {
            subtract = AbstractC5490IlLL.OooO0O0.shiftLeft(this.f18141OooO00o).subtract(subtract);
        }
        if (OooO00o2.signum() == -1 && !subtract.equals(AbstractC5490IlLL.OooO00o)) {
            OooO00o2 = OooO00o2.add(AbstractC5490IlLL.OooO0O0);
        }
        String bigInteger = OooO00o2.toString();
        char[] cArr = new char[this.f18141OooO00o];
        String bigInteger2 = subtract.toString(2);
        int length = bigInteger2.length();
        int i = this.f18141OooO00o - length;
        for (int i2 = 0; i2 < i; i2++) {
            cArr[i2] = '0';
        }
        for (int i3 = 0; i3 < length; i3++) {
            cArr[i + i3] = bigInteger2.charAt(i3);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(bigInteger);
        stringBuffer.append(C9058ooOoOoOO.OooOO0);
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
