package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.o0OOooo0  reason: case insensitive filesystem */
public class C7445o0OOooo0 {
    public static final int OooO = 1;
    public static final int OooO00o = 1;
    public static final int OooO0O0 = 2;
    public static final int OooO0OO = 3;
    public static final int OooO0Oo = 4;
    public static final int OooO0o = 6;
    public static final int OooO0o0 = 5;
    public static final int OooO0oO = Integer.MIN_VALUE;
    public static final int OooO0oo = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f20275OooO00o = new ArrayList(5);

    public int OooO00o() {
        return this.f20275OooO00o.size();
    }

    public C7451o0Oo00o0 OooO00o(int i) {
        return (C7451o0Oo00o0) this.f20275OooO00o.get(i);
    }

    public void OooO00o(C7451o0Oo00o0 o0oo00o0) {
        this.f20275OooO00o.add(o0oo00o0);
    }

    public String toString() {
        int OooO0O02;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < OooO00o(); i++) {
            stringBuffer.append(OooO00o(i));
            if (i < OooO00o() - 1 && ((OooO0O02 = OooO00o(i + 1).OooO0O0()) == 1 || OooO0O02 == 2)) {
                stringBuffer.append('/');
            }
        }
        return stringBuffer.toString();
    }
}
