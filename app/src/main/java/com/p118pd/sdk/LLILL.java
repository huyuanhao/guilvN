package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LLILL丨  reason: invalid class name */
public abstract class LLILL implements lIL1i11, AbstractC6186iLi1, C1l11i {
    public static final long[] OooO0O0 = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    public static final int OooO0OO = 128;
    public long OooO;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f16422OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16423OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long[] f16424OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f16425OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f16426OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public long f16427OooO0OO;
    public long OooO0Oo;
    public long OooO0o;
    public long OooO0o0;
    public long OooO0oO;
    public long OooO0oo;
    public long OooOO0;

    public LLILL() {
        this.f16423OooO00o = new byte[8];
        this.f16424OooO00o = new long[80];
        this.OooO00o = 0;
        reset();
    }

    public LLILL(LLILL r2) {
        this.f16423OooO00o = new byte[8];
        this.f16424OooO00o = new long[80];
        OooO00o(r2);
    }

    private long OooO00o(long j) {
        return (j >>> 7) ^ (((j << 63) | (j >>> 1)) ^ ((j << 56) | (j >>> 8)));
    }

    private long OooO00o(long j, long j2, long j3) {
        return ((j ^ -1) & j3) ^ (j2 & j);
    }

    private long OooO0O0(long j) {
        return (j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)));
    }

    private long OooO0O0(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    private long OooO0OO(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    private long OooO0Oo(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    private void OooO0Oo() {
        long j = this.f16422OooO00o;
        if (j > 2305843009213693951L) {
            this.f16426OooO0O0 += j >>> 61;
            this.f16422OooO00o = j & 2305843009213693951L;
        }
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    public int OooO00o() {
        return 128;
    }

    public void OooO00o(long j, long j2) {
        if (this.f16425OooO0O0 > 14) {
            m16198OooO0OO();
        }
        long[] jArr = this.f16424OooO00o;
        jArr[14] = j2;
        jArr[15] = j;
    }

    public void OooO00o(LLILL r5) {
        byte[] bArr = r5.f16423OooO00o;
        System.arraycopy(bArr, 0, this.f16423OooO00o, 0, bArr.length);
        this.OooO00o = r5.OooO00o;
        this.f16422OooO00o = r5.f16422OooO00o;
        this.f16426OooO0O0 = r5.f16426OooO0O0;
        this.f16427OooO0OO = r5.f16427OooO0OO;
        this.OooO0Oo = r5.OooO0Oo;
        this.OooO0o0 = r5.OooO0o0;
        this.OooO0o = r5.OooO0o;
        this.OooO0oO = r5.OooO0oO;
        this.OooO0oo = r5.OooO0oo;
        this.OooO = r5.OooO;
        this.OooOO0 = r5.OooOO0;
        long[] jArr = r5.f16424OooO00o;
        System.arraycopy(jArr, 0, this.f16424OooO00o, 0, jArr.length);
        this.f16425OooO0O0 = r5.f16425OooO0O0;
    }

    public void OooO00o(byte[] bArr) {
        System.arraycopy(this.f16423OooO00o, 0, bArr, 0, this.OooO00o);
        AbstractC6464l1l.OooO00o(this.OooO00o, bArr, 8);
        AbstractC6464l1l.OooO00o(this.f16422OooO00o, bArr, 12);
        AbstractC6464l1l.OooO00o(this.f16426OooO0O0, bArr, 20);
        AbstractC6464l1l.OooO00o(this.f16427OooO0OO, bArr, 28);
        AbstractC6464l1l.OooO00o(this.OooO0Oo, bArr, 36);
        AbstractC6464l1l.OooO00o(this.OooO0o0, bArr, 44);
        AbstractC6464l1l.OooO00o(this.OooO0o, bArr, 52);
        AbstractC6464l1l.OooO00o(this.OooO0oO, bArr, 60);
        AbstractC6464l1l.OooO00o(this.OooO0oo, bArr, 68);
        AbstractC6464l1l.OooO00o(this.OooO, bArr, 76);
        AbstractC6464l1l.OooO00o(this.OooOO0, bArr, 84);
        AbstractC6464l1l.OooO00o(this.f16425OooO0O0, bArr, 92);
        for (int i = 0; i < this.f16425OooO0O0; i++) {
            AbstractC6464l1l.OooO00o(this.f16424OooO00o[i], bArr, (i * 8) + 96);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void OooO00o(byte[] bArr, int i) {
        this.f16424OooO00o[this.f16425OooO0O0] = AbstractC6464l1l.m17599OooO00o(bArr, i);
        int i2 = this.f16425OooO0O0 + 1;
        this.f16425OooO0O0 = i2;
        if (i2 == 16) {
            m16198OooO0OO();
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void OooO0O0() {
        OooO0Oo();
        long j = this.f16422OooO00o << 3;
        long j2 = this.f16426OooO0O0;
        byte b = O0O00O.OooO00o;
        while (true) {
            update(b);
            if (this.OooO00o != 0) {
                b = 0;
            } else {
                OooO00o(j, j2);
                m16198OooO0OO();
                return;
            }
        }
    }

    public void OooO0O0(byte[] bArr) {
        int OooO00o2 = AbstractC6464l1l.OooO00o(bArr, 8);
        this.OooO00o = OooO00o2;
        System.arraycopy(bArr, 0, this.f16423OooO00o, 0, OooO00o2);
        this.f16422OooO00o = AbstractC6464l1l.m17599OooO00o(bArr, 12);
        this.f16426OooO0O0 = AbstractC6464l1l.m17599OooO00o(bArr, 20);
        this.f16427OooO0OO = AbstractC6464l1l.m17599OooO00o(bArr, 28);
        this.OooO0Oo = AbstractC6464l1l.m17599OooO00o(bArr, 36);
        this.OooO0o0 = AbstractC6464l1l.m17599OooO00o(bArr, 44);
        this.OooO0o = AbstractC6464l1l.m17599OooO00o(bArr, 52);
        this.OooO0oO = AbstractC6464l1l.m17599OooO00o(bArr, 60);
        this.OooO0oo = AbstractC6464l1l.m17599OooO00o(bArr, 68);
        this.OooO = AbstractC6464l1l.m17599OooO00o(bArr, 76);
        this.OooOO0 = AbstractC6464l1l.m17599OooO00o(bArr, 84);
        this.f16425OooO0O0 = AbstractC6464l1l.OooO00o(bArr, 92);
        for (int i = 0; i < this.f16425OooO0O0; i++) {
            this.f16424OooO00o[i] = AbstractC6464l1l.m17599OooO00o(bArr, (i * 8) + 96);
        }
    }

    public int OooO0OO() {
        return (this.f16425OooO0O0 * 8) + 96;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m16198OooO0OO() {
        OooO0Oo();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.f16424OooO00o;
            long OooO0O02 = OooO0O0(jArr[i - 2]);
            long[] jArr2 = this.f16424OooO00o;
            jArr[i] = OooO0O02 + jArr2[i - 7] + OooO00o(jArr2[i - 15]) + this.f16424OooO00o[i - 16];
        }
        long j = this.f16427OooO0OO;
        long j2 = this.OooO0Oo;
        long j3 = this.OooO0o0;
        long j4 = this.OooO0o;
        long j5 = this.OooO0oO;
        long j6 = this.OooO0oo;
        long j7 = this.OooO;
        long j8 = j6;
        long j9 = j4;
        int i2 = 0;
        long j10 = j2;
        long j11 = j3;
        long j12 = j5;
        int i3 = 0;
        long j13 = this.OooOO0;
        long j14 = j;
        long j15 = j7;
        while (i3 < 10) {
            int i4 = i2 + 1;
            long OooO0Oo2 = j13 + OooO0Oo(j12) + OooO00o(j12, j8, j15) + OooO0O0[i2] + this.f16424OooO00o[i2];
            long j16 = j9 + OooO0Oo2;
            long OooO0OO2 = OooO0Oo2 + OooO0OO(j14) + OooO0O0(j14, j10, j11);
            int i5 = i4 + 1;
            long OooO0Oo3 = j15 + OooO0Oo(j16) + OooO00o(j16, j12, j8) + OooO0O0[i4] + this.f16424OooO00o[i4];
            long j17 = j11 + OooO0Oo3;
            long OooO0OO3 = OooO0Oo3 + OooO0OO(OooO0OO2) + OooO0O0(OooO0OO2, j14, j10);
            int i6 = i5 + 1;
            long OooO0Oo4 = j8 + OooO0Oo(j17) + OooO00o(j17, j16, j12) + OooO0O0[i5] + this.f16424OooO00o[i5];
            long j18 = j10 + OooO0Oo4;
            long OooO0OO4 = OooO0Oo4 + OooO0OO(OooO0OO3) + OooO0O0(OooO0OO3, OooO0OO2, j14);
            int i7 = i6 + 1;
            long OooO0Oo5 = j12 + OooO0Oo(j18) + OooO00o(j18, j17, j16) + OooO0O0[i6] + this.f16424OooO00o[i6];
            long j19 = j14 + OooO0Oo5;
            long OooO0OO5 = OooO0Oo5 + OooO0OO(OooO0OO4) + OooO0O0(OooO0OO4, OooO0OO3, OooO0OO2);
            int i8 = i7 + 1;
            long OooO0Oo6 = j16 + OooO0Oo(j19) + OooO00o(j19, j18, j17) + OooO0O0[i7] + this.f16424OooO00o[i7];
            long j20 = OooO0OO2 + OooO0Oo6;
            long OooO0OO6 = OooO0Oo6 + OooO0OO(OooO0OO5) + OooO0O0(OooO0OO5, OooO0OO4, OooO0OO3);
            int i9 = i8 + 1;
            long OooO0Oo7 = j17 + OooO0Oo(j20) + OooO00o(j20, j19, j18) + OooO0O0[i8] + this.f16424OooO00o[i8];
            long j21 = OooO0OO3 + OooO0Oo7;
            long OooO0OO7 = OooO0Oo7 + OooO0OO(OooO0OO6) + OooO0O0(OooO0OO6, OooO0OO5, OooO0OO4);
            j15 = j21;
            int i10 = i9 + 1;
            long OooO0Oo8 = j18 + OooO0Oo(j21) + OooO00o(j21, j20, j19) + OooO0O0[i9] + this.f16424OooO00o[i9];
            long j22 = OooO0OO4 + OooO0Oo8;
            j8 = j22;
            j10 = OooO0Oo8 + OooO0OO(OooO0OO7) + OooO0O0(OooO0OO7, OooO0OO6, OooO0OO5);
            long OooO0Oo9 = j19 + OooO0Oo(j22) + OooO00o(j22, j15, j20) + OooO0O0[i10] + this.f16424OooO00o[i10];
            long OooO0OO8 = OooO0Oo9 + OooO0OO(j10) + OooO0O0(j10, OooO0OO7, OooO0OO6);
            i3++;
            j12 = OooO0OO5 + OooO0Oo9;
            j11 = OooO0OO7;
            j13 = j20;
            j9 = OooO0OO6;
            i2 = i10 + 1;
            j14 = OooO0OO8;
        }
        this.f16427OooO0OO += j14;
        this.OooO0Oo += j10;
        this.OooO0o0 += j11;
        this.OooO0o += j9;
        this.OooO0oO += j12;
        this.OooO0oo += j8;
        this.OooO += j15;
        this.OooOO0 += j13;
        this.f16425OooO0O0 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            this.f16424OooO00o[i11] = 0;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void reset() {
        this.f16422OooO00o = 0;
        this.f16426OooO0O0 = 0;
        int i = 0;
        this.OooO00o = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f16423OooO00o;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.f16425OooO0O0 = 0;
        while (true) {
            long[] jArr = this.f16424OooO00o;
            if (i != jArr.length) {
                jArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte b) {
        byte[] bArr = this.f16423OooO00o;
        int i = this.OooO00o;
        int i2 = i + 1;
        this.OooO00o = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            OooO00o(bArr, 0);
            this.OooO00o = 0;
        }
        this.f16422OooO00o++;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte[] bArr, int i, int i2) {
        while (this.OooO00o != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.f16423OooO00o.length) {
            OooO00o(bArr, i);
            byte[] bArr2 = this.f16423OooO00o;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.f16422OooO00o += (long) bArr2.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }
}
