package com.p118pd.sdk;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.pd.sdk.o0OoOoOO  reason: case insensitive filesystem */
public class C7505o0OoOoOO {
    public static final Comparator<C7508OooO0oO> OooO00o = new OooO00o();

    /* renamed from: com.pd.sdk.o0OoOoOO$OooO00o */
    public static class OooO00o implements Comparator<C7508OooO0oO> {
        /* renamed from: OooO00o */
        public int compare(C7508OooO0oO oooO0oO, C7508OooO0oO oooO0oO2) {
            int i = oooO0oO.OooO00o - oooO0oO2.OooO00o;
            return i == 0 ? oooO0oO.OooO0O0 - oooO0oO2.OooO0O0 : i;
        }
    }

    /* renamed from: com.pd.sdk.o0OoOoOO$OooO0O0 */
    public static abstract class OooO0O0 {
        public abstract int OooO00o();

        @Nullable
        public Object OooO00o(int i, int i2) {
            return null;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public abstract boolean m19136OooO00o(int i, int i2);

        public abstract int OooO0O0();

        public abstract boolean OooO0O0(int i, int i2);
    }

    /* renamed from: com.pd.sdk.o0OoOoOO$OooO0Oo  reason: case insensitive filesystem */
    public static abstract class AbstractC7506OooO0Oo<T> {
        @Nullable
        public Object OooO00o(@NonNull T t, @NonNull T t2) {
            return null;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public abstract boolean m19138OooO00o(@NonNull T t, @NonNull T t2);

        public abstract boolean OooO0O0(@NonNull T t, @NonNull T t2);
    }

    /* renamed from: com.pd.sdk.o0OoOoOO$OooO0o */
    public static class OooO0o {
        public int OooO00o;
        public int OooO0O0;
        public int OooO0OO;
        public int OooO0Oo;

        public OooO0o() {
        }

        public OooO0o(int i, int i2, int i3, int i4) {
            this.OooO00o = i;
            this.OooO0O0 = i2;
            this.OooO0OO = i3;
            this.OooO0Oo = i4;
        }
    }

    /* renamed from: com.pd.sdk.o0OoOoOO$OooO0o0  reason: case insensitive filesystem */
    public static class C7507OooO0o0 {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f20349OooO00o;
        public int OooO0O0;

        public C7507OooO0o0(int i, int i2, boolean z) {
            this.OooO00o = i;
            this.OooO0O0 = i2;
            this.f20349OooO00o = z;
        }
    }

    /* renamed from: com.pd.sdk.o0OoOoOO$OooO0oO  reason: case insensitive filesystem */
    public static class C7508OooO0oO {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f20350OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f20351OooO0O0;
        public int OooO0OO;
    }

    @NonNull
    public static OooO0OO OooO00o(@NonNull OooO0O0 oooO0O0) {
        return OooO00o(oooO0O0, true);
    }

    @NonNull
    public static OooO0OO OooO00o(@NonNull OooO0O0 oooO0O0, boolean z) {
        OooO0o oooO0o;
        int OooO0O02 = oooO0O0.OooO0O0();
        int OooO00o2 = oooO0O0.OooO00o();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new OooO0o(0, OooO0O02, 0, OooO00o2));
        int abs = OooO0O02 + OooO00o2 + Math.abs(OooO0O02 - OooO00o2);
        int i = abs * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            OooO0o oooO0o2 = (OooO0o) arrayList2.remove(arrayList2.size() - 1);
            C7508OooO0oO OooO00o3 = OooO00o(oooO0O0, oooO0o2.OooO00o, oooO0o2.OooO0O0, oooO0o2.OooO0OO, oooO0o2.OooO0Oo, iArr, iArr2, abs);
            if (OooO00o3 != null) {
                if (OooO00o3.OooO0OO > 0) {
                    arrayList.add(OooO00o3);
                }
                OooO00o3.OooO00o += oooO0o2.OooO00o;
                OooO00o3.OooO0O0 += oooO0o2.OooO0OO;
                if (arrayList3.isEmpty()) {
                    oooO0o = new OooO0o();
                } else {
                    oooO0o = (OooO0o) arrayList3.remove(arrayList3.size() - 1);
                }
                oooO0o.OooO00o = oooO0o2.OooO00o;
                oooO0o.OooO0OO = oooO0o2.OooO0OO;
                if (OooO00o3.f20351OooO0O0) {
                    oooO0o.OooO0O0 = OooO00o3.OooO00o;
                    oooO0o.OooO0Oo = OooO00o3.OooO0O0;
                } else if (OooO00o3.f20350OooO00o) {
                    oooO0o.OooO0O0 = OooO00o3.OooO00o - 1;
                    oooO0o.OooO0Oo = OooO00o3.OooO0O0;
                } else {
                    oooO0o.OooO0O0 = OooO00o3.OooO00o;
                    oooO0o.OooO0Oo = OooO00o3.OooO0O0 - 1;
                }
                arrayList2.add(oooO0o);
                if (!OooO00o3.f20351OooO0O0) {
                    int i2 = OooO00o3.OooO00o;
                    int i3 = OooO00o3.OooO0OO;
                    oooO0o2.OooO00o = i2 + i3;
                    oooO0o2.OooO0OO = OooO00o3.OooO0O0 + i3;
                } else if (OooO00o3.f20350OooO00o) {
                    int i4 = OooO00o3.OooO00o;
                    int i5 = OooO00o3.OooO0OO;
                    oooO0o2.OooO00o = i4 + i5 + 1;
                    oooO0o2.OooO0OO = OooO00o3.OooO0O0 + i5;
                } else {
                    int i6 = OooO00o3.OooO00o;
                    int i7 = OooO00o3.OooO0OO;
                    oooO0o2.OooO00o = i6 + i7;
                    oooO0o2.OooO0OO = OooO00o3.OooO0O0 + i7 + 1;
                }
                arrayList2.add(oooO0o2);
            } else {
                arrayList3.add(oooO0o2);
            }
        }
        Collections.sort(arrayList, OooO00o);
        return new OooO0OO(oooO0O0, arrayList, iArr, iArr2, z);
    }

    /* renamed from: com.pd.sdk.o0OoOoOO$OooO0OO */
    public static class OooO0OO {
        public static final int OooO = 5;
        public static final int OooO0OO = -1;
        public static final int OooO0Oo = 1;
        public static final int OooO0o = 4;
        public static final int OooO0o0 = 2;
        public static final int OooO0oO = 8;
        public static final int OooO0oo = 16;
        public static final int OooOO0 = 31;
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0O0 f20344OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final List<C7508OooO0oO> f20345OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final boolean f20346OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final int[] f20347OooO00o;
        public final int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final int[] f20348OooO0O0;

        public OooO0OO(OooO0O0 oooO0O0, List<C7508OooO0oO> list, int[] iArr, int[] iArr2, boolean z) {
            this.f20345OooO00o = list;
            this.f20347OooO00o = iArr;
            this.f20348OooO0O0 = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(this.f20348OooO0O0, 0);
            this.f20344OooO00o = oooO0O0;
            this.OooO00o = oooO0O0.OooO0O0();
            this.OooO0O0 = oooO0O0.OooO00o();
            this.f20346OooO00o = z;
            OooO00o();
            OooO0O0();
        }

        private void OooO00o() {
            C7508OooO0oO oooO0oO = this.f20345OooO00o.isEmpty() ? null : this.f20345OooO00o.get(0);
            if (oooO0oO == null || oooO0oO.OooO00o != 0 || oooO0oO.OooO0O0 != 0) {
                C7508OooO0oO oooO0oO2 = new C7508OooO0oO();
                oooO0oO2.OooO00o = 0;
                oooO0oO2.OooO0O0 = 0;
                oooO0oO2.f20350OooO00o = false;
                oooO0oO2.OooO0OO = 0;
                oooO0oO2.f20351OooO0O0 = false;
                this.f20345OooO00o.add(0, oooO0oO2);
            }
        }

        private void OooO0O0() {
            int i = this.OooO00o;
            int i2 = this.OooO0O0;
            for (int size = this.f20345OooO00o.size() - 1; size >= 0; size--) {
                C7508OooO0oO oooO0oO = this.f20345OooO00o.get(size);
                int i3 = oooO0oO.OooO00o;
                int i4 = oooO0oO.OooO0OO;
                int i5 = i3 + i4;
                int i6 = oooO0oO.OooO0O0 + i4;
                if (this.f20346OooO00o) {
                    while (i > i5) {
                        OooO00o(i, i2, size);
                        i--;
                    }
                    while (i2 > i6) {
                        OooO0O0(i, i2, size);
                        i2--;
                    }
                }
                for (int i7 = 0; i7 < oooO0oO.OooO0OO; i7++) {
                    int i8 = oooO0oO.OooO00o + i7;
                    int i9 = oooO0oO.OooO0O0 + i7;
                    int i10 = this.f20344OooO00o.m19136OooO00o(i8, i9) ? 1 : 2;
                    this.f20347OooO00o[i8] = (i9 << 5) | i10;
                    this.f20348OooO0O0[i9] = (i8 << 5) | i10;
                }
                i = oooO0oO.OooO00o;
                i2 = oooO0oO.OooO0O0;
            }
        }

        private void OooO00o(int i, int i2, int i3) {
            if (this.f20347OooO00o[i - 1] == 0) {
                OooO00o(i, i2, i3, false);
            }
        }

        public int OooO00o(@IntRange(from = 0) int i) {
            if (i >= 0) {
                int[] iArr = this.f20348OooO0O0;
                if (i < iArr.length) {
                    int i2 = iArr[i];
                    if ((i2 & 31) == 0) {
                        return -1;
                    }
                    return i2 >> 5;
                }
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", new list size = " + this.f20348OooO0O0.length);
        }

        private boolean OooO00o(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i4 = i;
                i5 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                C7508OooO0oO oooO0oO = this.f20345OooO00o.get(i3);
                int i6 = oooO0oO.OooO00o;
                int i7 = oooO0oO.OooO0OO;
                int i8 = i6 + i7;
                int i9 = oooO0oO.OooO0O0 + i7;
                int i10 = 8;
                if (z) {
                    for (int i11 = i4 - 1; i11 >= i8; i11--) {
                        if (this.f20344OooO00o.OooO0O0(i11, i5)) {
                            if (!this.f20344OooO00o.m19136OooO00o(i11, i5)) {
                                i10 = 4;
                            }
                            this.f20348OooO0O0[i5] = (i11 << 5) | 16;
                            this.f20347OooO00o[i11] = (i5 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i12 = i2 - 1; i12 >= i9; i12--) {
                        if (this.f20344OooO00o.OooO0O0(i5, i12)) {
                            if (!this.f20344OooO00o.m19136OooO00o(i5, i12)) {
                                i10 = 4;
                            }
                            int i13 = i - 1;
                            this.f20347OooO00o[i13] = (i12 << 5) | 16;
                            this.f20348OooO0O0[i12] = (i13 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                }
                i4 = oooO0oO.OooO00o;
                i2 = oooO0oO.OooO0O0;
                i3--;
            }
            return false;
        }

        private void OooO0O0(int i, int i2, int i3) {
            if (this.f20348OooO0O0[i2 - 1] == 0) {
                OooO00o(i, i2, i3, true);
            }
        }

        public int OooO0O0(@IntRange(from = 0) int i) {
            if (i >= 0) {
                int[] iArr = this.f20347OooO00o;
                if (i < iArr.length) {
                    int i2 = iArr[i];
                    if ((i2 & 31) == 0) {
                        return -1;
                    }
                    return i2 >> 5;
                }
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i + ", old list size = " + this.f20347OooO00o.length);
        }

        private void OooO0O0(List<C7507OooO0o0> list, o0O00OOO o0o00ooo, int i, int i2, int i3) {
            if (!this.f20346OooO00o) {
                o0o00ooo.OooO00o(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f20347OooO00o[i5] & 31;
                if (i6 == 0) {
                    o0o00ooo.OooO00o(i + i4, 1);
                    for (C7507OooO0o0 oooO0o0 : list) {
                        oooO0o0.OooO0O0--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f20347OooO00o[i5] >> 5;
                    C7507OooO0o0 OooO00o2 = OooO00o(list, i7, false);
                    o0o00ooo.OooO0O0(i + i4, OooO00o2.OooO0O0 - 1);
                    if (i6 == 4) {
                        o0o00ooo.OooO00o(OooO00o2.OooO0O0 - 1, 1, this.f20344OooO00o.OooO00o(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new C7507OooO0o0(i5, i + i4, true));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString((long) i6));
                }
            }
        }

        public void OooO00o(@NonNull RecyclerView.AbstractC5065OooO0oO oooO0oO) {
            OooO00o(new o0O00000(oooO0oO));
        }

        public void OooO00o(@NonNull o0O00OOO o0o00ooo) {
            C7256o0O000O o0o000o;
            if (o0o00ooo instanceof C7256o0O000O) {
                o0o000o = (C7256o0O000O) o0o00ooo;
            } else {
                o0o000o = new C7256o0O000O(o0o00ooo);
            }
            List<C7507OooO0o0> arrayList = new ArrayList<>();
            int i = this.OooO00o;
            int i2 = this.OooO0O0;
            for (int size = this.f20345OooO00o.size() - 1; size >= 0; size--) {
                C7508OooO0oO oooO0oO = this.f20345OooO00o.get(size);
                int i3 = oooO0oO.OooO0OO;
                int i4 = oooO0oO.OooO00o + i3;
                int i5 = oooO0oO.OooO0O0 + i3;
                if (i4 < i) {
                    OooO0O0(arrayList, o0o000o, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    OooO00o(arrayList, o0o000o, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    int[] iArr = this.f20347OooO00o;
                    int i7 = oooO0oO.OooO00o;
                    if ((iArr[i7 + i6] & 31) == 2) {
                        o0o000o.OooO00o(i7 + i6, 1, this.f20344OooO00o.OooO00o(i7 + i6, oooO0oO.OooO0O0 + i6));
                    }
                }
                i = oooO0oO.OooO00o;
                i2 = oooO0oO.OooO0O0;
            }
            o0o000o.OooO00o();
        }

        public static C7507OooO0o0 OooO00o(List<C7507OooO0o0> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                C7507OooO0o0 oooO0o0 = list.get(size);
                if (oooO0o0.OooO00o == i && oooO0o0.f20349OooO00o == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).OooO0O0 += z ? 1 : -1;
                        size++;
                    }
                    return oooO0o0;
                }
                size--;
            }
            return null;
        }

        private void OooO00o(List<C7507OooO0o0> list, o0O00OOO o0o00ooo, int i, int i2, int i3) {
            if (!this.f20346OooO00o) {
                o0o00ooo.OooO0OO(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f20348OooO0O0[i5] & 31;
                if (i6 == 0) {
                    o0o00ooo.OooO0OO(i, 1);
                    for (C7507OooO0o0 oooO0o0 : list) {
                        oooO0o0.OooO0O0++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f20348OooO0O0[i5] >> 5;
                    o0o00ooo.OooO0O0(OooO00o(list, i7, true).OooO0O0, i);
                    if (i6 == 4) {
                        o0o00ooo.OooO00o(i, 1, this.f20344OooO00o.OooO00o(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new C7507OooO0o0(i5, i, false));
                } else {
                    throw new IllegalStateException("unknown flag for pos " + i5 + " " + Long.toBinaryString((long) i6));
                }
            }
        }

        @VisibleForTesting
        /* renamed from: OooO00o  reason: collision with other method in class */
        public List<C7508OooO0oO> m19137OooO00o() {
            return this.f20345OooO00o;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r24[r13 - 1] < r24[r13 + r5]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b8, code lost:
        if (r25[r12 - 1] < r25[r12 + 1]) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p118pd.sdk.C7505o0OoOoOO.C7508OooO0oO OooO00o(com.p118pd.sdk.C7505o0OoOoOO.OooO0O0 r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7505o0OoOoOO.OooO00o(com.pd.sdk.o0OoOoOO$OooO0O0, int, int, int, int, int[], int[], int):com.pd.sdk.o0OoOoOO$OooO0oO");
    }
}
