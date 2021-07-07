package com.p118pd.sdk;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Pattern;

/* renamed from: com.pd.sdk.ooOOOO0O  reason: case insensitive filesystem */
public class C8939ooOOOO0O implements InputFilter {
    public Pattern OooO00o;

    public C8939ooOOOO0O(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("[0-9]{0,");
        sb.append(i - 1);
        sb.append("}+((\\.[0-9]{0,");
        sb.append(i2 - 1);
        sb.append("})?)||(\\.)?");
        this.OooO00o = Pattern.compile(sb.toString());
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (!this.OooO00o.matcher(spanned).matches()) {
            return "";
        }
        return null;
    }
}
