package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.Rational;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.umeng.message.proguard.C3848l;
import java.text.DecimalFormat;

/* renamed from: com.pd.sdk.oO0oO0oO  reason: case insensitive filesystem */
public class C7951oO0oO0oO extends C7929oO0o0OoO<C7952oO0oO0oo> {
    public C7951oO0oO0oO(@NotNull C7952oO0oO0oo oo0oo0oo) {
        super(oo0oo0oo);
    }

    @Nullable
    private String OooOO0o() {
        return OooO0O0(0, 1);
    }

    @Nullable
    public String OooO() {
        String OooO0O0 = ((C7952oO0oO0oo) this.f20998OooO00o).OooO0O0(12);
        if (OooO0O0 == null) {
            return null;
        }
        String trim = OooO0O0.trim();
        if ("K".equalsIgnoreCase(trim)) {
            return "kph";
        }
        if ("M".equalsIgnoreCase(trim)) {
            return "mph";
        }
        if ("N".equalsIgnoreCase(trim)) {
            return "knots";
        }
        return "Unknown (" + trim + C3848l.f10402t;
    }

    @Nullable
    public String OooO00o() {
        C7893oO0OoO OooO00o = ((C7952oO0oO0oo) this.f20998OooO00o).OooO00o();
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.m19574OooO00o();
    }

    @Nullable
    public String OooO0O0() {
        Rational OooO00o = ((C7952oO0oO0oo) this.f20998OooO00o).m19633OooO00o(6);
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.intValue() + " metres";
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0036  */
    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @com.drew.lang.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String OooO0OO(int r2) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7951oO0oO0oO.OooO0OO(int):java.lang.String");
    }

    @Nullable
    public String OooO0Oo() {
        String OooO0O0 = ((C7952oO0oO0oo) this.f20998OooO00o).OooO0O0(25);
        if (OooO0O0 == null) {
            return null;
        }
        String trim = OooO0O0.trim();
        if ("K".equalsIgnoreCase(trim)) {
            return "kilometers";
        }
        if ("M".equalsIgnoreCase(trim)) {
            return "miles";
        }
        if ("N".equalsIgnoreCase(trim)) {
            return "knots";
        }
        return "Unknown (" + trim + C3848l.f10402t;
    }

    @Nullable
    public String OooO0o() {
        C7893oO0OoO OooO00o = ((C7952oO0oO0oo) this.f20998OooO00o).OooO00o();
        if (OooO00o == null) {
            return null;
        }
        return C7893oO0OoO.OooO00o(OooO00o.OooO00o());
    }

    @Nullable
    public String OooO0o0() {
        return OooO00o(30, "No Correction", "Differential Corrected");
    }

    @Nullable
    public String OooO0oO() {
        C7893oO0OoO OooO00o = ((C7952oO0oO0oo) this.f20998OooO00o).OooO00o();
        if (OooO00o == null) {
            return null;
        }
        return C7893oO0OoO.OooO00o(OooO00o.OooO0O0());
    }

    @Nullable
    public String OooO0oo() {
        String OooO0O0 = ((C7952oO0oO0oo) this.f20998OooO00o).OooO0O0(10);
        if (OooO0O0 == null) {
            return null;
        }
        String trim = OooO0O0.trim();
        if ("2".equalsIgnoreCase(trim)) {
            return "2-dimensional measurement";
        }
        if ("3".equalsIgnoreCase(trim)) {
            return "3-dimensional measurement";
        }
        return "Unknown (" + trim + C3848l.f10402t;
    }

    @Nullable
    public String OooOO0(int i) {
        Rational OooO00o = ((C7952oO0oO0oo) this.f20998OooO00o).m19633OooO00o(i);
        String format = OooO00o != null ? new DecimalFormat("0.##").format(OooO00o.doubleValue()) : ((C7952oO0oO0oo) this.f20998OooO00o).OooO0O0(i);
        if (format == null || format.trim().length() == 0) {
            return null;
        }
        return format.trim() + " degrees";
    }

    @Nullable
    public String OooOO0O() {
        Rational[] OooO00o = ((C7952oO0oO0oo) this.f20998OooO00o).m19653OooO00o(7);
        DecimalFormat decimalFormat = new DecimalFormat("00.000");
        if (OooO00o == null) {
            return null;
        }
        return String.format("%02d:%02d:%s UTC", Integer.valueOf(OooO00o[0].intValue()), Integer.valueOf(OooO00o[1].intValue()), decimalFormat.format(OooO00o[2].doubleValue()));
    }

    @Nullable
    public String OooOO0() {
        String OooO0O0 = ((C7952oO0oO0oo) this.f20998OooO00o).OooO0O0(9);
        if (OooO0O0 == null) {
            return null;
        }
        String trim = OooO0O0.trim();
        if (ExifInterface.o000oo0O.equalsIgnoreCase(trim)) {
            return "Active (Measurement in progress)";
        }
        if (ExifInterface.o000oo0o.equalsIgnoreCase(trim)) {
            return "Void (Measurement Interoperability)";
        }
        return "Unknown (" + trim + C3848l.f10402t;
    }

    @Nullable
    public String OooOO0O(int i) {
        String OooO0O0 = ((C7952oO0oO0oo) this.f20998OooO00o).OooO0O0(i);
        if (OooO0O0 == null) {
            return null;
        }
        String trim = OooO0O0.trim();
        if ("T".equalsIgnoreCase(trim)) {
            return "True direction";
        }
        if ("M".equalsIgnoreCase(trim)) {
            return "Magnetic direction";
        }
        return "Unknown (" + trim + C3848l.f10402t;
    }

    @Nullable
    public String OooO0OO() {
        return OooO00o(5, "Sea level", "Below sea level");
    }
}
