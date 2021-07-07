package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.p118pd.sdk.AbstractC8200oOOo0oO;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.p118pd.sdk.C8204oOOo0oo0;
import com.p118pd.sdk.C8342oOoOOOOO;
import com.p118pd.sdk.C8344oOoOOOo;
import java.util.ArrayList;
import java.util.List;

public class Legend extends AbstractC8200oOOo0oO {
    public float OooO;
    public DashPathEffect OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LegendDirection f14932OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LegendForm f14933OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LegendHorizontalAlignment f14934OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LegendOrientation f14935OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LegendVerticalAlignment f14936OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<C8344oOoOOOo> f14937OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8204oOOo0oo0[] f14938OooO00o;
    public List<Boolean> OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f14939OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C8204oOOo0oo0[] f14940OooO0O0;
    public List<C8344oOoOOOo> OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f14941OooO0OO;
    public float OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f14942OooO0Oo;
    public float OooO0o;
    public float OooO0o0;
    public float OooO0oO;
    public float OooO0oo;
    public float OooOO0;
    public float OooOO0O;
    public float OooOO0o;
    public float OooOOO;
    public float OooOOO0;

    public enum LegendDirection {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public enum LegendForm {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    public enum LegendHorizontalAlignment {
        LEFT,
        CENTER,
        RIGHT
    }

    public enum LegendOrientation {
        HORIZONTAL,
        VERTICAL
    }

    @Deprecated
    public enum LegendPosition {
        RIGHT_OF_CHART,
        RIGHT_OF_CHART_CENTER,
        RIGHT_OF_CHART_INSIDE,
        LEFT_OF_CHART,
        LEFT_OF_CHART_CENTER,
        LEFT_OF_CHART_INSIDE,
        BELOW_CHART_LEFT,
        BELOW_CHART_RIGHT,
        BELOW_CHART_CENTER,
        ABOVE_CHART_LEFT,
        ABOVE_CHART_RIGHT,
        ABOVE_CHART_CENTER,
        PIECHART_CENTER
    }

    public enum LegendVerticalAlignment {
        TOP,
        CENTER,
        BOTTOM
    }

    public static /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] OooO00o;
        public static final /* synthetic */ int[] OooO0O0;

        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00ab */
        static {
            /*
            // Method dump skipped, instructions count: 184
            */
            throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.components.Legend.OooO00o.<clinit>():void");
        }
    }

    public Legend() {
        this.f14938OooO00o = new C8204oOOo0oo0[0];
        this.f14939OooO0O0 = false;
        this.f14934OooO00o = LegendHorizontalAlignment.LEFT;
        this.f14936OooO00o = LegendVerticalAlignment.BOTTOM;
        this.f14935OooO00o = LegendOrientation.HORIZONTAL;
        this.f14941OooO0OO = false;
        this.f14932OooO00o = LegendDirection.LEFT_TO_RIGHT;
        this.f14933OooO00o = LegendForm.SQUARE;
        this.OooO0Oo = 8.0f;
        this.OooO0o0 = 3.0f;
        this.OooO00o = null;
        this.OooO0o = 6.0f;
        this.OooO0oO = 0.0f;
        this.OooO0oo = 5.0f;
        this.OooO = 3.0f;
        this.OooOO0 = 0.95f;
        this.OooOO0O = 0.0f;
        this.OooOO0o = 0.0f;
        this.OooOOO0 = 0.0f;
        this.OooOOO = 0.0f;
        this.f14942OooO0Oo = false;
        this.f14937OooO00o = new ArrayList(16);
        this.OooO0O0 = new ArrayList(16);
        this.OooO0OO = new ArrayList(16);
        ((AbstractC8200oOOo0oO) this).OooO0OO = AbstractC8352oOoOOoO0.OooO00o(10.0f);
        ((AbstractC8200oOOo0oO) this).OooO00o = AbstractC8352oOoOOoO0.OooO00o(5.0f);
        ((AbstractC8200oOOo0oO) this).OooO0O0 = AbstractC8352oOoOOoO0.OooO00o(3.0f);
    }

    public float OooO() {
        return this.OooO0o;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8204oOOo0oo0[] m15063OooO00o() {
        return this.f14938OooO00o;
    }

    public void OooO0O0(List<C8204oOOo0oo0> list) {
        this.f14938OooO00o = (C8204oOOo0oo0[]) list.toArray(new C8204oOOo0oo0[list.size()]);
    }

    public void OooO0OO(List<C8204oOOo0oo0> list) {
        this.f14940OooO0O0 = (C8204oOOo0oo0[]) list.toArray(new C8204oOOo0oo0[list.size()]);
    }

    public void OooO0Oo(float f) {
        this.OooO0o0 = f;
    }

    public float OooO0o() {
        return this.OooO0oo;
    }

    public void OooO0o0(float f) {
        this.OooO0Oo = f;
    }

    public float OooO0oO() {
        return this.OooOO0;
    }

    public float OooO0oo() {
        return this.OooO;
    }

    public float OooOO0() {
        return this.OooO0oO;
    }

    public void OooO(float f) {
        this.OooO0o = f;
    }

    public float OooO00o(Paint paint) {
        float f = 0.0f;
        for (C8204oOOo0oo0 oooo0oo0 : this.f14938OooO00o) {
            String str = oooo0oo0.f21318OooO00o;
            if (str != null) {
                float OooO00o2 = (float) AbstractC8352oOoOOoO0.OooO00o(paint, str);
                if (OooO00o2 > f) {
                    f = OooO00o2;
                }
            }
        }
        return f;
    }

    public float OooO0O0(Paint paint) {
        float OooO00o2 = AbstractC8352oOoOOoO0.OooO00o(this.OooO0oo);
        C8204oOOo0oo0[] oooo0oo0Arr = this.f14938OooO00o;
        float f = 0.0f;
        float f2 = 0.0f;
        for (C8204oOOo0oo0 oooo0oo0 : oooo0oo0Arr) {
            float OooO00o3 = AbstractC8352oOoOOoO0.OooO00o(Float.isNaN(oooo0oo0.OooO00o) ? this.OooO0Oo : oooo0oo0.OooO00o);
            if (OooO00o3 > f2) {
                f2 = OooO00o3;
            }
            String str = oooo0oo0.f21318OooO00o;
            if (str != null) {
                float OooO0O02 = (float) AbstractC8352oOoOOoO0.OooO0O0(paint, str);
                if (OooO0O02 > f) {
                    f = OooO0O02;
                }
            }
        }
        return f + f2 + OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m15069OooO0OO() {
        return this.f14939OooO0O0;
    }

    public float OooO0Oo() {
        return this.OooO0o0;
    }

    public void OooO0o(float f) {
        this.OooO0oo = f;
    }

    public float OooO0o0() {
        return this.OooO0Oo;
    }

    public void OooO0oO(float f) {
        this.OooOO0 = f;
    }

    public void OooO0oo(float f) {
        this.OooO = f;
    }

    public void OooOO0(float f) {
        this.OooO0oO = f;
    }

    public void OooO0OO(boolean z) {
        this.f14942OooO0Oo = z;
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m15070OooO0Oo() {
        return this.f14942OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO
    public List<C8344oOoOOOo> OooO0OO() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int[] m15062OooO00o() {
        int[] iArr = new int[this.f14938OooO00o.length];
        int i = 0;
        while (true) {
            C8204oOOo0oo0[] oooo0oo0Arr = this.f14938OooO00o;
            if (i >= oooo0oo0Arr.length) {
                return iArr;
            }
            iArr[i] = oooo0oo0Arr[i].f21317OooO00o == LegendForm.NONE ? C8342oOoOOOOO.OooO0O0 : oooo0oo0Arr[i].f21317OooO00o == LegendForm.EMPTY ? C8342oOoOOOOO.OooO00o : oooo0oo0Arr[i].f21315OooO00o;
            i++;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String[] m15064OooO00o() {
        String[] strArr = new String[this.f14940OooO0O0.length];
        int i = 0;
        while (true) {
            C8204oOOo0oo0[] oooo0oo0Arr = this.f14940OooO0O0;
            if (i >= oooo0oo0Arr.length) {
                return strArr;
            }
            strArr[i] = oooo0oo0Arr[i].f21318OooO00o;
            i++;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO
    @Deprecated
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String[] m15068OooO0O0() {
        String[] strArr = new String[this.f14938OooO00o.length];
        int i = 0;
        while (true) {
            C8204oOOo0oo0[] oooo0oo0Arr = this.f14938OooO00o;
            if (i >= oooo0oo0Arr.length) {
                return strArr;
            }
            strArr[i] = oooo0oo0Arr[i].f21318OooO00o;
            i++;
        }
    }

    @Deprecated
    public void OooO00o(List<Integer> list, List<String> list2) {
        OooO00o(AbstractC8352oOoOOoO0.OooO00o(list), AbstractC8352oOoOOoO0.m20023OooO00o(list2));
    }

    public void OooO00o(int[] iArr, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < Math.min(iArr.length, strArr.length); i++) {
            C8204oOOo0oo0 oooo0oo0 = new C8204oOOo0oo0();
            int i2 = iArr[i];
            oooo0oo0.f21315OooO00o = i2;
            oooo0oo0.f21318OooO00o = strArr[i];
            if (i2 == 1122868 || i2 == 0) {
                oooo0oo0.f21317OooO00o = LegendForm.NONE;
            } else if (i2 == 1122867) {
                oooo0oo0.f21317OooO00o = LegendForm.EMPTY;
            }
            arrayList.add(oooo0oo0);
        }
        this.f14940OooO0O0 = (C8204oOOo0oo0[]) arrayList.toArray(new C8204oOOo0oo0[arrayList.size()]);
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO
    @Deprecated
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int[] m15066OooO0O0() {
        int[] iArr = new int[this.f14940OooO0O0.length];
        int i = 0;
        while (true) {
            C8204oOOo0oo0[] oooo0oo0Arr = this.f14940OooO0O0;
            if (i >= oooo0oo0Arr.length) {
                return iArr;
            }
            iArr[i] = oooo0oo0Arr[i].f21317OooO00o == LegendForm.NONE ? C8342oOoOOOOO.OooO0O0 : oooo0oo0Arr[i].f21317OooO00o == LegendForm.EMPTY ? C8342oOoOOOOO.OooO00o : oooo0oo0Arr[i].f21315OooO00o;
            i++;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C8204oOOo0oo0[] m15067OooO0O0() {
        return this.f14940OooO0O0;
    }

    public void OooO0O0(C8204oOOo0oo0[] oooo0oo0Arr) {
        if (oooo0oo0Arr == null) {
            oooo0oo0Arr = new C8204oOOo0oo0[0];
        }
        this.f14940OooO0O0 = oooo0oo0Arr;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m15065OooO0O0() {
        return this.f14941OooO0OO;
    }

    public void OooO0O0(boolean z) {
        this.f14941OooO0OO = z;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO
    public List<C8344oOoOOOo> OooO0O0() {
        return this.f14937OooO00o;
    }

    public void OooO00o(C8204oOOo0oo0[] oooo0oo0Arr) {
        this.f14938OooO00o = oooo0oo0Arr;
        this.f14939OooO0O0 = true;
    }

    public void OooO00o(List<C8204oOOo0oo0> list) {
        this.f14938OooO00o = (C8204oOOo0oo0[]) list.toArray(new C8204oOOo0oo0[list.size()]);
        this.f14939OooO0O0 = true;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15061OooO00o() {
        this.f14939OooO0O0 = false;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    @Deprecated
    /* renamed from: OooO00o  reason: collision with other method in class */
    public LegendPosition m15058OooO00o() {
        if (this.f14935OooO00o == LegendOrientation.VERTICAL && this.f14934OooO00o == LegendHorizontalAlignment.CENTER && this.f14936OooO00o == LegendVerticalAlignment.CENTER) {
            return LegendPosition.PIECHART_CENTER;
        }
        if (this.f14935OooO00o == LegendOrientation.HORIZONTAL) {
            if (this.f14936OooO00o == LegendVerticalAlignment.TOP) {
                LegendHorizontalAlignment legendHorizontalAlignment = this.f14934OooO00o;
                if (legendHorizontalAlignment == LegendHorizontalAlignment.LEFT) {
                    return LegendPosition.ABOVE_CHART_LEFT;
                }
                return legendHorizontalAlignment == LegendHorizontalAlignment.RIGHT ? LegendPosition.ABOVE_CHART_RIGHT : LegendPosition.ABOVE_CHART_CENTER;
            }
            LegendHorizontalAlignment legendHorizontalAlignment2 = this.f14934OooO00o;
            if (legendHorizontalAlignment2 == LegendHorizontalAlignment.LEFT) {
                return LegendPosition.BELOW_CHART_LEFT;
            }
            return legendHorizontalAlignment2 == LegendHorizontalAlignment.RIGHT ? LegendPosition.BELOW_CHART_RIGHT : LegendPosition.BELOW_CHART_CENTER;
        } else if (this.f14934OooO00o == LegendHorizontalAlignment.LEFT) {
            if (this.f14936OooO00o != LegendVerticalAlignment.TOP || !this.f14941OooO0OO) {
                return this.f14936OooO00o == LegendVerticalAlignment.CENTER ? LegendPosition.LEFT_OF_CHART_CENTER : LegendPosition.LEFT_OF_CHART;
            }
            return LegendPosition.LEFT_OF_CHART_INSIDE;
        } else if (this.f14936OooO00o != LegendVerticalAlignment.TOP || !this.f14941OooO0OO) {
            return this.f14936OooO00o == LegendVerticalAlignment.CENTER ? LegendPosition.RIGHT_OF_CHART_CENTER : LegendPosition.RIGHT_OF_CHART;
        } else {
            return LegendPosition.RIGHT_OF_CHART_INSIDE;
        }
    }

    public Legend(C8204oOOo0oo0[] oooo0oo0Arr) {
        this();
        if (oooo0oo0Arr != null) {
            this.f14938OooO00o = oooo0oo0Arr;
            return;
        }
        throw new IllegalArgumentException("entries array is NULL");
    }

    @Deprecated
    public Legend(int[] iArr, String[] strArr) {
        this();
        if (iArr == null || strArr == null) {
            throw new IllegalArgumentException("colors array or labels array is NULL");
        } else if (iArr.length == strArr.length) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < Math.min(iArr.length, strArr.length); i++) {
                C8204oOOo0oo0 oooo0oo0 = new C8204oOOo0oo0();
                int i2 = iArr[i];
                oooo0oo0.f21315OooO00o = i2;
                oooo0oo0.f21318OooO00o = strArr[i];
                if (i2 == 1122868) {
                    oooo0oo0.f21317OooO00o = LegendForm.NONE;
                } else if (i2 == 1122867 || i2 == 0) {
                    oooo0oo0.f21317OooO00o = LegendForm.EMPTY;
                }
                arrayList.add(oooo0oo0);
            }
            this.f14938OooO00o = (C8204oOOo0oo0[]) arrayList.toArray(new C8204oOOo0oo0[arrayList.size()]);
        } else {
            throw new IllegalArgumentException("colors array and labels array need to be of same size");
        }
    }

    @Deprecated
    public void OooO00o(LegendPosition legendPosition) {
        switch (OooO00o.OooO00o[legendPosition.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f14934OooO00o = LegendHorizontalAlignment.LEFT;
                this.f14936OooO00o = legendPosition == LegendPosition.LEFT_OF_CHART_CENTER ? LegendVerticalAlignment.CENTER : LegendVerticalAlignment.TOP;
                this.f14935OooO00o = LegendOrientation.VERTICAL;
                break;
            case 4:
            case 5:
            case 6:
                this.f14934OooO00o = LegendHorizontalAlignment.RIGHT;
                this.f14936OooO00o = legendPosition == LegendPosition.RIGHT_OF_CHART_CENTER ? LegendVerticalAlignment.CENTER : LegendVerticalAlignment.TOP;
                this.f14935OooO00o = LegendOrientation.VERTICAL;
                break;
            case 7:
            case 8:
            case 9:
                this.f14934OooO00o = legendPosition == LegendPosition.ABOVE_CHART_LEFT ? LegendHorizontalAlignment.LEFT : legendPosition == LegendPosition.ABOVE_CHART_RIGHT ? LegendHorizontalAlignment.RIGHT : LegendHorizontalAlignment.CENTER;
                this.f14936OooO00o = LegendVerticalAlignment.TOP;
                this.f14935OooO00o = LegendOrientation.HORIZONTAL;
                break;
            case 10:
            case 11:
            case 12:
                this.f14934OooO00o = legendPosition == LegendPosition.BELOW_CHART_LEFT ? LegendHorizontalAlignment.LEFT : legendPosition == LegendPosition.BELOW_CHART_RIGHT ? LegendHorizontalAlignment.RIGHT : LegendHorizontalAlignment.CENTER;
                this.f14936OooO00o = LegendVerticalAlignment.BOTTOM;
                this.f14935OooO00o = LegendOrientation.HORIZONTAL;
                break;
            case 13:
                this.f14934OooO00o = LegendHorizontalAlignment.CENTER;
                this.f14936OooO00o = LegendVerticalAlignment.CENTER;
                this.f14935OooO00o = LegendOrientation.VERTICAL;
                break;
        }
        this.f14941OooO0OO = legendPosition == LegendPosition.LEFT_OF_CHART_INSIDE || legendPosition == LegendPosition.RIGHT_OF_CHART_INSIDE;
    }

    @Deprecated
    public Legend(List<Integer> list, List<String> list2) {
        this(AbstractC8352oOoOOoO0.OooO00o(list), AbstractC8352oOoOOoO0.m20023OooO00o(list2));
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public LegendHorizontalAlignment m15056OooO00o() {
        return this.f14934OooO00o;
    }

    public void OooO00o(LegendHorizontalAlignment legendHorizontalAlignment) {
        this.f14934OooO00o = legendHorizontalAlignment;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public LegendVerticalAlignment m15059OooO00o() {
        return this.f14936OooO00o;
    }

    public void OooO00o(LegendVerticalAlignment legendVerticalAlignment) {
        this.f14936OooO00o = legendVerticalAlignment;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public LegendOrientation m15057OooO00o() {
        return this.f14935OooO00o;
    }

    public void OooO00o(LegendOrientation legendOrientation) {
        this.f14935OooO00o = legendOrientation;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public LegendDirection m15054OooO00o() {
        return this.f14932OooO00o;
    }

    public void OooO00o(LegendDirection legendDirection) {
        this.f14932OooO00o = legendDirection;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public LegendForm m15055OooO00o() {
        return this.f14933OooO00o;
    }

    public void OooO00o(LegendForm legendForm) {
        this.f14933OooO00o = legendForm;
    }

    public void OooO00o(DashPathEffect dashPathEffect) {
        this.OooO00o = dashPathEffect;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    public DashPathEffect OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO, com.p118pd.sdk.AbstractC8200oOOo0oO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<Boolean> m15060OooO00o() {
        return this.OooO0O0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x01dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(android.graphics.Paint r28, com.p118pd.sdk.C8353oOoOOoOO r29) {
        /*
        // Method dump skipped, instructions count: 520
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.mikephil.charting.components.Legend.OooO00o(android.graphics.Paint, com.pd.sdk.oOoOOoOO):void");
    }
}
