package com.p118pd.sdk;

import com.p118pd.sdk.C9586iIILl;
import java.util.Iterator;

/* renamed from: com.pd.sdk.丨li1Ii1i  reason: invalid class name */
public class li1Ii1i extends AbstractC5738Lil implements AbstractC9757IL1i1<AbstractC6854lLi1LL> {
    public final AbstractC6854lLi1LL[] OooO00o;

    public li1Ii1i(I11li1 i11li1) {
        this.OooO00o = new AbstractC6854lLi1LL[i11li1.size()];
        int i = 0;
        while (true) {
            AbstractC6854lLi1LL[] r1 = this.OooO00o;
            if (i != r1.length) {
                r1[i] = IL1iLI.OooO00o(i11li1.OooO00o(i));
                i++;
            } else {
                return;
            }
        }
    }

    public li1Ii1i(IL1iLI[] r4) {
        AbstractC6854lLi1LL[] r0 = new AbstractC6854lLi1LL[r4.length];
        this.OooO00o = r0;
        System.arraycopy(r4, 0, r0, 0, r4.length);
    }

    public static li1Ii1i OooO00o(Object obj) {
        if (obj instanceof li1Ii1i) {
            return (li1Ii1i) obj;
        }
        if (obj != null) {
            return new li1Ii1i(I11li1.OooO00o(obj));
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C5707LiL1(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9757IL1i1, java.lang.Iterable
    public Iterator<AbstractC6854lLi1LL> iterator() {
        return new C9586iIILl.OooO00o(this.OooO00o);
    }
}
