package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.facebook.react.modules.timepicker.TimePickerDialogModule;
import com.google.gson.internal.bind.TypeAdapters;

/* renamed from: com.pd.sdk.oO0o0O0  reason: case insensitive filesystem */
public class C7920oO0o0O0 {
    public final int OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;

    public C7920oO0o0O0(int i, int i2, int i3, int i4, int i5, int i6) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = i3;
        this.OooO0Oo = i4;
        this.OooO0o0 = i5;
        this.OooO0o = i6;
    }

    @Nullable
    public static C7920oO0o0O0 OooO00o(@NotNull String str) {
        if (str.length() == 19 && !str.startsWith("9999:99:99")) {
            try {
                return new C7920oO0o0O0(Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(5, 7)), Integer.parseInt(str.substring(8, 10)), Integer.parseInt(str.substring(11, 13)), Integer.parseInt(str.substring(14, 16)), Integer.parseInt(str.substring(17, 19)));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int OooO0O0() {
        return this.OooO0Oo;
    }

    public int OooO0OO() {
        return this.OooO0o0;
    }

    public int OooO0Oo() {
        return this.OooO0O0;
    }

    public int OooO0o() {
        return this.OooO00o;
    }

    public int OooO0o0() {
        return this.OooO0o;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7920oO0o0O0.class != obj.getClass()) {
            return false;
        }
        C7920oO0o0O0 oo0o0o0 = (C7920oO0o0O0) obj;
        return this.OooO0OO == oo0o0o0.OooO0OO && this.OooO0Oo == oo0o0o0.OooO0Oo && this.OooO0o0 == oo0o0o0.OooO0o0 && this.OooO0O0 == oo0o0o0.OooO0O0 && this.OooO0o == oo0o0o0.OooO0o && this.OooO00o == oo0o0o0.OooO00o;
    }

    public int hashCode() {
        return (((((((((this.OooO00o * 31) + this.OooO0O0) * 31) + this.OooO0OO) * 31) + this.OooO0Oo) * 31) + this.OooO0o0) * 31) + this.OooO0o;
    }

    public String toString() {
        return String.format("%04d:%02d:%02d %02d:%02d:%02d", Integer.valueOf(this.OooO00o), Integer.valueOf(this.OooO0O0), Integer.valueOf(this.OooO0OO), Integer.valueOf(this.OooO0Oo), Integer.valueOf(this.OooO0o0), Integer.valueOf(this.OooO0o));
    }

    public int OooO00o() {
        return this.OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19629OooO00o() {
        StringBuilder sb = new StringBuilder();
        OooO00o(sb, this.OooO00o, TypeAdapters.C104427.YEAR);
        OooO00o(sb, this.OooO0O0, TypeAdapters.C104427.MONTH);
        OooO00o(sb, this.OooO0OO, "day");
        OooO00o(sb, this.OooO0Oo, TimePickerDialogModule.ARG_HOUR);
        OooO00o(sb, this.OooO0o0, "minute");
        OooO00o(sb, this.OooO0o, TypeAdapters.C104427.SECOND);
        return sb.toString();
    }

    public static void OooO00o(StringBuilder sb, int i, String str) {
        if (i != 0) {
            if (sb.length() != 0) {
                sb.append(' ');
            }
            sb.append(i);
            sb.append(' ');
            sb.append(str);
            if (i != 1) {
                sb.append('s');
            }
        }
    }
}
