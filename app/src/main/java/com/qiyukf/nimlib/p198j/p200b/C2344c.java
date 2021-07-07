package com.qiyukf.nimlib.p198j.p200b;

import android.opengl.GLES10;

/* renamed from: com.qiyukf.nimlib.j.b.c */
public final class C2344c {

    /* renamed from: a */
    public static int f4695a;

    /* renamed from: a */
    public static final int m5102a() {
        int i = f4695a;
        if (i > 0) {
            return i;
        }
        int[] iArr = new int[1];
        GLES10.glGetIntegerv(3379, iArr, 0);
        int i2 = iArr[0];
        f4695a = i2;
        return i2;
    }

    /* renamed from: a */
    public static final int m5103a(int i, int i2, int i3) {
        int a = m5102a();
        if (a <= 0) {
            return i;
        }
        if (i2 <= i && i3 <= i) {
            return i;
        }
        while (true) {
            float f = (float) i;
            float f2 = (float) a;
            if (((float) i2) / f <= f2 && ((float) i3) / f <= f2) {
                break;
            }
            i++;
        }
        if (((i - 1) & i) == 0) {
            return i;
        }
        int i4 = 0;
        while (i > 0) {
            i >>= 1;
            i4++;
        }
        return 1 << i4;
    }

    /* renamed from: a */
    public static int m5104a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i > 0 && i2 > 0) {
            if (i3 <= 0 && i4 <= 0) {
                return 1;
            }
            if (i3 <= 0) {
                i3 = (int) ((((float) (i * i4)) / ((float) i2)) + 0.5f);
            } else if (i4 <= 0) {
                i4 = (int) ((((float) (i2 * i3)) / ((float) i)) + 0.5f);
            }
            if (i2 > i4 || i > i3) {
                int round = Math.round(((float) i2) / ((float) i4));
                int round2 = Math.round(((float) i) / ((float) i3));
                if (round >= round2) {
                    round = round2;
                }
                if (round == 0) {
                    round = 1;
                }
                float f = (float) (i * i2);
                i5 = round;
                while (f / ((float) (i5 * i5)) > ((float) ((i3 * i4) << 1))) {
                    i5++;
                }
            }
        }
        return i5;
    }

    /* renamed from: a */
    public static int m5105a(String str) {
        int sqrt;
        int[] a = C2341a.m5088a(str);
        int i = a[0];
        int i2 = a[1];
        if (i <= 0 || i2 <= 0 || (sqrt = (int) Math.sqrt((double) (((float) (i * i2)) / 1166400.0f))) <= 0) {
            return 1;
        }
        return sqrt;
    }
}
