package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.lL1  reason: case insensitive filesystem */
public class C6542lL1 extends AbstractC9563i1I {
    public static final byte[] OooO00o = {105, 0, 114, 34, 100, ExifInterface.OooOO0O, 4, 35, -115, 58, -37, -106, 70, -23, ExifInterface.OooO00o, -60, 24, -2, -84, -108, 0, -19, 7, 18, ExifInterface.OooO0Oo, -122, -36, ExifInterface.OooO0o, -17, 76, -87, 43};

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f18421OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6642li1LI f18422OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9750I f18423OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18424OooO00o;

    public C6542lL1(li1l11I1 li1l11i1) {
        super(li1l11i1);
        this.f18423OooO00o = new C9750I(li1l11i1, li1l11i1.OooO00o() * 8);
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return this.f18423OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        OooO00o(bArr, i, this.f18423OooO00o.OooO00o(), bArr2, i2);
        return this.f18423OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17656OooO00o() {
        String OooO00o2 = this.f18423OooO00o.m21886OooO00o();
        return OooO00o2.substring(0, OooO00o2.indexOf(47)) + "/G" + OooO00o2.substring(OooO00o2.indexOf(47) + 1);
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) throws IllegalArgumentException {
        this.f18421OooO00o = 0;
        this.f18423OooO00o.OooO00o(z, r4);
        this.f18424OooO00o = z;
        if (r4 instanceof C6274iilL1L) {
            r4 = ((C6274iilL1L) r4).OooO00o();
        }
        if (r4 instanceof liLL1l) {
            r4 = ((liLL1l) r4).OooO00o();
        }
        if (r4 instanceof C9374IiI) {
            r4 = ((C9374IiI) r4).OooO00o();
        }
        this.f18422OooO00o = (C6642li1LI) r4;
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I
    public byte OooO0O0(byte b) {
        long j = this.f18421OooO00o;
        if (j > 0 && j % 1024 == 0) {
            li1l11I1 OooO00o2 = this.f18423OooO00o.OooO00o();
            OooO00o2.OooO00o(false, this.f18422OooO00o);
            byte[] bArr = new byte[32];
            OooO00o2.OooO00o(OooO00o, 0, bArr, 0);
            OooO00o2.OooO00o(OooO00o, 8, bArr, 8);
            OooO00o2.OooO00o(OooO00o, 16, bArr, 16);
            OooO00o2.OooO00o(OooO00o, 24, bArr, 24);
            C6642li1LI r3 = new C6642li1LI(bArr);
            this.f18422OooO00o = r3;
            OooO00o2.OooO00o(true, r3);
            byte[] OooO00o3 = this.f18423OooO00o.m21887OooO00o();
            OooO00o2.OooO00o(OooO00o3, 0, OooO00o3, 0);
            this.f18423OooO00o.OooO00o(this.f18424OooO00o, new C6274iilL1L(this.f18422OooO00o, OooO00o3));
        }
        this.f18421OooO00o++;
        return this.f18423OooO00o.OooO0O0(b);
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void reset() {
        this.f18421OooO00o = 0;
        this.f18423OooO00o.reset();
    }
}
