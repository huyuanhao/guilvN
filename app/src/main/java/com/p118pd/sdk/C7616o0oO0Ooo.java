package com.p118pd.sdk;

import com.p118pd.sdk.C1699o0;
import java.util.List;

/* renamed from: com.pd.sdk.o0oO0Ooo  reason: case insensitive filesystem */
public class C7616o0oO0Ooo {
    public final OooO00o OooO00o;

    /* renamed from: com.pd.sdk.o0oO0Ooo$OooO00o */
    public interface OooO00o {
        C1699o0.OooO0O0 OooO00o(int i, int i2, int i3, Object obj);

        void OooO00o(C1699o0.OooO0O0 oooO0O0);
    }

    public C7616o0oO0Ooo(OooO00o oooO00o) {
        this.OooO00o = oooO00o;
    }

    private void OooO0OO(List<C1699o0.OooO0O0> list, int i, C1699o0.OooO0O0 oooO0O0, int i2, C1699o0.OooO0O0 oooO0O02) {
        int i3 = oooO0O0.OooO0OO < oooO0O02.OooO0O0 ? -1 : 0;
        if (oooO0O0.OooO0O0 < oooO0O02.OooO0O0) {
            i3++;
        }
        int i4 = oooO0O02.OooO0O0;
        int i5 = oooO0O0.OooO0O0;
        if (i4 <= i5) {
            oooO0O0.OooO0O0 = i5 + oooO0O02.OooO0OO;
        }
        int i6 = oooO0O02.OooO0O0;
        int i7 = oooO0O0.OooO0OO;
        if (i6 <= i7) {
            oooO0O0.OooO0OO = i7 + oooO0O02.OooO0OO;
        }
        oooO0O02.OooO0O0 += i3;
        list.set(i, oooO0O02);
        list.set(i2, oooO0O0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19248OooO00o(List<C1699o0.OooO0O0> list) {
        while (true) {
            int OooO00o2 = OooO00o(list);
            if (OooO00o2 != -1) {
                OooO00o(list, OooO00o2, OooO00o2 + 1);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO0O0(java.util.List<com.p118pd.sdk.C1699o0.OooO0O0> r9, int r10, com.p118pd.sdk.C1699o0.OooO0O0 r11, int r12, com.p118pd.sdk.C1699o0.OooO0O0 r13) {
        /*
            r8 = this;
            int r0 = r11.OooO0OO
            int r1 = r13.OooO0O0
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000d
            int r1 = r1 - r4
            r13.OooO0O0 = r1
            goto L_0x0020
        L_0x000d:
            int r5 = r13.OooO0OO
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0020
            int r5 = r5 - r4
            r13.OooO0OO = r5
            com.pd.sdk.o0oO0Ooo$OooO00o r0 = r8.OooO00o
            int r1 = r11.OooO0O0
            java.lang.Object r5 = r13.f19060OooO00o
            com.pd.sdk.o0$OooO0O0 r0 = r0.OooO00o(r2, r1, r4, r5)
            goto L_0x0021
        L_0x0020:
            r0 = r3
        L_0x0021:
            int r1 = r11.OooO0O0
            int r5 = r13.OooO0O0
            if (r1 > r5) goto L_0x002b
            int r5 = r5 + r4
            r13.OooO0O0 = r5
            goto L_0x0041
        L_0x002b:
            int r6 = r13.OooO0OO
            int r7 = r5 + r6
            if (r1 >= r7) goto L_0x0041
            int r5 = r5 + r6
            int r5 = r5 - r1
            com.pd.sdk.o0oO0Ooo$OooO00o r3 = r8.OooO00o
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f19060OooO00o
            com.pd.sdk.o0$OooO0O0 r3 = r3.OooO00o(r2, r1, r5, r4)
            int r1 = r13.OooO0OO
            int r1 = r1 - r5
            r13.OooO0OO = r1
        L_0x0041:
            r9.set(r12, r11)
            int r11 = r13.OooO0OO
            if (r11 <= 0) goto L_0x004c
            r9.set(r10, r13)
            goto L_0x0054
        L_0x004c:
            r9.remove(r10)
            com.pd.sdk.o0oO0Ooo$OooO00o r11 = r8.OooO00o
            r11.OooO00o(r13)
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r9.add(r10, r0)
        L_0x0059:
            if (r3 == 0) goto L_0x005e
            r9.add(r10, r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7616o0oO0Ooo.OooO0O0(java.util.List, int, com.pd.sdk.o0$OooO0O0, int, com.pd.sdk.o0$OooO0O0):void");
    }

    private void OooO00o(List<C1699o0.OooO0O0> list, int i, int i2) {
        C1699o0.OooO0O0 oooO0O0 = list.get(i);
        C1699o0.OooO0O0 oooO0O02 = list.get(i2);
        int i3 = oooO0O02.OooO00o;
        if (i3 == 1) {
            OooO0OO(list, i, oooO0O0, i2, oooO0O02);
        } else if (i3 == 2) {
            OooO00o(list, i, oooO0O0, i2, oooO0O02);
        } else if (i3 == 4) {
            OooO0O0(list, i, oooO0O0, i2, oooO0O02);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(java.util.List<com.p118pd.sdk.C1699o0.OooO0O0> r10, int r11, com.p118pd.sdk.C1699o0.OooO0O0 r12, int r13, com.p118pd.sdk.C1699o0.OooO0O0 r14) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7616o0oO0Ooo.OooO00o(java.util.List, int, com.pd.sdk.o0$OooO0O0, int, com.pd.sdk.o0$OooO0O0):void");
    }

    private int OooO00o(List<C1699o0.OooO0O0> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).OooO00o != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }
}
