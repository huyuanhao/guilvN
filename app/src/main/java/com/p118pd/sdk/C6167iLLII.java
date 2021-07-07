package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.iLLI丨I  reason: invalid class name and case insensitive filesystem */
public class C6167iLLII extends AbstractC5738Lil {
    public Object[] OooO00o;

    public C6167iLLII(I11li1 i11li1) {
        this.OooO00o = new Object[i11li1.size()];
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        int i = 0;
        while (OooO00o2.hasMoreElements()) {
            AbstractC5903LlLLL OooO00o3 = AbstractC5903LlLLL.OooO00o(OooO00o2.nextElement());
            if (OooO00o3.OooO00o() == 0) {
                I11li1 OooO00o4 = I11li1.OooO00o(OooO00o3, true);
                int size = OooO00o4.size();
                C5870LiLlI[] r4 = new C5870LiLlI[size];
                for (int i2 = 0; i2 != size; i2++) {
                    r4[i2] = C5870LiLlI.OooO00o(OooO00o4.OooO00o(i2));
                }
                this.OooO00o[i] = r4;
            } else if (OooO00o3.OooO00o() == 1) {
                this.OooO00o[i] = C9370Ii.OooO00o(I11li1.OooO00o(OooO00o3, true));
            } else {
                throw new IllegalArgumentException("illegal tag: " + OooO00o3.OooO00o());
            }
            i++;
        }
    }

    public C6167iLLII(C9370Ii r3) {
        Object[] objArr = new Object[1];
        this.OooO00o = objArr;
        objArr[0] = r3;
    }

    public C6167iLLII(C5870LiLlI[] r3) {
        Object[] objArr = new Object[1];
        this.OooO00o = objArr;
        objArr[0] = r3;
    }

    public static C6167iLLII OooO00o(Object obj) {
        if (obj instanceof C6167iLLII) {
            return (C6167iLLII) obj;
        }
        if (obj != null) {
            return new C6167iLLII(I11li1.OooO00o(obj));
        }
        return null;
    }

    public Object[] OooO00o() {
        Object[] objArr = this.OooO00o;
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return objArr2;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        int i = 0;
        while (true) {
            Object[] objArr = this.OooO00o;
            if (i == objArr.length) {
                return new C5707LiL1(r0);
            }
            r0.OooO00o(objArr[i] instanceof C5870LiLlI[] ? new ILI1Ll(0, new C5707LiL1((C5870LiLlI[]) this.OooO00o[i])) : new ILI1Ll(1, (C9370Ii) this.OooO00o[i]));
            i++;
        }
    }
}
