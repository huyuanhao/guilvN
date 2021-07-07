package com.p118pd.sdk;

import com.github.mikephil.charting.data.Entry;
import java.text.DecimalFormat;

/* renamed from: com.pd.sdk.oOOoo0  reason: case insensitive filesystem */
public class C8236oOOoo0 implements AbstractC8239oOOoo00O, AbstractC8238oOOoo000 {
    public static final int OooO00o = 5;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static String[] f21349OooO00o = {"", "k", C7031o000oo0O.OooO0O0, "b", "t"};

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21350OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public DecimalFormat f21351OooO00o;

    public C8236oOOoo0() {
        this.f21350OooO00o = "";
        this.f21351OooO00o = new DecimalFormat("###E00");
    }

    public int OooO00o() {
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC8239oOOoo00O
    public String OooO00o(float f, Entry entry, int i, C8353oOoOOoOO oooooooo) {
        return OooO00o((double) f) + this.f21350OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8238oOOoo000
    public String OooO00o(float f, AbstractC8201oOOo0oO0 oooo0oo0) {
        return OooO00o((double) f) + this.f21350OooO00o;
    }

    public void OooO00o(String str) {
        this.f21350OooO00o = str;
    }

    public C8236oOOoo0(String str) {
        this();
        this.f21350OooO00o = str;
    }

    public void OooO00o(String[] strArr) {
        f21349OooO00o = strArr;
    }

    private String OooO00o(double d) {
        String format = this.f21351OooO00o.format(d);
        int numericValue = Character.getNumericValue(format.charAt(format.length() - 1));
        String replaceAll = format.replaceAll("E[0-9][0-9]", f21349OooO00o[Integer.valueOf(Character.getNumericValue(format.charAt(format.length() - 2)) + "" + numericValue).intValue() / 3]);
        while (true) {
            if (replaceAll.length() <= 5 && !replaceAll.matches("[0-9]+\\.[a-z]")) {
                return replaceAll;
            }
            replaceAll = replaceAll.substring(0, replaceAll.length() - 2) + replaceAll.substring(replaceAll.length() - 1);
        }
    }
}
