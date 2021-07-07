package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.oOOo00O  reason: case insensitive filesystem */
public class C8177oOOo00O {
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m19824OooO00o(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length == 0) {
            return iArr2;
        }
        int i = 0;
        iArr2[0] = 0;
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (iArr[i2] != iArr[i2 - 1]) {
                i++;
            }
            iArr2[i2] = i;
        }
        return iArr2;
    }

    public static int[] OooO0O0(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (int i2 : iArr) {
            Integer valueOf = Integer.valueOf(i2);
            if (i != valueOf.intValue()) {
                arrayList.add(valueOf);
            }
            i = valueOf.intValue();
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    public static String OooO00o(int[] iArr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < iArr.length; i++) {
            sb.append(iArr[i]);
            if (i != iArr.length - 1) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
