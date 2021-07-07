package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L丨l丨i11  reason: invalid class name */
public abstract class Lli11 {
    public static void OooO00o(int[] iArr, int[] iArr2) {
        C1LLlIL.m21851OooO0O0(iArr, iArr2);
        C1LLlIL.m21850OooO0O0(iArr, 8, iArr2, 16);
        int OooO00o = C1LLlIL.OooO00o(iArr2, 8, iArr2, 16);
        int OooO00o2 = OooO00o + C1LLlIL.OooO00o(iArr2, 24, iArr2, 16, C1LLlIL.OooO00o(iArr2, 0, iArr2, 8, 0) + OooO00o);
        int[] OooO00o3 = C1LLlIL.OooO00o();
        C1LLlIL.m21844OooO00o(iArr, 8, iArr, 0, OooO00o3, 0);
        int[] OooO0O0 = C1LLlIL.OooO0O0();
        C1LLlIL.m21851OooO0O0(OooO00o3, OooO0O0);
        C1iiIiI.OooO0OO(32, OooO00o2 + C1iiIiI.OooO0O0(16, OooO0O0, 0, iArr2, 8), iArr2, 24);
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        C1LLlIL.m21841OooO00o(iArr, iArr2, iArr3);
        C1LLlIL.m21839OooO00o(iArr, 8, iArr2, 8, iArr3, 16);
        int OooO00o = C1LLlIL.OooO00o(iArr3, 8, iArr3, 16);
        int OooO00o2 = OooO00o + C1LLlIL.OooO00o(iArr3, 24, iArr3, 16, C1LLlIL.OooO00o(iArr3, 0, iArr3, 8, 0) + OooO00o);
        int[] OooO00o3 = C1LLlIL.OooO00o();
        int[] OooO00o4 = C1LLlIL.OooO00o();
        boolean z = C1LLlIL.m21844OooO00o(iArr, 8, iArr, 0, OooO00o3, 0) != C1LLlIL.m21844OooO00o(iArr2, 8, iArr2, 0, OooO00o4, 0);
        int[] OooO0O0 = C1LLlIL.OooO0O0();
        C1LLlIL.m21841OooO00o(OooO00o3, OooO00o4, OooO0O0);
        C1iiIiI.OooO0OO(32, OooO00o2 + (z ? C1iiIiI.OooO00o(16, OooO0O0, 0, iArr3, 8) : C1iiIiI.OooO0O0(16, OooO0O0, 0, iArr3, 8)), iArr3, 24);
    }
}
