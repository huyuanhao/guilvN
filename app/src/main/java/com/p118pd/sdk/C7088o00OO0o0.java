package com.p118pd.sdk;

import androidx.annotation.RestrictTo;
import java.io.PrintWriter;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o00OO0o0  reason: case insensitive filesystem */
public final class C7088o00OO0o0 {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final int OooO00o = 19;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f19414OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static char[] f19415OooO00o = new char[24];
    public static final int OooO0O0 = 60;
    public static final int OooO0OO = 3600;
    public static final int OooO0Oo = 86400;

    public static int OooO00o(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    public static int OooO00o(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        int i7 = i4 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }

    public static int OooO00o(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        if (f19415OooO00o.length < i) {
            f19415OooO00o = new char[i];
        }
        char[] cArr = f19415OooO00o;
        if (j2 == 0) {
            int i7 = i - 1;
            while (i7 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j2 > 0) {
            c = '+';
        } else {
            c = '-';
            j2 = -j2;
        }
        int i8 = (int) (j2 % 1000);
        int floor = (int) Math.floor((double) (j2 / 1000));
        if (floor > 86400) {
            i2 = floor / OooO0Oo;
            floor -= OooO0Oo * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i9 = floor / 60;
            i4 = floor - (i9 * 60);
            i5 = i9;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i != 0) {
            int OooO00o2 = OooO00o(i2, 1, false, 0);
            int OooO00o3 = OooO00o2 + OooO00o(i3, 1, OooO00o2 > 0, 2);
            int OooO00o4 = OooO00o3 + OooO00o(i5, 1, OooO00o3 > 0, 2);
            int OooO00o5 = OooO00o4 + OooO00o(i4, 1, OooO00o4 > 0, 2);
            i6 = 0;
            for (int OooO00o6 = OooO00o5 + OooO00o(i8, 2, true, OooO00o5 > 0 ? 3 : 0) + 1; OooO00o6 < i; OooO00o6++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i10 = i6 + 1;
        boolean z = i != 0;
        int OooO00o7 = OooO00o(cArr, i2, 'd', i10, false, 0);
        int OooO00o8 = OooO00o(cArr, i3, 'h', OooO00o7, OooO00o7 != i10, z ? 2 : 0);
        int OooO00o9 = OooO00o(cArr, i5, 'm', OooO00o8, OooO00o8 != i10, z ? 2 : 0);
        int OooO00o10 = OooO00o(cArr, i4, 's', OooO00o9, OooO00o9 != i10, z ? 2 : 0);
        int OooO00o11 = OooO00o(cArr, i8, 'm', OooO00o10, true, (!z || OooO00o10 == i10) ? 0 : 3);
        cArr[OooO00o11] = 's';
        return OooO00o11 + 1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void OooO00o(long j, StringBuilder sb) {
        synchronized (f19414OooO00o) {
            sb.append(f19415OooO00o, 0, OooO00o(j, 0));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void OooO00o(long j, PrintWriter printWriter, int i) {
        synchronized (f19414OooO00o) {
            printWriter.print(new String(f19415OooO00o, 0, OooO00o(j, i)));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void OooO00o(long j, PrintWriter printWriter) {
        OooO00o(j, printWriter, 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static void OooO00o(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            OooO00o(j - j2, printWriter, 0);
        }
    }
}
