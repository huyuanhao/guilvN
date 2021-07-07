package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.TreeSet;

/* renamed from: com.pd.sdk.II丨lliL  reason: invalid class name */
public class IIlliL {
    public static ArrayList OooO00o(Enumeration enumeration) {
        ArrayList arrayList = new ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return arrayList;
    }

    public static void OooO00o(C9387Iill r4) {
        AbstractC97441iIIL OooO00o = r4.OooO00o().OooO00o(BigInteger.valueOf(2));
        AbstractC97441iIIL OooO0Oo = OooO00o.OooO0Oo();
        System.out.println(OooO0Oo.m21859OooO00o().toString(16).toUpperCase());
        if (!OooO0Oo.OooO0o0().equals(OooO00o)) {
            throw new IllegalStateException("Optimized-sqrt sanity check failed");
        }
    }

    public static void OooO00o(String[] strArr) {
        TreeSet<String> treeSet = new TreeSet(OooO00o(C9857liL1l.OooO00o()));
        treeSet.addAll(OooO00o(C6907lliLi.OooO00o()));
        for (String str : treeSet) {
            C9387Iill OooO00o = C6907lliLi.m18071OooO00o(str);
            if (OooO00o == null) {
                OooO00o = C9857liL1l.m21940OooO00o(str);
            }
            if (OooO00o != null && Lii1I.OooO00o(OooO00o.OooO00o())) {
                PrintStream printStream = System.out;
                printStream.print(str + Constants.COLON_SEPARATOR);
                OooO00o(OooO00o);
            }
        }
    }

    public static void OooO0O0(C9387Iill r1) {
        if (Lii1I.OooO00o(r1.OooO00o())) {
            OooO00o(r1);
            return;
        }
        throw new IllegalArgumentException("Sqrt optimization only defined over characteristic-2 fields");
    }
}
