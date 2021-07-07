package com.p118pd.sdk;

import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.math.BigInteger;
import java.util.Random;

/* renamed from: com.pd.sdk.i丨1IIiLL  reason: invalid class name */
public class i1IIiLL extends AbstractC9726llL {
    public static final int[] OooO00o = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, CommonNetImpl.FLAG_SHARE_JUMP, 67108864, 134217728, CommonNetImpl.FLAG_AUTH, 536870912, 1073741824, Integer.MIN_VALUE, 0};

    /* renamed from: OooO00o  reason: collision with other field name */
    public C1IilLL f18126OooO00o;

    public i1IIiLL(i1IIiLL r2) {
        ((AbstractC9726llL) this).f23358OooO00o = ((AbstractC9726llL) r2).f23358OooO00o;
        ((AbstractC9726llL) this).OooO00o = ((AbstractC9726llL) r2).OooO00o;
        this.f18126OooO00o = new C1IilLL(r2.f18126OooO00o);
    }

    public i1IIiLL(C6865lil11 r1, C1IilLL r2) {
        ((AbstractC9726llL) this).f23358OooO00o = r1;
        ((AbstractC9726llL) this).OooO00o = r1.OooO00o();
        C1IilLL r12 = new C1IilLL(r2);
        this.f18126OooO00o = r12;
        r12.m21277OooO00o(((AbstractC9726llL) this).OooO00o);
    }

    public i1IIiLL(C6865lil11 r2, Random random) {
        ((AbstractC9726llL) this).f23358OooO00o = r2;
        ((AbstractC9726llL) this).OooO00o = r2.OooO00o();
        this.f18126OooO00o = new C1IilLL(((AbstractC9726llL) this).OooO00o);
        OooO00o(random);
    }

    public i1IIiLL(C6865lil11 r2, byte[] bArr) {
        ((AbstractC9726llL) this).f23358OooO00o = r2;
        ((AbstractC9726llL) this).OooO00o = r2.OooO00o();
        C1IilLL r22 = new C1IilLL(((AbstractC9726llL) this).OooO00o, bArr);
        this.f18126OooO00o = r22;
        r22.m21277OooO00o(((AbstractC9726llL) this).OooO00o);
    }

    public i1IIiLL(C6865lil11 r3, int[] iArr) {
        ((AbstractC9726llL) this).f23358OooO00o = r3;
        ((AbstractC9726llL) this).OooO00o = r3.OooO00o();
        C1IilLL r0 = new C1IilLL(((AbstractC9726llL) this).OooO00o, iArr);
        this.f18126OooO00o = r0;
        r0.m21277OooO00o(((lLiLLl1) r3).OooO00o);
    }

    private void OooO() {
        if (this.f18126OooO00o.OooO00o() <= ((AbstractC9726llL) this).OooO00o) {
            int OooO00o2 = this.f18126OooO00o.OooO00o();
            int i = ((AbstractC9726llL) this).OooO00o;
            if (OooO00o2 < i) {
                this.f18126OooO00o.m21277OooO00o(i);
            }
        } else if (((C6865lil11) ((AbstractC9726llL) this).f23358OooO00o).m18024OooO0O0()) {
            try {
                int OooO0O0 = ((C6865lil11) ((AbstractC9726llL) this).f23358OooO00o).OooO0O0();
                if (((AbstractC9726llL) this).OooO00o - OooO0O0 > 32) {
                    int OooO00o3 = this.f18126OooO00o.OooO00o();
                    int i2 = ((AbstractC9726llL) this).OooO00o;
                    if (OooO00o3 <= (i2 << 1)) {
                        this.f18126OooO00o.m21278OooO00o(i2, OooO0O0);
                        return;
                    }
                }
                OooO00o(OooO0O0);
            } catch (RuntimeException unused) {
                throw new RuntimeException("GF2nPolynomialElement.reduce: the field polynomial is not a trinomial");
            }
        } else if (((C6865lil11) ((AbstractC9726llL) this).f23358OooO00o).m18021OooO00o()) {
            try {
                int[] OooO00o4 = ((C6865lil11) ((AbstractC9726llL) this).f23358OooO00o).m18022OooO00o();
                if (((AbstractC9726llL) this).OooO00o - OooO00o4[2] > 32) {
                    int OooO00o5 = this.f18126OooO00o.OooO00o();
                    int i3 = ((AbstractC9726llL) this).OooO00o;
                    if (OooO00o5 <= (i3 << 1)) {
                        this.f18126OooO00o.OooO00o(i3, OooO00o4);
                        return;
                    }
                }
                OooO00o(OooO00o4);
            } catch (RuntimeException unused2) {
                throw new RuntimeException("GF2nPolynomialElement.reduce: the field polynomial is not a pentanomial");
            }
        } else {
            C1IilLL OooO0o = this.f18126OooO00o.OooO0o(((AbstractC9726llL) this).f23358OooO00o.m17716OooO00o());
            this.f18126OooO00o = OooO0o;
            OooO0o.m21277OooO00o(((AbstractC9726llL) this).OooO00o);
        }
    }

    public static i1IIiLL OooO00o(C6865lil11 r5) {
        return new i1IIiLL(r5, new C1IilLL(r5.OooO00o(), new int[]{1}));
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    private C1IilLL OooO00o() {
        return new C1IilLL(this.f18126OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL
    private void OooO00o(int i) {
        int i2 = ((AbstractC9726llL) this).OooO00o - i;
        int OooO00o2 = this.f18126OooO00o.OooO00o();
        while (true) {
            OooO00o2--;
            if (OooO00o2 < ((AbstractC9726llL) this).OooO00o) {
                this.f18126OooO00o.OooO0oO();
                this.f18126OooO00o.m21277OooO00o(((AbstractC9726llL) this).OooO00o);
                return;
            } else if (this.f18126OooO00o.m21281OooO00o(OooO00o2)) {
                this.f18126OooO00o.OooO0Oo(OooO00o2);
                this.f18126OooO00o.OooO0Oo(OooO00o2 - i2);
                this.f18126OooO00o.OooO0Oo(OooO00o2 - ((AbstractC9726llL) this).OooO00o);
            }
        }
    }

    private void OooO00o(Random random) {
        this.f18126OooO00o.m21277OooO00o(((AbstractC9726llL) this).OooO00o);
        this.f18126OooO00o.OooO00o(random);
    }

    private void OooO00o(int[] iArr) {
        int i = ((AbstractC9726llL) this).OooO00o;
        int i2 = i - iArr[2];
        int i3 = i - iArr[1];
        int i4 = i - iArr[0];
        for (int OooO00o2 = this.f18126OooO00o.OooO00o() - 1; OooO00o2 >= ((AbstractC9726llL) this).OooO00o; OooO00o2--) {
            if (this.f18126OooO00o.m21281OooO00o(OooO00o2)) {
                this.f18126OooO00o.OooO0Oo(OooO00o2);
                this.f18126OooO00o.OooO0Oo(OooO00o2 - i2);
                this.f18126OooO00o.OooO0Oo(OooO00o2 - i3);
                this.f18126OooO00o.OooO0Oo(OooO00o2 - i4);
                this.f18126OooO00o.OooO0Oo(OooO00o2 - ((AbstractC9726llL) this).OooO00o);
            }
        }
        this.f18126OooO00o.OooO0oO();
        this.f18126OooO00o.m21277OooO00o(((AbstractC9726llL) this).OooO00o);
    }

    public static i1IIiLL OooO0O0(C6865lil11 r2) {
        return new i1IIiLL(r2, new C1IilLL(r2.OooO00o()));
    }

    private i1IIiLL OooO0oO() throws RuntimeException {
        if ((((AbstractC9726llL) this).OooO00o & 1) != 0) {
            i1IIiLL r0 = new i1IIiLL(this);
            for (int i = 1; i <= ((((AbstractC9726llL) this).OooO00o - 1) >> 1); i++) {
                r0.m17445OooO0o0();
                r0.m17445OooO0o0();
                r0.OooO0O0((AbstractC9371Ii11) this);
            }
            return r0;
        }
        throw new RuntimeException();
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m17424OooO00o() {
        i1IIiLL r0 = new i1IIiLL(this);
        for (int i = 1; i < ((AbstractC9726llL) this).OooO00o; i++) {
            r0.m17445OooO0o0();
            r0.OooO0O0((AbstractC9371Ii11) this);
        }
        return r0.m17438OooO0O0() ? 1 : 0;
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public i1IIiLL m17425OooO00o() throws ArithmeticException {
        if (!m17433OooO00o()) {
            C1IilLL r0 = new C1IilLL(((AbstractC9726llL) this).OooO00o + 32, "ONE");
            r0.OooO0oO();
            C1IilLL r1 = new C1IilLL(((AbstractC9726llL) this).OooO00o + 32);
            r1.OooO0oO();
            C1IilLL OooO00o2 = OooO00o();
            C1IilLL OooO00o3 = ((AbstractC9726llL) this).f23358OooO00o.m17716OooO00o();
            OooO00o2.OooO0oO();
            while (!OooO00o2.m21289OooO0O0()) {
                OooO00o2.OooO0oO();
                OooO00o3.OooO0oO();
                int OooO00o4 = OooO00o2.OooO00o() - OooO00o3.OooO00o();
                if (OooO00o4 < 0) {
                    OooO00o4 = -OooO00o4;
                    r0.OooO0oO();
                    r1 = r0;
                    r0 = r1;
                    OooO00o3 = OooO00o2;
                    OooO00o2 = OooO00o3;
                }
                OooO00o2.OooO00o(OooO00o3, OooO00o4);
                r0.OooO00o(r1, OooO00o4);
            }
            r0.OooO0oO();
            return new i1IIiLL((C6865lil11) ((AbstractC9726llL) this).f23358OooO00o, r0);
        }
        throw new ArithmeticException();
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public i1IIiLL m17426OooO00o(int i) {
        if (i == 1) {
            return new i1IIiLL(this);
        }
        i1IIiLL OooO00o2 = OooO00o((C6865lil11) ((AbstractC9726llL) this).f23358OooO00o);
        if (i == 0) {
            return OooO00o2;
        }
        i1IIiLL r2 = new i1IIiLL(this);
        r2.f18126OooO00o.m21277OooO00o((((AbstractC9726llL) r2).OooO00o << 1) + 32);
        r2.f18126OooO00o.OooO0oO();
        for (int i2 = 0; i2 < ((AbstractC9726llL) this).OooO00o; i2++) {
            if (((1 << i2) & i) != 0) {
                OooO00o2.m17432OooO00o((AbstractC9371Ii11) r2);
            }
            r2.m17439OooO0OO();
        }
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9371Ii11 m17427OooO00o() throws ArithmeticException {
        return OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11
    public AbstractC9371Ii11 OooO00o(AbstractC9371Ii11 r2) throws RuntimeException {
        i1IIiLL r0 = new i1IIiLL(this);
        r0.OooO0O0(r2);
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9726llL m17428OooO00o() {
        i1IIiLL r0 = new i1IIiLL(this);
        r0.m17440OooO0OO();
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17429OooO00o(int i) {
        return this.f18126OooO00o.m21274OooO00o(i);
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17430OooO00o() {
        return this.f18126OooO00o.m21275OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17431OooO00o() {
        this.f18126OooO00o.m21286OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17432OooO00o(AbstractC9371Ii11 r4) throws RuntimeException {
        if (r4 instanceof i1IIiLL) {
            i1IIiLL r1 = (i1IIiLL) r4;
            if (!((AbstractC9726llL) this).f23358OooO00o.equals(((AbstractC9726llL) r1).f23358OooO00o)) {
                throw new RuntimeException();
            } else if (equals(r4)) {
                m17445OooO0o0();
            } else {
                this.f18126OooO00o = this.f18126OooO00o.OooO0OO(r1.f18126OooO00o);
                OooO();
            }
        } else {
            throw new RuntimeException();
        }
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17433OooO00o() {
        return this.f18126OooO00o.m21293OooO0OO();
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17434OooO00o(int i) {
        return this.f18126OooO00o.m21281OooO00o(i);
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17435OooO00o() {
        return this.f18126OooO00o.m21283OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    public i1IIiLL OooO0O0() throws ArithmeticException {
        if (!m17433OooO00o()) {
            C1IilLL r0 = new C1IilLL(((AbstractC9726llL) this).OooO00o, "ONE");
            C1IilLL r1 = new C1IilLL(((AbstractC9726llL) this).OooO00o);
            C1IilLL OooO00o2 = OooO00o();
            C1IilLL OooO00o3 = ((AbstractC9726llL) this).f23358OooO00o.m17716OooO00o();
            while (true) {
                if (!OooO00o2.m21281OooO00o(0)) {
                    OooO00o2.OooOO0();
                    if (r0.m21281OooO00o(0)) {
                        r0.m21279OooO00o(((AbstractC9726llL) this).f23358OooO00o.m17716OooO00o());
                    }
                    r0.OooOO0();
                } else if (OooO00o2.m21289OooO0O0()) {
                    return new i1IIiLL((C6865lil11) ((AbstractC9726llL) this).f23358OooO00o, r0);
                } else {
                    OooO00o2.OooO0oO();
                    OooO00o3.OooO0oO();
                    if (OooO00o2.OooO00o() < OooO00o3.OooO00o()) {
                        r1 = r0;
                        r0 = r1;
                        OooO00o3 = OooO00o2;
                        OooO00o2 = OooO00o3;
                    }
                    OooO00o2.m21279OooO00o(OooO00o3);
                    r0.m21279OooO00o(r1);
                }
            }
        } else {
            throw new ArithmeticException();
        }
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC9726llL m17436OooO0O0() throws RuntimeException {
        i1IIiLL OooO0O0;
        i1IIiLL r3;
        if (m17433OooO00o()) {
            return OooO0O0((C6865lil11) ((AbstractC9726llL) this).f23358OooO00o);
        }
        if ((((AbstractC9726llL) this).OooO00o & 1) == 1) {
            return OooO0oO();
        }
        do {
            i1IIiLL r0 = new i1IIiLL((C6865lil11) ((AbstractC9726llL) this).f23358OooO00o, new Random());
            OooO0O0 = OooO0O0((C6865lil11) ((AbstractC9726llL) this).f23358OooO00o);
            r3 = (i1IIiLL) r0.clone();
            for (int i = 1; i < ((AbstractC9726llL) this).OooO00o; i++) {
                OooO0O0.m17445OooO0o0();
                r3.m17445OooO0o0();
                OooO0O0.OooO0O0(r3.OooO0OO((AbstractC9371Ii11) this));
                r3.OooO0O0((AbstractC9371Ii11) r0);
            }
        } while (r3.m17433OooO00o());
        if (equals(OooO0O0.m17439OooO0OO().OooO00o((AbstractC9371Ii11) OooO0O0))) {
            return OooO0O0;
        }
        throw new RuntimeException();
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m17437OooO0O0() {
        this.f18126OooO00o.OooO0Oo();
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL
    public void OooO0O0(AbstractC9371Ii11 r3) throws RuntimeException {
        if (r3 instanceof i1IIiLL) {
            i1IIiLL r32 = (i1IIiLL) r3;
            if (((AbstractC9726llL) this).f23358OooO00o.equals(((AbstractC9726llL) r32).f23358OooO00o)) {
                this.f18126OooO00o.m21279OooO00o(r32.f18126OooO00o);
                return;
            }
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m17438OooO0O0() {
        return this.f18126OooO00o.m21289OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    public i1IIiLL OooO0OO() throws ArithmeticException {
        if (!m17433OooO00o()) {
            int OooO00o2 = ((AbstractC9726llL) this).f23358OooO00o.OooO00o() - 1;
            i1IIiLL r2 = new i1IIiLL(this);
            r2.f18126OooO00o.m21277OooO00o((((AbstractC9726llL) this).OooO00o << 1) + 32);
            r2.f18126OooO00o.OooO0oO();
            int i = 1;
            for (int OooO0Oo = C6356i1IiI1.OooO0Oo(OooO00o2) - 1; OooO0Oo >= 0; OooO0Oo--) {
                i1IIiLL r5 = new i1IIiLL(r2);
                for (int i2 = 1; i2 <= i; i2++) {
                    r5.OooO0oo();
                }
                r2.m17432OooO00o((AbstractC9371Ii11) r5);
                i <<= 1;
                if ((OooO00o[OooO0Oo] & OooO00o2) != 0) {
                    r2.OooO0oo();
                    r2.m17432OooO00o((AbstractC9371Ii11) this);
                    i++;
                }
            }
            r2.OooO0oo();
            return r2;
        }
        throw new ArithmeticException();
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL
    public AbstractC9371Ii11 OooO0OO(AbstractC9371Ii11 r2) throws RuntimeException {
        i1IIiLL r0 = new i1IIiLL(this);
        r0.m17432OooO00o(r2);
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public AbstractC9726llL m17439OooO0OO() {
        return OooO0o();
    }

    @Override // com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m17440OooO0OO() {
        this.f18126OooO00o.OooO0o0();
    }

    @Override // com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m17441OooO0OO() {
        return this.f18126OooO00o.m21281OooO00o(0);
    }

    @Override // com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    public i1IIiLL OooO0Oo() {
        i1IIiLL r0 = new i1IIiLL(this);
        r0.m17444OooO0o();
        r0.OooO();
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public AbstractC9726llL m17442OooO0Oo() {
        i1IIiLL r0 = new i1IIiLL(this);
        r0.m17443OooO0Oo();
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC9726llL, com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public void m17443OooO0Oo() {
        this.f18126OooO00o.m21277OooO00o((((AbstractC9726llL) this).OooO00o << 1) + 32);
        this.f18126OooO00o.OooO0oO();
        for (int i = 0; i < ((AbstractC9726llL) this).f23358OooO00o.OooO00o() - 1; i++) {
            m17445OooO0o0();
        }
    }

    public i1IIiLL OooO0o() {
        i1IIiLL r0 = new i1IIiLL(this);
        r0.OooO0oo();
        r0.OooO();
        return r0;
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public void m17444OooO0o() {
        this.f18126OooO00o.OooOO0O();
        OooO();
    }

    @Override // com.p118pd.sdk.AbstractC9726llL
    public i1IIiLL OooO0o0() {
        i1IIiLL r0 = new i1IIiLL(this);
        r0.m17446OooO0oO();
        r0.OooO();
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC9726llL
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public void m17445OooO0o0() {
        OooO0oo();
    }

    /* renamed from: OooO0oO  reason: collision with other method in class */
    public void m17446OooO0oO() {
        C1IilLL r0 = new C1IilLL(((AbstractC9726llL) this).OooO00o);
        int i = 0;
        while (true) {
            int i2 = ((AbstractC9726llL) this).OooO00o;
            if (i < i2) {
                if (this.f18126OooO00o.m21282OooO00o(((C6865lil11) ((AbstractC9726llL) this).f23358OooO00o).f18947OooO00o[(i2 - i) - 1])) {
                    r0.m21291OooO0OO(i);
                }
                i++;
            } else {
                this.f18126OooO00o = r0;
                return;
            }
        }
    }

    public void OooO0oo() {
        this.f18126OooO00o.OooOO0o();
        OooO();
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11, com.p118pd.sdk.AbstractC9726llL
    public Object clone() {
        return new i1IIiLL(this);
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof i1IIiLL)) {
            return false;
        }
        i1IIiLL r4 = (i1IIiLL) obj;
        lLiLLl1 r1 = ((AbstractC9726llL) this).f23358OooO00o;
        if (r1 == ((AbstractC9726llL) r4).f23358OooO00o || r1.m17716OooO00o().equals(((AbstractC9726llL) r4).f23358OooO00o.m17716OooO00o())) {
            return this.f18126OooO00o.equals(r4.f18126OooO00o);
        }
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11
    public int hashCode() {
        return ((AbstractC9726llL) this).f23358OooO00o.hashCode() + this.f18126OooO00o.hashCode();
    }

    @Override // com.p118pd.sdk.AbstractC9371Ii11
    public String toString() {
        return this.f18126OooO00o.m21274OooO00o(16);
    }
}
