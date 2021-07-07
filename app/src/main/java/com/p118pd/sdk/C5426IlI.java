package com.p118pd.sdk;

import java.util.Vector;

/* renamed from: com.pd.sdk.IlI  reason: case insensitive filesystem */
public class C5426IlI {
    public AbstractC5662LLi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector f15812OooO00o;

    public C5426IlI() {
        this(C9388IiLL.OooO00o);
    }

    public C5426IlI(AbstractC5662LLi lLi) {
        this.f15812OooO00o = new Vector();
        this.OooO00o = lLi;
    }

    public C5426IlI OooO00o(C5605L1ll r3) {
        this.f15812OooO00o.addElement(new LILlIL(r3));
        return this;
    }

    public C5426IlI OooO00o(LlLI1 llLI1, AbstractC6854lLi1LL r4) {
        this.f15812OooO00o.addElement(new LILlIL(llLI1, r4));
        return this;
    }

    public C5426IlI OooO00o(LlLI1 llLI1, String str) {
        OooO00o(llLI1, this.OooO00o.OooO00o(llLI1, str));
        return this;
    }

    public C5426IlI OooO00o(C5605L1ll[] r3) {
        this.f15812OooO00o.addElement(new LILlIL(r3));
        return this;
    }

    public C5426IlI OooO00o(LlLI1[] llLI1Arr, AbstractC6854lLi1LL[] r7) {
        C5605L1ll[] r0 = new C5605L1ll[llLI1Arr.length];
        for (int i = 0; i != llLI1Arr.length; i++) {
            r0[i] = new C5605L1ll(llLI1Arr[i], r7[i]);
        }
        return OooO00o(r0);
    }

    public C5426IlI OooO00o(LlLI1[] llLI1Arr, String[] strArr) {
        int length = strArr.length;
        AbstractC6854lLi1LL[] r1 = new AbstractC6854lLi1LL[length];
        for (int i = 0; i != length; i++) {
            r1[i] = this.OooO00o.OooO00o(llLI1Arr[i], strArr[i]);
        }
        return OooO00o(llLI1Arr, r1);
    }

    public l1LILI1 OooO00o() {
        int size = this.f15812OooO00o.size();
        LILlIL[] lILlILArr = new LILlIL[size];
        for (int i = 0; i != size; i++) {
            lILlILArr[i] = (LILlIL) this.f15812OooO00o.elementAt(i);
        }
        return new l1LILI1(this.OooO00o, lILlILArr);
    }
}
