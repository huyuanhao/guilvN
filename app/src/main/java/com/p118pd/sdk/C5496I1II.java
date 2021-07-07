package com.p118pd.sdk;

import java.io.PrintStream;

/* renamed from: com.pd.sdk.I丨1II  reason: invalid class name and case insensitive filesystem */
public final class C5496I1II {
    public static int OooO00o(int i) {
        int i2 = -1;
        while (i != 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static int OooO00o(int i, int i2) {
        return i ^ i2;
    }

    public static int OooO00o(int i, int i2, int i3) {
        int OooO0OO = OooO0OO(i, i3);
        int OooO0OO2 = OooO0OO(i2, i3);
        int i4 = 0;
        if (OooO0OO2 != 0) {
            int OooO00o = 1 << OooO00o(i3);
            while (OooO0OO != 0) {
                if (((byte) (OooO0OO & 1)) == 1) {
                    i4 ^= OooO0OO2;
                }
                OooO0OO >>>= 1;
                OooO0OO2 <<= 1;
                if (OooO0OO2 >= OooO00o) {
                    OooO0OO2 ^= i3;
                }
            }
        }
        return i4;
    }

    public static int OooO00o(long j) {
        int i = 0;
        while (j != 0) {
            i++;
            j >>>= 1;
        }
        return i - 1;
    }

    public static int OooO00o(long j, int i) {
        if (i == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        long j2 = ((long) i) & 4294967295L;
        while ((j >>> 32) != 0) {
            j ^= j2 << (OooO00o(j) - OooO00o(j2));
        }
        int i2 = (int) (j & -1);
        while (OooO00o(i2) >= OooO00o(i)) {
            i2 ^= i << (OooO00o(i2) - OooO00o(i));
        }
        return i2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m15732OooO00o(int i, int i2) {
        long j = 0;
        if (i2 != 0) {
            long j2 = ((long) i2) & 4294967295L;
            while (i != 0) {
                if (((byte) (i & 1)) == 1) {
                    j ^= j2;
                }
                i >>>= 1;
                j2 <<= 1;
            }
        }
        return j;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m15733OooO00o(int i) {
        if (i == 0) {
            return false;
        }
        int OooO00o = OooO00o(i) >>> 1;
        int i2 = 2;
        for (int i3 = 0; i3 < OooO00o; i3++) {
            i2 = OooO00o(i2, i2, i);
            if (OooO0O0(i2 ^ 2, i) != 1) {
                return false;
            }
        }
        return true;
    }

    public static int OooO0O0(int i) {
        PrintStream printStream;
        String str;
        if (i < 0) {
            printStream = System.err;
            str = "The Degree is negative";
        } else if (i > 31) {
            printStream = System.err;
            str = "The Degree is more then 31";
        } else if (i == 0) {
            return 1;
        } else {
            int i2 = 1 << (i + 1);
            for (int i3 = (1 << i) + 1; i3 < i2; i3 += 2) {
                if (m15733OooO00o(i3)) {
                    return i3;
                }
            }
            return 0;
        }
        printStream.println(str);
        return 0;
    }

    public static int OooO0O0(int i, int i2) {
        while (true) {
            i = i2;
            if (i == 0) {
                return i;
            }
            i2 = OooO0OO(i, i);
        }
    }

    public static int OooO0OO(int i, int i2) {
        if (i2 == 0) {
            System.err.println("Error: to be divided by 0");
            return 0;
        }
        while (OooO00o(i) >= OooO00o(i2)) {
            i ^= i2 << (OooO00o(i) - OooO00o(i2));
        }
        return i;
    }
}
