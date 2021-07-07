package com.p118pd.sdk;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import okio.ByteString;

/* renamed from: com.pd.sdk.Ooooo  reason: case insensitive filesystem */
public final class C5987Ooooo extends AbstractList<ByteString> implements RandomAccess {
    public final int[] OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ByteString[] f17289OooO00o;

    public C5987Ooooo(ByteString[] byteStringArr, int[] iArr) {
        this.f17289OooO00o = byteStringArr;
        this.OooO00o = iArr;
    }

    public static C5987Ooooo OooO00o(ByteString... byteStringArr) {
        if (byteStringArr.length == 0) {
            return new C5987Ooooo(new ByteString[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(byteStringArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(-1);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(Collections.binarySearch(arrayList, byteStringArr[i2]), Integer.valueOf(i2));
        }
        if (((ByteString) arrayList.get(0)).size() != 0) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                ByteString byteString = (ByteString) arrayList.get(i3);
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < arrayList.size()) {
                    ByteString byteString2 = (ByteString) arrayList.get(i5);
                    if (!byteString2.startsWith(byteString)) {
                        continue;
                        break;
                    } else if (byteString2.size() == byteString.size()) {
                        throw new IllegalArgumentException("duplicate option: " + byteString2);
                    } else if (((Integer) arrayList2.get(i5)).intValue() > ((Integer) arrayList2.get(i3)).intValue()) {
                        arrayList.remove(i5);
                        arrayList2.remove(i5);
                    } else {
                        i5++;
                    }
                }
                i3 = i4;
            }
            OOOO000 oooo000 = new OOOO000();
            OooO00o(0, oooo000, 0, arrayList, 0, arrayList.size(), arrayList2);
            int OooO00o2 = OooO00o(oooo000);
            int[] iArr = new int[OooO00o2];
            for (int i6 = 0; i6 < OooO00o2; i6++) {
                iArr[i6] = oooo000.readInt();
            }
            if (oooo000.m16616OooO0OO()) {
                return new C5987Ooooo((ByteString[]) byteStringArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    public final int size() {
        return this.f17289OooO00o.length;
    }

    public static void OooO00o(long j, OOOO000 oooo000, int i, List<ByteString> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        OOOO000 oooo0002;
        int i6;
        int i7 = i2;
        if (i7 < i3) {
            for (int i8 = i7; i8 < i3; i8++) {
                if (list.get(i8).size() < i) {
                    throw new AssertionError();
                }
            }
            ByteString byteString = list.get(i2);
            ByteString byteString2 = list.get(i3 - 1);
            int i9 = -1;
            if (i == byteString.size()) {
                i9 = list2.get(i7).intValue();
                i7++;
                byteString = list.get(i7);
            }
            if (byteString.getByte(i) != byteString2.getByte(i)) {
                int i10 = 1;
                for (int i11 = i7 + 1; i11 < i3; i11++) {
                    if (list.get(i11 - 1).getByte(i) != list.get(i11).getByte(i)) {
                        i10++;
                    }
                }
                long OooO00o2 = j + ((long) OooO00o(oooo000)) + 2 + ((long) (i10 * 2));
                oooo000.OooO0o(i10);
                oooo000.OooO0o(i9);
                for (int i12 = i7; i12 < i3; i12++) {
                    byte b = list.get(i12).getByte(i);
                    if (i12 == i7 || b != list.get(i12 - 1).getByte(i)) {
                        oooo000.OooO0o(b & 255);
                    }
                }
                OOOO000 oooo0003 = new OOOO000();
                int i13 = i7;
                while (i13 < i3) {
                    byte b2 = list.get(i13).getByte(i);
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (true) {
                        if (i15 >= i3) {
                            i5 = i3;
                            break;
                        } else if (b2 != list.get(i15).getByte(i)) {
                            i5 = i15;
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i14 == i5 && i + 1 == list.get(i13).size()) {
                        oooo000.OooO0o(list2.get(i13).intValue());
                        i6 = i5;
                        oooo0002 = oooo0003;
                    } else {
                        oooo000.OooO0o((int) ((((long) OooO00o(oooo0003)) + OooO00o2) * -1));
                        i6 = i5;
                        oooo0002 = oooo0003;
                        OooO00o(OooO00o2, oooo0003, i + 1, list, i13, i5, list2);
                    }
                    oooo0003 = oooo0002;
                    i13 = i6;
                }
                oooo000.write(oooo0003, oooo0003.OooO0o0());
                return;
            }
            int i16 = 0;
            int min = Math.min(byteString.size(), byteString2.size());
            int i17 = i;
            while (i17 < min && byteString.getByte(i17) == byteString2.getByte(i17)) {
                i16++;
                i17++;
            }
            long OooO00o3 = 1 + j + ((long) OooO00o(oooo000)) + 2 + ((long) i16);
            oooo000.OooO0o(-i16);
            oooo000.OooO0o(i9);
            int i18 = i;
            while (true) {
                i4 = i + i16;
                if (i18 >= i4) {
                    break;
                }
                oooo000.OooO0o(byteString.getByte(i18) & 255);
                i18++;
            }
            if (i7 + 1 != i3) {
                OOOO000 oooo0004 = new OOOO000();
                oooo000.OooO0o((int) ((((long) OooO00o(oooo0004)) + OooO00o3) * -1));
                OooO00o(OooO00o3, oooo0004, i4, list, i7, i3, list2);
                oooo000.write(oooo0004, oooo0004.OooO0o0());
            } else if (i4 == list.get(i7).size()) {
                oooo000.OooO0o(list2.get(i7).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: OooO00o */
    public ByteString get(int i) {
        return this.f17289OooO00o[i];
    }

    public static int OooO00o(OOOO000 oooo000) {
        return (int) (oooo000.OooO0o0() / 4);
    }
}
