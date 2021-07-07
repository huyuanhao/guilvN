package com.p118pd.sdk;

import android.content.res.Resources;
import android.graphics.Color;
import com.tencent.bugly.beta.tinker.TinkerReport;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oOoOOOOO  reason: case insensitive filesystem */
public class C8342oOoOOOOO {
    public static final int OooO00o = 1122867;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f21448OooO00o = {Color.rgb((int) TinkerReport.KEY_APPLIED_FAIL_COST_30S_LESS, 248, 246), Color.rgb(148, 212, 212), Color.rgb(136, 180, 187), Color.rgb(118, 174, 175), Color.rgb(42, 109, 130)};
    public static final int OooO0O0 = 1122868;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f21449OooO0O0 = {Color.rgb(217, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, 247, 120), Color.rgb(106, 167, 134), Color.rgb(53, (int) Lillilli.OoooooO, (int) TinkerReport.KEY_APPLIED_FAIL_COST_OTHER)};
    public static final int[] OooO0OO = {Color.rgb(64, 89, 128), Color.rgb(149, 165, 124), Color.rgb(217, 184, 162), Color.rgb((int) Lillilli.OooooOo, 134, 134), Color.rgb(179, 48, 80)};
    public static final int[] OooO0Oo = {Color.rgb((int) Lillilli.Oooooo, 37, 82), Color.rgb(255, 102, 0), Color.rgb(245, 199, 0), Color.rgb(106, 150, 31), Color.rgb(179, 100, 53)};
    public static final int[] OooO0o = {OooO00o("#2ecc71"), OooO00o("#f1c40f"), OooO00o("#e74c3c"), OooO00o("#3498db")};
    public static final int[] OooO0o0 = {Color.rgb(192, 255, 140), Color.rgb(255, 247, 140), Color.rgb(255, 208, 140), Color.rgb(140, 234, 255), Color.rgb(255, 140, 157)};

    public static int OooO00o(int i, int i2) {
        return (i & 16777215) | ((i2 & 255) << 24);
    }

    public static int OooO00o(String str) {
        int parseLong = (int) Long.parseLong(str.replace("#", ""), 16);
        return Color.rgb((parseLong >> 16) & 255, (parseLong >> 8) & 255, (parseLong >> 0) & 255);
    }

    public static int OooO00o() {
        return Color.rgb(51, 181, 229);
    }

    public static List<Integer> OooO00o(Resources resources, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(resources.getColor(i)));
        }
        return arrayList;
    }

    public static List<Integer> OooO00o(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }
}
