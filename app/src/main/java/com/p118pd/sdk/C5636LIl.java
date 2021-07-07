package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.umeng.commonsdk.proguard.C3571am;

/* renamed from: com.pd.sdk.LIl  reason: case insensitive filesystem */
public class C5636LIl extends AbstractC5738Lil {
    public static final byte[] OooO0O0 = {-87, -42, -21, 69, -15, 60, 112, C3571am.f9202h, O0O00O.OooO00o, -60, -106, 123, 35, C3571am.f9204j, 94, -83, -10, 88, -21, -92, ExifInterface.OooO0Oo, 55, 41, 29, 56, -39, 107, -16, C8027oOO00oo.OooO0OO, ExifInterface.OooOO0o, 78, 23, -8, -23, 114, 13, ExifInterface.OooO, 21, -76, 58, 40, -105, 95, 11, ExifInterface.OooO0o0, -34, -93, 100, 56, -75, 100, -22, 44, 23, -97, -48, 18, 62, 109, -72, -6, ExifInterface.OooO0oo, 121, 4};
    public C6011i1I OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16342OooO00o = OooO0O0;
    public LlLI1 o00OoOOo;

    public C5636LIl(LlLI1 llLI1) {
        this.o00OoOOo = llLI1;
    }

    public C5636LIl(LlLI1 llLI1, byte[] bArr) {
        this.o00OoOOo = llLI1;
        this.f16342OooO00o = C9586iIILl.m21630OooO00o(bArr);
    }

    public C5636LIl(C6011i1I i1i) {
        this.OooO00o = i1i;
    }

    public static C5636LIl OooO00o(Object obj) {
        if (obj instanceof C5636LIl) {
            return (C5636LIl) obj;
        }
        if (obj != null) {
            I11li1 OooO00o2 = I11li1.OooO00o(obj);
            C5636LIl lIl = OooO00o2.OooO00o(0) instanceof LlLI1 ? new C5636LIl(LlLI1.OooO00o(OooO00o2.OooO00o(0))) : new C5636LIl(C6011i1I.OooO00o(OooO00o2.OooO00o(0)));
            if (OooO00o2.size() == 2) {
                byte[] OooO00o3 = AbstractC6804llL1ii.OooO00o(OooO00o2.OooO00o(1)).m17938OooO00o();
                lIl.f16342OooO00o = OooO00o3;
                if (OooO00o3.length != OooO0O0.length) {
                    throw new IllegalArgumentException("object parse error");
                }
            }
            return lIl;
        }
        throw new IllegalArgumentException("object parse error");
    }

    public static byte[] OooO0O0() {
        return OooO0O0;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6011i1I m16113OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16114OooO00o() {
        return this.o00OoOOo != null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16115OooO00o() {
        return this.f16342OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16116OooO0O0() {
        iILLL1 r0 = new iILLL1();
        AbstractC6854lLi1LL r1 = this.o00OoOOo;
        if (r1 == null) {
            r1 = this.OooO00o;
        }
        r0.OooO00o(r1);
        if (!C9586iIILl.m21627OooO00o(this.f16342OooO00o, OooO0O0)) {
            r0.OooO00o(new C6487lIIiIlL(this.f16342OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
