package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.drew.metadata.bmp.BmpHeaderDirectory;
import java.text.DecimalFormat;

/* renamed from: com.pd.sdk.oO0o0oO  reason: case insensitive filesystem */
public class C7936oO0o0oO extends C7929oO0o0OoO<BmpHeaderDirectory> {
    public C7936oO0o0oO(@NotNull BmpHeaderDirectory bmpHeaderDirectory) {
        super(bmpHeaderDirectory);
    }

    @NotNull
    public static String OooOO0(int i) {
        return OooO00o(((long) i) & 4294967295L);
    }

    @Nullable
    public String OooO00o() {
        BmpHeaderDirectory.BitmapType OooO00o = ((BmpHeaderDirectory) this.f20998OooO00o).OooO00o();
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.toString();
    }

    @Nullable
    public String OooO0O0() {
        BmpHeaderDirectory.ColorEncoding OooO00o = ((BmpHeaderDirectory) this.f20998OooO00o).m15021OooO00o();
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.toString();
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    public String OooO0OO(int i) {
        if (i == -2) {
            return OooO00o();
        }
        if (i == 5) {
            return OooO0Oo();
        }
        switch (i) {
            case 10:
                return OooO0o0();
            case 11:
                return OooO0O0();
            case 12:
            case 13:
            case 14:
            case 15:
                return OooO00o(((BmpHeaderDirectory) this.f20998OooO00o).m19641OooO00o(i), 8);
            case 16:
                return OooO0OO();
            case 17:
            case 18:
            case 19:
                return OooO00o(((BmpHeaderDirectory) this.f20998OooO00o).m19641OooO00o(i));
            case 20:
                return OooO0o();
            default:
                return super.OooO0OO(i);
        }
    }

    @Nullable
    public String OooO0Oo() {
        BmpHeaderDirectory.Compression OooO00o = ((BmpHeaderDirectory) this.f20998OooO00o).m15023OooO00o();
        if (OooO00o != null) {
            return OooO00o.toString();
        }
        Integer OooO00o2 = ((BmpHeaderDirectory) this.f20998OooO00o).m19639OooO00o(5);
        if (OooO00o2 == null) {
            return null;
        }
        return "Illegal value 0x" + Integer.toHexString(OooO00o2.intValue());
    }

    @Nullable
    public String OooO0o() {
        BmpHeaderDirectory.RenderingIntent OooO00o = ((BmpHeaderDirectory) this.f20998OooO00o).m15025OooO00o();
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.toString();
    }

    @Nullable
    public String OooO0o0() {
        BmpHeaderDirectory.RenderingHalftoningAlgorithm OooO00o = ((BmpHeaderDirectory) this.f20998OooO00o).m15024OooO00o();
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.toString();
    }

    @Nullable
    public static String OooO00o(@Nullable Integer num, int i) {
        if (num == null) {
            return null;
        }
        return OooO00o(((long) num.intValue()) & 4294967295L, i);
    }

    @Nullable
    public static String OooO00o(@Nullable Long l, int i) {
        if (l == null) {
            return null;
        }
        return OooO00o(l.longValue(), i);
    }

    @NotNull
    public static String OooO00o(long j, int i) {
        return String.format("0x%0" + i + "X", Long.valueOf(j));
    }

    @Nullable
    public static String OooO00o(Integer num) {
        if (num == null) {
            return null;
        }
        return OooO00o(((long) num.intValue()) & 4294967295L);
    }

    @Nullable
    public static String OooO00o(Long l) {
        if (l == null) {
            return null;
        }
        return OooO00o(l.longValue());
    }

    @NotNull
    public static String OooO00o(long j) {
        double d = (double) j;
        Double.isNaN(d);
        return new DecimalFormat(AbstractC7922oO0o0O0O.OooO00o).format(Double.valueOf(d / 65536.0d));
    }

    @Nullable
    public String OooO0OO() {
        BmpHeaderDirectory.ColorSpaceType OooO00o = ((BmpHeaderDirectory) this.f20998OooO00o).m15022OooO00o();
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.toString();
    }

    @NotNull
    public static String OooO0OO(int i, int i2) {
        return OooO00o(((long) i) & 4294967295L, i2);
    }
}
