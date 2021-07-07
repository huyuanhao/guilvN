package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.IIII */
public class IIII {
    public Object[] OooO00o;
    public Object[] OooO0O0;
    public final int o00oO0O;
    public volatile int o0ooOO0;
    public int o0ooOOo;

    public IIII(int i) {
        this.o00oO0O = i;
    }

    public void OooO00o(Object obj) {
        if (this.o0ooOO0 == 0) {
            Object[] objArr = new Object[(this.o00oO0O + 1)];
            this.OooO00o = objArr;
            this.OooO0O0 = objArr;
            objArr[0] = obj;
            this.o0ooOOo = 1;
            this.o0ooOO0 = 1;
            return;
        }
        int i = this.o0ooOOo;
        int i2 = this.o00oO0O;
        if (i == i2) {
            Object[] objArr2 = new Object[(i2 + 1)];
            objArr2[0] = obj;
            this.OooO0O0[i2] = objArr2;
            this.OooO0O0 = objArr2;
            this.o0ooOOo = 1;
            this.o0ooOO0++;
            return;
        }
        this.OooO0O0[i] = obj;
        this.o0ooOOo = i + 1;
        this.o0ooOO0++;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Object[] m15368OooO0O0() {
        return this.OooO0O0;
    }

    public List<Object> OooO0OO() {
        int i = this.o00oO0O;
        int i2 = this.o0ooOO0;
        ArrayList arrayList = new ArrayList(i2 + 1);
        Object[] OooO00o2 = OooO00o();
        int i3 = 0;
        while (true) {
            int i4 = 0;
            while (i3 < i2) {
                arrayList.add(OooO00o2[i4]);
                i3++;
                i4++;
                if (i4 == i) {
                    OooO00o2 = OooO00o2[i];
                }
            }
            return arrayList;
        }
    }

    public int OooO0Oo() {
        return this.o0ooOOo;
    }

    public int OooO0o0() {
        return this.o0ooOO0;
    }

    public String toString() {
        return OooO0OO().toString();
    }

    public int OooO0O0() {
        return this.o00oO0O;
    }

    public Object[] OooO00o() {
        return this.OooO00o;
    }
}
