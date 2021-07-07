package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TreeSet;

/* renamed from: com.pd.sdk.丨i11L  reason: invalid class name and case insensitive filesystem */
public class C9562i11L {
    public static final BigInteger OooO00o = BigInteger.valueOf(1);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final SecureRandom f23140OooO00o = new SecureRandom();

    public static int OooO00o(AbstractC97441iIIL r4) {
        int OooO0O0 = r4.OooO0O0();
        AbstractC97441iIIL r2 = r4;
        for (int i = 1; i < OooO0O0; i++) {
            r2 = r2.OooO0o0();
            r4 = r4.OooO00o(r2);
        }
        BigInteger OooO00o2 = r4.m21859OooO00o();
        if (OooO00o2.bitLength() <= 1) {
            return OooO00o2.intValue();
        }
        throw new IllegalStateException();
    }

    public static ArrayList OooO00o(Enumeration enumeration) {
        ArrayList arrayList = new ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return arrayList;
    }

    public static void OooO00o(C9387Iill r9) {
        IIiLIli OooO00o2 = r9.OooO00o();
        int OooO0O0 = OooO00o2.OooO0O0();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < OooO0O0; i++) {
            if (OooO00o(OooO00o2.OooO00o(OooO00o.shiftLeft(i))) != 0) {
                arrayList.add(I11I.OooO00o(i));
                PrintStream printStream = System.out;
                printStream.print(" " + i);
            }
        }
        System.out.println();
        for (int i2 = 0; i2 < 1000; i2++) {
            BigInteger bigInteger = new BigInteger(OooO0O0, f23140OooO00o);
            int OooO00o3 = OooO00o(OooO00o2.OooO00o(bigInteger));
            int i3 = 0;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                if (bigInteger.testBit(((Integer) arrayList.get(i4)).intValue())) {
                    i3 ^= 1;
                }
            }
            if (OooO00o3 != i3) {
                throw new IllegalStateException("Optimized-trace sanity check failed");
            }
        }
    }

    public static void OooO00o(String[] strArr) {
        TreeSet<String> treeSet = new TreeSet(OooO00o(C9857liL1l.OooO00o()));
        treeSet.addAll(OooO00o(C6907lliLi.OooO00o()));
        for (String str : treeSet) {
            C9387Iill OooO00o2 = C6907lliLi.m18071OooO00o(str);
            if (OooO00o2 == null) {
                OooO00o2 = C9857liL1l.m21940OooO00o(str);
            }
            if (OooO00o2 != null && Lii1I.OooO00o(OooO00o2.OooO00o())) {
                PrintStream printStream = System.out;
                printStream.print(str + Constants.COLON_SEPARATOR);
                OooO00o(OooO00o2);
            }
        }
    }

    public static void OooO0O0(C9387Iill r1) {
        if (Lii1I.OooO00o(r1.OooO00o())) {
            OooO00o(r1);
            return;
        }
        throw new IllegalArgumentException("Trace only defined over characteristic-2 fields");
    }
}
